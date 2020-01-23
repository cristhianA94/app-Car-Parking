import { Injectable } from '@angular/core';

// Modelo
import { Empresa } from './../../models/Empresa';


import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class EmpresaService {
  url: 'http://localhost:8080/personas';

  constructor(
    private http: HttpClient
  ) {

  }

  getEmpresas(): Observable<Empresa[]> {
    return this.http.get<Empresa[]>('http://localhost:8080/personas');
  }

}





