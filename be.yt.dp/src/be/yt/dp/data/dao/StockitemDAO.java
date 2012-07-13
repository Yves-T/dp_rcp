package be.yt.dp.data.dao;
import java.util.List;

import dp.StockItem;


public interface StockitemDAO {
        void create(StockItem stockitem);

        StockItem read(int id);

        void update(StockItem stockitem);

        void delete(int id);

        List<StockItem> findall();

        List<StockItem> findStockItemsPerCategorie(int catNr);

        List<StockItem> findStockitems(int catNr, String produktNaam);
        
         List<StockItem> findStockItemsPerCategorie(String naam);

}