class CarStoreRoom{
public String storeRoomName;
public int usingThing;
public ToolBox toolBox;
public CarMat carMat;
public Jack jack;
public CarStoreRoom(String storeRoomName,int usingThing,ToolBox toolBox,CarMat carMat,Jack jack){
this.storeRoomName=storeRoomName;
this.usingThing=usingThing;
this.toolBox=toolBox;
this.carMat=carMat;
this.jack=jack;
}
public void displayCarStoreRoomDetails(){
System.out.println("car store room is="+storeRoomName);
System.out.println("car store room using things are="+usingThing);
System.out.println("car total no of iteams is="+toolBox.noOfIteams);
System.out.println("car store room  in toolBox inside total list is="+toolBox.isThere);
System.out.println("car store room  is old mat price is="+carMat.matPrice);
System.out.println("car store room  is no of old mats colors are="+carMat.manycolor);
System.out.println("car store room  jack is used name is="+jack.jackName);
System.out.println("car store room  in total using pecentage jack is ="+jack.usingPer);
}
}