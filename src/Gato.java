public class Gato extends Animal {

    Gato(String nome, Integer idade, float peso, String raca) {
        // Constructor da super classe
        super(nome, idade, peso);
        setRaca(raca);
    }

    // Metodo
    public String aranhar(){
        return "Gato arranhando";
    }

    // Polimorfismo
    public void MIAR (){
        System.out.println("MIAR");
    }
    
}
