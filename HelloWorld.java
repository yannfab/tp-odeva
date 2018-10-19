public class HelloWorld {
 String H;
    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
	System.out.println("Je change des trucs");
    }

    public String blaaablaaaablaaaa (){
 	return "Je dis des choses";
    }
public String getH() {
		return H;
	}
	public void setH(String H) {
		this.H = H;
	}
}

//un peu de code java

public Contact rechercherContact (String nom) throws SQLException{
		
	      Connection conn = DriverManager.getConnection(url, user, passwd);
	         
	      Statement state = conn.createStatement();
	      
	      PreparedStatement ps=conn.prepareStatement("Select * from contact where nom=?");
	      ps.setString(1, nom);
	      ResultSet rs=ps.executeQuery();
	      
	      while(rs.next()!=false){
		      rs.next();
		      String nm=rs.getString(2);
		      String pn=rs.getString(3);
		      int t=rs.getInt(4);
		      int id = rs.getInt(1);
		      
		      if (nm == nom)
		    	res = new  Contact (id,t,nm,pn);
	      }
		     
		      return res;     
		   
	}

