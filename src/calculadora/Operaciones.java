
package calculadora;


public class Operaciones {
    
    public Operaciones(){
    
}
    
    public double suma(double numeroa, double numerob){
        return numeroa + numerob;
    }
    public double resta(double numeroa, double numerob){
        return numeroa - numerob;
    }
    public double multiplicacion(double numeroa, double numerob){
        return numeroa*numerob;
    }
    public double division(double numeroa, double numerob){
        double resultado = 0;
        if(numerob != 0){
            resultado =  (numeroa/numerob);
        }else{
            resultado = 0;
        }
        return resultado;
    }
    
    public double modulo(double numeroa, double numerob){
        return (numeroa % numerob);
    }
}
