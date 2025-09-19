class LuminaCafeRunner{
public static void main(String [] args){
Maggi maggi=new Maggi("Seezwan",false);
Roll roll=new Roll("Chicken",60,maggi);
Moms moms=new Moms(50.32f,"Steam",maggi);
Noodles noodles=new Noodles("Singapur",80,maggi);
SandWitch sandwitch=new SandWitch("PotatoCheese",88,maggi);
Pizza pizza=new Pizza("Corn",150,maggi);
maggi.displayMaggiDetails();
roll.displayRollDetails();
moms.displayMomsDetails();
noodles.displayNoodlesDetails();
sandwitch.displaySandWitchDetails();
pizza.displayPizzaDetails();

}
}