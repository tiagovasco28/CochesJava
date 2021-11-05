/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import recursos.Vehiculos;

/**
 *
 * @author Vasco
 */
public class Vista extends javax.swing.JFrame {

    /**
     * Creates new form Coches
     */
    // crear arraylist con la propriedad vehiculos;
    ArrayList<Vehiculos> lista = new ArrayList<>();

    public Vista() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        inputNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        inputMarca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inputModelo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        inputColor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        inputPrecio = new javax.swing.JTextField();
        btn_terminos = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        btn_leer1 = new javax.swing.JButton();
        btn_contrato = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");

        inputNombre.setBackground(new java.awt.Color(51, 51, 51));
        inputNombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        inputNombre.setForeground(new java.awt.Color(255, 255, 255));
        inputNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        inputNombre.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                inputNombreInputMethodTextChanged(evt);
            }
        });
        inputNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNombreActionPerformed(evt);
            }
        });
        inputNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputNombreKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Marca");

        inputMarca.setBackground(new java.awt.Color(51, 51, 51));
        inputMarca.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        inputMarca.setForeground(new java.awt.Color(255, 255, 255));
        inputMarca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        inputMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputMarcaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Modelo");

        inputModelo.setBackground(new java.awt.Color(51, 51, 51));
        inputModelo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        inputModelo.setForeground(new java.awt.Color(255, 255, 255));
        inputModelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Color");

        inputColor.setBackground(new java.awt.Color(51, 51, 51));
        inputColor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        inputColor.setForeground(new java.awt.Color(255, 255, 255));
        inputColor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Precio");

        inputPrecio.setBackground(new java.awt.Color(51, 51, 51));
        inputPrecio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        inputPrecio.setForeground(new java.awt.Color(255, 255, 255));
        inputPrecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        inputPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPrecioActionPerformed(evt);
            }
        });

        btn_terminos.setBackground(new java.awt.Color(102, 102, 102));
        btn_terminos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_terminos.setForeground(new java.awt.Color(255, 255, 255));
        btn_terminos.setText("Terminos");
        btn_terminos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_terminos.setBorderPainted(false);
        btn_terminos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_terminosActionPerformed(evt);
            }
        });

        btn_add.setBackground(new java.awt.Color(0, 153, 153));
        btn_add.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_add.setForeground(new java.awt.Color(255, 255, 255));
        btn_add.setText("Registrar");
        btn_add.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_add.setBorderPainted(false);
        btn_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addMouseClicked(evt);
            }
        });
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        table1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Marca", "Modelo", "Color", "Precio"
            }
        ));
        table1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        table1.setGridColor(new java.awt.Color(153, 153, 153));
        table1.setSelectionBackground(new java.awt.Color(0, 204, 153));
        table1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                table1PropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        table2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Marca", "Modelo", "Color", "Precio"
            }
        ));
        jScrollPane3.setViewportView(table2);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Registro de Coches");

        btn_leer1.setBackground(new java.awt.Color(102, 102, 102));
        btn_leer1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_leer1.setForeground(new java.awt.Color(255, 255, 255));
        btn_leer1.setText("Leer");
        btn_leer1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_leer1.setBorderPainted(false);
        btn_leer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_leer1ActionPerformed(evt);
            }
        });

        btn_contrato.setBackground(new java.awt.Color(204, 102, 0));
        btn_contrato.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_contrato.setForeground(new java.awt.Color(255, 255, 255));
        btn_contrato.setText("Contrato");
        btn_contrato.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_contrato.setBorderPainted(false);
        btn_contrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_contratoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(inputColor, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(inputModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(inputMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(inputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_leer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_terminos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_contrato, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 58, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(inputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(inputColor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(inputPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_leer1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_terminos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_contrato, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(816, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inputPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPrecioActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
  
        if (inputNombre.getText().equals("") || inputMarca.getText().equals("") || inputModelo.getText().equals("") || inputColor.getText().equals("") || inputPrecio.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos");
        } else {
            String entradaMarca = inputMarca.getText().toUpperCase();
            if (entradaMarca.contains("SEAT") || entradaMarca.contains("AUDI") || entradaMarca.contains("MERCEDES") || entradaMarca.contains("BMW") || entradaMarca.contains("RENAULT")) {
                Vehiculos vehiculo = new Vehiculos(inputNombre.getText().toUpperCase(), inputMarca.getText().toUpperCase(), inputModelo.getText().toUpperCase(), inputColor.getText().toUpperCase(), inputPrecio.getText().toUpperCase());
                lista.add(vehiculo);

                // mostrar info en la tabla
                visualizarDatos();

                // limpiar campos
                inputNombre.setText("");
                inputMarca.setText("");
                inputModelo.setText("");
                inputColor.setText("");
                inputPrecio.setText("");

            } else {
                JOptionPane.showMessageDialog(null, "Marca no disponible!" + "\n Marcas disponibles: Audi, Mercedes, BMW, Renault, Seat");
                inputMarca.setText("");
            }
        }

    }//GEN-LAST:event_btn_addActionPerformed

    public void visualizarDatos() {

        String matriz[][] = new String[lista.size()][5];

        for (int i = 0; i < lista.size(); i++) {

            matriz[i][0] = lista.get(i).getNombre(); // matriz [linea][columna]
            matriz[i][1] = lista.get(i).getMarca();
            matriz[i][2] = lista.get(i).getModelo();
            matriz[i][3] = lista.get(i).getColor();
            matriz[i][4] = lista.get(i).getPrecio();
        }

        table1.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "Nombre", "Marca", "Modelo", "Color", "Precio"
                }
        ));

    }

    public void copiarDatos() {

        String matriz[][] = new String[lista.size()][5];

        for (int i = 0; i < lista.size(); i++) {

            matriz[i][0] = (String) table1.getValueAt(i, 0);
            matriz[i][1] = (String) table1.getValueAt(i, 1);
            matriz[i][2] = (String) table1.getValueAt(i, 2);
            matriz[i][3] = (String) table1.getValueAt(i, 3);
            matriz[i][4] = (String) table1.getValueAt(i, 4);
        }

        table2.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "Nombre", "Marca", "Modelo", "Color", "Precio"
                }
        ));

    }


    private void table1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_table1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_table1PropertyChange

    private void btn_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btn_addMouseClicked

    private void btn_terminosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_terminosActionPerformed
        // TODO add your handling code here:

        int row = Vista.table1.getSelectedColumn();

        System.out.println("linea " + row);

        if (row <= 0) {
            JOptionPane.showMessageDialog(null, "Seleccione un item en la tabla para visualizar los terminos.");
        } else {
            Vista2 vista2 = new Vista2();
            vista2.setVisible(true);
        }
    }//GEN-LAST:event_btn_terminosActionPerformed

    private void btn_leer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_leer1ActionPerformed
        // TODO add your handling code here:
        if (table1.getRowCount() == 0) {
            System.out.println("Tabala vacia.");
            JOptionPane.showMessageDialog(null, "Tabala sin datos para leer");
        }
        copiarDatos();
    }//GEN-LAST:event_btn_leer1ActionPerformed

    private void inputMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputMarcaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_inputMarcaActionPerformed

    private void inputNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNombreActionPerformed

    private void inputNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputNombreKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_inputNombreKeyPressed

    private void inputNombreInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_inputNombreInputMethodTextChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_inputNombreInputMethodTextChanged

    private void btn_contratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_contratoActionPerformed
        // TODO add your handling code here:

        int row = Vista.table1.getSelectedColumn();

        System.out.println("linea " + row);

        if (row <= 0) {
            JOptionPane.showMessageDialog(null, "Seleccione un item en la Primera tabla para generar un contrato.");
        } else {
            Vista3 vista3 = new Vista3();
            vista3.setVisible(true);
        }
    }//GEN-LAST:event_btn_contratoActionPerformed

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_contrato;
    private javax.swing.JButton btn_leer1;
    private javax.swing.JButton btn_terminos;
    private javax.swing.JTextField inputColor;
    private javax.swing.JTextField inputMarca;
    private javax.swing.JTextField inputModelo;
    private javax.swing.JTextField inputNombre;
    private javax.swing.JTextField inputPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JTable table1;
    private static javax.swing.JTable table2;
    // End of variables declaration//GEN-END:variables
}
