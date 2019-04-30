package Hotel;


public class Quarto {

protected String nomeLocatario;
protected int numerodePessoas=0;
protected float valorDiaria=0;
protected double valorDevido;

public void Quarto(String nomeLocatario, int numerodePessoas,
                float valorDiaria, double valorDevido)
        {

            setNomeLocatario(nomeLocatario);
            setNumerodePessoas(numerodePessoas);
            setValorDiaria(valorDiaria);
            setValorDevido(valorDevido);
        }

    public String getNomeLocatario()
    {
        return this.nomeLocatario;
    }
    public void setNomeLocatario(String nomeLocatario) {

        this.nomeLocatario = nomeLocatario;
    }
    private void setValorDiaria(float valorDiaria) {
       if(valorDiaria > 0)
         this.valorDiaria=valorDiaria;
    }
    public float getValorDiaria()
    {
        return this.valorDiaria;
    }
    public int getNumerodePessoas()
    {
        return this.numerodePessoas;
    }
    private void setNumerodePessoas(int numerodePessoas) {
        if(numerodePessoas > 0)
            this.numerodePessoas=numerodePessoas;
    }
    public double getValorDevido( double valorDevido){
        return valorDevido;
    }
    private void setValorDevido(double valorDevido) {
        this.valorDevido=valorDevido;
    }

}
