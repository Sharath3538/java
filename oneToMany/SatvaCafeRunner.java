class SatvaCafeRunner{
public static void main(String [] args){
Sugar sugar=new Sugar("BlackSugar",true);
Boost boost=new Boost(8.1f,90,sugar);
Horlicks horlicks=new Horlicks("Protinex",false,sugar); 
Coffee coffee=new Coffee("Americano",200,sugar);
Tea tea=new Tea("Plain",50,sugar);

sugar.displaySugarDetails();
boost.displayBoostDetails();
horlicks.displayHorlicksDetails();
coffee.displayCoffeeDetails();
tea.displayTeaDetails();


}
}
