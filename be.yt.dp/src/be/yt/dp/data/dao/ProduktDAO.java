package be.yt.dp.data.dao;
import java.util.List;

import dp.Produkt;


public interface ProduktDAO {
        void create(Produkt produkt);

        Produkt read(int id);

        void update(Produkt produkt);

        void delete(int id);

        List<Produkt> findall();

        List<Produkt> findProduktenPerCategorie(int catNr);

        List<Produkt> findProdukten(int catNr, String naam);

        // basic dao operations

        void beginTransaction();

        void disableDirtyChecking();

        void commit();

        void rollback();
}