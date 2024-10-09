public class Pessoa {

    // Atributos
    private String nome;
    private Integer idade;
    private String profissao;

    //Construtor 
    Pessoa(String nome, Integer idade, String profissao){
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }

    // Encapsulamento
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Integer getIdade(){
        return this.idade;
    }

    public void setIdade(Integer idade){
        this.idade = idade;
    }

    public String getProfissao(){
        return this.profissao;
    }

    public void setProfissao(String profissao){
        this.profissao = profissao;
    }
}
