/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
 * MainForm.java
 *
 * Created on Mar 11, 2010, 11:27:37 AM
 */
package xbuild;

import DSSATModel.CropModel;
import DSSATModel.CropModelList;
import xbuild.Events.RemoveLevelEvent;
import xbuild.Events.XEvent;
import xbuild.Events.AddLevelEvent;
import FileXModel.FileX;
import DSSATModel.DssatProfile;
import DSSATModel.ExperimentType;
import DSSATModel.Setup;
import DSSATModel.SimulationControlDefaults;
import Extensions.Utils;
import FileXModel.ManagementList;
import FileXModel.ModelXBase;
import FileXModel.Planting;
import FileXModel.Simulation;
import FileXModel.Treatment;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.beans.PropertyVetoException;
import java.io.File;
import java.io.IOException;
import java.util.logging.*;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import org.jdesktop.swingx.JXFrame;
import FileXService.FileXService;
import FileXService.FileXValidationService;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.SwingUtilities;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;
import xbuild.Components.CustomDefaultTreeCellRenderer;
import xbuild.Components.IXInternalFrame;
import xbuild.Components.XInternalFrame;
import xbuild.Events.MenuDirection;
import xbuild.Events.NewFrameEvent;
import xbuild.Events.UpdateLevelEvent;
import xbuild.Events.ValidationEvent;
import xbuild.Events.XEventListener;

/**
 *
 * @author Jazzy
 */
public class MainForm extends javax.swing.JFrame implements XEventListener {

    /**
     * Creates new form MainForm
     */
    protected Content content;

    private final HashMap<String, String> mainMenuList = new HashMap<String, String>() {
        {
            put("General Information", "GeneralInfoFrame");
            put("Notes", "GeneralNotesFrame");
            put("Fields", "FieldFrame");
            put("Initial Conditions", "InitialConditionFrame");
            put("Soil Analysis", "SoilAnalysisFrame");
            put("Environmental Modifications", "EnvironmentalFrame");
            put("Cultivars", "CultivarsFrame");
            put("Planting", "PlantingFrame");
            put("Irrigation", "IrrigationFrame");
            put("Fertilizer", "FertilizerFrame");
            put("Organic Amendments", "OrganicFrame");
            put("Tillage", "TillageFrame");
            put("Harvest", "HarvestFrame");
            put("Chemical Applications", "ChemicalFrame");
            put("Simulation Controls", "SimulationFrame");
            put("Treatment", "TreatmentFrame");
        }
    };

    private final ArrayList<String> menuNoFrame = new ArrayList<String>() {
        {
            add("Fields");
            add("Initial Conditions");
            add("Soil Analysis");
            add("Environmental Modifications");
            add("Planting");
            add("Irrigation");
            add("Fertilizer");
            add("Organic Amendments");
            add("Tillage");
            add("Harvest");
            add("Chemical Applications");
            add("Simulation Controls");

        }
    };
    private final ArrayList<String> menuIgnore = new ArrayList<String>() {
        {
            add("General Information");
            add("Notes");
            add("Treatment");
        }
    };
    
    private final ArrayList<String> menuRequired = new ArrayList<String>(){
        {
            add("General Information");
            add("Fields");
            add("Cultivars");
            add("Planting");
            add("Simulation Controls");
            add("Treatment");
        }
    };
    
    private final ArrayList<String> menuAll = new ArrayList<String>(){
        {
            add("General Information");
            add("Fields");
            add("Initial Conditions");
            add("Soil Analysis");
            add("Environmental Modifications");
            add("Cultivars");
            add("Planting");
            add("Irrigation");
            add("Fertilizer");
            add("Organic Amendments");
            add("Tillage");
            add("Harvest");
            add("Chemical Applications");
            add("Simulation Controls");
            add("Treatment");
        }
    };

