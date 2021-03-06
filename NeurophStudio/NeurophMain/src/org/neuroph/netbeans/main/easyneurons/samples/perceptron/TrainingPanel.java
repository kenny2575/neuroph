package org.neuroph.netbeans.main.easyneurons.samples.perceptron;

import java.awt.Dimension;
import org.jdesktop.application.Action;

/**
 *
 * @author Marko
 */
public class TrainingPanel extends javax.swing.JPanel {

    private PerceptronSampleFrameTopComponent perceptronSampleView;

    public TrainingPanel(PerceptronSampleFrameTopComponent pa) {
        perceptronSampleView = pa;
        initComponents();
        initComp();
        enableComponents();
    }

    public void disableComponents() {
        jtfLearningRate.setEnabled(false);
        jtfNimberOfIterations.setEnabled(false);
        jtfMaxError.setEnabled(false);
        jbTrain.setEnabled(false);
        jbStep.setEnabled(false);
        jbStop.setEnabled(true);
        jbRandomize.setEnabled(false);
        jDefinite.setVisible(false);
    }

    public void enableComponents() {
        jtfLearningRate.setEnabled(true);
        jtfNimberOfIterations.setEnabled(false);
        jtfMaxError.setEnabled(true);
        jbTrain.setEnabled(true);
        jbStep.setEnabled(true);
        jbStop.setEnabled(false);
        jbRandomize.setEnabled(true);
        jDefinite.setVisible(true);
    }

