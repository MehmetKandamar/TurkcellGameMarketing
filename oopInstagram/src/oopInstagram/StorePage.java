package oopInstagram;

public class StorePage extends BasePage{
	private String store;
	private String detail;
	private double unitPrice;
	private double discount;
	private double discountedPrice;
	
	

	public String getStore() {
		return store;
	}

	public void setStore(String store) {
		this.store = store;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getDiscountedPrice() {
		discountedPrice = unitPrice - discount;
		return discountedPrice;
	}

	public StorePage() {
		super();
	}

	public StorePage(int id, String[] images, String store, String detail, double unitPrice, double discount, double discountedPrice) {
		super(id, images);
		this.store = store;
		this.detail = detail;
		this.unitPrice = unitPrice;
		this.discount = discount;
		this.discountedPrice = discountedPrice;
	}

}
