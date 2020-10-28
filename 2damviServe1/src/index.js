const express = require("express");
const bodyParser = require('body-parser');
const app = express();

app.use(bodyParser.urlencoded({ extended: false }));
app.use(bodyParser.json());

let jugador = {
 nombre:'',
 apellido: '',
 score: ''
};

let respuesta = {
 error: false,
 codigo: 200,
 mensaje: ''
};

app.get('/', function(req, res) {
 respuesta = {
  error: true,
  codigo: 200,
  mensaje: 'Punto de inicio'
 };
 res.send(respuesta);
});


app.post('/gamer', function (req, res) {
    if (req.body.nombre== "" || req.body.apellido == "" || req.body.score == "")
    {
        respuesta = {
            error: true,
            codigo: 502,
            mensaje: 'El campo nombre, apellido y score son requeridos'
        };
    }
    else 
    {
        if(jugador.nombre!= "" || jugador.apellido!= "" || jugador.score != "")
        respuesta = {
            error: true,
            codigo: 503,
            mensaje: 'El jugador ya fue creado previamente'
        };   
        else{
            jugador = {
                nombre : req.params.nombre,
                apellido: req.params.apellido,
                score: req.params.score
            };
            respuesta = {
                error: false,
                codigo: 200,
                mensaje: 'Jugador creado',
                jugador: jugador
            };
        }
    }
    res.send(respuesta);
});
app.listen(3000, () => {
    console.log("El servidor está inicializado en el puerto 3000");
});


