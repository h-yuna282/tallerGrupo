
package tallerjava;

public class CarroTurismo extends vehiculo {
    private String tipo,tipomotor;
    private int numeropuerta;
    
    public CarroTurismo(String marca, String placa, String combustible, int kilometrosRecorridos, int numeroSerie,String tipo, String tipomotor,int numeropuerta) {
        super(marca, placa, combustible, kilometrosRecorridos, numeroSerie);
        this.tipo=tipo;
        this.tipomotor=tipomotor;
        this.numeropuerta=numeropuerta;
        
    }
    
    
    public String mostrarInfo1(){
        String l;
        l=mostrarInfo()+"\t"+tipomotor+"\t"+tipo+"\t"+Integer.toString(numeropuerta);
        return l;
                    
    }   
    
    
}
