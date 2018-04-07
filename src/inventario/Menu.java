/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

/**
 *
 * @author Brenda
 */
public class Menu {
    private static Menu menu;
    private String productos;
    
    Menu(){
}
    public static Menu getInstance(){
        if (menu == null){
            menu = new Menu();
        }
        return menu;
    }
    
    public void opciones(){
        System.out.println("------MENU------");
        System.out.println("1. Agregar producto");
        System.out.println("2. Eliminar producto");
        System.out.println("3. Modificar producto");
        System.out.println("4. Cargar");
        System.out.println("5. Descargar");
        System.out.println("6. Descartar");
        System.out.println("7. Salir");
    }
    
        

    }



