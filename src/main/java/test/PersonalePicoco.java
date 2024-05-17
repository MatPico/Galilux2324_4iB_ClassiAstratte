package test;

public class PersonalePicoco 
{
    public static void main(String[] args) 
    {
        //Creo i volontari usando la classe Volontario estesa a personale
        Volontario volontario1 = new Volontario("Mattia", "Picoco", "Via Roma 1", "1234567890", "SFHKETUOADGJZCBM");
        Volontario volontario2 = new Volontario("Giuseppe", "Fabiano", "Via Milano 2", "0987654321","SFHLEHFOEHVODFG");

        //Creo i DipendentiGiornalieri usando la classe DipendenteGiornaliero estesa a personale
        DipendenteGiornaliero dipendenteGiornaliero1 = new DipendenteGiornaliero("Fabrizio", "Gesualdo", "Via Torino 3", "1122334455", "ABCDEF12G34H567I", 50);
        DipendenteGiornaliero dipendenteGiornaliero2 = new DipendenteGiornaliero("Samuele", "Francese", "Via Firenze 4", "6677889900", "JKLMN34P56Q789R", 60);

        //Creo gli Impiegati usando la classe DipendenteImpiegato estesa a personale
        DipendenteImpiegato dipendenteImpiegato1 = new DipendenteImpiegato("Matteo", "Critelli", "Via Napoli 5", "3344556677", "STUVWX56Y78Z901A", 1500);
        DipendenteImpiegato dipendenteImpiegato2 = new DipendenteImpiegato("Marco", "Daoud", "Via Genova 6", "4433221100", "NOPQRS78T90U123V", 1600);

        //Simulazione di un mese di lavoro per i dipendenti giornalieri
        dipendenteGiornaliero1.incrementaGiorni(20); // Incrementa i giorni lavorati del primo dipendente giornaliero
        dipendenteGiornaliero2.incrementaGiorni(15); // Incrementa i giorni lavorati del secondo dipendente giornaliero

        //Simulazione di gratifiche per i dipendenti impiegati
        dipendenteImpiegato1.gratifica(200); // Aggiunge una gratifica al primo dipendente impiegato
        dipendenteImpiegato2.gratifica(300); // Aggiunge una gratifica al secondo dipendente impiegato

        //Creazione di un array contenente tutto il personale
        Personale[] staff = {volontario1, volontario2, dipendenteGiornaliero1, dipendenteGiornaliero2, dipendenteImpiegato1, dipendenteImpiegato2};
        double ammontareTotale = 0; // Inizializzazione della variabile per il calcolo del totale delle paghe

        //Utilizzo il for che abbiamo studiato nel corso del martedì 
        //dove p fa sia da indice che da contenitore per l'oggetto indicizzato in staff
        for (Personale p : staff) 
        {
            p.stampaDati();                             //Stampa i dati del personale
            double paga = p.paga();                     //Calcola la paga del personale
            System.out.println("Paga: " + paga + "\n"); //Stampa la paga calcolata
            ammontareTotale += paga;                    //Aggiunge la paga calcolata al totale
        }

        //Stampa del totale delle paghe
        System.out.println("Ammontare totale delle paghe: " + ammontareTotale);
    }
}
