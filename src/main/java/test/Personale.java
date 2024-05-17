package test;

//Definisco la classe astratta "Personale"
public abstract class Personale 
{
    //Dichiaro e variabili protette(perchè l'abbiamo fatto ieri ed era carino)
    protected String nome;
    protected String cognome;
    protected String indirizzo;
    protected String telefono;
    protected String codFiscale;
    
    //Costruttore della classe Personale ( ho aggiunto codice fiscale perchè comune nelle classi)
    public Personale(String nome, String cognome, String indirizzo, String telefono,String codFiscale) 
    {
        //Inizializzazione delle variabili membro con i valori passati come argomenti
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.telefono = telefono;
        this.codFiscale = codFiscale;
    }

    //Metodo per stampare i dati del personale
    public void stampaDati() 
    {
        System.out.println("Nome: " + nome);
        System.out.println("Cognome: " + cognome);
        System.out.println("Indirizzo: " + indirizzo);
        System.out.println("Telefono: " + telefono);
        System.out.println("Codice Fiscale: " + codFiscale);
    }

    //Dichiarazione del metodo astratto paga()
    //Ogni sottoclasse concreta deve fornire un'implementazione per questo metodo
    public abstract double paga();
}