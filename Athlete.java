package exam20_2;

public class Athlete {

	private int id ;
	private String non ;
	private Resultat resultat ;
	public Athlete(int id, String non ){
		this.id=id ;
		this. non = non ;
		resultat=null ;
	}
	public int getid() {
	return id;}

	public void setId(int id) {
	this.id = id;}

	public String getNon() { return non;}
	
	public void setNon(String non) {this.non = non;}
	public Resultat getResultat() { return resultat;}

	public void setResultat(Resultat resultat) {
	this.resultat = resultat;
	}

}
