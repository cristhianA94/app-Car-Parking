"use strict";

const Tarjeta = require("../../enterprise_business_rules/entities/Tarjetas");

// Reportar tarjeta Use case

// Aqui irian todos los atributos necesarios para poder hacer un reporte de tarjeta
// Utiliza un repositorio como para manejar la persistencia con las entidades

module.exports = (saldo, estado { tarjetaRepository }) => {
    const tarjeta = new Tarjeta(null, saldo, estado);
    return tarjetaRepository.update(tarjeta);
};