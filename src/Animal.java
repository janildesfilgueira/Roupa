public class Animal {
    
    // Inserir os atributos - Nome, idade, peso, raça
    private String nome;
    private Integer idade;
    private float peso;
    private String raca;

    // Construtor - Nome, idade, peso, raça
    Animal(String nome, Integer idade, float peso){
        this.nome=nome;
        this.idade=idade;
        this.peso=peso;
    }

    // Encapsulamento - getNome e setNome
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
 
    public Integer getIdade ( ){
        return this.idade;
    }
    public void setIdade(Integer idade){                                                
        this.idade = idade;
    }

    public float getPeso (){
        return this.peso;
    }
    public void setPeso( float peso){
        this.peso = peso;   
    }

    public String getRaca (){
        return this.raca;
    }
    public void setRaca(String raca){
        this.raca=raca;
    }

    // Metodo Polimorfismo
    public void fazerSom(){
        System.out.println("Som padrão");
    }
}
