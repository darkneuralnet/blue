package p000;

import android.os.Bundle;
import android.os.RemoteException;
/* renamed from: gK6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C41468gK6 extends AbstractRunnableC43247jK6 {

    /* renamed from: c */
    public final /* synthetic */ C37929aO6 f81997c;

    /* renamed from: d */
    public final /* synthetic */ C49769uK6 f81998d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41468gK6(C49769uK6 c49769uK6, C37929aO6 c37929aO6, C37929aO6 c37929aO62) {
        super(c37929aO6);
        this.f81998d = c49769uK6;
        this.f81997c = c37929aO62;
    }

    @Override // p000.AbstractRunnableC43247jK6
    /* renamed from: a */
    public final void mo8889a() {
        C42061hK6 c42061hK6;
        C52733zK6 c52733zK6;
        String str;
        Bundle m10442i;
        try {
            c52733zK6 = this.f81998d.f112218d;
            str = this.f81998d.f112215a;
            m10442i = C49769uK6.m10442i();
            ((InterfaceC40327eP6) c52733zK6.m1531c()).mo42896t(str, m10442i, new BinderC46212oK6(this.f81998d, this.f81997c));
        } catch (RemoteException e) {
            c42061hK6 = C49769uK6.f112213f;
            c42061hK6.m36536c(e, "keepAlive", new Object[0]);
        }
    }
}
