/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * EnvironmentalAppDialog.java
 *
 * Created on 9 มี.ค. 2553, 15:21:17
 */

package xbuild;

import FileXModel.EnvironmentApplication;
import DSSATModel.EnvironmentFactorList;
import Extensions.Utils;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.*;

/**
 *
 * @author Jazzy
 */
public class EnvironmentalAppDialog extends javax.swing.JDialog {

    /** Creates new form EnvironmentalAppDialog */

    protected EnvironmentApplication envApp;

    public EnvironmentalAppDialog(java.awt.Frame parent, boolean modal, EnvironmentApplication envApp) {
        super(parent, modal);
        initComponents();

        this.envApp = envApp;

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        Dimension winSize = getSize();
        setLocation((screenWidth - winSize.width) / 2 , (screenHeight - winSize.height) / 2);

        spDaylength.setEditor(new JSpinner.NumberEditor(spDaylength, "##"));
        //txtRadiation.setEditor(new JTextField(null, null, WIDTH).NumberEditor(txtYear,"####"));

        DefaultComboBoxModel dm1 = (DefaultComboBoxModel) cbDaylengthFactor.getModel();
        DefaultComboBoxModel dm2 = (DefaultComboBoxModel) cbRadiationFactor.getModel();
        DefaultComboBoxModel dm3 = (DefaultComboBoxModel) cbMaxTempFactor.getModel();
        DefaultComboBoxModel dm4 = (DefaultComboBoxModel) cbMinTempFactor.getModel();
        DefaultComboBoxModel dm5 = (DefaultComboBoxModel) cbPrecipitationFactor.getModel();
        DefaultComboBoxModel dm6 = (DefaultComboBoxModel) cbCo2Factor.getModel();
        DefaultComboBoxModel dm7 = (DefaultComboBoxModel) cbHumidityFactor.getModel();
        DefaultComboBoxModel dm8 = (DefaultComboBoxModel) cbWindFactor.getModel();
        for(int i = 0;i < EnvironmentFactorList.size();i++)
        {
            dm1.addElement(EnvironmentFactorList.GetAt(i).Description);
            dm2.addElement(EnvironmentFactorList.GetAt(i).Description);
            dm3.addElement(EnvironmentFactorList.GetAt(i).Description);
            dm4.addElement(EnvironmentFactorList.GetAt(i).Description);
            dm5.addElement(EnvironmentFactorList.GetAt(i).Description);
            dm6.addElement(EnvironmentFactorList.GetAt(i).Description);
            dm7.addElement(EnvironmentFactorList.GetAt(i).Description);
            dm8.addElement(EnvironmentFactorList.GetAt(i).Description);
        }

        SetEnvApp();
    }

