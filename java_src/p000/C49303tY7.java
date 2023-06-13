package p000;

import android.os.Bundle;
import p000.C22416gj;
import p000.InterfaceC12447ba;
/* renamed from: tY7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C49303tY7 implements C22416gj.InterfaceC22417a {

    /* renamed from: a */
    public final /* synthetic */ C68 f110743a;

    public C49303tY7(C68 c68) {
        this.f110743a = c68;
    }

    @Override // p000.InterfaceC41231fv8
    /* renamed from: a */
    public final void mo12047a(String str, String str2, Bundle bundle, long j) {
        InterfaceC12447ba.InterfaceC12449b interfaceC12449b;
        if (!this.f110743a.f3393a.contains(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        NH8 nh8 = C43302jQ7.f92704a;
        String m42394a = C40628eu8.m42394a(str2);
        if (m42394a != null) {
            str2 = m42394a;
        }
        bundle2.putString("events", str2);
        interfaceC12449b = this.f110743a.f3394b;
        interfaceC12449b.onMessageTriggered(2, bundle2);
    }
}
