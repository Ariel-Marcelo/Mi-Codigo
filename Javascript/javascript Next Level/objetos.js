var miObjeto = new Object(),
    cadena = "miCadena",
    aleatorio = Math.random(),
    objeto = new Object(),
    aver = objeto.toString();
    console.log(aver);

miObjeto.type                 = "Sintaxis con punto";
miObjeto["Fecha de creación"] = "Cadena con espacios y acento";
miObjeto[cadena]              = "String value";
miObjeto[aleatorio]           = "Número Aleatorio";
miObjeto[objeto]              = "Objeto";
miObjeto[""]                  = "Incluso una cadena vacía";

console.log(miObjeto);

const object = { a: 1, b: 2, c: 3 };

for (const ñ in miObjeto) {
  console.log(`${ñ}: ${miObjeto[ñ]}`);
}