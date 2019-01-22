
package studentlist;


public class Student {
    
    private String name;
    private int id;
    private String DoB;
    
    public Student()
    {
        this.name = "name is not set";
        this.id = 0;
    }
    
    public Student (String name, int ID)
    {
        this.name = name;
        this.id = ID;
    }
    
    public void setName(String givenName)
    {
        this.name = givenName;
    }
    
    public String getName()
    {
            return this.name;
    }
    
    public void setID(int givenID)
    {
        this.id = givenID;
    }
    
    public int getID()
    {
        return id;
    }

    /**
     * @return the DoB
     */
    public String getDoB() {
        return DoB;
    }

    /**
     * @param DoB the DoB to set
     */
    public void setDoB(String DoB) {
        this.DoB = DoB;
    }
    
}
