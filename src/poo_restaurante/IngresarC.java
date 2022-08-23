package poo_restaurante;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Cphyros
 */
public class IngresarC extends javax.swing.JInternalFrame {

    //ATRIBUTOS
    Cliente clArray[]; //Asociacion Agregacion Uno a muchos
    int cont;

    //CONSTRUCTOR
    public IngresarC() {
        initComponents();
        clArray = new Cliente[50];
        cont = 0;
        this.numOrden.setText(String.valueOf(cont + 1));
    }

    //SOLO VUELVE A DEJAR EN BLANCO LOS CAMPOS
    public void borrarCampos() {
        this.celularTxt.setText("");
        this.nombreTxt.setText("");
    }

    //AGREGA CLIENTES SOLO SI EL CONTADOR DE CLIENTES NO SOBREPASA EL TAMAÑO DE LA ARRAY
    public void AgregarCliente(Cliente c) {
        if (cont < clArray.length) {
            clArray[cont] = c;
            JOptionPane.showMessageDialog(null, "Cliente registrado: " + clArray[cont].getNombre());
            cont++;
        } else {
            JOptionPane.showMessageDialog(null, "El cliente no se ha podido ingresar");
        }
    }

    //SOLO SI EL CONTADOR DE CLIENTES ES MAS QUE CERO SE LISTARAN LOS CLIENTES HASTA EL MOMENTO AGREGADOS
    public String listarClientes() {
        String info = " Clientes registrados \n\n";
        if (cont == 0) {
            info = info + "\n\n No hay clientes registrados ";
        } else {
            for (int i = 0; i < cont; i++) {
                info = info + clArray[i].getCelular() + "  " + clArray[i].getNombre() + "  " + clArray[i].getId() + "\n";
            }
        }
        return info;
    }

    //VALIDA QUE EN EL CAMPO SOLO SE ESCRIBAN LETRAS
    public boolean validarNombre(String nombre) {
        for (int x = 0; x < nombre.length(); x++) {
            char n = nombre.charAt(x);
            // Si no está entre a y z, ni entre A y Z, ni es un espacio
            if (!((n >= 'a' && n <= 'z') || (n >= 'A' && n <= 'Z') || n == ' ')) {
                return false;
            }
        }
        return true;
    }

    //VALIDA QUE EN EL CAMPO SOLO SE ESCRIBAN NUMEROS
    public boolean validarFono(String fono) {
        return fono.matches("[+-]?\\d*(\\.\\d+)?");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        celularTxt = new javax.swing.JTextField();
        registrar = new javax.swing.JButton();
        numOrden = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Ingresar Clientes");
        setRequestFocusEnabled(false);
        setVerifyInputWhenFocusTarget(false);

        BG.setBackground(new java.awt.Color(145, 31, 39));
        BG.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel2.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(250, 206, 127));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ingresar Datos del Ciente");

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(250, 206, 127));
        jLabel1.setText("Nombre");

        nombreTxt.setBackground(new java.awt.Color(251, 248, 241));
        nombreTxt.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        nombreTxt.setForeground(new java.awt.Color(51, 51, 51));
        nombreTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(47, 50, 57), 1, true));
        nombreTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombreTxtMousePressed(evt);
            }
        });
        nombreTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTxtActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(250, 206, 127));
        jLabel3.setText("Celular");

        celularTxt.setBackground(new java.awt.Color(251, 248, 241));
        celularTxt.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        celularTxt.setForeground(new java.awt.Color(51, 51, 51));
        celularTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(47, 50, 57), 1, true));
        celularTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                celularTxtMousePressed(evt);
            }
        });
        celularTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celularTxtActionPerformed(evt);
            }
        });

        registrar.setBackground(new java.awt.Color(250, 206, 127));
        registrar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        registrar.setForeground(new java.awt.Color(102, 102, 102));
        registrar.setText("Ingresar Cliente");
        registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        numOrden.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        numOrden.setForeground(new java.awt.Color(250, 206, 127));
        numOrden.setText("N°");

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(250, 206, 127));
        jLabel5.setText("N° de Orden: ");

        javax.swing.GroupLayout BGLayout = new javax.swing.GroupLayout(BG);
        BG.setLayout(BGLayout);
        BGLayout.setHorizontalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(BGLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreTxt))
                    .addComponent(jLabel2)
                    .addGroup(BGLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(celularTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BGLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numOrden))
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BGLayout.setVerticalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(nombreTxt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(celularTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(numOrden))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registrar)
                .addGap(3, 3, 3))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreTxtMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTxtMousePressed

    private void nombreTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTxtActionPerformed

    private void celularTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_celularTxtMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_celularTxtMousePressed

    private void celularTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celularTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_celularTxtActionPerformed

    //SE VALIDAN Y AGREGAN LOS DATOS DEL CLIENTE
    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        String n = nombreTxt.getText();
        StringBuffer strbf = new StringBuffer();
        Matcher match = Pattern.compile("([a-z])([a-z]*)", Pattern.CASE_INSENSITIVE).matcher(n);
        while (match.find()) {
            match.appendReplacement(strbf, match.group(1).toUpperCase() + match.group(2).toLowerCase());
        }
        String nombre = match.appendTail(strbf).toString();
        String c = celularTxt.getText();
        String fono = c.replaceAll("\\s+", "");
        int o = Integer.parseInt(numOrden.getText());

        if (n.isEmpty() == false) {
            if (validarNombre(n) == true && validarFono(fono) == true) {
                JOptionPane.showMessageDialog(null, "Agregado exitosamente");
                Cliente cl = new Cliente(nombre, fono, o);//Dependencia
                AgregarCliente(cl);

            } else {
                JOptionPane.showMessageDialog(null, "Error en los datos");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar todos los datos del formulario");
        }
        numOrden.setText(String.valueOf(cont + 1));
        borrarCampos();
    }//GEN-LAST:event_registrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JTextField celularTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JLabel numOrden;
    private javax.swing.JButton registrar;
    // End of variables declaration//GEN-END:variables
}
