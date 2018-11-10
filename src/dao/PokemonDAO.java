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
import modelo.PokemonVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author Marlon Martins
 * @since 05/05/2018 : 23:43
 * @version 1.0 red
 */
public class PokemonDAO {
    
    public void cadastrarPokemon(PokemonVO pVO) throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql;
            
            sql = "insert into pokemon(idpokemon,nome,tipo,categoria,peso,altura,habilidade)" +
                  "values(null,'"+pVO.getNome()+"','"+pVO.getTipo()+"','"+pVO.getCategoria()+"',"+pVO.getPeso()+","+pVO.getAltura()+",'"+pVO.getHabilidade()+"');";
            
            stat.execute(sql);
        } catch (Exception e) {
            throw new SQLException("Erro ao cadastrar "+e.getMessage());
        } finally {
            stat.close();
            con.close();
        }//fecha finally
    }//cadastrarPokemon
    
    public ArrayList<PokemonVO> buscarPokemon() throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql;
            sql = "select * from pokemon";
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<PokemonVO> pokemon = new ArrayList<>();
            
            while(rs.next()){
                PokemonVO pVO = new PokemonVO();
                
                pVO.setIdpokemon(rs.getInt("idpokemon"));
                pVO.setNome(rs.getString("nome"));
                pVO.setTipo(rs.getString("tipo"));
                pVO.setCategoria(rs.getString("categoria"));
                pVO.setPeso(rs.getFloat("peso"));
                pVO.setAltura(rs.getFloat("altura"));
                pVO.setHabilidade(rs.getString("habilidade"));
                pokemon.add(pVO);
            }//while
            
            return pokemon;
        } catch (Exception e) {
            throw new SQLException("Erro ao buscar dados do banco! "+e.getMessage());
        } finally {
            stat.close();
            con.close();
        }//fecha finally
    }//fecha buscarpokemon
    
    public void alterarPokemon(PokemonVO pVO) throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;
            
            sql = "update pokemon set " 
                + "nome='"+pVO.getNome()+"', tipo='"+pVO.getTipo()+"', categoria='"+pVO.getCategoria()+"', peso="+pVO.getPeso()+", altura="+pVO.getAltura()+", habilidade='"+pVO.getHabilidade()+"' " 
                + "where idpokemon="+pVO.getIdpokemon()+"";
            
            stat.executeUpdate(sql);
        } catch (Exception e) {
                throw new SQLException("Erro ao alterar pokemon! "+e.getMessage());
        } finally {
            stat.close();
            con.close();
        }//fecha finally        
    }//fecha alterarpokemon
    
    public void deletarPokemon(int id) throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql = "delete from pokemon where idpokemon = "+id;
            stat.execute(sql);
        } catch (Exception e) {
            throw new SQLException("Erro ao deletar pokemon "+e.getMessage());
        } finally {
            stat.close();
            con.close();
        }//fecha finally
    }//fecha deleta
    
    public ArrayList<PokemonVO> filtrar(String query) throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;
            sql = "select * from pokemon "+query;
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<PokemonVO> pokemon = new ArrayList<>();
            while(rs.next()){
                PokemonVO p = new PokemonVO();
                p.setIdpokemon(rs.getInt("idpokemon"));
                p.setNome(rs.getString("nome"));
                p.setTipo(rs.getString("tipo"));
                p.setCategoria(rs.getString("categoria"));
                p.setPeso(rs.getFloat("peso"));
                p.setAltura(rs.getFloat("altura"));
                p.setHabilidade(rs.getString("habilidade"));
                pokemon.add(p);
            }//fecha while
            return pokemon;
        } catch (Exception e) {
            throw new SQLException("Erro ao filtrar pokemon "+e.getMessage());
        } finally {
            stat.close();
            con.close();
        }//fecha finally
    }//fecha filtrar
}//class
