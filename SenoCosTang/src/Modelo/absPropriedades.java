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

    public String getMensagem()
    {
        return mensagem;
    }

    public void setMensagem(String mensagem)
    {
        this.mensagem = mensagem;
    }

    public String getNumero()
    {
        return numero;
    }

    public void setNumero(String numero)
    {
        this.numero = numero;
    }

    public Double getN1()
    {
        return n1;
    }

    public void setN1(Double n1)
    {
        this.n1 = n1;
    }

    public Double getSeno()
    {
        return seno;
    }

    public void setSeno(Double seno)
    {
        this.seno = seno;
    }

    public Double getCosseno()
    {
        return cosseno;
    }

    public void setCosseno(Double cosseno)
    {
        this.cosseno = cosseno;
    }

    public Double getTangente()
    {
        return tangente;
    }

    public void setTangente(Double tangente)
    {
        this.tangente = tangente;
    }

    public String getResposta()
    {
        return resposta;
    }

    public void setResposta(String resposta)
    {
        this.resposta = resposta;
    }
    
    @Override
    public String toString()
    {
        return resposta ;
    }
    
}

