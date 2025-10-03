class TableRunner{
public static void main(String [] args){
Tableing tableing=new Tableing(6.7f,true);
Table table=new Table("DinningTable",43000,tableing);
tableing.displayTableingDetails();
table.displayTableDetails();

}
}