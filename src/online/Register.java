
package online;
import java.sql.*;

public class Register extends javax.swing.JFrame {
    
    static String str2 ;
    public Register() {
        initComponents();
        setExtendedState(Register.MAXIMIZED_BOTH);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFname = new javax.swing.JTextField();
        txtLname = new javax.swing.JTextField();
        txtMailid = new javax.swing.JTextField();
        txtInstitute = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        pfPassword = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Register Page");
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 0, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 204));
        jLabel1.setText("Last Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(392, 194, 225, 24);

        jLabel2.setBackground(new java.awt.Color(255, 0, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 255));
        jLabel2.setText("Mail-ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(392, 259, 225, 28);

        jLabel3.setBackground(new java.awt.Color(255, 0, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 204));
        jLabel3.setText("First Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(392, 135, 180, 22);

        jLabel4.setBackground(new java.awt.Color(255, 51, 204));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 204));
        jLabel4.setText("Password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(392, 331, 225, 24);

        jLabel5.setBackground(new java.awt.Color(255, 0, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 204));
        jLabel5.setText("Institute Name");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(392, 402, 225, 30);
        getContentPane().add(txtFname);
        txtFname.setBounds(621, 133, 278, 32);
        getContentPane().add(txtLname);
        txtLname.setBounds(621, 193, 278, 32);
        getContentPane().add(txtMailid);
        txtMailid.setBounds(621, 262, 278, 28);
        getContentPane().add(txtInstitute);
        txtInstitute.setBounds(621, 405, 278, 30);

        jLabel6.setBackground(new java.awt.Color(255, 0, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 204));
        jLabel6.setText("Welcome  To Register Page -");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(537, 0, 428, 61);

        btnCreate.setBackground(new java.awt.Color(51, 255, 51));
        btnCreate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 0, 255));
        btnCreate.setText("CREATE");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        getContentPane().add(btnCreate);
        btnCreate.setBounds(621, 475, 108, 32);

        btnCancel.setBackground(new java.awt.Color(102, 255, 0));
        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 0, 204));
        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(809, 475, 108, 32);
        getContentPane().add(pfPassword);
        pfPassword.setBounds(620, 330, 280, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon("E:\\kapil show\\KAPIL SHOW VIDEO\\46714.jpg")); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 1370, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
       
        Statement stmt = null;
        Connection conn= null;
        ResultSet  rs = null;
        try
        {
              Class.forName("com.mysql.cj.jdbc.Driver");
              conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/oedetail","root","*#@$786asharaf");
              stmt = conn.createStatement();
              String sql;
              String Fname,Lname,Email,password,institute;
              Fname = txtFname.getText();
              Lname = txtLname.getText();
              Email = txtMailid.getText();
              password = pfPassword.getText();
              institute = txtInstitute.getText();
              sql = "INSERT INTO sdata(FName,LName,Email_id,password,Institute) VALUES('"+Fname+"','"+Lname+"','"+Email+"','"+password+"','"+institute+"')";
              int res;
              res = stmt.executeUpdate(sql);
              stmt.close();
              str2 = Fname;
              dispose();
        new OnlineTest().setVisible(true);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
       finally
        {
            if(conn!=null)
                try {
                      conn.close();
                     } 
                 catch (SQLException ex) {
               
            }
        }          
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed

        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_btnCancelActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtInstitute;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtMailid;
    // End of variables declaration//GEN-END:variables
}
