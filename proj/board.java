public class board implements Interface
{
    int x, y, bcnt, rndx, rndy;
    public board(int a, int b)
    {
        this.x = a;
        this.y = b;
        this.rndx = 0;
        this.rndy = 0;
        this.bcnt = (int)Math.sqrt(a * b); 
        int brd[x][y];
        int open[x][y];
        for (int i = 0; i < this.x; i++)
        {
            for (int j = 0; j < this.y; j++)
            {
                brd[i][j] = 0;
                open[i][j] = 0;
            }
        }
        for (int i = 0; i < bcnt; i++)
        {
            while (brd[rndx][rndy] != 0)
            {
                rndx = (int) (Math.random() * (this.x));
                rndy = (int) (Math.random() * (this.y));
            }
            brd[rndx][rndy] = -1;
        }
        for (int i = 0; i < this.x; i++)
        {
            for (int j = 0; j < this.y; j++)
            {
                if (brd[i][j] != -1)
                {
                    if (i > 0 && brd[i - 1][j] == -1)
                        brd[i][j]++;
                    if (j > 0 && brd[i][j - 1] == -1)
                        brd[i][j]++;
                    if (i > 0 && j > 0 && brd[i - 1][j - 1] == -1)
                        brd[i][j]++;
                    if (j < y - 1 && brd[i][j + 1] == -1)
                        brd[i][j]++;
                    if (i < x - 1 && brd[i + 1][j] == -1)
                        brd[i][j]++;
                    if (i > 0 && j < y - 1 && brd[i - 1][j + 1] == -1)
                        brd[i][j]++;
                    if (i < x - 1 && j < y - 1 && brd[i + 1][j + 1] == -1)
                        brd[i][j]++;
                    if (i < x - 1 && j > 0 && brd[i + 1][j - 1] == -1)
                        brd[i][j]++;
                }
            }
        }
    }
    public void dfs(int a, int b)
    {
        if (brd[a][b] == 0)
            return ;
    }
    public void print_board()
    {
        for (int i = 0; i < this.x; i++)
        {
            for (int j = 0; j < this.y; j++)
            {
                if (open[i][j] == 0)
                    System.out.print('x');
                else    
                    System.out.print(brd[i][j]);
                System.out.print(' ');
            }
            System.out.print('\n');
        }
    }
    public void clear()
    {
        for (int i = 0; i < this.x; i++)
        {
            for (int j = 0; j < this.y; j++)
            {
                brd[i][j] = 0;
            }
        }
    }
}