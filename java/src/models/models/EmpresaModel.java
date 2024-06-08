package models;
public class EmpresaModel {
    private int cod_usuario;
    private String cep;
    private String email;
    private String tel;
    private String rua_endereco;
    private String cnpj;
    private String complemento;

    
    public EmpresaModel() {
    }

    // Construtor com todos os atributos
    public EmpresaModel(int cod_usuario, String cep, String email, String tel, String rua_endereco, String cnpj, String complemento) {
        this.cod_usuario = cod_usuario;
        this.cep = cep;
        this.email = email;
        this.tel = tel;
        this.rua_endereco = rua_endereco;
        this.cnpj = cnpj;
        this.complemento = complemento;
    }

    // Getters e Setters
    public int getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(int cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getRua_endereco() {
        return rua_endereco;
    }

    public void setRua_endereco(String rua_endereco) {
        this.rua_endereco = rua_endereco;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    // Método toString para imprimir os detalhes do objeto
    @Override
    public String toString() {
        return "Empresa{" +
                "cod_usuario=" + cod_usuario +
                ", cep='" + cep + '\'' +
                ", email='" + email + '\'' +
                ", tel='" + tel + '\'' +
                ", rua_endereco='" + rua_endereco + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", complemento='" + complemento + '\'' +
                '}';
    }
}
