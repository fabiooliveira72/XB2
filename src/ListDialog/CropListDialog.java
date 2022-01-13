/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CropListDialog.java
 *
 * Created on 28 ก.พ. 2553, 9:39:38
 */

package ListDialog;

import DSSATModel.Crop;
import DSSATModel.CropList;
import java.awt.*;
import javax.swing.DefaultListSelectionModel;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Jazzy
 */
public class CropListDialog extends javax.swing.JDialog {

    /** Creates new form CropListDialog */

    Crop crop = null;
    public CropListDialog(java.awt.Frame parent, boolean modal, Crop selCrop) {
        super(parent, modal);
        initComponents();

        //jXTable1.packColumn(0, 20);
        //jXTable1.packColumn(1, 63);

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        Dimension winSize = getSize();
        setLocation((screenWidth - winSize.width) / 2 , (screenHeight - winSize.height) / 2);

        AddCropToTable(selCrop);
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
        setTitle("Crop");

        jXTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Crop Code", "Crop Name"
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
        jXTable1.setGridColor(new java.awt.Color(0, 102, 204));
        jXTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jXTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jXTable1);
        jXTable1.getColumnModel().getColumn(0).setPreferredWidth(80);
        jXTable1.getColumnModel().getColumn(1).setPreferredWidth(200);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jXTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXTable1MouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount() == 2) {
            crop = new Crop();

            TableModel tbModel = jXTable1.getModel();
            int viewRow = jXTable1.getSelectedRow();
            int row = -1;
            if (viewRow < 0) {
                row = viewRow;
            } else {
                row = jXTable1.convertRowIndexToModel(viewRow);
            }

            crop.CropCode = (String) tbModel.getValueAt(row, 0);
            crop.CropName = (String) tbModel.getValueAt(row, 1);

            dispose();
        }
}//GEN-LAST:event_jXTable1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXTable jXTable1;
    // End of variables declaration//GEN-END:variables

    public void SetNull() {
        crop = null;
    }

    public Crop GetSelected() {
        return crop;
    }

    private void AddCropToTable(Crop selCrop) {
        DefaultTableModel tbModel = (DefaultTableModel) jXTable1.getModel();
        ListSelectionModel selModel = null;
        int i = 0;
        for(Crop c : CropList.GetAll())
        {
            tbModel.addRow(new Object[]{c.CropCode, c.CropName});
            if(selCrop != null){
                if(selCrop.CropCode.equals(c.CropCode))
                {
                    selModel = new DefaultListSelectionModel();
                    selModel.setSelectionInterval(i, i);
                }
            }
            i++;
        }

        if(selModel != null) {
            int nRow = (jXTable1.getHeight() / 18) - 1;
            //int n = ((selModel.getMinSelectionIndex()  + 21) > (jXTable1.getRowCount() - 1)) ? (jXTable1.getRowCount() - 1) : selModel.getMinSelectionIndex()  + 21;
            int n = ((selModel.getMinSelectionIndex()  + nRow) > (jXTable1.getRowCount() - 1)) ? (jXTable1.getRowCount() - 1) : selModel.getMinSelectionIndex()  + nRow;
            jXTable1.setSelectionModel(selModel);
            jXTable1.scrollRowToVisible(n);
        }
    }

}
