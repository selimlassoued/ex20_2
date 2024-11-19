package exam20_2;

public class Epreuve {
	private int max;
	public int eff=0;
	private String denomination;
	private Athlete[] tabat;
	private boolean etat;
	public Epreuve(int max,String denomination) {
		this.denomination=denomination;
		this.max=max;
		tabat=new Athlete[max];
	}
	public String toString()
	{
		if(etat==true)
			{return "Dénomination: "+this.denomination+" son état:"+"en course et le nombre effectif: "+eff;}
		else
		{
			return "Dénomination: "+this.denomination+" terminée:"+"en course et le nombre effectif: "+eff;
		}
	}
	public void ajouAthlete(Athlete a)
	{
		if(max>eff)
		{
			tabat[eff]=a;
			eff++;
			System.out.println("Ajout avec succès");
		}
		else
		{
			System.out.println("Le nombre d'athlète a atteint son max");
		}
	}
	public void terminer()
	{
		etat=true;
	}
	public boolean estTerminee()
	{
		return etat==true;
	}
	public Resultat getRecordOlympique()
	{
		Resultat bestR=null;
		for(int i=0;i<eff;i++)
		{
			Resultat r=tabat[i].getResultat();
			if((bestR==null)||(r.compareTo(bestR))<0) {
				bestR=tabat[i].getResultat();
			}
		}
		return bestR;
	}
	public Athlete getVinqueur()
	{
		Resultat bestR=getRecordOlympique();
		Athlete ath=null;
		for(int i=0;i<eff;i++) {
			Resultat r=tabat[i].getResultat();
			if(r.compareTo(bestR)==0) {
				ath=tabat[i];
				break;
			}
		}
		return ath;
	}
	
	public void fixeResultat(int id,Resultat r)
	{
		if(estTerminee()) {
			System.out.println("L'épreuve est terminée,impossible de modifer les résultats");
		}
		else
		{
			for(int i=0;i<eff;i++) {
				if(tabat[i].getid()==id) {
					tabat[i].setResultat(r);
				}
			}
		}
	}
	public Resultat getResultat(int id) {
		Resultat r=null;
		for(int i=0;i<eff;i++) {
			if(tabat[i].getid()==id)
			{
				r=tabat[i].getResultat();
				break;
			}
		}
		return r;
	}
}
