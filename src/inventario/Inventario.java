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
public class Inventario {
    private String productos,proveedores, telefono;
    private int cantidad, facturas;
    private double costo;
    
    public Inventario(){}
 
    public Inventario(String productos, String proveedores, int cantidad, double costo, int facturas, String telefono){
        this.productos = productos;
        this.proveedores = proveedores;
        this.cantidad = cantidad;
        this.costo = costo;
        this.facturas = facturas;
        this.telefono = telefono;
            }
    public String getProductos(){
        return productos;
    }
    public void setProductos(String productos){
        this.productos = productos;
    }
    public String getProveedores(){
        return proveedores;
    }
    public void setProveedores(String proveedores){
        this.proveedores = proveedores;
    }
    public int getCantidad(){
        return cantidad;
    }
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    public double getCosto(){
        return costo;
    }
    public void setCosto(double costo){
        this.costo = costo;
    }
    public int getFacturas(){
        return facturas;
    }
    public void setFacturas(int facturas){
        this.facturas = facturas;
    }
    public String getTelefono(){
     return telefono;   
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    @Override
    public String toString(){
        String mensaje = "El producto es: "+ productos + " " + "Proveedor: " + proveedores + " " + "Cantidad: " + cantidad + " " + "Costo: " + costo + " " + "Factura no: " + facturas + " " + "Telefono: " + telefono;
        return mensaje;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Login v = new Login();
        v.setVisible(true);
        
        Inventario inv1 = new Inventario(); 
        Inventario inv2 = new Inventario("cereal","Kellogs",20,3.2,1223,"21212121");
        Inventario inv3 = new Inventario("leche","Sula",50,2,1224,"25252525");
        Inventario inv4 = new Inventario("galletas","Beroky",35,2.5,1225,"77777777");
        Inventario inv5 = new Inventario("chocolate","Sole",10,1.2,1226,"12121212");
        
        //inv2.setProductos("azucar");
        
        Menu menu = new Menu();
        menu.opciones();
        
        System.out.println(inv2.toString());
        System.out.println(inv3.toString());
        System.out.println(inv4.toString());
        System.out.println(inv5.toString());
        
        
    }
    
    
}
