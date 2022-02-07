package fr.formation.inti.model;

import java.util.Date;

public class Personne {

	private String firstName;
	private String lastName;
	private String title;
	
	private Integer age;
	private Date startDate;
	private String ville;
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	@Override
	public String toString() {
		return "Personne [firstName=" + firstName + ", lastName=" + lastName + ", title=" + title + ", age=" + age
				+ ", startDate=" + startDate + ", ville=" + ville + "]";
	} 
	
	
}
