package edu.open.java1.autos;


public class Predio {
    
    //ARREGLO QUE PERMITE ALMACENAMIENTO DE 10 VEHICULOS
    static VehiculoAbstract[] vehiculos = new VehiculoAbstract[10];
    
    //METODO QUE AGREGA LOS AUTOMOVILES AL PREDIO
    public static String agregarAutomovil(VehiculoAbstract vehiculo){
        for(int i = 0; i < vehiculos.length; i++){
            if(vehiculos[i] == null){
                vehiculos[i] = vehiculo;
                return "vehiculo agregado al predio con exito";
            }
        }
        return "Predio lleno, no puede agregarse vehiculo";
    }
    
    
    //METODO PARA LA VENTA DE AUTOMOVIL
    public static String VenderAutomovil(int chasis, int codigo_cliente){
        for(int i = 0; i < vehiculos.length; i++){
            if(vehiculos[i] != null){
                if(vehiculos[i].getChasis() == chasis){
                    if(vehiculos[i].getCodigo_cliente() == codigo_cliente){
                        if(vehiculos[i].getEstado() != null && vehiculos[i].getEstado().equals("vendido")){
                            return "error, automovil ya esta vendido";
                        }
                        else if(vehiculos[i].getEstado() != null && vehiculos[i].getEstado().equals("apartado")){
                            vehiculos[i].setPrecio_total(vehiculos[i].getPrecio_total() - vehiculos[i].getReserva());
                            vehiculos[i].setEstado("vendido");
                            return "automovil apartado, vendido con exito";
                        }
                        else{
                            vehiculos[i].setEstado("vendido");
                            return "automovil vendido con exito";
                        }
                    }
                    else if(vehiculos[i].getCodigo_cliente() != codigo_cliente && vehiculos[i].getCodigo_cliente() != -1)
                        return "automovil ya esta apartado por el codigo de cliente " + vehiculos[i].getCodigo_cliente();
                }
                if(vehiculos[i].getChasis() == chasis && vehiculos[i].getCodigo_cliente() == -1){
                    if(vehiculos[i].getEstado() != null && vehiculos[i].getEstado().equals("vendido")){
                        return "error, automovil ya esta vendido";
                    }
                    else{
                        vehiculos[i].setEstado("vendido");
                        return "automovil vendido con exito";
                    }
                }
            }
        }
        return "automovil no existe";
    }
    
    
    //METODO PARA APARTAR AUTOMOVIL
    public static String ApartarAutomovil(int chasis, double reserva, int codigo_cliente){
        for(int i = 0; i < vehiculos.length; i++){
            if(vehiculos[i] != null){
                if(vehiculos[i].getChasis() == chasis){
                    if(vehiculos[i].getEstado() != null && vehiculos[i].getEstado().equals("vendido")){
                        return "error, automovil ya esta vendido";
                    }
                    else{
                        double reserva_minima = vehiculos[i].getPrecio_total() * 0.05;
                        if(reserva >= reserva_minima){
                            vehiculos[i].setReserva(reserva);
                            vehiculos[i].setEstado("apartado");
                            vehiculos[i].setCodigo_cliente(codigo_cliente);
                            return "automovil apartado";
                        }
                        else return "no se puede apartar automovil porque no cumple con un minimo de reserva del 5% = " + reserva_minima;
                    }
                }
            }
        }
        return "automovil no existe";
    }
    
    //MOSTRAR VEHICULOS VENDIDOS
    public static void VehiculosVendidos(){
        for(int i = 0; i < vehiculos.length; i++){
            if(vehiculos[i] != null){
                if(vehiculos[i].getEstado() != null && vehiculos[i].getEstado().equals("vendido"))
                    System.out.println(vehiculos[i].mostrarAutomovil());
            }
        }
    }
    
