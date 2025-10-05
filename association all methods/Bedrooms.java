class Bedrooms{
public int noOfWindows;
public boolean naturalLigth;
public House house;
public Bedrooms(int noOfWindows,boolean naturalLigth,House house){
this.noOfWindows=noOfWindows;
this.naturalLigth=naturalLigth;
this.house=house;
}
public void displayBedRoomsdetails(){
	System.out.println("house inside no of windows="+noOfWindows);
	System.out.println("house natural ligth is working is there="+naturalLigth);
	System.out.println(house.houseName);
	System.out.println(house.houserentPrice);
}
}