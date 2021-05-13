package Modelo;

import senocostang.SenoCosTang;


public class Controle extends absPropriedades implements intMetodos
{
    protected String mensagem;
    
    public Controle(String numero)
    {
        super(numero);
        this.executar();
    }
    
    public void executar ()
    {
        Validacao validacao = new Validacao(this.numero);
        if (validacao.mensagem.equals(""))
        {
            SenoCosTang sct = new SenoCosTang(validacao.n1);
            this.n1 = sct.n1;
        }
        else
        {
            this.setMensagem((String) validacao.getMensagem());
        }
    }
    

}
