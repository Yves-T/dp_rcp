package be.yt.dp.data.dao;
import java.util.List;

import be.yt.dp.data.entity.Categorie;



public interface CategorieDAO {
        void create(Categorie categorie);

        Categorie read(int id);

        void update(Categorie categorie);

        void delete(int id);

        List<Categorie> findall();

        void beginTransaction();

        void disableDirtyChecking();

        void commit();

        void rollback();

}