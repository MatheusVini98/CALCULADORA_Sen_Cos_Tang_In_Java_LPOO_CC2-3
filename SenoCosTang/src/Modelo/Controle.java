package Modelo;

import senocostang.SenoCosTang;


public class Controle extends absPropriedades
{
    protected String mensagem;
    
    public Controle(String numero)
    {
        super(numero);
        executar();
    }
    
    public void executar ()
    {
        this.mensagem ="";
        Validacao validacao = new Validacao(this.getNumero());
        if (validacao.getMensagem().equals(""))
        {
            SenoCosTang sct = new SenoCosTang(validacao.numero());
            this.setMensagem(sct.getMensagem());
        }
        else
        {
            this.setMensagem(validacao.getMensagem());
        }
    }
    
        public String getMensagem()
    {
        return mensagem;
    }

    private void setMensagem(Object mensagem)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getNumero()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
