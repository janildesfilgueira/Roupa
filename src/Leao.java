public class Leao extends Animal{
 
    Leao (String nome,Integer idade,float peso){
        // Constructor da super classe
        super(nome, idade, peso);
    }

    // polimorfismo
    public void fazerSom(){

        System.out.println("UUUUUUUUUUUUUUUU"); 
    }

    // Metodos
    public void calcularIdadeMesesEmAnos(Double meses) throws Exception{

        Double ano = 0.0;

        try {

            if(meses >= 12){
                ano = meses / 12; 
                
            }

            if(meses < 0){
                throw new ArithmeticException();
            }

        } catch (ArithmeticException e) {
            System.out.print("Error: Número não pode ser menor que zero! ");
            System.out.print(e);
        } finally {
            System.out.print(" A idade do animal é:");
            System.out.print(ano);
        }
    }
}

