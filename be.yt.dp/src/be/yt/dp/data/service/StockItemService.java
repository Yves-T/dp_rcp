package be.yt.dp.data.service;

import java.util.List;

import dp.StockItem;

public interface StockItemService {
        void create(StockItem stockItem);

        StockItem read(int id);

        void update(StockItem stockitem);

        void delete(int id);

        List<StockItem> findall();

        List<StockItem> findStockItemsPerCategorie(int catNr);

        List<StockItem> findStockitems(int catNr, String produktNaam);

		List<StockItem> findStockItemsPerCategorie(String naam);
}