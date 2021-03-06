
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juanro49
 */
public class Grafica extends javax.swing.JFrame {

    static ArrayList <Asalariado> listaEmpleados = new <Asalariado> ArrayList();
    /**
     * Creates new form Grafica
     */
    public Grafica() {
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menAlta = new javax.swing.JMenu();
        mitAsa = new javax.swing.JMenuItem();
        mitProd = new javax.swing.JMenuItem();
        mitDrist = new javax.swing.JMenuItem();
        menLista = new javax.swing.JMenu();
        menSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Control Empleados");

        menAlta.setText("Alta Empleado");

        mitAsa.setText("Asalariado");
        mitAsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitAsaActionPerformed(evt);
            }
        });
        menAlta.add(mitAsa);

        mitProd.setText("Empleado Producción");
        mitProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitProdActionPerformed(evt);
            }
        });
        menAlta.add(mitProd);

        mitDrist.setText("Empleado Distribución");
        mitDrist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitDristActionPerformed(evt);
            }
        });
        menAlta.add(mitDrist);

        jMenuBar1.add(menAlta);

        menLista.setText("Listado Empleados");
        menLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menListaMouseClicked(evt);
            }
        });
        jMenuBar1.add(menLista);

        menSalir.setText("Salir");
        menSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(menSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel1)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_menSalirMouseClicked

    private void mitAsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitAsaActionPerformed
        new AltaAsalariados().setVisible(true);
    }//GEN-LAST:event_mitAsaActionPerformed

    private void mitProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitProdActionPerformed
        new AltaProduccion().setVisible(true);
    }//GEN-LAST:event_mitProdActionPerformed

    private void mitDristActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitDristActionPerformed
        new AltaDistribucion().setVisible(true);
    }//GEN-LAST:event_mitDristActionPerformed

    private void menListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menListaMouseClicked
        new MostrarEmpleados().setVisible(true);
    }//GEN-LAST:event_menListaMouseClicked

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
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menAlta;
    private javax.swing.JMenu menLista;
    private javax.swing.JMenu menSalir;
    private javax.swing.JMenuItem mitAsa;
    private javax.swing.JMenuItem mitDrist;
    private javax.swing.JMenuItem mitProd;
    // End of variables declaration//GEN-END:variables
}
