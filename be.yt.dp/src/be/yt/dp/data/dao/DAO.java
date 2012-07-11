package be.yt.dp.data.dao;
import org.hibernate.Session;

import be.yt.dp.data.util.HibernateUtil;


public abstract class DAO {
        public Session getCurrentSession() {
                return HibernateUtil.getSessionFactory().getCurrentSession();
        }

        public void beginTransaction() {
                Session session = getCurrentSession();
                session.beginTransaction();
        }

        public void commit() {
                Session session = getCurrentSession();
                session.getTransaction().commit();
        }

        public void rollback() {
                Session session = getCurrentSession();
                session.getTransaction().rollback();
        }
        
        public void disableDirtyChecking() {
                getCurrentSession().setDefaultReadOnly(true);
        }
}