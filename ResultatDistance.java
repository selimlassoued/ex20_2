package exam20_2;

public class ResultatDistance implements Resultat{
	private double distance;
	public ResultatDistance(double distance) {
		this.distance=distance;
	}
	public String toString() {
		return "ResultatDistance [distance=" + distance + "]";
	}
	
	public void affiche()
	{
		System.out.println(this);
	}
	
	public int compareTo(Resultat r)
	{
		if (r instanceof ResultatDistance)
		{
			if(((ResultatDistance)r).distance==this.distance)
			{
				return 0;
			}
			else if(((ResultatDistance)r).distance<this.distance)
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
