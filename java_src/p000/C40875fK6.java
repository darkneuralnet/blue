package p000;

import android.os.Bundle;
import android.os.RemoteException;
/* renamed from: fK6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C40875fK6 extends AbstractRunnableC43247jK6 {

    /* renamed from: c */
    public final /* synthetic */ int f79886c;

    /* renamed from: d */
    public final /* synthetic */ String f79887d;

    /* renamed from: e */
    public final /* synthetic */ String f79888e;

    /* renamed from: f */
    public final /* synthetic */ int f79889f;

    /* renamed from: g */
    public final /* synthetic */ C37929aO6 f79890g;

    /* renamed from: h */
    public final /* synthetic */ C49769uK6 f79891h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40875fK6(C49769uK6 c49769uK6, C37929aO6 c37929aO6, int i, String str, String str2, int i2, C37929aO6 c37929aO62) {
        super(c37929aO6);
        this.f79891h = c49769uK6;
        this.f79886c = i;
        this.f79887d = str;
        this.f79888e = str2;
        this.f79889f = i2;
        this.f79890g = c37929aO62;
    }

    @Override // p000.AbstractRunnableC43247jK6
    /* renamed from: a */
    public final void mo8889a() {
        C42061hK6 c42061hK6;
        C52733zK6 c52733zK6;
        String str;
        Bundle m10442i;
        try {
            c52733zK6 = this.f79891h.f112217c;
            str = this.f79891h.f112215a;
            Bundle m10434q = C49769uK6.m10434q(this.f79886c, this.f79887d, this.f79888e, this.f79889f);
            m10442i = C49769uK6.m10442i();
            ((InterfaceC40327eP6) c52733zK6.m1531c()).mo42897l3(str, m10434q, m10442i, new BinderC43840kK6(this.f79891h, this.f79890g));
        } catch (RemoteException e) {
            c42061hK6 = C49769uK6.f112213f;
            c42061hK6.m36537b("getChunkFileDescriptor(%s, %s, %d, session=%d)", this.f79887d, this.f79888e, Integer.valueOf(this.f79889f), Integer.valueOf(this.f79886c));
            this.f79890g.m71486d(new RuntimeException(e));
        }
    }
}
