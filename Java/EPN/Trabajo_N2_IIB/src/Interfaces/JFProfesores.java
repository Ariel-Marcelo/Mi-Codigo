
package Interfaces;

import Fuentes.Fecha;
import Fuentes.Profesor;
import Fuentes.ListaProfesores;
import Fuentes.ProfesorContratado;
import Fuentes.ProfesorTitular;
import javax.swing.JOptionPane;

public class JFProfesores extends javax.swing.JFrame {
    ListaProfesores listaProfesores;
    public JFProfesores() {
        initComponents();
        listaProfesores = new ListaProfesores();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTAListaProfesores = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLNombreC = new javax.swing.JLabel();
        jLFechaNC = new javax.swing.JLabel();
        jTFNombreC = new javax.swing.JTextField();
        jTFFechaNC = new javax.swing.JTextField();
        jLTituloC = new javax.swing.JLabel();
        jTFTituloC = new javax.swing.JTextField();
        jLFechaIngresoC = new javax.swing.JLabel();
        jTFFechaIngresoC = new javax.swing.JTextField();
        jLFechaSalida = new javax.swing.JLabel();
        jTFFechaSalida = new javax.swing.JTextField();
        jLSalrioFinal = new javax.swing.JLabel();
        jTFSalrioFinal = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTAProfesorIngresadoC = new javax.swing.JTextArea();
        jBContratado = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLNombreT = new javax.swing.JLabel();
        jLFechaNT = new javax.swing.JLabel();
        jLTitulT = new javax.swing.JLabel();
        jLFechaIngresoT = new javax.swing.JLabel();
        jLPagoQ = new javax.swing.JLabel();
        jLPagoM = new javax.swing.JLabel();
        jTFNombreT = new javax.swing.JTextField();
        jTFFechaNT = new javax.swing.JTextField();
        jTFTituloT = new javax.swing.JTextField();
        jTFFechaIngresoT = new javax.swing.JTextField();
        jTFPagoQ = new javax.swing.JTextField();
        jTFPagoM = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTAProfesorIngresadoT = new javax.swing.JTextArea();
        jBProfesorTitular = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTAListaProfesores.setEditable(false);
        jTAListaProfesores.setColumns(20);
        jTAListaProfesores.setRows(5);
        jScrollPane1.setViewportView(jTAListaProfesores);

        jLabel1.setText("Lista de Profesores");

        jLNombreC.setText("Nombre y Apellido:");

        jLFechaNC.setText("Fecha de Nacimiento:");

        jLTituloC.setText("Titulo del Profesor:");

        jLFechaIngresoC.setText("Fecha Ingreso dd/mm/aaaa:");

        jLFechaSalida.setText("Fecha Salida dd/mm/aaaa:");

        jLSalrioFinal.setText("Salario Final:");

        jTAProfesorIngresadoC.setColumns(20);
        jTAProfesorIngresadoC.setRows(5);
        jScrollPane2.setViewportView(jTAProfesorIngresadoC);

        jBContratado.setText("Aceptar");
        jBContratado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBContratadoActionPerformed(evt);
            }
        });

        jLabel8.setText("Profesor Ingresado:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBContratado))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLNombreC)
                                    .addComponent(jLFechaNC)
                                    .addComponent(jLTituloC)
                                    .addComponent(jLFechaIngresoC)
                                    .addComponent(jLFechaSalida)
                                    .addComponent(jLSalrioFinal))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFFechaIngresoC)
                                    .addComponent(jTFFechaSalida)
                                    .addComponent(jTFSalrioFinal)
                                    .addComponent(jTFNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFFechaNC)
                                    .addComponent(jTFTituloC))))))
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNombreC)
                    .addComponent(jTFNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLFechaNC)
                    .addComponent(jTFFechaNC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTituloC)
                    .addComponent(jTFTituloC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLFechaIngresoC)
                    .addComponent(jTFFechaIngresoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLFechaSalida)
                    .addComponent(jTFFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLSalrioFinal)
                    .addComponent(jTFSalrioFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBContratado)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane4.addTab("Profesor Contratado", jPanel2);

        jLNombreT.setText("Nombre y Apellido:");

        jLFechaNT.setText("Fecha de Nacimiento:");

        jLTitulT.setText("Titulo del Profesor:");

        jLFechaIngresoT.setText("Fecha Ingreso dd/mm/aaaa:");

        jLPagoQ.setText("Pago Quincena:");

        jLPagoM.setText("Pago Mensual:");

        jTFFechaIngresoT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFFechaIngresoTActionPerformed(evt);
            }
        });

        jTAProfesorIngresadoT.setEditable(false);
        jTAProfesorIngresadoT.setColumns(20);
        jTAProfesorIngresadoT.setRows(5);
        jScrollPane3.setViewportView(jTAProfesorIngresadoT);

        jBProfesorTitular.setText("Aceptar");
        jBProfesorTitular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBProfesorTitularActionPerformed(evt);
            }
        });

        jLabel15.setText("Profesor Ingresado:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLPagoM)
                            .addComponent(jLFechaNT)
                            .addComponent(jLNombreT)
                            .addComponent(jLTitulT)
                            .addComponent(jLFechaIngresoT)
                            .addComponent(jLPagoQ)
                            .addComponent(jLabel15))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFNombreT)
                            .addComponent(jTFFechaNT)
                            .addComponent(jTFTituloT)
                            .addComponent(jTFFechaIngresoT)
                            .addComponent(jTFPagoQ)
                            .addComponent(jTFPagoM, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBProfesorTitular)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNombreT)
                    .addComponent(jTFNombreT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLFechaNT)
                    .addComponent(jTFFechaNT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTitulT)
                    .addComponent(jTFTituloT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLFechaIngresoT)
                    .addComponent(jTFFechaIngresoT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPagoQ)
                    .addComponent(jTFPagoQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPagoM)
                    .addComponent(jTFPagoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBProfesorTitular)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jTabbedPane4.addTab("Profesor titular", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane4))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBContratadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBContratadoActionPerformed
        Fecha fechaNacimiento = new Fecha(this.jTFFechaNC.getText());
        Fecha fechaIngreso = new Fecha(this.jTFFechaIngresoC.getText());
        Fecha fechaSalida = new Fecha(this.jTFFechaSalida.getText());
        if(fechaNacimiento.fechaValida() && fechaIngreso.fechaValida() && fechaSalida.fechaValida()){
            try{
                double salarioTotal = Double.parseDouble(this.jTFSalrioFinal.getText());
                ProfesorContratado profesorContratado = new ProfesorContratado(this.jTFNombreC.getText(),
                fechaNacimiento, this.jTFTituloC.getText(),fechaIngreso,fechaSalida,salarioTotal);
                this.jTAProfesorIngresadoC.setText(profesorContratado.toString());
                listaProfesores.addProfesor(profesorContratado);
                this.jTAListaProfesores.setText(listaProfesores.toString());
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Los valores numericos son incorrectos");
                this.jTFSalrioFinal.setText("");
            }
        }else{
            this.jTFFechaIngresoC.setText("");
            this.jTFFechaNC.setText("");
            this.jTFFechaSalida.setText("");
        }
        
    }//GEN-LAST:event_jBContratadoActionPerformed

    private void jBProfesorTitularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBProfesorTitularActionPerformed
        Fecha fechaNacimiento = new Fecha(this.jTFFechaNT.getText());
        Fecha fechaIngreso = new Fecha(this.jTFFechaIngresoT.getText());
        if(fechaNacimiento.fechaValida() && fechaIngreso.fechaValida()){
            try{
                double salarioQuincena = Double.parseDouble(this.jTFPagoQ.getText());
                double salarioMensual = Double.parseDouble(this.jTFPagoM.getText());
                ProfesorTitular profesorTitular = new ProfesorTitular(this.jTFNombreT.getText(),
                fechaNacimiento, this.jTFTituloT.getText(),fechaIngreso,salarioQuincena,salarioMensual);
                this.jTAProfesorIngresadoT.setText(profesorTitular.toString());
                listaProfesores.addProfesor(profesorTitular);
                this.jTAListaProfesores.setText(listaProfesores.toString());
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Los valores numericos son incorrectos");
                this.jTFPagoQ.setText("");
                this.jTFPagoM.setText("");
            }
        }else{
            this.jTFFechaIngresoT.setText("");
            this.jTFFechaNT.setText("");
        }
    }//GEN-LAST:event_jBProfesorTitularActionPerformed

    private void jTFFechaIngresoTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFFechaIngresoTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFFechaIngresoTActionPerformed

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
            java.util.logging.Logger.getLogger(JFProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFProfesores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBContratado;
    private javax.swing.JButton jBProfesorTitular;
    private javax.swing.JLabel jLFechaIngresoC;
    private javax.swing.JLabel jLFechaIngresoT;
    private javax.swing.JLabel jLFechaNC;
    private javax.swing.JLabel jLFechaNT;
    private javax.swing.JLabel jLFechaSalida;
    private javax.swing.JLabel jLNombreC;
    private javax.swing.JLabel jLNombreT;
    private javax.swing.JLabel jLPagoM;
    private javax.swing.JLabel jLPagoQ;
    private javax.swing.JLabel jLSalrioFinal;
    private javax.swing.JLabel jLTitulT;
    private javax.swing.JLabel jLTituloC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTAListaProfesores;
    private javax.swing.JTextArea jTAProfesorIngresadoC;
    private javax.swing.JTextArea jTAProfesorIngresadoT;
    private javax.swing.JTextField jTFFechaIngresoC;
    private javax.swing.JTextField jTFFechaIngresoT;
    private javax.swing.JTextField jTFFechaNC;
    private javax.swing.JTextField jTFFechaNT;
    private javax.swing.JTextField jTFFechaSalida;
    private javax.swing.JTextField jTFNombreC;
    private javax.swing.JTextField jTFNombreT;
    private javax.swing.JTextField jTFPagoM;
    private javax.swing.JTextField jTFPagoQ;
    private javax.swing.JTextField jTFSalrioFinal;
    private javax.swing.JTextField jTFTituloC;
    private javax.swing.JTextField jTFTituloT;
    private javax.swing.JTabbedPane jTabbedPane4;
    // End of variables declaration//GEN-END:variables
}
