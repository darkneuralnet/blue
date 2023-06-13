package p000;

import android.os.Bundle;
import android.os.RemoteException;
/* renamed from: ZJ6 */
/* loaded from: classes6.dex */
public final class ZJ6 extends AbstractRunnableC43247jK6 {

    /* renamed from: c */
    public final /* synthetic */ int f48222c;

    /* renamed from: d */
    public final /* synthetic */ String f48223d;

    /* renamed from: e */
    public final /* synthetic */ String f48224e;

    /* renamed from: f */
    public final /* synthetic */ int f48225f;

    /* renamed from: g */
    public final /* synthetic */ C37929aO6 f48226g;

    /* renamed from: h */
    public final /* synthetic */ C49769uK6 f48227h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZJ6(C49769uK6 c49769uK6, C37929aO6 c37929aO6, int i, String str, String str2, int i2, C37929aO6 c37929aO62) {
        super(c37929aO6);
        this.f48227h = c49769uK6;
        this.f48222c = i;
        this.f48223d = str;
        this.f48224e = str2;
        this.f48225f = i2;
        this.f48226g = c37929aO62;
    }

    @Override // p000.AbstractRunnableC43247jK6
    /* renamed from: a */
    public final void mo8889a() {
        C42061hK6 c42061hK6;
        C52733zK6 c52733zK6;
        String str;
        Bundle m10442i;
        try {
            c52733zK6 = this.f48227h.f112217c;
            str = this.f48227h.f112215a;
            Bundle m10434q = C49769uK6.m10434q(this.f48222c, this.f48223d, this.f48224e, this.f48225f);
            m10442i = C49769uK6.m10442i();
            ((InterfaceC40327eP6) c52733zK6.m1531c()).mo42895z2(str, m10434q, m10442i, new BinderC42654iK6(this.f48227h, this.f48226g, (char[]) null));
        } catch (RemoteException e) {
            c42061hK6 = C49769uK6.f112213f;
            c42061hK6.m36536c(e, "notifyChunkTransferred", new Object[0]);
        }
    }
}
