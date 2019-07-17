
package tallerjava;


public abstract class vehiculo {
    protected String marca,placa,combustible;
    protected int kilometrosRecorridos,numeroSerie;
    
        public vehiculo(String marca,String placa,String combustible,int kilometrosRecorridos,int numeroSerie){
            this.combustible=combustible;
            this.placa=placa;
            this.kilometrosRecorridos=kilometrosRecorridos;
            this.marca=marca;
            this.numeroSerie=numeroSerie;
        }
        

        public String mostrarInfo(){
            String resultado="";
            resultado=marca+"\t"+placa+"\t"+combustible+"\t"+Integer.toString(kilometrosRecorridos)+"\t"+Integer.toString(numeroSerie);
            return resultado;
        }

    
    
    
}
