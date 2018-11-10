/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.DAOFactory;
import dao.TreinadorDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.TreinadorVO;

/**
 *
 * @author Marlon Martins
 * @since 06/05/2018 - 21:45
 * @version 1.0 red
 */
public class TreinadorServicos {
    
    public void cadastrarTreinador(TreinadorVO tVO) throws SQLException{
        TreinadorDAO tDAO = DAOFactory.getTreinadorDAO();
        tDAO.cadastrarTreinador(tVO);
    }//fecha treinador
    
    public ArrayList<TreinadorVO> buscarTreinador() throws SQLException{
        TreinadorDAO tDAO = DAOFactory.getTreinadorDAO();
        return tDAO.buscarTreinador();
    }//fecha buscar treinador
    
    public void alterarTreinador(TreinadorVO tVO) throws SQLException{
        TreinadorDAO tDAO = DAOFactory.getTreinadorDAO();
        tDAO.alterarPokemon(tVO);
    }//fecha alterar
    
    public void deletarTreinador(int id) throws SQLException{
        TreinadorDAO tDAO = DAOFactory.getTreinadorDAO();
        tDAO.deletarTreinador(id);
    }//fecha deletar
    
    public ArrayList<TreinadorVO> filtrar(String query) throws SQLException{
        TreinadorDAO tDAO = DAOFactory.getTreinadorDAO();
        return tDAO.filtrar(query);
    }//fecha filtrar
}//fecha class
