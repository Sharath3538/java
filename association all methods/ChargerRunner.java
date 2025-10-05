class ChargerRunner{
public static void main(String [] args){
Charging charging=new Charging(8.1f,true);
Charger charger= new Charger("Redmi",350,charging);
charger.displayChargerReviews();
}
}