/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package org.orpik.ui;

import java.io.File;
import java.util.ArrayList;
import org.orpik.data.Validation;
import org.orpik.modular.DataImport;
import org.orpik.settings.global.GuiManager;

/**
 *
 * @author chemweno
 */
public class DataImportUi extends javax.swing.JDialog {

    private GuiManager guiManager = new GuiManager();
    private DataImport dataImport = new DataImport();
    private Validation validation = new Validation();
    private javax.swing.table.DefaultTableModel tbmDataImport = new javax.swing.table.DefaultTableModel();
    
    private int width = 712;
    private int height = 375;

    /**
     * Creates new form ResetPassword
     */
    public DataImportUi(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        //Set resizeability
        this.setResizable(false);
        //Set default close operation
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        //Set diaolog size
        guiManager.setDialogSize(this, width, height);
        //Center dialog on screen
        guiManager.centerDialog(this, width, height);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fchDataImport = new javax.swing.JFileChooser();
        btgDataImportOnError = new javax.swing.ButtonGroup();
        btgDataImportIfExists = new javax.swing.ButtonGroup();
        pnlImportData = new javax.swing.JPanel();
        pnlImportDataBottom = new javax.swing.JPanel();
        lblImportDataFolderLocation = new javax.swing.JLabel();
        btnImportDataImportData = new javax.swing.JButton();
        btnImportDataChooseFolder = new javax.swing.JButton();
        scpImportDataFiles = new javax.swing.JScrollPane();
        pnlImportDataFiles = new javax.swing.JPanel();
        txtImportDataFolderLocation = new javax.swing.JTextField();
        btnImportDataRemoveAllFiles = new javax.swing.JButton();

        fchDataImport.setCurrentDirectory(new java.io.File("C:\\FidsData"));
        fchDataImport.setDialogTitle("Import Data");
        fchDataImport.setFileSelectionMode(javax.swing.JFileChooser.FILES_AND_DIRECTORIES);
        fchDataImport.setMaximumSize(new java.awt.Dimension(3687, 2647));
        fchDataImport.setMultiSelectionEnabled(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblImportDataFolderLocation.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        lblImportDataFolderLocation.setText("Folder location");

        btnImportDataImportData.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        btnImportDataImportData.setMnemonic('I');
        btnImportDataImportData.setText("Import Data");
        btnImportDataImportData.setEnabled(false);
        btnImportDataImportData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportDataImportDataActionPerformed(evt);
            }
        });

        btnImportDataChooseFolder.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        btnImportDataChooseFolder.setMnemonic('C');
        btnImportDataChooseFolder.setText("Choose Folder");
        btnImportDataChooseFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportDataChooseFolderActionPerformed(evt);
            }
        });

        pnlImportDataFiles.setBackground(new java.awt.Color(255, 255, 255));
        pnlImportDataFiles.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlImportDataFiles.setFont(new java.awt.Font("Arial Unicode MS", 0, 13)); // NOI18N
        pnlImportDataFiles.setLayout(new java.awt.GridLayout(0, 1));
        scpImportDataFiles.setViewportView(pnlImportDataFiles);

        txtImportDataFolderLocation.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        txtImportDataFolderLocation.setEnabled(false);

        btnImportDataRemoveAllFiles.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        btnImportDataRemoveAllFiles.setMnemonic('R');
        btnImportDataRemoveAllFiles.setText("Remove All Files");
        btnImportDataRemoveAllFiles.setToolTipText("Remove all files in panel below");
        btnImportDataRemoveAllFiles.setEnabled(false);
        btnImportDataRemoveAllFiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportDataRemoveAllFilesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlImportDataBottomLayout = new javax.swing.GroupLayout(pnlImportDataBottom);
        pnlImportDataBottom.setLayout(pnlImportDataBottomLayout);
        pnlImportDataBottomLayout.setHorizontalGroup(
            pnlImportDataBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlImportDataBottomLayout.createSequentialGroup()
                .addGroup(pnlImportDataBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlImportDataBottomLayout.createSequentialGroup()
                        .addComponent(lblImportDataFolderLocation)
                        .addGap(7, 7, 7)
                        .addComponent(txtImportDataFolderLocation, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlImportDataBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnImportDataChooseFolder, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(btnImportDataImportData, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnImportDataRemoveAllFiles))
                    .addComponent(scpImportDataFiles))
                .addContainerGap())
        );

        pnlImportDataBottomLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnImportDataChooseFolder, btnImportDataRemoveAllFiles});

        pnlImportDataBottomLayout.setVerticalGroup(
            pnlImportDataBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlImportDataBottomLayout.createSequentialGroup()
                .addGroup(pnlImportDataBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblImportDataFolderLocation)
                    .addComponent(btnImportDataChooseFolder)
                    .addComponent(txtImportDataFolderLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImportDataRemoveAllFiles))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnImportDataImportData)
                .addGap(23, 23, 23)
                .addComponent(scpImportDataFiles, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE))
        );

        pnlImportDataBottomLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnImportDataChooseFolder, btnImportDataImportData, btnImportDataRemoveAllFiles});

        javax.swing.GroupLayout pnlImportDataLayout = new javax.swing.GroupLayout(pnlImportData);
        pnlImportData.setLayout(pnlImportDataLayout);
        pnlImportDataLayout.setHorizontalGroup(
            pnlImportDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlImportDataBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlImportDataLayout.setVerticalGroup(
            pnlImportDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlImportDataBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlImportData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlImportData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImportDataImportDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportDataImportDataActionPerformed
       try{
        //Clear all files in unimported files list        
        DataImport.filenamesNotImportedList.clear();
        // Import data in selected files
        dataImport.processXmlFiles();
        //Check if data exists in database          
        //Remove all files in the panel
        pnlImportDataFiles.removeAll();
        //Retain unimported files
        dataImport.retainUnImportedFiles(pnlImportDataFiles);
       }catch(Exception exception){}
    }//GEN-LAST:event_btnImportDataImportDataActionPerformed

    private void btnImportDataChooseFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportDataChooseFolderActionPerformed
        // Choose folder with fields for data importation
        ArrayList<File> selectedFiles = new ArrayList<>();
        try {
            //Remove all file from panel
            pnlImportDataFiles.removeAll();
            //Clear all files in unimported files list           
            DataImport.filenamesNotImportedList.clear();
            btnImportDataImportData.setEnabled(false);
            btnImportDataRemoveAllFiles.setEnabled(false);
            fchDataImport.showDialog(this, "Choose folder");
            File[] file = null;

            file = fchDataImport.getSelectedFiles();           
            fchDataImport.getCurrentDirectory().getCanonicalPath();

            txtImportDataFolderLocation.setText(fchDataImport.getSelectedFile().toString());
            //List all files in the location chosen
            //dataImport.loadXmlFiles(pnlImportDataFiles, file);
            
            dataImport.loadXmlFiles(pnlImportDataFiles, file);
            pnlImportDataFiles.repaint();
            pnlImportDataFiles.revalidate();
            btnImportDataImportData.setEnabled(true);
            btnImportDataRemoveAllFiles.setEnabled(true);
            
            //Test            
            //dataImport.loadXmlFiles(tblDataImport, tbmDataImport, file);
            //end of test
        } catch (Exception exception) {
        }finally{
            
        }
    }//GEN-LAST:event_btnImportDataChooseFolderActionPerformed

    private void btnImportDataRemoveAllFilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportDataRemoveAllFilesActionPerformed
        // Remove all files in  pnlImportDataFiles
        pnlImportDataFiles.removeAll();
        //Repaint pnlImportDataFiles after removing all checkboxes
        pnlImportDataFiles.repaint();
        pnlImportDataFiles.revalidate();
        //Disable btnImportDataImportData
        btnImportDataImportData.setEnabled(false);
        DataImport.filenamesNotImportedList.clear();
    }//GEN-LAST:event_btnImportDataRemoveAllFilesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DataImportUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataImportUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataImportUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataImportUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                DataImportUi dialog = new DataImportUi(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgDataImportIfExists;
    private javax.swing.ButtonGroup btgDataImportOnError;
    private javax.swing.JButton btnImportDataChooseFolder;
    private javax.swing.JButton btnImportDataImportData;
    private javax.swing.JButton btnImportDataRemoveAllFiles;
    private javax.swing.JFileChooser fchDataImport;
    private javax.swing.JLabel lblImportDataFolderLocation;
    private javax.swing.JPanel pnlImportData;
    private javax.swing.JPanel pnlImportDataBottom;
    private javax.swing.JPanel pnlImportDataFiles;
    private javax.swing.JScrollPane scpImportDataFiles;
    private javax.swing.JTextField txtImportDataFolderLocation;
    // End of variables declaration//GEN-END:variables
}