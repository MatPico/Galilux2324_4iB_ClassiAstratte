package test;

//La classe DipendenteGiornaliero estende la classe Personale
public class DipendenteGiornaliero extends Personale 
{
    //Attributi specifici per un dipendente giornaliero
    protected double retribuzioneGiornaliera; // Retribuzione giornaliera del dipendente
    protected int giorni; // Numero di giorni lavorati

    // Costruttore della classe DipendenteGiornaliero
    public DipendenteGiornaliero(String nome, String cognome, String indirizzo, String telefono, String codFiscale, double retribuzioneGiornaliera) 
    {
        //Chiamo il costruttore della classe Personale per inizializzare gli attributi della classe
        super(nome, cognome, indirizzo, telefono,codFiscale);
        //Inizializzo gli attributi non comuni di DipendenteGiornaliero
        this.retribuzioneGiornaliera = retribuzioneGiornaliera;
        this.giorni = 0;
    }

    //Metodo per incrementare il numero di giorni lavorati
    public void incrementaGiorni(int n) 
    {
        this.giorni += n;
    }

    @Override
    public void stampaDati() 
    {
        //Chiamo il metodo stampaDati della superclasse per stampare i dati comuni
        super.stampaDati();
        //Stampo i dati specifici del dipendente
        System.out.println("Retribuzione Giornaliera: " + retribuzioneGiornaliera);
        System.out.println("Giorni Lavorati: " + giorni);
    }

    @Override
    public double paga() 
    {
        //Calcolo il pagamento totale in base a paga e giorni lavorati
        double pagaTotale = retribuzioneGiornaliera * giorni;
        //Azzero i giorni di lavoro dopo il pagamento
        giorni = 0;
        //resistuisco il pagamento totale
        return pagaTotale;
    }
}