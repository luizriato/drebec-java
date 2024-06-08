package controllers;
import models.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FonteDeEnergiaController {

    @GetMapping("/mostrarFontesDeEnergia")
    @ResponseBody
    public TipoDeEnergiaModel[] mostrarFontesDeEnergia() {
        // Aqui você deve implementar a lógica para recuperar e retornar as fontes de energia
        // Por enquanto, vamos criar um array de exemplo para fins ilustrativos
        TipoDeEnergiaModel[] fontesDeEnergia = {
            new TipoDeEnergiaModel("Solar"),
            new TipoDeEnergiaModel("Eólica"),
            new TipoDeEnergiaModel("Hidrelétrica"),
            new TipoDeEnergiaModel("Biomassa"),
            // Adicione outras fontes de energia conforme necessário
        };
        return fontesDeEnergia;
    }
}

