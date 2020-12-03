package pl.kognitywistyka.ppa202101.model;

import java.util.List;

public class Car {
	
	protected CarModel model;
	protected List<Owner> owners;
	protected List<Review> reviews;
	
	public CarModel getModel() {
		return model;
	}
	public void setModel(CarModel model) {
		this.model = model;
	}
	public List<Owner> getOwners() {
		return owners;
	}
	public void setOwners(List<Owner> owners) {
		this.owners = owners;
	}
	public List<Review> getReviews() {
		return reviews;
	}
	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

}
