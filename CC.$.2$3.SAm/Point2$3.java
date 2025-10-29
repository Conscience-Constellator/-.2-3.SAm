package CC.$.Q2$3;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

@Finishd(Is_Finishd=false)
public interface Point2$3<Point_Typ>
{
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void Num2$3(Point_Typ A,Point_Typ B,
		Point_Typ[] Rsult);
//		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
//		default Point_Typ[] Num2$3(Point_Typ A,Point_Typ B)
//		{
//			byte[] Rsult=new byte[3];
//
//			Num2$2(A,B,Rsult);
//
//			return Rsult;
//		}
}