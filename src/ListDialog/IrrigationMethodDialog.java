/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * IrrigationMethodDialog.java
 *
 * Created on 1 มี.ค. 2553, 12:18:01
 */

package ListDialog;

import DSSATModel.IrrigationMethodList;
import DSSATModel.IrrigationMethod;
import java.awt.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jazzy
 */
public class IrrigationMethodDialog extends javax.swing.JDialog {

    /** Creates new form IrrigationMethodDialog */

    private IrrigationMethod irrig = new IrrigationMethod();

    public IrrigationMethodDialog(java.awt.Frame parent, boolean modal) {
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
        jXTable1.getColumnModel().getColumn(1).setPreferredWidth(200);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 256, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jXTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXTable1MouseClicked
        if(evt.getClickCount() == 2) {
            irrig = new IrrigationMethod();
            DefaultTableModel tbModel = (DefaultTableModel) jXTable1.getModel();
            irrig.Code = (String) tbModel.getValueAt(jXTable1.getSelectedRow(), 0);
            irrig.Description = (String) tbModel.getValueAt(jXTable1.getSelectedRow(), 1);
            dispose();
        }
}//GEN-LAST:event_jXTable1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXTable jXTable1;
    // End of variables declaration//GEN-END:variables

    public IrrigationMethod GetSelected()
    {
        return irrig;
    }

    private void AddDataToTable() {
        DefaultTableModel tbModel = (DefaultTableModel) jXTable1.getModel();
        IrrigationMethodList.GetAll().forEach(i -> 
        {
            tbModel.addRow(new Object[]{i.Code, i.Description});
        });
    }

}
