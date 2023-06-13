package p000;

import android.os.RemoteException;
import java.util.Map;
/* renamed from: CP6 */
/* loaded from: classes6.dex */
public final class CP6 extends AbstractRunnableC43247jK6 {

    /* renamed from: c */
    public final /* synthetic */ Map f4043c;

    /* renamed from: d */
    public final /* synthetic */ C37929aO6 f4044d;

    /* renamed from: e */
    public final /* synthetic */ C49769uK6 f4045e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CP6(C49769uK6 c49769uK6, C37929aO6 c37929aO6, Map map, C37929aO6 c37929aO62) {
        super(c37929aO6);
        this.f4045e = c49769uK6;
        this.f4043c = map;
        this.f4044d = c37929aO62;
    }

    @Override // p000.AbstractRunnableC43247jK6
    /* renamed from: a */
    public final void mo8889a() {
        C42061hK6 c42061hK6;
        C52733zK6 c52733zK6;
        String str;
        try {
            c52733zK6 = this.f4045e.f112217c;
            str = this.f4045e.f112215a;
            ((InterfaceC40327eP6) c52733zK6.m1531c()).mo42898l1(str, C49769uK6.m10438m(this.f4043c), new BinderC45026mK6(this.f4045e, this.f4044d));
        } catch (RemoteException e) {
            c42061hK6 = C49769uK6.f112213f;
            c42061hK6.m36536c(e, "syncPacks", new Object[0]);
            this.f4044d.m71486d(new RuntimeException(e));
        }
    }
}
