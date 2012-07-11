package be.yt.dp.data.service;

import java.util.List;

import be.yt.dp.data.dao.StockItemDAOImpl;
import be.yt.dp.data.entity.Stockitem;

public class StockItemServiceImpl implements StockItemService {
	private final StockItemDAOImpl stockItemDAO;

	public StockItemServiceImpl() {
		this.stockItemDAO = new StockItemDAOImpl();
	}

	@Override
	public void create(Stockitem stockItem) {
		try {
			stockItemDAO.beginTransaction();
			stockItemDAO.create(stockItem);
			stockItemDAO.commit();
		} catch (RuntimeException ex) {
			stockItemDAO.rollback();
			throw ex;
		}
	}

	@Override
	public Stockitem read(int id) {
		return stockItemDAO.read(id);
	}

	@Override
	public void update(Stockitem stockitem) {
		try {
			stockItemDAO.beginTransaction();
			stockItemDAO.update(stockitem);
			stockItemDAO.commit();
		} catch (RuntimeException ex) {
			stockItemDAO.rollback();
			throw ex;
		}
	}

	@Override
	public void delete(int id) {
		stockItemDAO.delete(id);
	}

	@Override
	public List<Stockitem> findall() {
		return stockItemDAO.findall();
	}

	@Override
	public List<Stockitem> findStockItemsPerCategorie(int catNr) {
		try {
			stockItemDAO.beginTransaction();
			List<Stockitem> stockList = stockItemDAO
					.findStockItemsPerCategorie(catNr);
			for(Stockitem stockitem:stockList) {
				stockitem.getProdukt().getNaam();
			}
			stockItemDAO.commit();
			return stockList;
		} catch (RuntimeException ex) {
			stockItemDAO.rollback();
			throw ex;
		}
	}

	@Override
	public List<Stockitem> findStockitems(int catNr, String produktNaam) {
		return stockItemDAO.findStockitems(catNr, produktNaam);
	}

} // end class StockItemServiceImpl