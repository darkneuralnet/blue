package androidx.camera.view;

import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.C11243o;
import androidx.camera.view.AbstractC11275c;
import androidx.camera.view.C11277d;
import androidx.camera.view.PreviewView;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;
/* renamed from: androidx.camera.view.d */
/* loaded from: classes.dex */
public final class C11277d extends AbstractC11275c {

    /* renamed from: e */
    public SurfaceView f52887e;

    /* renamed from: f */
    public final SurfaceHolder$CallbackC11278a f52888f;

    /* renamed from: androidx.camera.view.d$a */
    /* loaded from: classes.dex */
    public class SurfaceHolder$CallbackC11278a implements SurfaceHolder.Callback {

        /* renamed from: b */
        public Size f52889b;

        /* renamed from: c */
        public C11243o f52890c;

        /* renamed from: d */
        public C11243o f52891d;

        /* renamed from: e */
        public AbstractC11275c.InterfaceC11276a f52892e;

        /* renamed from: f */
        public Size f52893f;

        /* renamed from: g */
        public boolean f52894g = false;

        /* renamed from: h */
        public boolean f52895h = false;

        public SurfaceHolder$CallbackC11278a() {
        }

        /* renamed from: e */
        public static /* synthetic */ void m68922e(AbstractC11275c.InterfaceC11276a interfaceC11276a, C11243o.AbstractC11250g abstractC11250g) {
            C33928Jx2.m99533a("SurfaceViewImpl", "Safe to release surface.");
            if (interfaceC11276a != null) {
                interfaceC11276a.mo28009a();
            }
        }

        /* renamed from: b */
        public final boolean m68925b() {
            return (this.f52894g || this.f52890c == null || !Objects.equals(this.f52889b, this.f52893f)) ? false : true;
        }

        /* renamed from: c */
        public final void m68924c() {
            if (this.f52890c != null) {
                C33928Jx2.m99533a("SurfaceViewImpl", "Request canceled: " + this.f52890c);
                this.f52890c.m69119D();
            }
        }

        /* renamed from: d */
        public final void m68923d() {
            if (this.f52890c != null) {
                C33928Jx2.m99533a("SurfaceViewImpl", "Surface closed " + this.f52890c);
                this.f52890c.m69107l().m69470c();
            }
        }

        /* renamed from: f */
        public void m68921f(C11243o c11243o, AbstractC11275c.InterfaceC11276a interfaceC11276a) {
            m68924c();
            if (this.f52895h) {
                this.f52895h = false;
                c11243o.m69103p();
                return;
            }
            this.f52890c = c11243o;
            this.f52892e = interfaceC11276a;
            Size m69105n = c11243o.m69105n();
            this.f52889b = m69105n;
            this.f52894g = false;
            if (!m68920g()) {
                C33928Jx2.m99533a("SurfaceViewImpl", "Wait for new Surface creation.");
                C11277d.this.f52887e.getHolder().setFixedSize(m69105n.getWidth(), m69105n.getHeight());
            }
        }

        /* renamed from: g */
        public final boolean m68920g() {
            Surface surface = C11277d.this.f52887e.getHolder().getSurface();
            if (m68925b()) {
                C33928Jx2.m99533a("SurfaceViewImpl", "Surface set on Preview.");
                final AbstractC11275c.InterfaceC11276a interfaceC11276a = this.f52892e;
                C11243o c11243o = this.f52890c;
                Objects.requireNonNull(c11243o);
                c11243o.m69122A(surface, NA0.m94296h(C11277d.this.f52887e.getContext()), new InterfaceC48378rz0() { // from class: qW5
                    @Override // p000.InterfaceC48378rz0
                    public final void accept(Object obj) {
                        C11277d.SurfaceHolder$CallbackC11278a.m68922e(AbstractC11275c.InterfaceC11276a.this, (C11243o.AbstractC11250g) obj);
                    }
                });
                this.f52894g = true;
                C11277d.this.m68932d();
                return true;
            }
            return false;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            C33928Jx2.m99533a("SurfaceViewImpl", "Surface changed. Size: " + i2 + "x" + i3);
            this.f52893f = new Size(i2, i3);
            m68920g();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            C11243o c11243o;
            C33928Jx2.m99533a("SurfaceViewImpl", "Surface created.");
            if (this.f52895h && (c11243o = this.f52891d) != null) {
                c11243o.m69103p();
                this.f52891d = null;
                this.f52895h = false;
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C33928Jx2.m99533a("SurfaceViewImpl", "Surface destroyed.");
            if (this.f52894g) {
                m68923d();
            } else {
                m68924c();
            }
            this.f52895h = true;
            C11243o c11243o = this.f52890c;
            if (c11243o != null) {
                this.f52891d = c11243o;
            }
            this.f52894g = false;
            this.f52890c = null;
            this.f52892e = null;
            this.f52893f = null;
            this.f52889b = null;
        }
    }

    public C11277d(FrameLayout frameLayout, C11273b c11273b) {
        super(frameLayout, c11273b);
        this.f52888f = new SurfaceHolder$CallbackC11278a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m68928k(C11243o c11243o, AbstractC11275c.InterfaceC11276a interfaceC11276a) {
        this.f52888f.m68921f(c11243o, interfaceC11276a);
    }

    /* renamed from: l */
    public static boolean m68927l(SurfaceView surfaceView, Size size, C11243o c11243o) {
        return surfaceView != null && Objects.equals(size, c11243o.m69105n());
    }

    @Override // androidx.camera.view.AbstractC11275c
    /* renamed from: a */
    public View mo68919a() {
        return this.f52887e;
    }

    @Override // androidx.camera.view.AbstractC11275c
    /* renamed from: b */
    public void mo68918b() {
    }

    @Override // androidx.camera.view.AbstractC11275c
    /* renamed from: c */
    public void mo68917c() {
    }

    @Override // androidx.camera.view.AbstractC11275c
    /* renamed from: e */
    public void mo68916e(final C11243o c11243o, final AbstractC11275c.InterfaceC11276a interfaceC11276a) {
        if (!m68927l(this.f52887e, this.f52883a, c11243o)) {
            this.f52883a = c11243o.m69105n();
            m68929j();
        }
        if (interfaceC11276a != null) {
            c11243o.m69109j(NA0.m94296h(this.f52887e.getContext()), new Runnable() { // from class: oW5
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC11275c.InterfaceC11276a.this.mo28009a();
                }
            });
        }
        this.f52887e.post(new Runnable() { // from class: pW5
            @Override // java.lang.Runnable
            public final void run() {
                C11277d.this.m68928k(c11243o, interfaceC11276a);
            }
        });
    }

    @Override // androidx.camera.view.AbstractC11275c
    /* renamed from: g */
    public void mo68915g(Executor executor, PreviewView.InterfaceC11266e interfaceC11266e) {
        throw new IllegalArgumentException("SurfaceView doesn't support frame update listener");
    }

    @Override // androidx.camera.view.AbstractC11275c
    /* renamed from: h */
    public ListenableFuture<Void> mo68914h() {
        return IA1.m102836h(null);
    }

    /* renamed from: j */
    public void m68929j() {
        HZ3.m103731g(this.f52884b);
        HZ3.m103731g(this.f52883a);
        SurfaceView surfaceView = new SurfaceView(this.f52884b.getContext());
        this.f52887e = surfaceView;
        surfaceView.setLayoutParams(new FrameLayout.LayoutParams(this.f52883a.getWidth(), this.f52883a.getHeight()));
        this.f52884b.removeAllViews();
        this.f52884b.addView(this.f52887e);
        this.f52887e.getHolder().addCallback(this.f52888f);
    }
}
