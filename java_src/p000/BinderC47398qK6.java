package p000;

import android.os.Bundle;
/* renamed from: qK6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC47398qK6 extends BinderC42654iK6<Void> {

    /* renamed from: c */
    public final int f105123c;

    /* renamed from: d */
    public final String f105124d;

    /* renamed from: e */
    public final int f105125e;

    /* renamed from: f */
    public final /* synthetic */ C49769uK6 f105126f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC47398qK6(C49769uK6 c49769uK6, C37929aO6<Void> c37929aO6, int i, String str, int i2) {
        super(c49769uK6, c37929aO6);
        this.f105126f = c49769uK6;
        this.f105123c = i;
        this.f105124d = str;
        this.f105125e = i2;
    }

    @Override // p000.BinderC42654iK6, p000.InterfaceC42699iP6
    /* renamed from: O1 */
    public final void mo17605O1(Bundle bundle) {
        C52733zK6 c52733zK6;
        C42061hK6 c42061hK6;
        c52733zK6 = this.f105126f.f112217c;
        c52733zK6.m1532b();
        int i = bundle.getInt("error_code");
        c42061hK6 = C49769uK6.f112213f;
        c42061hK6.m36537b("onError(%d), retrying notifyModuleCompleted...", Integer.valueOf(i));
        int i2 = this.f105125e;
        if (i2 > 0) {
            this.f105126f.m10427x(this.f105123c, this.f105124d, i2 - 1);
        }
    }
}
