package androidx.camera.core;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.C11243o;
import androidx.camera.core.impl.DeferrableSurface;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p000.O80;
/* renamed from: androidx.camera.core.o */
/* loaded from: classes.dex */
public final class C11243o {

    /* renamed from: a */
    public final Object f52756a;

    /* renamed from: b */
    public final Size f52757b;

    /* renamed from: c */
    public final Range<Integer> f52758c;

    /* renamed from: d */
    public final InterfaceC34196Lb0 f52759d;

    /* renamed from: e */
    public final ListenableFuture<Surface> f52760e;

    /* renamed from: f */
    public final O80.C5832a<Surface> f52761f;

    /* renamed from: g */
    public final ListenableFuture<Void> f52762g;

    /* renamed from: h */
    public final O80.C5832a<Void> f52763h;

    /* renamed from: i */
    public final O80.C5832a<Void> f52764i;

    /* renamed from: j */
    public final DeferrableSurface f52765j;

    /* renamed from: k */
    public AbstractC11251h f52766k;

    /* renamed from: l */
    public InterfaceC11252i f52767l;

    /* renamed from: m */
    public Executor f52768m;

    /* renamed from: androidx.camera.core.o$a */
    /* loaded from: classes.dex */
    public class C11244a implements CA1<Void> {

        /* renamed from: a */
        public final /* synthetic */ O80.C5832a f52769a;

        /* renamed from: b */
        public final /* synthetic */ ListenableFuture f52770b;

        public C11244a(O80.C5832a c5832a, ListenableFuture listenableFuture) {
            this.f52769a = c5832a;
            this.f52770b = listenableFuture;
        }

        @Override // p000.CA1
        /* renamed from: a */
        public void onSuccess(Void r2) {
            HZ3.m103729i(this.f52769a.m92861c(null));
        }

        @Override // p000.CA1
        public void onFailure(Throwable th) {
            if (th instanceof C11249f) {
                HZ3.m103729i(this.f52770b.cancel(false));
            } else {
                HZ3.m103729i(this.f52769a.m92861c(null));
            }
        }
    }

    /* renamed from: androidx.camera.core.o$b */
    /* loaded from: classes.dex */
    public class C11245b extends DeferrableSurface {
        public C11245b(Size size, int i) {
            super(size, i);
        }

        @Override // androidx.camera.core.impl.DeferrableSurface
        /* renamed from: o */
        public ListenableFuture<Surface> mo112o() {
            return C11243o.this.f52760e;
        }
    }

    /* renamed from: androidx.camera.core.o$c */
    /* loaded from: classes.dex */
    public class C11246c implements CA1<Surface> {

        /* renamed from: a */
        public final /* synthetic */ ListenableFuture f52773a;

        /* renamed from: b */
        public final /* synthetic */ O80.C5832a f52774b;

        /* renamed from: c */
        public final /* synthetic */ String f52775c;

        public C11246c(ListenableFuture listenableFuture, O80.C5832a c5832a, String str) {
            this.f52773a = listenableFuture;
            this.f52774b = c5832a;
            this.f52775c = str;
        }

        @Override // p000.CA1
        /* renamed from: a */
        public void onSuccess(Surface surface) {
            IA1.m102833k(this.f52773a, this.f52774b);
        }

        @Override // p000.CA1
        public void onFailure(Throwable th) {
            if (th instanceof CancellationException) {
                O80.C5832a c5832a = this.f52774b;
                HZ3.m103729i(c5832a.m92858f(new C11249f(this.f52775c + " cancelled.", th)));
                return;
            }
            this.f52774b.m92861c(null);
        }
    }

    /* renamed from: androidx.camera.core.o$d */
    /* loaded from: classes.dex */
    public class C11247d implements CA1<Void> {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC48378rz0 f52777a;

        /* renamed from: b */
        public final /* synthetic */ Surface f52778b;

        public C11247d(InterfaceC48378rz0 interfaceC48378rz0, Surface surface) {
            this.f52777a = interfaceC48378rz0;
            this.f52778b = surface;
        }

        @Override // p000.CA1
        /* renamed from: a */
        public void onSuccess(Void r3) {
            this.f52777a.accept(AbstractC11250g.m69086c(0, this.f52778b));
        }

        @Override // p000.CA1
        public void onFailure(Throwable th) {
            HZ3.m103728j(th instanceof C11249f, "Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th);
            this.f52777a.accept(AbstractC11250g.m69086c(1, this.f52778b));
        }
    }

    /* renamed from: androidx.camera.core.o$e */
    /* loaded from: classes.dex */
    public class C11248e implements CA1<Void> {

        /* renamed from: a */
        public final /* synthetic */ Runnable f52780a;

        public C11248e(Runnable runnable) {
            this.f52780a = runnable;
        }

        @Override // p000.CA1
        /* renamed from: a */
        public void onSuccess(Void r1) {
            this.f52780a.run();
        }

