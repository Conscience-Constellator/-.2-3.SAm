package CC.$.Q2$3;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

@Finishd(Is_Finishd=true)
public interface Bool2$3
{
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void Bool2$3(boolean A,boolean B,
		boolean[] Rsult);
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default boolean[] Bool2$3(boolean A,boolean B)
		{
			boolean[] Rsult=new boolean[3];

			Bool2$3(A,B,Rsult);

			return Rsult;
		}
}