export class Empresa {

  constructor(id?: number, nombre = '', direccion = '', latitud = null, longitud = null,
    num_espacios = null, fraccion = '', precio = null, descuento = null) {
    this.id = id;
    this.nombre = nombre;
    this.direccion = direccion;
    this.latitud = latitud;
    this.longitud = longitud;
    this.num_espacios = num_espacios;
    this.fraccion = fraccion;
    this.precio = precio;
    this.descuento = descuento;
  }

  id?: number;
  nombre: string;
  direccion: string;
  latitud: number;
  longitud: number;
  num_espacios: number;
  fraccion: string;
  precio: number;
  descuento: number;
}
