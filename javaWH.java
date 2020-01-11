/*
 * MyDate Class
 * allows user to get and set the dates and checks for valid dates.
 * 
 * Jan 10, 2020
 * Samuel Han
 */
public class MyDate {
  /* instance variables */
  private int year;
  private int month;
  private int day;
  private static final String[] strMonths = ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec"};
  private static final String[] strDays = {"Mon", "Tues", "Wed", "Thurs", "Fri", "Sat", "Sun"};
  private static final int[] daysInMonths = {31,28,31,30,31,30,31,31,30,31,30,31};

  /* Default constructor */
  public MyDate(){
    this.year = 2000;
    this.month = 10;
    this.day = 1;
  }
                                             
  /* User-provided input constructor */
  public MyDate(int year, int month, int day){
    // if valid date is given -> set and create the object
    if(isValidDate(year, month, day)){
  		this.year = year;
   		this.month = month;
    	this.day = day;
        /* implicitly returns the object just created */
    }else{
      // throw error
    }  
  }                                         

  /* static methods *?
  /* Sees if the year is a leap year */                               
  public static boolean isLeapYear(int year){
    if(year % 4 == 0 && year % 10 != 0)
      return true;
    else
      return false;
  }
                                             
  public static boolean isValidDate(int year, int month, int day){
    if(month > 12||month < 1)
      return false;
    if(year < 1 || year >9999)
      return false;
    if(month == 1|| month == 3 || month == 5 || month == 7 || month == 8 || month == 10|| month == 12){
      if (day < 32)
        return true;
      else
        return false;
    }  
    if(month == 2|| month == 4 || month == 6 || month == 8 || month == 9 || month == 11){
      if (day < 31)
        return true;
      else
        return false;  
    }
    if(isLeapYear()){
      if(month == 2 && day < 30)
        return true;
    }
    if(isLeapYear() == false){
      if(month == 2 && day > 28)
        return false;  
    }
  }
                                             
  // public void getDayOfWeek(){
  //   System.out.print(year+" "+month+" "+day);
  // }
   
  
  /* instance methods */
  // Setters                              
  public void setDate(int year, int month, int day){
    this.day = day;
    this.month = month;
    this.year = year;
  }
                                             
  // Getters                                             
  public int getYear(){
    return this.year;
  }
  public int getMonth(){
    return this.month;
  }
  public int getDay(){
    return this.day;
  }

                                             
  public void toString() {
    System.out.print(strMonths[this.month]+" " + strDays[this.day] + ", "+this.year);
  }
                                             
  public MyDate nextDay(){
    this.day += 1; // update the day field of this object
    return this;   // return the object
  }
                                             
  public MyDate nextMonth(){
    this.month+=1;
    return this;
  }
  public MyDate previousDay(){
    this.day -=1;
    return this;
  }
  
}
                                             
/* Driver class */                                
public class TestDriver {
  public static void main(String[]) {
	MyDate d1 = new MyDate();
    d1.setDate(2020, 1, 11);
    

  }
}