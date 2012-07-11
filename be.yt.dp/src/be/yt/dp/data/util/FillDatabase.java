package be.yt.dp.data.util;

import be.yt.dp.data.entity.Categorie;
import be.yt.dp.data.entity.Produkt;
import be.yt.dp.data.entity.Schuif;
import be.yt.dp.data.entity.Stockitem;
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

		Stockitem stockItemWitloof = new Stockitem();
		Stockitem stockHamburger = new Stockitem();
		stockService.create(stockItemWitloof);
		stockService.create(stockHamburger);

		Schuif schuif1 = new Schuif();
		Schuif schuif2 = new Schuif();
		schuifService.create(schuif1);
		schuifService.create(schuif2);

		Categorie groenten = new Categorie("Groenten");
		Categorie vlees = new Categorie("Vlees");
		categorieService.create(groenten);
		categorieService.create(vlees);

		Produkt hamburger = new Produkt("hamburger");
		Produkt witloof = new Produkt("witloof");
		produktService.create(hamburger);
		produktService.create(witloof);

		hamburger.setCategorie(vlees);
		witloof.setCategorie(groenten);
		produktService.update(hamburger);
		produktService.update(witloof);

		categorieService.update(vlees);
		categorieService.update(groenten);

		stockItemWitloof.setProdukt(witloof);
		stockItemWitloof.setCategorie(groenten);
		stockItemWitloof.setAantal(5);
		stockItemWitloof.setSchuif(schuif1);

		stockHamburger.setProdukt(hamburger);
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
	}
}