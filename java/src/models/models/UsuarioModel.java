package models;
public class UsuarioModel {
    private int cod_usuario;
    private String telefone;
    private String nome;
    private String cnpj;
    private String cpf;

    public UsuarioModel() {
    }

    // Construtor com todos os atributos
    public UsuarioModel(int cod_usuario, String telefone, String nome, String cnpj, String cpf) {
        this.cod_usuario = cod_usuario;
        this.telefone = telefone;
        this.nome = nome;
        this.cnpj = cnpj;
        this.cpf = cpf;
    }

    // Getters e Setters
    public int getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(int cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Método toString para imprimir os detalhes do objeto
    @Override
    public String toString() {
        return "Usuario{" +
                "cod_usuario=" + cod_usuario +
                ", telefone='" + telefone + '\'' +
                ", nome='" + nome + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
