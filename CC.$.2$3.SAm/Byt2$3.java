package CC.$.Q2$3;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

@Finishd(Is_Finishd=true)
public interface Byt2$3
{
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void Byt2$3(byte A,byte B,
		byte[] Rsult);
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default byte[] Byt2$3(byte A,byte B)
		{
			byte[] Rsult=new byte[3];

			Byt2$3(A,B,Rsult);

			return Rsult;
		}
}