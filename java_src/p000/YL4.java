package p000;

import ch.qos.logback.core.CoreConstants;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
/* renamed from: YL4 */
/* loaded from: classes5.dex */
public final class YL4 implements InterfaceC38133ak2 {

    /* renamed from: j */
    public static final C49711uE2<Class<?>, byte[]> f45766j = new C49711uE2<>(50);

    /* renamed from: b */
    public final InterfaceC28820to f45767b;

    /* renamed from: c */
    public final InterfaceC38133ak2 f45768c;

    /* renamed from: d */
    public final InterfaceC38133ak2 f45769d;

    /* renamed from: e */
    public final int f45770e;

    /* renamed from: f */
    public final int f45771f;

    /* renamed from: g */
    public final Class<?> f45772g;

    /* renamed from: h */
    public final C48964sy3 f45773h;

    /* renamed from: i */
    public final InterfaceC47891r96<?> f45774i;

    public YL4(InterfaceC28820to interfaceC28820to, InterfaceC38133ak2 interfaceC38133ak2, InterfaceC38133ak2 interfaceC38133ak22, int i, int i2, InterfaceC47891r96<?> interfaceC47891r96, Class<?> cls, C48964sy3 c48964sy3) {
        this.f45767b = interfaceC28820to;
        this.f45768c = interfaceC38133ak2;
        this.f45769d = interfaceC38133ak22;
        this.f45770e = i;
        this.f45771f = i2;
        this.f45774i = interfaceC47891r96;
        this.f45772g = cls;
        this.f45773h = c48964sy3;
    }

    @Override // p000.InterfaceC38133ak2
    /* renamed from: a */
    public void mo3854a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f45767b.mo11760d(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f45770e).putInt(this.f45771f).array();
        this.f45769d.mo3854a(messageDigest);
        this.f45768c.mo3854a(messageDigest);
        messageDigest.update(bArr);
        InterfaceC47891r96<?> interfaceC47891r96 = this.f45774i;
        if (interfaceC47891r96 != null) {
            interfaceC47891r96.mo3854a(messageDigest);
        }
        this.f45773h.mo3854a(messageDigest);
        messageDigest.update(m75152c());
        this.f45767b.put(bArr);
    }

    /* renamed from: c */
    public final byte[] m75152c() {
        C49711uE2<Class<?>, byte[]> c49711uE2 = f45766j;
        byte[] m10525g = c49711uE2.m10525g(this.f45772g);
        if (m10525g == null) {
            byte[] bytes = this.f45772g.getName().getBytes(InterfaceC38133ak2.f51105a);
            c49711uE2.m10523k(this.f45772g, bytes);
            return bytes;
        }
        return m10525g;
    }

    @Override // p000.InterfaceC38133ak2
    public boolean equals(Object obj) {
        if (!(obj instanceof YL4)) {
            return false;
        }
        YL4 yl4 = (YL4) obj;
        if (this.f45771f != yl4.f45771f || this.f45770e != yl4.f45770e || !C47029pi6.m18922d(this.f45774i, yl4.f45774i) || !this.f45772g.equals(yl4.f45772g) || !this.f45768c.equals(yl4.f45768c) || !this.f45769d.equals(yl4.f45769d) || !this.f45773h.equals(yl4.f45773h)) {
            return false;
        }
        return true;
    }

    @Override // p000.InterfaceC38133ak2
    public int hashCode() {
        int hashCode = (((((this.f45768c.hashCode() * 31) + this.f45769d.hashCode()) * 31) + this.f45770e) * 31) + this.f45771f;
        InterfaceC47891r96<?> interfaceC47891r96 = this.f45774i;
        if (interfaceC47891r96 != null) {
            hashCode = (hashCode * 31) + interfaceC47891r96.hashCode();
        }
        return (((hashCode * 31) + this.f45772g.hashCode()) * 31) + this.f45773h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f45768c + ", signature=" + this.f45769d + ", width=" + this.f45770e + ", height=" + this.f45771f + ", decodedResourceClass=" + this.f45772g + ", transformation='" + this.f45774i + CoreConstants.SINGLE_QUOTE_CHAR + ", options=" + this.f45773h + CoreConstants.CURLY_RIGHT;
    }
}
