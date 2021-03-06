/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import modelo.TreinadorVO;
import servicos.ServicosFactory;
import servicos.TreinadorServicos;

/**
 *
 * @author Marlon Martins
 * @since 06/05/2018 - 21:55
 * @version 1.0 red
 */
public class GUICadTreinador extends javax.swing.JInternalFrame {

    /**
     * Creates new form GUICadTreinador
     */
    public GUICadTreinador() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlpDados = new javax.swing.JLayeredPane();
        jlNome = new javax.swing.JLabel();
        jlSexo = new javax.swing.JLabel();
        jlCidade = new javax.swing.JLabel();
        jlAltura = new javax.swing.JLabel();
        jlQtdinsignias = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jtSexo = new javax.swing.JTextField();
        jtCidade = new javax.swing.JTextField();
        jtAltura = new javax.swing.JTextField();
        jtQtdinsignias = new javax.swing.JTextField();
        jlpAcoes = new javax.swing.JLayeredPane();
        jbCadastrar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Treinador");

        jlpDados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlNome.setText("Nome");

        jlSexo.setText("Sexo");

        jlCidade.setText("Cidade");

        jlAltura.setText("Altura");

        jlQtdinsignias.setText("Qtd. insignias");

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

        jtQtdinsignias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtQtdinsigniasKeyPressed(evt);
            }
        });

        jlpDados.setLayer(jlNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlSexo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlCidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlAltura, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlQtdinsignias, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtSexo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtCidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtAltura, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtQtdinsignias, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpDadosLayout = new javax.swing.GroupLayout(jlpDados);
        jlpDados.setLayout(jlpDadosLayout);
        jlpDadosLayout.setHorizontalGroup(
            jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpDadosLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jlpDadosLayout.createSequentialGroup()
                        .addComponent(jlNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtNome))
                    .addGroup(jlpDadosLayout.createSequentialGroup()
                        .addComponent(jlCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtCidade))
                    .addGroup(jlpDadosLayout.createSequentialGroup()
                        .addComponent(jlQtdinsignias)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtQtdinsignias))
                    .addGroup(jlpDadosLayout.createSequentialGroup()
                        .addComponent(jlSexo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtSexo))
                    .addGroup(jlpDadosLayout.createSequentialGroup()
                        .addComponent(jlAltura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtAltura)))
                .addContainerGap())
        );
        jlpDadosLayout.setVerticalGroup(
            jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpDadosLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNome)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSexo)
                    .addComponent(jtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtCidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCidade))
                .addGap(18, 18, 18)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAltura)
                    .addComponent(jtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlQtdinsignias)
                    .addComponent(jtQtdinsignias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jlpAcoes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbCadastrar.setText("Cadastrar");
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });
        jbCadastrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbCadastrarKeyPressed(evt);
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

        jlpAcoes.setLayer(jbCadastrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAcoes.setLayer(jbLimpar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpAcoesLayout = new javax.swing.GroupLayout(jlpAcoes);
        jlpAcoes.setLayout(jlpAcoesLayout);
        jlpAcoesLayout.setHorizontalGroup(
            jlpAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpAcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jlpAcoesLayout.setVerticalGroup(
            jlpAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpAcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlpAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCadastrar)
                    .addComponent(jbLimpar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlpDados)
                    .addComponent(jlpAcoes))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlpDados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlpAcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrar(){
        try {
            TreinadorVO tVO = new TreinadorVO();
            String nome=jtNome.getText();
            if(nome.isEmpty()){
                throw new NumberFormatException("Preencha o nome!");
            }
            tVO.setNome(jtNome.getText());
            
            String sexo=jtSexo.getText();
            if(sexo.isEmpty()){
                throw new NumberFormatException("Preencha o sexo!");
            }
            tVO.setSexo(jtSexo.getText());
            
            String cidade=jtCidade.getText();
            if(cidade.isEmpty()){
                throw new NumberFormatException("Preencha a cidade!");
            }
            tVO.setCidade(jtCidade.getText());
            
            String altura=jtAltura.getText();
            if(altura.isEmpty()){
                throw new NumberFormatException("Preencha a altura!");
            }
            tVO.setAltura(Float.parseFloat(jtAltura.getText()));
            
            String insignias=jtQtdinsignias.getText();
            if(insignias.isEmpty()){
                throw new NumberFormatException("Preencha as insígnias!");
            }
            tVO.setQtdinsignias(Integer.parseInt(jtQtdinsignias.getText()));
            
            TreinadorServicos ts = ServicosFactory.getTreinadorServicos();
            ts.cadastrarTreinador(tVO);
            
            JOptionPane.showMessageDialog(
                    this,
                    "Treinador cadastrado com sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Erro! "+e.getMessage());
        }//fecha catch
    }//fecah cadastrar
    
    private void limpar(){
        jtNome.setText(null);
        jtSexo.setText(null);
        jtCidade.setText(null);
        jtAltura.setText(null);
        jtQtdinsignias.setText(null);
        jtNome.grabFocus();
    }//fecah limpar
    
    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        cadastrar();
        limpar();
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        limpar();
    }//GEN-LAST:event_jbLimparActionPerformed

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
            jtQtdinsignias.grabFocus();
        }//fecha if
    }//GEN-LAST:event_jtAlturaKeyPressed

    private void jtQtdinsigniasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtQtdinsigniasKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jbCadastrar.grabFocus();
        }//fecha if
    }//GEN-LAST:event_jtQtdinsigniasKeyPressed

    private void jbCadastrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbCadastrarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cadastrar();
            limpar();
        }//fecha if
    }//GEN-LAST:event_jbCadastrarKeyPressed

    private void jbLimparKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbLimparKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            limpar();
        }//fecha if
    }//GEN-LAST:event_jbLimparKeyPressed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JLabel jlAltura;
    private javax.swing.JLabel jlCidade;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlQtdinsignias;
    private javax.swing.JLabel jlSexo;
    private javax.swing.JLayeredPane jlpAcoes;
    private javax.swing.JLayeredPane jlpDados;
    private javax.swing.JTextField jtAltura;
    private javax.swing.JTextField jtCidade;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtQtdinsignias;
    private javax.swing.JTextField jtSexo;
    // End of variables declaration//GEN-END:variables
}
