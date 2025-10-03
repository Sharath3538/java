class CarService{
public String serviceName;
public boolean isReallyGoodWorking;
public ToolBox toolBox;
public CarMat carMat;
public Jack jack;
public CarService(String serviceName,boolean isReallyGoodWorking,ToolBox toolBox,CarMat carMat,Jack jack){
this.serviceName=serviceName;
this.isReallyGoodWorking=isReallyGoodWorking;
this.toolBox=toolBox;
this.carMat=carMat;
this.jack=jack;
}
public void displayCarServceDetails(){
System.out.println("car service center name is="+serviceName);
System.out.println("car service center using things are="+isReallyGoodWorking);
System.out.println("car total no of iteams is="+toolBox.noOfIteams);
System.out.println("car service center  in toolBox inside total list is="+toolBox.isThere);
System.out.println("car service center  is old mat price is="+carMat.matPrice);
System.out.println("car service center  is no of old mats colors are="+carMat.manycolor);
System.out.println("car service center jack is used name is="+jack.jackName);
System.out.println("car service center  in total using pecentage jack is ="+jack.usingPer);
}
}
