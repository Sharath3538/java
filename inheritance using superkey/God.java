class God extends Shiva{
public String godName;
public int pujapriceAmount;
public float godPrayer;
public long pujariphNum;
public boolean beliveisThere;
public char centreLetter;
public double pujariFees;
public God(String godName,int pujapriceAmount,float godPrayer,long pujariphNum,boolean beliveisThere,char centreLetter,double pujariFees){
super();
this.godName= godName;
this.pujapriceAmount=pujapriceAmount;
this.godPrayer=godPrayer;
this.pujariphNum= pujariphNum;
this.beliveisThere= beliveisThere;
this.centreLetter=centreLetter;
this.pujariFees=pujariFees;
}
public void displayGodDetails(){
System.out.println("name of the god is="+this.godName);
System.out.println("Shiva Details"+godName);
System.out.println("god puja price amount is ="+this.pujapriceAmount);
System.out.println("Shiva Details"+pujapriceAmount);
System.out.println("god prayer percentage is="+this.godPrayer);
System.out.println("Shiva Details"+godPrayer);
System.out.println("god puja will be pujari phone number is="+this.pujariphNum);
System.out.println("Shiva Details"+pujariphNum);
System.out.println("god prayer beliveing is there ="+this.beliveisThere);
System.out.println("Shiva Details"+beliveisThere);
System.out.println("god centre letter is ="+this.centreLetter);
System.out.println("Shiva Details"+centreLetter);
System.out.println("god puja pujari fees is="+this.pujariFees);
System.out.println("Shiva Details"+pujariFees);
}
}