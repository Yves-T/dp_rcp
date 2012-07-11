package be.yt.dp.data.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import be.yt.dp.data.entity.Categorie;
import be.yt.dp.data.entity.Produkt;
import be.yt.dp.data.entity.Stockitem;
import be.yt.dp.data.service.StockItemService;
import be.yt.dp.data.service.StockItemServiceImpl;

public class TableModelProvider implements Subject {
	private StockItemService stockItemService;
	private ArrayList<Observer> observers;
	private static TableModelProvider uniqueInstance;
	private Categorie selectedCategory;

	private TableModelProvider() {
		stockItemService = new StockItemServiceImpl();
	}

	public static TableModelProvider getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new TableModelProvider();
		}
		return uniqueInstance;
	}
	
	public List<Stockitem> getProdukts() {
		List<Stockitem> stockList = null;
		if (selectedCategory != null) {
			stockList = stockItemService
					.findStockItemsPerCategorie(selectedCategory
							.getCategorie_id());
		} else {
			Stockitem stockitem = new Stockitem();
			Produkt produkt = new Produkt("empty");
			stockitem.setProdukt(produkt);
			List<Stockitem>list = new ArrayList<Stockitem>();
			list.add(stockitem);
			return list;
			//stockList = Collections.EMPTY_LIST;
		}
		
		System.out.println("getProdukts called");
		if (stockList != null) {
			for (Stockitem stockitem : stockList) {
				System.out.println("produkt name in stocklist="
						+ stockitem.getProdukt().getNaam());
			}
		}
		
		return stockList;
	}

	// observer pattern
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0)
			observers.remove(i);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}

	public void setSelectedCategory(Categorie selectedCategory) {
		this.selectedCategory = selectedCategory;
	}
}
