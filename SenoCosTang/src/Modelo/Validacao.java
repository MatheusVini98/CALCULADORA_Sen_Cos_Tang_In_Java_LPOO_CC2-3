package Modelo;

public class Validacao extends absPropriedades
{

    public Validacao(String numero)
    {
        super(numero);
        executar();
    }
    
    private void executar ()
    {
        this.mensagem("");
        try
        {
            this.Num(Integer.parseInt(this.getNumero()));
            if (this.getNum() < 0)
                this.setMensagem("Digite apenas ângulos positivos");
            else (this.getNum() > 360)        
                this.setMensagem("Digite um ângulo menor que 360° graus");           
        }                        
        catch (Exception e)
        {
            this.setMensagem("Número inválido");
        }
    }

    private void toString(String string)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getMensagem()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

