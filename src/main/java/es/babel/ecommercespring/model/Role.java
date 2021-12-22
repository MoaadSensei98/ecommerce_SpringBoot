package es.babel.ecommercespring.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter

public class Authority {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column
	private String authority;


	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}
}