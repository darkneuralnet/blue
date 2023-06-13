package p000;

import android.os.Bundle;
import android.os.RemoteException;
/* renamed from: dK6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C39690dK6 extends AbstractRunnableC43247jK6 {

    /* renamed from: c */
    public final /* synthetic */ int f76433c;

    /* renamed from: d */
    public final /* synthetic */ C37929aO6 f76434d;

    /* renamed from: e */
    public final /* synthetic */ C49769uK6 f76435e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39690dK6(C49769uK6 c49769uK6, C37929aO6 c37929aO6, int i, C37929aO6 c37929aO62) {
        super(c37929aO6);
        this.f76435e = c49769uK6;
        this.f76433c = i;
        this.f76434d = c37929aO62;
    }

    @Override // p000.AbstractRunnableC43247jK6
    /* renamed from: a */
    public final void mo8889a() {
        C42061hK6 c42061hK6;
        C52733zK6 c52733zK6;
        String str;
        Bundle m10443h;
        Bundle m10442i;
        try {
            c52733zK6 = this.f76435e.f112217c;
            str = this.f76435e.f112215a;
            m10443h = C49769uK6.m10443h(this.f76433c);
            m10442i = C49769uK6.m10442i();
            ((InterfaceC40327eP6) c52733zK6.m1531c()).mo42899e2(str, m10443h, m10442i, new BinderC42654iK6(this.f76435e, this.f76434d, (int[]) null));
        } catch (RemoteException e) {
            c42061hK6 = C49769uK6.f112213f;
            c42061hK6.m36536c(e, "notifySessionFailed", new Object[0]);
        }
    }
}
