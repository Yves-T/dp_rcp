package be.yt.dp.data.util;
import java.util.Properties;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import dp.DpPackage;

public class HibernateUtil {
        private static SessionFactory sessionFactory;
        private static ServiceRegistry serviceRegistry;

        public static void configureSessionFactory() throws HibernateException {
//                Configuration configuration = new Configuration();
//                configuration.configure();
//                serviceRegistry = new ServiceRegistryBuilder().applySettings(
//                                configuration.getProperties()).buildServiceRegistry();
//                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
                
             // teneo test
        		final Properties props = new Properties();
        		props.setProperty(Environment.DRIVER,
        				"org.apache.derby.jdbc.EmbeddedDriver");
        		props.setProperty(Environment.URL, "jdbc:derby:C:\\Users\\ytalboom\\Documents\\test3\\frigo;create=true");
        		props.setProperty(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
        		props.setProperty(Environment.USER, "APP");
        		props.setProperty(Environment.PASS, "APP");
        		props.setProperty(Environment.DIALECT,
        				"org.hibernate.dialect.DerbyDialect");
        		//props.setProperty(Environment.HBM2DDL_AUTO, "true");
        		props.setProperty(Environment.SHOW_SQL, "false");
        		props.setProperty(Environment.FORMAT_SQL, "true");
        		props.setProperty(Environment.USE_SQL_COMMENTS, "true");
        		props.setProperty(PersistenceOptions.CASCADE_POLICY_ON_CONTAINMENT,
        				"REFRESH,PERSIST,MERGE,FETCH_ASSOCIATION_EXTRA_LAZY");

        		String hbName = "StockItem";
        		final HbDataStore hbds = HbHelper.INSTANCE
        				.createRegisterDataStore(hbName);

        		hbds.setDataStoreProperties(props);

        		hbds.setEPackages(new EPackage[] { DpPackage.eINSTANCE });

        		hbds.initialize();
        		sessionFactory = hbds.getSessionFactory();
        }

        public static SessionFactory getSessionFactory() {
                if (sessionFactory == null) {
                        configureSessionFactory();
                }
                return sessionFactory;
        }
}