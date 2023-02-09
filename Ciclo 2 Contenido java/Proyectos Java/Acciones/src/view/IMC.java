package view;

public class IMC extends javax.swing.JFrame {

    public IMC() {
        initComponents();
        txtImc.setEditable(false); 
        
        cbTidenti.addItem("Cedula");
        cbTidenti.addItem("Cedula de extranjeria");
        cbTidenti.addItem("Tarjeta de identidad");
        cbTidenti.addItem("Registro civil");
        cbTidenti.addItem("Pasaporte");
        txtNombre.setText("Adolfo Ayala");
        txtEdad.setText("18");
        txtNidenti.setText("3223423");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        grSexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        paneltitulo = new javax.swing.JPanel();
        imgLogo = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();
        panelActualizardatos = new javax.swing.JPanel();
        lbNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lbEdad = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        lbSexo = new javax.swing.JLabel();
        radioFemenino = new javax.swing.JRadioButton();
        radioMasculino = new javax.swing.JRadioButton();
        lbTidenti = new javax.swing.JLabel();
        lbNidenti = new javax.swing.JLabel();
        txtNidenti = new javax.swing.JTextField();
        cbTidenti = new javax.swing.JComboBox<>();
        btActualizardatos = new javax.swing.JButton();
        radioOtro = new javax.swing.JRadioButton();
        separador = new javax.swing.JSeparator();
        panelCalcularImc = new javax.swing.JPanel();
        lbEstatura = new javax.swing.JLabel();
        txtEstatura = new javax.swing.JTextField();
        lbPeso = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        btnImc = new javax.swing.JButton();
        txtImc = new javax.swing.JTextField();
        lbImc = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        paneltitulo.setBackground(new java.awt.Color(48, 35, 130));

        imgLogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\vane\\Documents\\ProyectosTarde\\Semana3\\Acciones\\src\\images\\logo.png")); // NOI18N

        lbTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lbTitulo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lbTitulo.setText("Calcular IMC del Paciente ");

        javax.swing.GroupLayout paneltituloLayout = new javax.swing.GroupLayout(paneltitulo);
        paneltitulo.setLayout(paneltituloLayout);
        paneltituloLayout.setHorizontalGroup(
            paneltituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneltituloLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(imgLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paneltituloLayout.setVerticalGroup(
            paneltituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneltituloLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(paneltituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneltituloLayout.createSequentialGroup()
                        .addComponent(imgLogo)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneltituloLayout.createSequentialGroup()
                        .addComponent(lbTitulo)
                        .addGap(39, 39, 39))))
        );

        lbNombre.setText("Nombre");

        lbEdad.setText("Edad");

        lbSexo.setText("Sexo");

        grSexo.add(radioFemenino);
        radioFemenino.setText("Femenino");

        grSexo.add(radioMasculino);
        radioMasculino.setText("Masculino");

        lbTidenti.setText("Tipo de identificacion");

        lbNidenti.setText("N° de identificacion");

        btActualizardatos.setText("Actualizar Datos");
        btActualizardatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActualizardatosActionPerformed(evt);
            }
        });

        grSexo.add(radioOtro);
        radioOtro.setText("Otro");

        javax.swing.GroupLayout panelActualizardatosLayout = new javax.swing.GroupLayout(panelActualizardatos);
        panelActualizardatos.setLayout(panelActualizardatosLayout);
        panelActualizardatosLayout.setHorizontalGroup(
            panelActualizardatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelActualizardatosLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panelActualizardatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelActualizardatosLayout.createSequentialGroup()
                        .addGroup(panelActualizardatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelActualizardatosLayout.createSequentialGroup()
                                .addComponent(lbNombre)
                                .addGap(254, 254, 254))
                            .addGroup(panelActualizardatosLayout.createSequentialGroup()
                                .addComponent(txtNombre)
                                .addGap(46, 46, 46)))
                        .addGroup(panelActualizardatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbEdad)
                            .addGroup(panelActualizardatosLayout.createSequentialGroup()
                                .addComponent(txtEdad)
                                .addGap(49, 49, 49))))
                    .addGroup(panelActualizardatosLayout.createSequentialGroup()
                        .addGroup(panelActualizardatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbTidenti, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelActualizardatosLayout.createSequentialGroup()
                                .addGroup(panelActualizardatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbSexo)
                                    .addComponent(lbTidenti)
                                    .addGroup(panelActualizardatosLayout.createSequentialGroup()
                                        .addComponent(radioFemenino)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radioMasculino)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(radioOtro)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(panelActualizardatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNidenti)
                            .addComponent(txtNidenti))
                        .addGap(46, 46, 46))))
            .addGroup(panelActualizardatosLayout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(btActualizardatos, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 188, Short.MAX_VALUE))
        );
        panelActualizardatosLayout.setVerticalGroup(
            panelActualizardatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelActualizardatosLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(panelActualizardatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombre)
                    .addComponent(lbEdad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelActualizardatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(lbSexo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelActualizardatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioFemenino)
                    .addComponent(radioMasculino)
                    .addComponent(radioOtro))
                .addGap(11, 11, 11)
                .addGroup(panelActualizardatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTidenti)
                    .addComponent(lbNidenti))
                .addGap(15, 15, 15)
                .addGroup(panelActualizardatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTidenti, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNidenti, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(btActualizardatos, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        lbEstatura.setText("Estatura");

        lbPeso.setText("Peso");

        btnImc.setText("Calcular IMC");
        btnImc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImcActionPerformed(evt);
            }
        });

        txtImc.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N

        lbImc.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lbImc.setText("IMC");

        javax.swing.GroupLayout panelCalcularImcLayout = new javax.swing.GroupLayout(panelCalcularImc);
        panelCalcularImc.setLayout(panelCalcularImcLayout);
        panelCalcularImcLayout.setHorizontalGroup(
            panelCalcularImcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCalcularImcLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(panelCalcularImcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelCalcularImcLayout.createSequentialGroup()
                        .addComponent(lbImc, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(txtImc, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCalcularImcLayout.createSequentialGroup()
                        .addGroup(panelCalcularImcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelCalcularImcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbPeso)
                                .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCalcularImcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbEstatura)
                                .addComponent(txtEstatura, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnImc, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        panelCalcularImcLayout.setVerticalGroup(
            panelCalcularImcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCalcularImcLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(lbEstatura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCalcularImcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelCalcularImcLayout.createSequentialGroup()
                        .addComponent(txtEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbPeso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnImc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addGroup(panelCalcularImcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtImc, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbImc, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneltitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(panelActualizardatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCalcularImc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(paneltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelActualizardatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCalcularImc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImcActionPerformed
        Double estatura= Double.parseDouble(txtEstatura.getText());
        Double peso = Double.parseDouble(txtPeso.getText());
        Double imc = peso/(estatura*estatura);
        System.out.println("Con la estatura "+estatura+" y el peso "+peso+", el indice de masa corporal es:"+imc);
        String strimc= Double.toString(imc);
        
        txtImc.setText(strimc);
    }//GEN-LAST:event_btnImcActionPerformed

    private void btActualizardatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActualizardatosActionPerformed
        
        System.out.println("Se actualizaron los datos exitosamente");
        if(radioFemenino.isSelected()==true){
            System.out.println("El paciente es Femenino");
        }
         if(radioMasculino.isSelected()==true){
            System.out.println("El paciente es Masculino");
        }
          if(radioOtro.isSelected()==true){
            System.out.println("El paciente se identifica con otro sexo");
        }
         
// TODO add your handling code here:
    }//GEN-LAST:event_btActualizardatosActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IMC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btActualizardatos;
    private javax.swing.JButton btnImc;
    private javax.swing.JComboBox<String> cbTidenti;
    private javax.swing.ButtonGroup grSexo;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel lbEdad;
    private javax.swing.JLabel lbEstatura;
    private javax.swing.JLabel lbImc;
    private javax.swing.JLabel lbNidenti;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbPeso;
    private javax.swing.JLabel lbSexo;
    private javax.swing.JLabel lbTidenti;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel panelActualizardatos;
    private javax.swing.JPanel panelCalcularImc;
    private javax.swing.JPanel paneltitulo;
    private javax.swing.JRadioButton radioFemenino;
    private javax.swing.JRadioButton radioMasculino;
    private javax.swing.JRadioButton radioOtro;
    private javax.swing.JSeparator separador;
    private javax.swing.JTextField txtEdad;
    public javax.swing.JTextField txtEstatura;
    private javax.swing.JTextField txtImc;
    private javax.swing.JTextField txtNidenti;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables

}