    public MainForm() {

        initComponents();

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        Dimension winSize = getSize();
        setLocation((screenWidth - winSize.width) / 2, (screenHeight - winSize.height) / 2);

        jXTree1.setVisible(false);
        jXTree1.setCellRenderer(new CustomDefaultTreeCellRenderer());

        BufferedImage image = null;
        try {
            image = ImageIO.read(getClass().getResource("/icons/32/XBuild.png"));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        setIconImage(image);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenuAdd = new javax.swing.JPopupMenu();
        jMenuItemSimAdd = new javax.swing.JMenuItem();
        jPopupMenuItem = new javax.swing.JPopupMenu();
        jPopupMenuSimItemCopy = new javax.swing.JMenuItem();
        jPopupMenuSimItemRename = new javax.swing.JMenuItem();
        jPopupMenuSimItemRemove = new javax.swing.JMenuItem();
        jPopupMenuSimItemMoveUp = new javax.swing.JMenuItem();
        jPopupMenuSimItemMoveDown = new javax.swing.JMenuItem();
        desktopPane = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jXTree1 = new org.jdesktop.swingx.JXTree();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        jMenuNewFile = new javax.swing.JMenuItem();
        jMenuOpenFile = new javax.swing.JMenuItem();
        jMenuCloseFile = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuSaveFile = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuExit = new javax.swing.JMenuItem();
        jMenuRefresh = new javax.swing.JMenu();
        jSetupMenu = new javax.swing.JMenu();
        jMenuHelp = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenuItemSimAdd.setText("Add New");
        jMenuItemSimAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSimAddActionPerformed(evt);
            }
        });
        jPopupMenuAdd.add(jMenuItemSimAdd);

        jPopupMenuSimItemCopy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/file_copy.png"))); // NOI18N
        jPopupMenuSimItemCopy.setText("Copy Level");
        jPopupMenuSimItemCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPopupMenuSimItemCopyActionPerformed(evt);
            }
        });
        jPopupMenuItem.add(jPopupMenuSimItemCopy);

        jPopupMenuSimItemRename.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/text_format.png"))); // NOI18N
        jPopupMenuSimItemRename.setText("Rename Level");
        jPopupMenuSimItemRename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPopupMenuSimItemRenameActionPerformed(evt);
            }
        });
        jPopupMenuItem.add(jPopupMenuSimItemRename);

        jPopupMenuSimItemRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete_forever.png"))); // NOI18N
        jPopupMenuSimItemRemove.setText("Remove Level");
        jPopupMenuSimItemRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPopupMenuSimItemRemoveActionPerformed(evt);
            }
        });
        jPopupMenuItem.add(jPopupMenuSimItemRemove);

        jPopupMenuSimItemMoveUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Up.png"))); // NOI18N
        jPopupMenuSimItemMoveUp.setText("Move Up");
        jPopupMenuSimItemMoveUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPopupMenuSimItemMoveUpActionPerformed(evt);
            }
        });
        jPopupMenuItem.add(jPopupMenuSimItemMoveUp);

        jPopupMenuSimItemMoveDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Down.png"))); // NOI18N
        jPopupMenuSimItemMoveDown.setText("Move Down");
        jPopupMenuSimItemMoveDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPopupMenuSimItemMoveDownActionPerformed(evt);
            }
        });
        jPopupMenuItem.add(jPopupMenuSimItemMoveDown);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("XB2 v0.5.0.0");

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        jXTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jXTree1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jXTree1MouseReleased(evt);
            }
        });
        jXTree1.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jXTree1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jXTree1);

        jMenuFile.setText("File");

        jMenuNewFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16/filenew.png"))); // NOI18N
        jMenuNewFile.setText("New File");
        jMenuNewFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNewFileActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuNewFile);

        jMenuOpenFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16/fileopen.png"))); // NOI18N
        jMenuOpenFile.setText("Open File");
        jMenuOpenFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuOpenFileActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuOpenFile);

        jMenuCloseFile.setText("Close File");
        jMenuCloseFile.setEnabled(false);
        jMenuCloseFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCloseFileActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuCloseFile);
        jMenuFile.add(jSeparator1);

        jMenuSaveFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16/filesave.png"))); // NOI18N
        jMenuSaveFile.setText("Save File");
        jMenuSaveFile.setEnabled(false);
        jMenuSaveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSaveFileActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuSaveFile);
        jMenuFile.add(jSeparator2);

        jMenuExit.setText("Exit");
        jMenuExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuExitMouseClicked(evt);
            }
        });
        jMenuFile.add(jMenuExit);

        jMenuBar1.add(jMenuFile);

        jMenuRefresh.setText("Reload");
        jMenuRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuRefreshMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuRefresh);

        jSetupMenu.setText("Setup");
        jSetupMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSetupMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(jSetupMenu);

        jMenuHelp.setText("Help");

        jMenuItem1.setText("Content");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuHelp.add(jMenuItem1);

        jMenuItem2.setText("Technical Support");
        jMenuHelp.add(jMenuItem2);

        jMenuItem3.setText("About");
        jMenuHelp.add(jMenuItem3);

        jMenuBar1.add(jMenuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 962, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("empty-statement")
    private void jXTree1ValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jXTree1ValueChanged
        showFrame();
}//GEN-LAST:event_jXTree1ValueChanged

    private void jMenuExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuExitMouseClicked
        dispose();
    }//GEN-LAST:event_jMenuExitMouseClicked

    private void jMenuRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuRefreshMouseClicked
        Setup setup = new Setup();
        new LoadingDataFrame(setup.GetDSSATPath(), setup.GetDSSATVersion()).show();
}//GEN-LAST:event_jMenuRefreshMouseClicked

    private void jSetupMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSetupMenuMouseClicked
        SetupFrame frame = new SetupFrame();
        frame.show();

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent evt) {
                if (frame.IsOk) {
                    Setup setup = new Setup();
                    new LoadingDataFrame(setup.GetDSSATPath(), setup.GetDSSATVersion()).show();
                }
            }
        });
    }//GEN-LAST:event_jSetupMenuMouseClicked

    private void jMenuNewFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNewFileActionPerformed
        jMenuSaveFile.setEnabled(true);
        jMenuCloseFile.setEnabled(true);
        jMenuOpenFile.setEnabled(false);
        jMenuNewFile.setEnabled(false);

        FileX.NewFileX();

        ResetTree();
        jXTree1.setVisible(true);

        GeneralInfoFrame generalFrame = new GeneralInfoFrame();

        setRootPaneCheckingEnabled(false);
        javax.swing.plaf.InternalFrameUI ui = generalFrame.getUI();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) ui).setNorthPane(null);

        desktopPane.add(generalFrame);
        try {
            generalFrame.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        generalFrame.show();

        generalFrame.addMyEventListener(this);
    }//GEN-LAST:event_jMenuNewFileActionPerformed

    private void jMenuSaveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSaveFileActionPerformed
        if (FileX.treaments.GetSize() == 0) {
            final ConfirmDialog d = new ConfirmDialog(this, true);
            d.show();

            d.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    if (d.isContinue) {
                        saveFile();
                    }
                }
            });
        } else {
            saveFile();
        }
    }//GEN-LAST:event_jMenuSaveFileActionPerformed

    private void saveFile() {
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) jXTree1.getModel().getRoot();

        //File f = new File(root.getUserObject().toString());
        String target;
        try {
            if (FileX.general.crop != null && FileX.general.crop.CropCode != null && !FileX.general.crop.CropCode.isEmpty()) {
                target = DssatProfile.GetAt(FileX.general.crop.CropCode + "D");
            } else if (FileX.general.FileType == ExperimentType.Seasonal) {
                target = DssatProfile.GetAt("ASD");
            } else if (FileX.general.FileType == ExperimentType.Sequential) {
                target = DssatProfile.GetAt("AQD");
            } else if (FileX.general.FileType == ExperimentType.Spatial) {
                target = DssatProfile.GetAt("APD");
            } else {
                target = new Setup().GetDSSATPath();
            }
        } catch (Exception e) {
            target = new Setup().GetDSSATPath();
        }
        
        File file = new File(target + "\\" + root.getUserObject().toString());
        FileXService.SaveFile(file);

