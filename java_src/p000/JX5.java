package p000;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.core.impl.C11201g;
import androidx.camera.core.impl.DeferrableSurface;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p000.DX5;
import p000.O80;
import p000.PX5;
/* renamed from: JX5 */
/* loaded from: classes.dex */
public class JX5 extends DX5.AbstractC1519a implements DX5, PX5.InterfaceC6403b {

    /* renamed from: b */
    public final C50549vf0 f17734b;

    /* renamed from: c */
    public final Handler f17735c;

    /* renamed from: d */
    public final Executor f17736d;

    /* renamed from: e */
    public final ScheduledExecutorService f17737e;

    /* renamed from: f */
    public DX5.AbstractC1519a f17738f;

    /* renamed from: g */
    public C31613Aa0 f17739g;

    /* renamed from: h */
    public ListenableFuture<Void> f17740h;

    /* renamed from: i */
    public O80.C5832a<Void> f17741i;

    /* renamed from: j */
    public ListenableFuture<List<Surface>> f17742j;

    /* renamed from: a */
    public final Object f17733a = new Object();

    /* renamed from: k */
    public List<DeferrableSurface> f17743k = null;

    /* renamed from: l */
    public boolean f17744l = false;

    /* renamed from: m */
    public boolean f17745m = false;

    /* renamed from: n */
    public boolean f17746n = false;

    /* renamed from: JX5$a */
    /* loaded from: classes.dex */
    public class C4137a implements CA1<Void> {
        public C4137a() {
        }

        @Override // p000.CA1
        /* renamed from: a */
        public void onSuccess(Void r1) {
        }

        @Override // p000.CA1
        public void onFailure(Throwable th) {
            JX5.this.mo100279i();
            JX5 jx5 = JX5.this;
            jx5.f17734b.m8282j(jx5);
        }
    }

