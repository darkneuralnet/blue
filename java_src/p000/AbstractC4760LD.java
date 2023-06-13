package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.Map;
import net.danlew.android.joda.DateUtils;
import p000.AbstractC4760LD;
/* renamed from: LD */
/* loaded from: classes5.dex */
public abstract class AbstractC4760LD<T extends AbstractC4760LD<T>> implements Cloneable {

    /* renamed from: A */
    public boolean f20899A;

    /* renamed from: b */
    public int f20900b;

    /* renamed from: f */
    public Drawable f20904f;

    /* renamed from: g */
    public int f20905g;

    /* renamed from: h */
    public Drawable f20906h;

    /* renamed from: i */
    public int f20907i;

    /* renamed from: n */
    public boolean f20912n;

    /* renamed from: p */
    public Drawable f20914p;

    /* renamed from: q */
    public int f20915q;

    /* renamed from: u */
    public boolean f20919u;

    /* renamed from: v */
    public Resources.Theme f20920v;

    /* renamed from: w */
    public boolean f20921w;

    /* renamed from: x */
    public boolean f20922x;

    /* renamed from: y */
    public boolean f20923y;

    /* renamed from: c */
    public float f20901c = 1.0f;

    /* renamed from: d */
    public B41 f20902d = B41.f1619e;

    /* renamed from: e */
    public P24 f20903e = P24.NORMAL;

    /* renamed from: j */
    public boolean f20908j = true;

    /* renamed from: k */
    public int f20909k = -1;

    /* renamed from: l */
    public int f20910l = -1;

    /* renamed from: m */
    public InterfaceC38133ak2 f20911m = C36762Wa1.m78171c();

    /* renamed from: o */
    public boolean f20913o = true;

    /* renamed from: r */
    public C48964sy3 f20916r = new C48964sy3();

    /* renamed from: s */
    public Map<Class<?>, InterfaceC47891r96<?>> f20917s = new C42538i80();

    /* renamed from: t */
    public Class<?> f20918t = Object.class;

    /* renamed from: z */
    public boolean f20924z = true;

