
public class App {
    public static void main(String[] args) throws Exception {

        // Objetos
        //Pessoa pessoa = new Pessoa("Ieleny", 28, "Desenvolvedora");
        //System.out.println("Nome da pessoa:");
        //System.out.println(pessoa.getNome());
        //System.out.println("Modificar nome da pessoa:");
        //pessoa.setNome("Janildes");
        //System.out.println(pessoa.getNome());

        //Animal 
        //Animal animal = new Animal("Lisa", 6, 5, "pelo curto americano");
        //System.out.println("nome gato");
        //System.out.println(animal.getNome());
        //System.out.println("idade");
        //animal.setIdade(7);
        //System.out.println(animal.getIdade());
        //System.out.println("peso");
        //animal.setPeso(8);
        //System.out.println(animal.getPeso());
        //System.out.println("raca");
        //System.out.println(animal.getRaca());

        // Gato
        Gato gato = new Gato("Lisa", 6, 5, "pelo curto americano");
        System.out.println("Gato");
        System.out.println(gato.getNome());
        System.out.println(gato.aranhar());
        System.out.println(gato.getRaca());
        gato.setRaca("pelo curto alemão");
        gato.fazerSom();

        System.out.println(" ");

        // BeijaFlor
        BeijaFlor beijaFlor = new BeijaFlor("Bella", 2, 1);
        System.out.println("Beija flor");
        System.out.println(beijaFlor.getNome());
        beijaFlor.fazerSom();

        //Leao
        Leao leao = new Leao("Nervosa",20 , 40);
        System.out.println("Leoa");
        System.out.println(leao.getNome());
        leao.fazerSom();
        
        System.out.println("Idade em meses:");
        leao.calcularIdadeMesesEmAnos(-
        
        15.0);

    }
}
