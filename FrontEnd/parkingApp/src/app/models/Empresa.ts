export interface Empresa {
  id: number;
  nombre: string;
  direccion: string;
  latitud: string;
  longitud: string;
  num_espacios: number;
  fraccion: string;
  precio: number;
  descuento: number;
}



/*

displayedColumns = ['id', 'nombre', 'direccion', 'latitud', 'longitud', 'num_espacios', 'fraccion', 'precio', 'descuento'];


this.empresaService.getEmpresas()
      .subscribe(data => { // sucess
          this.empresas = data;
          console.log(data);
        },
        (error) => {
          console.log(error);
        }
      );

*/