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
public class VistaController {
    
    private final Vista vista;
    private boolean comidaInicialCreada = false;

    public VistaController(Vista vista) {
        this.vista = vista;
        
    }

    public void inicializarObjetos() {
         if (comidaInicialCreada) {
        System.out.println("⚠️ La comida inicial ya fue creada.");
        return;
    }
        
        

        // Clonar la primera comida
        ElementosSnake comida = PrototypeRegistry.getElementosSnakeClonados("comidaBase", 5, 5);
        vista.getElementosDibujables().add(comida);
        vista.actualizarDibujo();
        comidaInicialCreada = true;

       
  
        }
    
}
