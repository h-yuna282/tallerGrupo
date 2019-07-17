
package tallerjava;


public class motos extends vehiculo{
    
    public motos(String marca, String placa, String combustible, int kilometrosRecorridos, int numeroSerie) {
        super(marca, placa, combustible, kilometrosRecorridos, numeroSerie);
    }
    
        public String mostrar(){
            String resultado="";
            resultado= mostrarInfo();
            return resultado;
        }
           
}
