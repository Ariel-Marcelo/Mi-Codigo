const  express = require("express"); // para recibir peticiones de la red se va a crear un servidor express
const {GraphQLSchema,GraphQLObjectType, GraphQLString, graphql, GraphQLInt} = require("graphql");// estamos importando ciertos elementos del paquete graphql que lo podemos ver en el package.jason



 
const courseType = new GraphQLObjectType({
    name: ' Course ',
    fields:{
        tittle: {type: GraphQLString},
        views:  {type: GraphQLInt}

    }
})

const schema = new GraphQLSchema ({
    query: new GraphQLObjectType({ // Dudas a las cuales puede responder 
        name: "RootQueryType",
        fields: {
            message:{
                type: GraphQLString,
                resolve(){
                    return "Hola Mundo";
                } // La función resolve nos indiva q responder al resibir el message
            },

            course: {
                type: courseType,
                resolve(){
                    return {tittle: 'Curso de GraphQL ' , views: 1000};
                }
            }
        }

    })
});

const app = express(); // importar dicho servidor 

app.get( '/', function(req,res,next){ // fundiona con una función que resive requerimientos y nos envia una respuesta
    res.send("hola Mundo" ); 
    graphql(schema, '  RootQueryType { course {tittle} } ' ).then(r => res.json(r)).catch(res.json);  // graphql es una funcion que nos permite hacer consultas a el schema y la respuesta se dera en tipo message luego se hace una promesa que se enviara la respuesta por json al navegador
   

});  // se ejecuta el servidor que es la aplicacion app donde se tiene que configurar las distintas rutas
app.listen(8080, function(){  // imprime este mensaje al acceder al local host 8080 por medio del navegador (se debe ejecutar el programa primero npm index.js)
    console.log("Servidor Inicializado")
});

