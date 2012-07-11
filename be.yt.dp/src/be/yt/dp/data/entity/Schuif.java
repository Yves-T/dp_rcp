package be.yt.dp.data.entity;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="SCHUIF")
public class Schuif {
    // Fields

    private Integer schuifId;
    private Diepvries diepvries;
    private Set<Stockitem> stockitems;

    //default hibernate constructor


    public Schuif() {
    }
    @org.hibernate.annotations.GenericGenerator(name = "test-hilo-strategy",strategy = "hilo")
    @Id
    @GeneratedValue(generator = "test-hilo-strategy")
    @Column(name="schuifId")
    public Integer getSchuifId() {
        return schuifId;
    }

    @SuppressWarnings("unused")
        private void setSchuifId(Integer schuifId) {
        this.schuifId = schuifId;
    }
    @ManyToOne
    @JoinColumn(name="fk_diepvries_id")
    public Diepvries getDiepvries() {
        return diepvries;
    }

    public void setDiepvries(Diepvries diepvries) {
        this.diepvries = diepvries;
    }
    @OneToMany(mappedBy="schuif",cascade = CascadeType.ALL)
    public Set<Stockitem> getStockitems() {
        return stockitems;
    }

    public void setStockitems(Set<Stockitem> stockitems) {
        this.stockitems = stockitems;
    }
} // end class Schuif