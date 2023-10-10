package comparatorAndComparable;

public class Movie implements Comparable<Movie> {
	private String name;
	private double rating;
	private int year;

	

	public Movie(String name, double rating, int year) {
		super();
		this.name = name;
		this.rating = rating;
		this.year = year;
	}



	//MovieComparableClass -->movies in ascending order of year
	public int compareTo(Movie m) {
	if(this.year>m.year) {
		return 1;
	}
	if(this.year<m.year){
		return -1;
	}
	else 
		return 0;
	}
	

//	//MovieComparableClass -->movies in descending order of year
//	public int compareTo(Movie m) {
//	if(this.year>m.year) {
//		return -1;
//	}
//	if(this.year<m.year){
//		return 1;
//	}
//	else 
//		return 0;
//	}
	
	



	@Override
	public String toString() {
		return "Movie [name=" + name + ", rating=" + rating + ", year=" + year + "]";
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getRating() {
		return rating;
	}



	public void setRating(double rating) {
		this.rating = rating;
	}



	public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
	}

	

}
