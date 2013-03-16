package youtube;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.datatransfer.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.lang.*;

public class pantalla extends javax.swing.JFrame {
    String theme=temaseleccionado();
    public initpanel background=new initpanel(theme);
    public pantalla() {
        initComponents();
        this.add(background,BorderLayout.CENTER);
        this.pack();
        opciones.add(NQ);
        opciones.add(EA);
        opciones.add(MQ);
        cantidad.add(URL1);
        cantidad.add(URLS);
        URL1.setSelected(true);
        MQ.setSelected(true);       
        
    }
//Lee el archivo tema con el tema seleccionado
    String temaseleccionado(){
        BufferedReader t=null;
        String ts="";
       try{
           t = new BufferedReader(new FileReader("tema"));
             ts=t.readLine();
       }catch(Exception e){
           
       }
         return ts;
    }
    //Construye el comando youtube-dl con las opciones del usuario
    String construircomando(){
    String comando="";
    if(URL1.isSelected()){
    if (NQ.isSelected())
        comando="youtube-dl -t "+url.getText();
    if (EA.isSelected())
        comando="youtube-dl -t --extract-audio --audio-format=mp3 "+url.getText();
    if (MQ.isSelected())
        comando="youtube-dl -t --max-quality=mp4 "+url.getText();
    }
    if (URLS.isSelected()){  
    if (NQ.isSelected())
        comando="youtube-dl -t -a videos.txt";
    if (EA.isSelected())
        comando="youtube-dl -t --extract-audio --audio-format=mp3  -a videos.txt";
    if (MQ.isSelected())
        comando="youtube-dl -t --max-quality=mp4 -a videos.txt";
    }
return comando;
            }
    //Obtiene y muestra por pantalla el título del video a descargar
   class get_title extends Thread{
        @Override
       public void run(){
           String comando="youtube-dl --get-title "+url.getText();
           String nombrevid;
           Process gt;
            try {
                gt = Runtime.getRuntime().exec(comando);
                 BufferedReader salida_descarga = new BufferedReader(new InputStreamReader(
                                        gt.getInputStream()));
                 nombrevid=salida_descarga.readLine();
                 descargainfo.setText("Estás descargando: "+nombrevid);
            } catch (IOException ex) {
                descargainfo.setText("URL no válida");
            }
       }
        
   }
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editar = new javax.swing.JPopupMenu();
        copiar = new javax.swing.JMenuItem();
        pegar = new javax.swing.JMenuItem();
        opciones = new javax.swing.ButtonGroup();
        cantidad = new javax.swing.ButtonGroup();
        jMenuItem1 = new javax.swing.JMenuItem();
        editar1 = new javax.swing.JPopupMenu();
        copiar1 = new javax.swing.JMenuItem();
        pegar1 = new javax.swing.JMenuItem();
        editar2 = new javax.swing.JPopupMenu();
        copiar2 = new javax.swing.JMenuItem();
        pegar2 = new javax.swing.JMenuItem();
        url = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        directorio = new javax.swing.JTextField();
        MostrarNautilus = new javax.swing.JButton();
        URLS = new javax.swing.JRadioButton();
        NQ = new javax.swing.JRadioButton();
        MQ = new javax.swing.JRadioButton();
        EA = new javax.swing.JRadioButton();
        Descargar = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        progress = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cola = new javax.swing.JTextArea();
        URL1 = new javax.swing.JRadioButton();
        descargainfo = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        Archivo = new javax.swing.JMenu();
        nuevo = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        salir = new javax.swing.JMenuItem();
        op = new javax.swing.JMenu();
        temamenuitem = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        About = new javax.swing.JMenu();
        usar = new javax.swing.JMenuItem();
        acercade = new javax.swing.JMenuItem();

