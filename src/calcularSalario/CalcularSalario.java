
package calcularSalario;


public class CalcularSalario {
    public int salario;
    public String cargo; 
     public String nome; 
     
     public int calcularsalario(String cargo, int salario1){
         if("DESENVOLVERDOR". equals(cargo)){
          if(salario1 >= 3000){
            salario = salario1 - (int)(0.2 * salario1); 
              return salario;
         }
          }else{
         salario = salario1 - (int) (0.1 * salario1); 
         return salario;
         }
        
         
          if("DBA". equals(cargo)){
          if(salario1 >= 2000){
            salario = salario1 - (int)(0.25 * salario1); 
              return salario;
         }
          }else{
         salario = salario1 - (int) (0.15 * salario1); 
          return salario;
         }
          
           if("TESTADOR". equals(cargo)){
          if(salario1 >= 2000){
            salario = salario1 - (int)(0.25 * salario1); 
              return salario;
         }
          }else{
         salario = salario1 - (int) (0.15 * salario1); 
          return salario;
         }
           
            if("GERENTE". equals(cargo)){
          if(salario1 >= 5000){
            salario = salario1 - (int)(0.3 * salario1); 
              return salario;
         }
          }else{
         salario = salario1 - (int) (0.2 * salario1); 
          return salario;
         }
     return 0; }
}
