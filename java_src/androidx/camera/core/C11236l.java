package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.C11236l;
import androidx.camera.core.C11240m;
import androidx.camera.core.C11243o;
import androidx.camera.core.impl.C11209m;
import androidx.camera.core.impl.C11210n;
import androidx.camera.core.impl.C11211o;
import androidx.camera.core.impl.C11213q;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.InterfaceC11197f;
import androidx.camera.core.impl.InterfaceC11205j;
import androidx.camera.core.impl.InterfaceC11206k;
import androidx.camera.core.impl.InterfaceC11208l;
import androidx.camera.core.impl.InterfaceC11225s;
import co.bird.android.model.Detail;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import p000.InterfaceC36578Vf6;
import p000.YV5;
/* renamed from: androidx.camera.core.l */
/* loaded from: classes.dex */
public final class C11236l extends AbstractC11253p {

    /* renamed from: u */
    public static final C11238b f52728u = new C11238b();

    /* renamed from: v */
    public static final Executor f52729v = C31631Ac0.m115446d();

    /* renamed from: n */
    public InterfaceC11239c f52730n;

    /* renamed from: o */
    public Executor f52731o;

    /* renamed from: p */
    public DeferrableSurface f52732p;

    /* renamed from: q */
    public MV5 f52733q;

    /* renamed from: r */
    public C11243o f52734r;

    /* renamed from: s */
    public Size f52735s;

    /* renamed from: t */
    public YV5 f52736t;

    /* renamed from: androidx.camera.core.l$a */
    /* loaded from: classes.dex */
    public static final class C11237a implements InterfaceC11225s.InterfaceC11226a<C11236l, C11211o, C11237a>, InterfaceC11206k.InterfaceC11207a<C11237a> {

        /* renamed from: a */
        public final C11209m f52737a;

        public C11237a() {
            this(C11209m.m69372V());
        }

        /* renamed from: f */
        public static C11237a m69155f(InterfaceC11197f interfaceC11197f) {
            return new C11237a(C11209m.m69371W(interfaceC11197f));
        }

        @Override // p000.InterfaceC32388Di1
        /* renamed from: b */
        public InterfaceC11208l mo1343b() {
            return this.f52737a;
        }

        /* renamed from: e */
        public C11236l m69156e() {
            C11211o mo1341d = mo1341d();
            InterfaceC11206k.m69385F(mo1341d);
            return new C11236l(mo1341d);
        }

        @Override // androidx.camera.core.impl.InterfaceC11225s.InterfaceC11226a
        /* renamed from: g */
        public C11211o mo1341d() {
            return new C11211o(C11210n.m69366T(this.f52737a));
        }

        /* renamed from: h */
        public C11237a m69153h(int i) {
            mo1343b().mo69373C(InterfaceC11225s.f52676z, Integer.valueOf(i));
            return this;
        }

        /* renamed from: i */
        public C11237a m69152i(int i) {
            if (i == -1) {
                i = 0;
            }
            mo1343b().mo69373C(InterfaceC11206k.f52626l, Integer.valueOf(i));
            return this;
        }

        /* renamed from: j */
        public C11237a m69151j(Class<C11236l> cls) {
            mo1343b().mo69373C(RY5.f32204c, cls);
            if (mo1343b().mo69360d(RY5.f32203b, null) == null) {
                m69150k(cls.getCanonicalName() + Detail.EMPTY_CHAR + UUID.randomUUID());
            }
            return this;
        }

        /* renamed from: k */
        public C11237a m69150k(String str) {
            mo1343b().mo69373C(RY5.f32203b, str);
            return this;
        }

        @Override // androidx.camera.core.impl.InterfaceC11206k.InterfaceC11207a
        /* renamed from: l */
        public C11237a mo69157c(Size size) {
            mo1343b().mo69373C(InterfaceC11206k.f52630p, size);
            return this;
        }