    //MOSTRAR VEHICULOS APARTADOS
    public static void VehiculosApartados(){
        for(int i = 0; i < vehiculos.length; i++){
            if(vehiculos[i] != null){
                if(vehiculos[i].getEstado() != null && vehiculos[i].getEstado().equals("apartado"))
                    System.out.println(vehiculos[i].mostrarAutomovil());
            }
        }
    }
    
    
    public static void main(String[] args){
        
        //INCISO 1
        //CREACION DE 3 AUTOMOVILES
        Automovil automovil1 = new Automovil("tercel", 100001, 1995, "Toyota", 20500.00);
        Automovil automovil2 = new Automovil("alto", 100002, 2012, "Suzuki", 34990.00);
        Automovil automovil3 = new Automovil("lancer", 100003, 2010, "Mitsubishi", 45650.00);
        System.out.println("1. Creacion de 3 automoviles finalizada");
        
        //INCISO 2
        //CREACION DE 3 IMPORTADOS
        Importado importado1 = new Importado("santa fe", 200001, 2009, "Hyundai", 60499.99, 269.80);
        Importado importado2 = new Importado("corolla", 200002, 2011, "Toyota", 87000.00, 1700.60);
        Importado importado3 = new Importado("maruti", 200003, 1999, "Suzuki", 14600.40, 143.20);
        System.out.println("2. Creacion de 3 importados finalizada");
             
        //INCISO 3
        //CREACION DE 3 A CONSIGNACION
        Consignacion consignado1 = new Consignacion("yaris", 300001, 2015, "Toyota", 58940.00);
        Consignacion consignado2 = new Consignacion("picanto", 300002, 2008, "Kia", 26000.00);
        Consignacion consignado3 = new Consignacion("civic", 300003, 2001, "Honda", 45099.99);
        System.out.println("3. Creacion de 3 a consignacion finalizada");
        
        //INCISO 4
        //CAMBIO DE PORCENTAJE DE IVA DE UN AUTOMOVIL
        automovil2.CambiarIva(0.09);
        System.out.println("4. Porcentaje de iva cambiado al automovil\n\t\t-> " + automovil2.mostrarAutomovil());
        
        //INCISO 5
        //AGREGAR TODOS LOS AUTOMOVILES AL PREDIO
        agregarAutomovil(automovil1);
        agregarAutomovil(automovil2);
        agregarAutomovil(automovil3);
        
        agregarAutomovil(importado1);
        agregarAutomovil(importado2);
        agregarAutomovil(importado3);
        
        agregarAutomovil(consignado1);
        agregarAutomovil(consignado2);
        agregarAutomovil(consignado3);
        System.out.println("5. Automoviles agregados al predio con exito");

        
        //INCISO 6
        //APARTAR UN AUTOMOVIL
        System.out.println("6. " + ApartarAutomovil(100003, 2556.4, 10));
        
        //INCISO 7
        //APARTAR UN IMPORTADO
        System.out.println("7. " + ApartarAutomovil(200002, 4957.1, 11));
        
        //INCISO 8
        //APARTAR UNO A CONSIGNACION
        System.out.println("8. " + ApartarAutomovil(300001, 3310, 12));
        
        //INCISO 9
        //VENDER EL MISMO AUTOMOVIL
        VenderAutomovil(100001, 13);
        System.out.println("9. " + VenderAutomovil(100001, 13));
        
        //INCISO 10
        //VENTA DE OTRO QUE NO SEA EL APARTADO DE IMPORTADO
        System.out.println("10. " + VenderAutomovil(200001, 14));
        
        //INCISO 11
        //VENTA DE OTRO QUE NO SEA EL APARTADO DE CONSIGNACION
        System.out.println("11. " + VenderAutomovil(300003, 15));
        
        //INCISO 12
        //INTENTO DE VENDER VEHICULO YA APARTADO POR OTRO CLIENTE
        System.out.println("12 " + VenderAutomovil(300001, 10));   //automovil apartado en el inciso 8
        
        //INCISO 13
        //VENDER UN VEHICULO APARTADO POR EL CLIENTE
        System.out.println("13. " + VenderAutomovil(200002, 11));
        
        System.out.println();
        
        //INCISO 14
        //LISTADO DE VEHICULOS VENDIDOS DEL PREDIO
        System.out.println("14. -----VEHICULOS VENDIDOS-----");
        VehiculosVendidos();
        
        System.out.println();
        System.out.println();
        
        //INCISO 15
        //LISTADO DE VEHICULOS APARTADOS DEL PREDIO
        System.out.println("15. -----VEHICULOS APARTADOS-----");
        VehiculosApartados();
    }
}
