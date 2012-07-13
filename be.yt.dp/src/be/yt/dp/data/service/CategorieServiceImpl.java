package be.yt.dp.data.service;

import java.util.List;

import javax.inject.Inject;

import be.yt.dp.data.dao.CategorieDAO;
import be.yt.dp.data.dao.CategorieDAOImpl;
import dp.Categorie;

public class CategorieServiceImpl extends AbstractService implements
                CategorieService {
        private final CategorieDAO categorieDAO;
        //private final CategorieModel categorieModel;

        // injecteer class die CategorieDAO implementeert
        @Inject
        public CategorieServiceImpl() {
                this.categorieDAO = new CategorieDAOImpl();
                //this.categorieModel = new CategorieModel();
        }

        @Override
        public void create(Categorie categorie) {
                try {
                        categorieDAO.beginTransaction();
                        categorieDAO.create(categorie);
                        categorieDAO.commit();
                } catch (RuntimeException ex) {
                        categorieDAO.rollback();
                        throw ex; // throw exception to presentation layer
                }
        }

        @Override
        public Categorie read(int id) {
                return categorieDAO.read(id);
        }

        @Override
        public void update(Categorie categorie) {
                try {
                        categorieDAO.beginTransaction();
                        categorieDAO.update(categorie);
                        categorieDAO.commit();
                } catch (RuntimeException ex) {
                        categorieDAO.rollback();
                        throw ex; // throw exception to presentation layer
                }
        }

        @Override
        public void delete(int id) {
                categorieDAO.delete(id);
        }

        @Override
        public List<Categorie> findall() {
                try {
                        categorieDAO.beginTransaction();
                        List<Categorie> categorieList = categorieDAO.findall();
                        categorieDAO.commit();
                        return categorieList;
                } catch (RuntimeException ex) {
                        categorieDAO.rollback();
                        throw ex; // throw exception to presentation layer;
                }
        }

        @Override
        public List<Categorie> findallWithProdukts() {
                try {
                        categorieDAO.beginTransaction();
                        List<Categorie> categorieList = categorieDAO.findall();
                        //initializeCollection(categorieList);
                        for(Categorie categorie:categorieList) {
                                if(categorie.getProdukten() != null)
                                categorie.getProdukten().size();
                                System.out.println("size:"+categorie.getProdukten().size());
                        }
                        categorieDAO.commit();
                        return categorieList;
                } catch (RuntimeException ex) {
                        categorieDAO.rollback();
                        throw ex; // throw exception to presentation layer
                }
        }

}