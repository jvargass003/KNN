package Programa;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author jessi
 */

import java.util.Random;
import java.awt.Graphics;
import java.awt.Color;
import Programa.Poblacion;
import Programa.Individuo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class Interfaz extends javax.swing.JFrame implements MouseListener {
    
    Random random = new Random();
    Poblacion pob;
    //int size = random.nextInt(500)+1;
    int size = 500;
    int x,y,ancho,largo,xn,yn,click,num;
    boolean nuevo = true;
    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
        btnClasificar.setEnabled(false);
        textClases.setEnabled(false);
        btnClasificador.setEnabled(false);
        textVecinos.setEnabled(false);
        //textVecinos.setEditable(false);
        x = (int) jpanelGrafica.getLocation().getX();
        y = (int) jpanelGrafica.getLocation().getY();
        ancho = (int) jpanelGrafica.getSize().getWidth();
        largo = (int) jpanelGrafica.getSize().getHeight();
        
    }   
    public void paintComponent(Graphics g) {
        
        g.drawOval(6, 6, 6, 6);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jpanelGrafica = new javax.swing.JPanel();
        btnGenerar = new javax.swing.JButton();
        labelNoClases = new javax.swing.JLabel();
        textClases = new javax.swing.JTextField();
        btnClasificar = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        btnClasificador = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        textVecinos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);

        Panel.setBackground(new java.awt.Color(255, 255, 255));

        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jpanelGrafica.setBackground(new java.awt.Color(255, 255, 255));
        jpanelGrafica.setPreferredSize(new java.awt.Dimension(400, 400));

        javax.swing.GroupLayout jpanelGraficaLayout = new javax.swing.GroupLayout(jpanelGrafica);
        jpanelGrafica.setLayout(jpanelGraficaLayout);
        jpanelGraficaLayout.setHorizontalGroup(
            jpanelGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jpanelGraficaLayout.setVerticalGroup(
            jpanelGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        btnGenerar.setText("GENERAR PUNTOS");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        labelNoClases.setText("NÚMERO DE CLASES (2 a 5)");

        textClases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textClasesActionPerformed(evt);
            }
        });
        textClases.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textClasesKeyTyped(evt);
            }
        });

        btnClasificar.setText("CLASIFICAR PUNTOS");
        btnClasificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClasificarActionPerformed(evt);
            }
        });

        btnReiniciar.setText("REINICIAR");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        btnClasificador.setText("CLASIFICADOR");
        btnClasificador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClasificadorActionPerformed(evt);
            }
        });

        jLabel1.setText("NÚMERO DE VECINOS");

        textVecinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textVecinosActionPerformed(evt);
            }
        });
        textVecinos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textVecinosKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jpanelGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnReiniciar)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnClasificar)
                            .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNoClases)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(textClases, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(btnClasificador)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(textVecinos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelNoClases)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textClases, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClasificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textVecinos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClasificador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnReiniciar))
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jpanelGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
        
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed

        this.pob = new Poblacion(x,ancho,y,largo,size);       
        
        Graphics g = this.getGraphics();
        g.drawLine((ancho/2)+x,y,(ancho/2)+x,y+largo);
        g.drawLine(x,y+(largo/2),ancho+x,y+(largo/2));
        
        
        for(int i=0; i<size;i++){
            int coordenada[] = pob.getCoordena(i);
            g.drawRect(coordenada[0], coordenada[1],3,3);
        }
        
        
        btnGenerar.setEnabled(false);
        textClases.setEnabled(true);
       
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void textClasesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textClasesKeyTyped
    int key = evt.getKeyChar();

    boolean numeros = key >= 49 && key <= 53;
        
    if (!numeros)
    {
        evt.consume();
        btnClasificar.setEnabled(true);
    }
    else{
        btnClasificar.setEnabled(false);
    }

    if (textClases.getText().trim().length() == 1) {
        evt.consume();
        btnClasificar.setEnabled(true);
    }
    else{
        btnClasificar.setEnabled(false);
    }
    }//GEN-LAST:event_textClasesKeyTyped

    private void btnClasificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClasificarActionPerformed
        try{
        if(Integer.parseInt(textClases.getText())<size){
            Graphics g = this.getGraphics();
            num = Integer.parseInt(textClases.getText());
            int index[]= new int[num];
            for(int i=0; i<num; i++){
                index[i] = random.nextInt(size);
                System.out.print("\n"+index[i]);
            }

            ArrayList<Individuo> individuos = this.pob.getIndividuos();
            for(int i=0; i<size;i++){
                ArrayList<Float> distancias = new ArrayList<Float>();
                int ind[] = individuos.get(i).getCoordena();

                System.out.print("\nIndividuo "+ i+" X: "+ind[0]+" Y: "+ind[1]);
                 for(int m=0;m<num;m++){
                     int indx[] = individuos.get(index[m]).getCoordena();
                     float x = (float) Math.pow((ind[0])-(indx[0]),2); 
                     float y = (float) Math.pow((ind[1])-(indx[1]),2);
                     float distancia = (float) Math.sqrt(x+y);
                     distancias.add(distancia);
                     System.out.print("\nIndividuo: "+index[m]+" X: "+indx[0]+" Y: "+indx[1]);
                     System.out.print("\nDistancia " + m +": " + distancias.get(m));
                 } 

                 int idx = distancias.indexOf(Collections.min(distancias));
                 System.out.print("\n\nMenor Distancia: "+Collections.min(distancias)+"\n");
                 individuos.get(i).setClase(idx);
                 switch(idx){
                     case 0:
                         g.setColor(Color.BLUE);
                     break;
                      case 1:
                         g.setColor(Color.GREEN);
                     break;
                      case 2:
                         g.setColor(Color.RED);
                     break;
                      case 3:
                         g.setColor(Color.ORANGE);
                     break;
                      case 4:
                         g.setColor(Color.MAGENTA);
                     break;

                 }
                 int coordenada[] = pob.getCoordena(i);
                 g.drawRect(coordenada[0], coordenada[1], 3,3);
            }

            btnClasificar.setEnabled(false);
            textClases.setText(null);
            nuevo = true;
            addMouseListener(this);
        }
        else{
            JOptionPane.showMessageDialog(null, "No es posible, el número de clasificaciones es mayor a la población");
        
        }
        }
        catch(IndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "Tienes un punto sin clasificar");
        }
     
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClasificarActionPerformed

    private void textClasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textClasesActionPerformed

    // TODO add your handling code here:
    }//GEN-LAST:event_textClasesActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
       btnGenerar.setEnabled(true);
                jpanelGrafica.setBackground(new java.awt.Color(255, 255, 255));
        jpanelGrafica.setPreferredSize(new java.awt.Dimension(400, 400));

        javax.swing.GroupLayout jpanelGraficaLayout = new javax.swing.GroupLayout(jpanelGrafica);
        jpanelGrafica.setLayout(jpanelGraficaLayout);
        jpanelGraficaLayout.setHorizontalGroup(
            jpanelGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jpanelGraficaLayout.setVerticalGroup(
            jpanelGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );
        nuevo = false;
        size = 100;
        textVecinos.setText(null);
        this.setLocationRelativeTo(null);
        btnClasificar.setEnabled(false);
        textClases.setEnabled(false);
        btnClasificador.setEnabled(false);
        textVecinos.setEnabled(false);
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btnClasificadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClasificadorActionPerformed
        if(!"".equals(textVecinos.getText())){
        if(Integer.parseInt(textVecinos.getText())<=size & Integer.parseInt(textVecinos.getText())>0 ){ 
        Graphics g = this.getGraphics();
        //Se agrega al nuevo individuo 
            Individuo nuevoInd = new Individuo();
            nuevoInd.asignarCoordenada(xn,yn);
        //Se agrega al individuo a la poblacion 
            pob.agregarIndividuo(nuevoInd);

         //Para asignar una clase es necesario 
            ArrayList<Individuo> individuos = pob.getIndividuos();
            int k = Integer.parseInt(textVecinos.getText());
            ArrayList<Float> distaciasP = new ArrayList<Float>();
            int indx[] = new int[num];

            for(int i=0;i<size-1;i++){
                int ind[] = pob.getCoordena(i);
                float xm = (float) Math.pow((ind[0]-xn),2);
                float ym = (float) Math.pow((ind[1]-yn),2);
                float dis = (float) Math.sqrt(xm+ym);
                distaciasP.add(dis); 
                System.out.print("\nDiscancia "+i+": "+dis);
            }
            ArrayList<Float> distaciasPAux = (ArrayList<Float>) distaciasP.clone();

            Collections.sort(distaciasPAux);

            for(int r = 0;r<size-1;r++){
                System.out.print("\nDistancias ordenadas: "+distaciasPAux.get(r));
            }
            for(int m=0;m<k;m++){
                int idx = distaciasP.indexOf(distaciasPAux.get(m));
                System.out.print("\nIndice: "+idx);
                int clase = individuos.get(idx).getClase();
                System.out.print("\nClase: "+clase);
                indx[clase]=indx[clase]+1;

            }
            for(int t=0;t<num;t++){
                System.out.print("\nCoincidencias: "+t+" "+indx[t]);
            }
            int clas = indx[0];
            ArrayList<Integer> list = new ArrayList<Integer>();
            for(int u=0 ;u<num; u++){
                list.add(indx[u]);
                if(indx[u]> clas){
                    clas = indx[u];
                }
            }
            clas = list.indexOf(clas);
            System.out.print("\nClase a la que pertenece: "+clas);
            nuevoInd.setClase(clas);
            switch(clas){
                     case 0:
                         g.setColor(Color.BLUE);
                     break;
                      case 1:
                         g.setColor(Color.GREEN);
                     break;
                      case 2:
                         g.setColor(Color.RED);
                     break;
                      case 3:
                         g.setColor(Color.ORANGE);
                     break;
                      case 4:
                         g.setColor(Color.MAGENTA);
                     break;

                 }
            g.drawRect(xn, yn, 3,3);
            nuevo = true;
            textVecinos.setText(null);
        }
        else{
            JOptionPane.showMessageDialog(null, "No es posible, el número de vecinos es mayor a la población");

            textVecinos.setText(null);

        }
        } else {
            JOptionPane.showMessageDialog(null, "No se ha ingresado un numero de vecinos");
        }
        
        
        //indx contiene los indices de los individuos más cercanos 
              
    }//GEN-LAST:event_btnClasificadorActionPerformed

    private void textVecinosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textVecinosKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros)
        {
            evt.consume();
            btnClasificador.setEnabled(true);
        }
        else{
            btnClasificador.setEnabled(false);
        }

       
