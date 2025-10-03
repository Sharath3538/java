class CarRunner{
public static void main(String [] args){
ToolBox toolBox=new ToolBox(25,true);
CarMat carMat=new CarMat(15000,true);
Jack jack=new Jack("FloorJack",34.54f);
CarGarage carGarage=new CarGarage("ShivKumar",19,toolBox,carMat,jack);
CarStoreRoom carStoreRoom=new CarStoreRoom("GajendraHonda",5,toolBox,carMat,jack);
CarService carService=new CarService("QuickFix",false,toolBox,carMat,jack);
carGarage.displayCarGarageDetails();
carStoreRoom.displayCarStoreRoomDetails();
carService.displayCarServceDetails();
}
 }