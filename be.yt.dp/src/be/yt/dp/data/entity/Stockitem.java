package be.yt.dp.data.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "STOCKITEM")
public class Stockitem implements Comparable<Stockitem> {
	// Fields

	private Integer stockId;
	private Schuif schuif;
	private Produkt produkt;
	private Categorie categorie;
	private Integer aantal;
	private Date datum;
	private String info;

	// default hibernate constructor

	public Stockitem() {
	}

	// constructor

	public Stockitem(Schuif schuif, Produkt produkt, Categorie categorie,
			Integer aantal, Date datum, String info) {
		this.schuif = schuif;
		this.produkt = produkt;
		this.categorie = categorie;
		this.aantal = aantal;
		this.info = info;
		this.datum = datum;
	}

	// getters and setters
	@org.hibernate.annotations.GenericGenerator(name = "test-hilo-strategy", strategy = "hilo")
	@Id
	@GeneratedValue(generator = "test-hilo-strategy")
	@Column(name = "stockId")
	public Integer getStockId() {
		return stockId;
	}

	@SuppressWarnings("unused")
	private void setStockId(Integer stockId) {
		this.stockId = stockId;
	}

	@ManyToOne
	@JoinColumn(name = "fk_schuif_id")
	public Schuif getSchuif() {
		return schuif;
	}

	public void setSchuif(Schuif schuif) {
		this.schuif = schuif;
	}

	@ManyToOne
	@JoinColumn(name = "fk_produkt_id")
	public Produkt getProdukt() {
		return produkt;
	}

	public void setProdukt(Produkt produkt) {
		this.produkt = produkt;
	}

	@ManyToOne
	@JoinColumn(name = "fk_categorie_id")
	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	@Column(name = "aantal")
	public Integer getAantal() {
		return aantal;
	}

	public void setAantal(Integer aantal) {
		this.aantal = aantal;
	}

	@Column(name = "datum")
	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	@Column(name = "info")
	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public int compareTo(Stockitem stockitem) {
		return this.getProdukt().getNaam()
				.compareTo(stockitem.getProdukt().getNaam());
	}
} // end class Stockitem