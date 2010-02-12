/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MonitorFrame.java
 *
 * Created on 31-Dec-2009, 17:31:23
 */

package jmonitor;

/**
 *
 * @author john
 */
public class MonitorFrame extends javax.swing.JFrame implements MonitorUpdateListener {

    /** Creates new form MonitorFrame */
    public MonitorFrame(Client client) {
        this.client=client;
        initComponents();

        monitorPanel.setClient(client);
        //waterfallPanel.setClient(client);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        monitorPanel = new jmonitor.MonitorPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JMonitor");
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));
        getContentPane().add(monitorPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void updateSamples(float[] samples,int filterLow,int filterHigh,int sampleRate) {
        monitorPanel.updateSamples(samples,filterLow,filterHigh,sampleRate);
        //waterfallPanel.updateWaterfall(samples,filterLow,filterHigh,sampleRate);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private jmonitor.MonitorPanel monitorPanel;
    // End of variables declaration//GEN-END:variables

    private Client client;
}