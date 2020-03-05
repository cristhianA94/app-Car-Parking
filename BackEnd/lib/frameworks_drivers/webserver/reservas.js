var express = require('express');
var router = express.Router();
var reservaController = require('../../interface_adapters/controllers/reservasDAOImpl');

/**
 * Obtener todas las reservas
 */
router.get('/', function(req, res, next) {
    reservaController.obtenerReservas().then(reservas => {
            res.send(reservas)
        })
        .catch(err => {
            res.send(err);
        })
});
/**
 * Obtener reserva
 */
router.get('/:reserva_id', function(req, res) {
    var id = req.params.reserva_id;
    reservaController.obtenerReserva(id).then(reserva => {
            res.send(reserva)
        })
        .catch(err => {
            res.send(err);
        })
});
/**
 * Agregar reserva
 */
router.post('/crear', function(req, res) {
    var reserva = req.body;
    reservaController.agregarReserva(reserva).then(() => {
            res.send({
                mensaje: 'Creado correctamente.'
            })
        })
        .catch(err => {
            res.send(err);
        })
});
/**
 * Eliminar reserva
 */
router.get('/:reserva_id/eliminar', function(req, res) {
    var id = req.params.reserva_id;
    reservaController.eliminarReserva(id).then(() => {
            res.send({
                mensaje: 'Eliminado correctamente.'
            })
        })
        .catch(err => {
            res.send(err);
        })
});

/**
 * Actualizar reserva
 */
router.put('/:reserva_id/actualizar', function(req, res) {
    var obj = req.body;
    var id = req.params.reserva_id;

    reservaController.actualizarReserva(id, obj).then(() => {
            res.send({
                mensaje: 'Actualizado correctamente.'
            })
        })
        .catch(err => {
            res.send(err);
        })
});

module.exports = router;