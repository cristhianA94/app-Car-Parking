import { Component, OnInit, Inject } from '@angular/core';
import { MatDialogRef, MAT_DIALOG_DATA, } from '@angular/material';
import { FormGroup, FormBuilder } from '@angular/forms';
import { Reserva } from 'src/app/entities/Reserva';
import { TarjetasService } from 'src/app/shared/controllers/tarjetas/tarjetas.service';

@Component({
  selector: 'app-reserva-form',
  templateUrl: './reserva-form.component.html',
  styles: []
})
export class ReservaFormComponent implements OnInit {
  espacio: any;
  reserva: Reserva;
  reservaForm: FormGroup;
  tarjetas: any;

  constructor(
    public matDialogRef: MatDialogRef<ReservaFormComponent>,
    @Inject(MAT_DIALOG_DATA) private data: any,
    private formBuilder: FormBuilder,
    private tarjetasService: TarjetasService
  ) {
    this.espacio = data.espacio;
    this.reserva = new Reserva({});
    console.log("ReservaFormComponent -> this.espacio", this.espacio)
    this.reservaForm = this.crearReservaForm();
    this.tarjetasService.listarTarjetas()
      .subscribe(arg => this.tarjetas = arg);

  }

  ngOnInit() {
  }

  crearReservaForm(): FormGroup {
    return this.formBuilder.group({
      espacioId: [this.espacio.id],
      tarjetaId: [this.reserva.tarjetaId],
      horaInicio: [this.reserva.horaInicio],
      horaSalida: [this.reserva.horaSalida],
    });
  }

}
