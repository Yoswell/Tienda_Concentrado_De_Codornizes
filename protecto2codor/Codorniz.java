package protecto2codor;
//--Autor: Yoswel Badilla Toruño_31 de octubre del 2022--//
public class Codorniz {
    
    //--Metodo para calcular el precio total de sacos porcantidad de polluelos--//
    public String precioSacoPolluelo(String a, int b) {
        if (Integer.parseInt(a) <= 1000) { //Si la cantidad de polluelos es menor a 1000 su precio sera de 1 saco sino se calculara su precio con el siguiente codigo
                b = 5840;
            } else if (Integer.parseInt(a) > 1000 && Integer.parseInt(a) <= 2000) {
                b = b * 2; 
            } else if (Integer.parseInt(a) > 2000 && Integer.parseInt(a) <= 3000) {
                b = b * 3;
            } else if (Integer.parseInt(a) > 3000 && Integer.parseInt(a) <= 4000) {
                b = b * 4;
            } else if (Integer.parseInt(a) > 4000 && Integer.parseInt(a) <= 5000) {
                b = b * 5;
            } else if (Integer.parseInt(a) > 5000 && Integer.parseInt(a) <= 6000) {
                b = b * 6;
            } else if (Integer.parseInt(a) > 6000 && Integer.parseInt(a) <= 7000) {
                b = b * 7;
            } else if (Integer.parseInt(a) > 7000 && Integer.parseInt(a) <= 8000) {
                b = b * 8;
            } else if (Integer.parseInt(a) > 8000 && Integer.parseInt(a) <= 9000) {
                b = b * 9;
            } else if (Integer.parseInt(a) > 9000 && Integer.parseInt(a) <= 10000) {
                b = b * 10;
            } else if (Integer.parseInt(a) > 10000 && Integer.parseInt(a) <= 11000) {
                b = b * 11;
            } 
        return Integer.toString(b);
    }
    
    //--Metodo para calcular el precio total de sacos porcantidad de jovenes--//
    public String precioSacoJovenes(String c, int d) {
        if (Integer.parseInt(c) <= 800) { //Si la cantidad de jovenes es menor a 800 su precio sera de 1 saco sino se calculara su precio con el siguiente codigo
                d = 8045;
            } else if (Integer.parseInt(c) > 800 && Integer.parseInt(c) <= 1600) {
                d = d * 2;
            } else if (Integer.parseInt(c) > 1600 && Integer.parseInt(c) <= 2400) {
                d = d * 3;
            } else if (Integer.parseInt(c) > 2400 && Integer.parseInt(c) <= 3200) {
                d = d * 4;
            } else if (Integer.parseInt(c) > 3200 && Integer.parseInt(c) <= 4000) {
                d = d * 5;
            } else if (Integer.parseInt(c) > 4000 && Integer.parseInt(c) <= 4800) {
                d = d * 6;
            } else if (Integer.parseInt(c) > 4800 && Integer.parseInt(c) <= 5600) {
                d = d * 7;
            } else if (Integer.parseInt(c) > 5600 && Integer.parseInt(c) <= 6400) {
                d = d * 8;
            } else if (Integer.parseInt(c) > 6400 && Integer.parseInt(c) <= 7200) {
                d = d * 9;
            } else if (Integer.parseInt(c) > 7200 && Integer.parseInt(c) <= 8000) {
                d = d * 10;
            } else if (Integer.parseInt(c) > 8000 && Integer.parseInt(c) <= 8800) {
                d = d * 11;
            } 
        return  Integer.toString(d);
    }
    
    //--Metodo para calcular el precio total de sacos porcantidad de adultos--//
    public String precioSacoAdultos(String x, int y) {
        if (Integer.parseInt(x) <= 500) { //Si la cantidad de adultos es menor a 500 su precio sera de 1 saco sino se calculara su precio con el siguiente codigo
                y = 13200;
            } else if (Integer.parseInt(x) > 500 && Integer.parseInt(x) <= 1000) {
                y = y * 2;
            } else if (Integer.parseInt(x) > 1000 && Integer.parseInt(x) <= 1500) {
                y = y * 3;
            } else if (Integer.parseInt(x) > 1500 && Integer.parseInt(x) <= 2000) {
                y = y * 4;
            } else if (Integer.parseInt(x) > 2000 && Integer.parseInt(x) <= 2500) {
                y = y * 5;
            } else if (Integer.parseInt(x) > 2500 && Integer.parseInt(x) <= 3000) {
                y = y * 6;
            } else if (Integer.parseInt(x) > 3000 && Integer.parseInt(x) <= 3500) {
                y = y * 7;
            } else if (Integer.parseInt(x) > 3500 && Integer.parseInt(x) <= 4000) {
                y = y * 8;
            } else if (Integer.parseInt(x) > 4000 && Integer.parseInt(x) <= 4500) {
                y = y * 9;
            } else if (Integer.parseInt(x) > 4500 && Integer.parseInt(x) <= 5000) {
                y = y * 10;
            } else if (Integer.parseInt(x) > 5000 && Integer.parseInt(x) <= 5500) {
                y = y * 11;
            } 
        return Integer.toString(y);
    }
}