//        JFileChooser fc = new JFileChooser(target);
//        fc.setSelectedFile(f);
//
//        fc.setName(root.getUserObject().toString());
//        int returnVal = fc.showSaveDialog(this);
//
//        if (returnVal == JFileChooser.APPROVE_OPTION) {
//            File file = fc.getSelectedFile();
//            if(file.exists()) {
//                if(JOptionPane.showConfirmDialog(null, "Do you want to save this file?", "File already existing", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
//                    FileXService.SaveFile(file);
//                }
//                else {
//                    return;
//                }
//            }
//            FileXService.SaveFile(file);
//        }
    }
    private void jMenuCloseFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCloseFileActionPerformed

        int confirmSave = JOptionPane.showConfirmDialog(null, "Do you want you want to save the file?", "XB2", JOptionPane.YES_NO_CANCEL_OPTION);

        if (confirmSave == 2) // Cancel
        {
            return;
        } else if (confirmSave == 0) //Yes
        {
            saveFile();
        }

        DefaultMutableTreeNode root = (DefaultMutableTreeNode) jXTree1.getModel().getRoot();
        DefaultMutableTreeNode simsChild = null;
        for (int i = 0; i < root.getChildCount(); i++) {
            DefaultMutableTreeNode child = (DefaultMutableTreeNode) root.getChildAt(i);
            if (child.toString().equals("Simulation Controls")) {
                simsChild = child;
                break;
            }
        }

        if (simsChild != null) {
            simsChild.removeAllChildren();
            DefaultTreeModel model = (DefaultTreeModel) jXTree1.getModel();
            model.reload(simsChild);
        }

        jMenuNewFile.setEnabled(true);
        jMenuSaveFile.setEnabled(false);
        jMenuCloseFile.setEnabled(false);
        jMenuOpenFile.setEnabled(true);

        for (JInternalFrame innerFrame : desktopPane.getAllFrames()) {
            innerFrame.dispose();
        }
        jXTree1.setVisible(false);

        FileX.CloseFile();
    }//GEN-LAST:event_jMenuCloseFileActionPerformed

    private void jMenuOpenFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuOpenFileActionPerformed
        JFileChooser fc = new JFileChooser(new Setup().GetDefaultPath());
        FileFilter filter1 = new ExtensionFileFilter("File x", new String[]{"x", "X"});

        fc.setFileFilter(filter1);

        int returnVal = fc.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            ResetTree();

            File file = fc.getSelectedFile();

            FileXService.OpenFileX(file);

            DefaultMutableTreeNode root = (DefaultMutableTreeNode) jXTree1.getModel().getRoot();
            root.setUserObject(file.getName());

            AddTreeMenu("Environment", "Fields");
            AddTreeMenu("Environment", "Initial Conditions");
            AddTreeMenu("Environment", "Soil Analysis");
            AddTreeMenu("Environment", "Environmental Modifications");
            AddTreeMenu("Management", "Cultivars");
            AddTreeMenu("Management", "Planting");
            AddTreeMenu("Management", "Irrigation");
            AddTreeMenu("Management", "Fertilizer");
            AddTreeMenu("Management", "Organic Amendments");
            AddTreeMenu("Management", "Tillage");
            AddTreeMenu("Management", "Harvest");
            AddTreeMenu("Management", "Chemical Applications");
            AddTreeMenu(root, "Simulation Controls");
            AddTreeMenu(root, "Treatment");

            jXTree1.collapseAll();
            jXTree1.expandAll();
            jXTree1.setVisible(true);

            GeneralInfoFrame generalFrame = new GeneralInfoFrame();

            setRootPaneCheckingEnabled(false);
            javax.swing.plaf.InternalFrameUI ui = generalFrame.getUI();
            ((javax.swing.plaf.basic.BasicInternalFrameUI) ui).setNorthPane(null);

            desktopPane.add(generalFrame);
            try {
                generalFrame.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            generalFrame.show();
            generalFrame.addMyEventListener(this);

            jMenuNewFile.setEnabled(false);
            jMenuSaveFile.setEnabled(true);
            jMenuCloseFile.setEnabled(true);
            jMenuOpenFile.setEnabled(false);

            //checkTreatment();
        }
    }//GEN-LAST:event_jMenuOpenFileActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked
        desktopPane.add(content);
        content.show();
    }//GEN-LAST:event_jMenuItem1MouseClicked

    private void jXTree1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXTree1MouseReleased
        int row = jXTree1.getClosestRowForLocation(evt.getX(), evt.getY());
        jXTree1.setSelectionRow(row);
        
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) jXTree1.getLastSelectedPathComponent();
        if (node == null) {
            return;
        }

        boolean enabled = true;
        String nodeName = node.toString();

        if (node.getParent() != null && !nodeName.equals("General Information")) {
            enabled = FileXValidationService.IsGeneralValid();
        }

        if (nodeName.equals("Treatment")) {
            enabled = FileXValidationService.IsMinimumRequired();
        }

        if (!enabled) {
            return;
        }

        if (node.getParent() != null && mainMenuList.keySet().contains(node.toString()) && !menuIgnore.contains(node.toString())) {
            if (SwingUtilities.isRightMouseButton(evt) || node.getChildCount() == 0) {
                jPopupMenuAdd.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        } else if (SwingUtilities.isRightMouseButton(evt) && node.getParent() != null && mainMenuList.keySet().contains(node.getParent().toString())) {
            jPopupMenuSimItemCopy.setEnabled(true);
            jPopupMenuSimItemRename.setEnabled(true);
            if ("Cultivars".equals(node.getParent().toString())) {
                jPopupMenuSimItemCopy.setEnabled(false);
                jPopupMenuSimItemRename.setEnabled(false);
            }

            EventQueue.invokeLater(() -> {
                jPopupMenuItem.show(evt.getComponent(), evt.getX(), evt.getY());
            });
        }
    }//GEN-LAST:event_jXTree1MouseReleased
    
    private void jMenuItemSimAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSimAddActionPerformed

        DefaultMutableTreeNode node = (DefaultMutableTreeNode) jXTree1.getLastSelectedPathComponent();
        ManagementList modelList = (ManagementList) GetManagementList(node.toString());

        if (modelList != null && !"Cultivars".equals(node.toString())) {
            String defaultName = !"Simulation Controls".equals(node.toString()) ? "UNKNOWN" : SimulationControlDefaults.Get(FileX.general.FileType).SNAME;
            String nodeName = JOptionPane.showInputDialog(new JXFrame(), "Please enter your description", defaultName);
            if (nodeName.length() > 0) {
                int level = 0;
                for (ModelXBase m : modelList.GetAll()) {
                    if (m.GetName().equalsIgnoreCase(nodeName)) {
                        JOptionPane.showMessageDialog(new JXFrame(), "This name is already add", "ERROR", 0);
                        return;
                    }
                    level = m.GetLevel();
                }

                level++;
                if ("Simulation Controls".equals(node.toString())) {
                    Simulation sim = SimulationControlDefaults.Get(FileX.general.FileType);
                    sim.SetName(nodeName);
                    CropModel cm = CropModelList.GetByCrop(FileX.general.crop.CropCode);
                    if (cm != null) {
                        sim.SMODEL = cm.ModelCode;
                    }
                    if(FileX.plantings.GetSize() > 0 && FileX.plantings.GetSize() <= level){
                        Planting pl = (Planting) FileX.plantings.GetAt(level);
                        sim.SDATE = pl.PDATE;
                    }
                    modelList.AddNew(sim);
                    sim.SetLevel(level);
                } else {
                    ModelXBase m = modelList.AddNew(nodeName);
                    m.SetLevel(level);
                }
                DefaultMutableTreeNode newNode = new DefaultMutableTreeNode();

                String newName = "Level " + level + ": " + nodeName;

                newNode.setUserObject(newName);
                node.add(newNode);

                DefaultTreeModel model = (DefaultTreeModel) jXTree1.getModel();
                model.reload(node);

                jXTree1.expandAll();
                int[] rows = jXTree1.getSelectionRows();

                jXTree1.setSelectionRow(rows[0] + modelList.GetSize());

                IXInternalFrame frame = XInternalFrame.newInstance(mainMenuList.get(nodeName), node.toString());

                ShowFrame(frame);
            }
        } else if (modelList != null && "Cultivars".equals(node.toString())) {
            CultivarsFrame currentFrame = (CultivarsFrame) desktopPane.getSelectedFrame();
            currentFrame.AddNewCultivar();
        }
    }//GEN-LAST:event_jMenuItemSimAddActionPerformed

    private void jPopupMenuSimItemRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPopupMenuSimItemRemoveActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(new JXFrame(), "Do you want to delete this level") == 0) {
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) jXTree1.getLastSelectedPathComponent();

            DefaultTreeModel model = (DefaultTreeModel) jXTree1.getModel();
            DefaultMutableTreeNode parentNode = (DefaultMutableTreeNode) node.getParent();

            model.removeNodeFromParent(node);

            desktopPane.removeAll();
            desktopPane.repaint();

            ManagementList modelList = GetManagementList(parentNode.toString());
            int level = modelList.GetIndex(getLevel(node.toString()));
            modelList.RemoveAt(level);

            EventQueue.invokeLater(() -> {                
                for (int i = level; i < modelList.GetSize(); i++) {                    
                    ModelXBase m = modelList.GetAtIndex(i);

                    if (m.getClass() == Treatment.class && FileX.general.FileType == ExperimentType.Sequential) {

                    } else {
                        m.SetLevel(m.GetLevel() - 1);
                        DefaultMutableTreeNode child = (DefaultMutableTreeNode) parentNode.getChildAt(i);
                        String newName = "Level " + m.GetLevel() + ": " + m.GetName();
                        child.setUserObject(newName);
                    }                    
                }
                model.reload(parentNode);
                jXTree1.setSelectionPath(new TreePath(parentNode.getPath()));
            });
        }

    }//GEN-LAST:event_jPopupMenuSimItemRemoveActionPerformed

    private void jPopupMenuSimItemCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPopupMenuSimItemCopyActionPerformed
        // TODO add your handling code here:
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) jXTree1.getLastSelectedPathComponent();
        DefaultMutableTreeNode parentNode = (DefaultMutableTreeNode) node.getParent();

        ManagementList modelList = GetManagementList(parentNode.toString());
        String newName = modelList.GetCopyName(node.toString().split(":")[1].trim());

        String r = JOptionPane.showInputDialog(new JXFrame(), "Please enter your description", newName);
        if (r.length() > 0) {
            if (modelList.GetAt(r) != null) {
                JOptionPane.showMessageDialog(new JXFrame(), "This name is already add", "ERROR", 0);
                return;
            }

            int index = modelList.GetIndex(getLevel(node.toString()));
            ModelXBase modelClone = modelList.Clone(index, r);
            
            if(modelClone.getClass() == Treatment.class && FileX.general.FileType == ExperimentType.Sequential){
                modelClone.SetLevel(modelList.GetAtIndex(modelList.GetSize() - 1).GetLevel());
                Integer R = Utils.ParseInteger(((Treatment)modelList.GetAtIndex(modelList.GetSize() - 1)).R) + 1;
                ((Treatment)modelClone).R = R.toString();
            }
            else{
                modelClone.SetLevel(modelList.GetAtIndex(modelList.GetSize() - 1).GetLevel() + 1);
            }
            
            
            modelList.AddNew(modelClone);

            DefaultMutableTreeNode newNode = new DefaultMutableTreeNode();
            String newCopyName = "Level " + modelClone.GetLevel() + ": " + r;
            newNode.setUserObject(newCopyName);
            parentNode.add(newNode);

            DefaultTreeModel model = (DefaultTreeModel) jXTree1.getModel();
            model.reload(parentNode);
            jXTree1.expandAll();

            int[] rows = jXTree1.getSelectionRows();
            if (rows.length > 0) {
                jXTree1.setSelectionRow(rows[0] + FileX.simulationList.GetSize());
            }

            IXInternalFrame frame = XInternalFrame.newInstance(mainMenuList.get(parentNode.toString()), newNode.toString());
            ShowFrame(frame);
        }
    }//GEN-LAST:event_jPopupMenuSimItemCopyActionPerformed

    private void jPopupMenuSimItemRenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPopupMenuSimItemRenameActionPerformed
        // TODO add your handling code here:
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) jXTree1.getLastSelectedPathComponent();
        DefaultMutableTreeNode parentNode = (DefaultMutableTreeNode) node.getParent();

        ManagementList modelList = GetManagementList(parentNode.toString());
        
        ModelXBase model = modelList.GetAt(getLevel(node.toString()));
        String oldName = model.GetName();

        String r = JOptionPane.showInputDialog(new JXFrame(), "Please enter your description", oldName);
        if ((null == oldName ? r != null : !oldName.equals(r)) && 0 <= r.length()) {
            if (modelList.GetAt(r) != null) {
                JOptionPane.showMessageDialog(new JXFrame(), "This name is already add", "ERROR", 0);
                return;
            }

            model.SetName(r);
            String newName = "Level " + model.GetLevel() + ": " + r;
            node.setUserObject(newName);

            DefaultTreeModel treeModel = (DefaultTreeModel) jXTree1.getModel();
            treeModel.reload(parentNode);
            jXTree1.expandAll();

            IXInternalFrame currentFrame = (IXInternalFrame) desktopPane.getSelectedFrame();
            currentFrame.updatePanelName(newName);
            currentFrame.updatePanelList();
        }
    }//GEN-LAST:event_jPopupMenuSimItemRenameActionPerformed

    private void jPopupMenuSimItemMoveUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPopupMenuSimItemMoveUpActionPerformed
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) jXTree1.getLastSelectedPathComponent();
        DefaultMutableTreeNode parentNode = (DefaultMutableTreeNode) node.getParent();

        ManagementList modelList = GetManagementList(parentNode.toString());
        int level = modelList.GetIndex(getLevel(node.toString()));

        if (modelList.MoveUp(level)) {

            EventQueue.invokeLater(() -> {
                ModelXBase modelCurrent = modelList.GetAtIndex(level);
                String newName = "Level " + (modelCurrent.GetLevel()) + ": " + modelCurrent.GetName();
                node.setUserObject(newName);
                IXInternalFrame currentFrame = (IXInternalFrame) desktopPane.getSelectedFrame();
                currentFrame.updatePanelName(newName);

                ModelXBase modelUp = modelList.GetAtIndex(level - 1);
                DefaultMutableTreeNode nodeUp = (DefaultMutableTreeNode) parentNode.getChildAt(level - 1);
                String newUpName = "Level " + modelUp.GetLevel() + ": " + modelUp.GetName();
                nodeUp.setUserObject(newUpName);

                DefaultTreeModel model = (DefaultTreeModel) jXTree1.getModel();
                model.reload(parentNode);
            });
        }
    }//GEN-LAST:event_jPopupMenuSimItemMoveUpActionPerformed

    protected int getLevel(String nodeName) {
        String[] level1 = nodeName.split(":");
        String[] level2 = level1[0].split(" ");

        return Integer.parseInt(level2[1]);
    }
    
    private void jPopupMenuSimItemMoveDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPopupMenuSimItemMoveDownActionPerformed
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) jXTree1.getLastSelectedPathComponent();
        DefaultMutableTreeNode parentNode = (DefaultMutableTreeNode) node.getParent();

        ManagementList modelList = GetManagementList(parentNode.toString());
        int level = modelList.GetIndex(getLevel(node.toString()));

        if (modelList.MoveDown(level)) {
            EventQueue.invokeLater(() -> {
                ModelXBase modelCurrent = modelList.GetAtIndex(level);
                String newName = "Level " + modelCurrent.GetLevel() + ": " + modelCurrent.GetName();
                node.setUserObject(newName);
                IXInternalFrame currentFrame = (IXInternalFrame) desktopPane.getSelectedFrame();
                currentFrame.updatePanelName(newName);

                ModelXBase modelDown = modelList.GetAtIndex(level + 1);
                DefaultMutableTreeNode nodeUp = (DefaultMutableTreeNode) parentNode.getChildAt(level + 1);
                String newUpName = "Level " + modelDown.GetLevel() + ": " + modelDown.GetName();
                nodeUp.setUserObject(newUpName);

                DefaultTreeModel model = (DefaultTreeModel) jXTree1.getModel();
                model.reload(parentNode);
            });
        }
    }//GEN-LAST:event_jPopupMenuSimItemMoveDownActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCloseFile;
    private javax.swing.JMenuItem jMenuExit;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JMenu jMenuHelp;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItemSimAdd;
    private javax.swing.JMenuItem jMenuNewFile;
    private javax.swing.JMenuItem jMenuOpenFile;
    private javax.swing.JMenu jMenuRefresh;
    private javax.swing.JMenuItem jMenuSaveFile;
    private javax.swing.JPopupMenu jPopupMenuAdd;
    private javax.swing.JPopupMenu jPopupMenuItem;
    private javax.swing.JMenuItem jPopupMenuSimItemCopy;
    private javax.swing.JMenuItem jPopupMenuSimItemMoveDown;
    private javax.swing.JMenuItem jPopupMenuSimItemMoveUp;
    private javax.swing.JMenuItem jPopupMenuSimItemRemove;
    private javax.swing.JMenuItem jPopupMenuSimItemRename;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu jSetupMenu;
    private org.jdesktop.swingx.JXTree jXTree1;
    // End of variables declaration//GEN-END:variables
    
    private void ShowFrame(IXInternalFrame frame) {

        if (frame != null) {
            setRootPaneCheckingEnabled(false);
            javax.swing.plaf.InternalFrameUI ui = frame.getUI();
            ((javax.swing.plaf.basic.BasicInternalFrameUI) ui).setNorthPane(null);

            desktopPane.add(frame);
            try {
                frame.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            frame.show();
        }
    }

    private DefaultMutableTreeNode GetNode(String parentNode, String childNode) {

        DefaultMutableTreeNode returnNode = null;
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) jXTree1.getModel().getRoot();
        for (int i = 0; i < root.getChildCount(); i++) {
            DefaultMutableTreeNode child = (DefaultMutableTreeNode) root.getChildAt(i);
            if (child.toString().equals(parentNode)) {
                for (int n = 0; n < child.getChildCount(); n++) {
                    DefaultMutableTreeNode leaf = (DefaultMutableTreeNode) child.getChildAt(n);
                    if (leaf.toString().equals(childNode)) {

                        leaf.removeAllChildren();
                        DefaultTreeModel model = (DefaultTreeModel) jXTree1.getModel();
                        model.reload(leaf);

                        returnNode = leaf;
                        break;
                    }
                }
            }
        }
        return returnNode;
    }

    private ManagementList GetManagementList(String nodeName) {
        if (null != nodeName) {
            switch (nodeName) {
                case "Fields":
                    return FileX.fieldList;
                case "Initial Conditions":
                    return FileX.initialList;
                case "Soil Analysis":
                    return FileX.soilAnalysis;
                case "Environmental Modifications":
                    return FileX.environmentals;
                case "Cultivars":
                    return FileX.cultivars;
                case "Planting":
                    return FileX.plantings;
                case "Irrigation":
                    return FileX.irrigations;
                case "Fertilizer":
                    return FileX.fertilizerList;
                case "Organic Amendments":
                    return FileX.organicList;
                case "Tillage":
                    return FileX.tillageList;
                case "Harvest":
                    return FileX.harvestList;
                case "Chemical Applications":
                    return FileX.chemicalList;
                case "Simulation Controls":
                    return FileX.simulationList;
                case "Treatment":
                    return FileX.treaments;
                default:
                    break;
            }
        }

        return null;
    }

    private void ResetTree() {
        jXTree1.removeAll();

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("FileX");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("General Information");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Notes");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Environment");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Fields");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Initial Conditions");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Soil Analysis");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Environmental Modifications");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Management");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Cultivars");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Planting");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Irrigation");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Fertilizer");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Organic Amendments");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Tillage");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Harvest");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Chemical Applications");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Simulation Controls");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Treatment");
        treeNode1.add(treeNode2);
        jXTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));

        jXTree1.expandAll();
    }

    private void AddTreeMenu(DefaultMutableTreeNode root, String node) {
        DefaultMutableTreeNode parent = null;
        for (int i = 0; i < root.getChildCount(); i++) {
            DefaultMutableTreeNode tmp = (DefaultMutableTreeNode) root.getChildAt(i);
            if (tmp.toString().equals(node)) {
                parent = tmp;
                break;
            }
        }

        if (parent != null) {
            parent.removeAllChildren();
            DefaultTreeModel model = (DefaultTreeModel) jXTree1.getModel();
            model.reload(parent);

            AddToParent(parent, node);
        }
    }

    private void AddTreeMenu(String parent, String child) {

        DefaultMutableTreeNode parentNode = GetNode(parent, child);
        AddToParent(parentNode, child);
    }

    private void AddToParent(DefaultMutableTreeNode parentNode, String child) {
        ManagementList list = GetManagementList(child);
        for (ModelXBase item : list.GetAll()) {
            try {
                DefaultMutableTreeNode leaf = new DefaultMutableTreeNode();
                leaf.setUserObject("Level " + item.GetLevel() + ": " + item.GetName());
                parentNode.add(leaf);
            } catch (Exception ex) {
                String me = ex.getMessage();
            }
        }
    }

    /**
     *
     * @param e
     */
    @Override
    public void myAction(XEvent e) {
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) jXTree1.getModel().getRoot();

        EventQueue.invokeLater(()
                -> {
            root.setUserObject(e.getN());

            jXTree1.repaint();

            TreeSelectionListener[] ls = jXTree1.getListeners(TreeSelectionListener.class);
            MouseAdapter[] ms = jXTree1.getListeners(MouseAdapter.class);

            for (TreeSelectionListener l : ls) {
                jXTree1.removeTreeSelectionListener(l);
            }

            for (MouseAdapter m : ms) {
                jXTree1.removeMouseListener(m);
            }

            TreePath path = jXTree1.getSelectionPath();
            jXTree1.collapseAll();
            jXTree1.expandAll();

            jXTree1.setSelectionPath(path);

            for (TreeSelectionListener l : ls) {
                jXTree1.addTreeSelectionListener(l);
            }

            for (MouseAdapter m : ms) {
                jXTree1.addMouseListener(m);
            }
        }
        );
    }

    @Override
    public void myAction(AddLevelEvent e) {
        DefaultMutableTreeNode rootNode = (DefaultMutableTreeNode) jXTree1.getModel().getRoot();
        DefaultMutableTreeNode targetNode = null;
        for (int i = 0; i < rootNode.getChildCount(); i++) {
            DefaultMutableTreeNode child = (DefaultMutableTreeNode) rootNode.getChildAt(i);

            if (child.toString().equals(e.getParent())) {
                targetNode = child;
                break;
            }

            for (int n = 0; n < child.getChildCount(); n++) {
                DefaultMutableTreeNode child1 = (DefaultMutableTreeNode) child.getChildAt(n);
                if (child1.toString().equals(e.getParent())) {
                    targetNode = child1;
                    break;
                }
            }
        }

        DefaultMutableTreeNode newNode = new DefaultMutableTreeNode();
        String newName = e.getName();
        newNode.setUserObject(newName);
        targetNode.add(newNode);

        jXTree1.expandAll();

        DefaultTreeModel model = (DefaultTreeModel) jXTree1.getModel();
        model.reload(targetNode);
    }

    @Override
    public void myAction(RemoveLevelEvent e) {
        DefaultMutableTreeNode rootNode = (DefaultMutableTreeNode) jXTree1.getModel().getRoot();
        DefaultMutableTreeNode targetNode = null;
        for (int i = 0; i < rootNode.getChildCount(); i++) {
            DefaultMutableTreeNode child = (DefaultMutableTreeNode) rootNode.getChildAt(i);

            if (child.toString().equals(e.getParent())) {
                targetNode = child;
                break;
            }

            for (int n = 0; n < child.getChildCount(); n++) {
                DefaultMutableTreeNode child1 = (DefaultMutableTreeNode) child.getChildAt(n);
                if (child1.toString().equals(e.getParent())) {
                    targetNode = child1;
                    break;
                }
            }
        }

        DefaultMutableTreeNode removeNode = null;
        for (int i = 0; i < targetNode.getChildCount(); i++) {
            DefaultMutableTreeNode child = (DefaultMutableTreeNode) targetNode.getChildAt(i);
            if (child.toString().equals(e.getName())) {
                removeNode = child;
                break;
            }
        }

        DefaultTreeModel model = (DefaultTreeModel) jXTree1.getModel();

        targetNode.remove(removeNode);

        for (int i = 0; i < targetNode.getChildCount(); i++) {
            DefaultMutableTreeNode child = (DefaultMutableTreeNode) targetNode.getChildAt(i);
            String[] oldName = child.getUserObject().toString().split(":");

            child.setUserObject("Level " + (i + 1) + ": " + oldName[1].trim());
        }

        model.reload(targetNode);
    }

    @Override
    public void myAction(UpdateLevelEvent e) {
        DefaultMutableTreeNode rootNode = (DefaultMutableTreeNode) jXTree1.getModel().getRoot();
        DefaultMutableTreeNode targetNode = null;
        for (int i = 0; i < rootNode.getChildCount(); i++) {
            DefaultMutableTreeNode child = (DefaultMutableTreeNode) rootNode.getChildAt(i);

            if (child.toString().equals(e.getParent())) {
                targetNode = child;
                break;
            }

            for (int n = 0; n < child.getChildCount(); n++) {
                DefaultMutableTreeNode child1 = (DefaultMutableTreeNode) child.getChildAt(n);
                if (child1.toString().equals(e.getParent())) {
                    targetNode = child1;
                    break;
                }
            }
        }

        DefaultMutableTreeNode childUpdate = (DefaultMutableTreeNode) targetNode.getChildAt(e.getRow());
        childUpdate.setUserObject(e.getName());

        DefaultTreeModel model = (DefaultTreeModel) jXTree1.getModel();
        model.reload(targetNode);
    }

    @Override
    public void myAction(ValidationEvent e) {
        jXTree1.repaint();
    }

    @Override
    public void myAction(NewFrameEvent e) {
        DefaultMutableTreeNode rootNode = (DefaultMutableTreeNode) jXTree1.getModel().getRoot();
        ArrayList<String> nodeList = new ArrayList<>();
        getCellIndex(rootNode, nodeList);

        String frameName;
        int select;

        int mIndex = menuAll.indexOf(e.getCurrentFrameName());
        if (e.getDirection() == MenuDirection.PREVIOUS) {
            mIndex--;
        } else if (e.getDirection() == MenuDirection.NEXT) {
            mIndex++;
        }

        frameName = menuAll.get(mIndex);
        select = nodeList.indexOf(frameName);

        showTargetFrame(frameName, select, nodeList, e.getDirection());
    }
    
    private void showTargetFrame(String frameName, int select, ArrayList<String> nodeList, MenuDirection direction) {
        if (!frameName.equals("General Information")) {
            ManagementList modelList = (ManagementList) GetManagementList(frameName);
            if (modelList.GetSize() > 0) {
                jXTree1.expandRow(select);
                
                jXTree1.setSelectionRow(select + 1);
                jXTree1.scrollRowToVisible(select + 1);
                
                EventQueue.invokeLater(() -> {
                    showFrame();
                });                
            } else if (menuRequired.indexOf(frameName) > 0) {
                jXTree1.expandRow(select);
                jXTree1.setSelectionRow(select);
                jXTree1.scrollRowToVisible(select);
                addLevel();
            } else {
                int mIndex = menuAll.indexOf(frameName);

                if (direction == MenuDirection.PREVIOUS) {
                    mIndex--;
                } else if (direction == MenuDirection.NEXT) {
                    mIndex++;
                }

                frameName = menuAll.get(mIndex);
                select = nodeList.indexOf(frameName);
                showTargetFrame(frameName, select, nodeList, direction);
            }
        } else {
            jXTree1.expandRow(select);
            jXTree1.setSelectionRow(select);
            jXTree1.scrollRowToVisible(select);
            
            EventQueue.invokeLater(() -> {
                showFrame();
            });
        }
    }

    private void getCellIndex(TreeNode node, ArrayList<String> selects) {
        selects.add(node.toString());

        if (node.getChildCount() > 0) {
            for (int i = 0; i < node.getChildCount(); i++) {
                getCellIndex(node.getChildAt(i), selects);
            }
        }
    }
    
    private void addLevel(){
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) jXTree1.getLastSelectedPathComponent();
        ManagementList modelList = (ManagementList) GetManagementList(node.toString());

        if (modelList != null && !"Cultivars".equals(node.toString())) {
            String defaultName = !"Simulation Controls".equals(node.toString()) ? "UNKNOWN" : SimulationControlDefaults.Get(FileX.general.FileType).SNAME;
            String nodeName = JOptionPane.showInputDialog(new JXFrame(), "Please enter your description", defaultName);
            if (nodeName.length() > 0) {
                for (ModelXBase m : modelList.GetAll()) {
                    if (m.GetName().equalsIgnoreCase(nodeName)) {
                        JOptionPane.showMessageDialog(new JXFrame(), "This name is already add", "ERROR", 0);
                        return;
                    }
                }
                if ("Simulation Controls".equals(node.toString())) {
                    Simulation sim = SimulationControlDefaults.Get(FileX.general.FileType);
                    sim.SetName(nodeName);
                    CropModel cm = CropModelList.GetByCrop(FileX.general.crop.CropCode);
                    if (cm != null) {
                        sim.SMODEL = cm.ModelCode;
                    }
                    modelList.AddNew(sim);
                } else {
                    modelList.AddNew(nodeName);
                }
                DefaultMutableTreeNode newNode = new DefaultMutableTreeNode();

                String newName = "Level " + (modelList.GetLevel(nodeName) + 1) + ": " + nodeName;

                newNode.setUserObject(newName);
                node.add(newNode);

                DefaultTreeModel model = (DefaultTreeModel) jXTree1.getModel();
                model.reload(node);

                jXTree1.expandAll();
                int[] rows = jXTree1.getSelectionRows();

                jXTree1.setSelectionRow(rows[0] + modelList.GetSize());

                IXInternalFrame frame = XInternalFrame.newInstance(mainMenuList.get(nodeName), node.toString());

                ShowFrame(frame);
            }
        } else if (modelList != null && "Cultivars".equals(node.toString())) {
            CultivarsFrame currentFrame = (CultivarsFrame) desktopPane.getSelectedFrame();
            currentFrame.AddNewCultivar();
        }
    }
    
    private void showFrame(){
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) jXTree1.getLastSelectedPathComponent();

        boolean isValid = true;
        if (node != null && !menuNoFrame.contains(node.toString()) && node.getParent() != null) {
            if ("General Information".equalsIgnoreCase(node.toString())) {
                isValid = true;
            } else if (!FileXValidationService.IsGeneralValid()) {
                isValid = false;
            } else if ("Treatment".equalsIgnoreCase(node.toString()) && !FileXValidationService.IsMinimumRequired()) {
                isValid = false;
            }

            if (isValid) {
                String nodeName = node.toString();
                if (mainMenuList.get(nodeName) == null) {
                    nodeName = node.getParent().toString();
                }

                IXInternalFrame frame = XInternalFrame.newInstance(mainMenuList.get(nodeName), node.toString());

                if (frame != null) {
                    ShowFrame(frame);
                    frame.addMyEventListener(this);
                }
            }
        }
    }
}

class ExtensionFileFilter extends FileFilter {

    String description;

    String extensions[];

    public ExtensionFileFilter(String description, String extension) {
        this(description, new String[]{extension});
    }

    public ExtensionFileFilter(String description, String extensions[]) {
        if (description == null) {
            this.description = extensions[0];
        } else {
            this.description = description;
        }
        this.extensions = (String[]) extensions.clone();
        toLower(this.extensions);
    }

    private void toLower(String array[]) {
        for (int i = 0, n = array.length; i < n; i++) {
            array[i] = array[i].toLowerCase();
        }
    }

    public String getDescription() {
        return description;
    }

    public boolean accept(File file) {
        if (file.isDirectory()) {
            return true;
        } else {
            String fileName = file.getName().toLowerCase();
            if (fileName.endsWith("x")) {
                return true;
            }
        }
        return false;
    }
}
