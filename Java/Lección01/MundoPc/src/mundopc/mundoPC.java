package mundopc;

import ar.com.system2023.mundopc.*;

public class mundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor ("HP", 13); //Importar la clase
        Teclado tecladoHP = new Teclado ("Bluetooth", "HP");
        Raton ratonHP = new Raton("Bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
        
        //Creamos otros objetos de diferente marca
        Monitor monitorLG = new Monitor ("LG", 24); //
        Teclado tecladoLG = new Teclado ("Bluetooth", "LG");
        Raton ratonLG = new Raton("Bluetooth", "LG");
        Computadora computadoraLG = new Computadora("Computadora LG", monitorLG, tecladoLG, ratonLG);

        Monitor monitorGamer = new Monitor ("Gamer", 32); 
        Teclado tecladoGamer = new Teclado ("Bluetooth", "Gamer");
        Raton ratonGamer = new Raton("Bluetooth", "Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);
        
        Monitor monitorLenovo = new Monitor ("Lenovo", 32); 
        Teclado tecladoLenovo = new Teclado ("Bluetooth", "Lenovo");
        Raton ratonLenovo = new Raton("Bluetooth", "Lenovo");
        Computadora computadoraLenovo = new Computadora("Computadora Lenovo", monitorLenovo, tecladoLenovo, ratonLenovo);
        
        Monitor monitorAsus = new Monitor ("Asus", 32); 
        Teclado tecladoAsus = new Teclado ("Bluetooth", "Asus");
        Raton ratonAsus = new Raton("Bluetooth", "Asus");
        Computadora computadoraAsus = new Computadora("Computadora Asus", monitorAsus, tecladoAsus, ratonAsus);
        
        Monitor monitorAcer = new Monitor ("Acer", 32); 
        Teclado tecladoAcer = new Teclado ("Bluetooth", "Acer");
        Raton ratonAcer = new Raton("Bluetooth", "Acer");
        Computadora computadoraAcer = new Computadora("Computadora Acer", monitorAcer, tecladoAcer, ratonAcer);
        
        Monitor monitorDell = new Monitor ("Dell", 32); 
        Teclado tecladoDell = new Teclado ("Bluetooth", "Dell");
        Raton ratonDell = new Raton("Bluetooth", "Dell");
        Computadora computadoraDell = new Computadora("Computadora Dell", monitorDell, tecladoDell, ratonDell);
        
        Monitor monitorSamsung = new Monitor ("Samsung", 32); 
        Teclado tecladoSamsung = new Teclado ("Bluetooth", "Samsung");
        Raton ratonSamsung = new Raton("Bluetooth", "Samsung");
        Computadora computadoraSamsung = new Computadora("Computadora Samsung", monitorSamsung, tecladoSamsung, ratonSamsung);
        
        Monitor monitorApple = new Monitor ("Apple", 32); 
        Teclado tecladoApple = new Teclado ("Bluetooth", "Apple");
        Raton ratonApple = new Raton("Bluetooth", "Apple");
        Computadora computadoraApple = new Computadora("Computadora Apple", monitorApple, tecladoApple, ratonApple);
        
        Monitor monitorMSI = new Monitor ("MSI", 32); 
        Teclado tecladoMSI = new Teclado ("Bluetooth", "MSI");
        Raton ratonMSI = new Raton("Bluetooth", "MSI");
        Computadora computadoraMSI = new Computadora("Computadora MSI", monitorMSI, tecladoMSI, ratonMSI);
        
        Monitor monitorRazer = new Monitor ("Razer", 32); 
        Teclado tecladoRazer = new Teclado ("Bluetooth", "Razer");
        Raton ratonRazer = new Raton("Bluetooth", "Razer");
        Computadora computadoraRazer = new Computadora("Computadora Razer", monitorRazer, tecladoRazer, ratonRazer);
        
        Orden orden1 = new Orden();//Inicializamos el arreglo vacio
        Orden orden2 = new Orden();//Una nueva lista para el objeto orden2

        Computadora computadorasVarias = new Computadora("Computadora de diferentes marcas", monitorHP, tecladoRazer, ratonHP);

        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        orden1.agregarComputadora(computadoraLG);
        orden1.agregarComputadora(computadoraAsus);
        orden1.agregarComputadora(computadoraLenovo);
        orden1.agregarComputadora(computadoraDell);
        orden1.agregarComputadora(computadoraApple);
        orden1.agregarComputadora(computadoraAcer);
        orden1.agregarComputadora(computadoraMSI);
        orden1.agregarComputadora(computadoraRazer);
        orden1.agregarComputadora(computadoraSamsung);

        orden2.agregarComputadora(computadorasVarias);

        orden1.mostrarOrden();
        orden2.mostrarOrden();

        //Crear mas objetos de tipo computadora con todos sus elementos 
        //completar una lista en el objeto de orden1 que llegue a los 10 elementos
        //probar de esta manera los metodos al maximo rendimiento
    }
}
