public class TowerOfHanoi {

	private Stack<Integer>[] post = new ArrayStack[3];
	private Stack<Integer>[] qw = new ArrayStack[3];
	private int numMoves = 0;
	private int n = 0;
	public TowerOfHanoi(int numDiscs) {
		/*
		 TODO: Initialize all three posts to new stack objects,
		 and push onto post[0] the integers:
		    numDiscs, numDiscs-1, numDiscs-2, ..., 1 
		 */
		n = numDiscs;
		post[0] = new ArrayStack();
		post[1] = new ArrayStack();
		post[2] = new ArrayStack();
		for(int i = numDiscs; i > 0; i--)
		{
			post[0].push(i);
		}
	}
	
	public void moveDisc(int from, int to) throws Exception {
		/* 
		 TODO:  Moves the integer from the top of post[from] to 
		 post[to].  Throws an exception if either index is not
		 0, 1, or 2; or if post[from] is empty; or if the value
		 on top of post[from] is bigger than the topmost item of
		 post[to].
		 */
		numMoves++;
		int tmp = 0;
		try
		{
			tmp = post[from].pop();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}

		if((from != 0 && from != 1 && from != 2) || (to != 0 && to != 1 && to != 2))
		{
			throw new Exception("Error");
		}
		if(post[to].getSize() != 0)
		{
			try
			{
				int tm = post[to].pop();
				if(tmp > tm)
					throw new Exception("Error");
			}
			catch(Exception ex)
			{
				System.out.println("Smth came up");
			}

		}
	}
	
	public voi dsolve(int n, int start, int auxiliary, int end) {
		numMoves++;
       if (n == 1) {
           System.out.println(start + " -> " + end);
         /*  try
           {
				moveDisc(start, end);
           }
           catch(Exception ex)
           {
           		System.out.println(ex.getMessage());
           }*/
       } else {
           solve(n - 1, start, end, auxiliary);
           System.out.println(start + " -> " + end);
         /*  try
           {
				moveDisc(start, end);
           }
           catch(Exception ex)
           {
           		System.out.println(ex.getMessage());
           }*/
           solve(n - 1, auxiliary, start, end);
           System.out.println("!" + numMoves + "@\n");
       }
   }

	public boolean isFinished() {
		/*
		 TODO:  Returns true if and only if all of the discs are
		 on post[2] (i.e., post[0] and post[1] are empty)
		 */
		if(post[0].getSize() != 0 || post[1].getSize() != 0)
			return false;
		return true;
	}
	
	public int getNumMoves() {
		return numMoves;
	}

	
	public String toString() {
		/* 
		 TODO:  Returns some string representation of the current
		 game state.... this should help with debugging
		 */
		qw[0] = post[0];
		qw[1] = post[1];
		qw[2] = post[2];
		String st = post[0] + "||" + post[1] + "||" + post[2];
		for(int i = 1; i <= n; i++)
		{
			try
			{
				System.out.print(qw[0].pop() + "||");
			}
			catch(Exception ex)
			{
				System.out.print(0 + "||");
			}
			try
			{
				System.out.print(qw[1].pop() + "||");
			}
			catch(Exception ex)
			{
				System.out.print(0 + "||");
			}
			try
			{
				System.out.println(qw[2].pop() + "\n");
			}
			catch(Exception ex)
			{
				System.out.print(0 + "\n");
			}

		}



		return "Done\n";
	}
	
}