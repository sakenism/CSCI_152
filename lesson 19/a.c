#include <stdio.h>
#include <math.h>
// x^3 + 2xx - 2
double f(double x)
{
	return -2 * x * x * x - x + 2;
}

double zF(double mini, double maxi, double e)
{
	double x, y;
	while(1)
	{
		x = (maxi + mini) / 2;
		y = f(x);
        //printf("%lf %lf\n", maxi, e);
		if(y <= e && y > 0)
		{
			printf("%lf", x);
			break;
		}
		else if(y > 0)
		{
			mini = x;
		}
		else
			maxi = x;
	}
}
int main (){

	double mini = 0, maxi = 1, x;
	double y = 1, e = (double)(1) / 100000;
	zF(0, 1, 0.00000001);
}