package p000;

import android.os.Build;
import android.util.Log;
import com.bumptech.glide.C17104c;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.data.InterfaceC17126a;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p000.C48676sV0;
import p000.C49998uj1;
import p000.JS0;
/* renamed from: rV0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class RunnableC48084rV0<R> implements JS0.InterfaceC4085a, Runnable, Comparable<RunnableC48084rV0<?>>, C49998uj1.InterfaceC29291f {

    /* renamed from: A */
    public Object f107154A;

    /* renamed from: B */
    public ZS0 f107155B;

    /* renamed from: C */
    public IS0<?> f107156C;

    /* renamed from: D */
    public volatile JS0 f107157D;

    /* renamed from: E */
    public volatile boolean f107158E;

    /* renamed from: F */
    public volatile boolean f107159F;

    /* renamed from: G */
    public boolean f107160G;

    /* renamed from: e */
    public final InterfaceC27938e f107164e;

    /* renamed from: f */
    public final InterfaceC41591gY3<RunnableC48084rV0<?>> f107165f;

    /* renamed from: i */
    public C17104c f107168i;

    /* renamed from: j */
    public InterfaceC38133ak2 f107169j;

    /* renamed from: k */
    public P24 f107170k;

    /* renamed from: l */
    public C33279Hd1 f107171l;

    /* renamed from: m */
    public int f107172m;

    /* renamed from: n */
    public int f107173n;

    /* renamed from: o */
    public B41 f107174o;

    /* renamed from: p */
    public C48964sy3 f107175p;

    /* renamed from: q */
    public InterfaceC27935b<R> f107176q;

    /* renamed from: r */
    public int f107177r;

    /* renamed from: s */
    public EnumC27941h f107178s;

    /* renamed from: t */
    public EnumC27940g f107179t;

    /* renamed from: u */
    public long f107180u;

    /* renamed from: v */
    public boolean f107181v;

    /* renamed from: w */
    public Object f107182w;

    /* renamed from: x */
    public Thread f107183x;

    /* renamed from: y */
    public InterfaceC38133ak2 f107184y;

    /* renamed from: z */
    public InterfaceC38133ak2 f107185z;

    /* renamed from: b */
    public final C46305oV0<R> f107161b = new C46305oV0<>();

    /* renamed from: c */
    public final List<Throwable> f107162c = new ArrayList();

    /* renamed from: d */
    public final LP5 f107163d = LP5.m96961a();

    /* renamed from: g */
    public final C27937d<?> f107166g = new C27937d<>();

    /* renamed from: h */
    public final C27939f f107167h = new C27939f();

    /* renamed from: rV0$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C27934a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f107186a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f107187b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f107188c;

        static {
            int[] iArr = new int[EnumC41024fb1.values().length];
            f107188c = iArr;
            try {
                iArr[EnumC41024fb1.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f107188c[EnumC41024fb1.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC27941h.values().length];
            f107187b = iArr2;
            try {
                iArr2[EnumC27941h.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f107187b[EnumC27941h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f107187b[EnumC27941h.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f107187b[EnumC27941h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f107187b[EnumC27941h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[EnumC27940g.values().length];
            f107186a = iArr3;
            try {
                iArr3[EnumC27940g.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f107186a[EnumC27940g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f107186a[EnumC27940g.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* renamed from: rV0$b */
    /* loaded from: classes5.dex */
    public interface InterfaceC27935b<R> {
        /* renamed from: b */
        void mo15859b(GlideException glideException);

        /* renamed from: c */
        void mo15858c(VL4<R> vl4, ZS0 zs0, boolean z);

        /* renamed from: d */
        void mo15857d(RunnableC48084rV0<?> runnableC48084rV0);
    }

    /* renamed from: rV0$c */
    /* loaded from: classes5.dex */
    public final class C27936c<Z> implements C48676sV0.InterfaceC28325a<Z> {

        /* renamed from: a */
        public final ZS0 f107189a;

        public C27936c(ZS0 zs0) {
            this.f107189a = zs0;
        }

        @Override // p000.C48676sV0.InterfaceC28325a
        /* renamed from: a */
        public VL4<Z> mo14143a(VL4<Z> vl4) {
            return RunnableC48084rV0.this.m15861v(this.f107189a, vl4);
        }
    }

    /* renamed from: rV0$d */
    /* loaded from: classes5.dex */
    public static class C27937d<Z> {

        /* renamed from: a */
        public InterfaceC38133ak2 f107191a;

        /* renamed from: b */
        public InterfaceC40298eM4<Z> f107192b;

        /* renamed from: c */
        public C43617jx2<Z> f107193c;

        /* renamed from: a */
        public void m15856a() {
            this.f107191a = null;
            this.f107192b = null;
            this.f107193c = null;
        }

        /* renamed from: b */
        public void m15855b(InterfaceC27938e interfaceC27938e, C48964sy3 c48964sy3) {
            NC1.m94206a("DecodeJob.encode");
            try {
                interfaceC27938e.mo15852a().mo1852b(this.f107191a, new DS0(this.f107192b, this.f107193c, c48964sy3));
            } finally {
                this.f107193c.m29674h();
                NC1.m94202e();
            }
        }

        /* renamed from: c */
        public boolean m15854c() {
            return this.f107193c != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: d */
        public <X> void m15853d(InterfaceC38133ak2 interfaceC38133ak2, InterfaceC40298eM4<X> interfaceC40298eM4, C43617jx2<X> c43617jx2) {
            this.f107191a = interfaceC38133ak2;
            this.f107192b = interfaceC40298eM4;
            this.f107193c = c43617jx2;
        }
    }

    /* renamed from: rV0$e */
    /* loaded from: classes5.dex */
    public interface InterfaceC27938e {
        /* renamed from: a */
        InterfaceC52578z41 mo15852a();
    }

    /* renamed from: rV0$f */
    /* loaded from: classes5.dex */
    public static class C27939f {

        /* renamed from: a */
        public boolean f107194a;

        /* renamed from: b */
        public boolean f107195b;

        /* renamed from: c */
        public boolean f107196c;

        /* renamed from: a */
        public final boolean m15851a(boolean z) {
            return (this.f107196c || z || this.f107195b) && this.f107194a;
        }

        /* renamed from: b */
        public synchronized boolean m15850b() {
            this.f107195b = true;
            return m15851a(false);
        }

        /* renamed from: c */
        public synchronized boolean m15849c() {
            this.f107196c = true;
            return m15851a(false);
        }

        /* renamed from: d */
        public synchronized boolean m15848d(boolean z) {
            this.f107194a = true;
            return m15851a(z);
        }

        /* renamed from: e */
        public synchronized void m15847e() {
            this.f107195b = false;
            this.f107194a = false;
            this.f107196c = false;
        }
    }

    /* renamed from: rV0$g */
    /* loaded from: classes5.dex */
    public enum EnumC27940g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* renamed from: rV0$h */
    /* loaded from: classes5.dex */
    public enum EnumC27941h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    public RunnableC48084rV0(InterfaceC27938e interfaceC27938e, InterfaceC41591gY3<RunnableC48084rV0<?>> interfaceC41591gY3) {
        this.f107164e = interfaceC27938e;
        this.f107165f = interfaceC41591gY3;
    }

    /* renamed from: E */
    public final void m15888E() {
        this.f107167h.m15847e();
        this.f107166g.m15856a();
        this.f107161b.m20984a();
        this.f107158E = false;
        this.f107168i = null;
        this.f107169j = null;
        this.f107175p = null;
        this.f107170k = null;
        this.f107171l = null;
        this.f107176q = null;
        this.f107178s = null;
        this.f107157D = null;
        this.f107183x = null;
        this.f107184y = null;
        this.f107154A = null;
        this.f107155B = null;
        this.f107156C = null;
        this.f107180u = 0L;
        this.f107159F = false;
        this.f107182w = null;
        this.f107162c.clear();
        this.f107165f.mo9829b(this);
    }

    /* renamed from: F */
    public final void m15887F(EnumC27940g enumC27940g) {
        this.f107179t = enumC27940g;
        this.f107176q.mo15857d(this);
    }

    /* renamed from: H */
    public final void m15886H() {
        this.f107183x = Thread.currentThread();
        this.f107180u = C49546tx2.m11168b();
        boolean z = false;
        while (!this.f107159F && this.f107157D != null && !(z = this.f107157D.mo77099b())) {
            this.f107178s = m15872k(this.f107178s);
            this.f107157D = m15873j();
            if (this.f107178s == EnumC27941h.SOURCE) {
                m15887F(EnumC27940g.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.f107178s == EnumC27941h.FINISHED || this.f107159F) && !z) {
            m15864s();
        }
    }

    /* renamed from: J */
    public final <Data, ResourceType> VL4<R> m15885J(Data data, ZS0 zs0, C42984it2<Data, ResourceType, R> c42984it2) throws GlideException {
        C48964sy3 m15871l = m15871l(zs0);
        InterfaceC17126a<Data> m53167l = this.f107168i.m53125i().m53167l(data);
        try {
            return c42984it2.m31681a(m53167l, m15871l, this.f107172m, this.f107173n, new C27936c(zs0));
        } finally {
            m53167l.cleanup();
        }
    }

    /* renamed from: K */
    public final void m15884K() {
        int i = C27934a.f107186a[this.f107179t.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    m15874i();
                    return;
                }
                throw new IllegalStateException("Unrecognized run reason: " + this.f107179t);
            }
            m15886H();
            return;
        }
        this.f107178s = m15872k(EnumC27941h.INITIALIZE);
        this.f107157D = m15873j();
        m15886H();
    }

    /* renamed from: L */
    public final void m15883L() {
        Throwable th;
        this.f107163d.mo96959c();
        if (this.f107158E) {
            if (this.f107162c.isEmpty()) {
                th = null;
            } else {
                List<Throwable> list = this.f107162c;
                th = list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.f107158E = true;
    }

    /* renamed from: M */
    public boolean m15882M() {
        EnumC27941h m15872k = m15872k(EnumC27941h.INITIALIZE);
        if (m15872k != EnumC27941h.RESOURCE_CACHE && m15872k != EnumC27941h.DATA_CACHE) {
            return false;
        }
        return true;
    }

    @Override // p000.JS0.InterfaceC4085a
    /* renamed from: a */
    public void mo15881a(InterfaceC38133ak2 interfaceC38133ak2, Exception exc, IS0<?> is0, ZS0 zs0) {
        is0.cleanup();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        glideException.m53077j(interfaceC38133ak2, zs0, is0.mo6834a());
        this.f107162c.add(glideException);
        if (Thread.currentThread() != this.f107183x) {
            m15887F(EnumC27940g.SWITCH_TO_SOURCE_SERVICE);
        } else {
            m15886H();
        }
    }

    /* renamed from: b */
    public void m15880b() {
        this.f107159F = true;
        JS0 js0 = this.f107157D;
        if (js0 != null) {
            js0.cancel();
        }
    }

    @Override // p000.JS0.InterfaceC4085a
    /* renamed from: c */
    public void mo15879c(InterfaceC38133ak2 interfaceC38133ak2, Object obj, IS0<?> is0, ZS0 zs0, InterfaceC38133ak2 interfaceC38133ak22) {
        this.f107184y = interfaceC38133ak2;
        this.f107154A = obj;
        this.f107156C = is0;
        this.f107155B = zs0;
        this.f107185z = interfaceC38133ak22;
        boolean z = false;
        if (interfaceC38133ak2 != this.f107161b.m20982c().get(0)) {
            z = true;
        }
        this.f107160G = z;
        if (Thread.currentThread() != this.f107183x) {
            m15887F(EnumC27940g.DECODE_DATA);
            return;
        }
        NC1.m94206a("DecodeJob.decodeFromRetrievedData");
        try {
            m15874i();
        } finally {
            NC1.m94202e();
        }
    }

    @Override // p000.JS0.InterfaceC4085a
    /* renamed from: d */
    public void mo15878d() {
        m15887F(EnumC27940g.SWITCH_TO_SOURCE_SERVICE);
    }

    @Override // p000.C49998uj1.InterfaceC29291f
    /* renamed from: e */
    public LP5 mo9828e() {
        return this.f107163d;
    }

    @Override // java.lang.Comparable
    /* renamed from: f */
    public int compareTo(RunnableC48084rV0<?> runnableC48084rV0) {
        int m15870m = m15870m() - runnableC48084rV0.m15870m();
        if (m15870m == 0) {
            return this.f107177r - runnableC48084rV0.f107177r;
        }
        return m15870m;
    }

    /* renamed from: g */
    public final <Data> VL4<R> m15876g(IS0<?> is0, Data data, ZS0 zs0) throws GlideException {
        if (data == null) {
            is0.cleanup();
            return null;
        }
        try {
            long m11168b = C49546tx2.m11168b();
            VL4<R> m15875h = m15875h(data, zs0);
            if (Log.isLoggable("DecodeJob", 2)) {
                m15868o("Decoded result " + m15875h, m11168b);
            }
            return m15875h;
        } finally {
            is0.cleanup();
        }
    }

    /* renamed from: h */
    public final <Data> VL4<R> m15875h(Data data, ZS0 zs0) throws GlideException {
        return m15885J(data, zs0, (C42984it2<Data, ?, R>) this.f107161b.m20977h(data.getClass()));
    }

    /* renamed from: i */
    public final void m15874i() {
        VL4<R> vl4;
        if (Log.isLoggable("DecodeJob", 2)) {
            long j = this.f107180u;
            m15867p("Retrieved data", j, "data: " + this.f107154A + ", cache key: " + this.f107184y + ", fetcher: " + this.f107156C);
        }
        try {
            vl4 = m15876g(this.f107156C, this.f107154A, this.f107155B);
        } catch (GlideException e) {
            e.m53078i(this.f107185z, this.f107155B);
            this.f107162c.add(e);
            vl4 = null;
        }
        if (vl4 != null) {
            m15865r(vl4, this.f107155B, this.f107160G);
        } else {
            m15886H();
        }
    }

    /* renamed from: j */
    public final JS0 m15873j() {
        int i = C27934a.f107187b[this.f107178s.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return null;
                    }
                    throw new IllegalStateException("Unrecognized stage: " + this.f107178s);
                }
                return new CN5(this.f107161b, this);
            }
            return new BS0(this.f107161b, this);
        }
        return new XL4(this.f107161b, this);
    }

    /* renamed from: k */
    public final EnumC27941h m15872k(EnumC27941h enumC27941h) {
        int i = C27934a.f107187b[enumC27941h.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    if (i == 5) {
                        if (this.f107174o.mo114755b()) {
                            return EnumC27941h.RESOURCE_CACHE;
                        }
                        return m15872k(EnumC27941h.RESOURCE_CACHE);
                    }
                    throw new IllegalArgumentException("Unrecognized stage: " + enumC27941h);
                }
                return EnumC27941h.FINISHED;
            } else if (this.f107181v) {
                return EnumC27941h.FINISHED;
            } else {
                return EnumC27941h.SOURCE;
            }
        } else if (this.f107174o.mo114756a()) {
            return EnumC27941h.DATA_CACHE;
        } else {
            return m15872k(EnumC27941h.DATA_CACHE);
        }
    }

    /* renamed from: l */
    public final C48964sy3 m15871l(ZS0 zs0) {
        boolean z;
        C48964sy3 c48964sy3 = this.f107175p;
        if (Build.VERSION.SDK_INT < 26) {
            return c48964sy3;
        }
        if (zs0 != ZS0.RESOURCE_DISK_CACHE && !this.f107161b.m20961x()) {
            z = false;
        } else {
            z = true;
        }
        C43035iy3<Boolean> c43035iy3 = C42519i61.f86742j;
        Boolean bool = (Boolean) c48964sy3.m13300c(c43035iy3);
        if (bool != null && (!bool.booleanValue() || z)) {
            return c48964sy3;
        }
        C48964sy3 c48964sy32 = new C48964sy3();
        c48964sy32.m13299d(this.f107175p);
        c48964sy32.m13298e(c43035iy3, Boolean.valueOf(z));
        return c48964sy32;
    }

    /* renamed from: m */
    public final int m15870m() {
        return this.f107170k.ordinal();
    }

    /* renamed from: n */
    public RunnableC48084rV0<R> m15869n(C17104c c17104c, Object obj, C33279Hd1 c33279Hd1, InterfaceC38133ak2 interfaceC38133ak2, int i, int i2, Class<?> cls, Class<R> cls2, P24 p24, B41 b41, Map<Class<?>, InterfaceC47891r96<?>> map, boolean z, boolean z2, boolean z3, C48964sy3 c48964sy3, InterfaceC27935b<R> interfaceC27935b, int i3) {
        this.f107161b.m20963v(c17104c, obj, interfaceC38133ak2, i, i2, b41, cls, cls2, p24, c48964sy3, map, z, z2, this.f107164e);
        this.f107168i = c17104c;
        this.f107169j = interfaceC38133ak2;
        this.f107170k = p24;
        this.f107171l = c33279Hd1;
        this.f107172m = i;
        this.f107173n = i2;
        this.f107174o = b41;
        this.f107181v = z3;
        this.f107175p = c48964sy3;
        this.f107176q = interfaceC27935b;
        this.f107177r = i3;
        this.f107179t = EnumC27940g.INITIALIZE;
        this.f107182w = obj;
        return this;
    }

    /* renamed from: o */
    public final void m15868o(String str, long j) {
        m15867p(str, j, null);
    }

    /* renamed from: p */
    public final void m15867p(String str, long j, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(C49546tx2.m11169a(j));
        sb.append(", load key: ");
        sb.append(this.f107171l);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb.toString());
    }

    /* renamed from: q */
    public final void m15866q(VL4<R> vl4, ZS0 zs0, boolean z) {
        m15883L();
        this.f107176q.mo15858c(vl4, zs0, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: r */
    public final void m15865r(VL4<R> vl4, ZS0 zs0, boolean z) {
        C43617jx2 c43617jx2;
        NC1.m94206a("DecodeJob.notifyEncodeAndRelease");
        try {
            if (vl4 instanceof InterfaceC50187v22) {
                ((InterfaceC50187v22) vl4).mo5711c();
            }
            if (this.f107166g.m15854c()) {
                vl4 = C43617jx2.m29676f(vl4);
                c43617jx2 = vl4;
            } else {
                c43617jx2 = 0;
            }
            m15866q(vl4, zs0, z);
            this.f107178s = EnumC27941h.ENCODE;
            if (this.f107166g.m15854c()) {
                this.f107166g.m15855b(this.f107164e, this.f107175p);
            }
            if (c43617jx2 != 0) {
                c43617jx2.m29674h();
            }
            m15863t();
        } finally {
            NC1.m94202e();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        NC1.m94204c("DecodeJob#run(reason=%s, model=%s)", this.f107179t, this.f107182w);
        IS0<?> is0 = this.f107156C;
        try {
            try {
                if (this.f107159F) {
                    m15864s();
                    if (is0 != null) {
                        is0.cleanup();
                    }
                    NC1.m94202e();
                    return;
                }
                m15884K();
                if (is0 != null) {
                    is0.cleanup();
                }
                NC1.m94202e();
            } catch (J80 e) {
                throw e;
            }
        }
    }

    /* renamed from: s */
    public final void m15864s() {
        m15883L();
        this.f107176q.mo15859b(new GlideException("Failed to load resource", new ArrayList(this.f107162c)));
        m15862u();
    }

    /* renamed from: t */
    public final void m15863t() {
        if (this.f107167h.m15850b()) {
            m15888E();
        }
    }

    /* renamed from: u */
    public final void m15862u() {
        if (this.f107167h.m15849c()) {
            m15888E();
        }
    }

    /* renamed from: v */
    public <Z> VL4<Z> m15861v(ZS0 zs0, VL4<Z> vl4) {
        VL4<Z> vl42;
        InterfaceC47891r96<Z> interfaceC47891r96;
        EnumC41024fb1 enumC41024fb1;
        InterfaceC38133ak2 cs0;
        Class<?> cls = vl4.get().getClass();
        InterfaceC40298eM4<Z> interfaceC40298eM4 = null;
        if (zs0 != ZS0.RESOURCE_DISK_CACHE) {
            InterfaceC47891r96<Z> m20966s = this.f107161b.m20966s(cls);
            interfaceC47891r96 = m20966s;
            vl42 = m20966s.mo3853b(this.f107168i, vl4, this.f107172m, this.f107173n);
        } else {
            vl42 = vl4;
            interfaceC47891r96 = null;
        }
        if (!vl4.equals(vl42)) {
            vl4.mo5712b();
        }
        if (this.f107161b.m20962w(vl42)) {
            interfaceC40298eM4 = this.f107161b.m20971n(vl42);
            enumC41024fb1 = interfaceC40298eM4.mo7266a(this.f107175p);
        } else {
            enumC41024fb1 = EnumC41024fb1.NONE;
        }
        InterfaceC40298eM4 interfaceC40298eM42 = interfaceC40298eM4;
        if (this.f107174o.mo114753d(!this.f107161b.m20960y(this.f107184y), zs0, enumC41024fb1)) {
            if (interfaceC40298eM42 != null) {
                int i = C27934a.f107188c[enumC41024fb1.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        cs0 = new YL4(this.f107161b.m20983b(), this.f107184y, this.f107169j, this.f107172m, this.f107173n, interfaceC47891r96, cls, this.f107175p);
                    } else {
                        throw new IllegalArgumentException("Unknown strategy: " + enumC41024fb1);
                    }
                } else {
                    cs0 = new CS0(this.f107184y, this.f107169j);
                }
                C43617jx2 m29676f = C43617jx2.m29676f(vl42);
                this.f107166g.m15853d(cs0, interfaceC40298eM42, m29676f);
                return m29676f;
            }
            throw new Registry.NoResultEncoderAvailableException(vl42.get().getClass());
        }
        return vl42;
    }

    /* renamed from: w */
    public void m15860w(boolean z) {
        if (this.f107167h.m15848d(z)) {
            m15888E();
        }
    }
}
