package be.yt.dp.data.dao;
import java.util.List;

import org.eclipse.e4.core.di.annotations.Creatable;
import org.hibernate.Query;
import org.hibernate.Session;

import dp.StockItem;

@Creatable
public class StockItemDAOImpl extends DAO implements StockitemDAO {

	@Override
	public void create(StockItem stockitem) {
		Session session = getCurrentSession();
		session.save(StockItem.class.getName(), stockitem);
	}

        @Override
        public StockItem read(int id) {
                Session session = getCurrentSession();
                return (StockItem) session.get(StockItem.class.getName(), id);
        }

        @Override
        public void update(StockItem stockitem) {
                Session session = getCurrentSession();
                session.update(StockItem.class.getName(),stockitem);
        }

        @Override
        public void delete(int id) {
                Session session = getCurrentSession();
                StockItem stockitem = read(id);
                if (stockitem != null) {
                        session.delete(stockitem);
                        session.flush();
                }
        }

        @SuppressWarnings("unchecked")
        @Override
        public List<StockItem> findall() {
                Session session = getCurrentSession();
                Query query = session.createQuery("from Stockitem");
                return query.list();
        }

        @SuppressWarnings("unchecked")
        @Override
        public List<StockItem> findStockItemsPerCategorie(int catNr) {
                Session session = getCurrentSession();
                Query query = session
                                .createQuery("from Stockitem where categorie.categorie_id = :catNr");
                query.setInteger("catNr", catNr);
                return query.list();
        }

        @SuppressWarnings("unchecked")
        @Override
        public List<StockItem> findStockitems(int catNr, String produktNaam) {
                Session session = getCurrentSession();
                Query query = session
                                .createQuery("from Stockitem where categorie.categorie_id = :catNr"
                                                + " and produkt.naam like :naam");
                query.setInteger("catNr", catNr);
                String like = '%' + produktNaam + '%';
                query.setString("naam", like);
                return query.list();
        }

	@Override
	public List<StockItem> findStockItemsPerCategorie(String naam) {
		Session session = getCurrentSession();
		Query query = session.createQuery("from StockItem where categorie.naam = :name");
		query.setString("name", naam);
		return query.list();
	}

} // end class StockItemDAOImpl