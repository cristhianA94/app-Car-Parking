"use strict";

const Tarjeta = require("../../enterprise_business_rules/entities/Tarjetas");

// Reportar tarjeta Use case

module.exports = (saldo, estado { tarjetaRepository }) => {
    const tarjeta = new Tarjeta(null, saldo, estado);
    return tarjetaRepository.update(tarjeta);
};