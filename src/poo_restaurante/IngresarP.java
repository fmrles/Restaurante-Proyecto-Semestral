package poo_restaurante;

import javax.swing.JOptionPane;

/**
 *
 * @author Cphyros
 */
public class IngresarP extends javax.swing.JInternalFrame {

    //ATRIBUTOS
    public IngresarC formIngresarC;
    public Pedido[] deliArray;
    public int cont;

    //CONSTRUCTOR
    public IngresarP(IngresarC form2) {
        initComponents();
        formIngresarC = form2;
        CargarComboNombre(formIngresarC);
        deliArray = new Pedido[50];
        cont = 0;
        this.identificador.setText(String.valueOf(cont + 1));
    }

    //SOLO VUELVE A RESTAURAR LOS CAMPOS
    public void borrarCampos() {
        this.direccion.setText("");
        this.burger1.setSelected(false);
        this.burger2.setSelected(false);
        this.burger3.setSelected(false);
        this.burger4.setSelected(false);
        this.burger5.setSelected(false);
        this.h1.setValue(0);
        this.h2.setValue(0);
        this.h3.setValue(0);
        this.h4.setValue(0);
        this.h5.setValue(0);
        this.bebida1.setSelected(false);
        this.bebida2.setSelected(false);
        this.bebida3.setSelected(false);
        this.bebida4.setSelected(false);
        this.bebida5.setSelected(false);
        this.bebida6.setSelected(false);
        this.b1.setValue(0);
        this.b2.setValue(0);
        this.b3.setValue(0);
        this.b4.setValue(0);
        this.b5.setValue(0);
        this.b6.setValue(0);
        this.aniadido1.setSelected(false);
        this.aniadido2.setSelected(false);
        this.aniadido3.setSelected(false);
        this.aniadido4.setSelected(false);
        this.a1.setValue(0);
        this.a2.setValue(0);
        this.a3.setValue(0);
        this.a4.setValue(0);
    }

    //USANDO EL OBJETO DE LA CLASE IngresarC SE CARGA EN EL COMBOBOX LOS NOMBRES DE LOS CLIENTES
    public void CargarComboNombre(IngresarC formIngresarC) {
        nombreC.removeAllItems();
        for (int i = 0; i < formIngresarC.cont; i++) {
            nombreC.addItem(formIngresarC.clArray[i].getNombre());
        }
    }

    //SE UTILIZA PARA DEVOLVER EL NOMBRE DEL CLIENTE COMO UN OBJETO DE LA CLASE Cliente
    public Cliente getCliente(String nombre) {
        for (int i = 0; i < formIngresarC.cont; i++) {
            if (formIngresarC.clArray[i].getNombre().equals(nombre)) {
                return formIngresarC.clArray[i];
            }
        }
        return null;
    }

    //AGREGA PEDIDO SOLO SI EL CONTADOR DE PEDIDOS NO SOBREPASA EL TAMAÑO DE LA ARRAY
    public void AgregarDelivery(Pedido d) {
        if (cont < deliArray.length) {
            deliArray[cont] = d;
            JOptionPane.showMessageDialog(null, "Pedido de " + deliArray[cont].getClienteNombre().getNombre() + " esta listo");
            cont++;
        } else {
            JOptionPane.showMessageDialog(null, "No se ha podido ingresar el pedido");
        }
    }

