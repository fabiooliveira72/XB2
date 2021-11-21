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

import FileX.*;
import Library.CropList;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jazzy
 */
public class SoilAnalysisDialog extends javax.swing.JDialog {

    /** Creates new form CultivarDialog */
    private Integer level;

    public SoilAnalysisDialog()
    {
        super();

        setSize(353, 246);
        setUndecorated(true);

        initComponents();
        setVisible(true);
        LoadDataTable();
    }


    public SoilAnalysisDialog(java.awt.Frame parent, boolean modal) {
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

        jXTable1.setAutoCreateRowSorter(true);
        jXTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Level", "Description", "Analysis Date"
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
        jXTable1.getColumnModel().getColumn(0).setPreferredWidth(40);
        jXTable1.getColumnModel().getColumn(1).setPreferredWidth(200);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jXTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXTable1MouseClicked
        level = jXTable1.getSelectedRow() + 1;
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
        for(int i = 0;i < FileX.soilAnalysis.GetSize();i++)
        {
            SoilAnalysis soil = FileX.soilAnalysis.GetAnalysis(i);
            Object object[] = new Object[3];
            object[0] = i + 1;
            try{
            object[1] = soil.SANAME;
            }
            catch(Exception ex) {
                object[1] = "";
            }

            try {
                DateFormat df = new SimpleDateFormat("dd/MM/yyyy", Locale.US);
                object[2] = df.format(soil.SADAT);
            } catch (Exception e) {
                object[2] = "";
            }
            tbModel.addRow(object);
        }
    }

}