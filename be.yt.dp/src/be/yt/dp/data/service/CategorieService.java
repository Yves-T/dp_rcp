package be.yt.dp.data.service;
import java.util.List;

import be.yt.dp.data.entity.Categorie;


public interface CategorieService {
        void create(Categorie categorie);

        Categorie read(int id);

        void update(Categorie categorie);

        void delete(int id);

        List<Categorie> findall();
        
        List<Categorie> findallWithProdukts();
}