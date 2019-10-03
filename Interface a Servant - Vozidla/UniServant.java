/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */




/*******************************************************************************
 * Instance třídy {@code UniServant} představují ...
 * The {@code UniServant} class instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class UniServant extends ServantProMotor
{
//\CC== CONSTANT CLASS (STATIC) ATTRIBUTES (FIELDS) ============================
//\CV== VARIABLE CLASS (STATIC) ATTRIBUTES (FIELDS) ============================



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
     */
    public UniServant()
    {
    }

    public void posunVozidlaO(IOvládáníPolohy vozidlo, int x)
    {
        vozidlo.pohybuj(x);
        System.out.println(vozidlo.getPoloha());
        //System.out.println("Ukázková hodnota: " + IOvládáníPolohy.ukázkováHodnota);
    }

//\IA== ABSTRACT METHODS =======================================================
//\IG== INSTANCE GETTERS AND SETTERS ===========================================
//\IM== OTHER NON-PRIVATE INSTANCE METHODS =====================================
//\IP== PRIVATE AND AUXILIARY INSTANCE METHODS =================================



//##############################################################################
//\NT== NESTED DATA TYPES ======================================================
}
