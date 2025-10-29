package CC.$.Q2$3;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

@Finishd(Is_Finishd=true)
public interface Long2$3
{
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void Long2$3(long A,long B,
		long[] Rsult);
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default long[] Long2$3(long A,long B)
		{
			long[] Rsult=new long[3];

			Long2$3(A,B,Rsult);

			return Rsult;
		}
}