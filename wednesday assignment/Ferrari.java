class Ferrari extends Toyota{
public String anotherName;
public int carPrice;
public float enginefuelUsing;
public double carRatings;
public boolean carisNice;
public char firstLetter;
public long custNumis;

public Ferrari(){
System.out.println("this is non argument constructor");
}
public Ferrari(String anotherName,int carPrice,float enginefuelUsing,double carRatings,boolean carisNice,char firstLetter,long custNumis){
super();
super.anotherName=anotherName;
super.carPrice=carPrice;
super.enginefuelUsing=enginefuelUsing;
super.carRatings=carRatings;
super.carisNice=carisNice;
super.firstLetter=firstLetter;
super.custNumis=custNumis;

}
public void displayFerrariDetails(){
System.out.println("anotherName="+super.anotherName);
System.out.println("carPrice="+super.carPrice);
System.out.println("enginefuelUsing="+super.enginefuelUsing);
System.out.println("carRatings="+super.carRatings);
System.out.println("carisNice="+super.carisNice);
System.out.println("firstLetter="+super.firstLetter);
System.out.println("custNumis="+super.custNumis);
}
}