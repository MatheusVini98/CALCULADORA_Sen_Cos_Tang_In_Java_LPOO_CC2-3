package Modelo;

/**
 *
 * @author Matheus Vinícius RA F339475
 */

public class Validacao extends absPropriedades
{

    public Validacao(String numero)
    {
        super(numero);
        Executar();
    }
    
    public void Executar()
    {
        this.mensagem = "";
        
        try
            {
            this.numero = this.numero.replaceAll(",", ".");
            this.n1 = Double.parseDouble(this.numero);

            if (this.n1 <= 0)
                {
                mensagem = "Digite apenas ângulos positivos";
                }
            if (this.n1 > 360)
                {
                mensagem = "Apenas angulos de até 360° graus";
                }
            }
        catch (NumberFormatException e)
            {
            mensagem = "Digite apenas números";
            }
        catch (Exception e)
            {
            mensagem = "Valor inválido";
            }
        }    
    }


