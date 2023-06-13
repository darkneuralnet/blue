package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: Wo9 */
/* loaded from: classes5.dex */
public final class Wo9 extends AbstractC40557en7 {

    /* renamed from: d */
    public final boolean f42133d;

    /* renamed from: e */
    public final boolean f42134e;

    /* renamed from: f */
    public final /* synthetic */ Vq9 f42135f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wo9(Vq9 vq9, boolean z, boolean z2) {
        super("log");
        this.f42135f = vq9;
        this.f42133d = z;
        this.f42134e = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0083  */
    @Override // p000.AbstractC40557en7
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC37164Xs7 mo4521d(C38159am8 c38159am8, List list) {
        int i;
        int i2;
        Nl9 nl9;
        Nl9 nl92;
        Nl9 nl93;
        C38822bt8.m62175i("log", 1, list);
        if (list.size() == 1) {
            nl93 = this.f42135f.f39845d;
            nl93.mo20549a(3, c38159am8.m70757b((InterfaceC37164Xs7) list.get(0)).zzi(), Collections.emptyList(), this.f42133d, this.f42134e);
            return InterfaceC37164Xs7.f44125h0;
        }
        int m62182b = C38822bt8.m62182b(c38159am8.m70757b((InterfaceC37164Xs7) list.get(0)).zzh().doubleValue());
        if (m62182b != 2) {
            i = 3;
            if (m62182b != 3) {
                if (m62182b != 5) {
                    if (m62182b == 6) {
                        i2 = 2;
                    }
                } else {
                    i2 = 5;
                }
            } else {
                i2 = 1;
            }
            String zzi = c38159am8.m70757b((InterfaceC37164Xs7) list.get(1)).zzi();
            if (list.size() != 2) {
                nl92 = this.f42135f.f39845d;
                nl92.mo20549a(i2, zzi, Collections.emptyList(), this.f42133d, this.f42134e);
                return InterfaceC37164Xs7.f44125h0;
            }
            ArrayList arrayList = new ArrayList();
            for (int i3 = 2; i3 < Math.min(list.size(), 5); i3++) {
                arrayList.add(c38159am8.m70757b((InterfaceC37164Xs7) list.get(i3)).zzi());
            }
            nl9 = this.f42135f.f39845d;
            nl9.mo20549a(i2, zzi, arrayList, this.f42133d, this.f42134e);
            return InterfaceC37164Xs7.f44125h0;
        }
        i = 4;
        i2 = i;
        String zzi2 = c38159am8.m70757b((InterfaceC37164Xs7) list.get(1)).zzi();
        if (list.size() != 2) {
        }
    }
}
