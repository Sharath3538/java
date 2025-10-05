class Flipcart{
public String anotherName;
public float brandingQuality;
public Clothes clothes;
public Cosmetics cosmetics;
public Slipper slipper;
public Flipcart(String anotherName,float brandingQuality,Clothes clothes,Cosmetics cosmetics,Slipper slipper){
this.anotherName=anotherName;
this.brandingQuality=brandingQuality;
this.clothes=clothes;
this.cosmetics=cosmetics;
this.slipper=slipper;
}
public void displayFlipcartdetails(){
System.out.println("people calling another name is="+anotherName);
System.out.println("selling branding quality is="+brandingQuality);
System.out.println(clothes.clothsNames);
System.out.println(clothes.clothsPrices);
System.out.println(cosmetics.cosmeticsPrices);
System.out.println(cosmetics.cosmeticsQuality);
System.out.println(slipper.slipperName);
System.out.println(slipper.slipperPrice);
}
}