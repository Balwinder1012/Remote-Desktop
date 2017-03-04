
import Client.test;
import Client.Authenticate;
import Client.ReceiveScreen;
import Server.InitConnection;
import java.awt.AWTException;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.AccessibleRole;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;




public class Login extends javax.swing.JFrame {
public static String ip;

 
    public Login() {
        initComponents();
        server_userpanel.setEnabled(false);
        
        Reg_page.setVisible(false);
       client_userpanel.setVisible(false);
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login_page = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        User_name = new javax.swing.JTextField();
        Sign_in = new javax.swing.JButton();
        Sign_up = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        chk = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        Reg_page = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        add = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        rpwd = new javax.swing.JPasswordField();
        pwd = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        client_userpanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        portc = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        ipc = new javax.swing.JTextField();
        logout = new javax.swing.JButton();
        passwordcp = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        server_userpanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        portp = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        logout1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        passwordp = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Login_page.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Password");
        Login_page.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 100, 30));

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("UserName");
        Login_page.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 100, 30));

        User_name.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        User_name.setForeground(new java.awt.Color(153, 153, 153));
        User_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                User_nameActionPerformed(evt);
            }
        });
        User_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                User_nameKeyPressed(evt);
            }
        });
        Login_page.add(User_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 150, 30));

        Sign_in.setFont(new java.awt.Font("Monotype Corsiva", 1, 14)); // NOI18N
        Sign_in.setForeground(new java.awt.Color(153, 153, 153));
        Sign_in.setText("Sign In");
        Sign_in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sign_inActionPerformed(evt);
            }
        });
        Login_page.add(Sign_in, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, -1, 20));

        Sign_up.setFont(new java.awt.Font("Monotype Corsiva", 1, 14)); // NOI18N
        Sign_up.setForeground(new java.awt.Color(153, 153, 153));
        Sign_up.setText("Sign Up");
        Sign_up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sign_upActionPerformed(evt);
            }
        });
        Login_page.add(Sign_up, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 80, 20));

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Login Page");
        Login_page.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 260, 60));

        Password.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PasswordKeyPressed(evt);
            }
        });
        Login_page.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 150, 30));

        chk.setFont(new java.awt.Font("Monotype Corsiva", 1, 12)); // NOI18N
        chk.setForeground(new java.awt.Color(153, 153, 153));
        chk.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Client", "Server" }));
        chk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkActionPerformed(evt);
            }
        });
        Login_page.add(chk, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 150, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/r.jpg"))); // NOI18N
        Login_page.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 460));

        Reg_page.setPreferredSize(new java.awt.Dimension(740, 460));
        Reg_page.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Registration");
        Reg_page.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 310, 70));

        jLabel8.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Re-Enter");
        Reg_page.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 120, 30));

        jLabel9.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Name");
        Reg_page.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 120, 30));

        jLabel11.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("Address");
        Reg_page.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 120, 30));

        jLabel10.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("UserName");
        Reg_page.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 120, 30));

        username.setFont(new java.awt.Font("Monotype Corsiva", 1, 14)); // NOI18N
        username.setForeground(new java.awt.Color(153, 153, 153));
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        Reg_page.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 160, 30));

        add.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        add.setForeground(new java.awt.Color(153, 153, 153));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        Reg_page.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 160, -1));

        name.setFont(new java.awt.Font("Monotype Corsiva", 1, 14)); // NOI18N
        name.setForeground(new java.awt.Color(153, 153, 153));
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        Reg_page.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 160, 30));

        rpwd.setFont(new java.awt.Font("Monotype Corsiva", 0, 14)); // NOI18N
        rpwd.setForeground(new java.awt.Color(153, 153, 153));
        rpwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rpwdActionPerformed(evt);
            }
        });
        Reg_page.add(rpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 160, 30));

        pwd.setFont(new java.awt.Font("Monotype Corsiva", 0, 14)); // NOI18N
        pwd.setForeground(new java.awt.Color(153, 153, 153));
        Reg_page.add(pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 160, 30));

        jLabel12.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("Password");
        Reg_page.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 120, 30));

        jButton2.setFont(new java.awt.Font("Monotype Corsiva", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 153, 153));
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Reg_page.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/final.jpg"))); // NOI18N
        Reg_page.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 460));

        client_userpanel.setPreferredSize(new java.awt.Dimension(740, 460));

        jLabel15.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 51));
        jLabel15.setText("Port No");

        portc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portcActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 102, 51));

        jButton1.setFont(new java.awt.Font("Monotype Corsiva", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 51));
        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 102, 51));
        jLabel16.setText("IP");

        ipc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipcActionPerformed(evt);
            }
        });

        logout.setFont(new java.awt.Font("Monotype Corsiva", 1, 14)); // NOI18N
        logout.setForeground(new java.awt.Color(0, 102, 0));
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 102, 51));
        jLabel18.setText("Password");

        jButton4.setText("Stop");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logout, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(portc, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(ipc, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(passwordcp))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(portc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ipc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(passwordcp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1)
                                    .addComponent(jLabel18)))
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(logout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 306, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout client_userpanelLayout = new javax.swing.GroupLayout(client_userpanel);
        client_userpanel.setLayout(client_userpanelLayout);
        client_userpanelLayout.setHorizontalGroup(
            client_userpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        client_userpanelLayout.setVerticalGroup(
            client_userpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(client_userpanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel13.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 51));

        jLabel14.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 51));
        jLabel14.setText("Port No");

        logout1.setFont(new java.awt.Font("Monotype Corsiva", 1, 14)); // NOI18N
        logout1.setForeground(new java.awt.Color(0, 102, 0));
        logout1.setText("Logout");
        logout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout1ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 102, 51));
        jLabel19.setText("Password");

        passwordp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordpActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Monotype Corsiva", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 102, 51));
        jButton3.setText("Next");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Monotype Corsiva", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 102, 51));
        jButton5.setText("stop");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(portp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(logout1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(31, 31, 31))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(logout1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(portp, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(passwordp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 713, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 262, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout server_userpanelLayout = new javax.swing.GroupLayout(server_userpanel);
        server_userpanel.setLayout(server_userpanelLayout);
        server_userpanelLayout.setHorizontalGroup(
            server_userpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        server_userpanelLayout.setVerticalGroup(
            server_userpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(server_userpanelLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login_page, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(Reg_page, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(client_userpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(server_userpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login_page, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(Reg_page, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 17, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(client_userpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(server_userpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void User_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_User_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_User_nameActionPerformed

    private void Sign_inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sign_inActionPerformed

       

        String ck=(String) chk.getSelectedItem();
       
        
        
        
            
        
        
        try {
            String check="";
            Class.forName("com.mysql.jdbc.Driver");
        
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/r_desktop", "root", "");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select Password from project where Username='" + User_name.getText() + "'");
                     
            rs.next();
            check = rs.getString(1);
            
            
             
                
            
            
              
            
            
            if(check.equals(Password.getText()) ){
                System.out.println(""+check);
             
             stmt.executeUpdate("update project set Status='true' where Username='"+ User_name.getText()+"'");
             switch(ck)
             {
                 case  "Server":
                     
        Reg_page.setVisible(false);
        client_userpanel.setVisible(false);
       
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
       
       
                     
                     Login_page.setVisible(false);
                     server_userpanel.setVisible(true);
                    
                     jPanel3.setVisible(true);
                     jLabel13.setText("Welcome "+User_name.getText());
                     jPanel3.add(jLabel13);
                     jPanel4.setVisible(true);

                     break;
                     
                 case "Client":
                    Reg_page.setVisible(false);
        client_userpanel.setVisible(false);
       
        jPanel4.setVisible(false);
          jPanel3.setVisible(false);
                      Login_page.setVisible(false);
                     client_userpanel.setVisible(true);
                     jPanel1.setVisible(true);
                     jPanel2.setVisible(true);
                     jLabel17.setText("Welcome "+User_name.getText());
                     jPanel1.add(jLabel17);
                     break;
             
             }   
                    
                
               
            
            }
            else{
                
                
            JOptionPane.showMessageDialog(rootPane,"Wrong Inputs");
            
           User_name.setText("");
           Password.setText("");
           
            
            }
        } 
        catch (Exception ex) {
            System.err.println(""+ex);
       }
            

    }//GEN-LAST:event_Sign_inActionPerformed

    private void Sign_upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sign_upActionPerformed
        Login_page.setVisible(false);  
        Reg_page.setVisible(true);
        client_userpanel.setVisible(false);
       
            
            
            
    }//GEN-LAST:event_Sign_upActionPerformed

    private void User_nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_User_nameKeyPressed
     
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
      {
          
      }
    }//GEN-LAST:event_User_nameKeyPressed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addActionPerformed

    private void rpwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rpwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rpwdActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String u = username.getText();
        String n= name.getText();
  
        String p = pwd.getText();
        String a = add.getText();
        
        if(p.length()>=8 && u.length()>=8)
        {
        
        if(pwd.getText().equals(rpwd.getText())){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/r_desktop", "root", "");
            Statement stmt = conn.createStatement();
            
            stmt.executeUpdate("insert into project (Name , Username , Password , Address,Status ) values( '"+n+"','"+u+"','"+p+"','"+a+"','false')");
            JOptionPane.showMessageDialog(this,"Registerd Sucessfully");
            username.setText("");
            name.setText("");
            pwd.setText("");
            rpwd.setText("");
            add.setText("");
            Reg_page.setVisible(false);
            Login_page.setVisible(true);
            
            
        }
        catch(Exception e){System.err.println(""+e);}
        }
        else
            JOptionPane.showMessageDialog(null," Passwords entered are not identical, try again");
       
        }
        else
        {
        
            if(p.length()<8 && u.length()<8){JOptionPane.showMessageDialog(null,"Inappropriate username and password's length");
           }
            else if(p.length()<8){JOptionPane.showMessageDialog(null,"Inappropriate password's length");
            }
            
            else 
            {
                JOptionPane.showMessageDialog(null,"Inappropriate username's length");
              
            }
            username.setText("");
            pwd.setText("");
            rpwd.setText("");
        }
    }//GEN-LAST:event_jButton2ActionPerformed
  
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 ip=ipc.getText();
       
       
        new Thread(){
         Display d=new Display();
         
          @Override
          public void run() {
             
        
                
        try {
             d.setVisible(true);
            String ipa=ipc.getText();
            int port=Integer.parseInt(portc.getText());
            String password=passwordcp.getText();
            
            
            Socket sc = new Socket(ipa,port);
            System.out.println("Connecting to the Server");
            Authenticate frame1= new Authenticate(sc,password,d.display1);
            d.setVisible(true);
            
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
          
          }
      }.start();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void chkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkActionPerformed

    private void PasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordKeyPressed

if(evt.getKeyCode()==KeyEvent.VK_ENTER) 
{

}
// TODO add your handling code here:
    }//GEN-LAST:event_PasswordKeyPressed

    private void portcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_portcActionPerformed

    private void ipcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ipcActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
        client_userpanel.setVisible(false);
        Login_page.setVisible(true);
        User_name.setText("");
        Password.setText("");
        try {
            Class.forName("com.mysql.jdbc.Driver");
         
        
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/r_desktop", "root", "");
            Statement stmt = conn.createStatement();
        stmt.executeUpdate("update project set Status='false' ");

        
        }
        catch (Exception ex){System.err.println(""+ex);}
    }//GEN-LAST:event_logoutActionPerformed

    private void passwordpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordpActionPerformed

    private void logout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout1ActionPerformed
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
        server_userpanel.setVisible(false);
        Login_page.setVisible(true);
        User_name.setText("");
        Password.setText("");
        test.n=false;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/r_desktop", "root", "");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("update project set Status='false' ");

        }
        catch (Exception ex){System.err.println(""+ex);}
    }//GEN-LAST:event_logout1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        new Thread(){

            @Override
            public void run() {
                String password=passwordp.getText();
                String port=portp.getText();
                new InitConnection(Integer.parseInt(port),password);
            }
        }.start();
        test.main(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      InitConnection.st=false;
     new Display().setVisible(false);
      
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    try {
        java.awt.Robot r=new java.awt.Robot();
        r.keyRelease(java.awt.event.KeyEvent.VK_ALT);
         r.keyRelease(java.awt.event.KeyEvent.VK_SHIFT);
          r.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
           r.keyRelease(java.awt.event.KeyEvent.VK_WINDOWS);
            r.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
             r.keyRelease(java.awt.event.KeyEvent.VK_BACK_SPACE);
        test.n=false;
        ReceiveScreen.continueb=false;  // TODO add your handling code here:
    } catch (AWTException ex) {
        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton5ActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Login_page;
    private javax.swing.JPasswordField Password;
    private javax.swing.JPanel Reg_page;
    private javax.swing.JButton Sign_in;
    private javax.swing.JButton Sign_up;
    private javax.swing.JTextField User_name;
    private javax.swing.JTextField add;
    private javax.swing.JComboBox chk;
    private javax.swing.JPanel client_userpanel;
    private javax.swing.JTextField ipc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton logout;
    private javax.swing.JButton logout1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField passwordcp;
    private javax.swing.JPasswordField passwordp;
    private javax.swing.JTextField portc;
    private javax.swing.JTextField portp;
    private javax.swing.JPasswordField pwd;
    private javax.swing.JPasswordField rpwd;
    private javax.swing.JPanel server_userpanel;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
