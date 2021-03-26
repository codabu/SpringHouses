package dmacc.beans;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class House {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String type;
	private int bedrooms;
	private int bathrooms;
	private boolean forSale;
	
	public House () {
		super();
	}
	
	public House(String type) {
		this.type = type;
	}
	
	public House(String type, int bedrooms, int bathrooms, boolean forSale) {
		super();
		this.type = type;
		this.bedrooms = bedrooms;
		this.bathrooms = bathrooms;
		this.forSale = forSale;
	}
	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getBedrooms() {
		return bedrooms;
	}

	public void setBedrooms(int bedrooms) {
		this.bedrooms = bedrooms;
	}

	public int getBathrooms() {
		return bathrooms;
	}

	public void setBathrooms(int bathrooms) {
		this.bathrooms = bathrooms;
	}

	public boolean isForSale() {
		return forSale;
	}

	public void setForSale(boolean forSale) {
		this.forSale = forSale;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString () {
		return "House [ id = " + id + ", type = " + type + ", bedrooms = " + bedrooms  + ", bathrooms = " + bathrooms +  ", for sale = " + forSale + " ]";  
	}
	

}
