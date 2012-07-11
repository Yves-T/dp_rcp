package be.yt.dp.ui.controller;

import java.util.List;

import be.yt.dp.data.entity.Categorie;
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
		Categorie category = new Categorie(categoryName);
		categorieService.create(category);
		categorieModel.dataHasChanged();
	}
	
	public void addNewProdukt() {
		
	}
	
	public List<Categorie> getCategories() {
		return categorieService.findall();
	}

}