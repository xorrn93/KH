
public class ListMvs {

	private String name;
	private String genre;
	private double gpa;
	


	public ListMvs() {}
	
	public ListMvs(String name, String genre, double gpa) {
		this.name = name;
		this.genre = genre;
		this.gpa = gpa;
		
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(int gpa) {
		this.gpa = gpa;
	}
	
	
}