        @Override // p000.CA1
        public void onFailure(Throwable th) {
        }
    }

    /* renamed from: androidx.camera.core.o$f */
    /* loaded from: classes.dex */
    public static final class C11249f extends RuntimeException {
        public C11249f(String str, Throwable th) {
            super(str, th);
        }
    }

    /* renamed from: androidx.camera.core.o$g */
    /* loaded from: classes.dex */
    public static abstract class AbstractC11250g {
        /* renamed from: c */
        public static AbstractC11250g m69086c(int i, Surface surface) {
            return new C11150b(i, surface);
        }

        /* renamed from: a */
        public abstract int mo69088a();

        /* renamed from: b */
        public abstract Surface mo69087b();
    }

    /* renamed from: androidx.camera.core.o$h */
    /* loaded from: classes.dex */
    public static abstract class AbstractC11251h {
        /* renamed from: e */
        public static AbstractC11251h m69081e(Rect rect, int i, int i2, boolean z) {
            return new C11151c(rect, i, i2, z);
        }

        /* renamed from: a */
        public abstract Rect mo69085a();

        /* renamed from: b */
        public abstract int mo69084b();

        /* renamed from: c */
        public abstract int mo69083c();

        /* renamed from: d */
        public abstract boolean mo69082d();
    }

    /* renamed from: androidx.camera.core.o$i */
    /* loaded from: classes.dex */
    public interface InterfaceC11252i {
        /* renamed from: a */
        void mo29414a(AbstractC11251h abstractC11251h);
    }

