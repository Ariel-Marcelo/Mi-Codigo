
package Interfaz;
import Fuentes.ManejadorArchivos;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.util.logging.PlatformLogger;

public class JFResultados extends javax.swing.JFrame {
   
    ManejadorArchivos archivo1;
    
    public JFResultados() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTASaida = new javax.swing.JTextArea();
        jBFactorial = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTAEntrada = new javax.swing.JTextArea();
        jBEntrada = new javax.swing.JButton();
        jBMostraSalida = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTASaida.setColumns(20);
        jTASaida.setRows(5);
        jScrollPane1.setViewportView(jTASaida);

        jBFactorial.setText("Factorial");
        jBFactorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFactorialActionPerformed(evt);
            }
        });

        jTAEntrada.setColumns(20);
        jTAEntrada.setRows(5);
        jScrollPane2.setViewportView(jTAEntrada);

        jBEntrada.setText("Mostrar Entrada  Entrada");
        jBEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEntradaActionPerformed(evt);
            }
        });

        jBMostraSalida.setText("Mostrar Salida");
        jBMostraSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMostraSalidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBEntrada))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBMostraSalida))
                .addContainerGap(94, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBFactorial)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBEntrada)
                    .addComponent(jBMostraSalida))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jBFactorial)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBFactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFactorialActionPerformed
       String resultado = "";
        try{
            ManejadorArchivos archivo= new ManejadorArchivos();
            archivo.operar();
            resultado = archivo.leer("salida.txt");
            
        }catch(IOException ex)
        {
            Logger.getLogger(JFResultados.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.jTASaida.setText(resultado);
    }//GEN-LAST:event_jBFactorialActionPerformed

    private void jBEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEntradaActionPerformed
        String entrada = "";
        try{
            ManejadorArchivos archivo= new ManejadorArchivos();
            
            entrada = archivo.leer("C:\\Users\\user\\Desktop\\Dato.txt");
            
        }catch(IOException ex)
        {
            Logger.getLogger(JFResultados.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.jTAEntrada.setText(entrada);
        
    }//GEN-LAST:event_jBEntradaActionPerformed

    private void jBMostraSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMostraSalidaActionPerformed
         String salida = "";
        try{
            ManejadorArchivos archivo= new ManejadorArchivos();
            salida = archivo.leer("Salida.txt");
            
        }catch(IOException ex)
        {
            Logger.getLogger(JFResultados.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.jTASaida.setText(salida);
        
    }//GEN-LAST:event_jBMostraSalidaActionPerformed

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
            java.util.logging.Logger.getLogger(JFResultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFResultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFResultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFResultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFResultados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEntrada;
    private javax.swing.JButton jBFactorial;
    private javax.swing.JButton jBMostraSalida;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTAEntrada;
    private javax.swing.JTextArea jTASaida;
    // End of variables declaration//GEN-END:variables
}
