/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Marlon Martins
 * @since 06/05/2018 - 00:20
 * @version 1.0 red
 */
public class DAOFactory {
    
    private static final PokemonDAO PDAO = new PokemonDAO();
    private static final TreinadorDAO TDAO = new TreinadorDAO();
    private static final GinasioDAO GDAO = new GinasioDAO();
    
    public static PokemonDAO getPokemonDAO(){
        return PDAO;
    }//fecha pokemaodao
    
    public static TreinadorDAO getTreinadorDAO(){
        return TDAO;
    }//fecha treinadordao
    
    public static GinasioDAO getGinasioDAO(){
        return GDAO;
    }//fecha ginasiodao
}//fecha class
