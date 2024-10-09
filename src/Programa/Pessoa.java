package Programa;
//classe
public class Pessoa {
 
   //Atributos 
   protected String nome, nacionalidade,naturalidade;
    private String identificador;

   // métodos construtor
   public Pessoa( String nome, String nacionalidade,String naturalidade){
      this.nome=nome;
      this.nacionalidade=nacionalidade;
      this.naturalidade=naturalidade;
   }  
 
   protected void atualizarNome (String nome){
      this.nome=nome;
   }

   protected String recuperarNome(){
      return this.nome;
   }
   
   protected String recuperarNacionalidade(){
      return this.nacionalidade;
   }
    
   protected String recuperarNaturalidade(){
      return this.naturalidade;
   }
   
   protected void atualizarID( String identificador){
      this.identificador= identificador;
   }
   
   protected String recuperarID () {
      return this.identificador;   
   }

 // encapsulamento getnome setnome

   public String getNome(){
     return this.nome;
   }
   public void setNome(String nome){
       this.nome = nome;
   }
   public String getNacionalidade(){
      return this.nacionalidade;
   }
   public void setNacionalidade(String nacionalidade){
      this.nacionalidade= nacionalidade;
   }
   public String getNaturalidade(){
      return this.naturalidade;
   }
   public void setNaturalidade(String naturalidade){
      this.naturalidade= naturalidade;
   }
}
