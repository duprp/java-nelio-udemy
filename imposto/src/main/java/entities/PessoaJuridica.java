package entities;

public class PessoaJuridica extends Pessoa {

    private int numFunc;

    public PessoaJuridica(String nome, Double renda, int numFunc) {
        super(nome, renda);
        this.numFunc = numFunc;
    }

    public int getNumFunc() {
        return numFunc;
    }

    public void setNumFunc(int numFunc) {
        this.numFunc = numFunc;
    }

    @Override
    public double imposto() {
        double imp = 0;
        if (getNumFunc() >= 10) {

            double impA = getRenda() * 0.14;
            imp =  impA;
        }else {

            double impB = getRenda() *0.16;
            imp = impB;

        }

        return imp;
    }
}
