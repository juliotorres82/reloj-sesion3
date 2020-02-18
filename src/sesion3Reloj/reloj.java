/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion3Reloj;

/**
 *
 * @author BETTY
 */
public class reloj {
    private int hora;
    private int minuto;
    private int segundo;

    public reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
   
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
    
 public void mostrarHora () {  
     
     System.out.println( +this.hora + ":" +this.minuto + ":" +this.segundo + ":");
 } 

public void aumentarSegundos () {
    
    if ((segundo >=0) && (segundo<=59)) {
        segundo ++;
        System.out.println( +this.hora + ":" +this.minuto + ":" +this.segundo + ":");
        
    }
}
  public void aumentarMinutos () {  
    if ((minuto >=0) && (minuto<=59)) {
        minuto ++;
        System.out.println( +this.hora + ":" +this.minuto + ":" +this.segundo + ":");
        
    }
  }
 public void aumentarHoras () {
     
     if ((hora >=0) && (hora<=23)) {
        hora ++;
        System.out.println( +this.hora + ":" +this.minuto + ":" +this.segundo + ":");
        
    }
     
 }

}
    
