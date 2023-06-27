
import Entidades.Departamento;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class FrontFinal extends javax.swing.JFrame {

    ArrayList<Departamento> ListaDep;


    public FrontFinal() {
        initComponents();
        setLocationRelativeTo(null);
        ListaDep = new ArrayList();
        btnSalvarDep.setEnabled(false);
        btnCancelarDep.setEnabled(false);
        txtCodigo.setEnabled(false);
        txtNome.setEnabled(false);

    }

    public void LoadTableDep() {
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Código", "Nome"}, 0);

        for (int i = 0; i < ListaDep.size(); i++) {
            Object linha[] = new Object[]{ListaDep.get(i).getCodigo(),
                ListaDep.get(i).getNome()};
            modelo.addRow(linha);
        }

        tbl_dep_dpts.setModel(modelo);
        tbl_dep_dpts.getColumnModel().getColumn(0).setPreferredWidth(50);
        tbl_dep_dpts.getColumnModel().getColumn(1).setPreferredWidth(200);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        PanelDepartamantos = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_dep_dpts = new javax.swing.JTable();
        PanelDepartamento = new javax.swing.JPanel();
        labelCodigo = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        btnSalvarDep = new javax.swing.JButton();
        btnCancelarDep = new javax.swing.JButton();
        btnNovoDep = new javax.swing.JButton();
        btnEditarDep = new javax.swing.JButton();
        btnExcluirDep = new javax.swing.JButton();
        PanelFuncionario = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableFuncionarios = new javax.swing.JTable();
        btnNovoFuncionarios = new javax.swing.JButton();
        btnEditarFuncionarios = new javax.swing.JButton();
        btnExcluirFuncionarios = new javax.swing.JButton();
        panelFuncionarios = new javax.swing.JPanel();
        labelMatricula = new javax.swing.JLabel();
        labelNomeFunc = new javax.swing.JLabel();
        txtMatriculaFunc = new javax.swing.JTextField();
        txtNomeFunc = new javax.swing.JTextField();
        btnSalvarFunc = new javax.swing.JButton();
        txtCancelarFunc = new javax.swing.JButton();
        cboxFunc = new javax.swing.JComboBox<>();
        labelDepFunc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl_dep_dpts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbl_dep_dpts);
        if (tbl_dep_dpts.getColumnModel().getColumnCount() > 0) {
            tbl_dep_dpts.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        PanelDepartamento.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Departamento"));

        labelCodigo.setText("Código:");

        labelNome.setText("Nome:");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        btnSalvarDep.setText("Salvar");
        btnSalvarDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarDepActionPerformed(evt);
            }
        });

        btnCancelarDep.setText("Cancelar");
        btnCancelarDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarDepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelDepartamentoLayout = new javax.swing.GroupLayout(PanelDepartamento);
        PanelDepartamento.setLayout(PanelDepartamentoLayout);
        PanelDepartamentoLayout.setHorizontalGroup(
            PanelDepartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDepartamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDepartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PanelDepartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(PanelDepartamentoLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(btnSalvarDep, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelarDep, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );
        PanelDepartamentoLayout.setVerticalGroup(
            PanelDepartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDepartamentoLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(PanelDepartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelDepartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNome))
                .addGap(18, 18, 18)
                .addGroup(PanelDepartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarDep)
                    .addComponent(btnCancelarDep))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        btnNovoDep.setText("Novo");
        btnNovoDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoDepActionPerformed(evt);
            }
        });

        btnEditarDep.setText("Editar");

        btnExcluirDep.setText("Excluir");

        javax.swing.GroupLayout PanelDepartamantosLayout = new javax.swing.GroupLayout(PanelDepartamantos);
        PanelDepartamantos.setLayout(PanelDepartamantosLayout);
        PanelDepartamantosLayout.setHorizontalGroup(
            PanelDepartamantosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDepartamantosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(PanelDepartamantosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDepartamantosLayout.createSequentialGroup()
                        .addGroup(PanelDepartamantosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PanelDepartamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(26, 26, 26))
                    .addGroup(PanelDepartamantosLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnNovoDep, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditarDep, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(btnExcluirDep, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))))
        );
        PanelDepartamantosLayout.setVerticalGroup(
            PanelDepartamantosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDepartamantosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(PanelDepartamantosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoDep)
                    .addComponent(btnEditarDep)
                    .addComponent(btnExcluirDep))
                .addGap(18, 18, 18)
                .addComponent(PanelDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Departamentos", PanelDepartamantos);

        tableFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matrícula", "Nome", "Departamento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tableFuncionarios);

        btnNovoFuncionarios.setText("Novo");
        btnNovoFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoFuncionariosActionPerformed(evt);
            }
        });

        btnEditarFuncionarios.setText("Editar");

        btnExcluirFuncionarios.setText("Excluir");

        panelFuncionarios.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Funcionário"));

        labelMatricula.setText("Matrícula");

        labelNomeFunc.setText("Nome:");

        txtNomeFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeFuncActionPerformed(evt);
            }
        });

        btnSalvarFunc.setText("Salvar");
        btnSalvarFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarFuncActionPerformed(evt);
            }
        });

        txtCancelarFunc.setText("Cancelar");

        cboxFunc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        labelDepFunc.setText("Dep:");

        javax.swing.GroupLayout panelFuncionariosLayout = new javax.swing.GroupLayout(panelFuncionarios);
        panelFuncionarios.setLayout(panelFuncionariosLayout);
        panelFuncionariosLayout.setHorizontalGroup(
            panelFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFuncionariosLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(panelFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFuncionariosLayout.createSequentialGroup()
                        .addGroup(panelFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFuncionariosLayout.createSequentialGroup()
                                .addComponent(labelDepFunc)
                                .addGap(73, 73, 73)
                                .addComponent(cboxFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelFuncionariosLayout.createSequentialGroup()
                                .addGroup(panelFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNomeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelMatricula))
                                .addGap(18, 18, 18)
                                .addGroup(panelFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMatriculaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNomeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelFuncionariosLayout.createSequentialGroup()
                        .addComponent(btnSalvarFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCancelarFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))))
        );
        panelFuncionariosLayout.setVerticalGroup(
            panelFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFuncionariosLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(panelFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMatricula)
                    .addComponent(txtMatriculaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNomeFunc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDepFunc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(panelFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarFunc)
                    .addComponent(txtCancelarFunc))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout PanelFuncionarioLayout = new javax.swing.GroupLayout(PanelFuncionario);
        PanelFuncionario.setLayout(PanelFuncionarioLayout);
        PanelFuncionarioLayout.setHorizontalGroup(
            PanelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFuncionarioLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(PanelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(PanelFuncionarioLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(btnNovoFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(btnEditarFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExcluirFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        PanelFuncionarioLayout.setVerticalGroup(
            PanelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoFuncionarios)
                    .addComponent(btnEditarFuncionarios)
                    .addComponent(btnExcluirFuncionarios))
                .addGap(18, 18, 18)
                .addComponent(panelFuncionarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Funcionários", PanelFuncionario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed

    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnSalvarDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarDepActionPerformed
        int cod = Integer.parseInt(txtCodigo.getText());
        Departamento D = new Departamento(cod, txtNome.getText());
        ListaDep.add(D);
        
        LoadTableDep();
    }//GEN-LAST:event_btnSalvarDepActionPerformed

    private void txtNomeFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeFuncActionPerformed

    }//GEN-LAST:event_txtNomeFuncActionPerformed

    private void btnSalvarFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarFuncActionPerformed

    }//GEN-LAST:event_btnSalvarFuncActionPerformed

    private void btnNovoDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoDepActionPerformed
        txtCodigo.setText("");
        txtNome.setText("");

        btnSalvarDep.setEnabled(true);
        btnCancelarDep.setEnabled(true);
        txtCodigo.setEnabled(true);
        txtNome.setEnabled(true);
    }//GEN-LAST:event_btnNovoDepActionPerformed

    private void btnCancelarDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarDepActionPerformed
        txtCodigo.setText("");
        txtNome.setText("");
        
        btnSalvarDep.setEnabled(false);
        btnCancelarDep.setEnabled(false);
    }//GEN-LAST:event_btnCancelarDepActionPerformed

    private void btnNovoFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoFuncionariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNovoFuncionariosActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(FrontFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrontFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrontFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrontFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrontFinal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelDepartamantos;
    private javax.swing.JPanel PanelDepartamento;
    private javax.swing.JPanel PanelFuncionario;
    private javax.swing.JButton btnCancelarDep;
    private javax.swing.JButton btnEditarDep;
    private javax.swing.JButton btnEditarFuncionarios;
    private javax.swing.JButton btnExcluirDep;
    private javax.swing.JButton btnExcluirFuncionarios;
    private javax.swing.JButton btnNovoDep;
    private javax.swing.JButton btnNovoFuncionarios;
    private javax.swing.JButton btnSalvarDep;
    private javax.swing.JButton btnSalvarFunc;
    private javax.swing.JComboBox<String> cboxFunc;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelDepFunc;
    private javax.swing.JLabel labelMatricula;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNomeFunc;
    private javax.swing.JPanel panelFuncionarios;
    private javax.swing.JTable tableFuncionarios;
    private javax.swing.JTable tbl_dep_dpts;
    private javax.swing.JButton txtCancelarFunc;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtMatriculaFunc;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeFunc;
    // End of variables declaration//GEN-END:variables
}
