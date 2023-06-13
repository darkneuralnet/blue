package p000;

import java.util.Comparator;
import kotlin.UByte;
/* renamed from: qa7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C47543qa7 implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        AbstractC32088Ca7 abstractC32088Ca7 = (AbstractC32088Ca7) obj;
        AbstractC32088Ca7 abstractC32088Ca72 = (AbstractC32088Ca7) obj2;
        C46950pa7 c46950pa7 = new C46950pa7(abstractC32088Ca7);
        C46950pa7 c46950pa72 = new C46950pa7(abstractC32088Ca72);
        while (c46950pa7.hasNext() && c46950pa72.hasNext()) {
            int compareTo = Integer.valueOf(c46950pa7.mo6625y() & UByte.MAX_VALUE).compareTo(Integer.valueOf(c46950pa72.mo6625y() & UByte.MAX_VALUE));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(abstractC32088Ca7.mo1072c()).compareTo(Integer.valueOf(abstractC32088Ca72.mo1072c()));
    }
}
