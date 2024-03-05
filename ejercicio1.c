#include<stdio.h>
#include<stdlib.h>
#include<time.h>
void arreglo();
void imprimir();
void buscar();
void ordenar();
int main(){
    int a[1000], opcion;
    double segundos, tiempo_inicio, tiempo_final;
    arreglo(a);
    do{
        system("cls");
        printf("\nMENU\n");
        printf("\n1) Imprimir.\n");
        printf("\n2) Buscar.\n");
        printf("\n3) Ordenar.\n");
        printf("\n4) Salir.\n");
        printf("\nIntroduzca la opcion deseada: ");
        scanf("%d", &opcion);
        if(opcion==1){
            tiempo_inicio=clock();
            imprimir(a);
            tiempo_final=clock();
            segundos=(tiempo_final-tiempo_inicio)/CLOCKS_PER_SEC;
            printf("\nTiempo de ejecucion: %f segundos.\n\n", segundos);
            system("pause");
        }else if(opcion==2){
            tiempo_inicio=clock();
            buscar(a);
            tiempo_final=clock();
            segundos=(tiempo_final-tiempo_inicio)/CLOCKS_PER_SEC;
            printf("\nTiempo de ejecucion: %f segundos.\n\n", segundos);
            system("pause");
        }else if(opcion==3){
            tiempo_inicio=clock();
            ordenar(a);
            printf("\nEl arreglo ha sido ordenado correctamente.\n");
            tiempo_final=clock();
            segundos=(tiempo_final-tiempo_inicio)/CLOCKS_PER_SEC;
            printf("\nTiempo de ejecucion: %f segundos.\n\n", segundos);
            system("pause");
        }else if(opcion==4){
            printf("\nHasta pronto :)\n");
            break;
        }else{
            printf("\nIntroduzca una opcion valida.\n\n");
            system("pause");
        }
        system("cls");
    }while(1);
    return 0;
}
void arreglo(int a[]){
    int i;
    srand(time(NULL));
    for(i=0;i<1000;i++){
        a[i]=rand()%(99+1);
    }
}
void imprimir(int a[]){
    int i;
    printf("\n");
    for(i=0;i<100;i++){
        printf("%d) %d.\t\t", i+1, a[i]);
        if((i+1)%10==0){
            printf("\n");
        }
    }
    for(i=100;i<1000;i++){
        printf("%d) %d. \t", i+1, a[i]);
        if((i+1)%10==0){
            printf("\n");
        }
        }
}
void buscar(int a[]){
    int elemento, i;
    printf("\nElemento a buscar: ");
    scanf("%d", &elemento);
    for(i=0;i<=1000;i++){
        if(a[i]==elemento){
            printf("\nEl elemento se encuentra dentro del arreglo primeramente en la posicion %d)\n", i+1);
            return;
        }
    }
    printf("\nEl elemento no se encuentra dentro del arreglo.\n");
}
void ordenar(int a[]){
    int i, j, aux;
    for(i=0;i<1000;i++){
        for(j=i+1;j<1000;j++){
            if(a[j]<a[i]){
                aux=a[i];
                a[i]=a[j];
                a[j]=aux;
            }
        }
    }
}