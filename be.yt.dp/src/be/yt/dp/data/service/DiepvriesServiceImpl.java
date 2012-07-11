package be.yt.dp.data.service;

import java.util.List;

import javax.inject.Inject;

import be.yt.dp.data.dao.DiepvriesDAO;
import be.yt.dp.data.dao.DiepvriesDAOImpl;
import be.yt.dp.data.entity.Diepvries;

public class DiepvriesServiceImpl implements DiepvriesService {
        private final DiepvriesDAO diepvriesDAO;

        // constructor injection
        @Inject
        public DiepvriesServiceImpl(DiepvriesDAOImpl diepvriesDAO) {
                this.diepvriesDAO = diepvriesDAO;
        }

        @Override
        public void create(Diepvries diepvries) {
                diepvriesDAO.create(diepvries);
        }

        @Override
        public Diepvries read(int id) {
                return diepvriesDAO.read(id);
        }

        @Override
        public void update(Diepvries diepvries) {
                diepvriesDAO.update(diepvries);
        }

        @Override
        public void delete(int id) {
                diepvriesDAO.delete(id);
        }

        @Override
        public List<Diepvries> findall() {
                return diepvriesDAO.findall();
        }
} // end class DiepvriesServiceImpl