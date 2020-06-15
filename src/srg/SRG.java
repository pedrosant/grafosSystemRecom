/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srg;
import CSV.ManipuladorMoviesCSV;
import CSV.ManipuladorRatingsCSV;
import java.util.Scanner;
/**
 *
 * @author Roberto Borges
 */
public class SRG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       ManipuladorMoviesCSV movies = new ManipuladorMoviesCSV();
       ManipuladorRatingsCSV ratings = new ManipuladorRatingsCSV();
       String respostaFilmes;
       int numFilmes;
       
       System.out.println ("Seja bem vindo vamos assitir um filmes ? (S/N)");
       String resposta = scan.nextLine();
        if (resposta.equals("s")) {
            System.out.println ("Escolha seu filme digitando o número que aparece do lado do título!");            
            movies.arquivoMovie();
            movies.imprimirArray();
            ratings.arquivoRatings();
            do{
            System.out.println ("Escolha seu filme digitando o número que aparece do lado do título!");
            numFilmes = scan.nextInt();
            System.out.println("você escolheu o filme: " + movies.listTitleMovies.get(numFilmes));
                
                System.out.println(movies.listGeneroMovies.get(numFilmes));
                System.out.println("ESCOLHER OUTRO FILME ? (s/n)");
                respostaFilmes = scan.next();
            }while(respostaFilmes.equals("s"));
            String titulo = movies.listTitleMovies.get(numFilmes);
            String genero = movies.listGeneroMovies.get(numFilmes);
            System.out.println("Outros filmes porque você escolheu ");
            //pegar id do filmes
            
            String id = Integer.toString(numFilmes);
            
            
            
            
            
        }
       
       
       
    }
    
}
