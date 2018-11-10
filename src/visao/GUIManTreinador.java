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
import modelo.TreinadorVO;
import servicos.ServicosFactory;
import servicos.TreinadorServicos;

/**
 *
 * @author Marlon Martins 
 * @since 06/05/2018 - 05:45
 * @version 1.0 red
 */
public class GUIManTreinador extends javax.swing.JInternalFrame {

    DefaultTableModel dtm = new DefaultTableModel(
            new Object[][]{},
            new Object[]{"Código","Nome","Sexo","Cidade","Altura","Insignias"}
    );
    /**
     * Creates new form GUIManTreinador
     */
    public GUIManTreinador() {
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

        jlpFiltrar = new javax.swing.JLayeredPane();
        jtFiltrar = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jlpTabela = new javax.swing.JLayeredPane();
        jTabelaTreinador = new javax.swing.JScrollPane();
        jTableTreinador = new javax.swing.JTable();
        jlpAcoes = new javax.swing.JLayeredPane();
        jbAtualizar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jbConfirmaralteracao = new javax.swing.JButton();
        jbDeletar = new javax.swing.JButton();
        jlpAlterar = new javax.swing.JLayeredPane();
        jlCodigo = new javax.swing.JLabel();
        jlNome = new javax.swing.JLabel();
        jlSexo = new javax.swing.JLabel();
        jlCidade = new javax.swing.JLabel();
        jlAltura = new javax.swing.JLabel();
        jlInsignias = new javax.swing.JLabel();
        jbAlterar = new javax.swing.JButton();
        jtCodigo = new javax.swing.JTextField();
        jtNome = new javax.swing.JTextField();
        jtSexo = new javax.swing.JTextField();
        jtCidade = new javax.swing.JTextField();
        jtAltura = new javax.swing.JTextField();
        jtInsignias = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Treinador");

        jlpFiltrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtFiltrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtFiltrarKeyReleased(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Código", "Insígnias", "Cidade" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jlpFiltrar.setLayer(jtFiltrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpFiltrar.setLayer(jComboBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpFiltrarLayout = new javax.swing.GroupLayout(jlpFiltrar);
        jlpFiltrar.setLayout(jlpFiltrarLayout);
        jlpFiltrarLayout.setHorizontalGroup(
            jlpFiltrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpFiltrarLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jtFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jlpFiltrarLayout.setVerticalGroup(
            jlpFiltrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpFiltrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlpFiltrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jlpTabela.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTableTreinador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Sexo", "Cidade", "Altura", "Insignias"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTreinador.getTableHeader().setReorderingAllowed(false);
        jTabelaTreinador.setViewportView(jTableTreinador);
        if (jTableTreinador.getColumnModel().getColumnCount() > 0) {
            jTableTreinador.getColumnModel().getColumn(0).setResizable(false);
            jTableTreinador.getColumnModel().getColumn(1).setResizable(false);
            jTableTreinador.getColumnModel().getColumn(2).setResizable(false);
            jTableTreinador.getColumnModel().getColumn(3).setResizable(false);
            jTableTreinador.getColumnModel().getColumn(4).setResizable(false);
            jTableTreinador.getColumnModel().getColumn(5).setResizable(false);
        }

        jlpTabela.setLayer(jTabelaTreinador, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpTabelaLayout = new javax.swing.GroupLayout(jlpTabela);
        jlpTabela.setLayout(jlpTabelaLayout);
        jlpTabelaLayout.setHorizontalGroup(
            jlpTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabelaTreinador)
                .addContainerGap())
        );
        jlpTabelaLayout.setVerticalGroup(
            jlpTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabelaTreinador, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jbAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbConfirmaralteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jlpAcoesLayout.setVerticalGroup(
            jlpAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlpAcoesLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jlpAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAtualizar)
                    .addComponent(jbLimpar)
                    .addComponent(jbConfirmaralteracao)
                    .addComponent(jbDeletar))
                .addContainerGap())
        );

        jlpAlterar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlCodigo.setText("Código");

        jlNome.setText("Nome");

        jlSexo.setText("Sexo");

        jlCidade.setText("Cidade");

        jlAltura.setText("Altura");

        jlInsignias.setText("Insignias");

        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jtCodigo.setEditable(false);

        jtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtNomeKeyPressed(evt);
            }
        });

        jtSexo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtSexoKeyPressed(evt);
            }
        });

        jtCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtCidadeKeyPressed(evt);
            }
        });

        jtAltura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtAlturaKeyPressed(evt);
            }
        });

        jtInsignias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtInsigniasKeyPressed(evt);
            }
        });

        jlpAlterar.setLayer(jlCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlterar.setLayer(jlNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlterar.setLayer(jlSexo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlterar.setLayer(jlCidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlterar.setLayer(jlAltura, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlterar.setLayer(jlInsignias, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlterar.setLayer(jbAlterar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlterar.setLayer(jtCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlterar.setLayer(jtNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlterar.setLayer(jtSexo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlterar.setLayer(jtCidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlterar.setLayer(jtAltura, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlterar.setLayer(jtInsignias, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpAlterarLayout = new javax.swing.GroupLayout(jlpAlterar);
        jlpAlterar.setLayout(jlpAlterarLayout);
        jlpAlterarLayout.setHorizontalGroup(
            jlpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpAlterarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jlpAlterarLayout.createSequentialGroup()
                        .addComponent(jlCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                    .addGroup(jlpAlterarLayout.createSequentialGroup()
                        .addGroup(jlpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlCodigo)
                            .addComponent(jlNome)
                            .addComponent(jlSexo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jlpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(jtNome)
                            .addComponent(jtSexo))))
                .addGap(18, 18, 18)
                .addGroup(jlpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jlpAlterarLayout.createSequentialGroup()
                        .addComponent(jlInsignias)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtInsignias))
                    .addGroup(jlpAlterarLayout.createSequentialGroup()
                        .addComponent(jlAltura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtAltura))
                    .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jlpAlterarLayout.setVerticalGroup(
            jlpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpAlterarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCodigo)
                    .addComponent(jlAltura)
                    .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jlpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNome)
                    .addComponent(jlInsignias)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtInsignias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jlpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jlpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlSexo)
                        .addComponent(jtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbAlterar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jlpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCidade)
                    .addComponent(jtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlpAlterar)
                    .addComponent(jlpTabela)
                    .addComponent(jlpFiltrar, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlpAcoes, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlpFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlpTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlpAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jlpAcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void preencherTabela(){
        try {
            ArrayList<TreinadorVO> treinador = new ArrayList<>();
            TreinadorServicos ts = ServicosFactory.getTreinadorServicos();
            treinador = ts.buscarTreinador();
            
            limparTabela();
            
            for(int i = 0 ; i < treinador.size() ; i++){
                dtm.addRow(new String[]{
                    String.valueOf(treinador.get(i).getIdtreinador()),
                    treinador.get(i).getNome(),
                    treinador.get(i).getSexo(),
                    treinador.get(i).getCidade(),
                    String.valueOf(treinador.get(i).getAltura()),
                    String.valueOf(treinador.get(i).getQtdinsignias())
                });
            }//fecha for
            jTableTreinador.setModel(dtm);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Erro ao preencher tabela "+e.getMessage());
        }//fecha catch
    }//fecha preencher tabela
    
    private void limparTabela(){
        dtm.setNumRows(0);
    }//fecha limpar tabela
    
    private void confimarAlteracao(){
        try {
            TreinadorVO tVO = new TreinadorVO();
            
            tVO.setIdtreinador(Integer.parseInt(jtCodigo.getText()));
            tVO.setNome(jtNome.getText());
            tVO.setSexo(jtSexo.getText());
            tVO.setCidade(jtCidade.getText());
            tVO.setAltura(Float.parseFloat(jtAltura.getText()));
            tVO.setQtdinsignias(Integer.parseInt(jtInsignias.getText()));
            
            TreinadorServicos ts = ServicosFactory.getTreinadorServicos();
            
            ts.alterarTreinador(tVO);
            
            JOptionPane.showMessageDialog(
                    this, 
                    "Treinador alterado com sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro ao alterar "+e.getMessage());
        }//fecha catch
    }//fecha confirmaralteracao
    
    private void alterar(){
        int linha = jTableTreinador.getSelectedRow();
        if(linha != -1){
            jtCodigo.setText((String)jTableTreinador.getValueAt(linha, 0));
            jtNome.setText((String)jTableTreinador.getValueAt(linha, 1));
            jtSexo.setText((String)jTableTreinador.getValueAt(linha, 2));
            jtCidade.setText((String)jTableTreinador.getValueAt(linha, 3));
            jtAltura.setText((String)jTableTreinador.getValueAt(linha, 4));
            jtInsignias.setText((String)jTableTreinador.getValueAt(linha, 5));
        }else{
            JOptionPane.showMessageDialog(
                    this,
                    "Selecione alguma linha");
        }//fecha else
    }//fecha alterar
    
    private void limpar(){
        jtCodigo.setText(null);
        jtNome.setText(null);
        jtSexo.setText(null);
        jtCidade.setText(null);
        jtAltura.setText(null);
        jtInsignias.setText(null);
    }//fecha limpar
    
    private void deletar(){
        try {
            int linha = jTableTreinador.getSelectedRow();
            if(linha == -1){
                JOptionPane.showMessageDialog(
                        this,
                        "Selecione uma linha para deletar!");
            }else{
                String id = jTableTreinador.getValueAt(linha, 0).toString();
                TreinadorServicos ts = ServicosFactory.getTreinadorServicos();
                ts.deletarTreinador(Integer.parseInt(id));
                JOptionPane.showMessageDialog(
                        this,
                        "Produto deletado com sucesso");
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
                    query="where idtreinador like '%"+pesq+"%'";
                }else if(filtro.equalsIgnoreCase("Insígnias")){
                    query="where qtdinsignias like '%"+pesq+"%'";
                }else if(filtro.equalsIgnoreCase("Cidade")){
                    query="where cidade like '%"+pesq+"%'";
                }//fecha if                
                TreinadorServicos ts = ServicosFactory.getTreinadorServicos();
                ArrayList<TreinadorVO> treinador = ts.filtrar(query);
                for(int i=0;i<treinador.size();i++){
                    dtm.addRow(new String[]{
                        String.valueOf(treinador.get(i).getIdtreinador()),
                        treinador.get(i).getNome(),
                        treinador.get(i).getSexo(),
                        treinador.get(i).getCidade(),
                        String.valueOf(treinador.get(i).getAltura()),
                        String.valueOf(treinador.get(i).getQtdinsignias())
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

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        alterar();
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeletarActionPerformed
        deletar();
        limparTabela();
        preencherTabela();
    }//GEN-LAST:event_jbDeletarActionPerformed

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
            jtSexo.grabFocus();
        }//fecha if
    }//GEN-LAST:event_jtNomeKeyPressed

    private void jtSexoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtSexoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jtCidade.grabFocus();
        }//fecha if
    }//GEN-LAST:event_jtSexoKeyPressed

    private void jtCidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCidadeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jtAltura.grabFocus();
        }//fecha if
    }//GEN-LAST:event_jtCidadeKeyPressed

    private void jtAlturaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtAlturaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jtInsignias.grabFocus();
        }//fecha if
    }//GEN-LAST:event_jtAlturaKeyPressed

    private void jtInsigniasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtInsigniasKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jbConfirmaralteracao.grabFocus();
        }//fecha if
    }//GEN-LAST:event_jtInsigniasKeyPressed

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
            limpar();
            preencherTabela();
        }//fecha if
    }//GEN-LAST:event_jbDeletarKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jTabelaTreinador;
    private javax.swing.JTable jTableTreinador;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbAtualizar;
    private javax.swing.JButton jbConfirmaralteracao;
    private javax.swing.JButton jbDeletar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JLabel jlAltura;
    private javax.swing.JLabel jlCidade;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlInsignias;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlSexo;
    private javax.swing.JLayeredPane jlpAcoes;
    private javax.swing.JLayeredPane jlpAlterar;
    private javax.swing.JLayeredPane jlpFiltrar;
    private javax.swing.JLayeredPane jlpTabela;
    private javax.swing.JTextField jtAltura;
    private javax.swing.JTextField jtCidade;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtFiltrar;
    private javax.swing.JTextField jtInsignias;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtSexo;
    // End of variables declaration//GEN-END:variables
}