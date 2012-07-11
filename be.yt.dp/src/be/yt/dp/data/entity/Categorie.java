package be.yt.dp.data.entity;
import java.util.Set;
import java.util.TreeSet;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="CATEGORIE")
public class Categorie {

        private int categorie_id;
        private String naam;
        private Set<Produkt> produkts = new TreeSet<Produkt>();
        private Set<Stockitem> stockitems;

        // hibernate constructor
        protected Categorie() {

        }

        public Categorie(String naam) {
                this.setNaam(naam);
        }

        // getters and setters
        @GenericGenerator(name = "test-hilo-strategy",strategy = "hilo")
        @Id
        @GeneratedValue(generator = "test-hilo-strategy")
        @Column(name="categorie_id")
        public int getCategorie_id() {
                return categorie_id;
        }

        @SuppressWarnings("unused")
        private void setCategorie_id(int categorie_id) {
                this.categorie_id = categorie_id;
        }
        @Column(name="NAAM")
        public String getNaam() {
                return naam;
        }

        public void setNaam(String naam) {
                this.naam = naam;
        }
        @OneToMany(mappedBy="categorie")
        public Set<Produkt> getProdukts() {
                return produkts;
        }

        public void setProdukts(Set<Produkt> produkts) {
                this.produkts = produkts;
        }
        @OneToMany(mappedBy="categorie")
        public Set<Stockitem> getStockitems() {
                return stockitems;
        }
        
        public void setStockitems(Set<Stockitem> stockitems) {
                this.stockitems = stockitems;
        }
} // end class Categorie