package org.neuroph.netbeans.charts.graphs3d;

import org.jzy3d.chart.Chart;
import org.jzy3d.colors.colormaps.ColorMapHotCold;
import org.jzy3d.colors.colormaps.IColorMap;
import org.jzy3d.plot3d.builder.Mapper;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.neuroph.core.NeuralNetwork;
import org.neuroph.core.data.DataSet;
import org.nugs.graph3d.api.Point3D;
import org.nugs.graph3d.JzySurface3DFactory;
import org.nugs.graph3d.api.Surface3DFactory;
import org.nugs.graph3d.api.Surface3DProperties;
import org.neuroph.netbeans.charts.providers3d.DatasetOutputDataProvider3D;
import org.nugs.graph3d.api.Range;

/**
 * Surface chart of the network output for chosen attributes of dataset
 *
 * @author Vedrana Gajic
 */
public class OutputForAttributeSurface3D extends Graph3DBuilder {

    private Point3D[] points3d;
    int pointIdx = 1;
    NeuralNetwork nnet;

    public OutputForAttributeSurface3D(NeuralNetwork nnet, DataSet dataset) {
        dataProvider3D = new DatasetOutputDataProvider3D(dataset, nnet);
        this.nnet = nnet;
    }

    @Override
    public Chart createGraph() {
        points3d = (Point3D[]) dataProvider3D.getData(attribute1, attribute2);
        Surface3DProperties prop = new Surface3DProperties();
        IColorMap map = new ColorMapHotCold();
        map.setDirection(true);
        prop.setChartColor(map);
        prop.setChartQuality(Quality.Nicest);
        prop.setChartWireframed(true);
        prop.setXRange(new Range(0, 1));

        int outNeuronCount = nnet.getLayerAt(attribute1.getIndex()).getNeuronsCount();
        prop.setYRange(new Range(1, outNeuronCount));
        prop.setYAxeInteger(true);

        prop.setXAxeLabel("Chosen input"); //Dataset row/chosen attr
        prop.setYAxeLabel("Output neuron"); //output neuron
        prop.setZAxeLabel("Error"); //err/out

        pointIdx = 1;
        
        Surface3DFactory<Chart> surfaceFactory = new JzySurface3DFactory();
        Chart chart = surfaceFactory.createSurface(new Mapper() {
            @Override
            public double f(double x, double y) {
                //  funkcija krive - koja vraca vrednost weights 
                for (int i = pointIdx; i < points3d.length; i++) {
                    Point3D point = points3d[i];
                    if ((point.getX() <= x) && (point.getY() == (int) y)) {
                        pointIdx++;
                        return point.getZ();
                    }
                }
                return 0;
            }
        }, prop);

        return chart;
    }

    @Override
    public String toString() {
        return "Network output for chosen attributes of dataset";
    }
}
