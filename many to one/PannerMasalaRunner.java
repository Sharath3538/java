class PannerMasalaRunner{
public static void main(String [] args){
Vegetables vegetables=new Vegetables(6,true); 
GarlicPaste garlicPaste=new GarlicPaste("Onion",3.1f);                            
Oil oil=new Oil(2.5f,4);
PannerMasala pannerMasala=new PannerMasala("pannerMakhani",4,oil,garlicPaste,vegetables);
pannerMasala.displayPannerMasalaDetails();
}
}