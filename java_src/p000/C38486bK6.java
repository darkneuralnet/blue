package p000;

import android.os.Bundle;
import android.os.RemoteException;
/* renamed from: bK6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C38486bK6 extends AbstractRunnableC43247jK6 {

    /* renamed from: c */
    public final /* synthetic */ int f57289c;

    /* renamed from: d */
    public final /* synthetic */ String f57290d;

    /* renamed from: e */
    public final /* synthetic */ C37929aO6 f57291e;

    /* renamed from: f */
    public final /* synthetic */ int f57292f;

    /* renamed from: g */
    public final /* synthetic */ C49769uK6 f57293g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38486bK6(C49769uK6 c49769uK6, C37929aO6 c37929aO6, int i, String str, C37929aO6 c37929aO62, int i2) {
        super(c37929aO6);
        this.f57293g = c49769uK6;
        this.f57289c = i;
        this.f57290d = str;
        this.f57291e = c37929aO62;
        this.f57292f = i2;
    }

    @Override // p000.AbstractRunnableC43247jK6
    /* renamed from: a */
    public final void mo8889a() {
        C42061hK6 c42061hK6;
        C52733zK6 c52733zK6;
        String str;
        Bundle m10444g;
        Bundle m10442i;
        try {
            c52733zK6 = this.f57293g.f112217c;
            str = this.f57293g.f112215a;
            m10444g = C49769uK6.m10444g(this.f57289c, this.f57290d);
            m10442i = C49769uK6.m10442i();
            ((InterfaceC40327eP6) c52733zK6.m1531c()).mo42900I2(str, m10444g, m10442i, new BinderC47398qK6(this.f57293g, this.f57291e, this.f57289c, this.f57290d, this.f57292f));
        } catch (RemoteException e) {
            c42061hK6 = C49769uK6.f112213f;
            c42061hK6.m36536c(e, "notifyModuleCompleted", new Object[0]);
        }
    }
}
