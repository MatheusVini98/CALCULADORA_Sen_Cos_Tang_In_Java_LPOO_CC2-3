package Modelo;

public class Validacao extends absPropriedades
{

    public Validacao(String numero)
    {
        super(numero);
        executar();
    }
    
    public void executar()
    {
        this.setMensagem("");
        try
        {
            this.setN1(Double.parseDouble(this.getNumero()));
            if (this.getN1()< 0)
                this.setMensagem("Digite apenas ângulos positivos");
            else 
                if
                    (this.getN1()> 360)        
                     this.setMensagem("Digite um ângulo menor que 360° graus");           
        }                        
        catch (Exception e)
        {
            this.setMensagem("Número inválido");
        }
    }

    private void toString(String string)
    {
        
    }

}

