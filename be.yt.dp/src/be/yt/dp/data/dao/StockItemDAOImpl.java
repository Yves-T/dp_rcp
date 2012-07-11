package be.yt.dp.data.dao;
import java.util.List;

import org.eclipse.e4.core.di.annotations.Creatable;
import org.hibernate.Query;
import org.hibernate.Session;

import be.yt.dp.data.entity.Stockitem;

@Creatable
public class StockItemDAOImpl extends DAO implements StockitemDAO {

	@Override
	public void create(Stockitem stockitem) {
		Session session = getCurrentSession();
		session.save(Stockitem.class.getName(), stockitem);
	}

        @Override
        public Stockitem read(int id) {
                Session session = getCurrentSession();
                return (Stockitem) session.get(Stockitem.class.getName(), id);
        }

        @Override
        public void update(Stockitem stockitem) {
                Session session = getCurrentSession();
                session.update(Stockitem.class.getName(),stockitem);
        }

        @Override
        public void delete(int id) {
                Session session = getCurrentSession();
                Stockitem stockitem = read(id);
                if (stockitem != null) {
                        session.delete(stockitem);
                        session.flush();
                }
        }

        @SuppressWarnings("unchecked")
        @Override
        public List<Stockitem> findall() {
                Session session = getCurrentSession();
                Query query = session.createQuery("from Stockitem");
                return query.list();
        }

        @SuppressWarnings("unchecked")
        @Override
        public List<Stockitem> findStockItemsPerCategorie(int catNr) {
                Session session = getCurrentSession();
                Query query = session
                                .createQuery("from Stockitem where categorie.categorie_id = :catNr");
                query.setInteger("catNr", catNr);
                return query.list();
        }

        @SuppressWarnings("unchecked")
        @Override
        public List<Stockitem> findStockitems(int catNr, String produktNaam) {
                Session session = getCurrentSession();
                Query query = session
                                .createQuery("from Stockitem where categorie.categorie_id = :catNr"
                                                + " and produkt.naam like :naam");
                query.setInteger("catNr", catNr);
                String like = '%' + produktNaam + '%';
                query.setString("naam", like);
                return query.list();
        }

} // end class StockItemDAOImpl