package be.yt.dp.ui.controller;

import java.util.List;

import dp.Categorie;
import dp.DpFactory;
import dp.Schuif;
import dp.impl.DpPackageImpl;

import be.yt.dp.data.provider.CategorieModel;
import be.yt.dp.data.service.CategorieService;
import be.yt.dp.data.service.CategorieServiceImpl;
import be.yt.dp.data.service.SchuifService;
import be.yt.dp.data.service.SchuifServiceImpl;

public class TreeViewerPartController {
	private CategorieService categorieService;
	private SchuifService schuifService;
	private CategorieModel categorieModel;
	private static TreeViewerPartController uniqueInstance;

	private TreeViewerPartController() {
		categorieService = new CategorieServiceImpl();
		schuifService = new SchuifServiceImpl();
		categorieModel = CategorieModel.getInstance();
	}

	public static TreeViewerPartController getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new TreeViewerPartController();
		}
		return uniqueInstance;
	}

	public void addNewCategory(String categoryName) {
		DpPackageImpl.init();
		DpFactory factory = DpFactory.eINSTANCE;
		
		Categorie category =factory.createCategorie();
		 category .setNaam(categoryName);
		categorieService.create(category);
		categorieModel.dataHasChanged();
	}
	
	public void addNewProdukt() {
		
	}
	
	public List<Categorie> getCategories() {
		return categorieService.findall();
	}
	
	public List<Schuif> findSchuiven() {
		return schuifService.findall();
	}

}