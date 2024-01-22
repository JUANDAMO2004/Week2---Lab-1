package myAssignment1;

public class Football {

//Variables 
private String name;
private String club;
private int age;
private double price;

// Constructor
public Football(String name,String club, int age,double price) {
	this.name = name;
	this.club = club;
	this.age = age;
	this.price = price;
}

// Setter and Getters 

	//Getter for Name
	public String getName() {
		return name;
	}
	//Setter for Name
	public void setName(String name) {
		this.name = name;
	}
	
	//Getter for Club 
	public String getClub() {
		return club;
	}
	//Setter for Club
	public void setClub(String club) {
		this.club = club;
	}
	
	//Getter for Age
	public int getAge() {
		return age;
	}
	//Setter for Club
	public void setAge(int age) {
		this.age = age;
	}

	//Getter for Price
	public double getPrice() {
		return price;
	}
	//Setter for Price
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Name: " + name + "\nClub: " + club + "\nage:" + age + "\nprice: " + price;
			}
}
