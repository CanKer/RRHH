package rrhh;
import java.util.*;

public class Empleados{

	private ArrayList<Empleado> arreglo = new ArrayList<Empleado>();
	private String nombreEmpresa;

	//Desde constructor crear instancias de Enfermera, Médico y Secretaria. Agregarlos al ArrayList
	public Empleados(){}

	public Empleados(String nombreEmpresa){
		this.nombreEmpresa = nombreEmpresa;
	}

	public void agregar(Empleado e){
		arreglo.add(e);
                   //                        int contador =  arreglo.size();
                     //                      System.out.println(contador);
	}
        
                  public void contadorEmpleados()   {
                                int contador = arreglo.size();
                                System.out.println(contador);
                    } 
	public ArrayList<Empleado> getArreglo(){
		return arreglo;
	}

	
	public Empleado buscarEmpleado(int id){
		for(int i=0; i < arreglo.size() ; i++){
			Empleado temp = arreglo.get(i);
			if(temp.getId() == id){
				return temp;
			}
		}
		return null;
	}

	public String toString(){
		String txt = "*******" + nombreEmpresa + "********";
		for(Empleado e: arreglo){
			txt += e.toString() + "\n";
		}
		txt += "***************";
		return txt;
	}
}