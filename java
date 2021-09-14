import java.util.Calendar;

public class HealthProfile {
	

	private String name; 

	private String lastname;
	   private int day;
	     private int month;

	private int year;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void HealthRates(String name, String lastname, int day, int month, int year) {
		
		this.name = name;
		this.lastname = lastname;
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public  int age() {
		 int year = Calendar.getInstance().get(Calendar.YEAR);
			
			int age = year-getYear();
		 
		 return age;

		}
	
	public int maxheartrate() {
		 
		 int year = Calendar.getInstance().get(Calendar.YEAR);
			int age = year-getYear();
		  int heartrate = 200-age;
		  return heartrate;
	  }
	 public void TargetRate() {
		 int year = Calendar.getInstance().get(Calendar.YEAR);
			int age = year-getYear();
		  int heartrate = (220-age);
		  int a = heartrate*50/100;
		  int b = heartrate*85/100;
		 System.out.println("target heart rate is between "+a +"and" +b);
		  
	  }
	 public static void main(String[] args) {
		 
		 HealthRates heartRates = new HealthRates();
		 
		 
		 System.out.println("Name "+ heartRates.getName());
		 System.out.println("Lastname  " + heartRates.getLastname());
		System.out.println("AGE ="+heartRates.age());
		 System.out.println("Birth day  "+ heartRates.getDay());
		 System.out.println("Birth moth :"+ heartRates.getMonth());
		 System.out.println("Birth year:"+ heartRates.getYear());
		 System.out.println("Gender  Male");

		 System.out.println("Max heart rate : "+ heartRates.maxheartrate());
			heartRates.TargetRate();
		
		 
		 
	}

}
