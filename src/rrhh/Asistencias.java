package rrhh;
import java.util.*;

public class Asistencias{

	private ArrayList<Asistencia> arreglo = new ArrayList<Asistencia>();

	public Asistencias(){}

	public void agregar(Asistencia a){
		arreglo.add(a);
	}

/*	public int totalDiasTrabajados(){
		for(Asistencia a: arreglo){
			if(a.getHorasTrabajadas() >= 8){
				return ;
			}
		}return 0;
	} */

	public String toString(){
		String txt = " ---- Asistencias ---- \n";
		for(Asistencia a: arreglo){
			txt += a.toString();
		}
		return txt;
	}

}