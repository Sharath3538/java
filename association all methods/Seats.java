class Seats{
public int noOfSeats;
public boolean goodQuality;
public Car car;

public Seats(int noOfSeats,boolean goodQuality,Car car){
this.noOfSeats=noOfSeats;
this.goodQuality=goodQuality;

}
public void displaySeatsdetails(){
	System.out.println("no of seats in car is="+noOfSeats);
	System.out.println("car seats good quality is there="+goodQuality);
	System.out.println(car.carName);
    System.out.println(car.carPrice);
	
}
}