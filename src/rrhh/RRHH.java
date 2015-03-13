package rrhh;


import java.util.Scanner;


public class RRHH {


    public static void main(String[] args) {
        
        mostrarMenu();
        
    }
    public static void mostrarMenu()	{
		
                                   int caso;
                             
                                         Empleados empleados = new Empleados();
                                         do { 
                                             Scanner entrada = new Scanner(System.in);
                                         System.out.println("¿Qué desea saber?: ");
                                           System.out.println("1) Mostrar los empleados existentes: ");
                                           System.out.println("2) Agregar nuevos empleados: ");
                                           System.out.println("3) Buscar empleado por ID: ");
                                           System.out.println("4) Registro de asistencia: ");
                                           System.out.println("5) Calcular nómina: ");
                                           System.out.println("6) Salir: ");
                                           caso = entrada.nextInt();
                                        
                                          
                                           Empleados empleados2 = new Empleados();
		switch (caso) {
			
			case 1: 
			//	empleados.agregar();
                                empleados.contadorEmpleados();

			break;

			case 2:
                            empleados.agregar(null);
			break;

			case 3:
                            System.out.println("Dame el id del empleado a buscar");
                            int id = entrada.nextInt();
                            empleados.buscarEmpleado(id);
			break;

			case 4:
			break;

			case 5:
			break;

		}
                               } while (caso < 6 );


	}

}
