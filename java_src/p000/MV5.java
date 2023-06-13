package p000;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.C11243o;
import androidx.camera.core.impl.DeferrableSurface;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import p000.MV5;
import p000.O80;
/* renamed from: MV5 */
/* loaded from: classes.dex */
public class MV5 {

    /* renamed from: a */
    public final int f23160a;

    /* renamed from: b */
    public final Matrix f23161b;

    /* renamed from: c */
    public final boolean f23162c;

    /* renamed from: d */
    public final Rect f23163d;

    /* renamed from: e */
    public final boolean f23164e;

    /* renamed from: f */
    public final int f23165f;

    /* renamed from: g */
    public final BR5 f23166g;

    /* renamed from: h */
    public int f23167h;

    /* renamed from: i */
    public SV5 f23168i;

    /* renamed from: k */
    public C11243o f23170k;

    /* renamed from: l */
    public C5298a f23171l;

    /* renamed from: j */
    public boolean f23169j = false;

    /* renamed from: m */
    public final Set<Runnable> f23172m = new HashSet();

    /* renamed from: n */
    public boolean f23173n = false;

    /* renamed from: MV5$a */
    /* loaded from: classes.dex */
    public static class C5298a extends DeferrableSurface {

        /* renamed from: m */
        public final ListenableFuture<Surface> f23174m;

        /* renamed from: n */
        public O80.C5832a<Surface> f23175n;

        /* renamed from: o */
        public DeferrableSurface f23176o;

