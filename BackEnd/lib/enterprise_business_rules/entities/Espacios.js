"use strict";
module.exports = class {
    constructor(id = null, estado, cubierto, empresaId) {
        this.id = id;
        this.estado = estado;
        this.cubierto = cubierto;
        this.empresaId = empresaId;
    }
};