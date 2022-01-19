/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PHListDialog.java
 *
 * Created on 28 ก.พ. 2553, 12:00:06
 */

package ListDialog;

import DSSATModel.SoilAnalysisMethodPh;
import DSSATModel.SoilAnalysisMethodPhList;
import java.awt.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jazzy
 */
public class PHListDialog extends javax.swing.JDialog {

    /** Creates new form PHListDialog */

    SoilAnalysisMethodPh ph = new SoilAnalysisMethodPh();

    public PHListDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        AddDataToTable();

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        Dimension winSize = getSize();
        setLocation((screenWidth - winSize.width) / 2 , (screenHeight - winSize.height) / 2);
    }

    public SoilAnalysisMethodPh GetSelected()
    {
        return ph;
    }

    private void AddDataToTable() {
        DefaultTableModel tbModel = (DefaultTableModel) jXTable1.getModel();
        SoilAnalysisMethodPhList.GetAll().forEach(s ->
        {
            tbModel.addRow(new Object[]{s.Code, s.Description});
        });
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jXTable1 = new org.jdesktop.swingx.JXTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jXTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
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
        jXTable1.getColumnModel().getColumn(0).setPreferredWidth(50);
        jXTable1.getColumnModel().getColumn(1).setPreferredWidth(220);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jXTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXTable1MouseClicked
        if(evt.getClickCount() == 2) {
            ph = new SoilAnalysisMethodPh();
            DefaultTableModel tbModel = (DefaultTableModel) jXTable1.getModel();
            int viewRow = jXTable1.getSelectedRow();
            int row = -1;
            if (viewRow < 0) {
                row = viewRow;
            } else {
                row = jXTable1.convertRowIndexToModel(viewRow);
            }
            ph.Code = (String) tbModel.getValueAt(row, 0);
            ph.Description = (String) tbModel.getValueAt(row, 1);
            dispose();
        }
    }//GEN-LAST:event_jXTable1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXTable jXTable1;
    // End of variables declaration//GEN-END:variables
}
