
package tallerjava;


public class CarroDeportivo extends vehiculo{
    private String caballopotencia;
    private int numeropuertas,numeroasientos;
    private boolean turbo;
    
    
    public CarroDeportivo(String marca, String placa, String combustible, int kilometrosRecorridos, int numeroSerie,String caballopotencia,int numeropuertas,int numeroasientos,boolean turbo) {
        super(marca, placa, combustible, kilometrosRecorridos, numeroSerie);
        this.caballopotencia=caballopotencia;
        this.numeroasientos=numeroasientos;
        this.numeropuertas=numeropuertas;
        this.turbo=turbo;
    }
    public void setAsiento(int numeroasientos){
        this.numeroasientos=numeroasientos;
    }
    public void setCaballo(String caballopotencia ){
        this.caballopotencia=caballopotencia;
        
    }
    
    
    public String mostrarInfo2(){
        String resultado="";
        String estado="";
        if(this.turbo){
            estado = "Sin Turbo";
        }else{
            estado = "Con Turbo";
        }
        resultado=mostrarInfo()+"\t"+caballopotencia+"\t"+Integer.toString(numeroasientos)+"\t"+Integer.toString(numeropuertas)+estado;
        return resultado;
    }

    
    
}
