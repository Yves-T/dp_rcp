package be.yt.dp.data.service;

import java.util.List;

import be.yt.dp.data.dao.StockItemDAOImpl;
import dp.StockItem;

public class StockItemServiceImpl implements StockItemService {
	private final StockItemDAOImpl stockItemDAO;

	public StockItemServiceImpl() {
		this.stockItemDAO = new StockItemDAOImpl();
	}

	@Override
	public void create(StockItem stockItem) {
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
	public StockItem read(int id) {
		return stockItemDAO.read(id);
	}

	@Override
	public void update(StockItem stockitem) {
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
	public List<StockItem> findall() {
		return stockItemDAO.findall();
	}

	@Override
	public List<StockItem> findStockItemsPerCategorie(int catNr) {
		try {
			stockItemDAO.beginTransaction();
			List<StockItem> stockList = stockItemDAO
					.findStockItemsPerCategorie(catNr);
			for (StockItem stockitem : stockList) {
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
	public List<StockItem> findStockitems(int catNr, String produktNaam) {
		return stockItemDAO.findStockitems(catNr, produktNaam);
	}

	@Override
	public List<StockItem> findStockItemsPerCategorie(String naam) {
		List<StockItem> items = null;
		try {
			stockItemDAO.beginTransaction();
			items = stockItemDAO.findStockItemsPerCategorie(naam);
			for (StockItem stockitem : items) {
				stockitem.getProdukt().getNaam();
			}
			stockItemDAO.commit();
			return items;
		} catch (RuntimeException ex) {
			stockItemDAO.rollback();
			throw ex;
		}

	}

} // end class StockItemServiceImpl