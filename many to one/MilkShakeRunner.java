class MilkShakeRunner{
public static void main(String [] args){
IceCubs icecubs =new IceCubs(2,true);	
DryFruits dryfruits =new DryFruits(12,35.2f);	
Sugar sugar =new Sugar("WhiteSugar",25.59f);
MilkShake milkshake=new MilkShake("Strawberry",130,sugar,dryfruits,icecubs);

milkshake.displayMilkShakeDetails();

}
}