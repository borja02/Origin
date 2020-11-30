const swaggerUi = require('swagger-ui-express');
const swaggerDocument = require('swagger.json');
const api = require('./api');
api.use('/api-docs', swaggerUi.serve, swaggerUi.setup(swaggerDocument));

const port = process.env.PORT || 5000;

api.listen(port, () => {
    console.log("El servidor está inicializado en el puerto "+ port);
});

