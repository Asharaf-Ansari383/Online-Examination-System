
package online;
public class Welcome extends javax.swing.JFrame {    
    public Welcome() {
        initComponents();
        setExtendedState(Register.MAXIMIZED_BOTH);
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnGo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Instructions");
        setBackground(new java.awt.Color(204, 0, 204));
        getContentPane().setLayout(null);

        jLabel1.setForeground(new java.awt.Color(51, 255, 51));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 90, 0, 670);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 255, 0));
        jButton1.setText("Go");
        getContentPane().add(jButton1);
        jButton1.setBounds(380, 840, 136, 36);

        btnGo.setBackground(new java.awt.Color(255, 204, 204));
        btnGo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnGo.setForeground(new java.awt.Color(255, 0, 204));
        btnGo.setText("Go");
        btnGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoActionPerformed(evt);
            }
        });
        getContentPane().add(btnGo);
        btnGo.setBounds(500, 340, 130, 40);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 520, 1400, 160);

        jLabel3.setFont(new java.awt.Font("Algerian", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 204));
        jLabel3.setText("Instructions--");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(360, 60, 320, 50);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 51));
        jLabel4.setText("This is  a  Online Test Platform Where You can Test your Knowledge ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(370, 130, 640, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 0));
        jLabel5.setText("of your interesting subjects.This Platform Includes better questions ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(370, 160, 630, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 255, 51));
        jLabel6.setText("Corresponding to your Choosen Subject.");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(370, 200, 590, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Thanks for Joining us.");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(370, 240, 610, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Wish You Happy Coding ! ! !");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(370, 280, 600, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoActionPerformed

        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_btnGoActionPerformed

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
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
