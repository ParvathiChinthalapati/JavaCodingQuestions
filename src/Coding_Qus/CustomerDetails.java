package Coding_Qus;

public class CustomerDetails {
	CustomerDetails(){
		
	}
	public CustomerDetails( int id, String firstname, String lastname )
    {
        super();
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }
 
    int id;
 
    String firstname;
 
    String lastname;
 
    public int getId()
    {
        return id;
    }
 
    public void setId( int id )
    {
        this.id = id; 
    }
 
    public String getFirstname()
    {
        return firstname;
    }
 
    public void setFirstname( String firstname )
    {
        this.firstname = firstname;
    }
 
    public String getLastname()
    {
        return lastname;
    }
 
    public void setLastname( String lastname )
    {
        this.lastname = lastname;
    }
    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append( "Customer [id=" );
        builder.append( id );
        builder.append( ", firstname=" );
        builder.append( firstname );
        builder.append( ", lastname=" );
        builder.append( lastname );
        builder.append( "]" );
        return builder.toString();
    }
 
}
