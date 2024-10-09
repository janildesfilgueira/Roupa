package Programa;
 // Importações
 import java.util.UUID;
 //classe
public class Fisica extends Pessoa {

   private String matricula;

    // construtor métado
    public Fisica ( String nome, String nacionalidade, String naturalidade){
     super (nome,nacionalidade,naturalidade);
     matricula=UUID.randomUUID().toString();
    }
   }

 