public class RuberProgrammer
{
    private String name;
    private String firstName;
    private String lastName;

    public RuberProgrammer(String name, String firstName, String lastName)
    {
        this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public RuberProgrammer()
    {

    }

    @Override
    public String toString()
    {
        return "RuberProgrammer{}";
    }
}
