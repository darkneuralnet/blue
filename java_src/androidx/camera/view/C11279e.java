package androidx.camera.view;

import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.C11243o;
import androidx.camera.view.AbstractC11275c;
import androidx.camera.view.C11279e;
import androidx.camera.view.PreviewView;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p000.O80;
/* renamed from: androidx.camera.view.e */
/* loaded from: classes.dex */
public final class C11279e extends AbstractC11275c {

    /* renamed from: e */
    public TextureView f52897e;

    /* renamed from: f */
    public SurfaceTexture f52898f;

    /* renamed from: g */
    public ListenableFuture<C11243o.AbstractC11250g> f52899g;

    /* renamed from: h */
    public C11243o f52900h;

    /* renamed from: i */
    public boolean f52901i;

    /* renamed from: j */
    public SurfaceTexture f52902j;

    /* renamed from: k */
    public AtomicReference<O80.C5832a<Void>> f52903k;

    /* renamed from: l */
    public AbstractC11275c.InterfaceC11276a f52904l;

    /* renamed from: m */
    public Executor f52905m;

    /* renamed from: androidx.camera.view.e$a */
    /* loaded from: classes.dex */
    public class TextureView$SurfaceTextureListenerC11280a implements TextureView.SurfaceTextureListener {

        /* renamed from: androidx.camera.view.e$a$a */
        /* loaded from: classes.dex */
        public class C11281a implements CA1<C11243o.AbstractC11250g> {

            /* renamed from: a */
            public final /* synthetic */ SurfaceTexture f52907a;

            public C11281a(SurfaceTexture surfaceTexture) {
                this.f52907a = surfaceTexture;
            }

            @Override // p000.CA1
            /* renamed from: a */
            public void onSuccess(C11243o.AbstractC11250g abstractC11250g) {
                boolean z;
                if (abstractC11250g.mo69088a() != 3) {
                    z = true;
                } else {
                    z = false;
                }
                HZ3.m103728j(z, "Unexpected result from SurfaceRequest. Surface was provided twice.");
                C33928Jx2.m99533a("TextureViewImpl", "SurfaceTexture about to manually be destroyed");
                this.f52907a.release();
                C11279e c11279e = C11279e.this;
                if (c11279e.f52902j != null) {
                    c11279e.f52902j = null;
                }
            }

            @Override // p000.CA1
            public void onFailure(Throwable th) {
                throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th);
            }
        }

