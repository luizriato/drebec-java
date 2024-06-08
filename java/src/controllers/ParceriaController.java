package controllers;
import models.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ParceriaController {

    @PostMapping("/solicitarParceria")
    @ResponseBody
    public String solicitarParceria(@RequestBody EmpresaModel empresaModel) {
        // Lógica para processar a solicitação de parceria com a empresa
        // Aqui você pode realizar qualquer operação necessária, como salvar os detalhes da solicitação no banco de dados
        return "Estamos analisando sua solicitação e entraremos em contato em breve";
    }
}

