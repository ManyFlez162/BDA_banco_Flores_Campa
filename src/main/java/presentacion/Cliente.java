/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

/**
 *
 * @author juanc
 */
public class Cliente extends javax.swing.JFrame {

    /**
     * Creates new form Cliente
     */
    public Cliente() {
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
        textCrearCuenta = new javax.swing.JLabel();
        textFechaN = new javax.swing.JLabel();
        jtextoEdad = new javax.swing.JTextField();
        botonCrear = new javax.swing.JButton();
        botonRegresar = new javax.swing.JButton();
        textNombre = new javax.swing.JLabel();
        textApellidoP = new javax.swing.JLabel();
        textApellidoM = new javax.swing.JLabel();
        textEdad = new javax.swing.JLabel();
        jtextoIngresarNombre = new javax.swing.JTextField();
        jtextoIngresarApellidoP = new javax.swing.JTextField();
        jtextoIngresarApellidoM = new javax.swing.JTextField();
        jtextoIngresarFechaN = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textCrearCuenta.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        textCrearCuenta.setForeground(new java.awt.Color(255, 255, 255));
        textCrearCuenta.setText("Crear Cuenta");
        jPanel1.add(textCrearCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        textFechaN.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        textFechaN.setForeground(new java.awt.Color(255, 255, 255));
        textFechaN.setText("Fecha de nacimiento:");
        jPanel1.add(textFechaN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jtextoEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextoEdadActionPerformed(evt);
            }
        });
        jPanel1.add(jtextoEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 240, 30));

        botonCrear.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        botonCrear.setText("Crear");
        botonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearActionPerformed(evt);
            }
        });
        jPanel1.add(botonCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 80, -1));

        botonRegresar.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        botonRegresar.setText("Regresar");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(botonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, -1, -1));

        textNombre.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        textNombre.setForeground(new java.awt.Color(255, 255, 255));
        textNombre.setText("Nombre:");
        jPanel1.add(textNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        textApellidoP.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        textApellidoP.setForeground(new java.awt.Color(255, 255, 255));
        textApellidoP.setText("Apellido Paterno:");
        jPanel1.add(textApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        textApellidoM.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        textApellidoM.setForeground(new java.awt.Color(255, 255, 255));
        textApellidoM.setText("Apellido Materno:");
        jPanel1.add(textApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        textEdad.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        textEdad.setForeground(new java.awt.Color(255, 255, 255));
        textEdad.setText("Edad:");
        jPanel1.add(textEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jtextoIngresarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextoIngresarNombreActionPerformed(evt);
            }
        });
        jPanel1.add(jtextoIngresarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 240, 30));

        jtextoIngresarApellidoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextoIngresarApellidoPActionPerformed(evt);
            }
        });
        jPanel1.add(jtextoIngresarApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 240, 30));

        jtextoIngresarApellidoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextoIngresarApellidoMActionPerformed(evt);
            }
        });
        jPanel1.add(jtextoIngresarApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 240, 30));

        jtextoIngresarFechaN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextoIngresarFechaNActionPerformed(evt);
            }
        });
        jPanel1.add(jtextoIngresarFechaN, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 240, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtextoEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextoEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextoEdadActionPerformed

    private void botonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearActionPerformed

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void jtextoIngresarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextoIngresarNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextoIngresarNombreActionPerformed

    private void jtextoIngresarApellidoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextoIngresarApellidoPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextoIngresarApellidoPActionPerformed

    private void jtextoIngresarApellidoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextoIngresarApellidoMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextoIngresarApellidoMActionPerformed

    private void jtextoIngresarFechaNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextoIngresarFechaNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextoIngresarFechaNActionPerformed

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
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCrear;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jtextoEdad;
    private javax.swing.JTextField jtextoIngresarApellidoM;
    private javax.swing.JTextField jtextoIngresarApellidoP;
    private javax.swing.JTextField jtextoIngresarFechaN;
    private javax.swing.JTextField jtextoIngresarNombre;
    private javax.swing.JLabel textApellidoM;
    private javax.swing.JLabel textApellidoP;
    private javax.swing.JLabel textCrearCuenta;
    private javax.swing.JLabel textEdad;
    private javax.swing.JLabel textFechaN;
    private javax.swing.JLabel textNombre;
    // End of variables declaration//GEN-END:variables
}
