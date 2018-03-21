/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Toshiba
 */
public class CuentaB extends javax.swing.JFrame {

    /**
     * Creates new form CuentasB
     */
    public CuentaB() {
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        BancoPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("BancoPU").createEntityManager();
        cuetasbancariasQuery = java.beans.Beans.isDesignTime() ? null : BancoPUEntityManager.createQuery("SELECT c FROM Cuetasbancarias c");
        cuetasbancariasList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : cuetasbancariasQuery.getResultList();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cuenta = new javax.swing.JTextField();
        cliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tipo = new javax.swing.JTextField();
        fecha = new javax.swing.JTextField();
        saldo = new javax.swing.JTextField();
        btnGrabar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        movimiento = new javax.swing.JTextField();
        btnVisualizar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, cuetasbancariasList, tablaDatos);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${numeroCuenta}"));
        columnBinding.setColumnName("Numero Cuenta");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliente}"));
        columnBinding.setColumnName("Cliente");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tipoCuenta}"));
        columnBinding.setColumnName("Tipo Cuenta");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${movimiento}"));
        columnBinding.setColumnName("Movimiento");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fecha}"));
        columnBinding.setColumnName("Fecha");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${saldo}"));
        columnBinding.setColumnName("Saldo");
        columnBinding.setColumnClass(Double.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(tablaDatos);
        if (tablaDatos.getColumnModel().getColumnCount() > 0) {
            tablaDatos.getColumnModel().getColumn(0).setResizable(false);
            tablaDatos.getColumnModel().getColumn(1).setResizable(false);
            tablaDatos.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel1.setText("BANCO DE LOJA");

        jLabel3.setText("CLIENTE:");

        jLabel4.setText("TIPO DE CUENTA:");

        jLabel5.setText("FECHA:");

        jLabel6.setText("SALDO");

        cuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuentaActionPerformed(evt);
            }
        });

        cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteActionPerformed(evt);
            }
        });

        jLabel7.setText("NUMERO DE CUENTA:");

        fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaActionPerformed(evt);
            }
        });

        btnGrabar.setText("Grabar");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        jButton2.setText("salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setText("MOVIMIENTO:");

        movimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movimientoActionPerformed(evt);
            }
        });

        btnVisualizar.setText("Visualizar");
        btnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cuenta)
                                    .addComponent(cliente)
                                    .addComponent(tipo)
                                    .addComponent(fecha)
                                    .addComponent(saldo)
                                    .addComponent(movimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGrabar)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificar)
                                .addGap(18, 18, 18)
                                .addComponent(btnVisualizar)
                                .addGap(73, 73, 73)
                                .addComponent(jButton2)))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(movimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(saldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGrabar)
                    .addComponent(jButton2)
                    .addComponent(btnVisualizar)
                    .addComponent(btnModificar))
                .addGap(57, 57, 57)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuentaActionPerformed

    private void clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clienteActionPerformed

    private void fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaActionPerformed
Conexion con= new Conexion();
Connection cn= con.ControladorBadedeDatos();

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        String cta = cuenta.getText();
        String cli= cliente.getText();
        String tc= tipo.getText();
        String mv= movimiento.getText();
        String sdl= saldo.getText();
      
        
        try {
            Date fh= DateFormat.getDateInstance().parse(fecha.getText());
            PreparedStatement insertar = cn.prepareStatement("INSERT INTO Cuetasbancarias(NUMERO_CUENTA,CLIENTE,TIPO_CUENTA,MOVIMIENTO,FECHA,SALDO)VALUES(?,?,?,?,?,?)");

            insertar.setString(1, cta);
            insertar.setString(2, cli);
            insertar.setString(3, tc);
            insertar.setString(4, mv);
            insertar.setString(5, sdl);
            insertar.setDate(6, new java.sql.Date(4,10,1988));

            int d = insertar.executeUpdate();
            if (d > 0) {
                JOptionPane.showMessageDialog(null, " Cuenta Guardada");
                borrarDatos();
            } else {
                JOptionPane.showMessageDialog(null, "Cuenta no Guardada");
            }

        } catch (Exception e) {
            System.out.println("Datos no encontrados en la base de datos" + e);

        }

    }

    void borrarDatos() {
        cuenta.setText("");
        cliente.setText("");
        tipo.setText("");
        movimiento.setText("");
        
    

    }
     private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        int fila = tablaDatos.getSelectedRow();
        if (fila >= 0) {
            cuenta.setText(tablaDatos.getValueAt(fila, 0).toString());
            cliente.setText(tablaDatos.getValueAt(fila, 1).toString());
            tipo.setText(tablaDatos.getValueAt(fila, 2).toString());
            movimiento.setText(tablaDatos.getValueAt(fila, 3).toString());
            fecha.setText(tablaDatos.getValueAt(fila, 4).toString());
            saldo.setText(tablaDatos.getValueAt(fila, 4).toString());
           
           
        } else {
            JOptionPane.showMessageDialog(null, "Fila no seleccionada");
        }
    } 
        void mostraTabla() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Cuenta");
        modelo.addColumn("cliente");
        modelo.addColumn("tipo cuenta");
        modelo.addColumn("movimiento");
        
        
        tablaDatos.setModel(modelo);
        String sql = ("select * from CUENTA");
        String datos[] = new String[8];
        try {
            Statement stm = cn.createStatement();
            ResultSet result = stm.executeQuery(sql);
            while (result.next()) {
                datos[0] = result.getString(1);
                datos[1] = result.getString(2);
                datos[2] = result.getString(3);
                datos[3] = result.getString(4);
                
                
                modelo.addRow(datos);
            }
            tablaDatos.setModel(modelo);
        } catch (SQLException e) {
        }

    }
        
    void limpi() {
        cuenta.setText("");
        cliente.setText("");
        tipo.setText("");
        movimiento.setText("");
       
       
        
    }

     

    /**
     *
      TODO add your handling code here:
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void movimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_movimientoActionPerformed

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVisualizarActionPerformed
 * @param args the command line arguments
     */
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
     try {
            String mod = ("UPDATE Cuetasbancarias SET NUMERO_CUENTA='" + cuenta.getText()
                    + "',CLIENTE='" + cliente.getText()
                    + "',TIPO_CUENTA='" + tipo.getText()
                    + "',MOVIMIENTO='" + movimiento.getText()
                    
                    
                    + "' WHERE NUMERO_CUENTA='" + cliente.getText() + "'");
            PreparedStatement modificar = cn.prepareStatement(mod);
            modificar.executeUpdate();
            mostraTabla();
            limpi();
            System.out.println("Elementos modificados");
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                                           
        // TODO add your handling code here:
        dispose();
        try {
            cn.close();
            System.out.println("Conexion Cerrada");
        } catch (SQLException e) {
        }

           // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
  
    
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
            java.util.logging.Logger.getLogger(CuentaB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CuentaB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CuentaB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CuentaB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CuentaB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager BancoPUEntityManager;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVisualizar;
    private javax.swing.JTextField cliente;
    private javax.swing.JTextField cuenta;
    private java.util.List<Vista.Cuetasbancarias> cuetasbancariasList;
    private javax.persistence.Query cuetasbancariasQuery;
    private javax.swing.JTextField fecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField movimiento;
    private javax.swing.JTextField saldo;
    private javax.swing.JTable tablaDatos;
    private javax.swing.JTextField tipo;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

}