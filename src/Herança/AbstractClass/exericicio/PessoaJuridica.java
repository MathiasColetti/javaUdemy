package Herança.AbstractClass.exericicio;

public class PessoaJuridica extends Pessoa{
    Integer numeroDeFuncionarios;

    public PessoaJuridica(String nome, Double rendaAnual, Integer numeroDeFuncionarios) {
        super(nome, rendaAnual);
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    public Integer getNumeroDeFuncionarios() {
        return numeroDeFuncionarios;
    }

    public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    @Override
    public Double retornaImposto() {
        Double imposto;
        if (this.getNumeroDeFuncionarios() > 10){
            imposto = this.rendaAnual * 14/100;
        }else {
            imposto = this.rendaAnual * 16/100;
        }
        return imposto;
    }
}