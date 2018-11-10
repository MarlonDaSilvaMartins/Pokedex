/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.GinasioVO;
import servicos.GinasioServicos;
import servicos.ServicosFactory;

/**
 *
 * @author Marlon Martins
 * @since 07/05/2018 - 21:40
 * @version 1.0 red
 */
public class GUIManGinasio extends javax.swing.JInternalFrame {

    DefaultTableModel dtm = new DefaultTableModel(
            new Object[][]{},
            new Object[]{"Código","Nome","Localização","Tipo","Líder","Insígnia"}
    );
    /**
     * Creates new form GUIManGinasio
     */
    public GUIManGinasio() {
        initComponents();
        preencherTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlpFiltro = new javax.swing.JLayeredPane();
        jtFiltrar = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jlpTable = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableGinasio = new javax.swing.JTable();
        jlpAcoes = new javax.swing.JLayeredPane();
        jbAtualizar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jbConfirmaralteracao = new javax.swing.JButton();
        jbDeletar = new javax.swing.JButton();
        jlpAlterar = new javax.swing.JLayeredPane();
        jlCodigo = new javax.swing.JLabel();
        jlNome = new javax.swing.JLabel();
        jlLocalizacao = new javax.swing.JLabel();
        jlTipo = new javax.swing.JLabel();
        jlLider = new javax.swing.JLabel();
        jlInsignia = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jtNome = new javax.swing.JTextField();
        jtLocalizacao = new javax.swing.JTextField();
        jtTipo = new javax.swing.JTextField();
        jtLider = new javax.swing.JTextField();
        jtInsignia = new javax.swing.JTextField();
        jbAlterar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Ginasio");

        jlpFiltro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtFiltrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtFiltrarKeyReleased(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Código", "Tipo", "Localização" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jlpFiltro.setLayer(jtFiltrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpFiltro.setLayer(jComboBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpFiltroLayout = new javax.swing.GroupLayout(jlpFiltro);
        jlpFiltro.setLayout(jlpFiltroLayout);
        jlpFiltroLayout.setHorizontalGroup(
            jlpFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlpFiltroLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jtFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jlpFiltroLayout.setVerticalGroup(
            jlpFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlpFiltroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlpFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jlpTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtableGinasio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Localização", "Tipo", "Líder", "Insígnia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtableGinasio.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtableGinasio);
        if (jtableGinasio.getColumnModel().getColumnCount() > 0) {
            jtableGinasio.getColumnModel().getColumn(0).setResizable(false);
            jtableGinasio.getColumnModel().getColumn(1).setResizable(false);
            jtableGinasio.getColumnModel().getColumn(2).setResizable(false);
            jtableGinasio.getColumnModel().getColumn(3).setResizable(false);
            jtableGinasio.getColumnModel().getColumn(4).setResizable(false);
            jtableGinasio.getColumnModel().getColumn(5).setResizable(false);
        }

        jlpTable.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpTableLayout = new javax.swing.GroupLayout(jlpTable);
        jlpTable.setLayout(jlpTableLayout);
        jlpTableLayout.setHorizontalGroup(
            jlpTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jlpTableLayout.setVerticalGroup(
            jlpTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                .addContainerGap())
        );

        jlpAcoes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbAtualizar.setText("Atualizar");
        jbAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtualizarActionPerformed(evt);
            }
        });
        jbAtualizar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbAtualizarKeyPressed(evt);
            }
        });

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });
        jbLimpar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbLimparKeyPressed(evt);
            }
        });

        jbConfirmaralteracao.setText("Confirmar alteração");
        jbConfirmaralteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmaralteracaoActionPerformed(evt);
            }
        });
        jbConfirmaralteracao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbConfirmaralteracaoKeyPressed(evt);
            }
        });

        jbDeletar.setText("Deletar");
        jbDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeletarActionPerformed(evt);
            }
        });
        jbDeletar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbDeletarKeyPressed(evt);
            }
        });

        jlpAcoes.setLayer(jbAtualizar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAcoes.setLayer(jbLimpar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAcoes.setLayer(jbConfirmaralteracao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAcoes.setLayer(jbDeletar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpAcoesLayout = new javax.swing.GroupLayout(jlpAcoes);
        jlpAcoes.setLayout(jlpAcoesLayout);
        jlpAcoesLayout.setHorizontalGroup(
            jlpAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpAcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbConfirmaralteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jlpAcoesLayout.setVerticalGroup(
            jlpAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpAcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlpAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAtualizar)
                    .addComponent(jbLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbConfirmaralteracao)
                    .addComponent(jbDeletar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jlpAlterar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlCodigo.setText("Código");

        jlNome.setText("Nome");

        jlLocalizacao.setText("Localização");

        jlTipo.setText("Tipo");

        jlLider.setText("Líder");

        jlInsignia.setText("Insígnia");

        jtCodigo.setEditable(false);

        jtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtNomeKeyPressed(evt);
            }
        });

        jtLocalizacao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtLocalizacaoKeyPressed(evt);
            }
        });

        jtTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtTipoKeyPressed(evt);
            }
        });

        jtLider.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtLiderKeyPressed(evt);
            }
        });

        jtInsignia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtInsigniaKeyPressed(evt);
            }
        });

        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jlpAlterar.setLayer(jlCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlterar.setLayer(jlNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlterar.setLayer(jlLocalizacao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlterar.setLayer(jlTipo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlterar.setLayer(jlLider, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlterar.setLayer(jlInsignia, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlterar.setLayer(jtCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlterar.setLayer(jtNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlterar.setLayer(jtLocalizacao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlterar.setLayer(jtTipo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlterar.setLayer(jtLider, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlterar.setLayer(jtInsignia, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlterar.setLayer(jbAlterar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpAlterarLayout = new javax.swing.GroupLayout(jlpAlterar);
        jlpAlterar.setLayout(jlpAlterarLayout);
        jlpAlterarLayout.setHorizontalGroup(
            jlpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpAlterarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlpAlterarLayout.createSequentialGroup()
                        .addComponent(jlLocalizacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtLocalizacao))
                    .addGroup(jlpAlterarLayout.createSequentialGroup()
                        .addComponent(jlNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtNome))
                    .addGroup(jlpAlterarLayout.createSequentialGroup()
                        .addComponent(jlCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(90, 90, 90)
                .addGroup(jlpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jlpAlterarLayout.createSequentialGroup()
                        .addComponent(jlTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jlpAlterarLayout.createSequentialGroup()
                        .addComponent(jlLider)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtLider))
                    .addGroup(jlpAlterarLayout.createSequentialGroup()
                        .addComponent(jlInsignia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtInsignia)))
                .addGap(39, 39, 39)
                .addComponent(jbAlterar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jlpAlterarLayout.setVerticalGroup(
            jlpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpAlterarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCodigo)
                    .addComponent(jlTipo)
                    .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jlpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNome)
                    .addComponent(jlLider)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtLider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jlpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlLocalizacao)
                    .addComponent(jlInsignia)
                    .addComponent(jtLocalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtInsignia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAlterar))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlpAlterar)
                    .addComponent(jlpTable)
                    .addComponent(jlpAcoes, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlpFiltro, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlpFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlpTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlpAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlpAcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtualizarActionPerformed
        preencherTabela();
    }//GEN-LAST:event_jbAtualizarActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        limparTabela();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbConfirmaralteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmaralteracaoActionPerformed
       confimarAlteracao();
       limparTabela();
       preencherTabela();
       limpar();
    }//GEN-LAST:event_jbConfirmaralteracaoActionPerformed

    private void jbDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeletarActionPerformed
        deletar();
        limparTabela();
        preencherTabela();
    }//GEN-LAST:event_jbDeletarActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        alterar();
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jtFiltrarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtFiltrarKeyReleased
        limparTabela();
        filtrar();
    }//GEN-LAST:event_jtFiltrarKeyReleased

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        limparTabela();
        filtrar();
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNomeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jtLocalizacao.grabFocus();
        }//fecha if
    }//GEN-LAST:event_jtNomeKeyPressed

    private void jtLocalizacaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtLocalizacaoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jtTipo.grabFocus();
        }//fecha if
    }//GEN-LAST:event_jtLocalizacaoKeyPressed

    private void jtTipoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtTipoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jtLider.grabFocus();
        }//fecha if
    }//GEN-LAST:event_jtTipoKeyPressed

    private void jtLiderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtLiderKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jtInsignia.grabFocus();
        }//fecha if
    }//GEN-LAST:event_jtLiderKeyPressed

    private void jtInsigniaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtInsigniaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jbConfirmaralteracao.grabFocus();
        }//fecha if
    }//GEN-LAST:event_jtInsigniaKeyPressed

    private void jbConfirmaralteracaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbConfirmaralteracaoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            confimarAlteracao();
            limparTabela();
            preencherTabela();
            limpar();
        }//fecha if
    }//GEN-LAST:event_jbConfirmaralteracaoKeyPressed

    private void jbAtualizarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbAtualizarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            preencherTabela();
        }//fecha if
    }//GEN-LAST:event_jbAtualizarKeyPressed

    private void jbLimparKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbLimparKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            limparTabela();
        }//fecha if
    }//GEN-LAST:event_jbLimparKeyPressed

    private void jbDeletarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbDeletarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            deletar();
            limparTabela();
            preencherTabela();
        }//fecha if
    }//GEN-LAST:event_jbDeletarKeyPressed

    private void preencherTabela(){
        try {
            ArrayList<GinasioVO> ginasio = new ArrayList<>();
            GinasioServicos gs = ServicosFactory.getGinasioServicos();
            ginasio = gs.buscarGinasio();
            
            limparTabela();
            
            for(int i = 0 ; i < ginasio.size() ; i++){
                dtm.addRow(new String[]{
                    String.valueOf(ginasio.get(i).getIdginasio()),
                    ginasio.get(i).getNome(),
                    ginasio.get(i).getLocalizacao(),
                    ginasio.get(i).getTipo(),
                    ginasio.get(i).getLider(),
                    ginasio.get(i).getInsignia()
                });
            }//fecha for
            jtableGinasio.setModel(dtm);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Erro ao preencher tabela "+e.getMessage());
        }//fecha catch
    }//fecha preenchertablea
    
    private void limparTabela(){
        dtm.setNumRows(0);
    }//fecah limpar tabela
    
    private void confimarAlteracao(){
        try {
            GinasioVO gVO = new GinasioVO();
            
            gVO.setIdginasio(Integer.parseInt(jtCodigo.getText()));
            gVO.setNome(jtNome.getText());
            gVO.setLocalizacao(jtLocalizacao.getText());
            gVO.setTipo(jtTipo.getText());
            gVO.setLider(jtLider.getText());
            gVO.setInsignia(jtInsignia.getText());
           
            GinasioServicos gs = ServicosFactory.getGinasioServicos();
            
            gs.alterarGinasio(gVO);
            
            JOptionPane.showMessageDialog(
                    this, 
                    "Ginásio alterado com sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro ao alterar "+e.getMessage());
        }//fecha catch
    }//fecha confirmaralteracao
    
    private void alterar(){
        int linha = jtableGinasio.getSelectedRow();
        if(linha != -1){
            jtCodigo.setText((String)jtableGinasio.getValueAt(linha, 0));
            jtNome.setText((String)jtableGinasio.getValueAt(linha, 1));
            jtLocalizacao.setText((String)jtableGinasio.getValueAt(linha, 2));
            jtTipo.setText((String)jtableGinasio.getValueAt(linha, 3));
            jtLider.setText((String)jtableGinasio.getValueAt(linha, 4));
            jtInsignia.setText((String)jtableGinasio.getValueAt(linha, 5));
        }else{
            JOptionPane.showMessageDialog(
                    this,
                    "Selecione alguma linha");
        }//fecha else
    }//fecha alterar
    
    private void limpar(){
        jtCodigo.setText(null);
        jtNome.setText(null);
        jtLocalizacao.setText(null);
        jtTipo.setText(null);
        jtLider.setText(null);
        jtInsignia.setText(null);
    }//fecha limpar
    
    private void deletar(){
        try {
            int linha = jtableGinasio.getSelectedRow();
            if(linha == -1){
                JOptionPane.showMessageDialog(
                        this,
                        "Selecione uma linha para deletar!");
            }else{
                String id = jtableGinasio.getValueAt(linha, 0).toString();
                GinasioServicos gs = ServicosFactory.getGinasioServicos();
                gs.deletarGinasio(Integer.parseInt(id));
                JOptionPane.showMessageDialog(
                        this,
                        "Ginasio deletado com sucesso");
            }//fecha else
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Erro "+e.getMessage());
        }//fecha catch
    }//fecha deletar
    
    private void filtrar(){
        try {
            if(jtFiltrar.getText().isEmpty()){
                preencherTabela();
            }else{
                String pesq = jtFiltrar.getText();
                String filtro = jComboBox1.getSelectedItem().toString();
                String query = "";
                if(filtro.equalsIgnoreCase("Nome")){
                    query="where nome like '%"+pesq+"%'";
                }else if(filtro.equalsIgnoreCase("Código")){
                    query="where idginasio like '%"+pesq+"%'";
                }else if(filtro.equalsIgnoreCase("Tipo")){
                    query="where tipo like '%"+pesq+"%'";
                }else if(filtro.equalsIgnoreCase("Localização")){
                    query="where localizacao like '%"+pesq+"%'";
                }//fecha if                
                GinasioServicos gs = ServicosFactory.getGinasioServicos();
                ArrayList<GinasioVO> ginasio = gs.filtrar(query);
                for(int i=0;i<ginasio.size();i++){
                    dtm.addRow(new String[]{
                        String.valueOf(ginasio.get(i).getIdginasio()),
                        ginasio.get(i).getNome(),
                        ginasio.get(i).getLocalizacao(),
                        ginasio.get(i).getTipo(),
                        ginasio.get(i).getLider(),
                        ginasio.get(i).getInsignia()
                    });                    
                }//fecha for
            }//fecha else
        } catch (Exception e) {
            jtFiltrar.setText(null);
            JOptionPane.showMessageDialog(
                    this,
                    "Erro! "+e.getMessage());
        }//fecha catch
    }//fecha filtrar
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbAtualizar;
    private javax.swing.JButton jbConfirmaralteracao;
    private javax.swing.JButton jbDeletar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlInsignia;
    private javax.swing.JLabel jlLider;
    private javax.swing.JLabel jlLocalizacao;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlTipo;
    private javax.swing.JLayeredPane jlpAcoes;
    private javax.swing.JLayeredPane jlpAlterar;
    private javax.swing.JLayeredPane jlpFiltro;
    private javax.swing.JLayeredPane jlpTable;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtFiltrar;
    private javax.swing.JTextField jtInsignia;
    private javax.swing.JTextField jtLider;
    private javax.swing.JTextField jtLocalizacao;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtTipo;
    private javax.swing.JTable jtableGinasio;
    // End of variables declaration//GEN-END:variables
}