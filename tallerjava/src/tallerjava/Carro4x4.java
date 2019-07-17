
package tallerjava;


public class Carro4x4 extends vehiculo{
    private String tipomotor;
    private int numeroasientos;
    
    public Carro4x4(String marca, String placa, String combustible, int kilometrosRecorridos, int numeroSerie,String tipomotor,int numeroasientos) {
        super(marca, placa, combustible, kilometrosRecorridos, numeroSerie);
        this.numeroasientos=numeroasientos;
        this.tipomotor=tipomotor;
    }
    public void setMotor(String tipomotor){
        this.tipomotor=tipomotor;
    }
    public void setAsientos(int numeroasientos){
        this.numeroasientos=numeroasientos;
    }
    public String mostrarInfo3(){
        String resultado="";
        resultado=mostrarInfo()+"\t"+tipomotor+"\t"+Integer.toString(numeroasientos);
        return resultado;
    }
    
    
}
