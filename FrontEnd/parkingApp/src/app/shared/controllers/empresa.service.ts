import { Global } from './global';
import { Injectable } from '@angular/core';

// Modelo
import { Empresa } from '../../entities/Empresa';


import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class EmpresaService {
  public url: string;
  public empresaSeleccionada: Empresa;
  public empresas: Empresa[];

  constructor(private http: HttpClient) {
    this.empresaSeleccionada = new Empresa();
    this.url = Global.url;

  }

  registrarEmpresa(empresas: Empresa): Observable<any> {
    const params = JSON.stringify(empresas);
    const headers = new HttpHeaders().set('Content-Type', 'application/json');

    return this.http.post(this.url + 'empresas', params, { headers });
  }

  listarEmpresas(): Observable<any> {
    const headers = new HttpHeaders().set('Content-Type', 'application/json');

    return this.http.get(this.url + 'empresas', { headers });
  }

  actualizarEmpresa(empresas: Empresa): Observable<any> {
    const params = JSON.stringify(empresas);
    const headers = new HttpHeaders().set('Content-Type', 'application/json');

    return this.http.put(this.url + `empresas/${empresas.id}`, params, { headers });
  }

  eliminarEmpresa(idEmpresa: number) {
    const headers = new HttpHeaders().set('Content-Type', 'application/json');

    return this.http.delete(this.url + `empresas/${idEmpresa}`, { headers });
  }

}





