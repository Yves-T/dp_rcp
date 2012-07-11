package be.yt.dp.data.service;

import java.util.List;

import javax.inject.Inject;

import be.yt.dp.data.dao.SchuifDAO;
import be.yt.dp.data.dao.SchuifDAOImpl;
import be.yt.dp.data.entity.Schuif;

public class SchuifServiceImpl implements SchuifService {
	private final SchuifDAO schuifDAO;

	public SchuifServiceImpl() {
		schuifDAO = new SchuifDAOImpl();
	}

	@Inject
	public SchuifServiceImpl(SchuifDAOImpl schuifDAO) {
		this.schuifDAO = schuifDAO;
	}

	@Override
	public void create(Schuif schuif) {
		try {
			schuifDAO.beginTransaction();
			schuifDAO.create(schuif);
			schuifDAO.commit();
		} catch (RuntimeException ex) {
			schuifDAO.rollback();
			throw ex;
		}
	}

	@Override
	public Schuif read(int id) {
		return schuifDAO.read(id);
	}

	@Override
	public void update(Schuif schuif) {
		schuifDAO.update(schuif);
	}

	@Override
	public void delete(int id) {
		schuifDAO.delete(id);
	}

	@Override
	public List<Schuif> findall() {
		return schuifDAO.findall();
	}
} // end class SchuifServiceImpl