        public TextureView$SurfaceTextureListenerC11280a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C33928Jx2.m99533a("TextureViewImpl", "SurfaceTexture available. Size: " + i + "x" + i2);
            C11279e c11279e = C11279e.this;
            c11279e.f52898f = surfaceTexture;
            if (c11279e.f52899g != null) {
                HZ3.m103731g(c11279e.f52900h);
                C33928Jx2.m99533a("TextureViewImpl", "Surface invalidated " + C11279e.this.f52900h);
                C11279e.this.f52900h.m69107l().m69470c();
                return;
            }
            c11279e.m68902t();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C11279e c11279e = C11279e.this;
            c11279e.f52898f = null;
            ListenableFuture<C11243o.AbstractC11250g> listenableFuture = c11279e.f52899g;
            if (listenableFuture != null) {
                IA1.m102842b(listenableFuture, new C11281a(surfaceTexture), NA0.m94296h(C11279e.this.f52897e.getContext()));
                C11279e.this.f52902j = surfaceTexture;
                return false;
            }
            C33928Jx2.m99533a("TextureViewImpl", "SurfaceTexture about to be destroyed");
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C33928Jx2.m99533a("TextureViewImpl", "SurfaceTexture size changed: " + i + "x" + i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            O80.C5832a<Void> andSet = C11279e.this.f52903k.getAndSet(null);
            if (andSet != null) {
                andSet.m92861c(null);
            }
            C11279e.this.getClass();
            Executor executor = C11279e.this.f52905m;
        }
    }

    public C11279e(FrameLayout frameLayout, C11273b c11273b) {
        super(frameLayout, c11273b);
        this.f52901i = false;
        this.f52903k = new AtomicReference<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m68908n(C11243o c11243o) {
        C11243o c11243o2 = this.f52900h;
        if (c11243o2 != null && c11243o2 == c11243o) {
            this.f52900h = null;
            this.f52899g = null;
        }
        m68904r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ Object m68907o(Surface surface, final O80.C5832a c5832a) throws Exception {
        C33928Jx2.m99533a("TextureViewImpl", "Surface set on Preview.");
        C11243o c11243o = this.f52900h;
        Executor m115449a = C31631Ac0.m115449a();
        Objects.requireNonNull(c5832a);
        c11243o.m69122A(surface, m115449a, new InterfaceC48378rz0() { // from class: m36
            @Override // p000.InterfaceC48378rz0
            public final void accept(Object obj) {
                O80.C5832a.this.m92861c((C11243o.AbstractC11250g) obj);
            }
        });
        return "provideSurface[request=" + this.f52900h + " surface=" + surface + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m68906p(Surface surface, ListenableFuture listenableFuture, C11243o c11243o) {
        C33928Jx2.m99533a("TextureViewImpl", "Safe to release surface.");
        m68904r();
        surface.release();
        if (this.f52899g == listenableFuture) {
            this.f52899g = null;
        }
        if (this.f52900h == c11243o) {
            this.f52900h = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ Object m68905q(O80.C5832a c5832a) throws Exception {
        this.f52903k.set(c5832a);
        return "textureViewImpl_waitForNextFrame";
    }

    @Override // androidx.camera.view.AbstractC11275c
    /* renamed from: a */
    public View mo68919a() {
        return this.f52897e;
    }

    @Override // androidx.camera.view.AbstractC11275c
    /* renamed from: b */
    public void mo68918b() {
        m68903s();
    }

    @Override // androidx.camera.view.AbstractC11275c
    /* renamed from: c */
    public void mo68917c() {
        this.f52901i = true;
    }

    @Override // androidx.camera.view.AbstractC11275c
    /* renamed from: e */
    public void mo68916e(final C11243o c11243o, AbstractC11275c.InterfaceC11276a interfaceC11276a) {
        this.f52883a = c11243o.m69105n();
        this.f52904l = interfaceC11276a;
        m68909m();
        C11243o c11243o2 = this.f52900h;
        if (c11243o2 != null) {
            c11243o2.m69119D();
        }
        this.f52900h = c11243o;
        c11243o.m69109j(NA0.m94296h(this.f52897e.getContext()), new Runnable() { // from class: i36
            @Override // java.lang.Runnable
            public final void run() {
                C11279e.this.m68908n(c11243o);
            }
        });
        m68902t();
    }

    @Override // androidx.camera.view.AbstractC11275c
    /* renamed from: g */
    public void mo68915g(Executor executor, PreviewView.InterfaceC11266e interfaceC11266e) {
        this.f52905m = executor;
    }

    @Override // androidx.camera.view.AbstractC11275c
    /* renamed from: h */
    public ListenableFuture<Void> mo68914h() {
        return O80.m92864a(new O80.InterfaceC5834c() { // from class: l36
            @Override // p000.O80.InterfaceC5834c
            /* renamed from: a */
            public final Object mo3207a(O80.C5832a c5832a) {
                Object m68905q;
                m68905q = C11279e.this.m68905q(c5832a);
                return m68905q;
            }
        });
    }

    /* renamed from: m */
    public void m68909m() {
        HZ3.m103731g(this.f52884b);
        HZ3.m103731g(this.f52883a);
        TextureView textureView = new TextureView(this.f52884b.getContext());
        this.f52897e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.f52883a.getWidth(), this.f52883a.getHeight()));
        this.f52897e.setSurfaceTextureListener(new TextureView$SurfaceTextureListenerC11280a());
        this.f52884b.removeAllViews();
        this.f52884b.addView(this.f52897e);
    }

    /* renamed from: r */
    public final void m68904r() {
        AbstractC11275c.InterfaceC11276a interfaceC11276a = this.f52904l;
        if (interfaceC11276a != null) {
            interfaceC11276a.mo28009a();
            this.f52904l = null;
        }
    }

    /* renamed from: s */
    public final void m68903s() {
        if (this.f52901i && this.f52902j != null) {
            SurfaceTexture surfaceTexture = this.f52897e.getSurfaceTexture();
            SurfaceTexture surfaceTexture2 = this.f52902j;
            if (surfaceTexture != surfaceTexture2) {
                this.f52897e.setSurfaceTexture(surfaceTexture2);
                this.f52902j = null;
                this.f52901i = false;
            }
        }
    }

    /* renamed from: t */
    public void m68902t() {
        SurfaceTexture surfaceTexture;
        Size size = this.f52883a;
        if (size != null && (surfaceTexture = this.f52898f) != null && this.f52900h != null) {
            surfaceTexture.setDefaultBufferSize(size.getWidth(), this.f52883a.getHeight());
            final Surface surface = new Surface(this.f52898f);
            final C11243o c11243o = this.f52900h;
            final ListenableFuture<C11243o.AbstractC11250g> m92864a = O80.m92864a(new O80.InterfaceC5834c() { // from class: j36
                @Override // p000.O80.InterfaceC5834c
                /* renamed from: a */
                public final Object mo3207a(O80.C5832a c5832a) {
                    Object m68907o;
                    m68907o = C11279e.this.m68907o(surface, c5832a);
                    return m68907o;
                }
            });
            this.f52899g = m92864a;
            m92864a.addListener(new Runnable() { // from class: k36
                @Override // java.lang.Runnable
                public final void run() {
                    C11279e.this.m68906p(surface, m92864a, c11243o);
                }
            }, NA0.m94296h(this.f52897e.getContext()));
            m68932d();
        }
    }
}
