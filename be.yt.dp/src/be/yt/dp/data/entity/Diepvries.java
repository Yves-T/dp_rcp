package be.yt.dp.data.entity;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="DIEPVRIES")
public class Diepvries {
        // Fields

        private Integer diepvriesId;
        private String naam;
        private Set<Schuif> schuiven;

        protected Diepvries() {

        }
        @org.hibernate.annotations.GenericGenerator(name = "test-hilo-strategy",strategy = "hilo")
        @Id
        @GeneratedValue(generator = "test-hilo-strategy")
        @Column(name="diepvriesId")
        public Integer getDiepvriesId() {
                return diepvriesId;
        }

        @SuppressWarnings("unused")
        private void setDiepvriesId(Integer diepvriesId) {
                this.diepvriesId = diepvriesId;
        }
        @Column(name="naam")
        public String getNaam() {
                return naam;
        }

        public void setNaam(String naam) {
                this.naam = naam;
        }
        @OneToMany(mappedBy="diepvries",cascade = CascadeType.ALL)
        public Set<Schuif> getSchuiven() {
                return schuiven;
        }

        public void setSchuiven(Set<Schuif> schuiven) {
                this.schuiven = schuiven;
        }
} // end class Diepvries