"use strict";

const Reserva = require("../../enterprise_business_rules/entities/Reservas");

// Reservar_Espacio Use case

// Aqui irian todos los atributos necesarios para poder hacer una reserva
// Utiliza un repositorio como para manejar la persistencia con las entidades

module.exports = (horaInicio, horaSalida, tarjetaId, espacioId, { reservaRepository }) => {
    const reserva = new Reserva(null, horaInicio, horaSalida, tarjetaId, espacioId);
    //Aqui llamas a los metodos del repositorio (guardar reserva, eliminar reserva...)
    return reservaRepository.save(reserva);
};