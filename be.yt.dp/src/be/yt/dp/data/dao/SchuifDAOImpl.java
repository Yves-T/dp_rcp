package be.yt.dp.data.dao;
import java.util.List;

import org.eclipse.e4.core.di.annotations.Creatable;
import org.hibernate.Query;
import org.hibernate.Session;

import dp.Schuif;


@Creatable
public class SchuifDAOImpl extends DAO implements SchuifDAO {

        @Override
        public void create(Schuif schuif) {
        	 Session session = getCurrentSession();
             session.save(Schuif.class.getName(), schuif);
        }

        @Override
        public Schuif read(int id) {
                Session session = getCurrentSession();
                return (Schuif) session.get(Schuif.class.getName(), id);
        }

        @Override
        public void update(Schuif schuif) {
                Session session = getCurrentSession();
                session.update(Schuif.class.getName(), schuif);
        }

        @Override
        public void delete(int id) {

                Session session = getCurrentSession();
                Schuif schuif = read(id);
                if (schuif != null) {
                        session.delete(schuif);
                        session.flush();
                }
        }

        @Override
        @SuppressWarnings("unchecked")
        public List<Schuif> findall() {
                Session session = getCurrentSession();
                Query query = session.createQuery("from Schuif order by nummer");
                return query.list();
        }
} // end class SchuifDAOImpl