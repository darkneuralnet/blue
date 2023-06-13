package androidx.camera.core;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.C11209m;
import androidx.camera.core.impl.C11213q;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.InterfaceC11197f;
import androidx.camera.core.impl.InterfaceC11206k;
import androidx.camera.core.impl.InterfaceC11225s;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
/* renamed from: androidx.camera.core.p */
/* loaded from: classes.dex */
public abstract class AbstractC11253p {

    /* renamed from: d */
    public InterfaceC11225s<?> f52785d;

    /* renamed from: e */
    public InterfaceC11225s<?> f52786e;

    /* renamed from: f */
    public InterfaceC11225s<?> f52787f;

    /* renamed from: g */
    public BR5 f52788g;

    /* renamed from: h */
    public InterfaceC11225s<?> f52789h;

    /* renamed from: i */
    public Rect f52790i;

    /* renamed from: k */
    public InterfaceC34196Lb0 f52792k;

    /* renamed from: l */
    public AbstractC52288yb0 f52793l;

    /* renamed from: a */
    public final Set<InterfaceC11257d> f52782a = new HashSet();

    /* renamed from: b */
    public final Object f52783b = new Object();

    /* renamed from: c */
    public EnumC11256c f52784c = EnumC11256c.INACTIVE;

    /* renamed from: j */
    public Matrix f52791j = new Matrix();

    /* renamed from: m */
    public C11213q f52794m = C11213q.m69355a();

    /* renamed from: androidx.camera.core.p$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C11254a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f52795a;

        static {
            int[] iArr = new int[EnumC11256c.values().length];
            f52795a = iArr;
            try {
                iArr[EnumC11256c.INACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f52795a[EnumC11256c.ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: androidx.camera.core.p$b */
    /* loaded from: classes.dex */
    public interface InterfaceC11255b {
        /* renamed from: a */
        void m69043a(InterfaceC33728Jb0 interfaceC33728Jb0);

        /* renamed from: b */
        void m69042b();
    }

    /* renamed from: androidx.camera.core.p$c */
    /* loaded from: classes.dex */
    public enum EnumC11256c {
        ACTIVE,
        INACTIVE
    }

    /* renamed from: androidx.camera.core.p$d */
    /* loaded from: classes.dex */
    public interface InterfaceC11257d {
        /* renamed from: c */
        void mo4468c(AbstractC11253p abstractC11253p);

        /* renamed from: g */
        void mo4466g(AbstractC11253p abstractC11253p);

        /* renamed from: h */
        void mo4465h(AbstractC11253p abstractC11253p);

        /* renamed from: i */
        void mo4464i(AbstractC11253p abstractC11253p);
    }

    public AbstractC11253p(InterfaceC11225s<?> interfaceC11225s) {
        this.f52786e = interfaceC11225s;
        this.f52787f = interfaceC11225s;
    }

    /* renamed from: A */
    public final void m69080A() {
        this.f52784c = EnumC11256c.ACTIVE;
        m69077D();
    }

    /* renamed from: B */
    public final void m69079B() {
        this.f52784c = EnumC11256c.INACTIVE;
        m69077D();
    }

    /* renamed from: C */
    public final void m69078C() {
        for (InterfaceC11257d interfaceC11257d : this.f52782a) {
            interfaceC11257d.mo4465h(this);
        }
    }

    /* renamed from: D */
    public final void m69077D() {
        int i = C11254a.f52795a[this.f52784c.ordinal()];
        if (i != 1) {
            if (i == 2) {
                for (InterfaceC11257d interfaceC11257d : this.f52782a) {
                    interfaceC11257d.mo4466g(this);
                }
                return;
            }
            return;
        }
        for (InterfaceC11257d interfaceC11257d2 : this.f52782a) {
            interfaceC11257d2.mo4464i(this);
        }
    }

    /* renamed from: E */
    public final void m69076E() {
        for (InterfaceC11257d interfaceC11257d : this.f52782a) {
            interfaceC11257d.mo4468c(this);
        }
    }

    /* renamed from: F */
    public void mo3497F() {
    }

    /* renamed from: G */
    public void mo69075G() {
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.camera.core.impl.s<?>, androidx.camera.core.impl.s] */
    /* renamed from: H */
    public InterfaceC11225s<?> mo3496H(InterfaceC33962Kb0 interfaceC33962Kb0, InterfaceC11225s.InterfaceC11226a<?, ?, ?> interfaceC11226a) {
        return interfaceC11226a.mo1341d();
    }

    /* renamed from: I */
    public void mo3495I() {
    }

    /* renamed from: J */
    public void mo3494J() {
    }

    /* renamed from: K */
    public BR5 mo3493K(BR5 br5) {
        return br5;
    }

    /* renamed from: L */
    public void mo3492L() {
    }

    /* renamed from: M */
    public final void m69074M(InterfaceC11257d interfaceC11257d) {
        this.f52782a.remove(interfaceC11257d);
    }

