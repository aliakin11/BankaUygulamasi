
public class ShortTerm extends Account
{
	public void Benefit()
	{
		getBalance();
		System.out.println("yat�rmak istedi�iniz tutar� giriniz: "+ tutar);
		balance= scan.nextInt();
	    
	if(balance>1000)
	{
		
		yillikkar=(balance/100)*(17/365)*(32);
		gunlukkar=yillikkar/365;
	}
	System.out.println("g�nl�k kar"+ gunlukkar);
	}
}


