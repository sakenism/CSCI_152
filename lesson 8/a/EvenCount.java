import Interfaces.IntQueue;
import Interfaces.IntStack;

public class EvenCount
{
	public static int evenCount(ArrayIntStack sto) throws Exception
	{
		ArrayIntStack stn = new ArrayIntStack();
		//System.out.println(sto.toString());

		int ans = 0, temp = 0, sz = sto.getSize();
		for(int i = 0; i < sz; i++)
		{
			int col = 0;
			try
			{
				temp = sto.pop();
		   }
		   catch(Exception ex)
		   {
		   	System.out.println(ex.getMessage());
		   }
			stn.push(temp);
			while(temp > 0)
			{
				col++;
				temp = temp / 10;
			}
			if(col % 2 == 0)
			{
				ans++;		
			}
		}
//		System.out.println(sto.toString());

 //		sto.clear();
 	//	System.out.println(sto.toString());
 		sz = stn.getSize();
		for(int i = 0; i < sz; i++)
		{
			temp = 0;
			try
			{
				temp = stn.pop();
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
			sto.push(temp);
		}
	//	System.out.println(sto.toString());
		return ans;
	}
}