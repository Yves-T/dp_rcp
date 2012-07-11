package be.yt.dp.data.dao;
import java.util.List;

import be.yt.dp.data.entity.Schuif;


public interface SchuifDAO {
        void create(Schuif schuif);

        Schuif read(int id);

        void update(Schuif schuif);

        void delete(int id);

        List<Schuif> findall();
        
        void beginTransaction();

        void disableDirtyChecking();

        void commit();

        void rollback();
}