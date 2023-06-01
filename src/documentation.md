## GioDrive (v.1.0)
Aplicación de control de ruta
(en esta version se soportan hasta 10 pedidos)
### Documentación

#### Variables

<ul>
    <li>
        <b>lista_pedidos</b>: lista de pedidos
    </li>
    <li>
        <b>ubicacion_actual</b>: ubicación actual del repartidor
    </li>
    <li>
        <b>mapa</b>: mapa de la zona de reparto
    </li>
    <li>
        <b>pedido_actual</b>: el pedido que está siendo atendido
    </li>
    <li>
        <b>aceptado</b>: booleano que indica si el pedido fue aceptado o rechazado
    </li>
</ul>

### Funciones

<b>Función para cargar la lista de pedidos</b>

<li>funcion cargar_pedidos():</li>
lista_pedidos = base_de_datos.obtener_pedidos_pendientes()
<br>
<br>
<b>Función para actualizar la ubicación del repartidor</b>
<li>funcion actualizar_ubicacion():</li>
ubicacion_actual = gps.obtener_ubicacion_actual()
<br>
<br>
<b>Función para mostrar el mapa con la ubicación del repartidor y los pedidos</b>
<li>funcion mostrar_mapa():</li>
mapa.mostrar_ubicacion(ubicacion_actual)
para cada pedido en lista_pedidos:
mapa.mostrar_pedido(pedido.ubicacion)
<br>
<br>
<b>Función para marcar un pedido como entregado</b>
<li>funcion marcar_pedido_entregado(pedido):</li>
base_de_datos.marcar_pedido_entregado(pedido)
lista_pedidos.remover(pedido)


(...) EN PROCESO DE IMPLEMENTACION:

// Función para aceptar orechazar un pedido
funcion aceptar_rechazar_pedido(pedido):
mostrar_mensaje("¿Desea aceptar o rechazar el pedido?")
mostrar_mensaje("1. Aceptar")
mostrar_mensaje("2. Rechazar")
respuesta = leer_entrada()
si respuesta == 1:
aceptado = Verdadero
sino:
aceptado = Falso

// Función principal de la aplicación
funcion main():
cargar_pedidos()
mientras haya pedidos en lista_pedidos:
actualizar_ubicacion()
mostrar_mapa()
si hay algún pedido cerca y pedido_actual es Nulo:
pedido_actual = pedido_mas_cercano
aceptar_rechazar_pedido(pedido_actual)
si aceptado:
ir_a(pedido_actual.ubicacion)
marcar_pedido_entregado(pedido_actual)
mostrar_mensaje("Pedido entregado!")
pedido_actual = Nulo
sino:
pedido_actual = Nulo