package androidx.camera.core.impl;

import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicInteger;
import p000.O80;
/* loaded from: classes.dex */
public abstract class DeferrableSurface {

    /* renamed from: i */
    public static final Size f52553i = new Size(0, 0);

    /* renamed from: j */
    public static final boolean f52554j = C33928Jx2.m99528f("DeferrableSurface");

    /* renamed from: k */
    public static final AtomicInteger f52555k = new AtomicInteger(0);

    /* renamed from: l */
    public static final AtomicInteger f52556l = new AtomicInteger(0);

    /* renamed from: a */
    public final Object f52557a;

    /* renamed from: b */
    public int f52558b;

    /* renamed from: c */
    public boolean f52559c;

    /* renamed from: d */
    public O80.C5832a<Void> f52560d;

    /* renamed from: e */
    public final ListenableFuture<Void> f52561e;

    /* renamed from: f */
    public final Size f52562f;

    /* renamed from: g */
    public final int f52563g;

    /* renamed from: h */
    public Class<?> f52564h;

    /* loaded from: classes.dex */
    public static final class SurfaceClosedException extends Exception {

        /* renamed from: b */
        public DeferrableSurface f52565b;

        public SurfaceClosedException(String str, DeferrableSurface deferrableSurface) {
            super(str);
            this.f52565b = deferrableSurface;
        }

        /* renamed from: a */
        public DeferrableSurface m69457a() {
            return this.f52565b;
        }
    }

    /* loaded from: classes.dex */
    public static final class SurfaceUnavailableException extends Exception {
        public SurfaceUnavailableException(String str) {
            super(str);
        }
    }

    public DeferrableSurface() {
        this(f52553i, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ Object m69461l(O80.C5832a c5832a) throws Exception {
        synchronized (this.f52557a) {
            this.f52560d = c5832a;
        }
        return "DeferrableSurface-termination(" + this + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m69460m(String str) {
        try {
            this.f52561e.get();
            m69459n("Surface terminated", f52556l.decrementAndGet(), f52555k.get());
        } catch (Exception e) {
            C33928Jx2.m99531c("DeferrableSurface", "Unexpected surface termination for " + this + "\nStack Trace:\n" + str);
            synchronized (this.f52557a) {
                throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", this, Boolean.valueOf(this.f52559c), Integer.valueOf(this.f52558b)), e);
            }
        }
    }

    /* renamed from: c */
    public void m69470c() {
        O80.C5832a<Void> c5832a;
        synchronized (this.f52557a) {
            if (!this.f52559c) {
                this.f52559c = true;
                if (this.f52558b == 0) {
                    c5832a = this.f52560d;
                    this.f52560d = null;
                } else {
                    c5832a = null;
                }
                if (C33928Jx2.m99528f("DeferrableSurface")) {
                    C33928Jx2.m99533a("DeferrableSurface", "surface closed,  useCount=" + this.f52558b + " closed=true " + this);
                }
            } else {
                c5832a = null;
            }
        }
        if (c5832a != null) {
            c5832a.m92861c(null);
        }
    }

    /* renamed from: d */
    public void m69469d() {
        O80.C5832a<Void> c5832a;
        synchronized (this.f52557a) {
            int i = this.f52558b;
            if (i != 0) {
                int i2 = i - 1;
                this.f52558b = i2;
                if (i2 == 0 && this.f52559c) {
                    c5832a = this.f52560d;
                    this.f52560d = null;
                } else {
                    c5832a = null;
                }
                if (C33928Jx2.m99528f("DeferrableSurface")) {
                    C33928Jx2.m99533a("DeferrableSurface", "use count-1,  useCount=" + this.f52558b + " closed=" + this.f52559c + " " + this);
                    if (this.f52558b == 0) {
                        m69459n("Surface no longer in use", f52556l.get(), f52555k.decrementAndGet());
                    }
                }
            } else {
                throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
        }
        if (c5832a != null) {
            c5832a.m92861c(null);
        }
    }

    /* renamed from: e */
    public Class<?> m69468e() {
        return this.f52564h;
    }

    /* renamed from: f */
    public Size m69467f() {
        return this.f52562f;
    }

    /* renamed from: g */
    public int m69466g() {
        return this.f52563g;
    }

    /* renamed from: h */
    public final ListenableFuture<Surface> m69465h() {
        synchronized (this.f52557a) {
            if (this.f52559c) {
                return IA1.m102838f(new SurfaceClosedException("DeferrableSurface already closed.", this));
            }
            return mo112o();
        }
    }

    /* renamed from: i */
    public ListenableFuture<Void> m69464i() {
        return IA1.m102834j(this.f52561e);
    }

    /* renamed from: j */
    public void m69463j() throws SurfaceClosedException {
        synchronized (this.f52557a) {
            int i = this.f52558b;
            if (i == 0 && this.f52559c) {
                throw new SurfaceClosedException("Cannot begin use on a closed surface.", this);
            }
            this.f52558b = i + 1;
            if (C33928Jx2.m99528f("DeferrableSurface")) {
                if (this.f52558b == 1) {
                    m69459n("New surface in use", f52556l.get(), f52555k.incrementAndGet());
                }
                C33928Jx2.m99533a("DeferrableSurface", "use count+1, useCount=" + this.f52558b + " " + this);
            }
        }
    }

    /* renamed from: k */
    public boolean m69462k() {
        boolean z;
        synchronized (this.f52557a) {
            z = this.f52559c;
        }
        return z;
    }

    /* renamed from: n */
    public final void m69459n(String str, int i, int i2) {
        if (!f52554j && C33928Jx2.m99528f("DeferrableSurface")) {
            C33928Jx2.m99533a("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        C33928Jx2.m99533a("DeferrableSurface", str + "[total_surfaces=" + i + ", used_surfaces=" + i2 + "](" + this + "}");
    }

    /* renamed from: o */
    public abstract ListenableFuture<Surface> mo112o();

    /* renamed from: p */
    public void m69458p(Class<?> cls) {
        this.f52564h = cls;
    }

    public DeferrableSurface(Size size, int i) {
        this.f52557a = new Object();
        this.f52558b = 0;
        this.f52559c = false;
        this.f52562f = size;
        this.f52563g = i;
        ListenableFuture<Void> m92864a = O80.m92864a(new O80.InterfaceC5834c() { // from class: aZ0
            @Override // p000.O80.InterfaceC5834c
            /* renamed from: a */
            public final Object mo3207a(O80.C5832a c5832a) {
                Object m69461l;
                m69461l = DeferrableSurface.this.m69461l(c5832a);
                return m69461l;
            }
        });
        this.f52561e = m92864a;
        if (C33928Jx2.m99528f("DeferrableSurface")) {
            m69459n("Surface created", f52556l.incrementAndGet(), f52555k.get());
            final String stackTraceString = Log.getStackTraceString(new Exception());
            m92864a.addListener(new Runnable() { // from class: bZ0
                @Override // java.lang.Runnable
                public final void run() {
                    DeferrableSurface.this.m69460m(stackTraceString);
                }
            }, C31631Ac0.m115449a());
        }
    }
}
