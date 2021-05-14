package Modelo;

/**
 *
 * @author Matheus Vinícius RA F339475
 */

import java.text.DecimalFormat;

public class Calcular extends absPropriedades
{
    protected String resposta;
    public Double radians;
    public Double seno;
    public Double cosseno;
    public Double tangente;

    public Calcular(Double n1)
    {
        super(n1);
        Executar();
    }
    
@Override  
    public void Executar ()
    {
        DecimalFormat df = new DecimalFormat("0.00");
        
        radians= (Math.PI /180)*this.n1;
        
        seno = Math.sin(radians);

        cosseno = Math.cos(radians); 
                
        tangente = Math.tan(radians);
  
        resposta = "<html> Seno = " + df.format(radians)
                + "<br> Cosseno = " + df.format(cosseno)
                + "<br> Tangete  = " + df.format(tangente) + "</html>";

    }
    
}

