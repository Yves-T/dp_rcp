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
@Table(name="PRODUKT")
public class Produkt  {
    // Fields

    private Integer produktId;
    private Categorie categorie;
    private String naam;
    private Set<Stockitem> stockitems;

    //default hibernate constructor
    protected Produkt() {
    }

    public Produkt (String naam) {
        this.setNaam(naam);
    }
    @org.hibernate.annotations.GenericGenerator(name = "test-hilo-strategy",strategy = "hilo")
    @Id
    @GeneratedValue(generator = "test-hilo-strategy")
    @Column(name="produktId")
    public Integer getProduktId() {
        return produktId;
    }

    //getters and setters

    
	@SuppressWarnings("unused")
	private void setProduktId(Integer produktId) {
		this.produktId = produktId;
	}

	@ManyToOne
	@JoinColumn(name = "fk_categorie_id")
    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
    @Column(name="naam")
    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
    @OneToMany(mappedBy="categorie",cascade = CascadeType.ALL)
    public Set<Stockitem> getStockitems() {
        return stockitems;
    }

    public void setStockitems(Set<Stockitem> stockitems) {
        this.stockitems = stockitems;
    }
} // end class Produkt