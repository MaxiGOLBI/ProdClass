package product.pkgclass;

public class Mainclass {
    public static void main(String[] args) {
        // Crear new product
        ProductClass producto = new ProductClass("Placa de video 3050", 250.0, 10);

        // Muestra los valores con los getters
        System.out.println("Valores iniciales del producto:");
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Precio: $" + producto.getPrecio());
        System.out.println("Cantidad: " + producto.getCantidad());

        // Modifica los valores utilizando setters
        producto.setPrecio(285.0);
        producto.setCantidad(15);

        // Mostrar los nuevos valores utilizando getters
        System.out.println("\nValores modificados del producto:");
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Precio: $" + producto.getPrecio());
        System.out.println("Cantidad: " + producto.getCantidad());

        // Intentar establecer un precio y una cantidad negativos
        producto.setPrecio(-100.0); 
        producto.setCantidad(-5);   
        // Mostrar los valores después de los intentos fallidos (si es que se pone una cantidad negativa)
        System.out.println("\nValores después de intentar establecer negativos:");
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Precio: $" + producto.getPrecio());
        System.out.println("Cantidad: " + producto.getCantidad());
    }
}

