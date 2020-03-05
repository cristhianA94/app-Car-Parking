"use strict";
module.exports = class {
    constructor(id = null, saldo, estado) {
        this.id = id;
        this.saldo = saldo;
        this.estado = estado;
    }
};