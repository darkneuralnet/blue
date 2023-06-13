package p000;

import ch.qos.logback.core.CoreConstants;
import java.security.MessageDigest;
/* renamed from: iy3  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43035iy3<T> {

    /* renamed from: e */
    public static final InterfaceC24655b<Object> f91777e = new C24654a();

    /* renamed from: a */
    public final T f91778a;

    /* renamed from: b */
    public final InterfaceC24655b<T> f91779b;

    /* renamed from: c */
    public final String f91780c;

    /* renamed from: d */
    public volatile byte[] f91781d;

    /* renamed from: iy3$a */
    /* loaded from: classes5.dex */
    public class C24654a implements InterfaceC24655b<Object> {
        @Override // p000.C43035iy3.InterfaceC24655b
        /* renamed from: a */
        public void mo31546a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    /* renamed from: iy3$b */
    /* loaded from: classes5.dex */
    public interface InterfaceC24655b<T> {
        /* renamed from: a */
        void mo31546a(byte[] bArr, T t, MessageDigest messageDigest);
    }

    public C43035iy3(String str, T t, InterfaceC24655b<T> interfaceC24655b) {
        this.f91780c = C52865zZ3.m1113b(str);
        this.f91778a = t;
        this.f91779b = (InterfaceC24655b) C52865zZ3.m1111d(interfaceC24655b);
    }

    /* renamed from: a */
    public static <T> C43035iy3<T> m31553a(String str, T t, InterfaceC24655b<T> interfaceC24655b) {
        return new C43035iy3<>(str, t, interfaceC24655b);
    }

    /* renamed from: b */
    public static <T> InterfaceC24655b<T> m31552b() {
        return (InterfaceC24655b<T>) f91777e;
    }

    /* renamed from: e */
    public static <T> C43035iy3<T> m31549e(String str) {
        return new C43035iy3<>(str, null, m31552b());
    }

    /* renamed from: f */
    public static <T> C43035iy3<T> m31548f(String str, T t) {
        return new C43035iy3<>(str, t, m31552b());
    }

    /* renamed from: c */
    public T m31551c() {
        return this.f91778a;
    }

    /* renamed from: d */
    public final byte[] m31550d() {
        if (this.f91781d == null) {
            this.f91781d = this.f91780c.getBytes(InterfaceC38133ak2.f51105a);
        }
        return this.f91781d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C43035iy3) {
            return this.f91780c.equals(((C43035iy3) obj).f91780c);
        }
        return false;
    }

    /* renamed from: g */
    public void m31547g(T t, MessageDigest messageDigest) {
        this.f91779b.mo31546a(m31550d(), t, messageDigest);
    }

    public int hashCode() {
        return this.f91780c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f91780c + CoreConstants.SINGLE_QUOTE_CHAR + CoreConstants.CURLY_RIGHT;
    }
}
