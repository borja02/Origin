const Api= require('./Api');
swaggerDocument = require ('./Swagger.json');
const swaggerUi= require('swagger-ui-express');
Api.app.use('/Api-Swagger',swaggerUi.serve,swaggerUi.setup(swaggerDocument));

Api.app.listen(3000, () => {
    console.log("El servidor está inicializado en el puerto 3000");
});