        copiar.setText("Copiar");
        copiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copiarActionPerformed(evt);
            }
        });
        editar.add(copiar);

        pegar.setText("Pegar");
        pegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pegarActionPerformed(evt);
            }
        });
        editar.add(pegar);

        jMenuItem1.setText("jMenuItem1");

        copiar1.setText("Copiar");
        copiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copiar1ActionPerformed(evt);
            }
        });
        editar1.add(copiar1);

        pegar1.setText("Pegar");
        pegar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pegar1ActionPerformed(evt);
            }
        });
        editar1.add(pegar1);

        copiar2.setText("Copiar");
        copiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copiar2ActionPerformed(evt);
            }
        });
        editar2.add(copiar2);

        pegar2.setText("Pegar");
        pegar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pegar2ActionPerformed(evt);
            }
        });
        editar2.add(pegar2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cthulhu Downloader");
        setResizable(false);

        url.setComponentPopupMenu(editar);
        url.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                urlFocusLost(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Qlassik Bold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Directorio");

        directorio.setComponentPopupMenu(editar2);

        MostrarNautilus.setFont(new java.awt.Font("Qlassik Bold", 0, 14)); // NOI18N
        MostrarNautilus.setText("Mostrar");
        MostrarNautilus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarNautilusActionPerformed(evt);
            }
        });

        URLS.setFont(new java.awt.Font("Qlassik Bold", 0, 18)); // NOI18N
        URLS.setForeground(new java.awt.Color(254, 254, 254));
        URLS.setText("URL'S");

        NQ.setForeground(new java.awt.Color(254, 254, 254));
        NQ.setText("Calidad Normal");

        MQ.setForeground(new java.awt.Color(254, 254, 254));
        MQ.setText("Máxima Calidad");

        EA.setForeground(new java.awt.Color(254, 254, 254));
        EA.setText("Extraer Audio");

        Descargar.setFont(new java.awt.Font("Qlassik Bold", 0, 18)); // NOI18N
        Descargar.setText("Descargar!");
        Descargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescargarActionPerformed(evt);
            }
        });

        progress.setForeground(new java.awt.Color(254, 254, 254));
        progress.setText("    ");

        cola.setColumns(20);
        cola.setRows(5);
        cola.setComponentPopupMenu(editar1);
        jScrollPane2.setViewportView(cola);

        URL1.setFont(new java.awt.Font("Qlassik Bold", 0, 18)); // NOI18N
        URL1.setForeground(new java.awt.Color(254, 254, 254));
        URL1.setText("URL");

        descargainfo.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        descargainfo.setForeground(new java.awt.Color(254, 254, 254));
        descargainfo.setText("       ");

        Archivo.setText("Archivo");

        nuevo.setText("Nueva descarga (Limpiar)");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });
        Archivo.add(nuevo);

        jMenuItem2.setText("Reiniciar Aplicación");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        Archivo.add(jMenuItem2);

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        Archivo.add(salir);

        MenuBar.add(Archivo);

        op.setText("Opciones");

        temamenuitem.setText("Seleccionar tema");
        temamenuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temamenuitemActionPerformed(evt);
            }
        });
        op.add(temamenuitem);

        jMenuItem3.setText("Actualizar youtube-dl");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        op.add(jMenuItem3);

        MenuBar.add(op);

        About.setText("Ayuda");
        About.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AboutMouseClicked(evt);
            }
        });

        usar.setText("Como usar este programa");
        About.add(usar);

        acercade.setText("Acerca de..");
        acercade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acercadeActionPerformed(evt);
            }
        });
        About.add(acercade);

        MenuBar.add(About);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(URL1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(url)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(directorio, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(MostrarNautilus, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NQ)
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Descargar)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(MQ)
                                        .addGap(27, 27, 27)
                                        .addComponent(EA)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(URLS))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(descargainfo)))
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(progress)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(url, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(URL1))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(directorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MostrarNautilus))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NQ)
                            .addComponent(MQ)
                            .addComponent(EA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Descargar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(descargainfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(URLS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)))
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(progress)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Thread descarga del video
    class descargarvideo extends Thread {
  
        @Override
    public void run(){
        String download=construircomando();
        String salida;
        String error;
        String porcsalida;
        Integer i=0;
        try{
           Process p=Runtime.getRuntime().exec(download);
       
          BufferedReader salida_descarga = new BufferedReader(new InputStreamReader(
                                        p.getInputStream()));
                  BufferedReader error_descarga = new BufferedReader(new InputStreamReader(
                                        p.getErrorStream()));
                  while((salida=salida_descarga.readLine())!=null){
                      progress.setText(salida);
                      i++;
                      jProgressBar1.setIndeterminate(true);
                  }
                  while((error=error_descarga.readLine())!=null){
                      JOptionPane.showMessageDialog(null, error, "ERROR!",0);
                          jProgressBar1.setIndeterminate(false);
                  }
                  if(i>15 && salida_descarga.readLine()==null){
                      JOptionPane.showMessageDialog(null,"Descarga Completa!","Completo!",1);
                    jProgressBar1.setIndeterminate(false);
                    jProgressBar1.setValue(100);
        }
       }catch(Exception e){
           
       }
      
          
        }
}
//Ejecuta comando nautilus + directorio
    class nautilus extends Thread {
    @Override
        public void run(){
        String comandodir="nautilus "+directorio.getText();
            try {
                Process p=Runtime.getRuntime().exec(comandodir);
            } catch (IOException ex) {
                Logger.getLogger(pantalla.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    }
    //Crea el archivo videos.txt y escribe la cola
    class colafile extends Thread {
        //Función para obtener el título de los videos de la cola
        String get_title_cola(String url){
       String comando="youtube-dl --get-title "+url;
       String nombvid = null;
       Process gt;
            try {
                gt = Runtime.getRuntime().exec(comando);
                 BufferedReader salida_descarga = new BufferedReader(new InputStreamReader(
                                        gt.getInputStream()));
                 nombvid=salida_descarga.readLine();
                 
            } catch (IOException e) {
                System.out.println("URL no válida");
            }
       return nombvid;
        }
        @Override
        public void run(){
            File archivocola = null;
            PrintStream pw= null;   
            BufferedReader entrada;
            String lineas="",nombrevid,t="Estás Descargando:\n";
            try {
                archivocola = new File("videos.txt");
                pw=new PrintStream(archivocola);
                pw.print(cola.getText());
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null,"Error al escribir archivo!");
                }
         ////////
          try {
                
                       entrada = new BufferedReader(new FileReader(archivocola));
                        while(entrada.ready()){
                        lineas=entrada.readLine();
                        nombrevid= get_title_cola(lineas);
                        t=t+nombrevid+"\n";
                        
                        }
                        cola.setText(t);
            } catch (IOException ex) {
                Logger.getLogger(pantalla.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
    }
    
   void copiarclipboard(String copy){
      Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection urlcopy = new StringSelection(copy);
        cb.setContents(urlcopy, urlcopy);
   }
   void pegarclipboard(JTextField lugarpegar) {
      Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
      Transferable copy = cb.getContents(this);
      DataFlavor dataFlavorStringJava = null;
      String texto = null;
        try {
            dataFlavorStringJava = new DataFlavor("application/x-java-serialized-object; class=java.lang.String");
                if (copy.isDataFlavorSupported(dataFlavorStringJava))
                texto = (String) copy.getTransferData(dataFlavorStringJava);
                } catch (Exception ex) {
                Logger.getLogger(pantalla.class.getName()).log(Level.SEVERE, null, ex);
            }
         lugarpegar.setText(texto);
        }   
   
   void pegarclipboard(JTextArea lugarpegar) {
      Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
      Transferable copy = cb.getContents(this);
      DataFlavor dataFlavorStringJava = null;
      String texto = null;
        try {
            dataFlavorStringJava = new DataFlavor("application/x-java-serialized-object; class=java.lang.String");
                if (copy.isDataFlavorSupported(dataFlavorStringJava))
                texto = (String) copy.getTransferData(dataFlavorStringJava);
                } catch (Exception ex) {
                Logger.getLogger(pantalla.class.getName()).log(Level.SEVERE, null, ex);
            }
         lugarpegar.setText(texto);
        }   
   
       //Ejecuta el hilo del nautilus con direccion del textfield
    private void MostrarNautilusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarNautilusActionPerformed
        Thread nautilushilo = new nautilus();
        nautilushilo.start();
    }//GEN-LAST:event_MostrarNautilusActionPerformed

    //Boton descarga
    private void DescargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescargarActionPerformed
        Thread hilo = new descargarvideo();
        Thread hilofile = new colafile();
        Thread hilogt= new get_title();
        if (URL1.isSelected())
            if (!"".equals(url.getText())){
                hilo.start();
            hilogt.start();
            }
            else 
                JOptionPane.showMessageDialog(null, "Debes ingresar alguna URL!", "ERROR", 0);
        if (URLS.isSelected()) {
           if(!"".equals(cola.getText())){
            hilofile.start();
           hilo.start();
           }
        else
               JOptionPane.showMessageDialog(null, "Debes ingresar alguna URL a la cola!", "Error", 0);
        }
    }//GEN-LAST:event_DescargarActionPerformed

    private void AboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutMouseClicked
   
    }//GEN-LAST:event_AboutMouseClicked

    private void temamenuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temamenuitemActionPerformed
        Tema themes= new Tema();
        themes.setVisible(true);
        themes.setLocationRelativeTo(null);
    }//GEN-LAST:event_temamenuitemActionPerformed

    private void copiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copiarActionPerformed
    copiarclipboard(url.getSelectedText());
    }//GEN-LAST:event_copiarActionPerformed

    private void pegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pegarActionPerformed
     pegarclipboard(url);
    }//GEN-LAST:event_pegarActionPerformed

    private void copiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copiar1ActionPerformed
  copiarclipboard(cola.getSelectedText());
    }//GEN-LAST:event_copiar1ActionPerformed

    private void pegar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pegar1ActionPerformed
    pegarclipboard(cola);
    }//GEN-LAST:event_pegar1ActionPerformed

    private void acercadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acercadeActionPerformed
