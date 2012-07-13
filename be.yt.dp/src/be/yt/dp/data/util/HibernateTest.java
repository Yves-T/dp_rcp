package be.yt.dp.data.util;

import java.util.ArrayList;
import java.util.List;

import be.yt.dp.data.service.CategorieService;
import be.yt.dp.data.service.CategorieServiceImpl;
import dp.Categorie;
import dp.DpFactory;
import dp.impl.DpPackageImpl;

public class HibernateTest {

	public static void main(String[] args) {
		CategorieService categorieService = new CategorieServiceImpl();

		List<Categorie> categories = new ArrayList<Categorie>();

//		Categorie categorie2 = new Categorie("groenten");
//		categorieService.create(categorie2);
		categories = categorieService.findall();

		for (Categorie categorie : categories) {
			System.out.println("Categorie name : " + categorie.getNaam());
		}
		
//		DpPackageImpl.init();
//		DpFactory factory = DpFactory.eINSTANCE;
//		
//		Categorie categorie =factory.createCategorie();
//		categorie.setNaam("groenten");
	}
}