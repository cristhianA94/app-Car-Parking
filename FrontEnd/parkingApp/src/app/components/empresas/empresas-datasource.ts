import { Observable, of as observableOf, merge } from 'rxjs';
import { map } from 'rxjs/operators';

import { DataSource } from '@angular/cdk/collections';
import { MatPaginator } from '@angular/material/paginator';
import { MatSort } from '@angular/material/sort';

import { Empresa } from './../../entities/Empresa';
import { EmpresaService } from './../../shared/services/empresa.service';
 
export class EmpresasDataSource extends DataSource<Empresa> {
  dataEmpresa: Empresa[] = [];

  constructor(
    public paginator: MatPaginator,
    public sort: MatSort,
    public empresaService: EmpresaService
    ) {
    super();
  }

  /**
   * Conectar esta fuente de datos a la tabla.
   * La tabla sólo se actualizará cuando la secuencia devuelta emita nuevos elementos.
   * @returns A stream of the items to be rendered.
   */
  connect(): Observable<Empresa[]> {
    // Obtiene los datos de las empresas
    const empresas: Observable<Empresa[]> = this.empresaService.getEmpresas()
    .pipe(map( data => {
      this.dataEmpresa = data;
      this.paginator.length = this.dataEmpresa.length;
      return data;
      }));

    //Combina todo lo que afecta a los datos renderizados en un flujo
    // de actualización para que la tabla de datos se consuma.
    const dataMutations = [
      empresas,
      this.paginator.page,
      this.sort.sortChange
    ];

    return merge(...dataMutations).pipe(map(() => {
      return this.getPagedData(this.getSortedData([...this.dataEmpresa]));
    }));
  }

  /**
   *  Called when the table is being destroyed. Use this function, to clean up
   * any open connections or free any held resources that were set up during connect.
   */
  disconnect() {}

  /**
   * Paginate the data (client-side). If you're using server-side pagination,
   * this would be replaced by requesting the appropriate data from the server.
   */
  private getPagedData(data: Empresa[]) {
    const startIndex = this.paginator.pageIndex * this.paginator.pageSize;
    return data.splice(startIndex, this.paginator.pageSize);
  }

  /**
   * Sort the data (client-side). If you're using server-side sorting,
   * this would be replaced by requesting the appropriate data from the server.
   */
  private getSortedData(data: Empresa[]) {
    if (!this.sort.active || this.sort.direction === '') {
      return data;
    }

    return data.sort((a, b) => {
      const isAsc = this.sort.direction === 'asc';
      switch (this.sort.active) {
        case 'id': return compare(+a.id, +b.id, isAsc);
        case 'nombre': return compare(a.nombre, b.nombre, isAsc);
        default: return 0;
      }
    });
  }
}

/** Simple sort comparator for example ID/Name columns (for client-side sorting). */
function compare(a, b, isAsc) {
  return (a < b ? -1 : 1) * (isAsc ? 1 : -1);
}
