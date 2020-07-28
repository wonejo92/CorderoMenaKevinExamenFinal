package ec.edu.ups.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Paciente
 *
 */
@Entity

public class Paciente implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int cedula;
	private String nombres;
	private String Telefonos;
	private String Direccion;
	private String Correo;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "pacienteID")
	private List<CitasMedicas> listCitasMedicas;
	

	public Paciente() {
		super();
	}
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getCedula() {
		return cedula;
	}


	public void setCedula(int cedula) {
		this.cedula = cedula;
	}


	public String getNombres() {
		return nombres;
	}


	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public String getTelefonos() {
		return Telefonos;
	}


	public void setTelefonos(String telefonos) {
		Telefonos = telefonos;
	}


	public String getDireccion() {
		return Direccion;
	}


	public void setDireccion(String direccion) {
		Direccion = direccion;
	}


	public String getCorreo() {
		return Correo;
	}


	public void setCorreo(String correo) {
		Correo = correo;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		if (id != other.id)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Paciente [id=" + id + ", cedula=" + cedula + ", nombres=" + nombres + ", Telefonos=" + Telefonos
				+ ", Direccion=" + Direccion + ", Correo=" + Correo + "]";
	}
	
   
}
