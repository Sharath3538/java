class Room {
public String roomFirstProperty;
public String roomSecondProperty;
public String roomThirdProperty;
public String roomFouthProperty;
public Room(String roomFirstProperty,String roomSecondProperty,String roomThirdProperty,String roomFouthProperty){
	this.roomFirstProperty=roomFirstProperty;
	this.roomSecondProperty=roomSecondProperty;
	this.roomThirdProperty=roomThirdProperty;
	this.roomFouthProperty=roomFouthProperty;
}
public void displayRoom(){
	System.out.println("First property inside room:"+roomFirstProperty);
	System.out.println("second property inside room:"+roomSecondProperty);
	System.out.println("third property inside room:"+roomThirdProperty);
	System.out.println("fourth property inside room:"+roomFouthProperty);
}
}
