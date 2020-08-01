
package etanol;
interface Densidad{
    default String Combustible(String costo){
        return "El consumo de gasolina "+costo+" es económico ";
    }
}
interface Punto_Ebullicion{
    default String Combustible(String costo){
        return "Se caliente a altas temperaturas por lo que"
        +costo+"su perdida es menor";
    }
}

public class Etanol implements Densidad,Punto_Ebullicion {
/*@Override
    public String Combustible (String costo){
        //Se puede elegir la implementación de una interfaz
        //por ejemplo, escogemos que sea Afectuoso
        return Densidad.super.Combustible(costo);
    }*/

    @Override
    public String Combustible(String costo){

    return Punto_Ebullicion.super.Combustible(costo);
    }

    public static void main(String[] args) {


        System.out.println("\tUniversidad de las Fuerzas Armadas ESPE ");
        System.out.println("\t\t\tSede Latacunga");
        System.out.println("Carrera: Ingenieria Automotriz");
        System.out.println("Nombre: Julio Jiménez");
        System.out.println("Docente:Ing.LUIS GUERRA");
        System.out.println("Materia: Programacion [7450]");
        System.out.println("\t\t\tHerencia Multiple\n");

        Etanol etanol=new Etanol();
        System.out.println(etanol.Combustible("\ncuesta menos, por lo tanto: "));
    }

}
