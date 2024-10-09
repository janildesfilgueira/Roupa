public class BeijaFlor extends Animal {
    
    BeijaFlor(String nome, Integer idade, float peso){
        
        super(nome, idade, peso);
    }

    // Polimorfismo
    public void fazerSom(){
        System.out.println("TIC");
    }
}
