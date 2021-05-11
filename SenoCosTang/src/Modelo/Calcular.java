package Modelo;

import java.text.DecimalFormat;

public class Calcular extends absPropriedades
{
    private String resposta;
    
    public Calcular(Double n1)
    {
        super(n1);
        executar();
    }
    
    public void executar ()
    {
        DecimalFormat df = new DecimalFormat("0.00");
        
        if (this.n1.equals(0)&& this.n1 <=(360))
            rad = (Math.PI/180) * numero;
            (this.setResposta = "Radianos é"(rad));
        if (this.n1.equals(0)&& this.n1 <=(360))    
            seno = Math.sin(rad);
            this.setResposta = "Seno = "(seno));
        if (this.n1.equals(0)&& this.n1 <=(360))             
            cosseno = Math.cos(rad);  
            this.setResposta = "Cosseno ="(cosseno));
        if (this.n1.equals(0)&& this.n1 <=(360))           
            tangente = Math.tan(rad);
            this.setResposta = "Tangente ="(tangente));
    }

    @Override
    public String toString()
    {
        return  resposta ;
    }
    
    
}


//Calcular vai ser tipo Triangulo na classe modelo !