'use strict';

module.exports = class {
    constructor(
        id = null,
        nombre,
        direccion,
        latitud,
        longitud,
        fraccion,
        num_espacios,
        precio,
        descuento
    ) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.fraccion = fraccion;
        this.num_espacios = num_espacios;
        this.precio = precio;
        this.descuento = descuento;
    }
};