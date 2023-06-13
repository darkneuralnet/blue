package p000;

import android.content.Context;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
/* renamed from: Dd */
/* loaded from: classes5.dex */
public final class C1568Dd implements InterfaceC38133ak2 {

    /* renamed from: b */
    public final int f6074b;

    /* renamed from: c */
    public final InterfaceC38133ak2 f6075c;

    public C1568Dd(int i, InterfaceC38133ak2 interfaceC38133ak2) {
        this.f6074b = i;
        this.f6075c = interfaceC38133ak2;
    }

    /* renamed from: c */
    public static InterfaceC38133ak2 m110092c(Context context) {
        return new C1568Dd(context.getResources().getConfiguration().uiMode & 48, C25013jm.m29958c(context));
    }

    @Override // p000.InterfaceC38133ak2
    /* renamed from: a */
    public void mo3854a(MessageDigest messageDigest) {
        this.f6075c.mo3854a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f6074b).array());
    }

    @Override // p000.InterfaceC38133ak2
    public boolean equals(Object obj) {
        if (!(obj instanceof C1568Dd)) {
            return false;
        }
        C1568Dd c1568Dd = (C1568Dd) obj;
        if (this.f6074b != c1568Dd.f6074b || !this.f6075c.equals(c1568Dd.f6075c)) {
            return false;
        }
        return true;
    }

    @Override // p000.InterfaceC38133ak2
    public int hashCode() {
        return C47029pi6.m18911o(this.f6075c, this.f6074b);
    }
}
