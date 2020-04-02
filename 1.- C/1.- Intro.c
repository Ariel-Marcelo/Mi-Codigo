// recuerda para compilar programas .cs en c# escribe mcs nombre.cs 
// finalmente mono nombre.exe para ejecutar
# include <stdio.h> // contiene informacion que el compilador utiliza para llamar a otras bibliotecas 
                    // y es la cabezera estándar para poder manejar datos de  entrada y salida 
#define Pi 3,14 // esta es una macro una variable cuyo valor nunca cambiara
int y = 5; // variable global
float a = 45;
int main(){//función principal

    printf("Hola Mundo\n");
    printf("El valor de  y: %i\n", y );
    // para un dato tipo float usamo %f y si queremos restringir el numero de decimales %.2f
    /*
    char  Tamaño : 1 byte    %c
    long Tamaño:  4 byte    %li
    double Tamaño: 8 byte    %lf 
    para short, int, unsigned int, es %i 
    */
    printf( "%i %f", y , a); // para imprimir distintos valores de tipos diferentes 
    char x[50]; // número de caracteres en x 
    scanf("%i", &a); // espera recibir dato entero del usuario par guardarlo en la variable a 
    scanf("%s", x ); // como se van a ingresar caracteres no es necesario usar &
    gets(x); // scanf solo ingresa caracteres hasta que encuentra un espacio en blanco por eso usamos gets
    
    y += 10; // y = y + 10;

    return 0;
}