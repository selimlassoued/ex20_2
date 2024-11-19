package exam20_2;

public class ResultatRang {
	private int rang;
	public ResultatRang(int rang) {
		this.rang=rang;
	}
	public String toString() {
		return "ResultatRang [rang=" + rang + "]";
	}
	public void affiche()
	{
		System.out.println(this);
	}
	public int compareTo(Resultat r)
	{
		if(r instanceof ResultatRang)
		{
			if(((ResultatRang)r).rang==this.rang)
			{
				return 0;
			}
			else if(((ResultatRang)r).rang>this.rang)
			{
				return 1;
			}
			else {
				return -1;
			}
		}
		else {
			return -2;
		}
	}
	

}
