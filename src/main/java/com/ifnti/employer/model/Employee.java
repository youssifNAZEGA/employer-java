package com.ifnti.employer.model;

public class Employee {
	private String prenom;
	private String nom;
	private String email;
	private String departement;
	
	
	public Employee(String prenom, String nom, String email, String departement) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.email = email;
		this.departement = departement;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	
}
