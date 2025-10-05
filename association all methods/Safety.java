class Safety{
public float doorQuality;
public  boolean smokedectatorisThere;
public House house;
public Safety(float doorQuality,boolean smokedectatorisThere,House house){
this.doorQuality=doorQuality;
this.smokedectatorisThere=smokedectatorisThere;
this.house=house;
}
public void displaySafetydetails(){
	System.out.println("door quality percentage is="+doorQuality);
	System.out.println("smoke dectator is there near="+smokedectatorisThere);
	System.out.println(house.houseName);
	System.out.println(house.houserentPrice);
}
}