    /* renamed from: N */
    public void m69073N(AbstractC52288yb0 abstractC52288yb0) {
        boolean z;
        if (abstractC52288yb0 != null && !m69046x(abstractC52288yb0.m3208e())) {
            z = false;
        } else {
            z = true;
        }
        HZ3.m103737a(z);
        this.f52793l = abstractC52288yb0;
    }

    /* renamed from: O */
    public void mo69072O(Matrix matrix) {
        this.f52791j = new Matrix(matrix);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.camera.core.impl.s<?>, androidx.camera.core.impl.s] */
    /* renamed from: P */
    public boolean m69071P(int i) {
        int m69378s = ((InterfaceC11206k) m69058i()).m69378s(-1);
        if (m69378s != -1 && m69378s == i) {
            return false;
        }
        InterfaceC11225s.InterfaceC11226a<?, ?, ?> mo3481u = mo3481u(this.f52786e);
        C36812Wf6.m78023a(mo3481u, i);
        this.f52786e = mo3481u.mo1341d();
        InterfaceC34196Lb0 m69061f = m69061f();
        if (m69061f == null) {
            this.f52787f = this.f52786e;
            return true;
        }
        this.f52787f = m69044z(m69061f.mo4467d(), this.f52785d, this.f52789h);
        return true;
    }

    /* renamed from: Q */
    public void mo69070Q(Rect rect) {
        this.f52790i = rect;
    }

    /* renamed from: R */
    public final void m69069R(InterfaceC34196Lb0 interfaceC34196Lb0) {
        boolean z;
        mo3492L();
        InterfaceC11255b m76719O = this.f52787f.m76719O(null);
        if (m76719O != null) {
            m76719O.m69042b();
        }
        synchronized (this.f52783b) {
            if (interfaceC34196Lb0 == this.f52792k) {
                z = true;
            } else {
                z = false;
            }
            HZ3.m103737a(z);
            m69074M(this.f52792k);
            this.f52792k = null;
        }
        this.f52788g = null;
        this.f52790i = null;
        this.f52787f = this.f52786e;
        this.f52785d = null;
        this.f52789h = null;
    }

    /* renamed from: S */
    public void m69068S(C11213q c11213q) {
        this.f52794m = c11213q;
        for (DeferrableSurface deferrableSurface : c11213q.m69345k()) {
            if (deferrableSurface.m69468e() == null) {
                deferrableSurface.m69458p(getClass());
            }
        }
    }

    /* renamed from: T */
    public void m69067T(BR5 br5) {
        this.f52788g = mo3493K(br5);
    }

