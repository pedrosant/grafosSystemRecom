/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSV;

import com.oracle.webservices.internal.api.databinding.DatabindingModeFeature;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;


/**
 *
 * @author Roberto Borges
 */
public class ManipuladorRatingsCSV {

    ManipuladorMoviesCSV movies = new ManipuladorMoviesCSV();
    
    public ArrayList <String> listUserIDRatings = new ArrayList();
    public ArrayList <String> listMovieIDRatings = new ArrayList();
    public ArrayList <String> listRatings = new ArrayList();
    String idUser;
    public void arquivoRatings() {
        String diretorio = "ratings.csv";
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
                        listUserIDRatings.add(coluna[i]);
                    }
                    
                    for (int i = 1; i < 2; i++) {
                        listMovieIDRatings.add(coluna[i]);
                    }
                    
                    for (int i = 2; i < 3; i++) {
                        listRatings.add(coluna[i]);
                    }
                    
                }

            } while (linha != null);

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo Ratings.csv não encontrado");
        } catch (Exception e) {
            System.out.println("Erro ao ler arquivo");
        }
    }   
      
    
      int cont = 0;
      public void imprimirArray(){
          for(String nome: listMovieIDRatings){
              System.out.println(cont + ":" + nome);
              cont++;
          }
          
          
      }
      
      float notas;
      float userIdNum;
      public void imprimirFiltrado(String filme){
          for(int i = 0; i < listMovieIDRatings.size(); i++){
              if (listMovieIDRatings.get(i).equals(filme)) {
                  do {
                      int contador = i;
                      String idUser = listUserIDRatings.get(i);
                      System.out.println(movies.listTitleMovies.get(i));
                      for (int j = 0; j < movies.listTitleMovies.size(); j++) {
                        if (idUser.equals(listUserIDRatings.get(i))) {
                        System.out.println(movies.listTitleMovies.get(i));
                  }
              }
                  } while (idUser.equals(listUserIDRatings.get(i)));
                  
                  try {
                      String notaTexto = listRatings.get(i);
                      notas = Float.valueOf(notaTexto).floatValue();
                      System.out.println(notas);
                  } catch (NumberFormatException e) {
                      System.out.println("Erro ao converter");
                  }
                  
                  }
              }
              
          }
          
          public void pegarFIlmes(String id){
              System.out.println("Id Usuario: " + id);
              for (int i = 0; i < movies.listTitleMovies.size(); i++) {
                  if (id.equals(listUserIDRatings.get(i))) {
                      System.out.println(movies.listTitleMovies.get(i));
                  }
              }
          }
      }
      

        
       
  
        



