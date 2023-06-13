package p000;

import android.os.Bundle;
/* renamed from: MP6 */
/* loaded from: classes5.dex */
public final class MP6 implements InterfaceC39133cQ6 {

    /* renamed from: a */
    public final /* synthetic */ Bundle f23112a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC43376jZ0 f23113b;

    public MP6(AbstractC43376jZ0 abstractC43376jZ0, Bundle bundle) {
        this.f23113b = abstractC43376jZ0;
        this.f23112a = bundle;
    }

    @Override // p000.InterfaceC39133cQ6
    /* renamed from: a */
    public final void mo61415a(InterfaceC31759Aq2 interfaceC31759Aq2) {
        InterfaceC31759Aq2 interfaceC31759Aq22;
        interfaceC31759Aq22 = this.f23113b.f92922a;
        interfaceC31759Aq22.onCreate(this.f23112a);
    }

    @Override // p000.InterfaceC39133cQ6
    public final int zaa() {
        return 1;
    }
}
