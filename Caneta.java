
package olamundo;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    
    public void status(){ 
        System.out.println("Modelo:BiC "+ this.modelo);
        System.out.println("Cor: Azul"+ this.cor);
        System.out.println("Ponta:0.7 " +this.ponta);
        System.out.println("Carga:100 "+ this.carga);
        System.out.println("está tamapada?"+ this.tampada);
        
    }
    //matódos da caneta:
    public void rabiscar(){        
        if (this.tampada == true){
            System.out.println("Erro! não posso rabiscar");
        } else {
            System.out.println("Já posso escrever");
        }
    }
    
    protected void tampar (){
        this.tampada=true ;
    }
    protected void destampar () {
        this.tampada=false;
    }
    
   
        
    
}
