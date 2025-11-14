/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patroncreacional_prototipo;

/**
 *
 * @author Sebas3101
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PrototypeRegistry.crearFiguraBase();
        testClonarComida();
      
       
        
    }
    
    public static void testClonarComida(){
        ElementosSnake comida1 = PrototypeRegistry.getElementosSnakeClonados("comidaBase", 0, 10, 10);
        ElementosSnake comida2 = PrototypeRegistry.getElementosSnakeClonados("comidaBase", 1, 10, 10);
        
        System.out.println("Forma"+comida1.getTipoElemento());
        comida1.dibujar();
        comida2.dibujar();
      
        //  Actualizar una comida (simula botón “Actualizar”)
        System.out.println("\n--- Simulando botón 'Actualizar' ---");
        PrototypeRegistry.actualizarComidaPorId(2, 20, 25);

        //  Mostrar todas las comidas después de actualizar
        
        
    }
    
}
