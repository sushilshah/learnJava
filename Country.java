/*************************************************************************
 *  Compilation:  javac Country.java
 *  Execution:    java Country
 *
 *************************************************************************/

public class Country {
    private final static String NEWLINE = System.getProperty("line.separator");

    private int    code;       // UN code number
    private String abbrev2;    // two letter ISO abbreviation
    private String abbrev3;    // three letter ISO abbreviation
    private String name;       // name of country
    private String capital;    // name of capital

    public Country(int code, String abbrev2, String abbrev3, String name, String capital) {
        this.code    = code;
        this.abbrev2 = abbrev2;
        this.abbrev3 = abbrev3;
        this.name    = name;
        this.capital = capital;
    }

    public String toString() {
        String s = "";
        s = s + "Country:  " + name    + NEWLINE;
        s = s + "Capital:  " + capital + NEWLINE;
        s = s + "UN code:  " + code    + NEWLINE;
        return s;
    }
    
    public static void main(String[] args) {
        Country USA = new Country(840, "US", "USA", "United States", "Washington");
        System.out.println(USA);

        // read in data
        In in = new In("http://www.cs.princeton.edu/introcs/datafiles/countries.txt");
        Country[] countries = new Country[222];
        for (int i = 0; i < countries.length; i++) {
            String s = in.readLine();
            String[] fields = s.split(":");
            int code = Integer.parseInt(fields[0]);
            String abbrev2 = fields[1];
            String abbrev3 = fields[2];
            String name    = fields[3];
            String capital = fields[4];
            countries[i] = new Country(code, abbrev2, abbrev3, name, capital);
        }

        // print results
        for (int i = 0; i < countries.length; i++)
            System.out.println(countries[i]);

    }
}
 
