package ec.ups.edu.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.entidades.CitasMedicas;
@Stateless
public class CitasMedicasFacade  extends AbstractFacade<CitasMedicas>{
	
	@PersistenceContext(unitName = "CorderoMenaKevinExamenFinal")
	private EntityManager em;


	public CitasMedicasFacade() {
		// TODO Auto-generated constructor stub
		super(CitasMedicas.class);
	}
	

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}

}
