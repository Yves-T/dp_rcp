package be.yt.dp.ui.controller;

import java.util.List;

import dp.Categorie;
import dp.DpFactory;
import dp.impl.DpPackageImpl;

import be.yt.dp.data.provider.CategorieModel;
import be.yt.dp.data.service.CategorieService;
import be.yt.dp.data.service.CategorieServiceImpl;

public class TreeViewerPartController {
	private CategorieService categorieService;
	private CategorieModel categorieModel;
	private static TreeViewerPartController uniqueInstance;

	private TreeViewerPartController() {
		categorieService = new CategorieServiceImpl();
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

}