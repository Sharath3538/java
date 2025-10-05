class RoadSidefoodRunner{
public static void main(String [] args){
Oil oil=new Oil("goldWinner",4.1f);
Ingridents ingridents=new Ingridents(3.1f,6);
Egg egg=new Egg(6,true);
Kabab kabab=new Kabab("chicken",5.1f,oil,ingridents,egg);
Fryies fryies=new Fryies("Fish",true,oil,ingridents,egg);
Briyani briyani=new Briyani("Mutton",150,oil,ingridents,egg);
kabab.displayKababDetails();
fryies.displayFryiesDetails();
briyani.displayBriyaniDetails();
 }
 }