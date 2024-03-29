package com.app.Entity;
import lombok.Data;
import javax.persistence.*;

@Entity

public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String title;
	private double price;
	
	@ManyToOne
	@JoinColumn(name="author_id")
	private Author author;
	
	@ManyToOne
    @JoinColumn(name = "seller_id")
    private Seller seller;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
