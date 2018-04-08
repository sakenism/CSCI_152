#include <stdio.h>
#include <stdlib.h>

typedef struct _weather{
    int rain;
    double tmp;
    double wind;
    struct _weather *link;
} weather;

weather* mtalloc()
{
    return (weather*)malloc(12 * sizeof(weather));
}

int rainfall(weather *Lazka)
{
    if(Lazka == NULL)
        return
    int i, sum = 0;
    sum += Lazka->rain;
    sum += rainfall(Lazka->link);
    return sum;
}

double aver(weather *Lazka)
{
    if(Lazka == NULL)
        return;
    int i;
    double mini = 1111210;
    if(Lazka->tmp < mini)
        mini = Lazka->tmp;
    if(aver(Lazka->link) < mini)
        mini = aver(Lazka->link);
    return mini;
}

double windi(weather *Lazka)
{
    
    int i;
    double sum = 0;
    if(Lazka == NULL)
        return; 
    sum += Lazka->wind;
    
    sum += windi(Lazka->link);
    return sum / 12;
}

void printall(weather *Lazka)
{
    if(Lazka == NULL)
        return;
    int i;
    printf("%i\t%lf\t%lf\n", Lazka->rain, Lazka->tmp, Lazka->wind);
    printall(Lazka->link);
}
void scan(weather *Lazka, int n)
{
    if(n == 13)
        return;
    weather *tmp = malloc(sizeof(_weather));
    fscanf(fp, "%i", &q);
    tmp->rain = q;

    fscanf(fp, "%lf", &w);
    tmp->tmp = w;
    
    fscanf(fp, "%lf", &w);
    tmp->wind = w;
    scan(tmp, n + 1);

}
int main()
{
    //FILE *fp = fopen("astana.txt", "r");
    weather *Lazka = malloc(sizeof(_weather));
    weather *tmp = malloc(sizeof(_weather));
    int i, q;
    double w;
    fscanf(fp, "%i", &q);
    Lazka->rain = q;
    fscanf(fp, "%lf", &w);
    Lazka->tmp = w;

    fscanf(fp, "%lf", &w)
    Lazka->wind = w;
    scan(Lazka, 1);
    
    printall(Lazka);
    return 0;
}