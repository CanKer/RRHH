package rrhh;
public class Enfermera extends Empleado{

	private String turno;
	private String piso;

	public Enfermera(){}

	public Enfermera(String turno, String piso){
		this.turno = turno;
		this.piso = piso;
	}

	public void setTurno(String turno){
		this.turno = turno;
	}

	public String getTurno(){
		return turno;
	}

	public void setPiso(String piso){
		this.piso = piso;
	}

	public String getPiso(){
		return piso;
	}

	public String toString(){
			return super.toString() + ", turno: " + turno + ", piso: " + piso;
	}

}