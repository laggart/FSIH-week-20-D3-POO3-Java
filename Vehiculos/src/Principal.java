import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        List<Coche> coches = new ArrayList<>();
        List<Moto> motos = new ArrayList<>();
        List<Camion> camiones = new ArrayList<>();

        //Instanciamos

        coches.add(new Coche("Toyota", "Hilux", 2020, "Gasolina", 23000, 2));
        coches.add(new Coche("Honda", "CRV", 2021, "Diesel", 25000, 4));

        motos.add(new Moto("Yamaha","MT-07", 2021, "Gasolina", 7000, false));
        motos.add(new Moto("Kawazaki","Ninja", 2020, "Gasolina", 8000, true));

        camiones.add(new Camion("Volvo","FMX", 2018, "Diesel", 95000, 4));
        camiones.add(new Camion("Mercedes","eMobility", 2020, "Electrico", 115000, 2));


        Scanner teclado = new Scanner(System.in);

        //Modelo específico

        System.out.print("Introduce el modelo a buscar: ");
        String modeloBuscado = teclado.nextLine();
        buscarModelo(coches, motos, camiones, modeloBuscado);

        //Recorrer y mostrar características

        System.out.println("\nlista completa de coches:");
        coches.forEach(System.out::println);
        
        System.out.println("\nlista completa de motos:");
        motos.forEach(System.out::println);
        
        System.out.println("\nlista completa de camiones:");
        camiones.forEach(System.out::println);

        // Guardar marcas aparte

        List<String> todasLasMarcas = new ArrayList<>();
        almacenarMarcas(coches, todasLasMarcas);
        almacenarMarcas(motos, todasLasMarcas);
        almacenarMarcas(camiones, todasLasMarcas);

        System.out.println("\nTodas las marcas: ");
        todasLasMarcas.forEach(System.out::println);


        // Arraylist mixto coches, motos y camiones

        List <Vehiculo> vehiculosMixtos = new ArrayList<>();
        vehiculosMixtos.addAll(coches);
        vehiculosMixtos.addAll(motos);
        vehiculosMixtos.addAll(camiones);

        System.out.println("\nLista de todos nuestros vehículos");
        vehiculosMixtos.forEach(System.out::println);
        teclado.close();
    }

    public static void buscarModelo(List<Coche> coches, List<Moto> motos, List<Camion> camiones, String modelo){
        boolean encontrado = false;
        for (Coche coche : coches) {
            if(coche.getModelo().equalsIgnoreCase(modelo)){
                System.out.println("Encontrado en coches: " + coche);
                encontrado = true;
            }
        }
        for (Moto moto : motos) {
            if(moto.getModelo().equalsIgnoreCase(modelo)){
                System.out.println("Encontrado en motos: " + moto);
                encontrado = true;
            }   
        }
        for (Camion camion : camiones) {
            if(camion.getModelo().equalsIgnoreCase(modelo)){
                System.out.println("Encontrado en camiones: " + camion);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Este modelo no se encuentra en stock.");
            
        }
    }

    public static void almacenarMarcas(List<? extends Vehiculo> vehiculos, List<String> marcas) {
        for (Vehiculo vehiculo : vehiculos) {
            if (!marcas.contains(vehiculo.getMarca())){
                marcas.add(vehiculo.getMarca());
            } 
            
        }

    }
}
