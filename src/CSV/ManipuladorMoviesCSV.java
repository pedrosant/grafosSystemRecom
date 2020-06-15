/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSV;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;


/**
 *
 * @author Roberto Borges
 */
public class ManipuladorMoviesCSV {
    HashMap<String, String> movies = new LinkedHashMap<>();
    
    public ArrayList <String> listIDMovies = new ArrayList();
    public ArrayList <String> listTitleMovies = new ArrayList();
    public ArrayList <String> listGeneroMovies = new ArrayList();
    
    public void arquivoMovie() {
        String diretorio = "movies.csv";
        try {
            FileInputStream arquivo = new FileInputStream(diretorio);
            InputStreamReader lerArquivo = new InputStreamReader(arquivo);
            BufferedReader lerLinha = new BufferedReader(lerArquivo);

            String linha;
            do {
                linha = lerLinha.readLine();
                if (linha != null) {

                    String[] coluna = linha.split(",");                    
                    
                    
                    for (int i = 0; i < 1; i++) {
                        listIDMovies.add(coluna[i]);
                    }
                    
                    for (int i = 1; i < 2; i++) {
                        listTitleMovies.add(coluna[i]);
                    }
                    
                    for (int i = 2; i < 3; i++) {
                        listGeneroMovies.add(coluna[i]);
                    }
                    
                }

            } while (linha != null);

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo movie.csv não encontrado");
        } catch (Exception e) {
            System.out.println("Erro ao ler arquivo");
        }
    }   
      
    
      int cont = 0;
      public void imprimirArray(){
          for(String nome: listTitleMovies){
              System.out.println(cont + ":" +nome);
              cont ++;
          }
          
          
      }
}
