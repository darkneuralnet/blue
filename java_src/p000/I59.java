package p000;

import java.util.Comparator;
import kotlin.UByte;
/* renamed from: I59 */
/* loaded from: classes5.dex */
public final class I59 implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        T69 t69 = (T69) obj;
        T69 t692 = (T69) obj2;
        C48446s59 c48446s59 = new C48446s59(t69);
        C48446s59 c48446s592 = new C48446s59(t692);
        while (c48446s59.hasNext() && c48446s592.hasNext()) {
            int m116101a = A59.m116101a(c48446s59.zza() & UByte.MAX_VALUE, c48446s592.zza() & UByte.MAX_VALUE);
            if (m116101a != 0) {
                return m116101a;
            }
        }
        return A59.m116101a(t69.mo7402c(), t692.mo7402c());
    }
}
