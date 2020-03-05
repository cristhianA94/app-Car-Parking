"use strict";
module.exports = class {
    constructor(id = null, nombre, cantidad, precio, descuento, empresaId) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.descuento = descuento;
        this.empresaId = empresaId;
    }
};