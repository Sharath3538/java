class FlipcartRunner{
public static void main(String [] args){
Clothes clothes=new Clothes("Dollar",6500);
Cosmetics cosmetics=new Cosmetics(900,8.1f);
Slipper slipper=new Slipper("puma",3500);
Flipcart flipcart=new Flipcart("ecommercebusiness",9.1f,clothes,cosmetics,slipper);
flipcart.displayFlipcartdetails();
}
}
