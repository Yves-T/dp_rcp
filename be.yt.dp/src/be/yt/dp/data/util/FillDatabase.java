package be.yt.dp.data.util;

import dp.Categorie;
import dp.DpFactory;
import dp.Produkt;
import dp.Schuif;
import dp.StockItem;
import dp.impl.DpPackageImpl;
import be.yt.dp.data.service.CategorieService;
import be.yt.dp.data.service.CategorieServiceImpl;
import be.yt.dp.data.service.ProduktService;
import be.yt.dp.data.service.ProduktServiceImpl;
import be.yt.dp.data.service.SchuifService;
import be.yt.dp.data.service.SchuifServiceImpl;
import be.yt.dp.data.service.StockItemService;
import be.yt.dp.data.service.StockItemServiceImpl;

public class FillDatabase {
	private static CategorieService categorieService;
	private static ProduktService produktService;
	private static StockItemService stockService;
	private static SchuifService schuifService;

	public FillDatabase() {
		categorieService = new CategorieServiceImpl();
		produktService = new ProduktServiceImpl();
		stockService = new StockItemServiceImpl();
		schuifService = new SchuifServiceImpl();
	}

	public static void initDb() {
		
		DpPackageImpl.init();
		DpFactory factory = DpFactory.eINSTANCE;
		
		// Categorie categorie =factory.createCategorie();
		// categorie.setNaam("groenten");

		//aanmaken van stockitems
		StockItem stockItemWitloof = factory.createStockItem();
		StockItem stockHamburger = factory.createStockItem();
		stockService.create(stockItemWitloof);
		stockService.create(stockHamburger);

		//aanmaken van schuiven
		Schuif schuif1 = factory.createSchuif();
		Schuif schuif2 = factory.createSchuif();
		schuifService.create(schuif1);
		schuifService.create(schuif2);

		//aanmaken van categorie
		Categorie groenten = factory.createCategorie();
		groenten.setNaam("Groenten");
		Categorie vlees = factory.createCategorie();
		vlees.setNaam("Vlees");
		categorieService.create(groenten);
		categorieService.create(vlees);

		Produkt hamburger = factory.createProdukt();
		hamburger.setNaam("hamburger");
		Produkt witloof = factory.createProdukt();
		witloof.setNaam("witloof");
		hamburger.setCategories(vlees);
		witloof.setCategories(groenten);
		produktService.create(hamburger);
		produktService.create(witloof);

		
		produktService.update(hamburger);
		produktService.update(witloof);

		categorieService.update(vlees);
		categorieService.update(groenten);

		stockItemWitloof.setProdukten(witloof);
		stockItemWitloof.setCategorie(groenten);
		stockItemWitloof.setAantal(5);
		stockItemWitloof.setSchuif(schuif1);

		stockHamburger.setProdukten(hamburger);
		stockHamburger.setCategorie(vlees);
		stockHamburger.setAantal(3);
		stockHamburger.setSchuif(schuif2);

		produktService.update(witloof);
		produktService.update(hamburger);
		categorieService.update(groenten);
		categorieService.update(vlees);
		schuifService.update(schuif2);
		schuifService.update(schuif1);

		stockService.update(stockItemWitloof);
		stockService.update(stockHamburger);

		// controle model
		System.out.println("-- CONTROLE OBJECTEN --");
		System.out.println("Categorie groenten heeft volgende produkten");
		for (Produkt p : groenten.getProdukten()) {
			System.out.println(p.getNaam());
		}

		System.out.println("Een hamburger heeft als categorie :"
				+ hamburger.getCategories().getNaam());

	}
}