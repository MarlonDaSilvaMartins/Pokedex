/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.DAOFactory;
import dao.GinasioDAO;
import dao.TreinadorDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.GinasioVO;
import modelo.TreinadorVO;

/**
 *
 * @author Marlon Martins
 * @since 07/05/2018 - 16:50
 * @version 1.0 red
 */
public class GinasioServicos {
    
    public void cadastrarGinasio(GinasioVO gVO) throws SQLException{
        GinasioDAO gDAO = DAOFactory.getGinasioDAO();
        gDAO.cadastrarGinasio(gVO);
    }//fecha cadastrar
    
    public ArrayList<GinasioVO> buscarGinasio() throws SQLException{
        GinasioDAO gDAO = DAOFactory.getGinasioDAO();
        return gDAO.buscarGinasio();
    }//fecha buscar
    
    public void alterarGinasio(GinasioVO gVO) throws SQLException{
        GinasioDAO gDAO = DAOFactory.getGinasioDAO();
        gDAO.alterarGinasio(gVO);
    }//fecha alterar
    
    public void deletarGinasio(int id) throws SQLException{
        GinasioDAO gDAO = DAOFactory.getGinasioDAO();
        gDAO.deletarGinasio(id);
    }//fecha deletar
    
    public ArrayList<GinasioVO> filtrar(String query) throws SQLException{
        GinasioDAO gDAO = DAOFactory.getGinasioDAO();
        return gDAO.filtrar(query);
    }//fecha filtrar
    
}//fecha class
