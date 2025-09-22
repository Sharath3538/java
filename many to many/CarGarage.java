class CarGarage{
public String garageName;
public int totalOfIteams;
public ToolBox toolBox;
public CarMat carMat;
public Jack jack;
public CarGarage(String garageName,int totalOfIteams,ToolBox toolBox,CarMat carMat,Jack jack){
this.garageName=garageName;
this.totalOfIteams=totalOfIteams;
this.toolBox=toolBox;
this.carMat=carMat;
this.jack=jack;
}
public void displayCarGarageDetails(){
System.out.println("car garage name is="+garageName);
System.out.println("car garage total no of iteams count is="+totalOfIteams);
System.out.println("car total no of iteams is="+toolBox.noOfIteams);
System.out.println("car garage in toolBox inside total list is="+toolBox.isThere);
System.out.println("car garage is old mat price is="+carMat.matPrice);
System.out.println("car garage is no of old mats colors are="+carMat.manycolor);
System.out.println("car garage jack is used name is="+jack.jackName);
System.out.println("car garage in total using pecentage jack is ="+jack.usingPer);
}
}