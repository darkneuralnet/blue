package p000;

import ch.qos.logback.core.CoreConstants;
import java.security.MessageDigest;
/* renamed from: CS0 */
/* loaded from: classes5.dex */
public final class CS0 implements InterfaceC38133ak2 {

    /* renamed from: b */
    public final InterfaceC38133ak2 f4087b;

    /* renamed from: c */
    public final InterfaceC38133ak2 f4088c;

    public CS0(InterfaceC38133ak2 interfaceC38133ak2, InterfaceC38133ak2 interfaceC38133ak22) {
        this.f4087b = interfaceC38133ak2;
        this.f4088c = interfaceC38133ak22;
    }

    @Override // p000.InterfaceC38133ak2
    /* renamed from: a */
    public void mo3854a(MessageDigest messageDigest) {
        this.f4087b.mo3854a(messageDigest);
        this.f4088c.mo3854a(messageDigest);
    }

    @Override // p000.InterfaceC38133ak2
    public boolean equals(Object obj) {
        if (!(obj instanceof CS0)) {
            return false;
        }
        CS0 cs0 = (CS0) obj;
        if (!this.f4087b.equals(cs0.f4087b) || !this.f4088c.equals(cs0.f4088c)) {
            return false;
        }
        return true;
    }

    @Override // p000.InterfaceC38133ak2
    public int hashCode() {
        return (this.f4087b.hashCode() * 31) + this.f4088c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f4087b + ", signature=" + this.f4088c + CoreConstants.CURLY_RIGHT;
    }
}
