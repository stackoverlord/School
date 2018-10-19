package cds.chapters.ch3.Cashier;
public class CashierTest 
{
	public static void main(String[] args)
	{
		Cashier jax = new Cashier();
		jax.math();
		
		System.out.println("Enter the amount due in dollars and cents: " + jax.getDue());
		System.out.println("Enter the amount received: " + jax.getReciv());
		System.out.println("Give the Customer: ");
		System.out.println(jax.getDollars() + " Dollars");
		System.out.println(jax.getQuarters() + " Quarters");
		System.out.println(jax.getDimes() + " Dimes");
		System.out.println(jax.getNickels() + " Nickles");
		System.out.println(jax.getPennys() + " Pennies");
	}
}
