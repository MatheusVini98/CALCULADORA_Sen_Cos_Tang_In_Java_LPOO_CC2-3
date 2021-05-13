package Modelo;

import java.text.DecimalFormat;

public class Calcular extends absPropriedades
{
    private String resposta;
    public double radians;
    public double degrees;
    public String strDegrees;
    
    public Calcular(Double n1)
    {
        super(n1);
        executar();
    }
    
    public void executar ()
    {
        DecimalFormat df = new DecimalFormat("0.00");
        
        degrees = Double.parseDouble(strDegrees);
        radians = Math.toRadians(degrees);
        
        if (this.n1.equals(0)&& this.n1 <=(360))
            {
                radians = (Math.PI /180) * n1;
                this.setMensagem("radiano é =");                
                this.setResposta (radians);
            }
        else
            if (this.n1.equals(0)&& this.n1 <=(360))
            {
                seno = Math.sin(radians);
                this.setMensagem("seno é =");                
                this.setResposta(seno);
            }
            
        if (this.n1.equals(0)&& this.n1 <=(360))  
            {    
                cosseno = Math.cos(radians); 
                this.setMensagem("cosseno é =");                  
                this.setResposta (cosseno);
            }
            
        if (this.n1.equals(0)&& this.n1 <=(360))           
            {
                tangente = Math.tan(radians);
                this.setMensagem("tangete é =");                  
                this.setResposta (tangente);
            }    
    }

    @Override
    public String toString()
    {
        return  resposta ;
    }

    private void setResposta(Double cosseno)
    {
        
    }
    
    
}

