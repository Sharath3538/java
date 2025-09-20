class HumanRunner{
public static void main(String [] args){
Liver liver=new Liver(2,1.3f);
Eyes eyes=new Eyes("blue",true);
Kidneys kidneys=new Kidneys(3.1f,2);
Human human=new Human("Prakesh",2,kidneys,eyes,liver);
human.displayHumanDetails();
}
}