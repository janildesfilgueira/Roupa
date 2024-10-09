package Programa;
// Importações
import java.util.UUID;
//classe
public class Jurídica extends Pessoa {
    
   private String matricula;

   // construtor método
   public Jurídica (String nome, String nacionalidade, String naturalidade){
    super(nome,nacionalidade,naturalidade);
    matricula= UUID.randomUUID().toString();
   } 
}
