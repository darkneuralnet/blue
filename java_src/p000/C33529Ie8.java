package p000;

import android.os.Bundle;
import p000.C22416gj;
import p000.InterfaceC12447ba;
/* renamed from: Ie8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33529Ie8 implements C22416gj.InterfaceC22417a {

    /* renamed from: a */
    public final /* synthetic */ C51220wm8 f15984a;

    public C33529Ie8(C51220wm8 c51220wm8) {
        this.f15984a = c51220wm8;
    }

    @Override // p000.InterfaceC41231fv8
    /* renamed from: a */
    public final void mo12047a(String str, String str2, Bundle bundle, long j) {
        InterfaceC12447ba.InterfaceC12449b interfaceC12449b;
        if (str != null && C43302jQ7.m30636c(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("name", str2);
            bundle2.putLong("timestampInMillis", j);
            bundle2.putBundle("params", bundle);
            interfaceC12449b = this.f15984a.f116500a;
            interfaceC12449b.onMessageTriggered(3, bundle2);
        }
    }
}
