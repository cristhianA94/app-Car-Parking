import { Injectable } from '@angular/core';

// Modelo
import { Global } from '../global';
import { Tarjetas } from 'src/app/entities/Tarjetas';

import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class TarjetasService {
  public url: string;
  public tarjetaSeleccionada: Tarjetas;
  public tarjetas: Tarjetas[];

  constructor(private http: HttpClient) {
    this.tarjetaSeleccionada = new Tarjetas();
    this.url = Global.url;

  }

  registrarTarjeta(tarjetas: Tarjetas): Observable<any> {
    const params = JSON.stringify(tarjetas);
    const headers = new HttpHeaders().set('Content-Type', 'application/json');

    return this.http.post(this.url + 'tarjetas/crear', params, { headers });
  }

  listarTarjetas(): Observable<any> {
    const headers = new HttpHeaders().set('Content-Type', 'application/json');

    return this.http.get(this.url + 'tarjetas', { headers });
  }

  actualizarTarjeta(tarjetas: Tarjetas): Observable<any> {
    console.log(tarjetas);
    
    const params = JSON.stringify(tarjetas);
    const headers = new HttpHeaders().set('Content-Type', 'application/json');

    return this.http.put(this.url + `tarjetas/${tarjetas.id}/actualizar`, params, { headers });
  }

  eliminarTarjeta(idTarjeta: number) {
    const headers = new HttpHeaders().set('Content-Type', 'application/json');

    return this.http.delete(this.url + `tarjetas/${idTarjeta}/eliminar`, { headers });
  }

}





