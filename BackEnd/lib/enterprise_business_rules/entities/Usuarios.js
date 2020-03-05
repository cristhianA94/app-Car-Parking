"use strict";
module.exports = class {
    constructor(id = null, ip, tarjetaId) {
        this.id = id;
        this.ip = ip;
        this.tarjetaId = tarjetaId;
    }
};