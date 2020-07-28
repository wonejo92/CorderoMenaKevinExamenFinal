package ec.ups.edu.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.entidades.Paciente;
@Stateless
public class PacienteFacade extends AbstractFacade<Paciente>{
	
	@PersistenceContext(unitName = "CorderoMenaKevinExamenFinal")
	private EntityManager em;

	public PacienteFacade() {
		// TODO Auto-generated constructor stub
		super(Paciente.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}

}
