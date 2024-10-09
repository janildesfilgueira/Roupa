package Programa;
// Importações
import java.util.UUID;
//classe
public class Aluno extends Pessoa{

  private String matricula;

  //Construtor método
  public Aluno ( String nome, String nacionalidade, String naturalidade){
    super(nome,nacionalidade,naturalidade);
    matricula= UUID.randomUUID().toString();
  }  
}
