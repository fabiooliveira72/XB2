/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
 * CultivarsFrame.java
 *
 * Created on Mar 12, 2010, 9:30:23 AM
 */
package xbuild;

import xbuild.Events.AddLevelEvent;
import FileXModel.Cultivar;
import FileXModel.FileX;
import DSSATModel.CropList;
import ListDialog.CultivarListDialog;
import java.awt.EventQueue;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import xbuild.Components.IXInternalFrame;
import xbuild.Events.MenuDirection;
import xbuild.Events.NewFrameEvent;
import xbuild.Events.UpdateLevelEvent;

/**
 *
 * @author Jazzy
 */
public class CultivarsFrame extends IXInternalFrame {

    /**
     * Creates new form CultivarsFrame
     */
    public CultivarsFrame() {
        initComponents();

        LoadCultivar();

        setImage(imagePanel, FileX.general.crop.CropCode + "2.jpg");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jXTable1 = new org.jdesktop.swingx.JXTable();
        imagePanel = new javax.swing.JLabel();
        lblLevel1 = new org.jdesktop.swingx.JXLabel();
        bnPrevious = new javax.swing.JButton();
        bnNext = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setPreferredSize(new java.awt.Dimension(767, 677));

        jXTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Level", "Crop", "Cultivar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
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
        if (jXTable1.getColumnModel().getColumnCount() > 0) {
            jXTable1.getColumnModel().getColumn(0).setMinWidth(50);
            jXTable1.getColumnModel().getColumn(0).setPreferredWidth(50);
            jXTable1.getColumnModel().getColumn(1).setPreferredWidth(350);
            jXTable1.getColumnModel().getColumn(2).setPreferredWidth(350);
        }

        imagePanel.setBackground(new java.awt.Color(153, 153, 153));

        lblLevel1.setText("Cultivars");
        lblLevel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        bnPrevious.setText("PREVIOUS");
        bnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnPreviousActionPerformed(evt);
            }
        });

        bnNext.setText("NEXT");
        bnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblLevel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bnPrevious)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bnNext)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnPrevious)
                    .addComponent(bnNext))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLevel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jXTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXTable1MouseClicked
        if (evt.getClickCount() == 2) {
            int nRow = jXTable1.getSelectedRow();
            Cultivar culEdit = (Cultivar) FileX.cultivars.GetAt(nRow);

            final CultivarListDialog dialog = new CultivarListDialog(null, culEdit, true);
            dialog.show();

            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    ArrayList<DSSATModel.Cultivar> culs = dialog.GetData();
                    if (culs != null) {
                        DefaultTableModel model = (DefaultTableModel) jXTable1.getModel();

                        DSSATModel.Cultivar cul = culs.get(0);

                        model.setValueAt(cul.CropName, nRow, 1);
                        model.setValueAt(cul.CulName, nRow, 2);

                        culEdit.CR = cul.CropCode;
                        culEdit.INGENO = cul.CulCode;
                        culEdit.CNAME = cul.CulName;

                        l.myAction(new UpdateLevelEvent(this, "Cultivars", "Level " + (nRow + 1) + ": " + culEdit.GetName(), nRow));
                    }
                    dialog.SetNull();
                }
            });
        }
    }//GEN-LAST:event_jXTable1MouseClicked

    private void bnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnPreviousActionPerformed
        EventQueue.invokeLater(() -> {
            l.myAction(new NewFrameEvent(this, "Cultivars", MenuDirection.PREVIOUS));
        });
    }//GEN-LAST:event_bnPreviousActionPerformed

    private void bnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnNextActionPerformed
        EventQueue.invokeLater(() -> {
            l.myAction(new NewFrameEvent(this, "Cultivars", MenuDirection.NEXT));
        });
    }//GEN-LAST:event_bnNextActionPerformed

    public void AddNewCultivar() {
        final CultivarListDialog dialog = new CultivarListDialog(null, null, true);
        dialog.show();

        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                ArrayList<DSSATModel.Cultivar> culs = dialog.GetData();
                if (culs != null) {
                    DefaultTableModel model = (DefaultTableModel) jXTable1.getModel();

                    culs.forEach(cul -> {
                        Cultivar c = new Cultivar();
                        c.CR = cul.CropCode;
                        c.INGENO = cul.CulCode;
                        c.CNAME = cul.CulName;
                        c.SetLevel(jXTable1.getRowCount() + 1);

                        model.addRow(SetRow(c));

                        FileX.cultivars.AddNew(c);

                        l.myAction(new AddLevelEvent(this, "Cultivars", "Level " + FileX.cultivars.GetSize() + ": " + c.GetName()));
                    });
                }
                dialog.SetNull();
            }
        });
    }

    private Object[] SetRow(Cultivar cul) {
        return new Object[]{
            jXTable1.getRowCount() + 1,
            CropList.GetAt(cul.CR).CropName,
            cul.CNAME};
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnNext;
    private javax.swing.JButton bnPrevious;
    private javax.swing.JLabel imagePanel;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXTable jXTable1;
    private org.jdesktop.swingx.JXLabel lblLevel1;
    // End of variables declaration//GEN-END:variables

    private void LoadCultivar() {
        for (int i = 0; i < FileX.cultivars.GetSize(); i++) {
            DefaultTableModel model = (DefaultTableModel) jXTable1.getModel();
            model.addRow(SetRow((Cultivar) FileX.cultivars.GetAtIndex(i)));
        }
    }
}
