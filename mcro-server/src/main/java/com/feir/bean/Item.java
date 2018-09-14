package com.feir.bean;

public class Item {
	private Long id;
	private String title;
	private String pic;
	private String descs;
	private Long price;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public String getDescs() {
		return descs;
	}
	public void setDescs(String descs) {
		this.descs = descs;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public Item(Long id, String title, String pic, String descs, Long price) {
		super();
		this.id = id;
		this.title = title;
		this.pic = pic;
		this.descs = descs;
		this.price = price;
	}
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return "Item [id=" + id + ", title=" + title + ", pic=" + pic
				+ ", desc=" + descs + ", price=" + price + "]";
	}
	
	

}
