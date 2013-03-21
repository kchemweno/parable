/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package org.orpik.access.control;

import javax.swing.JOptionPane;
import org.orpik.logging.LogManager;
import org.orpik.settings.global.GuiManager;
import org.orpik.settings.global.Interface;
import org.orpik.settings.global.ScreenGeometry;
import org.orpik.ui.MainFrame;

/**
 *
 * @author Chemweno
 */
public class Login extends javax.swing.JFrame {

    private static Interface onInterface = new Interface();
    private GuiManager guiManager = new GuiManager();
    private ScreenGeometry centerComponent = new ScreenGeometry();
    private AuthenticateUser authenticateUser = new AuthenticateUser();
    private MainFrame mainframe = new MainFrame();
    private static LogManager logManager = new LogManager();
    // private Login login = new Login();
    private int width = 400;
    private int height = 250;
    public static int userId = 1;
    public static String userName = "";

    /**
     * Creates new form Login
     */
    public Login() {

        try {
            initComponents();
            //Additional settings for this class and its components
            //Set resizability
            this.setResizable(false);
            //Set default close operation
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            //this.setSize(450, 250);
            setFrameSize();
            guiManager.setFrameSize(this, width, height);
            //Center frame on screen
            //centerFrame();
            guiManager.centerFrame(this, width, height);
            //Set default button
            this.getRootPane().setDefaultButton(btnLogin);
        } catch (Exception exception) {
            logManager.logInfo("Getting password");
            //exception.printStackTrace();
            logManager.logError("Exception is thrown and caught");
        }
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
        jTextArea1 = new javax.swing.JTextArea();
        pnlLoginMain = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtLoginUserName = new javax.swing.JTextField();
        pwdLoginPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnLoginCancel = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("org/orpik/access/control/Bundle"); // NOI18N
        setName(bundle.getString("Login.name")); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/orpik/images/login_medium.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText(bundle.getString("Login.jLabel1.text")); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText(bundle.getString("Login.jLabel3.text")); // NOI18N

        txtLoginUserName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLoginUserName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtLoginUserNameMouseExited(evt);
            }
        });

        pwdLoginPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pwdLoginPassword.setEchoChar('\u2022');

        btnLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/orpik/images/Open_16x16.png"))); // NOI18N
        btnLogin.setMnemonic('L');
        btnLogin.setText(bundle.getString("Login.btnLogin.text")); // NOI18N
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnLoginCancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLoginCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/orpik/images/Cancel_16x16.png"))); // NOI18N
        btnLoginCancel.setMnemonic('C');
        btnLoginCancel.setText(bundle.getString("Login.btnLoginCancel.text")); // NOI18N
        btnLoginCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pwdLoginPassword)
                    .addComponent(txtLoginUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLoginCancel)
                .addGap(149, 149, 149))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnLogin, btnLoginCancel});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtLoginUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pwdLoginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnLoginCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {pwdLoginPassword, txtLoginUserName});

        javax.swing.GroupLayout pnlLoginMainLayout = new javax.swing.GroupLayout(pnlLoginMain);
        pnlLoginMain.setLayout(pnlLoginMainLayout);
        pnlLoginMainLayout.setHorizontalGroup(
            pnlLoginMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlLoginMainLayout.setVerticalGroup(
            pnlLoginMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginMainLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlLoginMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLoginMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLoginUserNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLoginUserNameMouseExited
    }//GEN-LAST:event_txtLoginUserNameMouseExited

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        logManager.logInfo("Attempting to log in");
        
        // Login
        if (loginUser()) {
            //Get user id 
            Login.userId = authenticateUser.getUserId(getUserName());
            Login.userName = getUserName();
            //Update status bar
            mainframe.lblStatusBarUser.setText(mainframe.lblStatusBarUser.getText() + " "+ Login.userName);
            //User logged in successfully, launch main window and dispose login window            
            mainframe.setVisible(true);
            
            this.dispose();
            //JOptionPane.showMessageDialog(null,Login.userId,"Nothing!",JOptionPane.INFORMATION_MESSAGE);
        } else {
            //User not logged in
            JOptionPane.showMessageDialog(this, "Username and password you have entered don't match."
                    + "\n Please try again with your username and password", "Login not successful", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLoginCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginCancelActionPerformed
        // Exit login frame if user chooses
    }//GEN-LAST:event_btnLoginCancelActionPerformed

    private boolean loginUser() {
        boolean isUserLoggedIn = false;
        String username = "";
        String password;
        try {
            logManager.logInfo("Getting username");
            username = getUserName();
            logManager.logInfo("Getting password");
            password = getPassword();
            logManager.logInfo("Attempting to authenticate user");
            //Perform authentication
            isUserLoggedIn = authenticateUser.isUserallowedAcess(username, password);
        } catch (Exception exception) {
            //exception.printStackTrace();
            logManager.logError("Exception is thrown and caught");
        }
        return isUserLoggedIn;
    }

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
            for (javax.swing.UIManager.LookAndFeelInfo info :
                    javax.swing.UIManager.getInstalledLookAndFeels()) {
                if (onInterface.getLookAndFeel().equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }

        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLoginCancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel pnlLoginMain;
    private javax.swing.JPasswordField pwdLoginPassword;
    private javax.swing.JTextField txtLoginUserName;
    // End of variables declaration//GEN-END:variables

    private void centerFrame() {
        int xLocation = 0;
        int yLocation = 0;
        //Determine window x location
        logManager.logInfo("Determining X-location");
        xLocation = (centerComponent.getScreenCoordinate().x - width) / 2;
        //Determine window y location
        logManager.logInfo("Determining Y-location");
        yLocation = (centerComponent.getScreenCoordinate().y - height) / 2;
        //Set frame on x,y location
        this.setLocation(xLocation, yLocation);
    }

    private void setFrameSize() {
        logManager.logInfo("Setting frame size");
        this.setSize(width, height);
    }
    //Get values from frame components

    private String getUserName() {
        String userName = "";
        try {
            if (!txtLoginUserName.getText().equals("")) {
                userName = txtLoginUserName.getText();
            } else {
                logManager.logInfo("Usename field is left empty");
                JOptionPane.showMessageDialog(this, "Please insert your username", "Empty Username Field", JOptionPane.WARNING_MESSAGE);
            }

        } catch (Exception exception) {
            //exception.printStackTrace();
            logManager.logError("Exception is thrown and caught");
        }
        return userName;
    }

    private String getPassword() {
        char[] passwordArray = {'\u0000'};
        String password = "";
        try {
            if (!(pwdLoginPassword.getPassword().length == 0)) {
                passwordArray = pwdLoginPassword.getPassword();
                password = new String(passwordArray);
            } else {
                logManager.logWarning("Password field left empty");
                JOptionPane.showMessageDialog(this, "Please insert your password", "Empty Password Field", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception exception) {
            logManager.logError("Exception is thrown and caught");
            //exception.printStackTrace();
        }
        return password;
    }

    private int getUserId(String username) {
        int userId = 0;
        String userName = "";
        try {
            if (!txtLoginUserName.getText().equals("")) {
                userName = txtLoginUserName.getText();
                userId = authenticateUser.getUserId(username);
            } 
        } catch (Exception exception) {
            //exception.printStackTrace();
            logManager.logError("Exception is thrown and caught");
        }
        return userId;
    }
}
