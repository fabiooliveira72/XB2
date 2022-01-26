/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CultivarDialog.java
 *
 * Created on Mar 19, 2010, 9:25:54 AM
 */

package FileXDialog;

import FileXModel.Organic;
import FileXModel.FileX;
import DSSATModel.CropList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jazzy
 */
public class OrganicDialog extends javax.swing.JDialog {

    /** Creates new form CultivarDialog */
    private Integer level;

    public OrganicDialog()
    {
        super();

        setSize(285, 350);
        setUndecorated(true);

        initComponents();
        setVisible(true);
        LoadDataTable();
    }


    public OrganicDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        //setUndecorated(true);
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
                "Level", "Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class
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
        jXTable1.getColumnModel().getColumn(0).setPreferredWidth(40);
        jXTable1.getColumnModel().getColumn(1).setPreferredWidth(200);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jXTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXTable1MouseClicked
        level = jXTable1.getSelectedRow();
        dispose();
    }//GEN-LAST:event_jXTable1MouseClicked


    public Integer GetLevel()
    {
        return level;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXTable jXTable1;
    // End of variables declaration//GEN-END:variables

    private void LoadDataTable() {
        DefaultTableModel tbModel = (DefaultTableModel) jXTable1.getModel();
        tbModel.addRow(new Object[] {0, "NONE"});
        for(int i = 0;i < FileX.organicList.GetSize();i++)
        {
            Organic organic = (Organic) FileX.organicList.GetAt(i);
            Object object[] = new Object[2];
            object[0] = i + 1;
            try {
                object[1] = organic.RENAME;
            } catch (Exception e) {
                object[1] = "";
            }
            tbModel.addRow(object);
        }
    }

}
