#include<stdio.h>
#include<stdlib.h>
#include<time.h>
#define n 10
void generate_list_random();
int minv2();
int maxv2();
void sumar_listas();
int sum();
int main(){
    clock_t start_time, end_time;
    double cpu_time_used;
    int lista1[n], lista2[n], suma_listas[n];
    srand(time(NULL));
    generate_list_random(lista1);
    printf("\nLista 1 \t");
    for(int i=0;i<10;i++){
        printf("%d\t", lista1[i]);
    }
    printf("\n");
    generate_list_random(lista2);
    printf("\nLista 2 \t");
    for(int i=0;i<10;i++){
        printf("%d\t", lista2[i]);
    }
    printf("\n\nEl minimo de la lista 1 es %d", minv2(lista1));
    printf("\nEl minimo de la lista 2 es %d\n", minv2(lista2));
    printf("\nEl maximo de la lista 1 es %d", maxv2(lista1));
    printf("\nEl maximo de la lista 1 es %d\n", maxv2(lista2));
    start_time=clock();
    sumar_listas(lista1, lista2, suma_listas);
    end_time=clock();
    cpu_time_used=((double)(end_time - start_time))/CLOCKS_PER_SEC;
    printf("\nListas sumadas \t");
    for(int i=0;i<n;i++){
        printf("%d\t", suma_listas[i]);
    }
    printf("\nExecution time: %f", cpu_time_used);
    printf("\n\nListas sumadas \t%d\n", sum(suma_listas));
    return 0;
}
void generate_list_random(int lista[]){
    for(int x=0;x<n;x++){
        lista[x]=(rand()%(100+100+1))-100;
    }
}
int minv2(int lista[]){
    int mini=lista[0];
    for(int i=1;i<n;i++){
        if(lista[i]<mini){
            mini=lista[i];
        }
    }
    return mini;
}
int maxv2(int lista[]){
    int maxi=lista[0];
    for(int i=1;i<n;i++){
        if(lista[i]>maxi){
            maxi=lista[i];
        }
    }
    return maxi;
}
void sumar_listas(int lista1[], int lista2[], int suma_listas[]){
    for(int i=0;i<n;i++){
        suma_listas[i]=lista1[i]+lista2[i];
    }
}
int sum(int suma_listas[]){
    int sum=0;
    for(int i=0;i<n;i++){
        sum+=suma_listas[i];
    }
    return sum;
}