package Roupa;

//classe
public class Tipo {

    // tributos
    protected String genero,tamanho;
    private String identificador;

    // método construtor

    public Tipo (String genero, String tamanho){
        this.genero=genero;
        this.tamanho=tamanho;
    }

    protected void atualizarTamanho(String tamanho){
        this.tamanho=tamanho;
    }

    protected String recuperarTamanho(){
        return this.tamanho;
    }

    protected void atualizarID( String identificador){
        this.identificador= identificador;
    }

    protected String recuperarID (){
        return this.identificador;
    }

    // encapsulamento  gettipo settipo
    public String getGenero (){
        return this.genero;
    }

    public void setGenero(String genero){
        this.genero=genero;
    }
        
} 

