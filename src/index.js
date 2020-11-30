
const express = require("express");
const bodyParser = require("body-parser");
const app = express()
const swaggerUi = require('swagger-ui-express');
const swaggerDocument = require('./swagger.json');
const apijs = require('./api');
app.use(bodyParser.urlencoded({ extended: false }));
app.use(bodyParser.json());
app.use('/api-docs', swaggerUi.serve, swaggerUi.setup(swaggerDocument));

const port = process.env.PORT || 5000;

app.listen(port, () => {
    console.log("El servidor está inicializado en el puerto "+ port);
});

