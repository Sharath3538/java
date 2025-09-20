class MilkShake{
public String milkShakeName;
public int milkShakePrice;
public Sugar sugar;
public DryFruits dryfruits;
public IceCubs icecubs;
public MilkShake(String milkShakeName,int milkShakePrice,Sugar sugar,DryFruits dryfruits,IceCubs icecubs){
this.milkShakeName=milkShakeName;
this.milkShakePrice=milkShakePrice;
this.sugar=sugar;
this.dryfruits=dryfruits;
this.icecubs=icecubs;
}
public void displayMilkShakeDetails(){

System.out.println("name of the milkshake is="+milkShakeName);
System.out.println("milkShake Price is="+milkShakePrice);
System.out.println(sugar.sugarName);
System.out.println(sugar.usingPer);
System.out.println(dryfruits.noOfTypeDryFruits);
System.out.println(dryfruits.usingPercentage);
System.out.println(icecubs.noOfCubs);
System.out.println(icecubs.isCool);
}
}