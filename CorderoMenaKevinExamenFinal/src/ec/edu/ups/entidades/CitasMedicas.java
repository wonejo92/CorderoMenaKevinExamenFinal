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
	private String frecuenciacardíaca;
	private String frecuenciarespiratoria;
	private String temperatura;
	private String saturación;
	
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


	public String getFrecuenciacardíaca() {
		return frecuenciacardíaca;
	}


	public void setFrecuenciacardíaca(String frecuenciacardíaca) {
		this.frecuenciacardíaca = frecuenciacardíaca;
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


	public String getSaturación() {
		return saturación;
	}


	public void setSaturación(String saturación) {
		this.saturación = saturación;
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
		return "CitasMedicas [id=" + id + ", precion=" + precion + ", frecuenciacardíaca=" + frecuenciacardíaca
				+ ", frecuenciarespiratoria=" + frecuenciarespiratoria + ", temperatura=" + temperatura
				+ ", saturación=" + saturación + "]";
	}
	
   
}
