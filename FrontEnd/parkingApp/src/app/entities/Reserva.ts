export class Reserva {
  id?: number;
  horaInicio: string;
  horaSalida: string;
  espacioId: number;
  tarjetaId: number;

  constructor(reserva?) {
    {
      reserva = reserva || {};
      this.id = reserva.id || '';
      this.horaInicio = reserva.horaInicio || '';
      this.horaSalida = reserva.horaSalida || '';
      this.espacioId = reserva.espacioId || '';
      this.tarjetaId = reserva.tarjetaId || '';
    }
  }
}
