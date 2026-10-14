package entities;

public class PessoaFisica extends Pessoa {

    private  double gastoSaude;

    public PessoaFisica(String nome, Double renda, double gastoSaude) {
        super(nome, renda);
        this.gastoSaude = gastoSaude;
    }

    public double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    @Override
    public double imposto() {
        double imp = 0;
        if ( getRenda() < 20000){
            double impA = 0.15*getRenda();
            imp = impA;

        } else if (getRenda()>20000) {
            double impB = 0.25 * getRenda();
            imp = impB;
        }
        if (gastoSaude > 0){
            imp -= 0.5 * gastoSaude;
        }


        return imp;

    }
}
