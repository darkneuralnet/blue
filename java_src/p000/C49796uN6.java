package p000;

import android.os.RemoteException;
/* renamed from: uN6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C49796uN6 extends AbstractRunnableC43247jK6 {

    /* renamed from: c */
    public final /* synthetic */ C37929aO6 f112289c;

    /* renamed from: d */
    public final /* synthetic */ YN6 f112290d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49796uN6(YN6 yn6, C37929aO6 c37929aO6, C37929aO6 c37929aO62) {
        super(c37929aO6);
        this.f112290d = yn6;
        this.f112289c = c37929aO62;
    }

    @Override // p000.AbstractRunnableC43247jK6
    /* renamed from: a */
    public final void mo8889a() {
        C42061hK6 c42061hK6;
        String str;
        String str2;
        try {
            str2 = this.f112290d.f45806b;
            this.f112290d.f45805a.m1531c().mo71656M0(str2, C48096rW3.m15829b("review"), new PN6(this.f112290d, this.f112289c));
        } catch (RemoteException e) {
            c42061hK6 = YN6.f45804c;
            str = this.f112290d.f45806b;
            c42061hK6.m36536c(e, "error requesting in-app review for %s", str);
            this.f112289c.m71486d(new RuntimeException(e));
        }
    }
}
