package be.yt.dp.data.provider;

import java.util.ArrayList;
import java.util.List;

import dp.Categorie;

import be.yt.dp.data.service.CategorieService;
import be.yt.dp.data.service.CategorieServiceImpl;

public class CategorieModel implements Subject {

        private CategorieService categorieService;
        private ArrayList<Observer> observers;
        private static CategorieModel categorieModel;

        private CategorieModel() {
                categorieService = new CategorieServiceImpl();
                this.observers = new ArrayList<Observer>();
        }
        
        public static CategorieModel getInstance() {
        	if(categorieModel == null) {
        		categorieModel = new CategorieModel();
        	}
        	return categorieModel;
        }

	public List<Categorie> getCategories() {
		List<Categorie> catList = categorieService.findallWithProdukts();
		for (Categorie categorie : catList) {
			System.out.println("size of produkts collection in categorie : "
					+ categorie.getProdukten().size());
		}
		return categorieService.findallWithProdukts();
	}
        
        public void dataHasChanged() {
                notifyObservers();
        }

        //observer pattern
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
}