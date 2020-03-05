var express = require('express');
const empresaController = require('../../interface_adapters/controllers/empresasDAOImpl');

var router = express.Router();
/**
 * Obtener todas las empresas
 */
router.get('/', function(req, res, next) {
    empresaController.obtenerEmpresas().then(empresas => {
            res.send(empresas)
        })
        .catch(err => {
            res.send(err);
        })
});
/**
 * Obtener empresa
 */
router.get('/:empresa_id', function(req, res) {
    var id = req.params.empresa_id;
    empresaController.obtenerEmpresa(id).then(empresa => {
            res.send(empresa)
        })
        .catch(err => {
            res.send(err);
        })
});
/**
 * Agregar empresa
 */
router.post('/crear', function(req, res) {
    var empresa = req.body;
    empresaController.agregarEmpresa(empresa).then(() => {
            res.send({
                mensaje: 'Creado correctamente.'
            })
        })
        .catch(err => {
            res.send(err);
        })
});
/**
 * Eliminar empresa
 */
router.get('/:empresa_id/eliminar', function(req, res) {
    var id = req.params.empresa_id;
    empresaController.eliminarEmpresa(id).then(() => {
            res.send({
                mensaje: 'Eliminado correctamente.'
            })
        })
        .catch(err => {
            res.send(err);
        })
});

/**
 * Actualizar empresa
 */
router.put('/:empresa_id/actualizar', function(req, res) {
    var obj = req.body;
    var id = req.params.empresa_id;

    empresaController.actualizarEmpresa(id, obj).then(() => {
            res.send({
                mensaje: 'Actualizado correctamente.'
            })
        })
        .catch(err => {
            res.send(err);
        })
});

module.exports = router;