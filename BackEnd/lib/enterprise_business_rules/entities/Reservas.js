"use strict";
module.exports = class {
    constructor(id = null, horaInicio, horaSalida, empresaId, tarjetaId) {
        this.id = id;
        this.horaInicio = horaInicio;
        this.horaSalida = horaSalida;
        this.empresaId = empresaId;
        this.tarjetaId = tarjetaId;
    }
};