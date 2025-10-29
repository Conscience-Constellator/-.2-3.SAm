package CC.$.Q2$3;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

@Finishd(Is_Finishd=true)
public interface Dubl2$3
{
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void Dubl2$3(double A,double B,
		double[] Rsult);
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default double[] Dubl2$3(double A,double B)
		{
			double[] Rsult=new double[3];

			Dubl2$3(A,B,Rsult);

			return Rsult;
		}
}