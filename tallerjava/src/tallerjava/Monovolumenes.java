
package tallerjava;


public class Monovolumenes extends vehiculo{
    private int numeropuerta,numeroasiento,capacidadcarga;
    private String tipomotor;
    private boolean puertalateral;
    
    public Monovolumenes(String marca, String placa, String combustible, int kilometrosRecorridos, int numeroSerie,int numeropuerta,int numeroasiento,int capacidadcarga,
            String tipomotor,boolean puertalateral) {
        super(marca, placa, combustible, kilometrosRecorridos, numeroSerie);
        this.numeroasiento=numeroasiento;
        this.tipomotor=tipomotor;
        this.numeropuerta=numeropuerta;
        this.capacidadcarga=capacidadcarga;
        this.puertalateral=puertalateral;  
        
    }
    public void setCapacidad(int capacidadcarga ){
        this.capacidadcarga=capacidadcarga;
    }
    public void setAsiento(int numeroasiento){
        this.numeroasiento=numeroasiento;
    }    
    public String mostrarInfo4(){
        String resultado="";
        String estado="";
        if(this.puertalateral){
            estado = "Normal";
        }else{
            estado = "Modificada";
        }
        resultado=mostrarInfo()+"\t"+Integer.toString(numeropuerta)+"\t"+Integer.toString(numeroasiento)+"\t"+Integer.toString(capacidadcarga)+"\t"+tipomotor+"\t"+estado;
        return resultado;
    }
    
}
