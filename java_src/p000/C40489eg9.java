package p000;

import java.util.Comparator;
import kotlin.UByte;
/* renamed from: eg9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C40489eg9 implements Comparator<AbstractC45836nh9> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(AbstractC45836nh9 abstractC45836nh9, AbstractC45836nh9 abstractC45836nh92) {
        AbstractC45836nh9 abstractC45836nh93 = abstractC45836nh9;
        AbstractC45836nh9 abstractC45836nh94 = abstractC45836nh92;
        Qf9 qf9 = new Qf9(abstractC45836nh93);
        Qf9 qf92 = new Qf9(abstractC45836nh94);
        while (qf9.hasNext() && qf92.hasNext()) {
            int m76709a = Xf9.m76709a(qf9.zza() & UByte.MAX_VALUE, qf92.zza() & UByte.MAX_VALUE);
            if (m76709a != 0) {
                return m76709a;
            }
        }
        return Xf9.m76709a(abstractC45836nh93.mo11924c(), abstractC45836nh94.mo11924c());
    }
}
