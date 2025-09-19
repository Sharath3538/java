class JuiceStallRunner{
public static void main(String [] args){
	
Fructose fructose=new Fructose("sugar",true);
Mango mango=new Mango("Malgoba",150,fructose);
Dragon dragon=new Dragon(true,25.30f,fructose);
Cherry cherry=new Cherry("RedCheery",200,fructose);
MuskMellon muskmellon=new MuskMellon(325,69.01f,fructose);
Orange orange=new Orange(55.60f,15,fructose);
Apple apple=new Apple("pineapple",55,fructose);

fructose.displaySugarDetails();
mango.MangoDetails();
dragon.displayDragonDetails();
cherry.CherryDetails();
muskmellon.MuskMellonDetails();
orange.displayOrangeDetails();
apple.displayAppleDetails();
}
}