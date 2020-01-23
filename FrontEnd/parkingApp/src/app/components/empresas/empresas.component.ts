import { Empresa } from './../../models/Empresa';
import { AfterViewInit, Component, OnInit, ViewChild } from '@angular/core';
import { MatPaginator } from '@angular/material/paginator';
import { MatSort } from '@angular/material/sort';
import { MatTable } from '@angular/material/table';

import { EmpresasDataSource } from './empresas-datasource';
import { EmpresaService } from '../..//shared/services/empresa.service';


@Component({
  selector: 'app-empresas',
  templateUrl: './empresas.component.html',
  styles: [
    `
    .full-width-table {
      width: 100%;
    }
    mat-card{
      height: 100%;
    }
    `
  ]
})
export class EmpresasComponent implements AfterViewInit, OnInit {

  empresas: any = []
  constructor(private empresaService: EmpresaService) {}
  @ViewChild(MatPaginator, { static: false }) paginator: MatPaginator;
  @ViewChild(MatSort, { static: false }) sort: MatSort;
  @ViewChild(MatTable, { static: false }) table: MatTable<Empresa>;
  dataSource: EmpresasDataSource;

  /** Columns displayed in the table. Columns IDs can be added, removed, or reordered. */
  //displayedColumns = ['id', 'nombre', 'direccion', 'latitud', 'longitud', 'num_espacios', 'fraccion', 'precio', 'descuento'];
  displayedColumns = ['id', 'nombre'];

  ngOnInit() {
    this.dataSource = new EmpresasDataSource(this.paginator, this.sort, this.empresaService);

  }

  ngAfterViewInit() {
    //this.dataSource.sort = this.sort;
    //this.dataSource.paginator = this.paginator;
    this.table.dataSource = this.dataSource;
  }
}
