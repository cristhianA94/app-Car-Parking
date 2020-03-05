var models = require("../../frameworks_drivers/database/models");

// const CreateReserva = require('../../application_business_rules/use_cases/Reservar_Espacio')

// const UserRepositoryInMemory = require('../storage/UserRepositoryInMemory');
// const userRepository = new UserRepository(new UserRepositoryInMemory());

/*
module.exports = {

  async createUser(request) {

    // Input
    const { firstName, lastName, email, password } = request.payload;

    // Treatment
    const user = await CreateUser(firstName, lastName, email, password, { userRepository });
*/

exports.agregarReserva = function(reserva) {
    return new Promise(function(resolve, reject) {
        models.reservas
            .create({
                horaInicio: reserva.horaInicio,
                horaSalida: reserva.horaSalida,
                tarjetaId: reserva.tarjetaId,
                empresaId: reserva.empresaId
            })
            .then(res => {
                resolve(res);
            })
            .catch(err => {
                reject(err);
            });
    });
};

exports.eliminarReserva = function(id) {
    return new Promise(function(resolve, reject) {
        models.reservas
            .destroy({
                where: {
                    id
                }
            })
            .then(res => {
                resolve(res);
            })
            .catch(err => {
                reject(err);
            });
    });
};

exports.obtenerReservas = function() {
    return new Promise(function(resolve, reject) {
        models.reservas
            .findAll({})
            .then(res => {
                resolve(res);
            })
            .catch(err => {
                reject(err);
            });
    });
};

exports.obtenerReserva = function(id) {
    return new Promise(function(resolve, reject) {
        models.reservas
            .findAll({
                where: {
                    id
                }
            })
            .then(res => {
                resolve(res);
            })
            .catch(err => {
                reject(err);
            });
    });
};

exports.actualizarReserva = function(id, obj) {
    return new Promise(function(resolve, reject) {
        models.reservas
            .update({
                empresaId: obj.empresaId,
                tarjetaId: obj.tarjetaId,
                horaInicio: obj.horaInicio,
                horaSalida: obj.horaSalida
            }, {
                where: {
                    id
                }
            })
            .then(res => {
                resolve(res);
            })
            .catch(err => {
                reject(err);
            });
    });
};