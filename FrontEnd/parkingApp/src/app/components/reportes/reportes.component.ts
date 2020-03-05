import { Tarjetas } from './../../entities/Tarjetas';
import { Component, OnInit } from '@angular/core';
import { TarjetasService } from 'src/app/shared/controllers/tarjetas/tarjetas.service';

@Component({
  selector: 'app-reportes',
  templateUrl: './reportes.component.html',
  styles: []
})
export class ReportesComponent implements OnInit {
  tarjetas: Tarjetas[];
  tarjeta: Tarjetas;
  mostrar = false;

  constructor(private tarjetasService: TarjetasService) {
    this.tarjetasService.listarTarjetas()
      .subscribe(arg => this.tarjetas = arg);
  }

  ngOnInit() {

  }

  mostrarVista(tarjetaId) {
    this.tarjetas.forEach(element => {
      if (element.id == tarjetaId) {
        this.tarjeta = element;
      }

    });
    this.mostrar = true;
    console.log("ReportesComponent -> mostrarTarjeta -> this.tarjeta", this.tarjeta)
  }

  actualizarTarjeta(tarjeta) {
    this.tarjeta.estado = 0;
    this.tarjetasService.actualizarTarjeta(tarjeta).subscribe(res => console.log(res), error => console.log(error as any));
  }

}
