package rrhh;
import java.util.*;

public class Asistencia{

	private Date fecha;
	private int horasTrabajadas;

	public Asistencia(){}

	public Asistencia(Date fecha, int horasTrabajadas){
		this.fecha = fecha;
		this.horasTrabajadas = horasTrabajadas;
	}

	public void setFecha(Date fecha){
		this.fecha = fecha;
	}

	public Date getFecha(){
		return fecha;
	}

	public void setHorasTrabajadas(int horasTrabajadas){
		this.horasTrabajadas = horasTrabajadas;
	}

	public int getHorasTrabajadas(){
		return horasTrabajadas;
	}

	public String toString(){

		return "Asistencia del día " + fecha + " (" + horasTrabajadas + ") ";
	}
}