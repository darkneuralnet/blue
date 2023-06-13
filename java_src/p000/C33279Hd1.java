package p000;

import ch.qos.logback.core.CoreConstants;
import java.security.MessageDigest;
import java.util.Map;
/* renamed from: Hd1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C33279Hd1 implements InterfaceC38133ak2 {

    /* renamed from: b */
    public final Object f13657b;

    /* renamed from: c */
    public final int f13658c;

    /* renamed from: d */
    public final int f13659d;

    /* renamed from: e */
    public final Class<?> f13660e;

    /* renamed from: f */
    public final Class<?> f13661f;

    /* renamed from: g */
    public final InterfaceC38133ak2 f13662g;

    /* renamed from: h */
    public final Map<Class<?>, InterfaceC47891r96<?>> f13663h;

    /* renamed from: i */
    public final C48964sy3 f13664i;

    /* renamed from: j */
    public int f13665j;

    public C33279Hd1(Object obj, InterfaceC38133ak2 interfaceC38133ak2, int i, int i2, Map<Class<?>, InterfaceC47891r96<?>> map, Class<?> cls, Class<?> cls2, C48964sy3 c48964sy3) {
        this.f13657b = C52865zZ3.m1111d(obj);
        this.f13662g = (InterfaceC38133ak2) C52865zZ3.m1110e(interfaceC38133ak2, "Signature must not be null");
        this.f13658c = i;
        this.f13659d = i2;
        this.f13663h = (Map) C52865zZ3.m1111d(map);
        this.f13660e = (Class) C52865zZ3.m1110e(cls, "Resource class must not be null");
        this.f13661f = (Class) C52865zZ3.m1110e(cls2, "Transcode class must not be null");
        this.f13664i = (C48964sy3) C52865zZ3.m1111d(c48964sy3);
    }

    @Override // p000.InterfaceC38133ak2
    /* renamed from: a */
    public void mo3854a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceC38133ak2
    public boolean equals(Object obj) {
        if (!(obj instanceof C33279Hd1)) {
            return false;
        }
        C33279Hd1 c33279Hd1 = (C33279Hd1) obj;
        if (!this.f13657b.equals(c33279Hd1.f13657b) || !this.f13662g.equals(c33279Hd1.f13662g) || this.f13659d != c33279Hd1.f13659d || this.f13658c != c33279Hd1.f13658c || !this.f13663h.equals(c33279Hd1.f13663h) || !this.f13660e.equals(c33279Hd1.f13660e) || !this.f13661f.equals(c33279Hd1.f13661f) || !this.f13664i.equals(c33279Hd1.f13664i)) {
            return false;
        }
        return true;
    }

    @Override // p000.InterfaceC38133ak2
    public int hashCode() {
        if (this.f13665j == 0) {
            int hashCode = this.f13657b.hashCode();
            this.f13665j = hashCode;
            int hashCode2 = (((((hashCode * 31) + this.f13662g.hashCode()) * 31) + this.f13658c) * 31) + this.f13659d;
            this.f13665j = hashCode2;
            int hashCode3 = (hashCode2 * 31) + this.f13663h.hashCode();
            this.f13665j = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.f13660e.hashCode();
            this.f13665j = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f13661f.hashCode();
            this.f13665j = hashCode5;
            this.f13665j = (hashCode5 * 31) + this.f13664i.hashCode();
        }
        return this.f13665j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f13657b + ", width=" + this.f13658c + ", height=" + this.f13659d + ", resourceClass=" + this.f13660e + ", transcodeClass=" + this.f13661f + ", signature=" + this.f13662g + ", hashCode=" + this.f13665j + ", transformations=" + this.f13663h + ", options=" + this.f13664i + CoreConstants.CURLY_RIGHT;
    }
}
