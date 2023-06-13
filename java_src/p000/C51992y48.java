package p000;

import java.util.Comparator;
import kotlin.UByte;
/* renamed from: y48  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C51992y48 implements Comparator<AbstractC50836w78> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(AbstractC50836w78 abstractC50836w78, AbstractC50836w78 abstractC50836w782) {
        AbstractC50836w78 abstractC50836w783 = abstractC50836w78;
        AbstractC50836w78 abstractC50836w784 = abstractC50836w782;
        V38 v38 = new V38(abstractC50836w783);
        V38 v382 = new V38(abstractC50836w784);
        while (v38.hasNext() && v382.hasNext()) {
            int m29353a = C43692k48.m29353a(v38.zza() & UByte.MAX_VALUE, v382.zza() & UByte.MAX_VALUE);
            if (m29353a != 0) {
                return m29353a;
            }
        }
        return C43692k48.m29353a(abstractC50836w783.mo7384c(), abstractC50836w784.mo7384c());
    }
}
