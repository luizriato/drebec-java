package models;
public class TiposDeEnergiaModel {
    private String cnpj;
    private String descricaoEnergia;
    private int codTipoEnergia;
    private String nomeEnergia;

    // Liga um objeto do tipo de Energia a um objeto empresa.
    private EmpresaModel empresa;

    public TiposDeEnergiaModel() {
    }

    // Construtor com todos os atributos
    public TiposDeEnergiaModel(String cnpj, String descricaoEnergia, int codTipoEnergia, String nomeEnergia) {
        this.cnpj = cnpj;
        this.descricaoEnergia = descricaoEnergia;
        this.codTipoEnergia = codTipoEnergia;
        this.nomeEnergia = nomeEnergia;
    }

    // Getters e Setters
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getDescricaoEnergia() {
        return descricaoEnergia;
    }

    public void setDescricaoEnergia(String descricaoEnergia) {
        this.descricaoEnergia = descricaoEnergia;
    }

    public int getCodTipoEnergia() {
        return codTipoEnergia;
    }

    public void setCodTipoEnergia(int codTipoEnergia) {
        this.codTipoEnergia = codTipoEnergia;
    }

    public String getNomeEnergia() {
        return nomeEnergia;
    }

    public void setNomeEnergia(String nomeEnergia) {
        this.nomeEnergia = nomeEnergia;
    }

    public EmpresaModel getEmpresa() {
        return empresa;
    }

    public void setCnpj(EmpresaModel empresa) {
        this.empresa = empresa;
    }

    // Método toString para imprimir os detalhes do objeto
    @Override
    public String toString() {
        return "TiposDeEnergia{" +
                "cnpj='" + cnpj + '\'' +
                ", descricaoEnergia='" + descricaoEnergia + '\'' +
                ", codTipoEnergia=" + codTipoEnergia +
                ", nomeEnergia='" + nomeEnergia + '\'' +
                '}';
    }
}
