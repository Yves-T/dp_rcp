package be.yt.dp.data.dao;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import dp.Categorie;

public class CategorieDAOImpl extends DAO implements CategorieDAO {


	@Override
	public void create(Categorie categorie) {
		Session session = getCurrentSession();
		session.save(Categorie.class.getName(), categorie);
	}

    @Override
    public Categorie read(int id) {
        return (Categorie) getCurrentSession().get(Categorie.class, id);
    }

    @Override
    public void update(Categorie categorie) {
        Session session = getCurrentSession();
        session.update(Categorie.class.getName(), categorie);
    }

    @Override
    public void delete(int id) {
        Session session = getCurrentSession();
        Categorie categorie = read(id);
        if (categorie != null) {
            session.delete(categorie);
            session.flush();
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Categorie> findall() {
        Query query = getCurrentSession().createQuery("from Categorie order by naam");
        return query.list();
    }
} // end class CategorieDAOImpl