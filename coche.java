import java.io.*;
class Coche
{
   //Atributos
   String color;
   String marca;
   int km;
   
   //Metodo
   public static void main(String[]arg)
   {
       //crear objeto.
       Coche coche1 = new Coche();
       //Modificar el atributo
       coche1.color="rojo";
       coche1.marca="mitsubishi"; 
       coche1.km =0;

       //Modificar atributos.
       System.out.println("El color del coche es : " +coche1.color);
       System.out.println("La marca del coche es : " +coche1.marca);
       System.out.println("El km del coche es : " +coche1.km);
    }
}
