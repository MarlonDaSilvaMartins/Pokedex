/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import modelo.GinasioVO;
import servicos.GinasioServicos;
import servicos.ServicosFactory;

/**
 *
 * @author Marlon Martins
 * @since 07/05/2018 21:35
 * @version 1.0 red
 */
public class GUICadGinasio extends javax.swing.JInternalFrame {

    /**
     * Creates new form GUICadGinasio
     */
    public GUICadGinasio() {
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
        jlLocalizacao = new javax.swing.JLabel();
        jlTipo = new javax.swing.JLabel();
        jlLider = new javax.swing.JLabel();
        jlInsignia = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jtLocalizacao = new javax.swing.JTextField();
        jtTipo = new javax.swing.JTextField();
        jtLider = new javax.swing.JTextField();
        jtInsignia = new javax.swing.JTextField();
        jlpAcoes = new javax.swing.JLayeredPane();
        jbCadastrar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Ginásio");

        jlpDados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlNome.setText("Nome");

        jlLocalizacao.setText("Localização");

        jlTipo.setText("Tipo");

        jlLider.setText("Líder");

        jlInsignia.setText("Insígnia");

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

        jlpDados.setLayer(jlNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlLocalizacao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlTipo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlLider, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlInsignia, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtLocalizacao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtTipo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtLider, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtInsignia, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpDadosLayout = new javax.swing.GroupLayout(jlpDados);
        jlpDados.setLayout(jlpDadosLayout);
        jlpDadosLayout.setHorizontalGroup(
            jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jlpDadosLayout.createSequentialGroup()
                        .addComponent(jlLider)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtLider, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jlpDadosLayout.createSequentialGroup()
                        .addComponent(jlInsignia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtInsignia))
                    .addGroup(jlpDadosLayout.createSequentialGroup()
                        .addComponent(jlNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jlpDadosLayout.createSequentialGroup()
                        .addComponent(jlLocalizacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtLocalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jlpDadosLayout.createSequentialGroup()
                        .addComponent(jlTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jlpDadosLayout.setVerticalGroup(
            jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNome)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlLocalizacao)
                    .addComponent(jtLocalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTipo)
                    .addComponent(jtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlLider)
                    .addComponent(jtLider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlInsignia)
                    .addComponent(jtInsignia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jbCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jlpAcoesLayout.setVerticalGroup(
            jlpAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlpAcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlpAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jbLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlpDados, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlpAcoes))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlpDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlpAcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrar(){
        try {
            GinasioVO gVO = new GinasioVO();
            String nome=jtNome.getText();
            if(nome.isEmpty()){
                throw new NumberFormatException("Preencha o nome!");
            }
            gVO.setNome(jtNome.getText());
            
            String localizacao=jtLocalizacao.getText();
            if(localizacao.isEmpty()){
                throw new NumberFormatException("Preencha a Localização!");
            }
            gVO.setLocalizacao(jtLocalizacao.getText());
            
            String tipo=jtTipo.getText();
            if(tipo.isEmpty()){
                throw new NumberFormatException("Preencha o Tipo!");
            }
            gVO.setTipo(jtTipo.getText());
            
            String lider=jtLider.getText();
            if(lider.isEmpty()){
                throw new NumberFormatException("Preencha o lider!");
            }
            gVO.setLider(jtLider.getText());
            
            String insignia=jtInsignia.getText();
            if(insignia.isEmpty()){
                throw new NumberFormatException("Preencha qual a insígnia!");
            }
            gVO.setInsignia(jtInsignia.getText());
            
            GinasioServicos gs = ServicosFactory.getGinasioServicos();
            gs.cadastrarGinasio(gVO);
            
            JOptionPane.showMessageDialog(
                    this, 
                    "Ginásio registrado com sucesso!");            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    this, 
                    "Erro! "+e.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this, 
                    "Erro! "+e.getMessage());
        }//fecha catch
    }//fecha cadastrar
    
    private void limpar(){
        jtNome.setText(null);
        jtLocalizacao.setText(null);
        jtTipo.setText(null);
        jtLider.setText(null);
        jtInsignia.setText(null);
        jtNome.grabFocus();
    }//fecha limpar
    
    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        cadastrar();
        limpar();
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        limpar();
    }//GEN-LAST:event_jbLimparActionPerformed

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
            jbCadastrar.grabFocus();
        }//fecha if
    }//GEN-LAST:event_jtInsigniaKeyPressed

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
    private javax.swing.JLabel jlInsignia;
    private javax.swing.JLabel jlLider;
    private javax.swing.JLabel jlLocalizacao;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlTipo;
    private javax.swing.JLayeredPane jlpAcoes;
    private javax.swing.JLayeredPane jlpDados;
    private javax.swing.JTextField jtInsignia;
    private javax.swing.JTextField jtLider;
    private javax.swing.JTextField jtLocalizacao;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtTipo;
    // End of variables declaration//GEN-END:variables
}
