package p000;

import java.util.Comparator;
import kotlin.UByte;
/* renamed from: HL8 */
/* loaded from: classes5.dex */
public final class HL8 implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        AbstractC40913fO8 abstractC40913fO8 = (AbstractC40913fO8) obj;
        AbstractC40913fO8 abstractC40913fO82 = (AbstractC40913fO8) obj2;
        C50372vL8 c50372vL8 = new C50372vL8(abstractC40913fO8);
        C50372vL8 c50372vL82 = new C50372vL8(abstractC40913fO82);
        while (c50372vL8.hasNext() && c50372vL82.hasNext()) {
            int compareTo = Integer.valueOf(c50372vL8.zza() & UByte.MAX_VALUE).compareTo(Integer.valueOf(c50372vL82.zza() & UByte.MAX_VALUE));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(abstractC40913fO8.mo41437c()).compareTo(Integer.valueOf(abstractC40913fO82.mo41437c()));
    }
}