    public void initComp() {
        jDefinite.setText("Max Iterations:");
        jDefinite.setPreferredSize(new Dimension(120, 40));
        jbTrain.setText("Train");
        jbStop.setText("Stop");
        jbStep.setText("Step");
        jbTest.setText("Test");
        jbRandomize.setText("Randomize");

        jbTrain.setSize(33, 20);
        jbStop.setSize(33, 20);
        jbStep.setSize(33, 20);
        jbTest.setSize(33, 20);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLearningRate = new javax.swing.JLabel();
        jMaxError = new javax.swing.JLabel();
        jProgressBar = new javax.swing.JProgressBar();
        jtfLearningRate = new javax.swing.JTextField();
        jtfNimberOfIterations = new javax.swing.JTextField();
        jtfMaxError = new javax.swing.JTextField();
        jbTrain = new javax.swing.JButton();
        jbStop = new javax.swing.JButton();
        jbStep = new javax.swing.JButton();
        jbTest = new javax.swing.JButton();
        jbRandomize = new javax.swing.JButton();
        jDefinite = new javax.swing.JCheckBox();

        jButton3.setText("jButton3");

        jLabel4.setText("jLabel4");

        setMinimumSize(new java.awt.Dimension(350, 240));
        setPreferredSize(new java.awt.Dimension(350, 240));

        jLearningRate.setText("Learning rate:");

        jMaxError.setText("Max error:");

        jtfLearningRate.setText("0.5");

        jtfMaxError.setText("0.01");

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(org.neuroph.netbeans.main.easyneurons.EasyNeuronsApplication.class).getContext().getActionMap(TrainingPanel.class, this);
        jbTrain.setAction(actionMap.get("train")); // NOI18N
        jbTrain.setBackground(new java.awt.Color(0, 255, 0));
        jbTrain.setPreferredSize(new java.awt.Dimension(33, 20));

        jbStop.setAction(actionMap.get("clickedStopButton")); // NOI18N
        jbStop.setBackground(new java.awt.Color(255, 0, 0));
        jbStop.setPreferredSize(new java.awt.Dimension(33, 20));

        jbStep.setAction(actionMap.get("clickedStepButton")); // NOI18N
        jbStep.setBackground(new java.awt.Color(255, 240, 0));
        jbStep.setMinimumSize(new java.awt.Dimension(33, 20));
        jbStep.setPreferredSize(new java.awt.Dimension(33, 20));

        jbTest.setAction(actionMap.get("test")); // NOI18N
        jbTest.setBackground(new java.awt.Color(255, 0, 255));
        jbTest.setMaximumSize(new java.awt.Dimension(33, 20));
        jbTest.setPreferredSize(new java.awt.Dimension(33, 20));

        jbRandomize.setAction(actionMap.get("clickedRandomizeButton")); // NOI18N
        jbRandomize.setBackground(new java.awt.Color(0, 0, 255));
        jbRandomize.setPreferredSize(new java.awt.Dimension(33, 20));

        jDefinite.setAction(actionMap.get("clickCheckButton")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLearningRate, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                .addGap(35, 35, 35))
                            .addComponent(jDefinite, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMaxError, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfMaxError, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(jtfLearningRate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(jtfNimberOfIterations, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbStop, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(jbTrain, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbTest, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                            .addComponent(jbStep, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addComponent(jbRandomize, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLearningRate)
                    .addComponent(jtfLearningRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNimberOfIterations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDefinite))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfMaxError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jMaxError))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbRandomize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbStep, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbTrain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbTest, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbStop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jDefinite;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLearningRate;
    private javax.swing.JLabel jMaxError;
    private javax.swing.JProgressBar jProgressBar;
    private javax.swing.JButton jbRandomize;
    private javax.swing.JButton jbStep;
    private javax.swing.JButton jbStop;
    private javax.swing.JButton jbTest;
    private javax.swing.JButton jbTrain;
    private javax.swing.JTextField jtfLearningRate;
    private javax.swing.JTextField jtfMaxError;
    private javax.swing.JTextField jtfNimberOfIterations;
    // End of variables declaration//GEN-END:variables

    @Action
    public void train() {
        jbStop.setEnabled(true);
        perceptronSampleView.train(getLearningRate(), getErrorThreshold(), getIterations());
    }

    @Action
    public void clickedStepButton() {
        perceptronSampleView.step();
    }

    @Action
    public void clickedStopButton() {
        perceptronSampleView.stopTraining();
        jbStop.setEnabled(false);
    }

    @Action
    public void clickedRandomizeButton() {
        perceptronSampleView.randomize();
    }

    @Action
    public void test() {
        perceptronSampleView.test();
    }

    @Action
    public void clickCheckButton() {
        jtfNimberOfIterations.setEnabled(!jtfNimberOfIterations.isEnabled());
    }

    public int setJProgresBar() {

        jProgressBar.setMaximum(0);
        jProgressBar.setMaximum(getIterations());
        jProgressBar.setValue(0);
        return 0;
    }

    public void updateJProgresBar(int i) {

        jProgressBar.setValue(i);
    }

    public int getIterations() {
        try {
            if (jtfNimberOfIterations.isEnabled()) {
                return (Integer.valueOf(jtfNimberOfIterations.getText())).intValue();
            } else {
                return 0;
            }
        } catch (NumberFormatException e) {
            setIterations(0);
            return 0;
        }
    }

    public void setIterations(int i) {
        String s;

        try {
            s = String.valueOf((int) i);
        } catch (NumberFormatException e) {
            s = "0";
        }
        if (s != jtfNimberOfIterations.getText()) {
            jtfNimberOfIterations.setText(s);
        }
        jtfNimberOfIterations.select(0, 0);

    }

    public double getErrorThreshold() {
        try {
            return (Double.valueOf(jtfMaxError.getText())).doubleValue();
        } catch (NumberFormatException e) {
            setErrorThreshold(0);
            return 0;
        }
    }

    public void setErrorThreshold(double et) {
        String s;

        try {
            s = String.valueOf((double) et);
        } catch (NumberFormatException e) {
            s = "0";
        }
        if (s != jtfMaxError.getText()) {
            jtfMaxError.setText(s);
        }
        jtfMaxError.select(0, 0);
    }

    public double getLearningRate() {
        try {
            return (Double.valueOf(jtfLearningRate.getText())).doubleValue();
        } catch (NumberFormatException e) {
            setLearningRate(0);
            return 0;
        }
    }

    public void setLearningRate(double lr) {                           //nemam pojma sta ce mi
        String s;

        try {
            s = String.valueOf((double) lr);
        } catch (NumberFormatException e) {
            s = "0";
        }
        if (s != jtfLearningRate.getText()) {
            jtfLearningRate.setText(s);
        }
        jtfLearningRate.select(0, 0);
    }
}
