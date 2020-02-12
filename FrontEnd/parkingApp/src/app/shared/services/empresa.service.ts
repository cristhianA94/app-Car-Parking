import { Injectable } from '@angular/core';

// Modelo
import { Empresa } from './../../entities/Empresa';


import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class EmpresaService {
  url: 'http://localhost:8080/empresa';

  constructor(
    private http: HttpClient
  ) {

  }

  getEmpresas(): Observable<Empresa[]> {
    return this.http.get<Empresa[]>('http://localhost:8080/parqueaT/empresa');
  }

}





