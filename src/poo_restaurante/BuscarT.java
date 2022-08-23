package poo_restaurante;

import javax.swing.JOptionPane;

/**
 *
 * @author Cphyros
 */
public class BuscarT extends javax.swing.JInternalFrame {

    public IngresarT formIngresarT;

    public BuscarT(IngresarT f2) {
        initComponents();
        formIngresarT = f2;
    }

    //Se compara el rut con los id dentro del array
    //y si lo encuentra imprime los datos del Trabajador encontrado
    public String BuscarTrabajador(String rut) {
        String info = " Detalle del Trabajador \n\n";
        for (int i = 0; i < formIngresarT.cont; i++) {
            if (rut.equals(formIngresarT.traArray[i].getRut())) {
                info = info + "Nombre: " + formIngresarT.traArray[i].getNombre() + "\n";
                info = info + "Puesto: " + formIngresarT.traArray[i].getPuesto() + "\n";
                info = info + "Fono: " + formIngresarT.traArray[i].getFono() + "\n";
            }
        }
        return info;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        rut = new javax.swing.JTextField();
        Buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        informacion = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Buscar Trabajador");

        jPanel1.setBackground(new java.awt.Color(145, 31, 39));

        rut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rutActionPerformed(evt);
            }
        });

        Buscar.setBackground(new java.awt.Color(250, 206, 127));
        Buscar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Buscar.setForeground(new java.awt.Color(51, 51, 51));
        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        informacion.setEditable(false);
        informacion.setBackground(new java.awt.Color(250, 206, 127));
        informacion.setColumns(20);
        informacion.setRows(5);
        jScrollPane1.setViewportView(informacion);

        jLabel2.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(250, 206, 127));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Consultar datos del Trabajador");
        jLabel2.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(250, 206, 127));
        jLabel1.setText("Rut Trabajador");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(rut, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rut, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rutActionPerformed

    //Al apretar el boton si el campo de texto esta vacio pide que lo ingreses
    //Si esta ingresado se guarda en una variable la info del metodo y luego se imprime    
    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        // TODO add your handling code here:
        if (rut.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar el identificador primero");
        } else {
            String i = BuscarTrabajador(rut.getText());
            informacion.setText(i);
        }
    }//GEN-LAST:event_BuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JTextArea informacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField rut;
    // End of variables declaration//GEN-END:variables
}
