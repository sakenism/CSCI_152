import CSCI_152.Interfaces.IntQueue;
import CSCI_152.Interfaces.IntStack;

public class Copy
{
	public static ArrayIntStack copy(ArrayIntStack sto) throws Exception
	{
		ArrayIntStack st1 = new ArrayIntStack();

		ArrayIntStack fin = new ArrayIntStack();

		int ans = 0, temp = 0, sz = sto.getSize();
		for(int i = 0; i < sz; i++)
		{
			temp = 0;
			try
			{
				temp = sto.pop();
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
			st1.push(temp);
		}


		sz = st1.getSize();	
		for(int i = 0; i < sz; i++)
		{
			temp = 0;
			try
			{
				temp = st1.pop();
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
			fin.push(temp);
		}


//		System.out.println(fin.toString());
		return fin;
	}
}