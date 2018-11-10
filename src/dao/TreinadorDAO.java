/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.TreinadorVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author Marlon Martins
 * @since 06/05/2018 - 21:17
 * @version 1.0 red
 */
public class TreinadorDAO {
    
    public void cadastrarTreinador(TreinadorVO tVO) throws SQLException{
    
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
           String sql;
           
           sql = "insert into treinador(idtreinador,nome,sexo,cidade,altura,qtdinsignias)" +
                 "values(null,'"+tVO.getNome()+"','"+tVO.getSexo()+"','"+tVO.getCidade()+"',"+tVO.getAltura()+","+tVO.getQtdinsignias(                  )+");";
           
           stat.execute(sql);
        } catch (Exception e) {
            throw new SQLException("Erro ao cadastrar"+e.getMessage());
        } finally {
            stat.close();
            con.close();
        }
    }//fecha cadastrar treinador
    
    public ArrayList<TreinadorVO> buscarTreinador() throws SQLException{
        
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            
            String sql;
            sql = "select * from treinador";
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<TreinadorVO> treinador = new ArrayList<>();
            while(rs.next()){
                TreinadorVO tVO = new TreinadorVO();
                tVO.setIdtreinador(rs.getInt("idtreinador"));
                tVO.setNome(rs.getString("nome"));
                tVO.setSexo(rs.getString("sexo"));
                tVO.setCidade(rs.getString("cidade"));
                tVO.setAltura(rs.getFloat("altura"));
                tVO.setQtdinsignias(rs.getInt("qtdinsignias"));
                treinador.add(tVO);
            }//fecha while
            
            return treinador;
        } catch (Exception e) {
            throw new SQLException("Erro ao buscar "+e.getMessage());
        } finally {
            stat.close();
            con.close();
        }//fecha finally
    }//fecha buscarteruinador
    
    public void alterarPokemon(TreinadorVO tVO) throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;
            
            sql = "update treinador set " 
                + "nome='"+tVO.getNome()+"', sexo='"+tVO.getSexo()+"', cidade='"+tVO.getCidade()+"', altura="+tVO.getAltura()+", qtdinsignias="+tVO.getQtdinsignias()+" " 
                + "where idtreinador="+tVO.getIdtreinador()+"";
            
            stat.executeUpdate(sql);
        } catch (Exception e) {
                throw new SQLException("Erro ao alterar treinador! "+e.getMessage());
        } finally {
            stat.close();
            con.close();
        }//fecha finally        
    }//fecha alterarpokemon
    
    public void deletarTreinador(int id) throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql = "delete from treinador where idtreinador = "+id;
            stat.execute(sql);
        } catch (Exception e) {
            throw new SQLException("Erro ao deletar treinador "+e.getMessage());
        } finally {
            stat.close();
            con.close();
        }//fecha finally
    }//fecha deleta
    
    public ArrayList<TreinadorVO> filtrar(String query) throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;
            sql = "select * from treinador "+query;
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<TreinadorVO> treinador = new ArrayList<>();
            while(rs.next()){
                TreinadorVO t = new TreinadorVO();
                t.setIdtreinador(rs.getInt("idtreinador"));
                t.setNome(rs.getString("nome"));
                t.setSexo(rs.getString("sexo"));
                t.setCidade(rs.getString("cidade"));
                t.setAltura(rs.getFloat("altura"));
                t.setQtdinsignias(rs.getInt("qtdinsignias"));
                treinador.add(t);
            }//fecha while
            return treinador;
        } catch (Exception e) {
            throw new SQLException("Erro ao filtrar treinador "+e.getMessage());
        } finally {
            stat.close();
            con.close();
        }//fecha finally
    }//fecha filtrar
}//fecha class
