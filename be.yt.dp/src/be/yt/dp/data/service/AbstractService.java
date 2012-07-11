package be.yt.dp.data.service;
import java.util.Collection;

import org.hibernate.Hibernate;

public class AbstractService {
        protected void initializeCollection(
                        @SuppressWarnings("rawtypes") Collection collection) {
                if (collection != null) {
                        for (Object o : collection) {
                                if (!Hibernate.isInitialized(o)) {
                                        Hibernate.initialize(o);
                                }
                        }
                }
        }
}