/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TillageDialog.java
 *
 * Created on Mar 13, 2010, 11:00:44 AM
 */

package xbuild;

import FileX.TillageApplication;
import Library.TillageImplement;
import Library.TillageImplementList;
import ListDialog.TillageImplementDialog;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 *
 * @author Jazzy
 */
public class TillageDialog extends javax.swing.JDialog {

    /** Creates new form TillageDialog */

    protected TillageApplication tilApp;
    protected String TIMPL;

    public TillageDialog(java.awt.Frame parent, boolean modal, TillageApplication tilApp) {
        super(parent, modal);
        initComponents();

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        Dimension winSize = getSize();
        setLocation((screenWidth - winSize.width) / 2 , (screenHeight - winSize.height) / 2);

        this.tilApp = tilApp;
        this.TIMPL = tilApp.TIMPL;

        LoadApp();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpTDATE = new org.jdesktop.swingx.JXDatePicker();
        txtTIMPL = new javax.swing.JTextField();
        txtTDEP = new javax.swing.JFormattedTextField();
        bnSelectTIMPL = new javax.swing.JButton();
        bnOK = new javax.swing.JButton();
        bnCancel = new javax.swing.JButton();
        jXLabel1 = new org.jdesktop.swingx.JXLabel();
        jXLabel2 = new org.jdesktop.swingx.JXLabel();
        jXLabel3 = new org.jdesktop.swingx.JXLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        dpTDATE.setFormats(new SimpleDateFormat("dd/MM/yyyy", new Locale("en","US")));

        txtTDEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        bnSelectTIMPL.setText("...");
        bnSelectTIMPL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnSelectTIMPLActionPerformed(evt);
            }
        });

        bnOK.setText("OK");
        bnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnOKActionPerformed(evt);
            }
        });

        bnCancel.setText("Cancel");
        bnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnCancelActionPerformed(evt);
            }
        });

        jXLabel1.setText("Date");

        jXLabel2.setText("Tillage Implement");

        jXLabel3.setText("Tillage Depth");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jXLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bnOK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bnCancel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTIMPL, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bnSelectTIMPL, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dpTDATE, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTDEP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dpTDATE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTIMPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnSelectTIMPL)
                    .addComponent(jXLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTDEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnOK)
                    .addComponent(bnCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bnSelectTIMPLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnSelectTIMPLActionPerformed
        final TillageImplementDialog dialog = new TillageImplementDialog(null, true);
        dialog.show();
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                TillageImplement tillage = dialog.GetSelected();
                txtTIMPL.setText(tillage.Description);
                TIMPL = tillage.Code;
            }
        });
    }//GEN-LAST:event_bnSelectTIMPLActionPerformed

    private void bnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnOKActionPerformed
        Update();
        dispose();
    }//GEN-LAST:event_bnOKActionPerformed

    private void bnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnCancelActionPerformed
        tilApp = null;
        dispose();
    }//GEN-LAST:event_bnCancelActionPerformed

    private void Update() {
        try
        {
        tilApp.TDATE = dpTDATE.getDate();
        }
        catch(Exception ex)
        {
            tilApp.TDATE = null;
        }
        if(txtTIMPL.getText().equals("")) tilApp.TIMPL = "";
        else tilApp.TIMPL = TIMPL;
        try
        {
            tilApp.TDEP =Integer.parseInt(txtTDEP.getText());
        }
        catch(Exception ex)
        {
            tilApp.TDEP = null;
        }

    }

    private void LoadApp() {
        try
        {
            dpTDATE.setDate(tilApp.TDATE);
        }
        catch(Exception ex)
        {
            dpTDATE.setDate(null);
        }

        try
        {
            txtTIMPL.setText(TillageImplementList.GetAt(tilApp.TIMPL).Description);
            TIMPL = tilApp.TIMPL;
        }
        catch(Exception ex)
        {
            txtTIMPL.setText("");
        }

        try
        {
            txtTDEP.setText(tilApp.TDEP.toString());
        }
        catch(Exception ex)
        {
            txtTDEP.setText("");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnCancel;
    private javax.swing.JButton bnOK;
    private javax.swing.JButton bnSelectTIMPL;
    private org.jdesktop.swingx.JXDatePicker dpTDATE;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private org.jdesktop.swingx.JXLabel jXLabel2;
    private org.jdesktop.swingx.JXLabel jXLabel3;
    private javax.swing.JFormattedTextField txtTDEP;
    private javax.swing.JTextField txtTIMPL;
    // End of variables declaration//GEN-END:variables

    TillageApplication GetData() {
        return tilApp;
    }

    void SetNull() {
        tilApp = null;
    }
}