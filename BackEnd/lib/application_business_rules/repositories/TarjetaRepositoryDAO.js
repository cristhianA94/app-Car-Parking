"use strict";

module.exports = class {
    constructor(repository) {
        this.repository = repository;
    }

    save(tarjeta) {
        return this.repository.save(tarjeta);
    }

    update(tarjeta) {
        return this.repository.update(tarjeta);
    }

    delete(tarjetaId) {
        return this.repository.delete(tarjetaId);
    }

    get(tarjetaId) {
        return this.repository.get(tarjetaId);
    }

    getAll() {
        return this.repository.getAll();
    }
};