    /* renamed from: Y */
    public static boolean m97569Y(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: A */
    public final C48964sy3 m97590A() {
        return this.f20916r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: A0 */
    public T m97589A0(InterfaceC47891r96<Bitmap> interfaceC47891r96, boolean z) {
        if (this.f20921w) {
            return (T) clone().m97589A0(interfaceC47891r96, z);
        }
        X61 x61 = new X61(interfaceC47891r96, z);
        m97587B0(Bitmap.class, interfaceC47891r96, z);
        m97587B0(Drawable.class, x61, z);
        m97587B0(BitmapDrawable.class, x61.m77404c(), z);
        m97587B0(C49692uC1.class, new C52063yC1(interfaceC47891r96), z);
        return m97538t0();
    }

    /* renamed from: B */
    public final int m97588B() {
        return this.f20909k;
    }

    /* renamed from: B0 */
    public <Y> T m97587B0(Class<Y> cls, InterfaceC47891r96<Y> interfaceC47891r96, boolean z) {
        if (this.f20921w) {
            return (T) clone().m97587B0(cls, interfaceC47891r96, z);
        }
        C52865zZ3.m1111d(cls);
        C52865zZ3.m1111d(interfaceC47891r96);
        this.f20917s.put(cls, interfaceC47891r96);
        this.f20913o = true;
        int i = this.f20900b | 2048 | 65536;
        this.f20900b = i;
        this.f20924z = false;
        if (z) {
            this.f20900b = i | DateUtils.FORMAT_NUMERIC_DATE;
            this.f20912n = true;
        }
        return m97538t0();
    }

    /* renamed from: C */
    public final int m97586C() {
        return this.f20910l;
    }

    /* renamed from: C0 */
    public T m97585C0(boolean z) {
        if (this.f20921w) {
            return (T) clone().m97585C0(z);
        }
        this.f20899A = z;
        this.f20900b |= 1048576;
        return m97538t0();
    }

    /* renamed from: D */
    public final Drawable m97584D() {
        return this.f20906h;
    }

    /* renamed from: G */
    public final int m97583G() {
        return this.f20907i;
    }

    /* renamed from: H */
    public final P24 m97582H() {
        return this.f20903e;
    }

    /* renamed from: I */
    public final Class<?> m97581I() {
        return this.f20918t;
    }

    /* renamed from: J */
    public final InterfaceC38133ak2 m97580J() {
        return this.f20911m;
    }

    /* renamed from: M */
    public final float m97579M() {
        return this.f20901c;
    }

    /* renamed from: N */
    public final Resources.Theme m97578N() {
        return this.f20920v;
    }

    /* renamed from: O */
    public final Map<Class<?>, InterfaceC47891r96<?>> m97577O() {
        return this.f20917s;
    }

    /* renamed from: P */
    public final boolean m97576P() {
        return this.f20899A;
    }

    /* renamed from: Q */
    public final boolean m97575Q() {
        return this.f20922x;
    }

    /* renamed from: S */
    public final boolean m97574S() {
        return this.f20921w;
    }

    /* renamed from: U */
    public final boolean m97573U() {
        return this.f20908j;
    }

    /* renamed from: V */
    public final boolean m97572V() {
        return m97570X(8);
    }

    /* renamed from: W */
    public boolean m97571W() {
        return this.f20924z;
    }

    /* renamed from: X */
    public final boolean m97570X(int i) {
        return m97569Y(this.f20900b, i);
    }

    /* renamed from: Z */
    public final boolean m97568Z() {
        return this.f20913o;
    }

    /* renamed from: a0 */
    public final boolean m97567a0() {
        return this.f20912n;
    }

    /* renamed from: b0 */
    public final boolean m97566b0() {
        return m97570X(2048);
    }

    /* renamed from: c0 */
    public final boolean m97565c0() {
        return C47029pi6.m18906t(this.f20910l, this.f20909k);
    }

    /* renamed from: d */
    public T mo16086d(AbstractC4760LD<?> abstractC4760LD) {
        if (this.f20921w) {
            return (T) clone().mo16086d(abstractC4760LD);
        }
        if (m97569Y(abstractC4760LD.f20900b, 2)) {
            this.f20901c = abstractC4760LD.f20901c;
        }
        if (m97569Y(abstractC4760LD.f20900b, DateUtils.FORMAT_ABBREV_RELATIVE)) {
            this.f20922x = abstractC4760LD.f20922x;
        }
        if (m97569Y(abstractC4760LD.f20900b, 1048576)) {
            this.f20899A = abstractC4760LD.f20899A;
        }
        if (m97569Y(abstractC4760LD.f20900b, 4)) {
            this.f20902d = abstractC4760LD.f20902d;
        }
        if (m97569Y(abstractC4760LD.f20900b, 8)) {
            this.f20903e = abstractC4760LD.f20903e;
        }
        if (m97569Y(abstractC4760LD.f20900b, 16)) {
            this.f20904f = abstractC4760LD.f20904f;
            this.f20905g = 0;
            this.f20900b &= -33;
        }
        if (m97569Y(abstractC4760LD.f20900b, 32)) {
            this.f20905g = abstractC4760LD.f20905g;
            this.f20904f = null;
            this.f20900b &= -17;
        }
        if (m97569Y(abstractC4760LD.f20900b, 64)) {
            this.f20906h = abstractC4760LD.f20906h;
            this.f20907i = 0;
            this.f20900b &= -129;
        }
        if (m97569Y(abstractC4760LD.f20900b, 128)) {
            this.f20907i = abstractC4760LD.f20907i;
            this.f20906h = null;
            this.f20900b &= -65;
        }
        if (m97569Y(abstractC4760LD.f20900b, 256)) {
            this.f20908j = abstractC4760LD.f20908j;
        }
        if (m97569Y(abstractC4760LD.f20900b, 512)) {
            this.f20910l = abstractC4760LD.f20910l;
            this.f20909k = abstractC4760LD.f20909k;
        }
        if (m97569Y(abstractC4760LD.f20900b, 1024)) {
            this.f20911m = abstractC4760LD.f20911m;
        }
        if (m97569Y(abstractC4760LD.f20900b, 4096)) {
            this.f20918t = abstractC4760LD.f20918t;
        }
        if (m97569Y(abstractC4760LD.f20900b, 8192)) {
            this.f20914p = abstractC4760LD.f20914p;
            this.f20915q = 0;
            this.f20900b &= -16385;
        }
        if (m97569Y(abstractC4760LD.f20900b, 16384)) {
            this.f20915q = abstractC4760LD.f20915q;
            this.f20914p = null;
            this.f20900b &= -8193;
        }
        if (m97569Y(abstractC4760LD.f20900b, DateUtils.FORMAT_ABBREV_WEEKDAY)) {
            this.f20920v = abstractC4760LD.f20920v;
        }
        if (m97569Y(abstractC4760LD.f20900b, 65536)) {
            this.f20913o = abstractC4760LD.f20913o;
        }
        if (m97569Y(abstractC4760LD.f20900b, DateUtils.FORMAT_NUMERIC_DATE)) {
            this.f20912n = abstractC4760LD.f20912n;
        }
        if (m97569Y(abstractC4760LD.f20900b, 2048)) {
            this.f20917s.putAll(abstractC4760LD.f20917s);
            this.f20924z = abstractC4760LD.f20924z;
        }
        if (m97569Y(abstractC4760LD.f20900b, 524288)) {
            this.f20923y = abstractC4760LD.f20923y;
        }
        if (!this.f20913o) {
            this.f20917s.clear();
            this.f20912n = false;
            this.f20900b = this.f20900b & (-2049) & (-131073);
            this.f20924z = true;
        }
        this.f20900b |= abstractC4760LD.f20900b;
        this.f20916r.m13299d(abstractC4760LD.f20916r);
        return m97538t0();
    }

    /* renamed from: d0 */
    public T m97564d0() {
        this.f20919u = true;
        return m97540s0();
    }

    /* renamed from: e */
    public T m97563e() {
        if (this.f20919u && !this.f20921w) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.f20921w = true;
        return m97564d0();
    }

    /* renamed from: e0 */
    public T m97562e0() {
        return m97556i0(AbstractC38944c61.f60117e, new C35411Qg0());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AbstractC4760LD)) {
            return false;
        }
        AbstractC4760LD abstractC4760LD = (AbstractC4760LD) obj;
        if (Float.compare(abstractC4760LD.f20901c, this.f20901c) != 0 || this.f20905g != abstractC4760LD.f20905g || !C47029pi6.m18922d(this.f20904f, abstractC4760LD.f20904f) || this.f20907i != abstractC4760LD.f20907i || !C47029pi6.m18922d(this.f20906h, abstractC4760LD.f20906h) || this.f20915q != abstractC4760LD.f20915q || !C47029pi6.m18922d(this.f20914p, abstractC4760LD.f20914p) || this.f20908j != abstractC4760LD.f20908j || this.f20909k != abstractC4760LD.f20909k || this.f20910l != abstractC4760LD.f20910l || this.f20912n != abstractC4760LD.f20912n || this.f20913o != abstractC4760LD.f20913o || this.f20922x != abstractC4760LD.f20922x || this.f20923y != abstractC4760LD.f20923y || !this.f20902d.equals(abstractC4760LD.f20902d) || this.f20903e != abstractC4760LD.f20903e || !this.f20916r.equals(abstractC4760LD.f20916r) || !this.f20917s.equals(abstractC4760LD.f20917s) || !this.f20918t.equals(abstractC4760LD.f20918t) || !C47029pi6.m18922d(this.f20911m, abstractC4760LD.f20911m) || !C47029pi6.m18922d(this.f20920v, abstractC4760LD.f20920v)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public T m97561f() {
        return m97531y0(AbstractC38944c61.f60117e, new C35411Qg0());
    }

    /* renamed from: f0 */
    public T m97560f0() {
        return m97557h0(AbstractC38944c61.f60116d, new C35645Rg0());
    }

    /* renamed from: g */
    public T m97559g() {
        return m97543q0(AbstractC38944c61.f60116d, new C35645Rg0());
    }

    /* renamed from: g0 */
    public T m97558g0() {
        return m97557h0(AbstractC38944c61.f60115c, new C39358co1());
    }

    @Override // 
    /* renamed from: h */
    public T clone() {
        try {
            T t = (T) super.clone();
            C48964sy3 c48964sy3 = new C48964sy3();
            t.f20916r = c48964sy3;
            c48964sy3.m13299d(this.f20916r);
            C42538i80 c42538i80 = new C42538i80();
            t.f20917s = c42538i80;
            c42538i80.putAll(this.f20917s);
            t.f20919u = false;
            t.f20921w = false;
            return t;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: h0 */
    public final T m97557h0(AbstractC38944c61 abstractC38944c61, InterfaceC47891r96<Bitmap> interfaceC47891r96) {
        return m97541r0(abstractC38944c61, interfaceC47891r96, false);
    }

    public int hashCode() {
        return C47029pi6.m18911o(this.f20920v, C47029pi6.m18911o(this.f20911m, C47029pi6.m18911o(this.f20918t, C47029pi6.m18911o(this.f20917s, C47029pi6.m18911o(this.f20916r, C47029pi6.m18911o(this.f20903e, C47029pi6.m18911o(this.f20902d, C47029pi6.m18910p(this.f20923y, C47029pi6.m18910p(this.f20922x, C47029pi6.m18910p(this.f20913o, C47029pi6.m18910p(this.f20912n, C47029pi6.m18912n(this.f20910l, C47029pi6.m18912n(this.f20909k, C47029pi6.m18910p(this.f20908j, C47029pi6.m18911o(this.f20914p, C47029pi6.m18912n(this.f20915q, C47029pi6.m18911o(this.f20906h, C47029pi6.m18912n(this.f20907i, C47029pi6.m18911o(this.f20904f, C47029pi6.m18912n(this.f20905g, C47029pi6.m18914l(this.f20901c)))))))))))))))))))));
    }

    /* renamed from: i0 */
    public final T m97556i0(AbstractC38944c61 abstractC38944c61, InterfaceC47891r96<Bitmap> interfaceC47891r96) {
        if (this.f20921w) {
            return (T) clone().m97556i0(abstractC38944c61, interfaceC47891r96);
        }
        m97550m(abstractC38944c61);
        return m97589A0(interfaceC47891r96, false);
    }

    /* renamed from: j */
    public T m97555j(Class<?> cls) {
        if (this.f20921w) {
            return (T) clone().m97555j(cls);
        }
        this.f20918t = (Class) C52865zZ3.m1111d(cls);
        this.f20900b |= 4096;
        return m97538t0();
    }

    /* renamed from: k */
    public T m97554k(B41 b41) {
        if (this.f20921w) {
            return (T) clone().m97554k(b41);
        }
        this.f20902d = (B41) C52865zZ3.m1111d(b41);
        this.f20900b |= 4;
        return m97538t0();
    }

    /* renamed from: k0 */
    public T m97553k0(int i, int i2) {
        if (this.f20921w) {
            return (T) clone().m97553k0(i, i2);
        }
        this.f20910l = i;
        this.f20909k = i2;
        this.f20900b |= 512;
        return m97538t0();
    }

    /* renamed from: l */
    public T m97552l() {
        return m97537u0(EC1.f7092b, Boolean.TRUE);
    }

    /* renamed from: l0 */
    public T m97551l0(int i) {
        if (this.f20921w) {
            return (T) clone().m97551l0(i);
        }
        this.f20907i = i;
        this.f20906h = null;
        this.f20900b = (this.f20900b | 128) & (-65);
        return m97538t0();
    }

    /* renamed from: m */
    public T m97550m(AbstractC38944c61 abstractC38944c61) {
        return m97537u0(AbstractC38944c61.f60120h, C52865zZ3.m1111d(abstractC38944c61));
    }

    /* renamed from: n */
    public T m97549n(int i) {
        if (this.f20921w) {
            return (T) clone().m97549n(i);
        }
        this.f20905g = i;
        this.f20904f = null;
        this.f20900b = (this.f20900b | 32) & (-17);
        return m97538t0();
    }

    /* renamed from: n0 */
    public T m97548n0(Drawable drawable) {
        if (this.f20921w) {
            return (T) clone().m97548n0(drawable);
        }
        this.f20906h = drawable;
        this.f20907i = 0;
        this.f20900b = (this.f20900b | 64) & (-129);
        return m97538t0();
    }

    /* renamed from: o */
    public T m97547o(Drawable drawable) {
        if (this.f20921w) {
            return (T) clone().m97547o(drawable);
        }
        this.f20914p = drawable;
        this.f20915q = 0;
        this.f20900b = (this.f20900b | 8192) & (-16385);
        return m97538t0();
    }

    /* renamed from: o0 */
    public T m97546o0(P24 p24) {
        if (this.f20921w) {
            return (T) clone().m97546o0(p24);
        }
        this.f20903e = (P24) C52865zZ3.m1111d(p24);
        this.f20900b |= 8;
        return m97538t0();
    }

    /* renamed from: p */
    public T m97545p() {
        return m97543q0(AbstractC38944c61.f60115c, new C39358co1());
    }

    /* renamed from: q */
    public final B41 m97544q() {
        return this.f20902d;
    }

    /* renamed from: q0 */
    public final T m97543q0(AbstractC38944c61 abstractC38944c61, InterfaceC47891r96<Bitmap> interfaceC47891r96) {
        return m97541r0(abstractC38944c61, interfaceC47891r96, true);
    }

    /* renamed from: r */
    public final int m97542r() {
        return this.f20905g;
    }

    /* renamed from: r0 */
    public final T m97541r0(AbstractC38944c61 abstractC38944c61, InterfaceC47891r96<Bitmap> interfaceC47891r96, boolean z) {
        T m97556i0;
        if (z) {
            m97556i0 = m97531y0(abstractC38944c61, interfaceC47891r96);
        } else {
            m97556i0 = m97556i0(abstractC38944c61, interfaceC47891r96);
        }
        m97556i0.f20924z = true;
        return m97556i0;
    }

    /* renamed from: s0 */
    public final T m97540s0() {
        return this;
    }

    /* renamed from: t */
    public final Drawable m97539t() {
        return this.f20904f;
    }

    /* renamed from: t0 */
    public final T m97538t0() {
        if (!this.f20919u) {
            return m97540s0();
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    /* renamed from: u0 */
    public <Y> T m97537u0(C43035iy3<Y> c43035iy3, Y y) {
        if (this.f20921w) {
            return (T) clone().m97537u0(c43035iy3, y);
        }
        C52865zZ3.m1111d(c43035iy3);
        C52865zZ3.m1111d(y);
        this.f20916r.m13298e(c43035iy3, y);
        return m97538t0();
    }

    /* renamed from: v0 */
    public T m97536v0(InterfaceC38133ak2 interfaceC38133ak2) {
        if (this.f20921w) {
            return (T) clone().m97536v0(interfaceC38133ak2);
        }
        this.f20911m = (InterfaceC38133ak2) C52865zZ3.m1111d(interfaceC38133ak2);
        this.f20900b |= 1024;
        return m97538t0();
    }

    /* renamed from: w */
    public final Drawable m97535w() {
        return this.f20914p;
    }

    /* renamed from: w0 */
    public T m97534w0(float f) {
        if (this.f20921w) {
            return (T) clone().m97534w0(f);
        }
        if (f >= 0.0f && f <= 1.0f) {
            this.f20901c = f;
            this.f20900b |= 2;
            return m97538t0();
        }
        throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
    }

    /* renamed from: x0 */
    public T m97533x0(boolean z) {
        if (this.f20921w) {
            return (T) clone().m97533x0(true);
        }
        this.f20908j = !z;
        this.f20900b |= 256;
        return m97538t0();
    }

    /* renamed from: y */
    public final int m97532y() {
        return this.f20915q;
    }

    /* renamed from: y0 */
    public final T m97531y0(AbstractC38944c61 abstractC38944c61, InterfaceC47891r96<Bitmap> interfaceC47891r96) {
        if (this.f20921w) {
            return (T) clone().m97531y0(abstractC38944c61, interfaceC47891r96);
        }
        m97550m(abstractC38944c61);
        return m97529z0(interfaceC47891r96);
    }

    /* renamed from: z */
    public final boolean m97530z() {
        return this.f20923y;
    }

    /* renamed from: z0 */
    public T m97529z0(InterfaceC47891r96<Bitmap> interfaceC47891r96) {
        return m97589A0(interfaceC47891r96, true);
    }
}
