class BanksRunner{
public static void main(String [] args){
Account account=new Account("Bharath",82971923);
Village village=new Village("Chitradurga",577511);
Loans loans=new Loans(7,50.31f);
Canara canara=new Canara(5,32.31f,account,village,loans);
IcIc icic=new IcIc(57,true,account,village,loans);
BankOfBaroda bankOfBaroda=new BankOfBaroda(9,78.31f,account,village,loans);
canara.displayCanaraDetails();
icic. displayIcIcDetail();
bankOfBaroda.displayBankBordaDetails();
}
}