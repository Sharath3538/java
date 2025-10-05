class Engine{
public float engineQuality;
public boolean itisGood;
public Car car;
public Engine(float engineQuality,boolean itisGood,Car car){
	this.engineQuality=engineQuality;
	this.itisGood=itisGood;
	
}
public void displayEnginedetails(){
System.out.println("car engine quality check is="+engineQuality);
System.out.println("engine it is good is there="+itisGood);
System.out.println(car.carName);
System.out.println(car.carPrice);

}
}