package TelasPrincipais;

import java.awt.Image;
import javax.swing.ImageIcon;

public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
        
        ImageIcon imagemI = new ImageIcon(TelaLogin.class.getResource("/images/redes.jpg"));
        Image img = imagemI.getImage().getScaledInstance(iconeIn.getWidth(), iconeIn.getHeight(), Image.SCALE_DEFAULT);
        iconeIn.setIcon(new ImageIcon(img));
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btEntrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txNome = new javax.swing.JTextField();
        iconeIn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TesteAulas");
        setAutoRequestFocus(false);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btEntrar.setFont(new java.awt.Font("Arial Narrow", 2, 18)); // NOI18N
        btEntrar.setText("Entrar");
        btEntrar.setToolTipText("Click aqui para entrar");
        btEntrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 460, 90, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 70)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Redes de Computadores");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        txNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 220, -1));
        getContentPane().add(iconeIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNomeActionPerformed
        String nome = txNome.getText();
        this.dispose();
        TelaPrincipal tprinc = new TelaPrincipal();
        tprinc.setExtendedState(MAXIMIZED_BOTH);
        tprinc.setVisible(true);
        
        
    }//GEN-LAST:event_txNomeActionPerformed

    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarActionPerformed
        String nome = txNome.getText();
        this.dispose();
        TelaPrincipal tprinc = new TelaPrincipal();
        tprinc.setExtendedState(MAXIMIZED_BOTH);
        tprinc.setVisible(true);
        tprinc.trocar();
        
    }//GEN-LAST:event_btEntrarActionPerformed

    
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEntrar;
    private javax.swing.JLabel iconeIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txNome;
    // End of variables declaration//GEN-END:variables
}