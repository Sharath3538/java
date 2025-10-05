class CarRentRunner{
public static void main(String [] args){
Car car=new Car("MarutiSuzuki",53000);
Seats seats=new Seats(5,true,car);
Engine engine=new Engine(8.1f,false,car);
Gears gears=new Gears(6,true,car);

car.displayCardetails();
seats.displaySeatsdetails();
engine.displayEnginedetails();
gears.displayGearsdetails();

}
}