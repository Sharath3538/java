class Water{
public int litOfWater;
public boolean isFilterWater;
public Water(int litOfWater,boolean isFilterWater){
this.litOfWater=litOfWater;
this.isFilterWater=isFilterWater;
}
public void displayWaterDetail(){
System.out.println(" is a one lit of Water="+litOfWater);
System.out.println("it is a filter water="+isFilterWater);
}
}