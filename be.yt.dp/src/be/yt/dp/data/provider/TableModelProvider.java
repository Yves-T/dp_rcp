package be.yt.dp.data.provider;

import java.util.ArrayList;
import java.util.List;

import be.yt.dp.data.service.StockItemService;
import be.yt.dp.data.service.StockItemServiceImpl;
import dp.Categorie;
import dp.DpFactory;
import dp.Produkt;
import dp.StockItem;
import dp.impl.DpPackageImpl;

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
	
	public List<StockItem> getProdukts() {
		List<StockItem> stockList = null;
		
		if (selectedCategory != null) {
			System.out.println("inside tablemodelprovider: selected category name"+selectedCategory.getNaam());
			stockList = stockItemService
					.findStockItemsPerCategorie(selectedCategory
							.getNaam());
		} else {
			DpPackageImpl.init();
			DpFactory factory = DpFactory.eINSTANCE;
			
			//Categorie categorie =factory.createCategorie();
			
			StockItem stockitem =factory.createStockItem();
			Produkt produkt = factory.createProdukt();
			produkt.setNaam("empty");
			stockitem.setProdukten(produkt);
			List<StockItem>list = new ArrayList<StockItem>();
			list.add(stockitem);
			return list;
			//stockList = Collections.EMPTY_LIST;
		}
		
		System.out.println("getProdukts called");
		if (stockList != null) {
			for (StockItem stockitem : stockList) {
				System.out.println("produkt name in stocklist="
						+ stockitem.getProdukten().getNaam());
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
