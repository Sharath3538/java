class GeneralCondition{
public int noOfWalls;
public float paintPer;
public House house;
public GeneralCondition(int noOfWalls,float paintPer,House house){
this.noOfWalls=noOfWalls;
this.paintPer=paintPer;
this.house=house;
}
public void GeneralConditiondetails(){
	System.out.println("total number of walls="+noOfWalls);
	System.out.println("walls painting percentage is="+paintPer);
	System.out.println(house.houseName);
	System.out.println(house.houserentPrice);
}
}