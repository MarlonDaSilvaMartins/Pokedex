/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

/**
 *
 * @author Marlon Martins
 * @since 06/05/2018 - 00:27
 * @version 1.0 red
 */
public class ServicosFactory {
    
    private static final PokemonServicos PS = new PokemonServicos();
    private static final TreinadorServicos TS = new TreinadorServicos();
    private static final GinasioServicos GS = new GinasioServicos();
    
    public static PokemonServicos getPokemonServicos(){
        return PS;
    }//fecha pokemon servicos
    
    public static TreinadorServicos getTreinadorServicos(){
        return TS;
    }//fecha treinador servicos
    
    public static GinasioServicos getGinasioServicos(){
        return GS;
    }//fecha ginasio servicos 
}//fecha class
