package online;
import java.sql.*;
import javax.swing.*;
public class Login extends javax.swing.JFrame {
 
   static String str2;
   static  public int c = 0;
    public Login() {
        initComponents();
        setExtendedState(Login.MAXIMIZED_BOTH);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pfPassword = new javax.swing.JPasswordField();
        btnRegister = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Page");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 255));
        jLabel1.setText("Welcome to Login");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(510, 30, 350, 39);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 204));
        jLabel2.setText("USER ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(460, 180, 137, 38);

        txtUsername.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtUsername);
        txtUsername.setBounds(610, 180, 300, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 204));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(460, 280, 92, 27);

        pfPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(pfPassword);
        pfPassword.setBounds(610, 280, 300, 40);

        btnRegister.setBackground(new java.awt.Color(102, 255, 0));
        btnRegister.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRegister.setText("REGISTER");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegister);
        btnRegister.setBounds(770, 380, 130, 30);

        btnLogin.setBackground(new java.awt.Color(255, 0, 0));
        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(580, 380, 130, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon("E:\\kapil show\\KAPIL SHOW VIDEO\\439741.jpg")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-20, -60, 1550, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed

        dispose();
        new Register().setVisible(true);
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

         String pass,id,str;
         id   = txtUsername.getText();
         pass = pfPassword.getText();
         Connection conn = null;
         PreparedStatement pst = null;
         ResultSet rs = null;
         String sql ="Select * from sdata where Email_id =  ? and password = ?";
        try{
              Class.forName("com.mysql.cj.jdbc.Driver");
              conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/oedetail","root","*#@$786asharaf");
              pst = conn.prepareStatement(sql);
              pst.setString(1,id);
              pst.setString(2,pass);
              rs = pst.executeQuery();
                   if(rs.next())
                   {
                      dispose();
                      String str3 = ("Select FName from sdata where Password = '"+pass+"' ");
                      try{  
                               pst = conn.prepareStatement(str3);
                               rs = pst.executeQuery();
                               while(rs.next())
                               {
                                  str2 = rs.getString("FName");
                                  c++;
                               }
                      }
                      catch(Exception e)
                      {
                         JOptionPane.showMessageDialog(null,e);
                      }
                   }
                   else
                   {
                       JOptionPane.showMessageDialog(null," Invalid Uesr !!!");
                       dispose();
                       new Login().setVisible(true);
                   }                  
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            try{
            conn.close();
            pst.close();
            rs.close();
            }
            catch(Exception g)
            {
                
            }
        } 
        dispose(); 
       new OnlineTest().setVisible(true);
    }//GEN-LAST:event_btnLoginActionPerformed

    
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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}

