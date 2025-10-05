class Gears{
public int noOfGears;
public boolean isActive;
public Car car;
public Gears(int noOfGears,boolean isActive,Car car){
this.noOfGears=noOfGears;
this.isActive=isActive;
this.car=car;
}
public void displayGearsdetails(){
System.out.println("number of gears in car is="+noOfGears);
System.out.println("engine is realy active is there="+isActive);
System.out.println(car.carName);
System.out.println(car.carPrice);

}
}