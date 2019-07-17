
package tallerjava;


public class Furgonetas extends vehiculo {
    private int capacidad;
    private String altura;
    
    public Furgonetas(String marca, String placa, String combustible, int kilometrosRecorridos, int numeroSerie,int capacidad,String altura) {
        super(marca, placa, combustible, kilometrosRecorridos, numeroSerie);
        this.capacidad=capacidad;
        this.altura=altura;
    }
    public void setAltura(String altura){
        this.altura=altura;
    }
    public void setCapa(int capacidad){
        this.capacidad=capacidad;
    }
     public String mostrarInfo5(){
        String resultado="";
        resultado=mostrarInfo()+"\t"+Integer.toString(capacidad)+"\t"+altura;
        return resultado;
    }
    
}