        public C5298a(Size size, int i) {
            super(size, i);
            this.f23174m = O80.m92864a(new O80.InterfaceC5834c() { // from class: KV5
                @Override // p000.O80.InterfaceC5834c
                /* renamed from: a */
                public final Object mo3207a(O80.C5832a c5832a) {
                    Object m95247l;
                    m95247l = MV5.C5298a.this.m95247l(c5832a);
                    return m95247l;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public /* synthetic */ Object m95247l(O80.C5832a c5832a) throws Exception {
            this.f23175n = c5832a;
            return "SettableFuture hashCode: " + hashCode();
        }

        @Override // androidx.camera.core.impl.DeferrableSurface
        /* renamed from: o */
        public ListenableFuture<Surface> mo112o() {
            return this.f23174m;
        }

        /* renamed from: r */
        public boolean m95245r() {
            O36.m92961a();
            if (this.f23176o == null && !m69462k()) {
                return true;
            }
            return false;
        }

        /* renamed from: s */
        public boolean m95244s(final DeferrableSurface deferrableSurface) throws DeferrableSurface.SurfaceClosedException {
            boolean z;
            O36.m92961a();
            HZ3.m103731g(deferrableSurface);
            DeferrableSurface deferrableSurface2 = this.f23176o;
            boolean z2 = false;
            if (deferrableSurface2 == deferrableSurface) {
                return false;
            }
            if (deferrableSurface2 == null) {
                z = true;
            } else {
                z = false;
            }
            HZ3.m103728j(z, "A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider");
            HZ3.m103736b(m69467f().equals(deferrableSurface.m69467f()), "The provider's size must match the parent");
            if (m69466g() == deferrableSurface.m69466g()) {
                z2 = true;
            }
            HZ3.m103736b(z2, "The provider's format must match the parent");
            HZ3.m103728j(!m69462k(), "The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.");
            this.f23176o = deferrableSurface;
            IA1.m102833k(deferrableSurface.m69465h(), this.f23175n);
            deferrableSurface.m69463j();
            m69464i().addListener(new Runnable() { // from class: LV5
                @Override // java.lang.Runnable
                public final void run() {
                    DeferrableSurface.this.m69469d();
                }
            }, C31631Ac0.m115449a());
            return true;
        }
    }

    public MV5(int i, int i2, BR5 br5, Matrix matrix, boolean z, Rect rect, int i3, boolean z2) {
        this.f23165f = i;
        this.f23160a = i2;
        this.f23166g = br5;
        this.f23161b = matrix;
        this.f23162c = z;
        this.f23163d = rect;
        this.f23167h = i3;
        this.f23164e = z2;
        this.f23171l = new C5298a(br5.mo31669c(), i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ void m95277A(int i) {
        if (this.f23167h == i) {
            return;
        }
        this.f23167h = i;
        m95276B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ ListenableFuture m95250x(final C5298a c5298a, int i, Size size, Rect rect, int i2, boolean z, InterfaceC34196Lb0 interfaceC34196Lb0, Surface surface) throws Exception {
        HZ3.m103731g(surface);
        try {
            c5298a.m69463j();
            SV5 sv5 = new SV5(surface, m95253u(), i, this.f23166g.mo31669c(), size, rect, i2, z, interfaceC34196Lb0);
            sv5.m85331g().addListener(new Runnable() { // from class: JV5
                @Override // java.lang.Runnable
                public final void run() {
                    MV5.C5298a.this.m69469d();
                }
            }, C31631Ac0.m115449a());
            this.f23168i = sv5;
            return IA1.m102836h(sv5);
        } catch (DeferrableSurface.SurfaceClosedException e) {
            return IA1.m102838f(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void m95249y() {
        if (!this.f23173n) {
            m95251w();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void m95248z() {
        C31631Ac0.m115446d().execute(new Runnable() { // from class: HV5
            @Override // java.lang.Runnable
            public final void run() {
                MV5.this.m95249y();
            }
        });
    }

    /* renamed from: B */
    public final void m95276B() {
        O36.m92961a();
        C11243o c11243o = this.f23170k;
        if (c11243o != null) {
            c11243o.m69120C(C11243o.AbstractC11251h.m69081e(this.f23163d, this.f23167h, -1, m95252v()));
        }
    }

    /* renamed from: C */
    public void m95275C(DeferrableSurface deferrableSurface) throws DeferrableSurface.SurfaceClosedException {
        O36.m92961a();
        m95267g();
        this.f23171l.m95244s(deferrableSurface);
    }

    /* renamed from: D */
    public void m95274D(final int i) {
        O36.m92958d(new Runnable() { // from class: GV5
            @Override // java.lang.Runnable
            public final void run() {
                MV5.this.m95277A(i);
            }
        });
    }

    /* renamed from: e */
    public void m95269e(Runnable runnable) {
        O36.m92961a();
        m95267g();
        this.f23172m.add(runnable);
    }

    /* renamed from: f */
    public final void m95268f() {
        HZ3.m103728j(!this.f23169j, "Consumer can only be linked once.");
        this.f23169j = true;
    }

    /* renamed from: g */
    public final void m95267g() {
        HZ3.m103728j(!this.f23173n, "Edge is already closed.");
    }

    /* renamed from: h */
    public final void m95266h() {
        O36.m92961a();
        m95261m();
        this.f23173n = true;
    }

    /* renamed from: i */
    public ListenableFuture<PV5> m95265i(final Size size, final int i, final Rect rect, final int i2, final boolean z, final InterfaceC34196Lb0 interfaceC34196Lb0) {
        O36.m92961a();
        m95267g();
        m95268f();
        final C5298a c5298a = this.f23171l;
        return IA1.m102828p(c5298a.m69465h(), new InterfaceC20537fp() { // from class: IV5
            @Override // p000.InterfaceC20537fp
            public final ListenableFuture apply(Object obj) {
                ListenableFuture m95250x;
                m95250x = MV5.this.m95250x(c5298a, i, size, rect, i2, z, interfaceC34196Lb0, (Surface) obj);
                return m95250x;
            }
        }, C31631Ac0.m115446d());
    }

    /* renamed from: j */
    public C11243o m95264j(InterfaceC34196Lb0 interfaceC34196Lb0) {
        return m95263k(interfaceC34196Lb0, null);
    }

    /* renamed from: k */
    public C11243o m95263k(InterfaceC34196Lb0 interfaceC34196Lb0, Range<Integer> range) {
        O36.m92961a();
        m95267g();
        C11243o c11243o = new C11243o(this.f23166g.mo31669c(), interfaceC34196Lb0, range, new Runnable() { // from class: EV5
            @Override // java.lang.Runnable
            public final void run() {
                MV5.this.m95248z();
            }
        });
        try {
            final DeferrableSurface m69107l = c11243o.m69107l();
            if (this.f23171l.m95244s(m69107l)) {
                ListenableFuture<Void> m69464i = this.f23171l.m69464i();
                Objects.requireNonNull(m69107l);
                m69464i.addListener(new Runnable() { // from class: FV5
                    @Override // java.lang.Runnable
                    public final void run() {
                        DeferrableSurface.this.m69470c();
                    }
                }, C31631Ac0.m115449a());
            }
            this.f23170k = c11243o;
            m95276B();
            return c11243o;
        } catch (DeferrableSurface.SurfaceClosedException e) {
            throw new AssertionError("Surface is somehow already closed", e);
        } catch (RuntimeException e2) {
            c11243o.m69119D();
            throw e2;
        }
    }

    /* renamed from: l */
    public final void m95262l() {
        O36.m92961a();
        m95267g();
        m95261m();
    }

    /* renamed from: m */
    public final void m95261m() {
        this.f23171l.m69470c();
        SV5 sv5 = this.f23168i;
        if (sv5 != null) {
            sv5.m85328j();
            this.f23168i = null;
        }
    }

    /* renamed from: n */
    public Rect m95260n() {
        return this.f23163d;
    }

    /* renamed from: o */
    public DeferrableSurface m95259o() {
        O36.m92961a();
        m95267g();
        m95268f();
        return this.f23171l;
    }

    /* renamed from: p */
    public int m95258p() {
        return this.f23160a;
    }

    /* renamed from: q */
    public boolean m95257q() {
        return this.f23164e;
    }

    /* renamed from: r */
    public int m95256r() {
        return this.f23167h;
    }

    /* renamed from: s */
    public Matrix m95255s() {
        return this.f23161b;
    }

    /* renamed from: t */
    public BR5 m95254t() {
        return this.f23166g;
    }

    /* renamed from: u */
    public int m95253u() {
        return this.f23165f;
    }

    /* renamed from: v */
    public boolean m95252v() {
        return this.f23162c;
    }

    /* renamed from: w */
    public void m95251w() {
        O36.m92961a();
        m95267g();
        if (this.f23171l.m95245r()) {
            return;
        }
        m95261m();
        this.f23169j = false;
        this.f23171l = new C5298a(this.f23166g.mo31669c(), this.f23160a);
        for (Runnable runnable : this.f23172m) {
            runnable.run();
        }
    }
}
