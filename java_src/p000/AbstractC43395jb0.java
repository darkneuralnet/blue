package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import androidx.camera.core.C11154e;
import androidx.camera.core.C11164h;
import androidx.camera.core.C11236l;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraInfoUnavailableException;
import androidx.camera.core.impl.InterfaceC11206k;
import androidx.camera.lifecycle.C11260b;
import androidx.lifecycle.LiveData;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import p000.C32271Cv1;
import p000.C33417Hs4;
import p000.C36073Tb5;
import p000.C37280Yf6;
/* renamed from: jb0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC43395jb0 {

    /* renamed from: A */
    public final ListenableFuture<Void> f92968A;

    /* renamed from: a */
    public C42812ic0 f92969a;

    /* renamed from: b */
    public int f92970b;

    /* renamed from: c */
    public C11236l f92971c;

    /* renamed from: d */
    public C11164h f92972d;

    /* renamed from: e */
    public Executor f92973e;

    /* renamed from: f */
    public C11154e.InterfaceC11155a f92974f;

    /* renamed from: g */
    public C11154e f92975g;

    /* renamed from: h */
    public C36425Uo6<C33417Hs4> f92976h;

    /* renamed from: i */
    public Map<InterfaceC48378rz0<AbstractC50655vp6>, Object> f92977i;

    /* renamed from: j */
    public C52885zb4 f92978j;

    /* renamed from: k */
    public InterfaceC45757na0 f92979k;

    /* renamed from: l */
    public InterfaceC47266q64 f92980l;

    /* renamed from: m */
    public C32717Es6 f92981m;

    /* renamed from: n */
    public C11236l.InterfaceC11239c f92982n;

    /* renamed from: o */
    public final C36073Tb5 f92983o;

    /* renamed from: p */
    public final C36073Tb5.InterfaceC7886b f92984p;

    /* renamed from: q */
    public boolean f92985q;

    /* renamed from: r */
    public boolean f92986r;

    /* renamed from: s */
    public final C33225Gx1<InterfaceC47389qJ6> f92987s;

    /* renamed from: t */
    public final C33225Gx1<Integer> f92988t;

    /* renamed from: u */
    public final C49882uX2<Integer> f92989u;

    /* renamed from: v */
    public final C42705iQ3<Boolean> f92990v;

    /* renamed from: w */
    public final C42705iQ3<Float> f92991w;

    /* renamed from: x */
    public final C42705iQ3<Float> f92992x;

    /* renamed from: y */
    public final Set<AbstractC52288yb0> f92993y;

    /* renamed from: z */
    public final Context f92994z;

    /* renamed from: jb0$a */
    /* loaded from: classes.dex */
    public class C24952a implements CA1<C34611Mv1> {
        public C24952a() {
        }

        @Override // p000.CA1
        /* renamed from: a */
        public void onSuccess(C34611Mv1 c34611Mv1) {
            int i;
            if (c34611Mv1 == null) {
                return;
            }
            C33928Jx2.m99533a("CameraController", "Tap to focus onSuccess: " + c34611Mv1.m94576c());
            C49882uX2<Integer> c49882uX2 = AbstractC43395jb0.this.f92989u;
            if (c34611Mv1.m94576c()) {
                i = 2;
            } else {
                i = 3;
            }
            c49882uX2.postValue(Integer.valueOf(i));
        }

        @Override // p000.CA1
        public void onFailure(Throwable th) {
            if (th instanceof CameraControl.OperationCanceledException) {
                C33928Jx2.m99533a("CameraController", "Tap-to-focus is canceled by new action.");
                return;
            }
            C33928Jx2.m99532b("CameraController", "Tap to focus failed.", th);
            AbstractC43395jb0.this.f92989u.postValue(4);
        }
    }

    /* renamed from: jb0$b */
    /* loaded from: classes.dex */
    public static class C24953b {
        private C24953b() {
        }

        /* renamed from: a */
        public static Context m30222a(Context context, String str) {
            Context createAttributionContext;
            createAttributionContext = context.createAttributionContext(str);
            return createAttributionContext;
        }

        /* renamed from: b */
        public static String m30221b(Context context) {
            String attributionTag;
            attributionTag = context.getAttributionTag();
            return attributionTag;
        }
    }

    /* renamed from: jb0$c */
    /* loaded from: classes.dex */
    public static final class C24954c {
    }

    public AbstractC43395jb0(Context context) {
        this(context, IA1.m102829o(C11260b.m69005h(context), new InterfaceC51452xA1() { // from class: cb0
            @Override // p000.InterfaceC51452xA1
            public final Object apply(Object obj) {
                return new C47859r64((C11260b) obj);
            }
        }, C31631Ac0.m115449a()));
    }

    /* renamed from: i */
    public static C33417Hs4 m30241i(C52885zb4 c52885zb4) {
        C33417Hs4.C3249h c3249h = new C33417Hs4.C3249h();
        if (c52885zb4 != null) {
            c3249h.m103292d(C35613Rc4.m86556d(c52885zb4, C33567Ij1.m101749b(c52885zb4)));
        }
        return c3249h.m103294b();
    }

    /* renamed from: j */
    public static Context m30240j(Context context) {
        String m30221b;
        Context applicationContext = context.getApplicationContext();
        if (Build.VERSION.SDK_INT >= 30 && (m30221b = C24953b.m30221b(context)) != null) {
            return C24953b.m30222a(applicationContext, m30221b);
        }
        return applicationContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ Void m30228v(InterfaceC47266q64 interfaceC47266q64) {
        this.f92980l = interfaceC47266q64;
        m30258K();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m30227w(int i) {
        this.f92975g.m69622j0(i);
        this.f92972d.m69560P0(i);
        this.f92976h.m80859H0(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void m30226x(C42812ic0 c42812ic0) {
        this.f92969a = c42812ic0;
    }

    /* renamed from: A */
    public void m30267A(C42812ic0 c42812ic0) {
        O36.m92961a();
        final C42812ic0 c42812ic02 = this.f92969a;
        if (c42812ic02 == c42812ic0) {
            return;
        }
        this.f92969a = c42812ic0;
        InterfaceC47266q64 interfaceC47266q64 = this.f92980l;
        if (interfaceC47266q64 == null) {
            return;
        }
        interfaceC47266q64.mo16479b(this.f92971c, this.f92972d, this.f92975g, this.f92976h);
        m30257L(new Runnable() { // from class: ib0
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC43395jb0.this.m30226x(c42812ic02);
            }
        });
    }

    /* renamed from: B */
    public void m30266B(int i) {
        O36.m92961a();
        this.f92972d.m69561O0(i);
    }

    /* renamed from: C */
    public void m30265C(int i) {
        O36.m92961a();
        if (this.f92972d.m69532o0() == i) {
            return;
        }
        m30252Q(i);
        m30258K();
    }

    /* renamed from: D */
    public ListenableFuture<Void> m30264D(float f) {
        O36.m92961a();
        if (!m30235o()) {
            return this.f92991w.m33997d(Float.valueOf(f));
        }
        return this.f92979k.mo23506a().mo16406b(f);
    }

    /* renamed from: E */
    public void m30263E(boolean z) {
        O36.m92961a();
        this.f92985q = z;
    }

    /* renamed from: F */
    public void m30262F(boolean z) {
        O36.m92961a();
        this.f92986r = z;
    }

    /* renamed from: G */
    public final void m30261G(InterfaceC11206k.InterfaceC11207a<?> interfaceC11207a, C24954c c24954c) {
    }

    /* renamed from: H */
    public ListenableFuture<Void> m30260H(float f) {
        O36.m92961a();
        if (!m30235o()) {
            return this.f92992x.m33997d(Float.valueOf(f));
        }
        return this.f92979k.mo23506a().mo16402d(f);
    }

    /* renamed from: I */
    public final float m30259I(float f) {
        return f > 1.0f ? ((f - 1.0f) * 2.0f) + 1.0f : 1.0f - ((1.0f - f) * 2.0f);
    }

    /* renamed from: J */
    public abstract InterfaceC45757na0 mo4567J();

    /* renamed from: K */
    public void m30258K() {
        m30257L(null);
    }

    /* renamed from: L */
    public void m30257L(Runnable runnable) {
        try {
            this.f92979k = mo4567J();
            if (!m30235o()) {
                C33928Jx2.m99533a("CameraController", "Use cases not attached to camera.");
                return;
            }
            this.f92987s.m104569d(this.f92979k.mo23505b().mo100136h());
            this.f92988t.m104569d(this.f92979k.mo23505b().mo100134m());
            this.f92990v.m33998c(new InterfaceC51452xA1() { // from class: db0
                @Override // p000.InterfaceC51452xA1
                public final Object apply(Object obj) {
                    return AbstractC43395jb0.this.m30242h(((Boolean) obj).booleanValue());
                }
            });
            this.f92991w.m33998c(new InterfaceC51452xA1() { // from class: eb0
                @Override // p000.InterfaceC51452xA1
                public final Object apply(Object obj) {
                    return AbstractC43395jb0.this.m30264D(((Float) obj).floatValue());
                }
            });
            this.f92992x.m33998c(new InterfaceC51452xA1() { // from class: fb0
                @Override // p000.InterfaceC51452xA1
                public final Object apply(Object obj) {
                    return AbstractC43395jb0.this.m30260H(((Float) obj).floatValue());
                }
            });
        } catch (RuntimeException e) {
            if (runnable != null) {
                runnable.run();
            }
            throw e;
        }
    }

    /* renamed from: M */
    public final void m30256M() {
        this.f92983o.m83356a(C31631Ac0.m115446d(), this.f92984p);
    }

    /* renamed from: N */
    public final void m30255N() {
        this.f92983o.m83354c(this.f92984p);
    }

    /* renamed from: O */
    public void m30254O(C11164h.C11180n c11180n, Executor executor, C11164h.InterfaceC11179m interfaceC11179m) {
        O36.m92961a();
        HZ3.m103728j(m30234p(), "Camera not initialized.");
        HZ3.m103728j(m30232r(), "ImageCapture disabled.");
        m30251R(c11180n);
        this.f92972d.m69569G0(c11180n, executor, interfaceC11179m);
    }

    /* renamed from: P */
    public void m30253P(Executor executor, C11164h.AbstractC11178l abstractC11178l) {
        O36.m92961a();
        HZ3.m103728j(m30234p(), "Camera not initialized.");
        HZ3.m103728j(m30232r(), "ImageCapture disabled.");
        this.f92972d.m69570F0(executor, abstractC11178l);
    }

    /* renamed from: Q */
    public final void m30252Q(int i) {
        if (m30234p()) {
            this.f92980l.mo16479b(this.f92972d);
        }
        C11164h.C11171g m69516h = new C11164h.C11171g().m69516h(i);
        m30261G(m69516h, null);
        Executor executor = this.f92973e;
        if (executor != null) {
            m69516h.m69515i(executor);
        }
        this.f92972d = m69516h.m69519e();
    }

    /* renamed from: R */
    public void m30251R(C11164h.C11180n c11180n) {
        boolean z;
        if (this.f92969a.m33761d() != null && !c11180n.m69486d().m69492c()) {
            C11164h.C11177k m69486d = c11180n.m69486d();
            if (this.f92969a.m33761d().intValue() == 0) {
                z = true;
            } else {
                z = false;
            }
            m69486d.m69490e(z);
        }
    }

    /* renamed from: S */
    public void m30250S(C43154jA3 c43154jA3) {
        O36.m92961a();
        C11154e.InterfaceC11155a interfaceC11155a = this.f92974f;
        if (interfaceC11155a == null) {
            return;
        }
        if (c43154jA3 == null) {
            interfaceC11155a.m69620a(null);
        } else if (interfaceC11155a.m69618c() == 1) {
            this.f92974f.m69620a(c43154jA3.m31035a());
        }
    }

    @SuppressLint({"MissingPermission", "WrongConstant"})
    /* renamed from: d */
    public void m30246d(C11236l.InterfaceC11239c interfaceC11239c, C32717Es6 c32717Es6) {
        O36.m92961a();
        if (this.f92982n != interfaceC11239c) {
            this.f92982n = interfaceC11239c;
            this.f92971c.m69162i0(interfaceC11239c);
        }
        this.f92981m = c32717Es6;
        m30256M();
        m30258K();
    }

    /* renamed from: e */
    public void m30245e() {
        O36.m92961a();
        InterfaceC47266q64 interfaceC47266q64 = this.f92980l;
        if (interfaceC47266q64 != null) {
            interfaceC47266q64.mo16479b(this.f92971c, this.f92972d, this.f92975g, this.f92976h);
        }
        this.f92971c.m69162i0(null);
        this.f92979k = null;
        this.f92982n = null;
        this.f92981m = null;
        m30255N();
    }

    /* renamed from: f */
    public final C36425Uo6<C33417Hs4> m30244f() {
        return C36425Uo6.m80853N0(m30241i(this.f92978j));
    }

    /* renamed from: g */
    public C37280Yf6 m30243g() {
        if (!m30234p()) {
            C33928Jx2.m99533a("CameraController", "Camera not initialized.");
            return null;
        } else if (!m30231s()) {
            C33928Jx2.m99533a("CameraController", "PreviewView not attached to CameraController.");
            return null;
        } else {
            C37280Yf6.C9913a m74486b = new C37280Yf6.C9913a().m74486b(this.f92971c);
            if (m30232r()) {
                m74486b.m74486b(this.f92972d);
            } else {
                this.f92980l.mo16479b(this.f92972d);
            }
            if (m30233q()) {
                m74486b.m74486b(this.f92975g);
            } else {
                this.f92980l.mo16479b(this.f92975g);
            }
            if (m30229u()) {
                m74486b.m74486b(this.f92976h);
            } else {
                this.f92980l.mo16479b(this.f92976h);
            }
            m74486b.m74483e(this.f92981m);
            for (AbstractC52288yb0 abstractC52288yb0 : this.f92993y) {
                m74486b.m74487a(abstractC52288yb0);
            }
            return m74486b.m74485c();
        }
    }

    /* renamed from: h */
    public ListenableFuture<Void> m30242h(boolean z) {
        O36.m92961a();
        if (!m30235o()) {
            return this.f92990v.m33997d(Boolean.valueOf(z));
        }
        return this.f92979k.mo23506a().mo16400e(z);
    }

    /* renamed from: k */
    public InterfaceC33728Jb0 m30239k() {
        O36.m92961a();
        InterfaceC45757na0 interfaceC45757na0 = this.f92979k;
        if (interfaceC45757na0 == null) {
            return null;
        }
        return interfaceC45757na0.mo23505b();
    }

    /* renamed from: l */
    public ListenableFuture<Void> m30238l() {
        return this.f92968A;
    }

    /* renamed from: m */
    public LiveData<InterfaceC47389qJ6> m30237m() {
        O36.m92961a();
        return this.f92987s;
    }

    /* renamed from: n */
    public boolean m30236n(C42812ic0 c42812ic0) {
        O36.m92961a();
        HZ3.m103731g(c42812ic0);
        InterfaceC47266q64 interfaceC47266q64 = this.f92980l;
        if (interfaceC47266q64 != null) {
            try {
                return interfaceC47266q64.mo16480a(c42812ic0);
            } catch (CameraInfoUnavailableException e) {
                C33928Jx2.m99521m("CameraController", "Failed to check camera availability", e);
                return false;
            }
        }
        throw new IllegalStateException("Camera not initialized. Please wait for the initialization future to finish. See #getInitializationFuture().");
    }

    /* renamed from: o */
    public final boolean m30235o() {
        return this.f92979k != null;
    }

    /* renamed from: p */
    public final boolean m30234p() {
        return this.f92980l != null;
    }

    /* renamed from: q */
    public boolean m30233q() {
        O36.m92961a();
        return m30230t(2);
    }

    /* renamed from: r */
    public boolean m30232r() {
        O36.m92961a();
        return m30230t(1);
    }

    /* renamed from: s */
    public final boolean m30231s() {
        return (this.f92982n == null || this.f92981m == null) ? false : true;
    }

    /* renamed from: t */
    public final boolean m30230t(int i) {
        return (i & this.f92970b) != 0;
    }

    /* renamed from: u */
    public boolean m30229u() {
        O36.m92961a();
        return m30230t(4);
    }

    /* renamed from: y */
    public void m30225y(float f) {
        if (!m30235o()) {
            C33928Jx2.m99522l("CameraController", "Use cases not attached to camera.");
        } else if (!this.f92985q) {
            C33928Jx2.m99533a("CameraController", "Pinch to zoom disabled.");
        } else {
            C33928Jx2.m99533a("CameraController", "Pinch to zoom with scale: " + f);
            InterfaceC47389qJ6 value = m30237m().getValue();
            if (value == null) {
                return;
            }
            m30260H(Math.min(Math.max(value.mo16062d() * m30259I(f), value.mo16063c()), value.mo16065a()));
        }
    }

    /* renamed from: z */
    public void m30224z(ST2 st2, float f, float f2) {
        if (!m30235o()) {
            C33928Jx2.m99522l("CameraController", "Use cases not attached to camera.");
        } else if (!this.f92986r) {
            C33928Jx2.m99533a("CameraController", "Tap to focus disabled. ");
        } else {
            C33928Jx2.m99533a("CameraController", "Tap to focus started: " + f + ", " + f2);
            this.f92989u.postValue(1);
            RT2 m85379c = st2.m85379c(f, f2, 0.16666667f);
            IA1.m102842b(this.f92979k.mo23506a().mo16396g(new C32271Cv1.C1229a(m85379c, 1).m111347a(st2.m85379c(f, f2, 0.25f), 2).m111346b()), new C24952a(), C31631Ac0.m115449a());
        }
    }

    public AbstractC43395jb0(Context context, ListenableFuture<InterfaceC47266q64> listenableFuture) {
        this.f92969a = C42812ic0.f87522c;
        this.f92970b = 3;
        this.f92977i = new HashMap();
        this.f92985q = true;
        this.f92986r = true;
        this.f92987s = new C33225Gx1<>();
        this.f92988t = new C33225Gx1<>();
        this.f92989u = new C49882uX2<>(0);
        this.f92990v = new C42705iQ3<>();
        this.f92991w = new C42705iQ3<>();
        this.f92992x = new C42705iQ3<>();
        this.f92993y = new HashSet();
        Context m30240j = m30240j(context);
        this.f92994z = m30240j;
        this.f92971c = new C11236l.C11237a().m69156e();
        this.f92972d = new C11164h.C11171g().m69519e();
        this.f92975g = new C11154e.C11157c().m69617e();
        this.f92976h = m30244f();
        this.f92968A = IA1.m102829o(listenableFuture, new InterfaceC51452xA1() { // from class: gb0
            @Override // p000.InterfaceC51452xA1
            public final Object apply(Object obj) {
                Void m30228v;
                m30228v = AbstractC43395jb0.this.m30228v((InterfaceC47266q64) obj);
                return m30228v;
            }
        }, C31631Ac0.m115446d());
        this.f92983o = new C36073Tb5(m30240j);
        this.f92984p = new C36073Tb5.InterfaceC7886b() { // from class: hb0
            @Override // p000.C36073Tb5.InterfaceC7886b
            /* renamed from: a */
            public final void mo36172a(int i) {
                AbstractC43395jb0.this.m30227w(i);
            }
        };
    }
}
