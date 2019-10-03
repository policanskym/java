/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */



/*******************************************************************************
 * Instance třídy {@code Dům} představují ...
 * The {@code Dům} class instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class Dům
{
//\CC== CONSTANT CLASS (STATIC) ATTRIBUTES (FIELDS) ============================
//\CV== VARIABLE CLASS (STATIC) ATTRIBUTES (FIELDS) ============================

Obdélník obdélník1;
Obdélník komin;
Trojúhelník strecha;
Obdélník dvere;
Obdélník okno;
Elipsa okno2;
Elipsa klika;

//##############################################################################
//\CI== STATIC INITIALIZER (CLASS CONSTRUCTOR) =================================
//\CG== CLASS (STATIC) GETTERS AND SETTERS =====================================
//\CM== OTHER NON-PRIVATE CLASS (STATIC) METHODS ===============================
//\CP== PRIVATE AND AUXILIARY CLASS (STATIC) METHODS ===========================



//##############################################################################
//\IC== CONSTANT INSTANCE ATTRIBUTES (FIELDS) ==================================
//\IV== VARIABLE INSTANCE ATTRIBUTES (FIELDS) ==================================



//##############################################################################
//\II== CONSTRUCTORS AND FACTORY METHODS =======================================

    /***************************************************************************
      *  Vykreslí dům s výchozími atributy.
       */
    public Dům()
    {
        obdélník1 = new Obdélník(100, 100, 100, 100,Barva.OKROVÁ);
        komin = new Obdélník(obdélník1.getX()+5,obdélník1.getY()-55, 20, 45,Barva.ŠEDÁ); 
        strecha = new Trojúhelník(obdélník1.getX()-5, obdélník1.getY()-70,110,70,Barva.ČERVENÁ);
        dvere = new Obdélník(obdélník1.getX()+60, obdélník1.getY()+40, 30, 60,Barva.HNĚDÁ);
        okno = new Obdélník(obdélník1.getX()+15, obdélník1.getY()+40,30,30,Barva.AZUROVÁ);
        okno2 = new Elipsa(obdélník1.getX()+40, obdélník1.getY()-40,20,20,Barva.AZUROVÁ);
        klika = new Elipsa(obdélník1.getX()+80, obdélník1.getY()+65, 7, 7,Barva.ZLATÁ);
    }
    
    /******
     * Vykreslí dům se zvolenými barvami
     */
    public Dům(Barva zed, Barva komín, Barva střecha, Barva dveře, Barva okno1, 
               Barva okno_střecha, Barva kilka)
    {
        obdélník1 = new Obdélník(100, 100, 100, 100,zed);
        komin = new Obdélník(obdélník1.getX()+5,obdélník1.getY()-55, 20, 45,komín); 
        strecha = new Trojúhelník(obdélník1.getX()-5, obdélník1.getY()-70,110,70,střecha);
        dvere = new Obdélník(obdélník1.getX()+60, obdélník1.getY()+40, 30, 60,dveře);
        okno = new Obdélník(obdélník1.getX()+15, obdélník1.getY()+40,30,30,okno1);
        okno2 = new Elipsa(obdélník1.getX()+40, obdélník1.getY()-40,20,20,okno_střecha);
        klika = new Elipsa(obdélník1.getX()+80, obdélník1.getY()+65, 7, 7,kilka);               
    }
    
    /***
     * Vykreslí dům na zadaných souřadnicích
     */
    public Dům(int x, int y)
    {
        obdélník1 = new Obdélník(x, y, 100, 100,Barva.OKROVÁ);
        komin = new Obdélník(obdélník1.getX()+5,obdélník1.getY()-55, 20, 45,Barva.ŠEDÁ); 
        strecha = new Trojúhelník(obdélník1.getX()-5, obdélník1.getY()-70,110,70,Barva.ČERVENÁ);
        dvere = new Obdélník(obdélník1.getX()+60, obdélník1.getY()+40, 30, 60,Barva.HNĚDÁ);
        okno = new Obdélník(obdélník1.getX()+15, obdélník1.getY()+40,30,30,Barva.AZUROVÁ);
        okno2 = new Elipsa(obdélník1.getX()+40, obdélník1.getY()-40,20,20,Barva.AZUROVÁ);
        klika = new Elipsa(obdélník1.getX()+80, obdélník1.getY()+65, 7, 7,Barva.ZLATÁ);             
    }
    
    /**
     * Umožní uživately nastavit barvu pro všechny objekty.
     */
    public void SetBarvaBarak(Barva zed, Barva komín, Barva střecha, Barva dveře, Barva okno1, 
                        Barva okno_střecha, Barva kilka)
    {
        obdélník1.setBarva(zed);
        komin.setBarva(komín);
        strecha.setBarva(střecha);
        dvere.setBarva(dveře);
        okno.setBarva(okno1);
        okno2.setBarva(okno_střecha);
        klika.setBarva(kilka);
        obdélník1.zobraz();
        komin.zobraz();
        strecha.zobraz();
        dvere.zobraz();
        okno.zobraz();
        okno2.zobraz();
        klika.zobraz();
    }

    /**
     * Umožní uživately nastavit barvu zdi.
     */
    public void SetBarvaZed(Barva zed)
    {
        obdélník1.setBarva(zed);
        obdélník1.zobraz();
        komin.zobraz();
        strecha.zobraz();
        dvere.zobraz();
        okno.zobraz();
        okno2.zobraz();
        klika.zobraz();
    }

    /**
     * Umožní uživately nastavit barvu komínu.
     */
    public void SetBarvaKomin(Barva komín)
    {
        komin.setBarva(komín);
        obdélník1.zobraz();
        komin.zobraz();
        strecha.zobraz();
        dvere.zobraz();
        okno.zobraz();
        okno2.zobraz();
        klika.zobraz();
    }

    /**
     * Umožní uživately nastavit barvu střechy.
     */
    public void SetBarvaStrecha(Barva střecha)
    {
        strecha.setBarva(střecha);
        obdélník1.zobraz();
        komin.zobraz();
        strecha.zobraz();
        dvere.zobraz();
        okno.zobraz();
        okno2.zobraz();
        klika.zobraz();
    }

    /**
     * Umožní uživately nastavit barvu dveří.
     */
    public void SetBarvaDveře(Barva dveře)
    {
        dvere.setBarva(dveře);
        obdélník1.zobraz();
        komin.zobraz();
        strecha.zobraz();
        dvere.zobraz();
        okno.zobraz();
        okno2.zobraz();
        klika.zobraz();
    }

    /**
     * Umožní uživately nastavit barvu okna, které se nachází na zdi.
     */
    public void SetBarvaOkno(Barva okno1)
    {
        okno.setBarva(okno1);
        obdélník1.zobraz();
        komin.zobraz();
        strecha.zobraz();
        dvere.zobraz();
        okno.zobraz();
        okno2.zobraz();
        klika.zobraz();
    }

    /**
     * Umožní uživately nastavit barvu okna, které se nachází na střeše.
     */
    public void SetBarvaOknoStřecha(Barva okno_střecha)
    {
        okno2.setBarva(okno_střecha);
        obdélník1.zobraz();
        komin.zobraz();
        strecha.zobraz();
        dvere.zobraz();
        okno.zobraz();
        okno2.zobraz();
        klika.zobraz();
    }

    /**
     * Umožní uživately nastavit barvu kliky.
     */
    public void SetBarvaKlika(Barva kilka)
    {
        klika.setBarva(kilka);
        obdélník1.zobraz();
        komin.zobraz();
        strecha.zobraz();
        dvere.zobraz();
        okno.zobraz();
        okno2.zobraz();
        klika.zobraz();
    }
    
    /**
     * Posune dům do leva.
     */
    public void PosunVlevo()
    {
        obdélník1.posunVlevo();
        komin.posunVlevo();
        strecha.posunVlevo();
        dvere.posunVlevo();
        okno.posunVlevo();
        okno2.posunVlevo();
        klika.posunVlevo();
        obdélník1.zobraz();
        komin.zobraz();
        strecha.zobraz();
        dvere.zobraz();
        okno.zobraz();
        okno2.zobraz();
        klika.zobraz();
    }

    /**
     * Posune dům do prava.
     */
    public void PosunVpravo()
    {
        obdélník1.posunVpravo();
        komin.posunVpravo();
        strecha.posunVpravo();
        dvere.posunVpravo();
        okno.posunVpravo();
        okno2.posunVpravo();
        klika.posunVpravo();
        obdélník1.zobraz();
        komin.zobraz();
        strecha.zobraz();
        dvere.zobraz();
        okno.zobraz();
        okno2.zobraz();
        klika.zobraz();
    }
    
    /**
     * Posune dům vzhůru.
     */
    public void PosunNahoru()
    {
        obdélník1.posunVzhůru();
        komin.posunVzhůru();
        strecha.posunVzhůru();
        dvere.posunVzhůru();
        okno.posunVzhůru();
        okno2.posunVzhůru();
        klika.posunVzhůru();
        obdélník1.zobraz();
        komin.zobraz();
        strecha.zobraz();
        dvere.zobraz();
        okno.zobraz();
        okno2.zobraz();
        klika.zobraz();
    }
    
    /**
     * Posune dům dolu.
     */
    public void PosunDolu()
    {
        obdélník1.posunDolů();
        komin.posunDolů();
        strecha.posunDolů();
        dvere.posunDolů();
        okno.posunDolů();
        okno2.posunDolů();
        klika.posunDolů();
        obdélník1.zobraz();
        komin.zobraz();
        strecha.zobraz();
        dvere.zobraz();
        okno.zobraz();
        okno2.zobraz();
        klika.zobraz();
    }
    
    public void PosunDoprava(int x)
    {
        obdélník1.posunVpravo(x);
        komin.posunVpravo(x);
        strecha.posunVpravo(x);
        dvere.posunVpravo(x);
        okno.posunVpravo(x);
        okno2.posunVpravo(x);
        klika.posunVpravo(x);
        obdélník1.zobraz();
        komin.zobraz();
        strecha.zobraz();
        dvere.zobraz();
        okno.zobraz();
        okno2.zobraz();
        klika.zobraz();
    }
    
    public void ZvetseniDomu()
    {
        obdélník1.setRozměr(50+100,50+100);
        komin.setRozměr(50+20,50+45);
        strecha.setRozměr(50+110,50+70);
        dvere.setRozměr(50+30,50+60);
        okno.setRozměr(50+30,50+30);
        okno2.setRozměr(50+20,50+20);
        klika.setRozměr(50+7,50+7);
    }

//\IA== ABSTRACT METHODS =======================================================
//\IG== INSTANCE GETTERS AND SETTERS ===========================================
//\IM== OTHER NON-PRIVATE INSTANCE METHODS =====================================
//\IP== PRIVATE AND AUXILIARY INSTANCE METHODS =================================



//##############################################################################
//\NT== NESTED DATA TYPES ======================================================
}
