package test;

//La classe DipendenteImpiegato estende la classe Personale e rappresenta
//un impiegato con uno stipendio mensile fisso e un bonus aggiuntivo.
public class DipendenteImpiegato extends Personale 
{
    //Attributi specifici per un impiegato
    protected double retribuzioneMensile;
    protected double bonus;

    /*
     * Costruttore per inizializzare un oggetto impiegato con dettagli personali,
     * codice fiscale e stipendio mensile. Il bonus è inizializzato a 0.
     */
    public DipendenteImpiegato(String nome, String cognome, String indirizzo, String telefono, String codFiscale, double retribuzioneMensile) 
    {
        //Chiamo il costruttore della classe Personale per inizializzare gli attributi della classe
        super(nome, cognome, indirizzo, telefono, codFiscale);
        //Inizializzo lo stipendio mensile
        this.retribuzioneMensile = retribuzioneMensile;
        //Inizializzo il bonus a 0
        this.bonus = 0;
    }

    
    //Metodo per aggiungere un bonus al totale del bonus dell'impiegato.
    public void gratifica(double x) 
    {
        this.bonus += x;
    }

    @Override
    public void stampaDati() 
    {
        //Chiamo il metodo della superclasse per stampare i dettagli personali
        super.stampaDati();
        //Stampo lo stipendio mensile e il bonus
        System.out.println("Retribuzione Mensile: " + retribuzioneMensile);
        System.out.println("Bonus: " + bonus);
    }

    @Override
    public double paga() 
    {
        //Calcolo il pagamento totale
        double pagaTotale = retribuzioneMensile + bonus;
        //Azzero i bonus
        bonus = 0;
        //resistuisco il pagamento totale
        return pagaTotale;
    }
}
