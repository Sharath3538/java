class Electronic extends Device{
public String electrnoicName;
public int electrnoicPrice;
public float electrnoicRatings;
public double electrnoicStars;
public long electrnoicphoNum;
public char electrnoicFirstLetter;
public boolean electrnoicRepair;
public Electronic(String electrnoicName,int electrnoicPrice,float electrnoicRatings,double electrnoicStars,long electrnoicphoNum,char electrnoicFirstLetter,boolean electrnoicRepair){
super();
this.electrnoicName=electrnoicName;
this.electrnoicPrice=electrnoicPrice;
this.electrnoicRatings=electrnoicRatings;
this.electrnoicStars=electrnoicStars;
this.electrnoicphoNum=electrnoicphoNum;
this.electrnoicFirstLetter=electrnoicFirstLetter;
this.electrnoicRepair=electrnoicRepair;
}

public void displayElectronicDetails(){
System.out.println("electrnoic name is="+this.electrnoicName);
System.out.println("Device details"+super.electrnoicName);
System.out.println("electrnoic price is="+this.electrnoicPrice);
System.out.println("Device details"+super.electrnoicPrice);
System.out.println("electrnoic ratings is a="+this.electrnoicRatings);
System.out.println("Device details"+super.electrnoicRatings);
System.out.println("electrnoic stars is a="+this.electrnoicStars);
System.out.println("Device details"+super.electrnoicStars);
System.out.println("electrnoic Phone Number is="+this.electrnoicphoNum);
System.out.println("Device details"+super.electrnoicphoNum);
System.out.println("electrnoic first letter is="+this.electrnoicFirstLetter);
System.out.println("Device details"+super.electrnoicFirstLetter);
System.out.println("it is really electrnoic Repairing is correct="+this.electrnoicRepair);
System.out.println("Device details"+super.electrnoicRepair);
}
}