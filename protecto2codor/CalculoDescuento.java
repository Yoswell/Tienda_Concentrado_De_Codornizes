package protecto2codor;
//--Autor: Yoswel Badilla Toruño_31 de octubre del 2022--//
public class CalculoDescuento {

    //-Metodo calculo descuento--//
    public double calculoDescuento(double a, String b) {
        double totalDescuento;
        if (Integer.parseInt(b) < 300) { //Si la vaiable de entrada es menor a 300 se procedera a calcular el descuento por la cantidad de huevos
            totalDescuento = a * Integer.parseInt(b);
            return totalDescuento;
        } else if (Integer.parseInt(b) >= 300) { //Si la variable de entrada es mayor a 300 el descuento siempre sera de 20%
            totalDescuento = 20.0;
            return totalDescuento;
        }
        return 0;
    }
    
    //--Metodo para calcular lo que se le debe de restar a la cantidad total--//
    public double costoConDescuento(int x, double y) {
        return x * (1 - y/100); //X sera el totala pagar y Y sera el descuento obtenido con el metodo anterior
    }
        
}
