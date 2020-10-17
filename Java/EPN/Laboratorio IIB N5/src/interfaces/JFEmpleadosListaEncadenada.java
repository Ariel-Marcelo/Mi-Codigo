
package interfaces;

import Herencia.ListaDeEmpleados;
import Herencia.EmpleadoPorHoras;
import Herencia.EmpleadoAsalariado;
import Herencia.EmpleadoPorComision;
import Herencia.EmpleadoBaseMasComision;
import Herencia.Fecha;
import Herencia.ListaEncadenada;
import javax.swing.JOptionPane;
public class JFEmpleadosListaEncadenada extends javax.swing.JFrame {

    ListaDeEmpleados listaEmpleados;
    public ListaEncadenada listaEncadenada;
    public JFEmpleadosListaEncadenada() {
        initComponents();
        listaEncadenada = new ListaEncadenada();
        listaEmpleados = new ListaDeEmpleados();
        this.setLocationRelativeTo(null);  
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPHoras = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTFNombrexH = new javax.swing.JTextField();
        jTFNacimientoxH = new javax.swing.JTextField();
        jTFIngresoxH = new javax.swing.JTextField();
        jTFNumHoras = new javax.swing.JTextField();
        jTFValorxHora = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTAImprimirExH = new javax.swing.JTextArea();
        jLabel28 = new javax.swing.JLabel();
        jBAcepatarHoras = new javax.swing.JButton();
        jPComision = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jTFNombrexC = new javax.swing.JTextField();
        jTFNacimientoxC = new javax.swing.JTextField();
        jTFIngresoxC = new javax.swing.JTextField();
        jTFVendidoC = new javax.swing.JTextField();
        jTFPorcentajeC = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTAImprimirExC = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jBAcepatarComision = new javax.swing.JButton();
        jPAsalariado = new javax.swing.JPanel();
        jTFNombrexB = new javax.swing.JTextField();
        jTFNacimientoxB = new javax.swing.JTextField();
        jTFIngresoxB = new javax.swing.JTextField();
        jTFSoloBase = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTAImprimirExB = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jBAcepatarBase = new javax.swing.JButton();
        jPBaseComision = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTAImprimirExByC = new javax.swing.JTextArea();
        jTFNombrexByC = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTFNacimientoxByC = new javax.swing.JTextField();
        jTFIngresoxByC = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTFSalarioByC = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTFVendidoxByC = new javax.swing.JTextField();
        jTFPorcentajeByC = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jBAcepatarBaseyComision = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAListaEmpleados = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jBInicio = new javax.swing.JButton();
        jBAñadirFinal = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jBBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setName("Empleados"); // NOI18N
        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(new java.awt.CardLayout());

        jLabel8.setText("Nombre y Apellido");

        jTFIngresoxH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFIngresoxHActionPerformed(evt);
            }
        });

        jTFValorxHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFValorxHoraActionPerformed(evt);
            }
        });

        jLabel24.setText("Fecha Nacimiento dd/mm/aaaa:");

        jLabel25.setText("Fecha Ingreso dd/mm/aaaa:");

        jLabel26.setText("Numero de Horas Trabajados: ");

        jLabel27.setText("Valor por Hora: ");

        jTAImprimirExH.setEditable(false);
        jTAImprimirExH.setColumns(20);
        jTAImprimirExH.setRows(5);
        jScrollPane8.setViewportView(jTAImprimirExH);

        jLabel28.setText("Empleado por Horas Ingresado:");

        jBAcepatarHoras.setText("Aceptar");
        jBAcepatarHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAcepatarHorasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPHorasLayout = new javax.swing.GroupLayout(jPHoras);
        jPHoras.setLayout(jPHorasLayout);
        jPHorasLayout.setHorizontalGroup(
            jPHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPHorasLayout.createSequentialGroup()
                .addGroup(jPHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPHorasLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBAcepatarHoras))
                    .addGroup(jPHorasLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPHorasLayout.createSequentialGroup()
                                .addGroup(jPHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel24))
                                .addGap(18, 18, 18)
                                .addGroup(jPHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTFNombrexH, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                    .addComponent(jTFNacimientoxH)))
                            .addGroup(jPHorasLayout.createSequentialGroup()
                                .addGroup(jPHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel27))
                                .addGap(22, 22, 22)
                                .addGroup(jPHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTFNumHoras, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                    .addComponent(jTFIngresoxH)
                                    .addComponent(jTFValorxHora))))
                        .addGroup(jPHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPHorasLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addComponent(jLabel28)
                                .addGap(76, 76, 76))
                            .addGroup(jPHorasLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane8)))))
                .addGap(21, 21, 21))
        );
        jPHorasLayout.setVerticalGroup(
            jPHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPHorasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4)
                .addGroup(jPHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPHorasLayout.createSequentialGroup()
                        .addGroup(jPHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTFNombrexH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFNacimientoxH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addGap(18, 18, 18)
                        .addGroup(jPHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFIngresoxH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addGap(18, 18, 18)
                        .addGroup(jPHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFNumHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))
                        .addGap(18, 18, 18)
                        .addGroup(jPHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFValorxHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27)))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jBAcepatarHoras)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Por Horas", jPHoras);

        jLabel17.setText("Nombres y Apellidos: ");

        jTAImprimirExC.setColumns(20);
        jTAImprimirExC.setRows(5);
        jScrollPane6.setViewportView(jTAImprimirExC);

        jLabel18.setText("Fecha Nacimiento dd/mm/aaaa:");

        jLabel19.setText("Fecha Ingreso dd/mm/aaaa");

        jLabel20.setText("Total Vendido:");

        jLabel21.setText("%Comision");

        jLabel22.setText("Emplrsfo pot Comisión Ingresado:");

        jBAcepatarComision.setText("Aceptar");
        jBAcepatarComision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAcepatarComisionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPComisionLayout = new javax.swing.GroupLayout(jPComision);
        jPComision.setLayout(jPComisionLayout);
        jPComisionLayout.setHorizontalGroup(
            jPComisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPComisionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPComisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPComisionLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBAcepatarComision))
                    .addGroup(jPComisionLayout.createSequentialGroup()
                        .addGroup(jPComisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPComisionLayout.createSequentialGroup()
                                .addGroup(jPComisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21))
                                .addGap(37, 37, 37))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPComisionLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)))
                        .addGroup(jPComisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFIngresoxC, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFNacimientoxC, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFVendidoC, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFPorcentajeC, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFNombrexC, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(jPComisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPComisionLayout.setVerticalGroup(
            jPComisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPComisionLayout.createSequentialGroup()
                .addGroup(jPComisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPComisionLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPComisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFNombrexC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(19, 19, 19)
                        .addGroup(jPComisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPComisionLayout.createSequentialGroup()
                                .addGroup(jPComisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTFNacimientoxC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18))
                                .addGap(18, 18, 18)
                                .addGroup(jPComisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTFIngresoxC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19))
                                .addGap(18, 18, 18)
                                .addComponent(jTFVendidoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel20))
                        .addGap(18, 18, 18)
                        .addGroup(jPComisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFPorcentajeC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)))
                    .addGroup(jPComisionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jBAcepatarComision)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Por Comisión", jPComision);

        jLabel3.setText("Nombre y Apellido");

        jLabel4.setText("Fecha de Nacimiento dd/mm/aaaa:");

        jLabel5.setText("Fecha de Ingreso dd/mm/aaaa:");

        jLabel6.setText("Salario Básico:");

        jTAImprimirExB.setColumns(20);
        jTAImprimirExB.setRows(5);
        jScrollPane4.setViewportView(jTAImprimirExB);

        jLabel7.setText("Empleado Asalariado Ingresado:");

        jBAcepatarBase.setText("Aceptar");
        jBAcepatarBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAcepatarBaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPAsalariadoLayout = new javax.swing.GroupLayout(jPAsalariado);
        jPAsalariado.setLayout(jPAsalariadoLayout);
        jPAsalariadoLayout.setHorizontalGroup(
            jPAsalariadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPAsalariadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPAsalariadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPAsalariadoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBAcepatarBase))
                    .addGroup(jPAsalariadoLayout.createSequentialGroup()
                        .addGroup(jPAsalariadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(jPAsalariadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFNombrexB, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(jTFNacimientoxB)
                            .addComponent(jTFIngresoxB)
                            .addComponent(jTFSoloBase))
                        .addGap(18, 18, 18)
                        .addGroup(jPAsalariadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );
        jPAsalariadoLayout.setVerticalGroup(
            jPAsalariadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAsalariadoLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPAsalariadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPAsalariadoLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPAsalariadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFNombrexB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPAsalariadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFNacimientoxB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPAsalariadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFIngresoxB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPAsalariadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFSoloBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jBAcepatarBase)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Asalariado", jPAsalariado);

        jTAImprimirExByC.setColumns(20);
        jTAImprimirExByC.setRows(5);
        jScrollPane2.setViewportView(jTAImprimirExByC);

        jLabel1.setText("Nombres y Apellidos");

        jLabel10.setText("Fecha Nacimiento dd/mm/aaaa:");

        jLabel11.setText("Fecha de Ingreso dd/mm/aaaa:");

        jLabel12.setText("Salario Basico");

        jLabel13.setText("Total Vendido:");

        jLabel14.setText("%Comisión ");

        jLabel15.setText("Empleado por Comisión agregado:");

        jBAcepatarBaseyComision.setText("Aceptar");
        jBAcepatarBaseyComision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAcepatarBaseyComisionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPBaseComisionLayout = new javax.swing.GroupLayout(jPBaseComision);
        jPBaseComision.setLayout(jPBaseComisionLayout);
        jPBaseComisionLayout.setHorizontalGroup(
            jPBaseComisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBaseComisionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPBaseComisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPBaseComisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPBaseComisionLayout.createSequentialGroup()
                        .addGroup(jPBaseComisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTFNacimientoxByC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(jTFIngresoxByC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(jTFSalarioByC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(jTFNombrexByC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(jTFVendidoxByC, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(36, 36, 36)
                        .addGroup(jPBaseComisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)))
                    .addGroup(jPBaseComisionLayout.createSequentialGroup()
                        .addComponent(jTFPorcentajeByC, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(216, 216, 216)
                        .addComponent(jBAcepatarBaseyComision)))
                .addContainerGap())
        );
        jPBaseComisionLayout.setVerticalGroup(
            jPBaseComisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBaseComisionLayout.createSequentialGroup()
                .addGroup(jPBaseComisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPBaseComisionLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPBaseComisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTFNombrexByC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPBaseComisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFNacimientoxByC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPBaseComisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFIngresoxByC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPBaseComisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFSalarioByC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPBaseComisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFVendidoxByC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)))
                    .addGroup(jPBaseComisionLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2)))
                .addGap(18, 18, 18)
                .addGroup(jPBaseComisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAcepatarBaseyComision)
                    .addComponent(jTFPorcentajeByC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(202, 202, 202))
        );

        jTabbedPane1.addTab("Base mas Comision", jPBaseComision);

        jInternalFrame1.getContentPane().add(jTabbedPane1, "card2");

        jMenu1.setText("File");

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jInternalFrame1.setJMenuBar(jMenuBar1);

        jTAListaEmpleados.setEditable(false);
        jTAListaEmpleados.setColumns(20);
        jTAListaEmpleados.setRows(5);
        jScrollPane1.setViewportView(jTAListaEmpleados);

        jLabel2.setText("Lista Empleados:");

        jBInicio.setText("Agregar al inicio");
        jBInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInicioActionPerformed(evt);
            }
        });

        jBAñadirFinal.setText("Agregar al Final");
        jBAñadirFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAñadirFinalActionPerformed(evt);
            }
        });

        jButton2.setText("Agregar en Orden Nombre");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jBBorrar.setText("Borrar");
        jBBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBInicio)
                        .addGap(40, 40, 40)
                        .addComponent(jBAñadirFinal)
                        .addGap(63, 63, 63)
                        .addComponent(jButton2)
                        .addGap(32, 32, 32)
                        .addComponent(jBBorrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBInicio)
                    .addComponent(jLabel2)
                    .addComponent(jBAñadirFinal)
                    .addComponent(jButton2)
                    .addComponent(jBBorrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAcepatarHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAcepatarHorasActionPerformed
        Fecha fechaNacimiento = new Fecha(this.jTFNacimientoxH.getText());
        Fecha fechaIngreso = new Fecha(this.jTFIngresoxH.getText());
        if(fechaNacimiento.fechaValida() && fechaIngreso.fechaValida()){
            double numHorasTrabajadas = Double.parseDouble(this.jTFNumHoras.getText());
            double valorXhora = Double.parseDouble(this.jTFValorxHora.getText());
            EmpleadoPorHoras empleadoHoras = new EmpleadoPorHoras(this.jTFNombrexH.getText(),
                    fechaNacimiento, fechaIngreso,numHorasTrabajadas,valorXhora);
            this.jTAImprimirExH.setText(empleadoHoras.toString());
            this.listaEmpleados.addEmpleado(empleadoHoras);
            this.jTAListaEmpleados.setText(listaEmpleados.toString());
        }else{
           this.jTFNacimientoxH.setText("");
           this.jTFIngresoxH.setText("");
        }
    }//GEN-LAST:event_jBAcepatarHorasActionPerformed

    private void jBAcepatarComisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAcepatarComisionActionPerformed
        Fecha fechaNacimiento = new Fecha(this.jTFNacimientoxC.getText());
        Fecha fechaIngreso = new Fecha(this.jTFIngresoxC.getText());
        if(fechaNacimiento.fechaValida() && fechaIngreso.fechaValida()){
            double valorVendido = Double.parseDouble(this.jTFVendidoC.getText());
            double porcentajeComision = Double.parseDouble(this.jTFPorcentajeC.getText());
            EmpleadoPorComision empleadoComision = new EmpleadoPorComision(this.jTFNombrexC.getText(),
                    fechaNacimiento, fechaIngreso,valorVendido,porcentajeComision);
            this.jTAImprimirExC.setText(empleadoComision.toString());
            this.listaEmpleados.addEmpleado(empleadoComision);
            this.jTAListaEmpleados.setText(listaEmpleados.toString());
        }else{
            this.jTFNacimientoxC.setText("");
            this.jTFIngresoxC.setText("");
        }
    }//GEN-LAST:event_jBAcepatarComisionActionPerformed

    private void jTFValorxHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFValorxHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFValorxHoraActionPerformed

    private void jBAcepatarBaseyComisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAcepatarBaseyComisionActionPerformed
        Fecha fechaNacimiento = new Fecha(this.jTFNacimientoxByC.getText());
        Fecha fechaIngreso = new Fecha(this.jTFIngresoxByC.getText());
        if(fechaNacimiento.fechaValida() && fechaIngreso.fechaValida()){
            double valorVendido = Double.parseDouble(this.jTFVendidoxByC.getText());
            double porcentajeComision = Double.parseDouble(this.jTFPorcentajeByC.getText());
            double salarioExtra = Double.parseDouble(this.jTFSalarioByC.getText());
            EmpleadoBaseMasComision empleadoBaseYComision = new EmpleadoBaseMasComision(
            this.jTFNombrexByC.getText(),fechaNacimiento, fechaIngreso,valorVendido,
            porcentajeComision,salarioExtra);
            this.jTAImprimirExByC.setText(empleadoBaseYComision.toString());
            this.listaEmpleados.addEmpleado(empleadoBaseYComision);
            this.jTAListaEmpleados.setText(listaEmpleados.toString());
        }else{
            this.jTFNacimientoxByC.setText("");
            this.jTFIngresoxByC.setText("");
        }
    }//GEN-LAST:event_jBAcepatarBaseyComisionActionPerformed

    private void jBAcepatarBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAcepatarBaseActionPerformed
        Fecha fechaNacimiento = new Fecha(this.jTFNacimientoxB.getText());
        Fecha fechaIngreso = new Fecha(this.jTFIngresoxB.getText());
        if(fechaNacimiento.fechaValida() && fechaIngreso.fechaValida()){
            double salario= Double.parseDouble(this.jTFSoloBase.getText());
            EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado(
            this.jTFNombrexB.getText(),fechaNacimiento, fechaIngreso,salario);
            this.jTAImprimirExB.setText(empleadoAsalariado.toString());
            this.listaEmpleados.addEmpleado(empleadoAsalariado);
            this.jTAListaEmpleados.setText(listaEmpleados.toString());
        }else{
            this.jTFNacimientoxB.setText("");
            this.jTFIngresoxB.setText("");
            
        }
    }//GEN-LAST:event_jBAcepatarBaseActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jBInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInicioActionPerformed
        
        int i = this.jTabbedPane1.getSelectedIndex();
        switch(i)
        {
            case 0:
                String nombres = this.jTFNombrexH.getText();
                Fecha fechaNacimiento = new Fecha(this.jTFNacimientoxH.getText());
                Fecha fechaIngreso = new Fecha(this.jTFIngresoxH.getText());
                if(fechaNacimiento.fechaValida() && fechaIngreso.fechaValida()){
                    double numHorasTrabajadas = Double.parseDouble(this.jTFNumHoras.getText());
                    double valorXhora = Double.parseDouble(this.jTFValorxHora.getText());
                    EmpleadoPorHoras empleadoHoras = new EmpleadoPorHoras(this.jTFNombrexH.getText(),
                    fechaNacimiento, fechaIngreso,numHorasTrabajadas,valorXhora);
                    this.jTAImprimirExH.setText(empleadoHoras.toString());
                    listaEncadenada.addInicio(empleadoHoras);
                 
                    this.jTAListaEmpleados.setText(listaEncadenada.toString());
                }else{
                    this.jTFNacimientoxH.setText("");
                    this.jTFIngresoxH.setText("");
                }
                
                break;
            case 1:
                Fecha fechaNacimientoC = new Fecha(this.jTFNacimientoxC.getText());
                Fecha fechaIngresoC = new Fecha(this.jTFIngresoxC.getText());
                if(fechaNacimientoC.fechaValida() && fechaIngresoC.fechaValida()){
                    double valorVendido = Double.parseDouble(this.jTFVendidoC.getText());
                    double porcentajeComision = Double.parseDouble(this.jTFPorcentajeC.getText());
                    EmpleadoPorComision empleadoComision = new EmpleadoPorComision(this.jTFNombrexC.getText(),
                    fechaNacimientoC, fechaIngresoC,valorVendido,porcentajeComision);
            this.jTAImprimirExC.setText(empleadoComision.toString());
            this.listaEncadenada.addInicio(empleadoComision);
            this.jTAListaEmpleados.setText(listaEncadenada.toString());
        }else{
            this.jTFNacimientoxC.setText("");
            this.jTFIngresoxC.setText("");
        }
                
                break;
            case 2: 
                Fecha fechaNacimientoA = new Fecha(this.jTFNacimientoxB.getText());
                Fecha fechaIngresoA = new Fecha(this.jTFIngresoxB.getText());
                if(fechaNacimientoA.fechaValida() && fechaIngresoA.fechaValida()){
                    double salario= Double.parseDouble(this.jTFSoloBase.getText());
                    EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado(
                    this.jTFNombrexB.getText(),fechaNacimientoA, fechaIngresoA,salario);
                    this.jTAImprimirExB.setText(empleadoAsalariado.toString());
                    this.listaEncadenada.addInicio(empleadoAsalariado);
                    this.jTAListaEmpleados.setText(listaEncadenada.toString());
                }else{
                    this.jTFNacimientoxB.setText("");
                    this.jTFIngresoxB.setText("");
            
                }
                break;
            case 3: 
                
                Fecha fechaNacimientoAC = new Fecha(this.jTFNacimientoxByC.getText());
                Fecha fechaIngresoAC = new Fecha(this.jTFIngresoxByC.getText());
                if(fechaNacimientoAC.fechaValida() && fechaIngresoAC.fechaValida()){
                    double valorVendido = Double.parseDouble(this.jTFVendidoxByC.getText());
                    double porcentajeComision = Double.parseDouble(this.jTFPorcentajeByC.getText());
                    double salarioExtra = Double.parseDouble(this.jTFSalarioByC.getText());
                    EmpleadoBaseMasComision empleadoBaseYComision = new EmpleadoBaseMasComision(
                    this.jTFNombrexByC.getText(),fechaNacimientoAC, fechaIngresoAC,valorVendido,
                    porcentajeComision,salarioExtra);
                    this.jTAImprimirExByC.setText(empleadoBaseYComision.toString());
                    this.listaEncadenada.addInicio(empleadoBaseYComision);
                    this.jTAListaEmpleados.setText(listaEncadenada.toString());
                }else{
                    this.jTFNacimientoxByC.setText("");
                    this.jTFIngresoxByC.setText("");
                }
                
                break;
        }
    }//GEN-LAST:event_jBInicioActionPerformed

    private void jBAñadirFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAñadirFinalActionPerformed
       
        int i = this.jTabbedPane1.getSelectedIndex();
        switch(i)
        {
            case 0:
                String nombres = this.jTFNombrexH.getText();
                Fecha fechaNacimiento = new Fecha(this.jTFNacimientoxH.getText());
                Fecha fechaIngreso = new Fecha(this.jTFIngresoxH.getText());
                if(fechaNacimiento.fechaValida() && fechaIngreso.fechaValida()){
                    double numHorasTrabajadas = Double.parseDouble(this.jTFNumHoras.getText());
                    double valorXhora = Double.parseDouble(this.jTFValorxHora.getText());
                    EmpleadoPorHoras empleadoHoras = new EmpleadoPorHoras(this.jTFNombrexH.getText(),
                    fechaNacimiento, fechaIngreso,numHorasTrabajadas,valorXhora);
                    this.jTAImprimirExH.setText(empleadoHoras.toString());
                    listaEncadenada.addFinal(empleadoHoras);
                 
                    this.jTAListaEmpleados.setText(listaEncadenada.toString());
                }else{
                    this.jTFNacimientoxH.setText("");
                    this.jTFIngresoxH.setText("");
                }
                
                break;
            case 1:
                Fecha fechaNacimientoC = new Fecha(this.jTFNacimientoxC.getText());
                Fecha fechaIngresoC = new Fecha(this.jTFIngresoxC.getText());
                if(fechaNacimientoC.fechaValida() && fechaIngresoC.fechaValida()){
                    double valorVendido = Double.parseDouble(this.jTFVendidoC.getText());
                    double porcentajeComision = Double.parseDouble(this.jTFPorcentajeC.getText());
                    EmpleadoPorComision empleadoComision = new EmpleadoPorComision(this.jTFNombrexC.getText(),
                    fechaNacimientoC, fechaIngresoC,valorVendido,porcentajeComision);
            this.jTAImprimirExC.setText(empleadoComision.toString());
            this.listaEncadenada.addFinal(empleadoComision);
            this.jTAListaEmpleados.setText(listaEncadenada.toString());
        }else{
            this.jTFNacimientoxC.setText("");
            this.jTFIngresoxC.setText("");
        }
                
                break;
            case 2: 
                Fecha fechaNacimientoA = new Fecha(this.jTFNacimientoxB.getText());
                Fecha fechaIngresoA = new Fecha(this.jTFIngresoxB.getText());
                if(fechaNacimientoA.fechaValida() && fechaIngresoA.fechaValida()){
                    double salario= Double.parseDouble(this.jTFSoloBase.getText());
                    EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado(
                    this.jTFNombrexB.getText(),fechaNacimientoA, fechaIngresoA,salario);
                    this.jTAImprimirExB.setText(empleadoAsalariado.toString());
                    this.listaEncadenada.addFinal(empleadoAsalariado);
                    this.jTAListaEmpleados.setText(listaEncadenada.toString());
                }else{
                    this.jTFNacimientoxB.setText("");
                    this.jTFIngresoxB.setText("");
            
                }
                break;
            case 3: 
                
                Fecha fechaNacimientoAC = new Fecha(this.jTFNacimientoxByC.getText());
                Fecha fechaIngresoAC = new Fecha(this.jTFIngresoxByC.getText());
                if(fechaNacimientoAC.fechaValida() && fechaIngresoAC.fechaValida()){
                    double valorVendido = Double.parseDouble(this.jTFVendidoxByC.getText());
                    double porcentajeComision = Double.parseDouble(this.jTFPorcentajeByC.getText());
                    double salarioExtra = Double.parseDouble(this.jTFSalarioByC.getText());
                    EmpleadoBaseMasComision empleadoBaseYComision = new EmpleadoBaseMasComision(
                    this.jTFNombrexByC.getText(),fechaNacimientoAC, fechaIngresoAC,valorVendido,
                    porcentajeComision,salarioExtra);
                    this.jTAImprimirExByC.setText(empleadoBaseYComision.toString());
                    this.listaEncadenada.addFinal(empleadoBaseYComision);
                    this.jTAListaEmpleados.setText(listaEncadenada.toString());
                }else{
                    this.jTFNacimientoxByC.setText("");
                    this.jTFIngresoxByC.setText("");
                }
                
                break;
        }
        
    }//GEN-LAST:event_jBAñadirFinalActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int i = this.jTabbedPane1.getSelectedIndex();
        switch(i)
        {
            case 0:
                String nombres = this.jTFNombrexH.getText();
                Fecha fechaNacimiento = new Fecha(this.jTFNacimientoxH.getText());
                Fecha fechaIngreso = new Fecha(this.jTFIngresoxH.getText());
                if(fechaNacimiento.fechaValida() && fechaIngreso.fechaValida()){
                    double numHorasTrabajadas = Double.parseDouble(this.jTFNumHoras.getText());
                    double valorXhora = Double.parseDouble(this.jTFValorxHora.getText());
                    EmpleadoPorHoras empleadoHoras = new EmpleadoPorHoras(this.jTFNombrexH.getText(),
                    fechaNacimiento, fechaIngreso,numHorasTrabajadas,valorXhora);
                    this.jTAImprimirExH.setText(empleadoHoras.toString());
                    listaEncadenada.addOrdenar(empleadoHoras);
                 
                    this.jTAListaEmpleados.setText(listaEncadenada.toString());
                }else{
                    this.jTFNacimientoxH.setText("");
                    this.jTFIngresoxH.setText("");
                }
                break;
            case 1:
                Fecha fechaNacimientoC = new Fecha(this.jTFNacimientoxC.getText());
                Fecha fechaIngresoC = new Fecha(this.jTFIngresoxC.getText());
                if(fechaNacimientoC.fechaValida() && fechaIngresoC.fechaValida()){
                    double valorVendido = Double.parseDouble(this.jTFVendidoC.getText());
                    double porcentajeComision = Double.parseDouble(this.jTFPorcentajeC.getText());
                    EmpleadoPorComision empleadoComision = new EmpleadoPorComision(this.jTFNombrexC.getText(),
                    fechaNacimientoC, fechaIngresoC,valorVendido,porcentajeComision);
                    this.jTAImprimirExC.setText(empleadoComision.toString());
                    this.listaEncadenada.addOrdenar(empleadoComision);
                    this.jTAListaEmpleados.setText(listaEncadenada.toString());
            }else{
                    this.jTFNacimientoxC.setText("");
                    this.jTFIngresoxC.setText("");
            }  
                break;
            case 2: 
                Fecha fechaNacimientoA = new Fecha(this.jTFNacimientoxB.getText());
                Fecha fechaIngresoA = new Fecha(this.jTFIngresoxB.getText());
                if(fechaNacimientoA.fechaValida() && fechaIngresoA.fechaValida()){
                    double salario= Double.parseDouble(this.jTFSoloBase.getText());
                    EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado(
                    this.jTFNombrexB.getText(),fechaNacimientoA, fechaIngresoA,salario);
                    this.jTAImprimirExB.setText(empleadoAsalariado.toString());
                    this.listaEncadenada.addOrdenar(empleadoAsalariado);
                    this.jTAListaEmpleados.setText(listaEncadenada.toString());
                }else{
                    this.jTFNacimientoxB.setText("");
                    this.jTFIngresoxB.setText("");
                }
                break;
            case 3: 
                
                Fecha fechaNacimientoAC = new Fecha(this.jTFNacimientoxByC.getText());
                Fecha fechaIngresoAC = new Fecha(this.jTFIngresoxByC.getText());
                if(fechaNacimientoAC.fechaValida() && fechaIngresoAC.fechaValida()){
                    double valorVendido = Double.parseDouble(this.jTFVendidoxByC.getText());
                    double porcentajeComision = Double.parseDouble(this.jTFPorcentajeByC.getText());
                    double salarioExtra = Double.parseDouble(this.jTFSalarioByC.getText());
                    EmpleadoBaseMasComision empleadoBaseYComision = new EmpleadoBaseMasComision(
                    this.jTFNombrexByC.getText(),fechaNacimientoAC, fechaIngresoAC,valorVendido,
                    porcentajeComision,salarioExtra);
                    this.jTAImprimirExByC.setText(empleadoBaseYComision.toString());
                    this.listaEncadenada.addOrdenar(empleadoBaseYComision);
                    this.jTAListaEmpleados.setText(listaEncadenada.toString());
                }else{
                    this.jTFNacimientoxByC.setText("");
                    this.jTFIngresoxByC.setText("");
                }
                
                break;
        
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jBBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarActionPerformed
        int i = this.jTabbedPane1.getSelectedIndex();
        switch(i)
        {
            case 0:
                String nombres = this.jTFNombrexH.getText();
                Fecha fechaNacimiento = new Fecha(this.jTFNacimientoxH.getText());
                Fecha fechaIngreso = new Fecha(this.jTFIngresoxH.getText());
                if(fechaNacimiento.fechaValida() && fechaIngreso.fechaValida()){
                    double numHorasTrabajadas = Double.parseDouble(this.jTFNumHoras.getText());
                    double valorXhora = Double.parseDouble(this.jTFValorxHora.getText());
                    EmpleadoPorHoras empleadoHoras = new EmpleadoPorHoras(this.jTFNombrexH.getText(),
                    fechaNacimiento, fechaIngreso,numHorasTrabajadas,valorXhora);
                    this.jTAImprimirExH.setText(empleadoHoras.toString());
                    String resultado = listaEncadenada.borrarEmpleadoPorNombre(empleadoHoras);
                    JOptionPane.showMessageDialog(null, resultado);
                    this.jTAListaEmpleados.setText(listaEncadenada.toString());
                }else{
                    this.jTFNacimientoxH.setText("");
                    this.jTFIngresoxH.setText("");
                }
                break;
            case 1:
                Fecha fechaNacimientoC = new Fecha(this.jTFNacimientoxC.getText());
                Fecha fechaIngresoC = new Fecha(this.jTFIngresoxC.getText());
                if(fechaNacimientoC.fechaValida() && fechaIngresoC.fechaValida()){
                    double valorVendido = Double.parseDouble(this.jTFVendidoC.getText());
                    double porcentajeComision = Double.parseDouble(this.jTFPorcentajeC.getText());
                    EmpleadoPorComision empleadoComision = new EmpleadoPorComision(this.jTFNombrexC.getText(),
                    fechaNacimientoC, fechaIngresoC,valorVendido,porcentajeComision);
                    this.jTAImprimirExC.setText(empleadoComision.toString());
                    String resultado = listaEncadenada.borrarEmpleadoPorNombre(empleadoComision);
                    JOptionPane.showMessageDialog(null, resultado);
                    this.jTAListaEmpleados.setText(listaEncadenada.toString());
            }else{
                    this.jTFNacimientoxC.setText("");
                    this.jTFIngresoxC.setText("");
            }  
                break;
            case 2: 
                Fecha fechaNacimientoA = new Fecha(this.jTFNacimientoxB.getText());
                Fecha fechaIngresoA = new Fecha(this.jTFIngresoxB.getText());
                if(fechaNacimientoA.fechaValida() && fechaIngresoA.fechaValida()){
                    double salario= Double.parseDouble(this.jTFSoloBase.getText());
                    EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado(
                    this.jTFNombrexB.getText(),fechaNacimientoA, fechaIngresoA,salario);
                    this.jTAImprimirExB.setText(empleadoAsalariado.toString());
                    String resultado = listaEncadenada.borrarEmpleadoPorNombre(empleadoAsalariado);
                    JOptionPane.showMessageDialog(null, resultado);
                    this.jTAListaEmpleados.setText(listaEncadenada.toString());
                }else{
                    this.jTFNacimientoxB.setText("");
                    this.jTFIngresoxB.setText("");
                }
                break;
            case 3: 
                
                Fecha fechaNacimientoAC = new Fecha(this.jTFNacimientoxByC.getText());
                Fecha fechaIngresoAC = new Fecha(this.jTFIngresoxByC.getText());
                if(fechaNacimientoAC.fechaValida() && fechaIngresoAC.fechaValida()){
                    double valorVendido = Double.parseDouble(this.jTFVendidoxByC.getText());
                    double porcentajeComision = Double.parseDouble(this.jTFPorcentajeByC.getText());
                    double salarioExtra = Double.parseDouble(this.jTFSalarioByC.getText());
                    EmpleadoBaseMasComision empleadoBaseYComision = new EmpleadoBaseMasComision(
                    this.jTFNombrexByC.getText(),fechaNacimientoAC, fechaIngresoAC,valorVendido,
                    porcentajeComision,salarioExtra);
                    this.jTAImprimirExByC.setText(empleadoBaseYComision.toString());
                    String resultado = listaEncadenada.borrarEmpleadoPorNombre(empleadoBaseYComision);
                    JOptionPane.showMessageDialog(null, resultado);
                    this.jTAListaEmpleados.setText(listaEncadenada.toString());
                }else{
                    this.jTFNacimientoxByC.setText("");
                    this.jTFIngresoxByC.setText("");
                }
                
                break;
        
        }
    }//GEN-LAST:event_jBBorrarActionPerformed

    private void jTFIngresoxHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFIngresoxHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFIngresoxHActionPerformed

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
            java.util.logging.Logger.getLogger(JFEmpleadosListaEncadenada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFEmpleadosListaEncadenada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFEmpleadosListaEncadenada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFEmpleadosListaEncadenada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFEmpleadosListaEncadenada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAcepatarBase;
    private javax.swing.JButton jBAcepatarBaseyComision;
    private javax.swing.JButton jBAcepatarComision;
    private javax.swing.JButton jBAcepatarHoras;
    private javax.swing.JButton jBAñadirFinal;
    private javax.swing.JButton jBBorrar;
    private javax.swing.JButton jBInicio;
    private javax.swing.JButton jButton2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPAsalariado;
    private javax.swing.JPanel jPBaseComision;
    private javax.swing.JPanel jPComision;
    private javax.swing.JPanel jPHoras;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextArea jTAImprimirExB;
    private javax.swing.JTextArea jTAImprimirExByC;
    private javax.swing.JTextArea jTAImprimirExC;
    private javax.swing.JTextArea jTAImprimirExH;
    private javax.swing.JTextArea jTAListaEmpleados;
    private javax.swing.JTextField jTFIngresoxB;
    private javax.swing.JTextField jTFIngresoxByC;
    private javax.swing.JTextField jTFIngresoxC;
    private javax.swing.JTextField jTFIngresoxH;
    private javax.swing.JTextField jTFNacimientoxB;
    private javax.swing.JTextField jTFNacimientoxByC;
    private javax.swing.JTextField jTFNacimientoxC;
    private javax.swing.JTextField jTFNacimientoxH;
    private javax.swing.JTextField jTFNombrexB;
    private javax.swing.JTextField jTFNombrexByC;
    private javax.swing.JTextField jTFNombrexC;
    private javax.swing.JTextField jTFNombrexH;
    private javax.swing.JTextField jTFNumHoras;
    private javax.swing.JTextField jTFPorcentajeByC;
    private javax.swing.JTextField jTFPorcentajeC;
    private javax.swing.JTextField jTFSalarioByC;
    private javax.swing.JTextField jTFSoloBase;
    private javax.swing.JTextField jTFValorxHora;
    private javax.swing.JTextField jTFVendidoC;
    private javax.swing.JTextField jTFVendidoxByC;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
