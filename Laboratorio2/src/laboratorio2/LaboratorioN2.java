
package laboratorio2;

import java.util.Scanner;

public class LaboratorioN2 {
    public static void main(String[] args) {
        String nombre = "";
        int edad = 0;
        boolean opcion = true;
        String tipo = "";
        int sueldoMensual = 0;
        int porcentaje = 0;
        int sueldoFinal = 0;
        int hijos = 0;
        int Dhijos = 0;
        int descuento = 0 ;
        int incentivo =0;
        String cadena = "";
        String valorUsuario = "";
        int contador = 0;
        int descuentoT = 0;
        int Thijos =0;
        int Tincentivo = 0;
        int Tsueldofinal = 0;
        
        Scanner sc = new Scanner(System.in);
       
        do{ 
            contador = contador + 1 ;
            
            System.out.println("Ingrese su nombre y apellido");
            nombre = sc.nextLine();
                           
            cadena = String.format("%s%s",cadena,"Reporte de rol de pagos por empleado");
        
            System.out.println("Ingrese que tipo de sueldo que posee\n"
                + "Tipo 1. Sueldo mensual de 340$\n"+"Tipo 2. Sueldo mensual de 460$\n"
                + "Tipo 3. Sueldo Mensual de 580$\n"+"Tipo 4. Sueldo mensual de 600$");
            tipo = sc.nextLine();
                        
            cadena = String.format("%s\n%s\n", cadena, nombre);
            
            char valor = tipo.charAt(0);
            switch (valor) {
            
            case '1':
                porcentaje = 5;
                sueldoMensual = 340;
                                
                System.out.println("Cuantos Hijos tiene");
                hijos = sc.nextInt();  
                
                if (hijos >= 1){
                    Dhijos = hijos*10;
                    sueldoFinal = sueldoMensual + Dhijos +(incentivo = sueldoMensual *porcentaje/100);

                System.out.println("Ingrese su edad");
                edad = sc.nextInt();
                
                if(edad <=20){
                   porcentaje = 15; 
                   sueldoFinal = sueldoFinal - (descuento = incentivo+porcentaje+Dhijos); 
                   //System.out.printf("su sueldo es de %d dolares",sueldoFinal);    
                }else {
                    
                   if (edad >20 && edad <=30){
                   porcentaje = 25 ;
                   sueldoFinal = sueldoFinal - (descuento = incentivo+porcentaje+Dhijos); 
                  // System.out.printf("su sueldo es de %d dolares",sueldoFinal);
                }else {
                       
                  if (edad >31){
                   porcentaje = 35 ;
                   sueldoFinal = sueldoFinal - (descuento= incentivo+porcentaje+Dhijos); 
                  // System.out.printf("su sueldo es de %d dolares",sueldoFinal);
                  System.out.println("Si desea salir presione 'x' ");
                  valorUsuario = sc.nextLine();
            
                  if(valorUsuario.equals("x")){
                  opcion = false;
                  
                 }
                }
               }
              }
             }
  
     
             break;
               
            case '2':
                porcentaje = 10;
                sueldoMensual = 460;
                
                System.out.println("Cuantos Hijos tiene");
                hijos = sc.nextInt();  
               
                if (hijos >= 1){
                    Dhijos = hijos*10;
                sueldoFinal = sueldoMensual + Dhijos +(incentivo = sueldoMensual *porcentaje/100);             
                System.out.println("Ingrese su edad");
                edad = sc.nextInt();
                
                if(edad <=20){
                   porcentaje = 15; 
                   sueldoFinal = sueldoFinal - (descuento = incentivo+porcentaje+Dhijos); 
                  // System.out.printf("su sueldo es de %d dolares",sueldoFinal);    
                }else {
                    
                   if (edad >20 && edad <=30){
                   porcentaje = 25 ;
                   sueldoFinal = sueldoFinal - (descuento = incentivo+porcentaje+Dhijos); 
                   //System.out.printf("su sueldo es de %d dolares",sueldoFinal);
                }else {
                       
                   if (edad >31){
                   porcentaje = 35 ;
                   sueldoFinal = sueldoFinal - (descuento= incentivo+porcentaje+Dhijos);           
                   //System.out.printf("su sueldo es de %d dolares",sueldoFinal);
                   
                   System.out.println("Desea salir ingrese 'x' ");
                    valorUsuario = sc.nextLine();
            
                if(valorUsuario.equals("x")){
                 opcion = false;
                 }
                }
               }
              }
             }
                
             break;
            
            case '3':
                porcentaje = 15;
                sueldoMensual = 580;
                
                System.out.println("Cuantos Hijos posee");
                hijos = sc.nextInt();
                if (hijos >= 1){
                    Dhijos = hijos*10;
                    sueldoFinal = sueldoMensual + Dhijos +(incentivo = sueldoMensual *porcentaje/100);
                    
                System.out.println("Ingrese su edad");
                edad = sc.nextInt();
                
                if(edad <=20){
                   porcentaje = 15; 
                   sueldoFinal = sueldoFinal - (descuento = incentivo+porcentaje+Dhijos); 
                   //System.out.printf("su sueldo es de %d dolares",sueldoFinal);    
                }else {
                    
                   if (edad >20 && edad <=30){
                   porcentaje = 25 ;
                   sueldoFinal = sueldoFinal - (descuento = incentivo+porcentaje+Dhijos); 
                   //System.out.printf("su sueldo es de %d dolares",sueldoFinal);
                }else {
                       
                   if (edad >31){
                   porcentaje = 35 ;
                   sueldoFinal = sueldoFinal - (descuento= incentivo+porcentaje+Dhijos); 
                   //System.out.printf("su sueldo es de %d dolares",sueldoFinal);
                   
                   System.out.println("Desea salir ingrese 'x' ");
                   valorUsuario = sc.nextLine();
            
                 if(valorUsuario.equals("x")){
                 opcion = false;
                 }
                }
               }
              }
             }
             break;
            
            case '4':
                porcentaje = 15;
                sueldoMensual = 600;
                
                System.out.println("Cuantos Hijos Tiene");
                Dhijos = sc.nextInt();
                
              if (hijos >= 1){
                    Dhijos = hijos*10;
                sueldoFinal = sueldoMensual + Dhijos +(incentivo = sueldoMensual *porcentaje/100);              
                System.out.println("Ingrese su edad");
                edad = sc.nextInt();
                
                if(edad <=20){
                   porcentaje = 15; 
                   sueldoFinal = sueldoFinal - (descuento = incentivo+porcentaje+Dhijos); 
                   //System.out.printf("su sueldo es de %d dolares",sueldoFinal); 
                   
                }else {
                    
                   if (edad >20 && edad <=30){
                   porcentaje = 25 ;
                   sueldoFinal = sueldoFinal - (descuento = incentivo+porcentaje+Dhijos); 
                   //System.out.printf("su sueldo es de %d dolares",sueldoFinal);
                   
                }else {
                       
                   if (edad >31){
                   porcentaje = 35 ;
                   sueldoFinal = sueldoFinal - (descuento= incentivo+porcentaje+Dhijos);
                   //System.out.printf("su sueldo es de %d dolares",sueldoFinal);
                
                  System.out.println("Desea salir ingrese 'x' ");
                  valorUsuario = sc.nextLine();
            
            if(valorUsuario.equals("x")){
                opcion = false;
                 }
                }
               }
              }
             }
            break;
            
            default:
         System.out.println("el tipo de sueldo seleccionado es incorrecto");       
        }
            
        descuentoT = descuentoT + descuento;
        Thijos = Thijos + Dhijos;
        Tincentivo = Tincentivo + incentivo;
        Tsueldofinal = Tsueldofinal + sueldoFinal;
                            
            sc.nextLine(); // Limpiar Buffer
            
            System.out.println("Desea salir ingrese 'x' caso contrario presione enter para continuar ");
            valorUsuario = sc.nextLine();
            
            if(valorUsuario.equals("x")){
                opcion = false;
            }
          cadena = String.format("%sSueldo mensual %d dolares\nIncentivo%d dolares\nNro. de Hijos %d\n"
                +"Descuento SS %d dolares\nTotal a pagar %d dolares\n",cadena
                   ,sueldoMensual,incentivo,hijos,descuento,sueldoFinal);
                                    
        }while (opcion==true);
             
        System.out.printf("%s",cadena);
        
        cadena = String.format("Reporte de rol de pagos de la Empresa (Totales)\n"
                +"Descuento de Seguro Social %d dolares\nTotal de incentivos %d\n"
                +"Total de pago por hijos %d dolares\n"
                +"Total de pago de la emprea %d dolares",descuentoT,Tincentivo,Thijos,Tsueldofinal);  
        
        System.out.printf("%s",cadena);
    }   
}
