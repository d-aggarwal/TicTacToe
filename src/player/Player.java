package player;

public class Player {
    private String name;
    public char symbol;
    private String address;
    private String contactnumber;
    private String emailid;
    private int age;

    public void setPlayerDetails(String name,char symbol,String address,String contactnumber, String emailid,int age) {
        this.name = name;
        this.symbol = symbol;
        this.address = address;
        this.contactnumber = contactnumber;
        this.emailid = emailid;
        this.age = age;

    }

    public void setPlayerNameAndAge(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setPlayerNameSymbolEmailAge(String name, char symbol, String emailid, int age) {
        this.name = name;
        this.age = age;
        this.emailid = emailid;
        this.symbol = symbol;
    }

    public void changesymbol(char symbol ){
        this.symbol = symbol;
    }

    public void setPlayerAndSymbol(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getPlayerName() {
        return this.name;
    }

    public void getPlayerNameAndSymbol() {
        System.out.println("Player Name: "+ this.name);
        System.out.println("Player Symbol: "+ this.symbol);
    }

    public void getPlayerDetails() {
        System.out.println("Player Name: "+ this.name);
        System.out.println("Player Symbol: "+ this.symbol);
        System.out.println("Player Email: "+ this.emailid);
        System.out.println("Player Age: "+ this.age);
        System.out.println("Player Contact Number: "+ this.contactnumber);
        System.out.println("Player Address: "+ this.address);
    }


}
