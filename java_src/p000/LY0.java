package p000;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.camera.core.C11243o;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.O80;
import p000.PV5;
/* renamed from: LY0 */
/* loaded from: classes.dex */
public class LY0 implements UV5, SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a */
    public final C35891Sh3 f21649a;

    /* renamed from: b */
    public final HandlerThread f21650b;

    /* renamed from: c */
    public final Executor f21651c;

    /* renamed from: d */
    public final Handler f21652d;

    /* renamed from: e */
    public final AtomicBoolean f21653e;

    /* renamed from: f */
    public final float[] f21654f;

    /* renamed from: g */
    public final float[] f21655g;

    /* renamed from: h */
    public final Map<PV5, Surface> f21656h;

    /* renamed from: i */
    public int f21657i;

    /* renamed from: LY0$a */
    /* loaded from: classes.dex */
    public static class C5025a {

        /* renamed from: a */
        public static ZU5<UV5> f21658a = new ZU5() { // from class: KY0
            @Override // p000.ZU5
            public final Object get() {
                return new LY0();
            }
        };

        private C5025a() {
        }

        /* renamed from: a */
        public static UV5 m96644a() {
            return f21658a.get();
        }
    }

    public LY0() {
        this(InterfaceC35101Ox5.f27604a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m96650l(InterfaceC35101Ox5 interfaceC35101Ox5, O80.C5832a c5832a) {
        try {
            this.f21649a.m85039r(interfaceC35101Ox5);
            c5832a.m92861c(null);
        } catch (RuntimeException e) {
            c5832a.m92858f(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ Object m96649m(final InterfaceC35101Ox5 interfaceC35101Ox5, final O80.C5832a c5832a) throws Exception {
        this.f21651c.execute(new Runnable() { // from class: HY0
            @Override // java.lang.Runnable
            public final void run() {
                LY0.this.m96650l(interfaceC35101Ox5, c5832a);
            }
        });
        return "Init GlRenderer";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m96648n(SurfaceTexture surfaceTexture, Surface surface, C11243o.AbstractC11250g abstractC11250g) {
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        surface.release();
        this.f21657i--;
        m96652j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m96647o(C11243o c11243o) {
        this.f21657i++;
        final SurfaceTexture surfaceTexture = new SurfaceTexture(this.f21649a.m85040q());
        surfaceTexture.setDefaultBufferSize(c11243o.m69105n().getWidth(), c11243o.m69105n().getHeight());
        final Surface surface = new Surface(surfaceTexture);
        c11243o.m69122A(surface, this.f21651c, new InterfaceC48378rz0() { // from class: JY0
            @Override // p000.InterfaceC48378rz0
            public final void accept(Object obj) {
                LY0.this.m96648n(surfaceTexture, surface, (C11243o.AbstractC11250g) obj);
            }
        });
        surfaceTexture.setOnFrameAvailableListener(this, this.f21652d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m96646p(PV5 pv5, PV5.AbstractC6398a abstractC6398a) {
        pv5.close();
        Surface remove = this.f21656h.remove(pv5);
        if (remove != null) {
            this.f21649a.m85058C(remove);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m96645q(final PV5 pv5) {
        Surface mo85337a = pv5.mo85337a(this.f21651c, new InterfaceC48378rz0() { // from class: IY0
            @Override // p000.InterfaceC48378rz0
            public final void accept(Object obj) {
                LY0.this.m96646p(pv5, (PV5.AbstractC6398a) obj);
            }
        });
        this.f21649a.m85033x(mo85337a);
        this.f21656h.put(pv5, mo85337a);
    }

    @Override // p000.TV5
    /* renamed from: a */
    public void mo64492a(final PV5 pv5) {
        if (this.f21653e.get()) {
            pv5.close();
        } else {
            this.f21651c.execute(new Runnable() { // from class: DY0
                @Override // java.lang.Runnable
                public final void run() {
                    LY0.this.m96645q(pv5);
                }
            });
        }
    }

    @Override // p000.TV5
    /* renamed from: b */
    public void mo64491b(final C11243o c11243o) {
        if (this.f21653e.get()) {
            c11243o.m69119D();
        } else {
            this.f21651c.execute(new Runnable() { // from class: EY0
                @Override // java.lang.Runnable
                public final void run() {
                    LY0.this.m96647o(c11243o);
                }
            });
        }
    }

    /* renamed from: j */
    public final void m96652j() {
        if (this.f21653e.get() && this.f21657i == 0) {
            for (PV5 pv5 : this.f21656h.keySet()) {
                pv5.close();
            }
            this.f21656h.clear();
            this.f21649a.m85032y();
            this.f21650b.quit();
        }
    }

    /* renamed from: k */
    public final void m96651k(final InterfaceC35101Ox5 interfaceC35101Ox5) {
        try {
            O80.m92864a(new O80.InterfaceC5834c() { // from class: FY0
                @Override // p000.O80.InterfaceC5834c
                /* renamed from: a */
                public final Object mo3207a(O80.C5832a c5832a) {
                    Object m96649m;
                    m96649m = LY0.this.m96649m(interfaceC35101Ox5, c5832a);
                    return m96649m;
                }
            }).get();
        } catch (InterruptedException | ExecutionException e) {
            e = e;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            }
            throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        boolean z;
        if (this.f21653e.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        surfaceTexture.getTransformMatrix(this.f21654f);
        for (Map.Entry<PV5, Surface> entry : this.f21656h.entrySet()) {
            Surface value = entry.getValue();
            PV5 key = entry.getKey();
            if (key.getFormat() == 34) {
                key.mo85336b(this.f21655g, this.f21654f);
                this.f21649a.m85059B(surfaceTexture.getTimestamp(), this.f21655g, value);
            } else {
                if (key.getFormat() == 256) {
                    z = true;
                } else {
                    z = false;
                }
                HZ3.m103728j(z, "Unsupported format: " + key.getFormat());
            }
        }
    }

    @Override // p000.UV5
    public void release() {
        if (this.f21653e.getAndSet(true)) {
            return;
        }
        this.f21651c.execute(new Runnable() { // from class: GY0
            @Override // java.lang.Runnable
            public final void run() {
                LY0.this.m96652j();
            }
        });
    }

    public LY0(InterfaceC35101Ox5 interfaceC35101Ox5) {
        this.f21653e = new AtomicBoolean(false);
        this.f21654f = new float[16];
        this.f21655g = new float[16];
        this.f21656h = new LinkedHashMap();
        this.f21657i = 0;
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.f21650b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f21652d = handler;
        this.f21651c = C31631Ac0.m115445e(handler);
        this.f21649a = new C35891Sh3();
        try {
            m96651k(interfaceC35101Ox5);
        } catch (RuntimeException e) {
            release();
            throw e;
        }
    }
}
