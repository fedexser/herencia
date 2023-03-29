public class Main {
    public static void main(String[] args) throws Exception {
        Cliente cliente= new Cliente();
        cliente.edad= 34;
        cliente.nombre= "Federico Serra";
        cliente.telefono= 3516808968l;
        cliente.credito= 15000;

        System.out.println("Cliente:");
        System.out.println("Edad: "+cliente.edad);
        System.out.println("Nombre: "+cliente.nombre);
        System.out.println("Telefono: "+cliente.telefono);
        System.out.println("Credito: "+cliente.credito);
        System.out.println("-----------");

        Trabajador trabajador= new Trabajador();
        trabajador.edad= 33;
        trabajador.nombre="Carla Najot";
        trabajador.telefono=3512584312l;
        trabajador.salario= 30000;

        System.out.println("Trabajador:");
        System.out.println("Edad: "+trabajador.edad);
        System.out.println("Nombre: "+trabajador.nombre);
        System.out.println("Telefono: "+trabajador.telefono);
        System.out.println("Salario: "+trabajador.salario);
    }
}

class Persona{
    int edad;
    String nombre;
    long telefono;
}

class Cliente extends Persona{
    int credito;
}

class Trabajador extends Persona{
    int salario;
}
