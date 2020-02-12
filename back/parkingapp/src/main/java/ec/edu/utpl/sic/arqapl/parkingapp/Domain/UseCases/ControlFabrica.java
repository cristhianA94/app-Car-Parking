package ec.edu.utpl.sic.arqapl.parkingapp.Domain.UseCases;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import ec.edu.utpl.sic.arqapl.parkingapp.Domain.Intefaces.IMetododePago;
import ec.edu.utpl.sic.arqapl.parkingapp.Domain.Entities.Pago;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"fabrica"})
public class ControlFabrica {

    @GetMapping
    public void listar() {
        Pago fabrica = new Pago();
        IMetododePago cx1 = fabrica.metododePago("Efectivo");
        cx1.Metodo();
    }

}
