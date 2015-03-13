package rrhh;
public class Empleado{

	protected int id;
	protected String nombre;
	protected String area;
	protected float salarioBase;
	protected Asistencias asistencias;


	public Empleado(){
		asistencias = new Asistencias();
	}

	public Empleado(int id, String nombre, String area, float salarioBase, Asistencias asistencias){
		this.id = id;
		this.nombre = nombre;
		this.area = area;
		this.salarioBase = salarioBase;
		asistencias = new Asistencias();
	}

	//getters y setters

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public String getNombre(){
		return nombre;
	}

	public void setArea(String area){
		this.area = area;
	}

	public String getArea(){
		return area;
	}

	public void setSalarioBase(float salarioBase){
		this.salarioBase = salarioBase;
	}

	public float getSalarioBase(){
		return salarioBase;
	}

	public void setAsistencias(Asistencias asistencias){
		this.asistencias = asistencias;
	}

	public Asistencias getAsistencias(){
		return asistencias;
	}

	//toString

	public String toString(){
		return "Id: " + this.id + ", nombre: " + nombre + ", área: " + area + ", salario: " + salarioBase;
	}

	//sobreecribir el método equals() con criterio de comparación: atributo id del empleado

	/*public boolean equals(Object o){
		if(o instanceof Empleado){
			Empleado temp = e;
		}
	}*/

}