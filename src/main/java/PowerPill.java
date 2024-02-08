
/**
 * This class defines how power pills behave in
 * a game.  The purpose of a power pill is to simply
 * provide a character with power.
 *
 * @author (You)
 * @version (0.1)
 */
public class PowerPill
{
    static int DEFAULT_POWER = 10;

    // instance variables
    private int power;
    private String name;

    // constructors
    /**
     \* Initializes this power pill to a default power value
     \* and sets the name of the pill to name.
     \* @param name the name of this power pill.
     */
    public PowerPill(String name)
    {
        setName(name);
    }

    /**
     * Initializes this power pill to the value of power
     * and sets the name of the pill to name.
     * @param name the name of this power pill
     * @param power the power level of this power pill.
     */

    public PowerPill(String name, int power)
    {
        setName(name);
        setPower(power);
    }

    // accessor methods
    public String getName()
    {
        return name;
    }
    public int getPower()
    {
        return power;
    }

    // mutator methods
    public void setName(String powerPillName)
    {
        this.name = powerPillName;
    }
    public void setPower(int powerPillPower)
    {
        this.power = powerPillPower;
    }


    // toString method

    // TODO - replace this line with instruction from step 8
    public String toString()
    {
        return "PowerPill " + name + " = " + power;
    }


}