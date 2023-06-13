package p000;

import ch.qos.logback.core.CoreConstants;
import java.security.MessageDigest;
/* renamed from: Qd3  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35387Qd3 implements InterfaceC38133ak2 {

    /* renamed from: b */
    public final Object f30601b;

    public C35387Qd3(Object obj) {
        this.f30601b = C52865zZ3.m1111d(obj);
    }

    @Override // p000.InterfaceC38133ak2
    /* renamed from: a */
    public void mo3854a(MessageDigest messageDigest) {
        messageDigest.update(this.f30601b.toString().getBytes(InterfaceC38133ak2.f51105a));
    }

    @Override // p000.InterfaceC38133ak2
    public boolean equals(Object obj) {
        if (obj instanceof C35387Qd3) {
            return this.f30601b.equals(((C35387Qd3) obj).f30601b);
        }
        return false;
    }

    @Override // p000.InterfaceC38133ak2
    public int hashCode() {
        return this.f30601b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f30601b + CoreConstants.CURLY_RIGHT;
    }
}
