package ec.edu.ups.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: CitasMedicas
 *
 */
@Entity

public class CitasMedicas implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String precion;
	private String frecuenciacard�aca;
	private String frecuenciarespiratoria;
	private String temperatura;
	private String saturaci�n;
	
	@ManyToOne
	private Paciente pacienteID;
	

	public CitasMedicas() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getPrecion() {
		return precion;
	}


	public void setPrecion(String precion) {
		this.precion = precion;
	}


	public String getFrecuenciacard�aca() {
		return frecuenciacard�aca;
	}


	public void setFrecuenciacard�aca(String frecuenciacard�aca) {
		this.frecuenciacard�aca = frecuenciacard�aca;
	}


	public String getFrecuenciarespiratoria() {
		return frecuenciarespiratoria;
	}


	public void setFrecuenciarespiratoria(String frecuenciarespiratoria) {
		this.frecuenciarespiratoria = frecuenciarespiratoria;
	}


	public String getTemperatura() {
		return temperatura;
	}


	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}


	public String getSaturaci�n() {
		return saturaci�n;
	}


	public void setSaturaci�n(String saturaci�n) {
		this.saturaci�n = saturaci�n;
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
		CitasMedicas other = (CitasMedicas) obj;
		if (id != other.id)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "CitasMedicas [id=" + id + ", precion=" + precion + ", frecuenciacard�aca=" + frecuenciacard�aca
				+ ", frecuenciarespiratoria=" + frecuenciarespiratoria + ", temperatura=" + temperatura
				+ ", saturaci�n=" + saturaci�n + "]";
	}
	
   
}
