package controllers;
import models.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/cadastro")
public class CadastroController {

    @PostMapping("/cadastrarEmpresa")
    @ResponseBody
    public String cadastrarEmpresa(@RequestBody EmpresaModel empresaModel) {
        // Lógica para cadastrar a empresa
        return "Empresa cadastrada com sucesso!";
    }

    @PostMapping("/cadastrarPessoaFisica")
    @ResponseBody
    public String cadastrarPessoaFisica(@RequestBody UsuarioModel usuarioModel) {
        // Lógica para cadastrar a pessoa física
        return "Pessoa física cadastrada com sucesso!";
    }
}

