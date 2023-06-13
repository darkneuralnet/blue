package p000;

import java.util.Comparator;
import kotlin.UByte;
/* renamed from: WV7 */
/* loaded from: classes5.dex */
public final class WV7 implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        AbstractC41604gZ7 abstractC41604gZ7 = (AbstractC41604gZ7) obj;
        AbstractC41604gZ7 abstractC41604gZ72 = (AbstractC41604gZ7) obj2;
        KW7 it = abstractC41604gZ7.iterator();
        KW7 it2 = abstractC41604gZ72.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int compareTo = Integer.valueOf(it.zza() & UByte.MAX_VALUE).compareTo(Integer.valueOf(it2.zza() & UByte.MAX_VALUE));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(abstractC41604gZ7.mo5074e()).compareTo(Integer.valueOf(abstractC41604gZ72.mo5074e()));
    }
}
