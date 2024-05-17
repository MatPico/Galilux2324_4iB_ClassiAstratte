package test;

//I volontari non sono pagati, quindi il metodo paga() ritorna sempre 0
public class Volontario extends Personale 
{
    public Volontario(String nome, String cognome, String indirizzo, String telefono,String codFiscale) 
    {
        //Chiamo il costruttore della classe Personale per inizializzare gli attributi della classe
        super(nome, cognome, indirizzo, telefono,codFiscale);
    }
    
    @Override
    public double paga() 
    {
        return 0;
    }
}
