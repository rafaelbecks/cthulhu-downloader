
package youtube;

 // @author rafael

import java.io.*;
import javax.swing.JOptionPane;





public class Tema extends javax.swing.JFrame {
boolean aplicar=false;
    public Tema() {
        initComponents();
        temass.add(tema1);
        temass.add(tema2);
        temass.add(tema3);
        temass.add(tema4);
        temass.add(tema5);
        temass.add(tema6);
       }

          
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        temass = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        t3 = new javax.swing.JLabel();
        t2 = new javax.swing.JLabel();
        t1 = new javax.swing.JLabel();
        tema1 = new javax.swing.JRadioButton();
        tema2 = new javax.swing.JRadioButton();
        tema3 = new javax.swing.JRadioButton();
        info = new javax.swing.JLabel();
        Aplicar = new javax.swing.JButton();
        tema4 = new javax.swing.JRadioButton();
        t4 = new javax.swing.JLabel();
        t5 = new javax.swing.JLabel();
        tema5 = new javax.swing.JRadioButton();
        tema6 = new javax.swing.JRadioButton();
        t6 = new javax.swing.JLabel();

        setTitle("Configuracion de Tema");
        setResizable(false);

        t3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/youtube/thumb3.png"))); // NOI18N

        t2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/youtube/thumb2.jpg"))); // NOI18N

        t1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/youtube/thumb1.jpg"))); // NOI18N

        tema1.setText("Tema 1");

        tema2.setText("Tema 2");

        tema3.setText("Tema 3");

        info.setText("Seleccione su tema y haga click en Aplicar");

        Aplicar.setText("Aplicar");
        Aplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AplicarActionPerformed(evt);
            }
        });

        tema4.setText("Tema 4");

        t4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/youtube/thumb4.jpg"))); // NOI18N

        t5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/youtube/thumb5.jpg"))); // NOI18N

        tema5.setText("Tema 5");

        tema6.setText("Tema 6");

        t6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/youtube/thumb6.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(tema1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tema3)
                        .addGap(18, 18, 18)
                        .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tema2)
                        .addGap(18, 18, 18)
                        .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tema5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tema4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tema6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(info)
                .addGap(160, 160, 160))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Aplicar)
                .addGap(270, 270, 270))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(tema1)
                        .addGap(102, 102, 102)
                        .addComponent(tema2)
                        .addGap(99, 99, 99)
                        .addComponent(tema3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(tema4))
                                    .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(69, 69, 69)
                                .addComponent(tema5)
                                .addGap(102, 102, 102)
                                .addComponent(tema6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(18, 18, 18)
                .addComponent(info)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Aplicar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AplicarActionPerformed
        if (tema1.isSelected()) {
            setTema("back.jpg");
        } else if (tema2.isSelected()) {
            setTema("back2.jpg");
        } else if (tema3.isSelected()) {
            setTema("back3.jpg");
        } else if (tema4.isSelected()) {
            setTema("greenback.jpg");
        } else if (tema5.isSelected()) {
            setTema("blueback.jpg");
        } else if (tema6.isSelected()) {
            setTema("techback.jpg");
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un tema", "Información", 1);
        }
        if (temass.getSelection() != null) {
            JOptionPane.showMessageDialog(null, "Reinicie aplicación para aplicar tema\n   (Archivo -> Reiniciar Aplicación)", "Información", 1);
        }
        this.dispose();
    }//GEN-LAST:event_AplicarActionPerformed

    void setTema(String ntema){
       File tema=null;
       PrintStream pw=null;
       try{
           tema=new File("tema");
           pw=new PrintStream(tema);
           pw.print(ntema);
       }catch(Exception e){
    
    }
       
       }
    
 
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
@Override
            public void run() {
                new Tema().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aplicar;
    private javax.swing.JLabel info;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel t1;
    private javax.swing.JLabel t2;
    private javax.swing.JLabel t3;
    private javax.swing.JLabel t4;
    private javax.swing.JLabel t5;
    private javax.swing.JLabel t6;
    private javax.swing.JRadioButton tema1;
    private javax.swing.JRadioButton tema2;
    private javax.swing.JRadioButton tema3;
    private javax.swing.JRadioButton tema4;
    private javax.swing.JRadioButton tema5;
    private javax.swing.JRadioButton tema6;
    private javax.swing.ButtonGroup temass;
    // End of variables declaration//GEN-END:variables
}
