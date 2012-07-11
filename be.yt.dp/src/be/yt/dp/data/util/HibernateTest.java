package be.yt.dp.data.util;

import java.util.ArrayList;
import java.util.List;

import be.yt.dp.data.entity.Categorie;
import be.yt.dp.data.service.CategorieService;
import be.yt.dp.data.service.CategorieServiceImpl;

public class HibernateTest {

	public static void main(String[] args) {
		CategorieService categorieService = new CategorieServiceImpl();

		List<Categorie> categories = new ArrayList<Categorie>();

		Categorie categorie2 = new Categorie("groenten");
		categorieService.create(categorie2);
		categories = categorieService.findall();

		for (Categorie categorie : categories) {
			System.out.println("Categorie name : " + categorie.getNaam());
		}
	}
}