package be.yt.dp.data.service;

import java.util.List;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Creatable;

import be.yt.dp.data.dao.ProduktDAO;
import be.yt.dp.data.dao.ProduktDAOImpl;
import be.yt.dp.data.entity.Produkt;

@Creatable
public class ProduktServiceImpl extends AbstractService implements
		ProduktService {
	private final ProduktDAO produktDAO;

	@Inject
	public ProduktServiceImpl() {
		this.produktDAO = new ProduktDAOImpl();
	}

	@Override
	public void create(Produkt produkt) {
		try {
			produktDAO.beginTransaction();
			produktDAO.create(produkt);
			produktDAO.commit();
		} catch (RuntimeException ex) {
			produktDAO.rollback();
			throw ex;
		}
	}

	@Override
	public Produkt read(int id) {
		return produktDAO.read(id);
	}

	@Override
	public void update(Produkt produkt) {
		try {
			produktDAO.beginTransaction();
			produktDAO.update(produkt);
			produktDAO.commit();
		} catch (RuntimeException ex) {
			produktDAO.rollback();
			throw ex;
		}
	}

	@Override
	public void delete(int id) {
		produktDAO.delete(id);
	}

	@Override
	public List<Produkt> findall() {
		try {
			produktDAO.beginTransaction();
			List<Produkt> produkts = produktDAO.findall();
			produktDAO.commit();
			return produkts;

		} catch (RuntimeException ex) {
			produktDAO.rollback();
			throw ex;
		}
	}

	@Override
	public List<Produkt> findProduktenPerCategorie(int catNr) {
		return produktDAO.findProduktenPerCategorie(catNr);
	}

	@Override
	public List<Produkt> findProdukten(int catNr, String naam) {
		return produktDAO.findProdukten(catNr, naam);
	}

} // end class ProduktServiceImpl