package Herança.AbstractClass.exericicio;

public class PessoaFisica extends Pessoa {
    public Double gastosComSaude;

    public PessoaFisica(String nome, Double rendaAnual, Double gastosComSaude) {
        super(nome, rendaAnual);
        this.gastosComSaude = gastosComSaude;
    }

    public Double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(Double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }

    @Override
    public Double retornaImposto() {
        Double resultado;
        if (this.getRendaAnual() < 20000){
            resultado = (this.getRendaAnual() * ( (double) 15 / 100) - (this.getGastosComSaude() * ( (double) 50 / 100)));
        }else {
           resultado = (this.getRendaAnual() * ( (double)25 / 100) - (this.getGastosComSaude() * ( (double) 50 / 100)));
        }
        return resultado;
    }


}
