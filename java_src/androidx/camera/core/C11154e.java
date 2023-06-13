package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.C11154e;
import androidx.camera.core.C11240m;
import androidx.camera.core.C11242n;
import androidx.camera.core.InterfaceC11183i;
import androidx.camera.core.impl.C11203h;
import androidx.camera.core.impl.C11209m;
import androidx.camera.core.impl.C11210n;
import androidx.camera.core.impl.C11213q;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.InterfaceC11197f;
import androidx.camera.core.impl.InterfaceC11206k;
import androidx.camera.core.impl.InterfaceC11208l;
import androidx.camera.core.impl.InterfaceC11225s;
import co.bird.android.model.Detail;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.UUID;
import java.util.concurrent.Executor;
import p000.InterfaceC36578Vf6;
/* renamed from: androidx.camera.core.e */
/* loaded from: classes.dex */
public final class C11154e extends AbstractC11253p {

    /* renamed from: r */
    public static final C11158d f52446r = new C11158d();

    /* renamed from: s */
    public static final Boolean f52447s = null;

    /* renamed from: n */
    public final AbstractC11160f f52448n;

    /* renamed from: o */
    public final Object f52449o;

    /* renamed from: p */
    public InterfaceC11155a f52450p;

    /* renamed from: q */
    public DeferrableSurface f52451q;

    /* renamed from: androidx.camera.core.e$a */
    /* loaded from: classes.dex */
    public interface InterfaceC11155a {
        /* renamed from: a */
        default void m69620a(Matrix matrix) {
        }

        /* renamed from: b */
        default Size m69619b() {
            return null;
        }

        /* renamed from: c */
        default int m69618c() {
            return 0;
        }

        /* renamed from: d */
        void mo968d(InterfaceC11183i interfaceC11183i);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.e$b */
    /* loaded from: classes.dex */
    public @interface InterfaceC11156b {
    }

    /* renamed from: androidx.camera.core.e$c */
    /* loaded from: classes.dex */
    public static final class C11157c implements InterfaceC11206k.InterfaceC11207a<C11157c>, InterfaceC11225s.InterfaceC11226a<C11154e, C11203h, C11157c> {

        /* renamed from: a */
        public final C11209m f52452a;

        public C11157c() {
            this(C11209m.m69372V());
        }

        /* renamed from: f */
        public static C11157c m69616f(InterfaceC11197f interfaceC11197f) {
            return new C11157c(C11209m.m69371W(interfaceC11197f));
        }

        @Override // p000.InterfaceC32388Di1
        /* renamed from: b */
        public InterfaceC11208l mo1343b() {
            return this.f52452a;
        }

        /* renamed from: e */
        public C11154e m69617e() {
            C11203h mo1341d = mo1341d();
            InterfaceC11206k.m69385F(mo1341d);
            return new C11154e(mo1341d);
        }

        @Override // androidx.camera.core.impl.InterfaceC11225s.InterfaceC11226a
        /* renamed from: g */
        public C11203h mo1341d() {
            return new C11203h(C11210n.m69366T(this.f52452a));
        }

        /* renamed from: h */
        public C11157c m69614h(int i) {
            mo1343b().mo69373C(C11203h.f52608F, Integer.valueOf(i));
            return this;
        }

        /* renamed from: i */
        public C11157c m69613i(Size size) {
            mo1343b().mo69373C(InterfaceC11206k.f52631q, size);
            return this;
        }

        /* renamed from: j */
        public C11157c m69612j(int i) {
            mo1343b().mo69373C(InterfaceC11225s.f52676z, Integer.valueOf(i));
            return this;
        }

        /* renamed from: k */
        public C11157c m69611k(int i) {
            if (i == -1) {
                i = 0;
            }
            mo1343b().mo69373C(InterfaceC11206k.f52626l, Integer.valueOf(i));
            return this;
        }

        /* renamed from: l */
        public C11157c m69610l(Class<C11154e> cls) {
            mo1343b().mo69373C(RY5.f32204c, cls);
            if (mo1343b().mo69360d(RY5.f32203b, null) == null) {
                m69609m(cls.getCanonicalName() + Detail.EMPTY_CHAR + UUID.randomUUID());
            }
            return this;
        }

