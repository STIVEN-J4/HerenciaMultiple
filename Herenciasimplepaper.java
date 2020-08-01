
package herenciasimple;
class Combustible{
    double precio_motor_combustible;
    double precio_motor;

void MostrarCaracteristicasPrecio(){
    System.out.println("El precio del motor más el precio del combustible son $:"
    +precio_motor_combustible+" dolares " +"\nEl precio del motor es $:"
    +precio_motor+" dolares");
}
}
class Gasolina extends Combustible{
    String tipo;
    double CalcularPrecio(){
        return precio_motor_combustible-precio_motor;
    }
    void MostrarTipo(){
        System.out.println("El tipo de combustible es :"+tipo);
    }
}
class Diesel extends Combustible{
    String tipo;
    double CalcularPrecio(){
        return precio_motor_combustible-precio_motor;
    }
    void MostrarTipo(){
        System.out.println("El tipo de combustible es :"+tipo);
    }
}
class Etanol extends Combustible{
    String tipo;
    double CalcularPrecio(){
        return precio_motor_combustible-precio_motor;
    }
    void MostrarTipo(){
        System.out.println("El tipo de combustible es :"+tipo);
    }
}
/**
 *
 * @author JULIO JIMÉNEZ
 */
public class Herenciasimple {


    public static void main(String[] args) {

        System.out.println("\tUniversidad de las Fuerzas Armadas ESPE ");
        System.out.println("\t\t\tSede Latacunga");
        System.out.println("Carrera: Ingenieria Automotriz");
        System.out.println("Nombre: Julio Jiménez");
        System.out.println("Docente:Ing.LUIS GUERRA");
        System.out.println("Materia: Programacion [7450]");
        System.out.println("\t\t\tHerencia Simple\n");

        Gasolina gasolina1=new Gasolina();
        Diesel diesel1=new Diesel();
        Etanol etanol1=new Etanol();

        gasolina1.precio_motor_combustible=2029.5;
        gasolina1.precio_motor=2000;
        gasolina1.tipo="Gasolina Súper";

        diesel1.precio_motor_combustible=2117.5;
        diesel1.precio_motor=2100;
        diesel1.tipo="Diésel Sintético";

        etanol1.precio_motor_combustible=3008.5;
        etanol1.precio_motor=3000;
        etanol1.tipo="Etanol Puro";

        System.out.println("Información del combustible Gasolina: ");
        gasolina1.MostrarTipo();
        gasolina1.MostrarCaracteristicasPrecio();
        System.out.println("El precio del tanque de gasolina en un vehículo es:$"
        +gasolina1.CalcularPrecio()+" dolares");
        System.out.println("");
        
        System.out.println("Información del combustible Diésel: ");
        diesel1.MostrarTipo();
        diesel1.MostrarCaracteristicasPrecio();
        System.out.println("El precio del tanque de diesel en un vehículo es:$"
        +diesel1.CalcularPrecio()+" dolares");
        System.out.println("");

        System.out.println("Información del combustible Etanol: ");
        etanol1.MostrarTipo();
        etanol1.MostrarCaracteristicasPrecio();
        System.out.println("El precio del galón de Etanol es:$"
        +etanol1.CalcularPrecio()+" Libras");
    }

}
