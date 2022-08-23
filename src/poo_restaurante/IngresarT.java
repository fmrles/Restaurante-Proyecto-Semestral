package poo_restaurante;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Cphyros
 */
public class IngresarT extends javax.swing.JInternalFrame {

    //ATRIBUTOS
    Trabajador traArray[];
    int cont;

    //CONSTRUCTOR
    public IngresarT() {
        initComponents();
        traArray = new Trabajador[70];
        cont = 0;
    }

    //SOLO VUELVE A RESTAURAR LOS CAMPOS
    public void borrarCampos() {
        this.rutTxt.setText("");
        this.nombreTxt.setText("");
        this.fonoTxt.setText("");
    }

    //COMPARA EL RUT INGRESADO CON LOS QUE YA ESTAN GUARDADOS
    public boolean BuscarRut(String rut) {
        for (int i = 0; i < cont; i++) {
            if (traArray[i].getRut().equalsIgnoreCase(rut)) {
                return true;
            }
        }
        return false;
    }

    //AGREGA CLIENTES SOLO SI EL CONTADOR DE TRABAJADORES
    public void AgregarTrabajador(Trabajador t) {
        if (!BuscarRut(rutTxt.getText())) {
            if (cont < traArray.length) {
                traArray[cont] = t;

                JOptionPane.showMessageDialog(null, "Trabajador registrado: " + traArray[cont].getNombre());
                cont++;
            } else {
                JOptionPane.showMessageDialog(null, "El trabajador no se ha podido ingresar");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Rut repetido");
        }

    }

    //SOLO SI EL CONTADOR DE TRABAJADORES ES MAS QUE CERO SE LISTARAN LOS TRABAJADORES HASTA EL MOMENTO AGREGADOS
    public String listarTrabajador() {
        String info = " Trabajadores registrados \n\n";
        if (cont == 0) {
            info = info + "\n\n No hay trabajadores registrados ";
        } else {
            for (int i = 0; i < cont; i++) {
                info = info + "  " + traArray[i].getRut() + "  " + traArray[i].getNombre() + "  " + traArray[i].getFono() + "  " + traArray[i].getPuesto() + "\n";
            }
        }
        return info;
    }

    //Valida la estructura y si son reales
    public boolean validarRut(String rut) {
        Pattern pattern = Pattern.compile("^[0-9]+-[0-9kK]{1}$");
        Matcher matcher = pattern.matcher(rut);
        if (matcher.matches() == false) {
            return false;
        }
        String[] stringRut = rut.split("-");
        return stringRut[1].toLowerCase().equals(IngresarT.dv(stringRut[0]));
    }

    /**
     * Valida el dígito verificador
     */
    public static String dv(String rut) {
        Integer M = 0, S = 1, T = Integer.parseInt(rut);
        for (; T != 0; T = (int) Math.floor(T /= 10)) {
            S = (S + T % 10 * (9 - M++ % 6)) % 11;
        }
        return (S > 0) ? String.valueOf(S - 1) : "k";
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rutTxt = new javax.swing.JTextField();
        nombreTxt = new javax.swing.JTextField();
        fonoTxt = new javax.swing.JTextField();
        puesto = new javax.swing.JComboBox<>();
        guardar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Ingresar Trabajadores");

        jPanel1.setBackground(new java.awt.Color(145, 31, 39));

        jLabel2.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(250, 206, 127));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Registro de Trabajadores");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenés/listarPorPuesto.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(250, 206, 127));
        jLabel3.setText("Rut");

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(250, 206, 127));
        jLabel4.setText("Nombre");

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(250, 206, 127));
        jLabel5.setText("Puesto");

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(250, 206, 127));
        jLabel6.setText("Fono");

        rutTxt.setBackground(new java.awt.Color(251, 248, 241));
        rutTxt.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        rutTxt.setForeground(new java.awt.Color(51, 51, 51));
        rutTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(47, 50, 57), 1, true));
        rutTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rutTxtMousePressed(evt);
            }
        });
        rutTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rutTxtActionPerformed(evt);
            }
        });

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

        fonoTxt.setBackground(new java.awt.Color(251, 248, 241));
        fonoTxt.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        fonoTxt.setForeground(new java.awt.Color(51, 51, 51));
        fonoTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(47, 50, 57), 1, true));
        fonoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fonoTxtMousePressed(evt);
            }
        });
        fonoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fonoTxtActionPerformed(evt);
            }
        });

        puesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GERENTE", "CHEF", "MESERO", "COPERO", "CAJERO" }));
        puesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puestoActionPerformed(evt);
            }
        });

        guardar.setBackground(new java.awt.Color(250, 206, 127));
        guardar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        guardar.setForeground(new java.awt.Color(51, 51, 51));
        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rutTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(puesto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fonoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(guardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rutTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addComponent(fonoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(puesto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreTxtMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTxtMousePressed

    private void nombreTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTxtActionPerformed

    private void rutTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rutTxtMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_rutTxtMousePressed

    private void rutTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rutTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rutTxtActionPerformed

    private void fonoTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fonoTxtMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_fonoTxtMousePressed

    private void fonoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fonoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fonoTxtActionPerformed

    private void puestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_puestoActionPerformed

    //SE VALIDAN Y AGREGAN LOS DATOS DEL TRABAJADOR    
    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        // TODO add your handling code here:
        String n = nombreTxt.getText();
        //Deja la primera letra de cada palabra en mayus
        StringBuffer strbf = new StringBuffer();
        Matcher match = Pattern.compile("([a-z])([a-z]*)", Pattern.CASE_INSENSITIVE).matcher(n);
        while (match.find()) {
            match.appendReplacement(strbf, match.group(1).toUpperCase() + match.group(2).toLowerCase());
        }
        String nombre = match.appendTail(strbf).toString();
        String r = rutTxt.getText();
        String p = String.valueOf(puesto.getSelectedItem());
        String f = fonoTxt.getText();
        String fono = f.replaceAll("\\s+", "");

        if (n.isEmpty() == true && r.isEmpty() == true && f.isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "debe llenar todos los campos primero", "error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (validarNombre(n) == true && validarFono(fono) == true && validarRut(r) == true) {
                Trabajador t = new Trabajador(nombre, r, p, fono);
                AgregarTrabajador(t);
            } else {
                JOptionPane.showMessageDialog(null, "Error en los datos");
            }
        }
        borrarCampos();
    }//GEN-LAST:event_guardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fonoTxt;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JComboBox<String> puesto;
    private javax.swing.JTextField rutTxt;
    // End of variables declaration//GEN-END:variables
}
