import { EmpresaService } from './../../shared/services/empresa.service';
import { AfterViewInit, Component, OnInit, ViewChild } from '@angular/core';
import { MatPaginator } from '@angular/material/paginator';
import { MatSort } from '@angular/material/sort';
import { MatTable } from '@angular/material/table';
import { EmpresasDataSource, EmpresasItem } from './empresas-datasource';

import { EmpresaService } from '../..//shared/services/empresa.service';


@Component({
  selector: 'app-empresas',
  templateUrl: './empresas.component.html',
  styles: [`
    .full-width-table {
      width: 100%;
    }
    
  `]
})
export class EmpresasComponent implements AfterViewInit, OnInit {

  empresas: any = []
  constructor(private empresaService:EmpresaService){

  }
  @ViewChild(MatPaginator, {static: false}) paginator: MatPaginator;
  @ViewChild(MatSort, {static: false}) sort: MatSort;
  @ViewChild(MatTable, {static: false}) table: MatTable<EmpresasItem>;
  dataSource: EmpresasDataSource;

  /** Columns displayed in the table. Columns IDs can be added, removed, or reordered. */
  displayedColumns = ['id', 'name'];

  ngOnInit() {
    this.dataSource = new EmpresasDataSource();
    this.empresaService.getEmpresas()
      .subscribe(data => { // sucess
          this.empresas = data;
          console.log(data);
        },
        (error) => {
          console.log(error);
        }
      );

  }

  ngAfterViewInit() {
    this.dataSource.sort = this.sort;
    this.dataSource.paginator = this.paginator;
    this.table.dataSource = this.dataSource;
  }
}
