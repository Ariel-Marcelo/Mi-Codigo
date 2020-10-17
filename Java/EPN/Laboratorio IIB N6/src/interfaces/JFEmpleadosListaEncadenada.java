
package interfaces;

import Herencia.Empleado;
import Herencia.EmpleadoPorHoras;
import Herencia.EmpleadoAsalariado;
import Herencia.EmpleadoPorComision;
import Herencia.EmpleadoBaseMasComision;
import Herencia.Fecha;
import Herencia.ListaEncadenada;
import javax.swing.JOptionPane;
public class JFEmpleadosListaEncadenada extends javax.swing.JFrame {

    
    ListaEncadenada listaEncadenada;
    public JFEmpleadosListaEncadenada() {
        initComponents();
        listaEncadenada = new ListaEncadenada();
        this.setLocationRelativeTo(null);  
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTAListaEmpleados = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jBInicio = new javax.swing.JButton();
        jBAñadirFinal = new javax.swing.JButton();
        jBBorrar = new javax.swing.JButton();
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
        jComboBoxOrdenar = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTFNombreAEliminar = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jCBBusqueda = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTAEmpleadoBuscado = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Empleados");

        jTAListaEmpleados.setEditable(false);
        jTAListaEmpleados.setColumns(20);
        jTAListaEmpleados.setRows(5);
        jScrollPane1.setViewportView(jTAListaEmpleados);

        jLabel2.setText("Lista Empleados ordenada por:");

        jBInicio.setText("Inicio");
        jBInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInicioActionPerformed(evt);
            }
        });

        jBAñadirFinal.setText("Final");
        jBAñadirFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAñadirFinalActionPerformed(evt);
            }
        });

        jBBorrar.setText("Borrar");
        jBBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBorrarActionPerformed(evt);
            }
        });

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 125, 0)));

        jLabel8.setText("Nombre y Apellido");

        jTFNombrexH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNombrexHActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPHorasLayout = new javax.swing.GroupLayout(jPHoras);
        jPHoras.setLayout(jPHorasLayout);
        jPHorasLayout.setHorizontalGroup(
            jPHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPHorasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPHorasLayout.createSequentialGroup()
                        .addGroup(jPHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFNacimientoxH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(jTFNombrexH, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFIngresoxH, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFNumHoras)
                            .addComponent(jTFValorxHora)))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jPHorasLayout.setVerticalGroup(
            jPHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPHorasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTFNombrexH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jTFNacimientoxH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFIngresoxH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(18, 18, 18)
                .addGroup(jPHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jTFNumHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jTFValorxHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        javax.swing.GroupLayout jPComisionLayout = new javax.swing.GroupLayout(jPComision);
        jPComision.setLayout(jPComisionLayout);
        jPComisionLayout.setHorizontalGroup(
            jPComisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPComisionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPComisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane6)
                    .addGroup(jPComisionLayout.createSequentialGroup()
                        .addGroup(jPComisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPComisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel17)
                                .addComponent(jLabel19)
                                .addComponent(jLabel20)
                                .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel21))
                        .addGap(94, 94, 94)
                        .addGroup(jPComisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFNacimientoxC, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFNombrexC, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFIngresoxC, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFVendidoC, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFPorcentajeC, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPComisionLayout.setVerticalGroup(
            jPComisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPComisionLayout.createSequentialGroup()
                .addGroup(jPComisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPComisionLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel17)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPComisionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTFNombrexC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
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
                .addGap(21, 21, 21)
                .addGroup(jPComisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTFPorcentajeC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        jTabbedPane1.addTab("Por Comisión", jPComision);

        jLabel3.setText("Nombre y Apellido");

        jLabel4.setText("Fecha de Nacimiento dd/mm/aaaa:");

        jLabel5.setText("Fecha de Ingreso dd/mm/aaaa:");

        jLabel6.setText("Salario Básico:");

        jTAImprimirExB.setColumns(20);
        jTAImprimirExB.setRows(5);
        jScrollPane4.setViewportView(jTAImprimirExB);

        javax.swing.GroupLayout jPAsalariadoLayout = new javax.swing.GroupLayout(jPAsalariado);
        jPAsalariado.setLayout(jPAsalariadoLayout);
        jPAsalariadoLayout.setHorizontalGroup(
            jPAsalariadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPAsalariadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPAsalariadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPAsalariadoLayout.createSequentialGroup()
                        .addGroup(jPAsalariadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addGroup(jPAsalariadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFIngresoxB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(jTFNacimientoxB, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFNombrexB, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFSoloBase))))
                .addGap(25, 25, 25))
        );
        jPAsalariadoLayout.setVerticalGroup(
            jPAsalariadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAsalariadoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
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
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        javax.swing.GroupLayout jPBaseComisionLayout = new javax.swing.GroupLayout(jPBaseComision);
        jPBaseComision.setLayout(jPBaseComisionLayout);
        jPBaseComisionLayout.setHorizontalGroup(
            jPBaseComisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPBaseComisionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPBaseComisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPBaseComisionLayout.createSequentialGroup()
                        .addGroup(jPBaseComisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addGroup(jPBaseComisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFNacimientoxByC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFIngresoxByC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFSalarioByC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFVendidoxByC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFPorcentajeByC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPBaseComisionLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTFNombrexByC, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        jPBaseComisionLayout.setVerticalGroup(
            jPBaseComisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBaseComisionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPBaseComisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFNombrexByC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPBaseComisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNacimientoxByC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPBaseComisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTFIngresoxByC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPBaseComisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTFSalarioByC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPBaseComisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTFVendidoxByC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPBaseComisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTFPorcentajeByC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Base mas Comision", jPBaseComision);

        jComboBoxOrdenar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre" }));
        jComboBoxOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOrdenarActionPerformed(evt);
            }
        });

        jLabel7.setText("Agregar Nuevo Empleado al:");

        jLabel9.setText("Nombre del Empleado:");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 0, 0)));

        jLabel16.setText("Buscar Empleado por:");

        jCBBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mayor Sueldo" }));
        jCBBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBBusquedaActionPerformed(evt);
            }
        });

        jTAEmpleadoBuscado.setColumns(20);
        jTAEmpleadoBuscado.setRows(5);
        jScrollPane3.setViewportView(jTAEmpleadoBuscado);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jCBBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(jCBBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel15.setText("ELIMINAR EMPLEADO:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(25, 25, 25)
                                        .addComponent(jBInicio)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBAñadirFinal))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBoxOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTFNombreAEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel15))
                                .addGap(0, 20, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBBorrar)
                        .addGap(56, 56, 56)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jBAñadirFinal)
                                .addComponent(jBInicio)))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jComboBoxOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFNombreAEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addComponent(jBBorrar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFValorxHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFValorxHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFValorxHoraActionPerformed

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

    private void jBBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarActionPerformed
        
        String respuesta = this.listaEncadenada.borrarEmpleadoPorNombre(this.jTFNombreAEliminar.getText());
        JOptionPane.showMessageDialog(null, respuesta);
        this.jTAListaEmpleados.setText(listaEncadenada.toString());
    }//GEN-LAST:event_jBBorrarActionPerformed

    private void jTFIngresoxHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFIngresoxHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFIngresoxHActionPerformed

    private void jTFNombrexHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNombrexHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNombrexHActionPerformed

    private void jComboBoxOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOrdenarActionPerformed
        int ordenar = this.jComboBoxOrdenar.getSelectedIndex();
        switch(ordenar)
        {
            case 0:
                listaEncadenada.addOrdenar();
            
            break;
            
        }
        this.jTAListaEmpleados.setText(listaEncadenada.toString());
    }//GEN-LAST:event_jComboBoxOrdenarActionPerformed

    private void jCBBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBBusquedaActionPerformed
        int buscar = this.jCBBusqueda.getSelectedIndex();
        switch(buscar)
        {
            case 0:
                Empleado empleadoBuscado = this.listaEncadenada.mayorSueldo();
                jTAEmpleadoBuscado.setText(empleadoBuscado.toString());
            break;
        }
        
    }//GEN-LAST:event_jCBBusquedaActionPerformed

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
    private javax.swing.JButton jBAñadirFinal;
    private javax.swing.JButton jBBorrar;
    private javax.swing.JButton jBInicio;
    private javax.swing.JComboBox<String> jCBBusqueda;
    private javax.swing.JComboBox<String> jComboBoxOrdenar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPAsalariado;
    private javax.swing.JPanel jPBaseComision;
    private javax.swing.JPanel jPComision;
    private javax.swing.JPanel jPHoras;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextArea jTAEmpleadoBuscado;
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
    private javax.swing.JTextField jTFNombreAEliminar;
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