// TODO add your handling code here:
    }//GEN-LAST:event_textVecinosKeyTyped

    private void textVecinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textVecinosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textVecinosActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Panel;
    private javax.swing.JButton btnClasificador;
    private javax.swing.JButton btnClasificar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jpanelGrafica;
    private javax.swing.JLabel labelNoClases;
    private javax.swing.JTextField textClases;
    private javax.swing.JTextField textVecinos;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
        
        if(nuevo){
            btnClasificador.setEnabled(true);
            xn = e.getX();
            yn = e.getY();
            if(!verificarPunto(xn,yn)){
                        JOptionPane.showMessageDialog(null, "Este punto ya existe");
            }
            else{
                if(xn >= x & xn <= ancho & yn >= 
                        
                        
                        
                        y & yn <= largo & click == 1024 ){
                        System.out.print("\nEsta dentro del area y es izquierdo");
                        Graphics g = this.getGraphics();
                        g.drawRect(xn, yn, 3, 3);
                        nuevo = false;
                        textVecinos.setEnabled(true);
                   
                        size++;
                    }
                else{
                    System.out.print("Punto invalido");
                    btnClasificador.setEnabled(false);
                    textVecinos.setEnabled(false);
                }
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
         click = e.getModifiersEx();
    
    }

    @Override
    public void mouseReleased(MouseEvent e) {
         }

    @Override
    public void mouseEntered(MouseEvent e) {
        }

    @Override
    public void mouseExited(MouseEvent e) {
        }
    
    public boolean verificarPunto(int xn, int yn){
        for(int i=0;i<size;i++){
            int coordenada[] = pob.getCoordena(i);
                if(coordenada[0]== xn && coordenada[1]==yn){
                    return false;
                }
        }
    return true;
    }
    
   
}
