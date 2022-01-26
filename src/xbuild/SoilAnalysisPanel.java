/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SoilAnalysisPanel.java
 *
 * Created on Mar 15, 2010, 2:46:51 PM
 */

package xbuild;

import FileXModel.SoilAnalysis;
import FileXModel.SoilAnalysisLayer;
import DSSATModel.SoilAnalysisMethodPh;
import DSSATModel.SoilAnalysisMethodPhList;
import DSSATModel.SoilAnalysisMethodPhosphorus;
import DSSATModel.SoilAnalysisMethodPhosphorusList;
import DSSATModel.SoilAnalysisMethodPotassium;
import DSSATModel.SoilAnalysisMethodPotassiumList;
import FileXModel.FileX;
import FileXModel.IModelXBase;
import ListDialog.PHListDialog;
import ListDialog.PhosphorusListDialog;
import ListDialog.PotassiumListDialog;
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
public class SoilAnalysisPanel extends javax.swing.JInternalFrame implements KeyListener {

    /** Creates new form SoilAnalysisPanel */
    private SoilAnalysis soilAnalysis;
    private String SMHB;
    private String SMPX;
    private String SMKE;
    
    private int selectedRowIndex = -1;

    public SoilAnalysisPanel(String nodeName) {
        initComponents();
        
        for(IModelXBase s: FileX.soilAnalysis.GetAll()){
            if(((SoilAnalysis)s).SANAME.equals(nodeName)){
                this.soilAnalysis = (SoilAnalysis) s;
                break;
            }
        }

        //this.soilAnalysis = soilAnalysis;

        LoadSoilAnalysis();
        
        txtSMHB.addKeyListener(this);
        txtSMPX.addKeyListener(this);
        txtSMKE.addKeyListener(this);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXLabel1 = new org.jdesktop.swingx.JXLabel();
        dpAnalysisDate = new org.jdesktop.swingx.JXDatePicker();
        jXPanel1 = new org.jdesktop.swingx.JXPanel();
        txtSMHB = new javax.swing.JTextField();
        txtSMPX = new javax.swing.JTextField();
        txtSMKE = new javax.swing.JTextField();
        jXLabel2 = new org.jdesktop.swingx.JXLabel();
        jXLabel3 = new org.jdesktop.swingx.JXLabel();
        jXLabel4 = new org.jdesktop.swingx.JXLabel();
        bnSelectpH = new javax.swing.JButton();
        bnSelectPhosphorus = new javax.swing.JButton();
        bnSelectPotassium = new javax.swing.JButton();
        jXPanel2 = new org.jdesktop.swingx.JXPanel();
        bnAddLayer = new javax.swing.JButton();
        bnDeleteLayer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jXTable2 = new org.jdesktop.swingx.JXTable();

        setPreferredSize(new java.awt.Dimension(742, 613));

        jXLabel1.setText("Analysis Date");

        dpAnalysisDate.setFormats(new SimpleDateFormat("dd/MM/yyyy", new Locale("en","US")));
        dpAnalysisDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dpAnalysisDateFocusLost(evt);
            }
        });
        dpAnalysisDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpAnalysisDateActionPerformed(evt);
            }
        });
        dpAnalysisDate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dpAnalysisDatePropertyChange(evt);
            }
        });

        jXPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Determination Method", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jXLabel2.setText("pH");

        jXLabel3.setText("Phosphorus");

        jXLabel4.setText("Potassium");

        bnSelectpH.setText("...");
        bnSelectpH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnSelectpHActionPerformed(evt);
            }
        });

        bnSelectPhosphorus.setText("...");
        bnSelectPhosphorus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnSelectPhosphorusActionPerformed(evt);
            }
        });

        bnSelectPotassium.setText("...");
        bnSelectPotassium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnSelectPotassiumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jXPanel1Layout = new javax.swing.GroupLayout(jXPanel1);
        jXPanel1.setLayout(jXPanel1Layout);
        jXPanel1Layout.setHorizontalGroup(
            jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jXPanel1Layout.createSequentialGroup()
                        .addComponent(jXLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSMKE, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jXPanel1Layout.createSequentialGroup()
                        .addComponent(jXLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSMPX, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jXPanel1Layout.createSequentialGroup()
                        .addComponent(jXLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSMHB, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bnSelectpH, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnSelectPhosphorus, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnSelectPotassium, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jXPanel1Layout.setVerticalGroup(
            jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSMHB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnSelectpH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSMPX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnSelectPhosphorus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSMKE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnSelectPotassium))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jXPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Soil Analysis Layers", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jXPanel2.setPreferredSize(new java.awt.Dimension(460, 446));

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

        jXTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "<html><p align='center'>Depth<br> base of layer<br> cm</p></html>", "<html><p align='center'>Bulk density<br>moist<br>g cm<sup>3</sup></p></html>", "<html><p align='center'>Organic carbon<br>%</p></html>", "<html><p align='center'>Total nitrogen<br>%</p></html>", "<html><p align='center'>pH<br>in<br>Water</p></html>", "<html><p align='center'>pH<br>in<br>Buffer</p></html>", "<html><p align='center'>Phosphorus<br>extractable<br>mg kg-1 </p></html>", "<html><p align='center'>Potassium<br>exchangeable<br>cmol</p></html>", "<html><p align='center'>Stable<br>Organic<br>Carbon %</p></html>"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jXTable2.setPreferredSize(new java.awt.Dimension(400, 0));
        jXTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jXTable2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jXTable2);

        javax.swing.GroupLayout jXPanel2Layout = new javax.swing.GroupLayout(jXPanel2);
        jXPanel2.setLayout(jXPanel2Layout);
        jXPanel2Layout.setHorizontalGroup(
            jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jXPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bnAddLayer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bnDeleteLayer))
        );
        jXPanel2Layout.setVerticalGroup(
            jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel2Layout.createSequentialGroup()
                .addGroup(jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnDeleteLayer)
                    .addComponent(bnAddLayer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jXLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dpAnalysisDate, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jXPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
                    .addComponent(jXPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(dpAnalysisDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jXPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dpAnalysisDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpAnalysisDateActionPerformed
        Update();
}//GEN-LAST:event_dpAnalysisDateActionPerformed

    private void bnSelectpHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnSelectpHActionPerformed
        final PHListDialog dialog = new PHListDialog(null, true);
        dialog.show();
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                SoilAnalysisMethodPh ph = dialog.GetSelected();
                SMHB = ph.Code;
                txtSMHB.setText(ph.Description);
                Update();
            }
        });
}//GEN-LAST:event_bnSelectpHActionPerformed

    private void bnSelectPhosphorusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnSelectPhosphorusActionPerformed
        final PhosphorusListDialog dialog = new PhosphorusListDialog(null, true);
        dialog.show();
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                SoilAnalysisMethodPhosphorus phosphorus = dialog.GetSelected();
                SMPX = phosphorus.Code;
                txtSMPX.setText(phosphorus.Description);
                Update();
            }
        });
}//GEN-LAST:event_bnSelectPhosphorusActionPerformed

    private void bnSelectPotassiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnSelectPotassiumActionPerformed
        final PotassiumListDialog dialog = new PotassiumListDialog(null, true);
        dialog.show();
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {

            @Override
            public void windowClosed(WindowEvent e) {
                SoilAnalysisMethodPotassium potassium = dialog.GetSelected();
                SMKE = potassium.Code;
                txtSMKE.setText(potassium.Description);
                Update();
            }
        });
}//GEN-LAST:event_bnSelectPotassiumActionPerformed

    private void bnAddLayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnAddLayerActionPerformed
        SoilAnalysisLayer soil = null;
        if (selectedRowIndex > 0 && selectedRowIndex < soilAnalysis.GetSize()) {
            SoilAnalysisLayer tmp = soilAnalysis.GetLayer(selectedRowIndex);
            soil = tmp.Clone();
        } else {
            soil = new SoilAnalysisLayer();
        }
        
        final SoilAnalysisDialog dialog = new SoilAnalysisDialog(null, true, soil);
        dialog.show();

        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                SoilAnalysisLayer soilLayer = dialog.GetData();
                if(soilLayer != null){
                    DefaultTableModel model = (DefaultTableModel) jXTable2.getModel();

                    model.addRow(SetRow(soilLayer));

                    soilAnalysis.AddLayer(soilLayer);
                }
                dialog.SetNull();
            }
        });
}//GEN-LAST:event_bnAddLayerActionPerformed

    private void bnDeleteLayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnDeleteLayerActionPerformed
        int nRow = jXTable2.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jXTable2.getModel();
        model.removeRow(nRow);

        soilAnalysis.RemoveLayer(nRow);
}//GEN-LAST:event_bnDeleteLayerActionPerformed

    private void jXTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXTable2MouseClicked
        if(evt.getClickCount() == 2)
        {
            final SoilAnalysisDialog dialog = new SoilAnalysisDialog(null, true, soilAnalysis.GetLayer(jXTable2.getSelectedRow()));
            dialog.show();

            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    SoilAnalysisLayer soilLayer = dialog.GetData();
                    if(soilLayer != null){
                        DefaultTableModel model = (DefaultTableModel) jXTable2.getModel();
                        Vector vector = SetRow(soilLayer);
                        for(int n = 0;n < vector.size();n++)
                            model.setValueAt(vector.get(n), jXTable2.getSelectedRow(), n);
                    }
                    dialog.SetNull();
                }
            });
        }
        else{
            int nRow = jXTable2.getSelectedRow();
            
            if(nRow != selectedRowIndex){
                selectedRowIndex = nRow;
            }
            else{
                selectedRowIndex = -1;
                jXTable2.clearSelection();
            }
        }
    }//GEN-LAST:event_jXTable2MouseClicked

    private void dpAnalysisDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dpAnalysisDateFocusLost
        Update();
    }//GEN-LAST:event_dpAnalysisDateFocusLost

    private void dpAnalysisDatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dpAnalysisDatePropertyChange
        try {
            soilAnalysis.SADAT = dpAnalysisDate.getDate();
        } catch (Exception e) {
            soilAnalysis.SADAT = null;
        }
    }//GEN-LAST:event_dpAnalysisDatePropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnAddLayer;
    private javax.swing.JButton bnDeleteLayer;
    private javax.swing.JButton bnSelectPhosphorus;
    private javax.swing.JButton bnSelectPotassium;
    private javax.swing.JButton bnSelectpH;
    private org.jdesktop.swingx.JXDatePicker dpAnalysisDate;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private org.jdesktop.swingx.JXLabel jXLabel2;
    private org.jdesktop.swingx.JXLabel jXLabel3;
    private org.jdesktop.swingx.JXLabel jXLabel4;
    private org.jdesktop.swingx.JXPanel jXPanel1;
    private org.jdesktop.swingx.JXPanel jXPanel2;
    private org.jdesktop.swingx.JXTable jXTable2;
    private javax.swing.JTextField txtSMHB;
    private javax.swing.JTextField txtSMKE;
    private javax.swing.JTextField txtSMPX;
    // End of variables declaration//GEN-END:variables

    private void Update() {
        try {
            soilAnalysis.SADAT = dpAnalysisDate.getDate();
        } catch (Exception e) {
            soilAnalysis.SADAT = null;
        }
        if (!txtSMHB.getText().equals("")) {
            soilAnalysis.SMHB = SMHB;
        } else {
            soilAnalysis.SMHB = null;
        }
        if (!txtSMPX.getText().equals("")) {
            soilAnalysis.SMPX = SMPX;
        } else {
            soilAnalysis.SMPX = null;
        }
        if (!txtSMKE.getText().equals("")) {
            soilAnalysis.SMKE = SMKE;
        } else {
            soilAnalysis.SMKE = null;
        }
    }

    private void LoadSoilAnalysis() {
        try {
            dpAnalysisDate.setDate(soilAnalysis.SADAT);
        } catch (Exception e) {
        }
        try {
            SoilAnalysisMethodPh pH = SoilAnalysisMethodPhList.GetAt(soilAnalysis.SMHB);
            txtSMHB.setText(pH.Description);
            SMHB = pH.Code;
        } catch (Exception e) {
        }
        try {
            SoilAnalysisMethodPotassium potass = SoilAnalysisMethodPotassiumList.GetAt(soilAnalysis.SMKE);
            txtSMKE.setText(potass.Description);
            SMKE = potass.Code;
        } catch (Exception e) {
        }
        try {
            SoilAnalysisMethodPhosphorus phos = SoilAnalysisMethodPhosphorusList.GetAt(soilAnalysis.SMPX);
            txtSMPX.setText(phos.Description);
            SMPX = phos.Code;
        } catch (Exception e) {
        }

        for(int i = 0;i < soilAnalysis.GetSize();i++)
        {
            DefaultTableModel model = (DefaultTableModel) jXTable2.getModel();
            model.addRow(SetRow(soilAnalysis.GetLayer(i)));
        }
    }

    public void keyTyped(KeyEvent e) {
        Update();
    }

    public void keyPressed(KeyEvent e) {
        Update();
    }

    public void keyReleased(KeyEvent e) {
        Update();
    }

    private Vector SetRow(SoilAnalysisLayer soilLayer) {

        Vector vector = new Vector();

        vector.add(soilLayer.SABL);
        vector.add(soilLayer.SADM);
        vector.add(soilLayer.SAOC);
        vector.add(soilLayer.SANI);
        vector.add(soilLayer.SAPHW);
        vector.add(soilLayer.SAPHB);
        vector.add(soilLayer.SAPX);
        vector.add(soilLayer.SAKE);
        vector.add(soilLayer.SASC);

        return vector;
    }
}