        @Override // androidx.camera.core.impl.InterfaceC11206k.InterfaceC11207a
        /* renamed from: m */
        public C11237a mo69158a(int i) {
            mo1343b().mo69373C(InterfaceC11206k.f52627m, Integer.valueOf(i));
            mo1343b().mo69373C(InterfaceC11206k.f52628n, Integer.valueOf(i));
            return this;
        }

        public C11237a(C11209m c11209m) {
            this.f52737a = c11209m;
            Class cls = (Class) c11209m.mo69360d(RY5.f32204c, null);
            if (cls != null && !cls.equals(C11236l.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            m69151j(C11236l.class);
            c11209m.mo69373C(InterfaceC11206k.f52629o, 2);
        }
    }

    /* renamed from: androidx.camera.core.l$b */
    /* loaded from: classes.dex */
    public static final class C11238b {

        /* renamed from: a */
        public static final C11211o f52738a = new C11237a().m69153h(2).m69152i(0).mo1341d();

        /* renamed from: a */
        public C11211o m69147a() {
            return f52738a;
        }
    }

    /* renamed from: androidx.camera.core.l$c */
    /* loaded from: classes.dex */
    public interface InterfaceC11239c {
        /* renamed from: a */
        void mo13949a(C11243o c11243o);
    }

    public C11236l(C11211o c11211o) {
        super(c11211o);
        this.f52731o = f52729v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0 */
    public /* synthetic */ void m69168c0(String str, C11211o c11211o, BR5 br5, C11213q c11213q, C11213q.EnumC11220f enumC11220f) {
        if (m69047w(str)) {
            m69068S(m69171Z(str, c11211o, br5).m69331m());
            m69078C();
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.camera.core.impl.s<?>, androidx.camera.core.impl.s] */
    @Override // androidx.camera.core.AbstractC11253p
    /* renamed from: H */
    public InterfaceC11225s<?> mo3496H(InterfaceC33962Kb0 interfaceC33962Kb0, InterfaceC11225s.InterfaceC11226a<?, ?, ?> interfaceC11226a) {
        Size size;
        interfaceC11226a.mo1343b().mo69373C(InterfaceC11205j.f52625k, 34);
        InterfaceC11208l mo1343b = interfaceC11226a.mo1343b();
        InterfaceC11197f.AbstractC11198a<C11240m> abstractC11198a = InterfaceC11206k.f52634t;
        C11240m c11240m = (C11240m) mo1343b.mo69360d(abstractC11198a, null);
        if (c11240m != null && c11240m.m69146a() == null && (size = (Size) interfaceC11226a.mo1343b().mo69363a(InterfaceC11206k.f52632r)) != null) {
            C11240m.C11241a m69140b = C11240m.C11241a.m69140b(c11240m);
            m69140b.m69139c(size);
            interfaceC11226a.mo1343b().mo69373C(abstractC11198a, m69140b.m69141a());
        }
        return interfaceC11226a.mo1341d();
    }

    @Override // androidx.camera.core.AbstractC11253p
    /* renamed from: K */
    public BR5 mo3493K(BR5 br5) {
        this.f52735s = br5.mo31669c();
        m69159l0(m69059h(), (C11211o) m69058i(), br5);
        return br5;
    }

    @Override // androidx.camera.core.AbstractC11253p
    /* renamed from: L */
    public void mo3492L() {
        m69172Y();
    }

    @Override // androidx.camera.core.AbstractC11253p
    /* renamed from: Q */
    public void mo69070Q(Rect rect) {
        super.mo69070Q(rect);
        m69163h0();
    }

    /* renamed from: X */
    public final void m69173X(C11213q.C11215b c11215b, final String str, final C11211o c11211o, final BR5 br5) {
        if (this.f52730n != null) {
            c11215b.m69333k(this.f52732p);
        }
        c11215b.m69338f(new C11213q.InterfaceC11216c() { // from class: X14
            @Override // androidx.camera.core.impl.C11213q.InterfaceC11216c
            /* renamed from: a */
            public final void mo1277a(C11213q c11213q, C11213q.EnumC11220f enumC11220f) {
                C11236l.this.m69168c0(str, c11211o, br5, c11213q, enumC11220f);
            }
        });
    }

    /* renamed from: Y */
    public final void m69172Y() {
        DeferrableSurface deferrableSurface = this.f52732p;
        if (deferrableSurface != null) {
            deferrableSurface.m69470c();
            this.f52732p = null;
        }
        YV5 yv5 = this.f52736t;
        if (yv5 != null) {
            yv5.m74961h();
            this.f52736t = null;
        }
        MV5 mv5 = this.f52733q;
        if (mv5 != null) {
            mv5.m95266h();
            this.f52733q = null;
        }
        this.f52734r = null;
    }

    /* renamed from: Z */
    public C11213q.C11215b m69171Z(String str, C11211o c11211o, BR5 br5) {
        if (m69057k() != null) {
            return m69170a0(str, c11211o, br5);
        }
        O36.m92961a();
        C11213q.C11215b m69329o = C11213q.C11215b.m69329o(c11211o, br5.mo31669c());
        m69172Y();
        C11243o c11243o = new C11243o(br5.mo31669c(), m69061f(), new U14(this));
        this.f52734r = c11243o;
        if (this.f52730n != null) {
            m69164g0();
        }
        this.f52732p = c11243o.m69107l();
        m69173X(m69329o, str, c11211o, br5);
        m69329o.m69326r(br5.mo31670b());
        return m69329o;
    }

    /* renamed from: a0 */
    public final C11213q.C11215b m69170a0(String str, C11211o c11211o, BR5 br5) {
        boolean z;
        O36.m92961a();
        AbstractC52288yb0 m69057k = m69057k();
        Objects.requireNonNull(m69057k);
        InterfaceC34196Lb0 m69061f = m69061f();
        Objects.requireNonNull(m69061f);
        final InterfaceC34196Lb0 interfaceC34196Lb0 = m69061f;
        m69172Y();
        this.f52736t = new YV5(interfaceC34196Lb0, m69057k.m3212a());
        if (this.f52733q == null) {
            z = true;
        } else {
            z = false;
        }
        HZ3.m103729i(z);
        Matrix matrix = new Matrix();
        boolean mo4458q = interfaceC34196Lb0.mo4458q();
        Rect m69169b0 = m69169b0(br5.mo31669c());
        Objects.requireNonNull(m69169b0);
        MV5 mv5 = new MV5(1, 34, br5, matrix, mo4458q, m69169b0, m69052p(interfaceC34196Lb0, m69045y(interfaceC34196Lb0)), m69160k0(interfaceC34196Lb0));
        this.f52733q = mv5;
        mv5.m95269e(new U14(this));
        YV5.AbstractC9796d m74952i = YV5.AbstractC9796d.m74952i(this.f52733q);
        final MV5 mv52 = this.f52736t.m74957l(YV5.AbstractC9794b.m74954c(this.f52733q, Collections.singletonList(m74952i))).get(m74952i);
        Objects.requireNonNull(mv52);
        mv52.m95269e(new Runnable() { // from class: W14
            @Override // java.lang.Runnable
            public final void run() {
                C11236l.this.m69167d0(mv52, interfaceC34196Lb0);
            }
        });
        this.f52732p = this.f52733q.m95259o();
        this.f52734r = mv52.m95264j(interfaceC34196Lb0);
        if (this.f52730n != null) {
            m69164g0();
        }
        C11213q.C11215b m69329o = C11213q.C11215b.m69329o(c11211o, br5.mo31669c());
        m69173X(m69329o, str, c11211o, br5);
        return m69329o;
    }

    /* renamed from: b0 */
    public final Rect m69169b0(Size size) {
        if (m69048v() != null) {
            return m69048v();
        }
        if (size != null) {
            return new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        return null;
    }

    /* renamed from: f0 */
    public final void m69167d0(MV5 mv5, InterfaceC34196Lb0 interfaceC34196Lb0) {
        O36.m92961a();
        if (interfaceC34196Lb0 == m69061f()) {
            this.f52734r = mv5.m95264j(interfaceC34196Lb0);
            m69164g0();
        }
    }

    /* renamed from: g0 */
    public final void m69164g0() {
        final InterfaceC11239c interfaceC11239c = (InterfaceC11239c) HZ3.m103731g(this.f52730n);
        final C11243o c11243o = (C11243o) HZ3.m103731g(this.f52734r);
        this.f52731o.execute(new Runnable() { // from class: V14
            @Override // java.lang.Runnable
            public final void run() {
                C11236l.InterfaceC11239c.this.mo13949a(c11243o);
            }
        });
        m69163h0();
    }

    /* renamed from: h0 */
    public final void m69163h0() {
        InterfaceC34196Lb0 m69061f = m69061f();
        InterfaceC11239c interfaceC11239c = this.f52730n;
        Rect m69169b0 = m69169b0(this.f52735s);
        C11243o c11243o = this.f52734r;
        if (m69061f != null && interfaceC11239c != null && m69169b0 != null && c11243o != null) {
            if (this.f52736t == null) {
                c11243o.m69120C(C11243o.AbstractC11251h.m69081e(m69169b0, m69052p(m69061f, m69045y(m69061f)), m69064c(), m69061f.mo4458q()));
            } else {
                this.f52733q.m95274D(m69052p(m69061f, m69045y(m69061f)));
            }
        }
    }

    /* renamed from: i0 */
    public void m69162i0(InterfaceC11239c interfaceC11239c) {
        m69161j0(f52729v, interfaceC11239c);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.camera.core.impl.s<?>, androidx.camera.core.impl.s] */
    @Override // androidx.camera.core.AbstractC11253p
    /* renamed from: j */
    public InterfaceC11225s<?> mo3483j(boolean z, InterfaceC36578Vf6 interfaceC36578Vf6) {
        InterfaceC11197f mo25424a = interfaceC36578Vf6.mo25424a(InterfaceC36578Vf6.EnumC8718b.PREVIEW, 1);
        if (z) {
            mo25424a = InterfaceC11197f.m69421N(mo25424a, f52728u.m69147a());
        }
        if (mo25424a == null) {
            return null;
        }
        return mo3481u(mo25424a).mo1341d();
    }

    /* renamed from: j0 */
    public void m69161j0(Executor executor, InterfaceC11239c interfaceC11239c) {
        O36.m92961a();
        if (interfaceC11239c == null) {
            this.f52730n = null;
            m69079B();
            return;
        }
        this.f52730n = interfaceC11239c;
        this.f52731o = executor;
        m69080A();
        if (m69062e() != null) {
            m69159l0(m69059h(), (C11211o) m69058i(), m69063d());
            m69078C();
        }
    }

    /* renamed from: k0 */
    public final boolean m69160k0(InterfaceC34196Lb0 interfaceC34196Lb0) {
        return interfaceC34196Lb0.mo4458q() && m69045y(interfaceC34196Lb0);
    }

    /* renamed from: l0 */
    public final void m69159l0(String str, C11211o c11211o, BR5 br5) {
        m69068S(m69171Z(str, c11211o, br5).m69331m());
    }

    @Override // androidx.camera.core.AbstractC11253p
    /* renamed from: s */
    public Set<Integer> mo3482s() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    public String toString() {
        return "Preview:" + m69054n();
    }

    @Override // androidx.camera.core.AbstractC11253p
    /* renamed from: u */
    public InterfaceC11225s.InterfaceC11226a<?, ?, ?> mo3481u(InterfaceC11197f interfaceC11197f) {
        return C11237a.m69155f(interfaceC11197f);
    }
}
