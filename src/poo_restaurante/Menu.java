package poo_restaurante;

import javax.swing.JOptionPane;

/**
 *
 * @author cphyros
 */
public class Menu extends javax.swing.JFrame { //Herencia

    //ATRIBUTOS
    IngresarC formIngresarC;
    IngresarP formIngresarP;// Asociacion Composicion
    IngresarT formIngresarT;

    //CONSTRUCTOR
    public Menu() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        setTitle("Menú");
        formIngresarC = new IngresarC();
        formIngresarP = new IngresarP(formIngresarC);
        formIngresarT = new IngresarT();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        BG = new javax.swing.JPanel();
        LOGO = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        GestionarCliyPed = new javax.swing.JMenu();
        IngresarCliente = new javax.swing.JMenuItem();
        ListadoDeClientes = new javax.swing.JMenuItem();
        BuscarCliente = new javax.swing.JMenuItem();
        GestionarTra = new javax.swing.JMenu();
        IngresarTrabajador = new javax.swing.JMenuItem();
        ListarTrab = new javax.swing.JMenuItem();
        BuscarTrab = new javax.swing.JMenuItem();
        ListarTXP = new javax.swing.JMenuItem();
        GestionarPed = new javax.swing.JMenu();
        IngresarPedido = new javax.swing.JMenuItem();
        ListadoDePedi = new javax.swing.JMenuItem();
        ListarPedporClie = new javax.swing.JMenuItem();
        ListadoPenT = new javax.swing.JMenuItem();
        BuscarPedido = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(251, 248, 241));

        desktopPane.setBackground(new java.awt.Color(251, 248, 241));

        BG.setBackground(new java.awt.Color(145, 31, 39));

        LOGO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenés/logoDelRestaurante.png"))); // NOI18N
        LOGO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel1.setFont(new java.awt.Font("Cooper Black", 0, 68)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(250, 206, 127));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Dear Burger");

        javax.swing.GroupLayout BGLayout = new javax.swing.GroupLayout(BG);
        BG.setLayout(BGLayout);
        BGLayout.setHorizontalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LOGO, javax.swing.GroupLayout.DEFAULT_SIZE, 883, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BGLayout.setVerticalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addComponent(LOGO, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        desktopPane.setLayer(BG, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        menuBar.setForeground(new java.awt.Color(51, 51, 51));
        menuBar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        GestionarCliyPed.setForeground(new java.awt.Color(51, 51, 51));
        GestionarCliyPed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenés/gestionarClientes.png"))); // NOI18N
        GestionarCliyPed.setText("Gestionar Clientes");
        GestionarCliyPed.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        IngresarCliente.setText("Ingresar Cliente");
        IngresarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarClienteActionPerformed(evt);
            }
        });
        GestionarCliyPed.add(IngresarCliente);

        ListadoDeClientes.setText("Listado de Clientes");
        ListadoDeClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListadoDeClientesActionPerformed(evt);
            }
        });
        GestionarCliyPed.add(ListadoDeClientes);

        BuscarCliente.setText("Buscar Cliente");
        BuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarClienteActionPerformed(evt);
            }
        });
        GestionarCliyPed.add(BuscarCliente);

        menuBar.add(GestionarCliyPed);

        GestionarTra.setForeground(new java.awt.Color(51, 51, 51));
        GestionarTra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenés/gestionarTrabajadores.png"))); // NOI18N
        GestionarTra.setText("Gestionar Trabajadores");
        GestionarTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionarTraActionPerformed(evt);
            }
        });

        IngresarTrabajador.setText("Ingresar Trabajador");
        IngresarTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarTrabajadorActionPerformed(evt);
            }
        });
        GestionarTra.add(IngresarTrabajador);

        ListarTrab.setText("Listar Trabajadores");
        ListarTrab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarTrabActionPerformed(evt);
            }
        });
        GestionarTra.add(ListarTrab);

        BuscarTrab.setText("Buscar Trabajador");
        BuscarTrab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarTrabActionPerformed(evt);
            }
        });
        GestionarTra.add(BuscarTrab);

        ListarTXP.setText("Listar Trabajadores por Puesto");
        ListarTXP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarTXPActionPerformed(evt);
            }
        });
        GestionarTra.add(ListarTXP);

        menuBar.add(GestionarTra);

        GestionarPed.setForeground(new java.awt.Color(51, 51, 51));
        GestionarPed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenés/gestionarPedidos.png"))); // NOI18N
        GestionarPed.setText("Gestionar Pedidos");

        IngresarPedido.setText("Ingresar Pedido");
        IngresarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarPedidoActionPerformed(evt);
            }
        });
        GestionarPed.add(IngresarPedido);

        ListadoDePedi.setText("Listado de Pedidos");
        ListadoDePedi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListadoDePediActionPerformed(evt);
            }
        });
        GestionarPed.add(ListadoDePedi);

        ListarPedporClie.setText("Listar Pedidos por Cliente");
        ListarPedporClie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarPedporClieActionPerformed(evt);
            }
        });
        GestionarPed.add(ListarPedporClie);

        ListadoPenT.setText("Listado de Pedido en Tabla");
        ListadoPenT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListadoPenTActionPerformed(evt);
            }
        });
        GestionarPed.add(ListadoPenT);

        BuscarPedido.setText("Buscar Pedido");
        BuscarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarPedidoActionPerformed(evt);
            }
        });
        GestionarPed.add(BuscarPedido);

        menuBar.add(GestionarPed);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //SOLO SE ABRIRA IngresarP CARGANDO LOS DATOS DE IngresarC EN EL COMBOBOX
    //SI YA HAY CLIENTES REGISTRADOS
    private void IngresarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarPedidoActionPerformed
        if (formIngresarC.cont > 0) {
            formIngresarP.CargarComboNombre(formIngresarC);
            desktopPane.add(formIngresarP);
            formIngresarP.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese cliente primero");
        }
    }//GEN-LAST:event_IngresarPedidoActionPerformed

    //SOLO SE ABRIRA ListarP CARGANDO LOS DATOS DE IngresarP
    //SI YA HAY PEDIDOS REGISTRADOS
    private void ListadoDePediActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListadoDePediActionPerformed
        if (formIngresarP.cont > 0) {
            String info = formIngresarP.listarDeliverys();
            ListarP form4 = new ListarP(info);
            desktopPane.add(form4);
            form4.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "No hay información disponible de delivery");
        }
    }//GEN-LAST:event_ListadoDePediActionPerformed

    //SOLO SE ABRIRA BuscarP CARGANDO LOS DATOS DE IngresarP
    //SI YA HAY PEDIDOS REGISTRADOS
    private void BuscarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarPedidoActionPerformed
        if (formIngresarP.cont > 0) {
            BuscarP form2 = new BuscarP(formIngresarP);
            desktopPane.add(form2);
            form2.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "No hay informacion para buscar");
        }
    }//GEN-LAST:event_BuscarPedidoActionPerformed

    //SOLO SE ABRIRA ListarPedidos2 CARGANDO LOS DATOS DE IngresarP
    //SI YA HAY PEDIDOS REGISTRADOS
    private void ListadoPenTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListadoPenTActionPerformed
        if (formIngresarP.cont > 0) {
            ListarPedidos2 form4 = new ListarPedidos2(formIngresarP);
            desktopPane.add(form4);
            form4.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "No hay información disponible de delivery");
        }
    }//GEN-LAST:event_ListadoPenTActionPerformed

    //SOLO SE ABRIRA ListarXC CARGANDO LOS DATOS DE IngresarP
    //SI YA HAY CLIENTES REGISTRADOS
    private void ListarPedporClieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarPedporClieActionPerformed
        if (formIngresarC.cont > 0) {
            ListarXC form4 = new ListarXC(formIngresarP);
            desktopPane.add(form4);
            form4.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "No hay información disponible");
        }
    }//GEN-LAST:event_ListarPedporClieActionPerformed

    private void GestionarTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionarTraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GestionarTraActionPerformed

    //ABRE FORMULARIO IngresarT
    private void IngresarTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarTrabajadorActionPerformed
        desktopPane.add(formIngresarT);
        formIngresarT.setVisible(true);
    }//GEN-LAST:event_IngresarTrabajadorActionPerformed

    //SOLO SE ABRIRA ListarTrabajadores CARGANDO LOS DATOS DE IngresarT
    //SI YA HAY TRABAJADORES REGISTRADOS
    private void ListarTrabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarTrabActionPerformed
        if (formIngresarT.cont > 0) {
            ListarTrabajadores form2 = new ListarTrabajadores(formIngresarT); // Dependencia
            desktopPane.add(form2);
            form2.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "No hay información disponible de trabajadores");
        }
    }//GEN-LAST:event_ListarTrabActionPerformed

    //SOLO SE ABRIRA BuscarT CARGANDO LOS DATOS DE IngresarT
    //SI YA HAY TRABAJADORES REGISTRADOS
    private void BuscarTrabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarTrabActionPerformed
        if (formIngresarT.cont > 0) {
            BuscarT form2 = new BuscarT(formIngresarT);
            desktopPane.add(form2);
            form2.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "No ay información para buscar");
        }
    }//GEN-LAST:event_BuscarTrabActionPerformed

    //SOLO SE ABRIRA ListarXP CARGANDO LOS DATOS DE IngresarT
    //SI YA HAY TRABAJADORES REGISTRADOS
    private void ListarTXPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarTXPActionPerformed
        if (formIngresarT.cont > 0) {
            ListarXP form4 = new ListarXP(formIngresarT);
            desktopPane.add(form4);
            form4.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "No hay información disponible");
        }
    }//GEN-LAST:event_ListarTXPActionPerformed

    //SOLO SE ABRIRA BuscarC CARGANDO LOS DATOS DE IngresarC
    //SI YA HAY CLIENTES REGISTRADOS
    private void BuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarClienteActionPerformed
        if (formIngresarC.cont > 0) {
            BuscarC form2 = new BuscarC(formIngresarC);
            desktopPane.add(form2);
            form2.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "No ay información para buscar");
        }
    }//GEN-LAST:event_BuscarClienteActionPerformed

    //SOLO SE ABRIRA ListarC CARGANDO LOS DATOS DEl METODO listarClientes DE IngresarC
    //SI YA HAY CLIENTES REGISTRADOS
    private void ListadoDeClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListadoDeClientesActionPerformed
        if (formIngresarC.cont > 0) {
            String info = formIngresarC.listarClientes();
            ListarC form2 = new ListarC(info); // Dependencia
            desktopPane.add(form2);
            form2.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "No hay información disponible de clientes");
        }
    }//GEN-LAST:event_ListadoDeClientesActionPerformed

    //ABRE FORMULARIO IngresarC
    private void IngresarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarClienteActionPerformed
        desktopPane.add(formIngresarC);
        formIngresarC.setVisible(true);
    }//GEN-LAST:event_IngresarClienteActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel BG;
    public javax.swing.JMenuItem BuscarCliente;
    public javax.swing.JMenuItem BuscarPedido;
    public javax.swing.JMenuItem BuscarTrab;
    public javax.swing.JMenu GestionarCliyPed;
    public javax.swing.JMenu GestionarPed;
    public javax.swing.JMenu GestionarTra;
    public javax.swing.JMenuItem IngresarCliente;
    public javax.swing.JMenuItem IngresarPedido;
    public javax.swing.JMenuItem IngresarTrabajador;
    public javax.swing.JLabel LOGO;
    public javax.swing.JMenuItem ListadoDeClientes;
    public javax.swing.JMenuItem ListadoDePedi;
    public javax.swing.JMenuItem ListadoPenT;
    public javax.swing.JMenuItem ListarPedporClie;
    public javax.swing.JMenuItem ListarTXP;
    public javax.swing.JMenuItem ListarTrab;
    public javax.swing.JDesktopPane desktopPane;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
