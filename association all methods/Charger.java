class Charger{
public String chargerName;
public int chargerPrice;
public Charging branch;
public Charger(String chargerName,int chargerPrice,Charging branch){
this.chargerName=chargerName;
this.chargerPrice=chargerPrice;
this.branch=branch;
}
public void displayChargerReviews(){
System.out.println(chargerName+chargerPrice);
System.out.println(branch.chargingPer);
System.out.println(branch.reallyGood);
}
}