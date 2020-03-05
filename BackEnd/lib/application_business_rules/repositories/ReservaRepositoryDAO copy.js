"use strict";

module.exports = class {
    constructor(repository) {
        this.repository = repository;
    }

    save(reserva) {
        return this.repository.save(reserva);
    }

    update(reserva) {
        return this.repository.update(reserva);
    }

    delete(reservaId) {
        return this.repository.delete(reservaId);
    }

    get(reservaId) {
        return this.repository.get(reservaId);
    }

    getAll() {
        return this.repository.getAll();
    }
};