        /* renamed from: m */
        public C11157c m69609m(String str) {
            mo1343b().mo69373C(RY5.f32203b, str);
            return this;
        }

        @Override // androidx.camera.core.impl.InterfaceC11206k.InterfaceC11207a
        /* renamed from: n */
        public C11157c mo69157c(Size size) {
            mo1343b().mo69373C(InterfaceC11206k.f52630p, size);
            return this;
        }

        @Override // androidx.camera.core.impl.InterfaceC11206k.InterfaceC11207a
        /* renamed from: o */
        public C11157c mo69158a(int i) {
            mo1343b().mo69373C(InterfaceC11206k.f52627m, Integer.valueOf(i));
            return this;
        }

        public C11157c(C11209m c11209m) {
            this.f52452a = c11209m;
            Class cls = (Class) c11209m.mo69360d(RY5.f32204c, null);
            if (cls != null && !cls.equals(C11154e.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            m69610l(C11154e.class);
        }
    }

    /* renamed from: androidx.camera.core.e$d */
    /* loaded from: classes.dex */
    public static final class C11158d {

        /* renamed from: a */
        public static final Size f52453a;

        /* renamed from: b */
        public static final C11203h f52454b;

        static {
            Size size = new Size(640, 480);
            f52453a = size;
            f52454b = new C11157c().m69613i(size).m69612j(1).m69611k(0).mo1341d();
        }

        /* renamed from: a */
        public C11203h m69606a() {
            return f52454b;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.e$e */
    /* loaded from: classes.dex */
    public @interface InterfaceC11159e {
    }

    public C11154e(C11203h c11203h) {
        super(c11203h);
        this.f52449o = new Object();
        if (((C11203h) m69058i()).m69402R(0) == 1) {
            this.f52448n = new DW1();
        } else {
            this.f52448n = new C11161g(c11203h.m10932x(C31631Ac0.m115448b()));
        }
        this.f52448n.m69590t(m69629c0());
        this.f52448n.m69589u(m69627e0());
    }

    /* renamed from: f0 */
    public static /* synthetic */ void m69626f0(C11242n c11242n, C11242n c11242n2) {
        c11242n.m69125m();
        if (c11242n2 != null) {
            c11242n2.m69125m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public /* synthetic */ void m69625g0(String str, C11203h c11203h, BR5 br5, C11213q c11213q, C11213q.EnumC11220f enumC11220f) {
        m69634X();
        this.f52448n.mo69583g();
        if (m69047w(str)) {
            m69068S(m69633Y(str, c11203h, br5).m69331m());
            m69078C();
        }
    }

    @Override // androidx.camera.core.AbstractC11253p
    /* renamed from: F */
    public void mo3497F() {
        this.f52448n.m69602f();
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [androidx.camera.core.impl.p, androidx.camera.core.impl.s] */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.camera.core.impl.s<?>, androidx.camera.core.impl.s] */
    @Override // androidx.camera.core.AbstractC11253p
    /* renamed from: H */
    public InterfaceC11225s<?> mo3496H(InterfaceC33962Kb0 interfaceC33962Kb0, InterfaceC11225s.InterfaceC11226a<?, ?, ?> interfaceC11226a) {
        Size size;
        Boolean m69630b0 = m69630b0();
        boolean m83239a = interfaceC33962Kb0.mo98716k().m83239a(InterfaceC32381Dh3.class);
        AbstractC11160f abstractC11160f = this.f52448n;
        if (m69630b0 != null) {
            m83239a = m69630b0.booleanValue();
        }
        abstractC11160f.m69591s(m83239a);
        synchronized (this.f52449o) {
            InterfaceC11155a interfaceC11155a = this.f52450p;
            if (interfaceC11155a != null) {
                size = interfaceC11155a.m69619b();
            } else {
                size = null;
            }
        }
        if (size != null) {
            InterfaceC11208l mo1343b = interfaceC11226a.mo1343b();
            InterfaceC11197f.AbstractC11198a<C11240m> abstractC11198a = InterfaceC11206k.f52634t;
            if (!mo1343b.mo69359e(abstractC11198a)) {
                if (interfaceC33962Kb0.mo100138e(((Integer) interfaceC11226a.mo1343b().mo69360d(InterfaceC11206k.f52627m, 0)).intValue()) % 180 == 90) {
                    size = new Size(size.getHeight(), size.getWidth());
                }
                ?? mo1341d = interfaceC11226a.mo1341d();
                InterfaceC11197f.AbstractC11198a<Size> abstractC11198a2 = InterfaceC11206k.f52630p;
                if (!mo1341d.mo69359e(abstractC11198a2)) {
                    interfaceC11226a.mo1343b().mo69373C(abstractC11198a2, size);
                }
            } else {
                C11240m c11240m = (C11240m) interfaceC11226a.mo1343b().mo69363a(abstractC11198a);
                if (c11240m.m69144c() == null) {
                    C11240m.C11241a m69140b = C11240m.C11241a.m69140b(c11240m);
                    m69140b.m69138d(size);
                    interfaceC11226a.mo1343b().mo69373C(abstractC11198a, m69140b.m69141a());
                }
            }
        }
        return interfaceC11226a.mo1341d();
    }

    @Override // androidx.camera.core.AbstractC11253p
    /* renamed from: K */
    public BR5 mo3493K(BR5 br5) {
        m69068S(m69633Y(m69059h(), (C11203h) m69058i(), br5).m69331m());
        return br5;
    }

    @Override // androidx.camera.core.AbstractC11253p
    /* renamed from: L */
    public void mo3492L() {
        m69634X();
        this.f52448n.m69599j();
    }

    @Override // androidx.camera.core.AbstractC11253p
    /* renamed from: O */
    public void mo69072O(Matrix matrix) {
        super.mo69072O(matrix);
        this.f52448n.m69586x(matrix);
    }

    @Override // androidx.camera.core.AbstractC11253p
    /* renamed from: Q */
    public void mo69070Q(Rect rect) {
        super.mo69070Q(rect);
        this.f52448n.m69585y(rect);
    }

    /* renamed from: X */
    public void m69634X() {
        O36.m92961a();
        DeferrableSurface deferrableSurface = this.f52451q;
        if (deferrableSurface != null) {
            deferrableSurface.m69470c();
            this.f52451q = null;
        }
    }

    /* renamed from: Y */
    public C11213q.C11215b m69633Y(final String str, final C11203h c11203h, final BR5 br5) {
        int i;
        final C11242n c11242n;
        boolean z;
        int width;
        int height;
        int i2;
        boolean z2;
        final C11242n c11242n2;
        O36.m92961a();
        Size mo31669c = br5.mo31669c();
        Executor executor = (Executor) HZ3.m103731g(c11203h.m10932x(C31631Ac0.m115448b()));
        boolean z3 = true;
        if (m69632Z() == 1) {
            i = m69631a0();
        } else {
            i = 4;
        }
        int i3 = i;
        if (c11203h.m69400T() != null) {
            c11242n = new C11242n(c11203h.m69400T().m96710a(mo31669c.getWidth(), mo31669c.getHeight(), m69056l(), i3, 0L));
        } else {
            c11242n = new C11242n(MX1.m95184a(mo31669c.getWidth(), mo31669c.getHeight(), m69056l(), i3));
        }
        if (m69061f() != null) {
            z = m69628d0(m69061f());
        } else {
            z = false;
        }
        if (z) {
            width = mo31669c.getHeight();
        } else {
            width = mo31669c.getWidth();
        }
        if (z) {
            height = mo31669c.getWidth();
        } else {
            height = mo31669c.getHeight();
        }
        if (m69629c0() == 2) {
            i2 = 1;
        } else {
            i2 = 35;
        }
        if (m69056l() == 35 && m69629c0() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (m69056l() != 35 || ((m69061f() == null || m69053o(m69061f()) == 0) && !Boolean.TRUE.equals(m69630b0()))) {
            z3 = false;
        }
        if (!z2 && !z3) {
            c11242n2 = null;
        } else {
            c11242n2 = new C11242n(MX1.m95184a(width, height, i2, c11242n.mo69135c()));
        }
        if (c11242n2 != null) {
            this.f52448n.m69588v(c11242n2);
        }
        m69621k0();
        c11242n.mo69134d(this.f52448n, executor);
        C11213q.C11215b m69329o = C11213q.C11215b.m69329o(c11203h, br5.mo31669c());
        DeferrableSurface deferrableSurface = this.f52451q;
        if (deferrableSurface != null) {
            deferrableSurface.m69470c();
        }
        NY1 ny1 = new NY1(c11242n.mo69137a(), mo31669c, m69056l());
        this.f52451q = ny1;
        ny1.m69464i().addListener(new Runnable() { // from class: yW1
            @Override // java.lang.Runnable
            public final void run() {
                C11154e.m69626f0(C11242n.this, c11242n2);
            }
        }, C31631Ac0.m115446d());
        m69329o.m69326r(br5.mo31670b());
        m69329o.m69333k(this.f52451q);
        m69329o.m69338f(new C11213q.InterfaceC11216c() { // from class: zW1
            @Override // androidx.camera.core.impl.C11213q.InterfaceC11216c
            /* renamed from: a */
            public final void mo1277a(C11213q c11213q, C11213q.EnumC11220f enumC11220f) {
                C11154e.this.m69625g0(str, c11203h, br5, c11213q, enumC11220f);
            }
        });
        return m69329o;
    }

    /* renamed from: Z */
    public int m69632Z() {
        return ((C11203h) m69058i()).m69402R(0);
    }

    /* renamed from: a0 */
    public int m69631a0() {
        return ((C11203h) m69058i()).m69401S(6);
    }

    /* renamed from: b0 */
    public Boolean m69630b0() {
        return ((C11203h) m69058i()).m69399U(f52447s);
    }

    /* renamed from: c0 */
    public int m69629c0() {
        return ((C11203h) m69058i()).m69398V(1);
    }

    /* renamed from: d0 */
    public final boolean m69628d0(InterfaceC34196Lb0 interfaceC34196Lb0) {
        if (!m69627e0() || m69053o(interfaceC34196Lb0) % 180 == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: e0 */
    public boolean m69627e0() {
        return ((C11203h) m69058i()).m69397W(Boolean.FALSE).booleanValue();
    }

    /* renamed from: i0 */
    public void m69623i0(Executor executor, final InterfaceC11155a interfaceC11155a) {
        synchronized (this.f52449o) {
            this.f52448n.m69592r(executor, new InterfaceC11155a() { // from class: AW1
                @Override // androidx.camera.core.C11154e.InterfaceC11155a
                /* renamed from: d */
                public final void mo968d(InterfaceC11183i interfaceC11183i) {
                    C11154e.InterfaceC11155a.this.mo968d(interfaceC11183i);
                }
            });
            if (this.f52450p == null) {
                m69080A();
            }
            this.f52450p = interfaceC11155a;
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.camera.core.impl.s<?>, androidx.camera.core.impl.s] */
    @Override // androidx.camera.core.AbstractC11253p
    /* renamed from: j */
    public InterfaceC11225s<?> mo3483j(boolean z, InterfaceC36578Vf6 interfaceC36578Vf6) {
        InterfaceC11197f mo25424a = interfaceC36578Vf6.mo25424a(InterfaceC36578Vf6.EnumC8718b.IMAGE_ANALYSIS, 1);
        if (z) {
            mo25424a = InterfaceC11197f.m69421N(mo25424a, f52446r.m69606a());
        }
        if (mo25424a == null) {
            return null;
        }
        return mo3481u(mo25424a).mo1341d();
    }

    /* renamed from: j0 */
    public void m69622j0(int i) {
        if (m69071P(i)) {
            m69621k0();
        }
    }

    /* renamed from: k0 */
    public final void m69621k0() {
        InterfaceC34196Lb0 m69061f = m69061f();
        if (m69061f != null) {
            this.f52448n.m69587w(m69053o(m69061f));
        }
    }

    public String toString() {
        return "ImageAnalysis:" + m69054n();
    }

    @Override // androidx.camera.core.AbstractC11253p
    /* renamed from: u */
    public InterfaceC11225s.InterfaceC11226a<?, ?, ?> mo3481u(InterfaceC11197f interfaceC11197f) {
        return C11157c.m69616f(interfaceC11197f);
    }
}
