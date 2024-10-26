import java.util.*;
class Movie
{
	private String title;
	private String director;
	private String duration;
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	public String getTitle()
	{
		return title;
	}
	public void setDirector(String director)
	{
		this.director = director;
	}
	public String getDirector()
	{
		return director;
	}
	public void setDuration(String duration)
	{
		this.duration = duration;
	}
	public String getDuration()
	{
		return duration;
	}
	public String getMovieDetails()
	{
		return "Title: " + title + ", Director " + director + ", Duration: " + duration + " minutes.";
	}
}
public class MovieDetails
{
	public static void main(String args[])
	{
		Movie ob = new Movie();
		ob.setTitle("Kalki");
		ob.setDirector("ABC");
		ob.setDuration("180");
		
		System.out.println(ob.getMovieDetails());
	}
}

