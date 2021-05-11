package Modelo;


public abstract class absPropriedades implements intMetodos
{   
    public String mensagem;
    protected String numero;
    protected Double n1;
    protected Double seno;
    protected Double cosseno;
    protected Double tangente;
    protected String resposta;

    public absPropriedades(String numero)
    {
        this.numero = numero;
        executar();
    }

    public absPropriedades(Double n1)
    {
        this.n1 = n1;
        executar();
    }

    @Override
    public String toString()
    {
        return  mensagem +  numero + resposta ;
    }
    
}

