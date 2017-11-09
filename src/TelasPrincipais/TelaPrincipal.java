package TelasPrincipais;

import java.awt.Image;
import javax.swing.ImageIcon;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
        
        int num = 1;
        while(true){
        num++;
        if(num % 2 == 0){
            ImageIcon imagemI = new ImageIcon(TelaLogin.class.getResource("/images/usuario-icone.png"));
            Image img = imagemI.getImage().getScaledInstance(magem1.getWidth(), magem1.getHeight(), Image.SCALE_DEFAULT);
            magem1.setIcon(new ImageIcon(img));
        }
        
        if(num % 2 ==1){
            ImageIcon imagemI = new ImageIcon(TelaLogin.class.getResource("/images/redes.jpg"));
            Image img = imagemI.getImage().getScaledInstance(magem1.getWidth(), magem1.getHeight(), Image.SCALE_DEFAULT);
            magem1.setIcon(new ImageIcon(img));
        }
        }    
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        magem1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(magem1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(289, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(magem1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel magem1;
    // End of variables declaration//GEN-END:variables
}
