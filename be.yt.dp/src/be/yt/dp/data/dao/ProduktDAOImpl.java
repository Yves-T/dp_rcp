package be.yt.dp.data.dao;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import dp.Produkt;


public class ProduktDAOImpl extends DAO implements ProduktDAO {

        @Override
        public void create(Produkt produkt) {
                Session session = getCurrentSession();
                session.save(Produkt.class.getName(), produkt);
        }

        @Override
        public Produkt read(int id) {
                return (Produkt) getCurrentSession().get(Produkt.class.getName(), id);
        }

        @Override
        public void update(Produkt produkt) {
                Session session = getCurrentSession();
                session.update(Produkt.class.getName(), produkt);
                session.flush();
        }

        @Override
        public void delete(int id) {
                Session session = getCurrentSession();
                Produkt produkt = (Produkt) session.get(Produkt.class.getName(), id);
                if (produkt != null) {
                        session.delete(produkt);
                        session.flush();
                }
        }

        @Override
        @SuppressWarnings("unchecked")
        public List<Produkt> findall() {
                Session session = getCurrentSession();
                Query query = session.createQuery("from Produkt order by naam");
                return query.list();
        }

        @SuppressWarnings("unchecked")
        @Override
        public List<Produkt> findProduktenPerCategorie(int catNr) {
                Session session = getCurrentSession();
                Query query = session
                                .createQuery("from Produkt where categorie.categorie_id = :categorieNr");
                query.setInteger("categorieNr", catNr);
                return query.list();
        }

        @SuppressWarnings("unchecked")
        @Override
        public List<Produkt> findProdukten(int catNr, String naam) {
                Session session = getCurrentSession();
                Query query = session
                                .createQuery("from Produkt where categorie.categorie_id = :categorieNr"
                                                + " and naam like :name");
                query.setInteger("categorieNr", catNr);
                String like = '%' + naam + "%";
                query.setString("name", like);
                return query.list();
        }

} // end class ProduktDAOImpl