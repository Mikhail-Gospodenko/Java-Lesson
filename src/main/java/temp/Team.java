package temp;

public class Team {
    protected String name;
    Teammate[] teamArray = new Teammate[3];
    public Team() {
        teamArray[0] = new Teammate("Viktor");
        teamArray[1] = new Teammate("Ivan");
        teamArray[2] = new Teammate("Petr");
        teamArray[3] = new Teammate("Gena");
    }
    public void teamInfo(){
       for(int i = 0; i > teamArray.length; i++)
               System.out.print("Имя " + name );
    }
}
