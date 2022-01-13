/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * IrrigationPanel.java
 *
 * Created on Mar 12, 2010, 2:14:24 PM
 */

package xbuild;

import FileXModel.Irrigation;
import FileXModel.IrrigationApplication;
import DSSATModel.IrrigationMethodList;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Jazzy
 */
public class IrrigationPanel extends javax.swing.JPanel implements KeyListener {

    /** Creates new form IrrigationPanel */
    protected Irrigation irrig;
    private int selectedRowIndex = -1;

    public IrrigationPanel(Irrigation irrig) {
        initComponents();

        this.irrig = irrig;
        
        txtEFIR.addKeyListener(this);

        LoadIrrigationApp();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jXLabel1 = new org.jdesktop.swingx.JXLabel();
        jXLabel2 = new org.jdesktop.swingx.JXLabel();
        rdDaysAfterPlanting = new javax.swing.JRadioButton();
        rdReportedDates = new javax.swing.JRadioButton();
        jXLabel3 = new org.jdesktop.swingx.JXLabel();
        bnAddLayer = new javax.swing.JButton();
        bnDeleteLayer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jXTable1 = new org.jdesktop.swingx.JXTable();
        txtEFIR = new javax.swing.JFormattedTextField();

        setPreferredSize(new java.awt.Dimension(742, 613));

        jXLabel1.setText("Year");

        jXLabel2.setText("Management");

        buttonGroup1.add(rdDaysAfterPlanting);
        rdDaysAfterPlanting.setSelected(true);
        rdDaysAfterPlanting.setText("Days After Planting");

        buttonGroup1.add(rdReportedDates);
        rdReportedDates.setText("On Reported Dates");

        jXLabel3.setText("Efficiency Fraction");

        bnAddLayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Plus.png"))); // NOI18N
        bnAddLayer.setText("Add Layer");
        bnAddLayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnAddLayerActionPerformed(evt);
            }
        });

        bnDeleteLayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Minus.png"))); // NOI18N
        bnDeleteLayer.setText("Delete Layer");
        bnDeleteLayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnDeleteLayerActionPerformed(evt);
            }
        });

        jXTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Day", "<html><p align='center'>Amount of Water<br>mm</p></html>", "Operation"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Double.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jXTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jXTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jXTable1);
        jXTable1.getColumnModel().getColumn(0).setPreferredWidth(80);
        jXTable1.getColumnModel().getColumn(1).setPreferredWidth(300);
        jXTable1.getColumnModel().getColumn(2).setPreferredWidth(300);

        txtEFIR.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 742, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jXLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jXLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jXLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdDaysAfterPlanting)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rdReportedDates))
                                    .addComponent(txtEFIR, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(bnAddLayer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(bnDeleteLayer)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 613, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jXLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdDaysAfterPlanting)
                    .addComponent(rdReportedDates)
                    .addComponent(jXLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bnDeleteLayer)
                            .addComponent(bnAddLayer)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEFIR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jXLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bnAddLayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnAddLayerActionPerformed
        IrrigationApplication ir = selectedRowIndex < 0 ? new IrrigationApplication() : irrig.GetApp(selectedRowIndex);
        final IrrigationDialog appDialog = new IrrigationDialog(null, true, rdDaysAfterPlanting.isSelected(), ir);
        appDialog.show();

        appDialog.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                IrrigationApplication irrigApp = appDialog.GetData();
                if(irrigApp != null){
                    DefaultTableModel model = (DefaultTableModel) jXTable1.getModel();

                    model.addRow(SetRow(irrigApp));

                    irrig.AddApp(irrigApp);
                }
                appDialog.SetNull();
            }
        });
    }//GEN-LAST:event_bnAddLayerActionPerformed

    private void jXTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXTable1MouseClicked
        if(evt.getClickCount() == 2)
        {
            final IrrigationDialog appDialog = new IrrigationDialog(null, true, rdDaysAfterPlanting.isSelected(), irrig.GetApp(jXTable1.getSelectedRow()));
            appDialog.show();

            appDialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    IrrigationApplication irrigApp = appDialog.GetData();
                    if(irrigApp != null){
                        DefaultTableModel model = (DefaultTableModel) jXTable1.getModel();
                        Vector vector = SetRow(irrigApp);
                        for(int n = 0;n < vector.size();n++)
                            model.setValueAt(vector.get(n), jXTable1.getSelectedRow(), n);
                    }
                    appDialog.SetNull();
                }
            });
        }
        else{
            int nRow = jXTable1.getSelectedRow();
            
            if(nRow != selectedRowIndex){
                selectedRowIndex = nRow;
            }
            else{
                selectedRowIndex = -1;
                jXTable1.clearSelection();
            }
        }
    }//GEN-LAST:event_jXTable1MouseClicked

    private void bnDeleteLayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnDeleteLayerActionPerformed
        int nRow = jXTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jXTable1.getModel();
        model.removeRow(nRow);

        irrig.RemoveAt(nRow);
    }//GEN-LAST:event_bnDeleteLayerActionPerformed

    private Vector SetRow(IrrigationApplication irrigApp) {

        Vector vector = new Vector();
        if(rdDaysAfterPlanting.isSelected())
            vector.add(irrigApp.IDAY);
        else
        {
            Locale l = new Locale("en", "US");
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy", l);
            vector.addElement(df.format(irrigApp.IDATE));
        }
        
        vector.add(irrigApp.IRVAL);
        vector.add(IrrigationMethodList.GetAt(irrigApp.IROP).Description);
        return vector;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnAddLayer;
    private javax.swing.JButton bnDeleteLayer;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private org.jdesktop.swingx.JXLabel jXLabel2;
    private org.jdesktop.swingx.JXLabel jXLabel3;
    private org.jdesktop.swingx.JXTable jXTable1;
    private javax.swing.JRadioButton rdDaysAfterPlanting;
    private javax.swing.JRadioButton rdReportedDates;
    private javax.swing.JFormattedTextField txtEFIR;
    // End of variables declaration//GEN-END:variables

    public void keyTyped(KeyEvent e) {
        Update();
    }

    public void keyPressed(KeyEvent e) {
        Update();
    }

    public void keyReleased(KeyEvent e) {
        Update();
    }

    protected void Update() {
        try
        {
            irrig.EFIR = Float.parseFloat(txtEFIR.getText());
        }
        catch(Exception ex)
        {
            irrig.EFIR = null;
        }
    }

    private void LoadIrrigationApp() {
        try
        {
            txtEFIR.setText(irrig.EFIR.toString());
        }
        catch(Exception ex)
        {
            txtEFIR.setText("");
        }
        
        DefaultTableModel model = (DefaultTableModel) jXTable1.getModel();
        for(int i = 0;i < irrig.GetSize();i++)
        {
            model.addRow(SetRow(irrig.GetApp(i)));
        }
    }

}
