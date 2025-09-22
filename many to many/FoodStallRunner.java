class FoodStallRunner{
public static void main(String [] args){
Batani batani=new Batani("peer",15.32f);
Tamotoes tamotoes=new Tamotoes(5,false);
Oil oil=new Oil(45.54f,4);
Pallav pallav=new Pallav("PannerBiryani",7,oil,tamotoes,batani);
TamotoBath tamotoBath=new TamotoBath("Chowchow",8,oil,tamotoes,batani);
BataniSambar bataniSambar=new BataniSambar(70,true,oil,tamotoes,batani);
pallav.displayPallavDetails();
tamotoBath.displayTamotoBathDetails();
bataniSambar.displayBataniSamberDetails();
}
}