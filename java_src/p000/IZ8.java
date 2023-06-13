package p000;

import java.util.List;
/* renamed from: IZ8 */
/* loaded from: classes5.dex */
public final class IZ8 extends AbstractC40557en7 {

    /* renamed from: d */
    public final /* synthetic */ D99 f15903d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IZ8(C41331g59 c41331g59, String str, D99 d99) {
        super("getValue");
        this.f15903d = d99;
    }

    @Override // p000.AbstractC40557en7
    /* renamed from: d */
    public final InterfaceC37164Xs7 mo4521d(C38159am8 c38159am8, List list) {
        C38822bt8.m62176h("getValue", 2, list);
        InterfaceC37164Xs7 m70757b = c38159am8.m70757b((InterfaceC37164Xs7) list.get(0));
        InterfaceC37164Xs7 m70757b2 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(1));
        String zza = this.f15903d.zza(m70757b.zzi());
        if (zza != null) {
            return new C43019iw7(zza);
        }
        return m70757b2;
    }
}