About acercade=new About();
acercade.setVisible(true);
acercade.setLocationRelativeTo(null);
    }//GEN-LAST:event_acercadeActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        url.setText(" ");
        cola.setText(" ");
        directorio.setText(" ");
        descargainfo.setText(" ");
        progress.setText(" ");
    }//GEN-LAST:event_nuevoActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void copiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copiar2ActionPerformed
        copiarclipboard(directorio.getSelectedText());
    }//GEN-LAST:event_copiar2ActionPerformed

    private void pegar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pegar2ActionPerformed
        pegarclipboard(directorio);
    }//GEN-LAST:event_pegar2ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.dispose();
        pantalla p=new pantalla();
        p.setVisible(true);
        p.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void urlFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_urlFocusLost
  

    }//GEN-LAST:event_urlFocusLost

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       Update act=new Update();
       act.setVisible(true);
       act.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

   
    public static void main(String args[]) {
        
        try {
    for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
            UIManager.setLookAndFeel(info.getClassName());
            break;
        }
    }
} catch (UnsupportedLookAndFeelException e) {
  
} catch (ClassNotFoundException e) {
  
} catch (InstantiationException e) {
  
} catch (IllegalAccessException e) {
  
}
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                pantalla init =new pantalla();
                init.setVisible(true);
                init.setLocationRelativeTo(null);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu About;
    private javax.swing.JMenu Archivo;
    private javax.swing.JButton Descargar;
    private javax.swing.JRadioButton EA;
    private javax.swing.JRadioButton MQ;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JButton MostrarNautilus;
    private javax.swing.JRadioButton NQ;
    private javax.swing.JRadioButton URL1;
    private javax.swing.JRadioButton URLS;
    private javax.swing.JMenuItem acercade;
    private javax.swing.ButtonGroup cantidad;
    private javax.swing.JTextArea cola;
    private javax.swing.JMenuItem copiar;
    private javax.swing.JMenuItem copiar1;
    private javax.swing.JMenuItem copiar2;
    private javax.swing.JLabel descargainfo;
    private javax.swing.JTextField directorio;
    private javax.swing.JPopupMenu editar;
    private javax.swing.JPopupMenu editar1;
    private javax.swing.JPopupMenu editar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem nuevo;
    private javax.swing.JMenu op;
    private javax.swing.ButtonGroup opciones;
    private javax.swing.JMenuItem pegar;
    private javax.swing.JMenuItem pegar1;
    private javax.swing.JMenuItem pegar2;
    private javax.swing.JLabel progress;
    private javax.swing.JMenuItem salir;
    private javax.swing.JMenuItem temamenuitem;
    private javax.swing.JTextField url;
    private javax.swing.JMenuItem usar;
    // End of variables declaration//GEN-END:variables
}
