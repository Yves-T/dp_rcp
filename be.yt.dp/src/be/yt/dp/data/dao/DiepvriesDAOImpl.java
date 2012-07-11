package be.yt.dp.data.dao;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import be.yt.dp.data.entity.Diepvries;


public class DiepvriesDAOImpl extends DAO implements DiepvriesDAO {

    @Override
    public void create(Diepvries diepvries) {
        Session session = getCurrentSession();
        try{
            session.save(Diepvries.class.getName(),diepvries);
        } catch (RuntimeException ex) {
            session.clear();
            throw ex;
        }
    }

    @Override
    public Diepvries read(int id) {
        return (Diepvries)getCurrentSession().get(Diepvries.class.getName(),id);
    }

    @Override
    public void update(Diepvries diepvries) {
        Session session = getCurrentSession();
        session.update(Diepvries.class.getName(),diepvries);
    }

    @Override
    public void delete(int id) {
       Session session = getCurrentSession();
        Diepvries diepvries = (Diepvries) session.get(Diepvries.class.getName(),id);
        if(diepvries != null) {
            session.delete(diepvries);
            session.flush();
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Diepvries> findall() {
        Session session = getCurrentSession();
        Query query = session.createQuery("from Diepvries order by naam");
        return query.list();
    }

} // end class DiepvriesDAOImpl