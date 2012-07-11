package be.yt.dp.data.dao;
import java.util.List;

import be.yt.dp.data.entity.Stockitem;


public interface StockitemDAO {
        void create(Stockitem stockitem);

        Stockitem read(int id);

        void update(Stockitem stockitem);

        void delete(int id);

        List<Stockitem> findall();

        List<Stockitem> findStockItemsPerCategorie(int catNr);

        List<Stockitem> findStockitems(int catNr, String produktNaam);

}