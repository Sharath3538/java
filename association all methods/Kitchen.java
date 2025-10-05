class Kitchen{
public float refrigeratorSpace;
public boolean cleanLiness;
public House house;
public Kitchen(float refrigeratorSpace,boolean cleanLiness,House house){
this.refrigeratorSpace=refrigeratorSpace;
this.cleanLiness=cleanLiness;
this.house=house;
}
public void displayKitchendetails(){
	System.out.println("kitchen total refrigerator space is="+refrigeratorSpace);
	System.out.println("kitchen realy clean liness is there="+cleanLiness);
	System.out.println(house.houseName);
	System.out.println(house.houserentPrice);
}
}