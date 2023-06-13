package p000;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
/* renamed from: mP6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C45071mP6 extends AbstractRunnableC43247jK6 {

    /* renamed from: c */
    public final /* synthetic */ List f97961c;

    /* renamed from: d */
    public final /* synthetic */ C37929aO6 f97962d;

    /* renamed from: e */
    public final /* synthetic */ C49769uK6 f97963e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45071mP6(C49769uK6 c49769uK6, C37929aO6 c37929aO6, List list, C37929aO6 c37929aO62) {
        super(c37929aO6);
        this.f97963e = c49769uK6;
        this.f97961c = list;
        this.f97962d = c37929aO62;
    }

    @Override // p000.AbstractRunnableC43247jK6
    /* renamed from: a */
    public final void mo8889a() {
        C42061hK6 c42061hK6;
        C52733zK6 c52733zK6;
        String str;
        Bundle m10442i;
        ArrayList m10440k = C49769uK6.m10440k(this.f97961c);
        try {
            c52733zK6 = this.f97963e.f112217c;
            str = this.f97963e.f112215a;
            m10442i = C49769uK6.m10442i();
            ((InterfaceC40327eP6) c52733zK6.m1531c()).mo42901F0(str, m10440k, m10442i, new BinderC42654iK6(this.f97963e, this.f97962d, (byte[]) null));
        } catch (RemoteException e) {
            c42061hK6 = C49769uK6.f112213f;
            c42061hK6.m36536c(e, "cancelDownloads(%s)", this.f97961c);
        }
    }
}
