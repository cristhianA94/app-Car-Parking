"use strict";
module.exports = class {
    constructor(id = null, valor, empresaId, tarjetaId) {
        this.id = id;
        this.valor = valor;
        this.empresaId = empresaId;
        this.tarjetaId = tarjetaId;
    }
};