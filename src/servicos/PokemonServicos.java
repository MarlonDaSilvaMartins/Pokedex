/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.DAOFactory;
import dao.PokemonDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.PokemonVO;

/**
 *
 * @author Marlon Martins
 * @since 06/05/2018 - 00:23
 * @version 1.0 red
 */
public class PokemonServicos {
    
    public void cadastrarPokemon(PokemonVO pVO) throws SQLException{
        PokemonDAO pDAO = DAOFactory.getPokemonDAO();
        pDAO.cadastrarPokemon(pVO);
    }//fecha cadastrar poekmon
    
    public ArrayList<PokemonVO> buscarPokemon() throws SQLException{
        PokemonDAO pDAO = DAOFactory.getPokemonDAO();
        return pDAO.buscarPokemon();
    }//fecha buscar pokemon
    
    public void alterarPokemon(PokemonVO pVO) throws SQLException{
        PokemonDAO pDAO = DAOFactory.getPokemonDAO();
        pDAO.alterarPokemon(pVO);
    }//fecha alterar
    
    public void deletarPokemon(int id) throws SQLException{
        PokemonDAO pDAO = DAOFactory.getPokemonDAO();
        pDAO.deletarPokemon(id);
    }//fecha deletar
    
    public ArrayList<PokemonVO> filtrar(String query) throws SQLException{
        PokemonDAO pDAO = DAOFactory.getPokemonDAO();
        return pDAO.filtrar(query);
    }//fecha filtrar
}//class