    /* renamed from: a */
    public final void m69066a(InterfaceC11257d interfaceC11257d) {
        this.f52782a.add(interfaceC11257d);
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: b */
    public final void m69065b(InterfaceC34196Lb0 interfaceC34196Lb0, InterfaceC11225s<?> interfaceC11225s, InterfaceC11225s<?> interfaceC11225s2) {
        synchronized (this.f52783b) {
            this.f52792k = interfaceC34196Lb0;
            m69066a(interfaceC34196Lb0);
        }
        this.f52785d = interfaceC11225s;
        this.f52789h = interfaceC11225s2;
        InterfaceC11225s<?> m69044z = m69044z(interfaceC34196Lb0.mo4467d(), this.f52785d, this.f52789h);
        this.f52787f = m69044z;
        InterfaceC11255b m76719O = m69044z.m76719O(null);
        if (m76719O != null) {
            m76719O.m69043a(interfaceC34196Lb0.mo4467d());
        }
        mo3497F();
    }

    /* renamed from: c */
    public int m69064c() {
        return ((InterfaceC11206k) this.f52787f).m69379p(-1);
    }

    /* renamed from: d */
    public BR5 m69063d() {
        return this.f52788g;
    }

    /* renamed from: e */
    public Size m69062e() {
        BR5 br5 = this.f52788g;
        if (br5 != null) {
            return br5.mo31669c();
        }
        return null;
    }

    /* renamed from: f */
    public InterfaceC34196Lb0 m69061f() {
        InterfaceC34196Lb0 interfaceC34196Lb0;
        synchronized (this.f52783b) {
            interfaceC34196Lb0 = this.f52792k;
        }
        return interfaceC34196Lb0;
    }

    /* renamed from: g */
    public CameraControlInternal m69060g() {
        synchronized (this.f52783b) {
            InterfaceC34196Lb0 interfaceC34196Lb0 = this.f52792k;
            if (interfaceC34196Lb0 == null) {
                return CameraControlInternal.f52551a;
            }
            return interfaceC34196Lb0.mo4462k();
        }
    }

    /* renamed from: h */
    public String m69059h() {
        InterfaceC34196Lb0 m69061f = m69061f();
        return ((InterfaceC34196Lb0) HZ3.m103730h(m69061f, "No camera attached to use case: " + this)).mo4467d().mo98721a();
    }

    /* renamed from: i */
    public InterfaceC11225s<?> m69058i() {
        return this.f52787f;
    }

    /* renamed from: j */
    public abstract InterfaceC11225s<?> mo3483j(boolean z, InterfaceC36578Vf6 interfaceC36578Vf6);

    /* renamed from: k */
    public AbstractC52288yb0 m69057k() {
        return this.f52793l;
    }

    /* renamed from: l */
    public int m69056l() {
        return this.f52787f.mo69364l();
    }

    /* renamed from: m */
    public int m69055m() {
        return ((InterfaceC11206k) this.f52787f).m69375y(0);
    }

    /* renamed from: n */
    public String m69054n() {
        InterfaceC11225s<?> interfaceC11225s = this.f52787f;
        String m86619q = interfaceC11225s.m86619q("<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(m86619q);
        return m86619q;
    }

    /* renamed from: o */
    public int m69053o(InterfaceC34196Lb0 interfaceC34196Lb0) {
        return m69052p(interfaceC34196Lb0, false);
    }

    /* renamed from: p */
    public int m69052p(InterfaceC34196Lb0 interfaceC34196Lb0, boolean z) {
        boolean z2;
        int mo100138e = interfaceC34196Lb0.mo4467d().mo100138e(m69049t());
        if (!interfaceC34196Lb0.mo4458q() && z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return C46705p96.m19856s(-mo100138e);
        }
        return mo100138e;
    }

    /* renamed from: q */
    public Matrix m69051q() {
        return this.f52791j;
    }

    /* renamed from: r */
    public C11213q m69050r() {
        return this.f52794m;
    }

    /* renamed from: s */
    public Set<Integer> mo3482s() {
        return Collections.emptySet();
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: t */
    public int m69049t() {
        return ((InterfaceC11206k) this.f52787f).m69378s(0);
    }

    /* renamed from: u */
    public abstract InterfaceC11225s.InterfaceC11226a<?, ?, ?> mo3481u(InterfaceC11197f interfaceC11197f);

    /* renamed from: v */
    public Rect m69048v() {
        return this.f52790i;
    }

    /* renamed from: w */
    public boolean m69047w(String str) {
        if (m69061f() == null) {
            return false;
        }
        return Objects.equals(str, m69059h());
    }

    /* renamed from: x */
    public boolean m69046x(int i) {
        for (Integer num : mo3482s()) {
            if (VY5.m79747e(i, num.intValue())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: y */
    public boolean m69045y(InterfaceC34196Lb0 interfaceC34196Lb0) {
        int m69055m = m69055m();
        if (m69055m != 0) {
            if (m69055m == 1) {
                return true;
            }
            if (m69055m == 2) {
                return interfaceC34196Lb0.m96610e();
            }
            throw new AssertionError("Unknown mirrorMode: " + m69055m);
        }
        return false;
    }

    /* renamed from: z */
    public InterfaceC11225s<?> m69044z(InterfaceC33962Kb0 interfaceC33962Kb0, InterfaceC11225s<?> interfaceC11225s, InterfaceC11225s<?> interfaceC11225s2) {
        C11209m m69372V;
        if (interfaceC11225s2 != null) {
            m69372V = C11209m.m69371W(interfaceC11225s2);
            m69372V.m69370X(RY5.f32203b);
        } else {
            m69372V = C11209m.m69372V();
        }
        for (InterfaceC11197f.AbstractC11198a<?> abstractC11198a : this.f52786e.mo69357g()) {
            m69372V.mo69369n(abstractC11198a, this.f52786e.mo69356h(abstractC11198a), this.f52786e.mo69363a(abstractC11198a));
        }
        if (interfaceC11225s != null) {
            for (InterfaceC11197f.AbstractC11198a<?> abstractC11198a2 : interfaceC11225s.mo69357g()) {
                if (!abstractC11198a2.mo69418c().equals(RY5.f32203b.mo69418c())) {
                    m69372V.mo69369n(abstractC11198a2, interfaceC11225s.mo69356h(abstractC11198a2), interfaceC11225s.mo69363a(abstractC11198a2));
                }
            }
        }
        if (m69372V.mo69359e(InterfaceC11206k.f52630p)) {
            InterfaceC11197f.AbstractC11198a<Integer> abstractC11198a3 = InterfaceC11206k.f52626l;
            if (m69372V.mo69359e(abstractC11198a3)) {
                m69372V.m69370X(abstractC11198a3);
            }
        }
        InterfaceC11197f.AbstractC11198a<C11240m> abstractC11198a4 = InterfaceC11206k.f52634t;
        if (m69372V.mo69359e(abstractC11198a4) && ((C11240m) m69372V.mo69363a(abstractC11198a4)).m69142e()) {
            m69372V.mo69373C(InterfaceC11225s.f52670C, Boolean.TRUE);
        }
        return mo3496H(interfaceC33962Kb0, mo3481u(m69372V));
    }
}
