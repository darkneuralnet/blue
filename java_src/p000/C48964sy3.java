package p000;

import ch.qos.logback.core.CoreConstants;
import java.security.MessageDigest;
/* renamed from: sy3  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48964sy3 implements InterfaceC38133ak2 {

    /* renamed from: b */
    public final C28385so<C43035iy3<?>, Object> f109621b = new C42538i80();

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public static <T> void m13297f(C43035iy3<T> c43035iy3, Object obj, MessageDigest messageDigest) {
        c43035iy3.m31547g(obj, messageDigest);
    }

    @Override // p000.InterfaceC38133ak2
    /* renamed from: a */
    public void mo3854a(MessageDigest messageDigest) {
        for (int i = 0; i < this.f109621b.size(); i++) {
            m13297f(this.f109621b.m94264i(i), this.f109621b.m94263m(i), messageDigest);
        }
    }

    /* renamed from: c */
    public <T> T m13300c(C43035iy3<T> c43035iy3) {
        return this.f109621b.containsKey(c43035iy3) ? (T) this.f109621b.get(c43035iy3) : c43035iy3.m31551c();
    }

    /* renamed from: d */
    public void m13299d(C48964sy3 c48964sy3) {
        this.f109621b.mo34406j(c48964sy3.f109621b);
    }

    /* renamed from: e */
    public <T> C48964sy3 m13298e(C43035iy3<T> c43035iy3, T t) {
        this.f109621b.put(c43035iy3, t);
        return this;
    }

    @Override // p000.InterfaceC38133ak2
    public boolean equals(Object obj) {
        if (obj instanceof C48964sy3) {
            return this.f109621b.equals(((C48964sy3) obj).f109621b);
        }
        return false;
    }

    @Override // p000.InterfaceC38133ak2
    public int hashCode() {
        return this.f109621b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f109621b + CoreConstants.CURLY_RIGHT;
    }
}
