class BuildingRunner{
public static void main(String [] args){

Building building=new Building();
Room[] roomFloor1={new Room("Fan","Devoncart","bedlamp","sofa")};
Room[] roomFloor2={new Room("hanger","fridge","washingMachine","Bottel")};
Room[] roomFloor3={new Room("chair","Laptop","mobile","charger")};
Room[] roomFloor4={new Room("Tv","windows","Bed","mirror")};
Room[] roomFloor5={new Room("Bag","BedCover","Photos","bulb")};
Room[] roomFloor6={new Room("Ac","Ironbox","heater","nuts")};
Room[] roomFloor7={new Room("Bats","Ball","Key","keyBoard")};
Room[] roomFloor8={new Room("BedShit","towel","clothes","Shoes")};
Room[] roomFloor9={new Room("Pillo","Boxes","Comb","PencilKit")};
Room[] roomFloor10={new Room("Slippers","Wathes","nileCutter","SwitchBox")};

Floor firstFloor=new Floor("SSG",101,roomFloor1);
Floor secondFloor=new Floor("FNG",102,roomFloor2);
Floor thirdFloor=new Floor("CFG",103,roomFloor3);
Floor fourthFloor=new Floor("NNp",104,roomFloor4);
Floor fifthFloor=new Floor("LLM",105,roomFloor5);
Floor sixthFloor=new Floor("NNP",106,roomFloor6);
Floor seventhFloor=new Floor("BNP",107,roomFloor7);
Floor eighthFloor=new Floor("BBP",108,roomFloor8);
Floor ningthFloor=new Floor("ALP",109,roomFloor9);
Floor tenthFloor=new Floor("BJM",110,roomFloor10);

Floor[] floors={firstFloor,secondFloor,thirdFloor,fourthFloor,fifthFloor,sixthFloor,seventhFloor,eighthFloor,ningthFloor,tenthFloor};
building.displayBuilding(floors);
}
}