    public C11243o(Size size, InterfaceC34196Lb0 interfaceC34196Lb0, Runnable runnable) {
        this(size, interfaceC34196Lb0, null, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ Object m69101r(AtomicReference atomicReference, O80.C5832a c5832a) throws Exception {
        atomicReference.set(c5832a);
        return "SurfaceRequest-surface-recreation(" + hashCode() + ")";
    }

    /* renamed from: s */
    public static /* synthetic */ Object m69100s(AtomicReference atomicReference, String str, O80.C5832a c5832a) throws Exception {
        atomicReference.set(c5832a);
        return str + "-cancellation";
    }

    /* renamed from: t */
    public static /* synthetic */ Object m69099t(AtomicReference atomicReference, String str, O80.C5832a c5832a) throws Exception {
        atomicReference.set(c5832a);
        return str + "-status";
    }

    /* renamed from: u */
    public static /* synthetic */ Object m69098u(AtomicReference atomicReference, String str, O80.C5832a c5832a) throws Exception {
        atomicReference.set(c5832a);
        return str + "-Surface";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void m69097v() {
        this.f52760e.cancel(true);
    }

    /* renamed from: w */
    public static /* synthetic */ void m69096w(InterfaceC48378rz0 interfaceC48378rz0, Surface surface) {
        interfaceC48378rz0.accept(AbstractC11250g.m69086c(3, surface));
    }

    /* renamed from: x */
    public static /* synthetic */ void m69095x(InterfaceC48378rz0 interfaceC48378rz0, Surface surface) {
        interfaceC48378rz0.accept(AbstractC11250g.m69086c(4, surface));
    }

    /* renamed from: A */
    public void m69122A(final Surface surface, Executor executor, final InterfaceC48378rz0<AbstractC11250g> interfaceC48378rz0) {
        if (!this.f52761f.m92861c(surface) && !this.f52760e.isCancelled()) {
            HZ3.m103729i(this.f52760e.isDone());
            try {
                this.f52760e.get();
                executor.execute(new Runnable() { // from class: jW5
                    @Override // java.lang.Runnable
                    public final void run() {
                        C11243o.m69096w(InterfaceC48378rz0.this, surface);
                    }
                });
                return;
            } catch (InterruptedException | ExecutionException unused) {
                executor.execute(new Runnable() { // from class: kW5
                    @Override // java.lang.Runnable
                    public final void run() {
                        C11243o.m69095x(InterfaceC48378rz0.this, surface);
                    }
                });
                return;
            }
        }
        IA1.m102842b(this.f52762g, new C11247d(interfaceC48378rz0, surface), executor);
    }

    /* renamed from: B */
    public void m69121B(Executor executor, final InterfaceC11252i interfaceC11252i) {
        final AbstractC11251h abstractC11251h;
        synchronized (this.f52756a) {
            this.f52767l = interfaceC11252i;
            this.f52768m = executor;
            abstractC11251h = this.f52766k;
        }
        if (abstractC11251h != null) {
            executor.execute(new Runnable() { // from class: gW5
                @Override // java.lang.Runnable
                public final void run() {
                    C11243o.InterfaceC11252i.this.mo29414a(abstractC11251h);
                }
            });
        }
    }

    /* renamed from: C */
    public void m69120C(final AbstractC11251h abstractC11251h) {
        final InterfaceC11252i interfaceC11252i;
        Executor executor;
        synchronized (this.f52756a) {
            this.f52766k = abstractC11251h;
            interfaceC11252i = this.f52767l;
            executor = this.f52768m;
        }
        if (interfaceC11252i != null && executor != null) {
            executor.execute(new Runnable() { // from class: hW5
                @Override // java.lang.Runnable
                public final void run() {
                    C11243o.InterfaceC11252i.this.mo29414a(abstractC11251h);
                }
            });
        }
    }

    /* renamed from: D */
    public boolean m69119D() {
        return this.f52761f.m92858f(new DeferrableSurface.SurfaceUnavailableException("Surface request will not complete."));
    }

    @SuppressLint({"PairedRegistration"})
    /* renamed from: j */
    public void m69109j(Executor executor, Runnable runnable) {
        this.f52764i.m92863a(runnable, executor);
    }

    /* renamed from: k */
    public InterfaceC34196Lb0 m69108k() {
        return this.f52759d;
    }

    /* renamed from: l */
    public DeferrableSurface m69107l() {
        return this.f52765j;
    }

    /* renamed from: m */
    public Range<Integer> m69106m() {
        return this.f52758c;
    }

    /* renamed from: n */
    public Size m69105n() {
        return this.f52757b;
    }

    /* renamed from: o */
    public final O80.C5832a<Void> m69104o(Executor executor, Runnable runnable) {
        final AtomicReference atomicReference = new AtomicReference(null);
        IA1.m102842b(O80.m92864a(new O80.InterfaceC5834c() { // from class: iW5
            @Override // p000.O80.InterfaceC5834c
            /* renamed from: a */
            public final Object mo3207a(O80.C5832a c5832a) {
                Object m69101r;
                m69101r = C11243o.this.m69101r(atomicReference, c5832a);
                return m69101r;
            }
        }), new C11248e(runnable), executor);
        return (O80.C5832a) HZ3.m103731g((O80.C5832a) atomicReference.get());
    }

    /* renamed from: p */
    public boolean m69103p() {
        m69119D();
        return this.f52763h.m92861c(null);
    }

    /* renamed from: q */
    public boolean m69102q() {
        return this.f52760e.isDone();
    }

    public C11243o(Size size, InterfaceC34196Lb0 interfaceC34196Lb0, Range<Integer> range, Runnable runnable) {
        this.f52756a = new Object();
        this.f52757b = size;
        this.f52759d = interfaceC34196Lb0;
        this.f52758c = range;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        final AtomicReference atomicReference = new AtomicReference(null);
        ListenableFuture m92864a = O80.m92864a(new O80.InterfaceC5834c() { // from class: cW5
            @Override // p000.O80.InterfaceC5834c
            /* renamed from: a */
            public final Object mo3207a(O80.C5832a c5832a) {
                Object m69100s;
                m69100s = C11243o.m69100s(atomicReference, str, c5832a);
                return m69100s;
            }
        });
        O80.C5832a<Void> c5832a = (O80.C5832a) HZ3.m103731g((O80.C5832a) atomicReference.get());
        this.f52764i = c5832a;
        final AtomicReference atomicReference2 = new AtomicReference(null);
        ListenableFuture<Void> m92864a2 = O80.m92864a(new O80.InterfaceC5834c() { // from class: dW5
            @Override // p000.O80.InterfaceC5834c
            /* renamed from: a */
            public final Object mo3207a(O80.C5832a c5832a2) {
                Object m69099t;
                m69099t = C11243o.m69099t(atomicReference2, str, c5832a2);
                return m69099t;
            }
        });
        this.f52762g = m92864a2;
        IA1.m102842b(m92864a2, new C11244a(c5832a, m92864a), C31631Ac0.m115449a());
        final AtomicReference atomicReference3 = new AtomicReference(null);
        ListenableFuture<Surface> m92864a3 = O80.m92864a(new O80.InterfaceC5834c() { // from class: eW5
            @Override // p000.O80.InterfaceC5834c
            /* renamed from: a */
            public final Object mo3207a(O80.C5832a c5832a2) {
                Object m69098u;
                m69098u = C11243o.m69098u(atomicReference3, str, c5832a2);
                return m69098u;
            }
        });
        this.f52760e = m92864a3;
        this.f52761f = (O80.C5832a) HZ3.m103731g((O80.C5832a) atomicReference3.get());
        C11245b c11245b = new C11245b(size, 34);
        this.f52765j = c11245b;
        ListenableFuture<Void> m69464i = c11245b.m69464i();
        IA1.m102842b(m92864a3, new C11246c(m69464i, (O80.C5832a) HZ3.m103731g((O80.C5832a) atomicReference2.get()), str), C31631Ac0.m115449a());
        m69464i.addListener(new Runnable() { // from class: fW5
            @Override // java.lang.Runnable
            public final void run() {
                C11243o.this.m69097v();
            }
        }, C31631Ac0.m115449a());
        this.f52763h = m69104o(C31631Ac0.m115449a(), runnable);
    }
}
