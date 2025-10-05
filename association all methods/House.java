class House{
public String houseName;
public int houserentPrice;
public House(String houseName,int houserentPrice){
this.houseName=houseName;
this.houserentPrice=houserentPrice;
}
public void displayHousedetails(){
	System.out.println("name of the house is="+houseName);
	System.out.println("house month rent price is="+houserentPrice);
}
}