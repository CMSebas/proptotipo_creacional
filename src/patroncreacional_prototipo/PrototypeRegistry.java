/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patroncreacional_prototipo;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Sebas3101
 */
public class PrototypeRegistry {
    private static Map<String,ElementosSnake> repositorioElementos=new HashMap<>();
    private static Map<Integer, Comida> comidasClonadas = new HashMap<>();
    
    private static int contadorComidas = 0;
    private static int contadorSegmentos = 0;
    
    public static ElementosSnake getElementosSnakeClonados(String tipoElemento, int nuX, int nuY){
        ElementosSnake comidaBase=repositorioElementos.get(tipoElemento);
        
          if (comidaBase == null) {
        System.out.println("No existe un prototipo registrado con la clave: " + tipoElemento);
        return null;
          }
          
          
        ElementosSnake comidaClonada=comidaBase.clone();
        contadorComidas++; // 🔹 Cada clon suma un ID automático
        comidaClonada.setId(contadorComidas);
        comidaClonada.setX(nuX);
        comidaClonada.setY(nuY);

        // Guardar la comida clonada en un registro
        if (comidaClonada instanceof Comida) {
            comidasClonadas.put(contadorComidas, (Comida) comidaClonada);
        }
        return (ElementosSnake) comidaClonada;
    }
    public static void crearFiguraBase(){
        Comida c=new Comida(5,5);
        Snake s=new Snake(5,5);
        
        repositorioElementos.put("comidaBase", c);
        repositorioElementos.put("segmento",s);
        
        System.out.println("✅ Prototipos inicializados correctamente.");

    }
    
    public static void actualizarComidaPorId(int id, int nuevaX, int nuevaY) {
        Comida comida = comidasClonadas.get(id);

        if (comida == null) {
            System.out.println("⚠️ No existe una comida clonada con ID: " + id);
            return;
        }

        comida.setX(nuevaX);
        comida.setY(nuevaY);
        System.out.println("🔄 Comida ID " + id + " actualizada a posición (" + nuevaX + ", " + nuevaY + ")");
    }
    
}