    public void SetEnvApp(){
        try {
            dpDate.setDate(envApp.ODATE);
        } catch (Exception e) {
        }
        try {
            spDaylength.setValue(envApp.EDAY);
        } catch (Exception e) {
        }
        try {
            cbDaylengthFactor.setSelectedItem(envApp.EDAY_Fact.Description);
        } catch (Exception e) {
        }
        try {
            txtRadiation.setText(Utils.FloatToString(envApp.ERAD));
        } catch (Exception e) {
        }
        try {
            cbRadiationFactor.setSelectedItem(envApp.ERAD_Fact.Description);
        } catch (Exception e) {
        }
        try {
            txtMaxTemp.setText(Utils.FloatToString(envApp.EMAX));
        } catch (Exception e) {
        }
        try {
            cbMaxTempFactor.setSelectedItem(envApp.EMAX_Fact.Description);
        } catch (Exception e) {
        }
        try {
            txtMinTemp.setText(Utils.FloatToString(envApp.EMIN));
        } catch (Exception e) {
        }
        try {
            cbMinTempFactor.setSelectedItem(envApp.EMIN_Fact.Description);
        } catch (Exception e) {
        }
        try {
            txtPrecipitation.setText(Utils.FloatToString(envApp.ERAIN));
        } catch (Exception e) {
        }
        try {
            cbPrecipitationFactor.setSelectedItem(envApp.ERAIN_Fact.Description);
        } catch (Exception e) {
        }
        try {
            txtCo2.setText(Utils.FloatToString(envApp.ECO2));
        } catch (Exception e) {
        }
        try {
            cbCo2Factor.setSelectedItem(envApp.ECO2_Fact.Description);
        } catch (Exception e) {
        }
        try {
            txtHumidity.setText(Utils.FloatToString(envApp.EDEW));
        } catch (Exception e) {
        }
        try {
            cbHumidityFactor.setSelectedItem(envApp.EDEW_Fact.Description);
        } catch (Exception e) {
        }
        try {
            txtWind.setText(Utils.FloatToString(envApp.EWIND));
        } catch (Exception e) {
        }
        try {
            cbWindFactor.setSelectedItem(envApp.EWIND_Fact.Description);
        } catch (Exception e) {
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpDate = new org.jdesktop.swingx.JXDatePicker();
        cbDaylengthFactor = new javax.swing.JComboBox();
        cbRadiationFactor = new javax.swing.JComboBox();
        txtMaxTemp = new javax.swing.JFormattedTextField();
        cbMaxTempFactor = new javax.swing.JComboBox();
        txtMinTemp = new javax.swing.JFormattedTextField();
        cbMinTempFactor = new javax.swing.JComboBox();
        txtPrecipitation = new javax.swing.JFormattedTextField();
        cbPrecipitationFactor = new javax.swing.JComboBox();
        txtCo2 = new javax.swing.JFormattedTextField();
        cbCo2Factor = new javax.swing.JComboBox();
        txtHumidity = new javax.swing.JFormattedTextField();
        cbHumidityFactor = new javax.swing.JComboBox();
        txtWind = new javax.swing.JFormattedTextField();
        cbWindFactor = new javax.swing.JComboBox();
        jXLabel1 = new org.jdesktop.swingx.JXLabel();
        jXLabel2 = new org.jdesktop.swingx.JXLabel();
        jXLabel3 = new org.jdesktop.swingx.JXLabel();
        jXLabel4 = new org.jdesktop.swingx.JXLabel();
        jXLabel5 = new org.jdesktop.swingx.JXLabel();
        jXLabel6 = new org.jdesktop.swingx.JXLabel();
        jXLabel7 = new org.jdesktop.swingx.JXLabel();
        jXLabel8 = new org.jdesktop.swingx.JXLabel();
        jButton1 = new javax.swing.JButton();
        bnCancel = new javax.swing.JButton();
        jXLabel9 = new org.jdesktop.swingx.JXLabel();
        spDaylength = new javax.swing.JSpinner();
        jXLabel10 = new org.jdesktop.swingx.JXLabel();
        jXLabel11 = new org.jdesktop.swingx.JXLabel();
        jXLabel12 = new org.jdesktop.swingx.JXLabel();
        jXLabel13 = new org.jdesktop.swingx.JXLabel();
        jXLabel14 = new org.jdesktop.swingx.JXLabel();
        jXLabel15 = new org.jdesktop.swingx.JXLabel();
        jXLabel16 = new org.jdesktop.swingx.JXLabel();
        jXLabel17 = new org.jdesktop.swingx.JXLabel();
        txtRadiation = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        dpDate.setFormats(new SimpleDateFormat("dd/MM/yyyy", new Locale("en","US")));

        txtMaxTemp.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.0"))));

        txtMinTemp.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.0"))));

        txtPrecipitation.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.0"))));

        txtCo2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.0"))));

        txtHumidity.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.0"))));

        txtWind.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.0"))));

        jXLabel1.setText("Daylength");

        jXLabel2.setText("Radiation");

        jXLabel3.setText("Max Temp");

        jXLabel4.setText("Min Temp");

        jXLabel5.setText("Precipitation");

        jXLabel6.setText("<html>CO<sub>2</sub></html>");

        jXLabel7.setText("Humidity %");

        jXLabel8.setText("Wind");

        jButton1.setText("Ok");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        bnCancel.setText("Cancel");
        bnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bnCancelMouseClicked(evt);
            }
        });
        bnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnCancelActionPerformed(evt);
            }
        });

        jXLabel9.setText("Date");

        jXLabel10.setText("hours");

        jXLabel11.setText("<html>MJ/m<sup>2</sup>/d</html>");

        jXLabel12.setText("<html><sup>๐</sup>C</html>");

        jXLabel13.setText("<html><sup>๐</sup>C</html>");

        jXLabel14.setText("mm");

        jXLabel15.setText("vpm");

        jXLabel16.setText("%");

        jXLabel17.setText("km/hours");

        txtRadiation.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.0"))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jXLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jXLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jXLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jXLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jXLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jXLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jXLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jXLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spDaylength, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(cbDaylengthFactor, 0, 163, Short.MAX_VALUE)
                            .addComponent(cbRadiationFactor, 0, 163, Short.MAX_VALUE)
                            .addComponent(txtMaxTemp, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(cbMaxTempFactor, 0, 163, Short.MAX_VALUE)
                            .addComponent(txtMinTemp, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(cbMinTempFactor, 0, 163, Short.MAX_VALUE)
                            .addComponent(txtPrecipitation, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(cbPrecipitationFactor, 0, 163, Short.MAX_VALUE)
                            .addComponent(txtCo2, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(cbCo2Factor, 0, 163, Short.MAX_VALUE)
                            .addComponent(txtHumidity, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(cbHumidityFactor, 0, 163, Short.MAX_VALUE)
                            .addComponent(txtWind, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(cbWindFactor, 0, 163, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bnCancel))
                            .addComponent(txtRadiation, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jXLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dpDate, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jXLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dpDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spDaylength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbDaylengthFactor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRadiation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbRadiationFactor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaxTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbMaxTempFactor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMinTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbMinTempFactor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecipitation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbPrecipitationFactor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbCo2Factor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHumidity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbHumidityFactor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtWind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbWindFactor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton1)
                    .addComponent(bnCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public EnvironmentApplication GetData()
    {
        return envApp;
    }
    public void SetNull()
    {
        envApp = null;
    }

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try {
            envApp.ODATE = dpDate.getDate();
        } catch (Exception e) {
            envApp.ODATE = null;
        }
        try {
            envApp.EDAY = (Integer) spDaylength.getValue();
            envApp.EDAY_Fact = EnvironmentFactorList.GetAt(1, (String) cbDaylengthFactor.getSelectedItem());
        } catch (Exception e) {
            envApp.EDAY = null;
            envApp.EDAY_Fact = null;
        }
        try {
            envApp.ERAD = Float.parseFloat(txtRadiation.getText());
            envApp.ERAD_Fact = EnvironmentFactorList.GetAt(1, (String) cbRadiationFactor.getSelectedItem());
        } catch (NumberFormatException numberFormatException) {
            envApp.ERAD = null;
            envApp.ERAD_Fact = null;
        }
        try {
            envApp.EMAX = Float.parseFloat(txtMaxTemp.getText());
            envApp.EMAX_Fact = EnvironmentFactorList.GetAt(1, (String) cbMaxTempFactor.getSelectedItem());
        } catch (NumberFormatException numberFormatException) {
            envApp.EMAX = null;
            envApp.EMAX_Fact = null;
        }
        try {
            envApp.EMIN = Float.parseFloat(txtMinTemp.getText());
            envApp.EMIN_Fact = EnvironmentFactorList.GetAt(1, (String) cbMinTempFactor.getSelectedItem());
        } catch (NumberFormatException numberFormatException) {
            envApp.EMIN = null;
            envApp.EMIN_Fact = null;
        }
        try {
            envApp.ERAIN = Float.parseFloat(txtPrecipitation.getText());
            envApp.ERAIN_Fact = EnvironmentFactorList.GetAt(1, (String) cbPrecipitationFactor.getSelectedItem());
        } catch (NumberFormatException numberFormatException) {
            envApp.ERAIN = null;
            envApp.ERAIN_Fact = null;
        }
        try {
            envApp.ECO2 = Float.parseFloat(txtCo2.getText());
            envApp.ECO2_Fact = EnvironmentFactorList.GetAt(1, (String) cbCo2Factor.getSelectedItem());
        } catch (NumberFormatException numberFormatException) {
            envApp.ECO2 = null;
            envApp.ECO2_Fact = null;
        }
        try {
            envApp.EDEW = Float.parseFloat(txtHumidity.getText());
            envApp.EDEW_Fact = EnvironmentFactorList.GetAt(1, (String) cbHumidityFactor.getSelectedItem());
        } catch (NumberFormatException numberFormatException) {
            envApp.EDEW = null;
            envApp.EDEW_Fact = null;
        }
        try {
            envApp.EWIND = Float.parseFloat(txtWind.getText());
            envApp.EWIND_Fact = EnvironmentFactorList.GetAt(1, (String) cbWindFactor.getSelectedItem());
        } catch (NumberFormatException numberFormatException) {
            envApp.EWIND = null;
            envApp.EWIND_Fact = null;
        }

        dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void bnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnCancelMouseClicked
        envApp = null;
        dispose();
    }//GEN-LAST:event_bnCancelMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1MouseClicked(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnCancelActionPerformed
        envApp = null;
        dispose();
    }//GEN-LAST:event_bnCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnCancel;
    private javax.swing.JComboBox cbCo2Factor;
    private javax.swing.JComboBox cbDaylengthFactor;
    private javax.swing.JComboBox cbHumidityFactor;
    private javax.swing.JComboBox cbMaxTempFactor;
    private javax.swing.JComboBox cbMinTempFactor;
    private javax.swing.JComboBox cbPrecipitationFactor;
    private javax.swing.JComboBox cbRadiationFactor;
    private javax.swing.JComboBox cbWindFactor;
    private org.jdesktop.swingx.JXDatePicker dpDate;
    private javax.swing.JButton jButton1;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private org.jdesktop.swingx.JXLabel jXLabel10;
    private org.jdesktop.swingx.JXLabel jXLabel11;
    private org.jdesktop.swingx.JXLabel jXLabel12;
    private org.jdesktop.swingx.JXLabel jXLabel13;
    private org.jdesktop.swingx.JXLabel jXLabel14;
    private org.jdesktop.swingx.JXLabel jXLabel15;
    private org.jdesktop.swingx.JXLabel jXLabel16;
    private org.jdesktop.swingx.JXLabel jXLabel17;
    private org.jdesktop.swingx.JXLabel jXLabel2;
    private org.jdesktop.swingx.JXLabel jXLabel3;
    private org.jdesktop.swingx.JXLabel jXLabel4;
    private org.jdesktop.swingx.JXLabel jXLabel5;
    private org.jdesktop.swingx.JXLabel jXLabel6;
    private org.jdesktop.swingx.JXLabel jXLabel7;
    private org.jdesktop.swingx.JXLabel jXLabel8;
    private org.jdesktop.swingx.JXLabel jXLabel9;
    private javax.swing.JSpinner spDaylength;
    private javax.swing.JFormattedTextField txtCo2;
    private javax.swing.JFormattedTextField txtHumidity;
    private javax.swing.JFormattedTextField txtMaxTemp;
    private javax.swing.JFormattedTextField txtMinTemp;
    private javax.swing.JFormattedTextField txtPrecipitation;
    private javax.swing.JFormattedTextField txtRadiation;
    private javax.swing.JFormattedTextField txtWind;
    // End of variables declaration//GEN-END:variables

}