    //SOLO SI EL CONTADOR DE PEDIDOSS ES MAS QUE CERO SE LISTARAN LOS PEDIDOS HASTA EL MOMENTO AGREGADOS    
    public String listarDeliverys() {
        String info = " Deliverys registradas \n\n";
        if (cont == 0) {
            info = info + "\n\n No hay deliverys registradas ";
        } else {
            for (int i = 0; i < cont; i++) {

                info = info + "  " + deliArray[i].getClienteNombre().getNombre() + "  " + deliArray[i].getId() + " " + deliArray[i].getDireccion() + "  " + deliArray[i].getPedido() + "\n TOTAL= $" + deliArray[i].getPrecio() + "\n";

            }
        }
        return info;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        nombreC = new javax.swing.JComboBox<>();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        identificador = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        burger1 = new javax.swing.JToggleButton();
        burger2 = new javax.swing.JToggleButton();
        burger3 = new javax.swing.JToggleButton();
        burger4 = new javax.swing.JToggleButton();
        burger5 = new javax.swing.JToggleButton();
        h1 = new javax.swing.JSpinner();
        h2 = new javax.swing.JSpinner();
        h3 = new javax.swing.JSpinner();
        h4 = new javax.swing.JSpinner();
        h5 = new javax.swing.JSpinner();
        bebida1 = new javax.swing.JToggleButton();
        bebida2 = new javax.swing.JToggleButton();
        bebida3 = new javax.swing.JToggleButton();
        bebida4 = new javax.swing.JToggleButton();
        bebida5 = new javax.swing.JToggleButton();
        bebida6 = new javax.swing.JToggleButton();
        b1 = new javax.swing.JSpinner();
        b2 = new javax.swing.JSpinner();
        b3 = new javax.swing.JSpinner();
        b4 = new javax.swing.JSpinner();
        b5 = new javax.swing.JSpinner();
        b6 = new javax.swing.JSpinner();
        aniadido1 = new javax.swing.JToggleButton();
        aniadido2 = new javax.swing.JToggleButton();
        aniadido3 = new javax.swing.JToggleButton();
        aniadido4 = new javax.swing.JToggleButton();
        a1 = new javax.swing.JSpinner();
        a2 = new javax.swing.JSpinner();
        a3 = new javax.swing.JSpinner();
        a4 = new javax.swing.JSpinner();
        Guardar = new javax.swing.JButton();

        setBackground(new java.awt.Color(145, 31, 39));
        setClosable(true);
        setTitle("Ingresar Pedidos");

        jPanel1.setBackground(new java.awt.Color(145, 31, 39));

        jLayeredPane1.setBackground(new java.awt.Color(145, 31, 39));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 206, 127)), "Nombre Cliente", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Cooper Black", 0, 36), new java.awt.Color(250, 206, 127))); // NOI18N
        jLayeredPane1.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N

        nombreC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreCActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(nombreC, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 206, 127)), "Datos del Pedido/Delivery", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Cooper Black", 0, 36), new java.awt.Color(250, 206, 127))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(250, 206, 127));
        jLabel1.setText("Identificador");

        identificador.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        identificador.setForeground(new java.awt.Color(250, 206, 127));
        identificador.setText("N°");

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(250, 206, 127));
        jLabel3.setText("Seleccione Bebida");

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(250, 206, 127));
        jLabel4.setText("Selecciona Hamburgesa");

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(250, 206, 127));
        jLabel5.setText("Seleccione Añadidos");

        direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(250, 206, 127));
        jLabel2.setText("Dirección");

        burger1.setText("Hamburguesa especial Bacon $5000");

        burger2.setText("Hamburguesa BBQ $6000");

        burger3.setText("Hamburgesa Romana $6500");

        burger4.setText("Hamburgesa LGBTQ+ $7500");

        burger5.setText("Hamburguesa especial informático $8000");

        bebida1.setText("Bebida en lata Coca-Cola $1500");

        bebida2.setText("Bebida en lata Fanta $1500");

        bebida3.setText("Bebida en lata Pepsi $1500");

        bebida4.setText("Bebida en lata Sprite $1500");
        bebida4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bebida4ActionPerformed(evt);
            }
        });

        bebida5.setText("Bebida en lata Kem $1500");

        bebida6.setText("Bebida de litro $1700");

        aniadido1.setText("Papas Fritas Chicas $1000");

        aniadido2.setText("Papas Fritas Mediana $2000");

        aniadido3.setText("Papas Fritas Grandes $3000");

        aniadido4.setText("Palitos de ajo 5u $2500");

        jLayeredPane2.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(identificador, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(direccion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(burger1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(burger2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(burger3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(burger4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(burger5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(h1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(h2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(h3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(h4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(h5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(bebida1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(bebida2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(bebida3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(bebida4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(bebida5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(bebida6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(b1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(b2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(b3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(b4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(b5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(b6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(aniadido1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(aniadido2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(aniadido3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(aniadido4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(a1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(a2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(a3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(a4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(49, 49, 49)
                        .addComponent(identificador))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(123, 123, 123)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane2Layout.createSequentialGroup()
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(direccion))
                            .addComponent(burger1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(burger2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(burger3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(burger4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(burger5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addComponent(h5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bebida6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bebida5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                        .addComponent(h4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bebida4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                        .addComponent(h3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bebida3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                        .addComponent(h2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bebida2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                        .addComponent(h1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bebida1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(b2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(b3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(b4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(aniadido4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(aniadido3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(aniadido1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(aniadido2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(identificador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(burger1)
                    .addComponent(h1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bebida1)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aniadido1)
                    .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(burger2)
                    .addComponent(h2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bebida2)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aniadido2)
                    .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(burger3)
                    .addComponent(h3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bebida3)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aniadido3)
                    .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(burger4)
                    .addComponent(h4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bebida4)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aniadido4)
                    .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(burger5)
                    .addComponent(h5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bebida5)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bebida6)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Guardar.setBackground(new java.awt.Color(250, 206, 127));
        Guardar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Guardar.setForeground(new java.awt.Color(102, 102, 102));
        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2)
            .addComponent(jLayeredPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLayeredPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreCActionPerformed

    //SE VALIDAN Y AGREGAN LOS DATOS DEL PEDIDO    
    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        String clNom = (String) nombreC.getSelectedItem();
        Cliente nombre = getCliente(clNom);
        String d = direccion.getText();
        int id = Integer.parseInt(identificador.getText());
        String pedido = "";
        int total = 0;
        String pedidoBurger = "";
        String pedidoh1 = "";
        String pedidoh2 = "";
        String pedidoh3 = "";
        String pedidoh4 = "";
        String pedidoh5 = "";
        String pedidoBebida = "";
        String pedidob1 = "";
        String pedidob2 = "";
        String pedidob3 = "";
        String pedidob4 = "";
        String pedidob5 = "";
        String pedidob6 = "";
        String pedidoAniadido = "";
        String pedidoa1 = "";
        String pedidoa2 = "";
        String pedidoa3 = "";
        String pedidoa4 = "";
        int totalBurger = 0;
        int totalBebida = 0;
        int totalAniadido = 0;
//Hamburgesas
        String eb = burger1.getText();
        String bbq = burger2.getText();
        String ro = burger3.getText();
        String lg = burger4.getText();
        String ei = burger5.getText();
        int ceb = (int) h1.getValue();
        int cbbq = (int) h2.getValue();
        int cro = (int) h3.getValue();
        int clg = (int) h4.getValue();
        int cei = (int) h5.getValue();
        int total1h = 0;
        int total2h = 0;
        int total3h = 0;
        int total4h = 0;
        int total5h = 0;
//Bebidas
        String bcc = bebida1.getText();
        String bf = bebida2.getText();
        String bp = bebida3.getText();
        String bs = bebida4.getText();
        String bk = bebida5.getText();
        String blitro = bebida6.getText();
        int cbcc = (int) b1.getValue();
        int cbf = (int) b2.getValue();
        int cbp = (int) b3.getValue();
        int cbs = (int) b4.getValue();
        int cbk = (int) b5.getValue();
        int cblitro = (int) b6.getValue();
        int total1b = 0;
        int total2b = 0;
        int total3b = 0;
        int total4b = 0;
        int total5b = 0;
        int total6b = 0;
//Añadidos
        String pfc = aniadido1.getText();
        String pfm = aniadido2.getText();
        String pfg = aniadido3.getText();
        String pa5 = aniadido4.getText();
        int cpfc = (int) a1.getValue();
        int cpfm = (int) a2.getValue();
        int cpfg = (int) a3.getValue();
        int cpa5 = (int) a4.getValue();
        int total1a = 0;
        int total2a = 0;
        int total3a = 0;
        int total4a = 0;

//verificando y calculando valor pedido hamburgesa
        if (burger1.isSelected()) {
            if (ceb <= 0) {
                JOptionPane.showMessageDialog(null, "Debe ingresar la cantidad de: " + eb);
            } else {
                total1h = ceb * 5000;
                pedidoh1 = " " + eb + " $" + total1h + " ";
            }
        }
        if (burger2.isSelected()) {
            if (cbbq <= 0) {
                JOptionPane.showMessageDialog(null, "Debe ingresar la cantidad de: " + bbq);
            } else {
                total2h = cbbq * 6000;
                pedidoh2 = " " + bbq + " $" + total2h + " ";
            }
        }
        if (burger3.isSelected()) {
            if (cro <= 0) {
                JOptionPane.showMessageDialog(null, "Debe ingresar la cantidad de: " + ro);
            } else {
                total3h = cro * 6500;
                pedidoh3 = " " + ro + " $" + total3h + " ";
            }
        }
        if (burger4.isSelected()) {
            if (clg <= 0) {
                JOptionPane.showMessageDialog(null, "Debe ingresar la cantidad de: " + lg);
            } else {
                total4h = clg * 7500;
                pedidoh4 = " " + lg + " $" + total4h + " ";
            }
        }
        if (burger5.isSelected()) {
            if (cei <= 0) {
                JOptionPane.showMessageDialog(null, "Debe ingresar la cantidad de: " + ei);
            } else {
                total5h = cei * 8000;
                pedidoh5 = " " + ei + " $" + total5h + " ";
            }
        }
        totalBurger = total1h + total2h + total3h + total4h + total5h;
        pedidoBurger = pedidoh1 + pedidoh2 + pedidoh3 + pedidoh4 + pedidoh5;

//verificando y calculando valor pedido bebida
        if (bebida1.isSelected()) {
            if (cbcc <= 0) {
                JOptionPane.showMessageDialog(null, "Debe ingresar la cantidad de: " + bcc);
            } else {
                total1b = cbcc * 1500;
                pedidob1 = " " + bcc + " $" + total1b + " ";
            }
        }
        if (bebida2.isSelected()) {
            if (cbf <= 0) {
                JOptionPane.showMessageDialog(null, "Debe ingresar la cantidad de: " + bf);
            } else {
                total2b = cbf * 1500;
                pedidob2 = " " + bf + " $" + total2b + " ";
            }
        }
        if (bebida3.isSelected()) {
            if (cbp <= 0) {
                JOptionPane.showMessageDialog(null, "Debe ingresar la cantidad de: " + bp);
            } else {
                total3b = cbp * 1500;
                pedidob3 = " " + bp + " $" + total3b + " ";
            }
        }
        if (bebida4.isSelected()) {
            if (cbs <= 0) {
                JOptionPane.showMessageDialog(null, "Debe ingresar la cantidad de: " + bs);
            } else {
                total4b = cbs * 1500;
                pedidob4 = " " + bs + " $" + total4b + " ";
            }
        }
        if (bebida5.isSelected()) {
            if (cbk <= 0) {
                JOptionPane.showMessageDialog(null, "Debe ingresar la cantidad de: " + bk);
            } else {
                total5b = cbk * 1500;
                pedidob3 = " " + bk + " $" + total5b + " ";
            }
        }
        if (bebida6.isSelected()) {
            if (cblitro <= 0) {
                JOptionPane.showMessageDialog(null, "Debe ingresar la cantidad de: " + blitro);
            } else {
                total6b = cblitro * 1700;
                pedidob6 = " " + blitro + " $" + total6b + " ";
            }
        }
        totalBebida = total1b + total2b + total3b + total4b + total5b + total6b;
        pedidoBebida = pedidob1 + pedidob2 + pedidob3 + pedidob4 + pedidob5 + pedidob6;

//verificando y calculando valor pedido añadidos
        if (aniadido1.isSelected()) {
            if (cpfc <= 0) {
                JOptionPane.showMessageDialog(null, "Debe ingresar la cantidad de: " + pfc);
            } else {
                total1a = cpfc * 1000;
                pedidoa1 = " " + pfc + " $" + total1a + " ";
            }
        }
        if (aniadido2.isSelected()) {
            if (cpfm <= 0) {
                JOptionPane.showMessageDialog(null, "Debe ingresar la cantidad de: " + pfm);
            } else {
                total2a = cpfm * 2000;
                pedidoa2 = " " + pfm + " $" + total2a + " ";
            }
        }
        if (aniadido3.isSelected()) {
            if (cpfg <= 0) {
                JOptionPane.showMessageDialog(null, "Debe ingresar la cantidad de: " + pfg);
            } else {
                total3a = cpfg * 3000;
                pedidoa3 = " " + pfg + " $" + total3a + " ";
            }
        }
        if (aniadido4.isSelected()) {
            if (cpa5 <= 0) {
                JOptionPane.showMessageDialog(null, "Debe ingresar la cantidad de: " + pa5);
            } else {
                total4a = cpa5 * 2500;
                pedidoa4 = " " + pa5 + " $" + total4a + " ";
            }
        }
        totalAniadido = total1a + total2a + total3a + total4a;
        pedidoAniadido = pedidoa1 + pedidoa2 + pedidoa3 + pedidoa4;

//Agregando
        pedido = pedidoBurger + pedidoBebida + pedidoAniadido;
        total = totalBurger + totalBebida + totalAniadido;
        if (pedido.isEmpty() == false && total > 0) {
            Pedido deliv = new Pedido(d, nombre, pedido, total, id);
            AgregarDelivery(deliv);
            JOptionPane.showMessageDialog(null, "Agregado exitosamente");
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar algun pedido");
        }
        identificador.setText(String.valueOf(cont + 1));
        borrarCampos();
    }//GEN-LAST:event_GuardarActionPerformed

    private void direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionActionPerformed

    private void bebida4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bebida4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bebida4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Guardar;
    private javax.swing.JSpinner a1;
    private javax.swing.JSpinner a2;
    private javax.swing.JSpinner a3;
    private javax.swing.JSpinner a4;
    private javax.swing.JToggleButton aniadido1;
    private javax.swing.JToggleButton aniadido2;
    private javax.swing.JToggleButton aniadido3;
    private javax.swing.JToggleButton aniadido4;
    private javax.swing.JSpinner b1;
    private javax.swing.JSpinner b2;
    private javax.swing.JSpinner b3;
    private javax.swing.JSpinner b4;
    private javax.swing.JSpinner b5;
    private javax.swing.JSpinner b6;
    private javax.swing.JToggleButton bebida1;
    private javax.swing.JToggleButton bebida2;
    private javax.swing.JToggleButton bebida3;
    private javax.swing.JToggleButton bebida4;
    private javax.swing.JToggleButton bebida5;
    private javax.swing.JToggleButton bebida6;
    private javax.swing.JToggleButton burger1;
    private javax.swing.JToggleButton burger2;
    private javax.swing.JToggleButton burger3;
    private javax.swing.JToggleButton burger4;
    private javax.swing.JToggleButton burger5;
    private javax.swing.JTextField direccion;
    private javax.swing.JSpinner h1;
    private javax.swing.JSpinner h2;
    private javax.swing.JSpinner h3;
    private javax.swing.JSpinner h4;
    private javax.swing.JSpinner h5;
    private javax.swing.JLabel identificador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> nombreC;
    // End of variables declaration//GEN-END:variables
}
