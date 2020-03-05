"use strict";
module.exports = class {
    constructor(id = null, horaInicio, horaSalida, espacioId, tarjetaId) {
        this.id = id;
        this.horaInicio = horaInicio;
        this.horaSalida = horaSalida;
        this.espacioId = espacioId;
        this.tarjetaId = tarjetaId;
    }
};