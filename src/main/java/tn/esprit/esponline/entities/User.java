package tn.esprit.esponline.entities;

import javax.persistence.*;

import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = "user")
@Data
@ToString
public class User {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id")
	private Long id;
	
	@Column(name = "nom", nullable = false)
	private String nom;
	
	@Column(name = "prenom", nullable = false)
	private String prenom;
	
}
