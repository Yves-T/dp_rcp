package be.yt.dp.data.service;

import java.util.List;

import dp.Produkt;

public interface ProduktService {
	void create(Produkt produkt);

	Produkt read(int id);

	void update(Produkt produkt);

	void delete(int id);

	List<Produkt> findall();

	List<Produkt> findProduktenPerCategorie(int catNr);

	public List<Produkt> findProdukten(int catNr, String naam);
}