    /* renamed from: JX5$b */
    /* loaded from: classes.dex */
    public class C4138b extends CameraCaptureSession.StateCallback {
        public C4138b() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(CameraCaptureSession cameraCaptureSession) {
            JX5.this.m100273z(cameraCaptureSession);
            JX5 jx5 = JX5.this;
            jx5.mo88422m(jx5);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            JX5.this.m100273z(cameraCaptureSession);
            JX5 jx5 = JX5.this;
            jx5.mo88421n(jx5);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            JX5.this.m100273z(cameraCaptureSession);
            JX5 jx5 = JX5.this;
            jx5.mo88420o(jx5);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            O80.C5832a<Void> c5832a;
            try {
                JX5.this.m100273z(cameraCaptureSession);
                JX5 jx5 = JX5.this;
                jx5.mo15594p(jx5);
                synchronized (JX5.this.f17733a) {
                    HZ3.m103730h(JX5.this.f17741i, "OpenCaptureSession completer should not null");
                    JX5 jx52 = JX5.this;
                    c5832a = jx52.f17741i;
                    jx52.f17741i = null;
                }
                c5832a.m92858f(new IllegalStateException("onConfigureFailed"));
            } catch (Throwable th) {
                synchronized (JX5.this.f17733a) {
                    HZ3.m103730h(JX5.this.f17741i, "OpenCaptureSession completer should not null");
                    JX5 jx53 = JX5.this;
                    O80.C5832a<Void> c5832a2 = jx53.f17741i;
                    jx53.f17741i = null;
                    c5832a2.m92858f(new IllegalStateException("onConfigureFailed"));
                    throw th;
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            O80.C5832a<Void> c5832a;
            try {
                JX5.this.m100273z(cameraCaptureSession);
                JX5 jx5 = JX5.this;
                jx5.mo15593q(jx5);
                synchronized (JX5.this.f17733a) {
                    HZ3.m103730h(JX5.this.f17741i, "OpenCaptureSession completer should not null");
                    JX5 jx52 = JX5.this;
                    c5832a = jx52.f17741i;
                    jx52.f17741i = null;
                }
                c5832a.m92861c(null);
            } catch (Throwable th) {
                synchronized (JX5.this.f17733a) {
                    HZ3.m103730h(JX5.this.f17741i, "OpenCaptureSession completer should not null");
                    JX5 jx53 = JX5.this;
                    O80.C5832a<Void> c5832a2 = jx53.f17741i;
                    jx53.f17741i = null;
                    c5832a2.m92861c(null);
                    throw th;
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(CameraCaptureSession cameraCaptureSession) {
            JX5.this.m100273z(cameraCaptureSession);
            JX5 jx5 = JX5.this;
            jx5.mo15592r(jx5);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            JX5.this.m100273z(cameraCaptureSession);
            JX5 jx5 = JX5.this;
            jx5.mo88419t(jx5, surface);
        }
    }

    public JX5(C50549vf0 c50549vf0, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.f17734b = c50549vf0;
        this.f17735c = handler;
        this.f17736d = executor;
        this.f17737e = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ void m100290C() {
        mo15591s(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public /* synthetic */ void m100289D(DX5 dx5) {
        this.f17734b.m8284h(this);
        mo15591s(dx5);
        Objects.requireNonNull(this.f17738f);
        this.f17738f.mo88420o(dx5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ void m100288E(DX5 dx5) {
        Objects.requireNonNull(this.f17738f);
        this.f17738f.mo15591s(dx5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ Object m100287F(List list, C44581lb0 c44581lb0, C49529tv5 c49529tv5, O80.C5832a c5832a) throws Exception {
        boolean z;
        String str;
        synchronized (this.f17733a) {
            m100292A(list);
            if (this.f17741i == null) {
                z = true;
            } else {
                z = false;
            }
            HZ3.m103728j(z, "The openCaptureSessionCompleter can only set once!");
            this.f17741i = c5832a;
            c44581lb0.m27119a(c49529tv5);
            str = "openCaptureSession[session=" + this + "]";
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ ListenableFuture m100286G(List list, List list2) throws Exception {
        C33928Jx2.m99533a("SyncCaptureSessionBase", "[" + this + "] getSurface...done");
        if (list2.contains(null)) {
            return IA1.m102838f(new DeferrableSurface.SurfaceClosedException("Surface closed", (DeferrableSurface) list.get(list2.indexOf(null))));
        }
        if (list2.isEmpty()) {
            return IA1.m102838f(new IllegalArgumentException("Unable to open capture session without surfaces"));
        }
        return IA1.m102836h(list2);
    }

    /* renamed from: A */
    public void m100292A(List<DeferrableSurface> list) throws DeferrableSurface.SurfaceClosedException {
        synchronized (this.f17733a) {
            m100285H();
            C11201g.m69409f(list);
            this.f17743k = list;
        }
    }

    /* renamed from: B */
    public boolean m100291B() {
        boolean z;
        synchronized (this.f17733a) {
            if (this.f17740h != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: H */
    public void m100285H() {
        synchronized (this.f17733a) {
            List<DeferrableSurface> list = this.f17743k;
            if (list != null) {
                C11201g.m69410e(list);
                this.f17743k = null;
            }
        }
    }

    @Override // p000.PX5.InterfaceC6403b
    /* renamed from: a */
    public Executor mo90150a() {
        return this.f17736d;
    }

    @Override // p000.PX5.InterfaceC6403b
    /* renamed from: b */
    public C49529tv5 mo90149b(int i, List<C36053Sz3> list, DX5.AbstractC1519a abstractC1519a) {
        this.f17738f = abstractC1519a;
        return new C49529tv5(i, list, mo90150a(), new C4138b());
    }

    @Override // p000.DX5
    /* renamed from: c */
    public DX5.AbstractC1519a mo100284c() {
        return this;
    }

    @Override // p000.DX5
    public void close() {
        HZ3.m103730h(this.f17739g, "Need to call openCaptureSession before using this API.");
        this.f17734b.m8283i(this);
        this.f17739g.m115538c().close();
        mo90150a().execute(new Runnable() { // from class: HX5
            @Override // java.lang.Runnable
            public final void run() {
                JX5.this.m100290C();
            }
        });
    }

    @Override // p000.DX5
    /* renamed from: d */
    public void mo100283d() throws CameraAccessException {
        HZ3.m103730h(this.f17739g, "Need to call openCaptureSession before using this API.");
        this.f17739g.m115538c().abortCaptures();
    }

    @Override // p000.DX5
    /* renamed from: e */
    public int mo100282e(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        HZ3.m103730h(this.f17739g, "Need to call openCaptureSession before using this API.");
        return this.f17739g.m115540a(list, mo90150a(), captureCallback);
    }

    @Override // p000.DX5
    /* renamed from: f */
    public C31613Aa0 mo100281f() {
        HZ3.m103731g(this.f17739g);
        return this.f17739g;
    }

    @Override // p000.DX5
    /* renamed from: g */
    public void mo100280g() throws CameraAccessException {
        HZ3.m103730h(this.f17739g, "Need to call openCaptureSession before using this API.");
        this.f17739g.m115538c().stopRepeating();
    }

    @Override // p000.DX5
    public CameraDevice getDevice() {
        HZ3.m103731g(this.f17739g);
        return this.f17739g.m115538c().getDevice();
    }

    @Override // p000.DX5
    /* renamed from: h */
    public ListenableFuture<Void> mo92028h() {
        return IA1.m102836h(null);
    }

    @Override // p000.DX5
    /* renamed from: i */
    public void mo100279i() {
        m100285H();
    }

    @Override // p000.DX5
    /* renamed from: j */
    public int mo92027j(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        HZ3.m103730h(this.f17739g, "Need to call openCaptureSession before using this API.");
        return this.f17739g.m115539b(captureRequest, mo90150a(), captureCallback);
    }

    @Override // p000.PX5.InterfaceC6403b
    /* renamed from: k */
    public ListenableFuture<List<Surface>> mo90148k(final List<DeferrableSurface> list, long j) {
        synchronized (this.f17733a) {
            if (this.f17745m) {
                return IA1.m102838f(new CancellationException("Opener is disabled"));
            }
            DA1 m110816e = DA1.m110820a(C11201g.m69404k(list, false, j, mo90150a(), this.f17737e)).m110816e(new InterfaceC20537fp() { // from class: EX5
                @Override // p000.InterfaceC20537fp
                public final ListenableFuture apply(Object obj) {
                    ListenableFuture m100286G;
                    m100286G = JX5.this.m100286G(list, (List) obj);
                    return m100286G;
                }
            }, mo90150a());
            this.f17742j = m110816e;
            return IA1.m102834j(m110816e);
        }
    }

    @Override // p000.PX5.InterfaceC6403b
    /* renamed from: l */
    public ListenableFuture<Void> mo90147l(CameraDevice cameraDevice, final C49529tv5 c49529tv5, final List<DeferrableSurface> list) {
        synchronized (this.f17733a) {
            if (this.f17745m) {
                return IA1.m102838f(new CancellationException("Opener is disabled"));
            }
            this.f17734b.m8280l(this);
            final C44581lb0 m27118b = C44581lb0.m27118b(cameraDevice, this.f17735c);
            ListenableFuture<Void> m92864a = O80.m92864a(new O80.InterfaceC5834c() { // from class: FX5
                @Override // p000.O80.InterfaceC5834c
                /* renamed from: a */
                public final Object mo3207a(O80.C5832a c5832a) {
                    Object m100287F;
                    m100287F = JX5.this.m100287F(list, m27118b, c49529tv5, c5832a);
                    return m100287F;
                }
            });
            this.f17740h = m92864a;
            IA1.m102842b(m92864a, new C4137a(), C31631Ac0.m115449a());
            return IA1.m102834j(this.f17740h);
        }
    }

    @Override // p000.DX5.AbstractC1519a
    /* renamed from: m */
    public void mo88422m(DX5 dx5) {
        Objects.requireNonNull(this.f17738f);
        this.f17738f.mo88422m(dx5);
    }

    @Override // p000.DX5.AbstractC1519a
    /* renamed from: n */
    public void mo88421n(DX5 dx5) {
        Objects.requireNonNull(this.f17738f);
        this.f17738f.mo88421n(dx5);
    }

    @Override // p000.DX5.AbstractC1519a
    /* renamed from: o */
    public void mo88420o(final DX5 dx5) {
        ListenableFuture<Void> listenableFuture;
        synchronized (this.f17733a) {
            if (!this.f17744l) {
                this.f17744l = true;
                HZ3.m103730h(this.f17740h, "Need to call openCaptureSession before using this API.");
                listenableFuture = this.f17740h;
            } else {
                listenableFuture = null;
            }
        }
        mo100279i();
        if (listenableFuture != null) {
            listenableFuture.addListener(new Runnable() { // from class: GX5
                @Override // java.lang.Runnable
                public final void run() {
                    JX5.this.m100289D(dx5);
                }
            }, C31631Ac0.m115449a());
        }
    }

    @Override // p000.DX5.AbstractC1519a
    /* renamed from: p */
    public void mo15594p(DX5 dx5) {
        Objects.requireNonNull(this.f17738f);
        mo100279i();
        this.f17734b.m8282j(this);
        this.f17738f.mo15594p(dx5);
    }

    @Override // p000.DX5.AbstractC1519a
    /* renamed from: q */
    public void mo15593q(DX5 dx5) {
        Objects.requireNonNull(this.f17738f);
        this.f17734b.m8281k(this);
        this.f17738f.mo15593q(dx5);
    }

    @Override // p000.DX5.AbstractC1519a
    /* renamed from: r */
    public void mo15592r(DX5 dx5) {
        Objects.requireNonNull(this.f17738f);
        this.f17738f.mo15592r(dx5);
    }

    @Override // p000.DX5.AbstractC1519a
    /* renamed from: s */
    public void mo15591s(final DX5 dx5) {
        ListenableFuture<Void> listenableFuture;
        synchronized (this.f17733a) {
            if (!this.f17746n) {
                this.f17746n = true;
                HZ3.m103730h(this.f17740h, "Need to call openCaptureSession before using this API.");
                listenableFuture = this.f17740h;
            } else {
                listenableFuture = null;
            }
        }
        if (listenableFuture != null) {
            listenableFuture.addListener(new Runnable() { // from class: IX5
                @Override // java.lang.Runnable
                public final void run() {
                    JX5.this.m100288E(dx5);
                }
            }, C31631Ac0.m115449a());
        }
    }

    @Override // p000.PX5.InterfaceC6403b
    public boolean stop() {
        boolean z;
        ListenableFuture<List<Surface>> listenableFuture = null;
        try {
            synchronized (this.f17733a) {
                if (!this.f17745m) {
                    ListenableFuture<List<Surface>> listenableFuture2 = this.f17742j;
                    if (listenableFuture2 != null) {
                        listenableFuture = listenableFuture2;
                    }
                    this.f17745m = true;
                }
                if (!m100291B()) {
                    z = true;
                } else {
                    z = false;
                }
            }
            return z;
        } finally {
            if (listenableFuture != null) {
                listenableFuture.cancel(true);
            }
        }
    }

    @Override // p000.DX5.AbstractC1519a
    /* renamed from: t */
    public void mo88419t(DX5 dx5, Surface surface) {
        Objects.requireNonNull(this.f17738f);
        this.f17738f.mo88419t(dx5, surface);
    }

    /* renamed from: z */
    public void m100273z(CameraCaptureSession cameraCaptureSession) {
        if (this.f17739g == null) {
            this.f17739g = C31613Aa0.m115537d(cameraCaptureSession, this.f17735c);
        }
    }
}
