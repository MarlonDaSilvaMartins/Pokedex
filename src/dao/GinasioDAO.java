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
import modelo.GinasioVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author Marlon Martins
 * @since 07/05/2018 - 16:26
 * @version 1.0 red
 */
public class GinasioDAO {
    
    public void cadastrarGinasio(GinasioVO gVO) throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql;
            
            sql = "insert into ginasio(idginasio,nome,localizacao,tipo,lider,insignia)" +
                  "values(null,'"+gVO.getNome()+"','"+gVO.getLocalizacao()+"','"+gVO.getTipo()+"','"+gVO.getLider()+"','"+gVO.getInsignia()+"');";
            
            stat.execute(sql);
        } catch (Exception e) {
            throw new SQLException("Erro ao cadastrar ginasio "+e.getMessage());
        } finally {
            stat.close();
            con.close();
        }//fecha finally
    }//fecha cadastrar ginasio
    
    public ArrayList<GinasioVO> buscarGinasio() throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql;
            sql = "select * from ginasio";
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<GinasioVO> ginasio = new ArrayList<>();
            
            while(rs.next()){
                GinasioVO gVO = new GinasioVO();
                
                gVO.setIdginasio(rs.getInt("idginasio"));
                gVO.setNome(rs.getString("nome"));
                gVO.setLocalizacao(rs.getString("localizacao"));
                gVO.setTipo(rs.getString("tipo"));
                gVO.setLider(rs.getString("lider"));
                gVO.setInsignia(rs.getString("insignia"));
                ginasio.add(gVO);
            }//fecha while
            
            return ginasio;
        } catch (Exception e) {
            throw new SQLException("Erro ao buscar ginasio"+e.getMessage());
        } finally {
            stat.close();
            con.close();
        }//fecha finally
    }//fecha buscar ginasio
    
    public void alterarGinasio(GinasioVO gVO) throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;
            
            sql = "update ginasio set " 
                + "nome='"+gVO.getNome()+"', localizacao='"+gVO.getLocalizacao()+"', tipo='"+gVO.getTipo()+"', lider='"+gVO.getLider()+"', insignia='"+gVO.getInsignia()+"' " 
                + "where idginasio="+gVO.getIdginasio()+"";
            
            stat.executeUpdate(sql);
        } catch (Exception e) {
                throw new SQLException("Erro ao alterar ginásio! "+e.getMessage());
        } finally {
            stat.close();
            con.close();
        }//fecha finally        
    }//fecha alterarpokemon
    
    public void deletarGinasio(int id) throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql = "delete from ginasio where idginasio = "+id;
            stat.execute(sql);
        } catch (Exception e) {
            throw new SQLException("Erro ao deletar ginasio "+e.getMessage());
        } finally {
            stat.close();
            con.close();
        }//fecha finally
    }//fecha deleta
    
    public ArrayList<GinasioVO> filtrar(String query) throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;
            sql = "select * from ginasio "+query;
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<GinasioVO> ginasio = new ArrayList<>();
            while(rs.next()){
                GinasioVO g = new GinasioVO();
                g.setIdginasio(rs.getInt("idginasio"));
                g.setNome(rs.getString("nome"));
                g.setLocalizacao(rs.getString("localizacao"));
                g.setTipo(rs.getString("tipo"));
                g.setLider(rs.getString("lider"));
                g.setInsignia(rs.getString("insignia"));
                ginasio.add(g);
            }//fecha while
            return ginasio;
        } catch (Exception e) {
            throw new SQLException("Erro ao filtrar ginasio "+e.getMessage());
        } finally {
            stat.close();
            con.close();
        }//fecha finally
    }//fecha filtrar
}//fecha class
