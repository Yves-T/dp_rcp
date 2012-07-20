package be.yt.dp.data.service;

import java.util.List;

import javax.inject.Inject;

import be.yt.dp.data.dao.SchuifDAO;
import be.yt.dp.data.dao.SchuifDAOImpl;
import dp.Schuif;

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
		try {
			schuifDAO.beginTransaction();
			schuifDAO.update(schuif);
			schuifDAO.commit();
		} catch (RuntimeException ex) {
			schuifDAO.rollback();
			throw ex;
		}
	}

	@Override
	public void delete(int id) {
		schuifDAO.delete(id);
	}

	@Override
	public List<Schuif> findall() {
		try {
			schuifDAO.beginTransaction();
			List<Schuif> schuifList = schuifDAO.findall();
			schuifDAO.commit();
			return schuifList;
		} catch (RuntimeException ex) {
			schuifDAO.rollback();
			throw ex;
		}

	}
} // end class SchuifServiceImpl