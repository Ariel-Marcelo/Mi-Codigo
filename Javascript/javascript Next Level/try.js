function f() {
    try {
      throw "bogus";
    } catch(e) {
      console.log('caught inner "bogus"');
      throw e; // Esta sentencia throw es suspendida hasta que
               // el bloque finally se termine de ejecutar
    } finally {
      return false; // Sobreescribe la sentencia throw anterior
    }
    // "return false" es ejecutado ahora
  }
  
  try {
    f();
  } catch(e) {
    // Esta nunca es encontrada porque la sentencia throw dentro
    // del bloque catch es sobrescrita por la sentencia return
    // en el bloque finally
    console.log('caught outer "bogus"');
  }
  
  // SALIDA
  // caught inner "bogus


  // try captura un error o una sentencia enviada por throw 
  // ejecuta instrucciones, y si no puede pasa a catch donde ´e´ tiene informacion de la sentencia arrojada 
  // finally se ejecuta siempre que  una expresion sea votada en try o no se pueda ejecutar 
/*
Dependiendo del tipo de error, es posible usar el 'name' (nombre) y el 'message' (mensaje) propiedades
 para obtener un mensaje más refinado. La propiedad 'name' provee la clase general del 
 Error(por ejemplo, 'DOMException' or 'Error'), mientras que la propiedad 'message' 
 por lo general provee un breve mensaje que puede ser obtenido convirtiendo el error de object a string
*/