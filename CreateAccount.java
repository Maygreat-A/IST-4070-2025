public class CreateAccount {
public static void main(String[] args) 
{
Account emmaAccount = new Account(); // creating an object 
emmaAccount.accountNo = 1423;
emmaAccount.accountName = "Emma";
emmaAccount.balance = 500;

System.out.println("A/c no: " + emmaAccount.accountNo +
" A/c name: " + emmaAccount.accountName + " Balance: "
+ emmaAccount.balance);
}
}