import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        Byte pedidos_soportados = 9;
        String [] lista_pedidos = new String[pedidos_soportados];
        String [] ubicacion_actual = new String[pedidos_soportados];
        String [] mapa = new String[pedidos_soportados];
        String [] pedido_actual = new String[pedidos_soportados];
        Boolean [] aceptado = new Boolean[pedidos_soportados];

        System.out.println("=== Se inicia carga de pedidos ===");
        //--------------------------------------------------------------------------
        // (1) Ejemplo de carga de pedidos
        // El pedido Nro 0, se actualiza a carga en viña del mar
        // El pedido Nro 1, se actualiza a carga en la serena
        //--------------------------------------------------------------------------
        Main.cargar_pedidos(ubicacion_actual, (byte) 0,"Viña del mar");
        Main.cargar_pedidos(ubicacion_actual, (byte) 1,"La serena");

        System.out.println("\n\n=== Ubicación actual de los pedidos ===");
        //--------------------------------------------------------------------------
        // (1) Ejemplo de actualización de pedidos
        // El pedido Nro 0, arrivó a Santiago
        // El pedido Nro 1, arrivó a Puerto Montt
        //--------------------------------------------------------------------------
        Main.actualizar_ubicacion(ubicacion_actual, (byte) 0,"Viña del mar");
        Main.actualizar_ubicacion(ubicacion_actual, (byte) 1,"La serena");

        System.out.println("\n\n=== Marcar pedido entregado ===");
        //--------------------------------------------------------------------------
        // (1) Ejemplo de actualización de pedidos
        // El pedido Nro 0, se entregó, por lo que cambia su estado a entregado
        //--------------------------------------------------------------------------
        Main.marcar_pedido_entregado(ubicacion_actual, (byte) 0,true);


    }

    public static void cargar_pedidos(String [] lista, Byte pedido, String ubicacion){
            if(lista[pedido] == null){
                lista[pedido] = ubicacion;
                System.out.println("Se ha cargado el pedido Nro (" + pedido + "), en: " + ubicacion);
            }
    }

    public static void actualizar_ubicacion(String [] lista, Byte pedido, String ubicacion){
        if(lista[pedido] != null){
            lista[pedido] = ubicacion;
            System.out.println("Se ha cargado el pedido Nro (" + pedido + "), en: " + ubicacion);
        }
    }

    public static void marcar_pedido_entregado(String [] lista, Byte pedido, Boolean estado){
        if(lista[pedido] != null){
            lista[pedido] = String.valueOf(estado);
            if( estado == true ){
                System.out.println("Pedido Nro (" + pedido + ") --> ENTREGADO ");
            }else{
                System.out.println("el pedido no ha sido entregado aun");
            }
        }
    }


}