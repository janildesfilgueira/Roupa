package Roupa;

import java.util.EnumSet;

public class Roupa {
    
    public static void main(String[] args)  {
      Classico classico= new Classico ( "masculino", "M");
      System.out.println(classico.getGenero());
      System.out.println(classico.recuperarTamanho());

    //casual
    Casual casual= new Casual("femenino", "p");
     System.out.println(casual.getGenero());
     System.out.println(casual.recuperarTamanho());
     
     //vintage
     Vintage vintage= new Vintage("femnino", "G");
     System.out.println(vintage.getGenero());
     System.out.println(vintage.recuperarTamanho());
     
     // esportivo

    Esportivo esportivo=new Esportivo("femenino","PP");
    System.out.println(esportivo.getGenero());
    System.out.println(esportivo.recuperarTamanho());
}

} 