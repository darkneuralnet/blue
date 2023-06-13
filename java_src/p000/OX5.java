package p000;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p000.C35088Ow1;
import p000.C48355rw6;
/* renamed from: OX5 */
/* loaded from: classes.dex */
public class OX5 extends JX5 {

    /* renamed from: o */
    public final Object f26741o;

    /* renamed from: p */
    public List<DeferrableSurface> f26742p;

    /* renamed from: q */
    public ListenableFuture<Void> f26743q;

    /* renamed from: r */
    public final C35322Pw1 f26744r;

    /* renamed from: s */
    public final C48355rw6 f26745s;

    /* renamed from: t */
    public final C35088Ow1 f26746t;

    public OX5(C36099Te4 c36099Te4, C36099Te4 c36099Te42, C50549vf0 c50549vf0, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        super(c50549vf0, executor, scheduledExecutorService, handler);
        this.f26741o = new Object();
        this.f26744r = new C35322Pw1(c36099Te4, c36099Te42);
        this.f26745s = new C48355rw6(c36099Te4);
        this.f26746t = new C35088Ow1(c36099Te42);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public /* synthetic */ void m92032N() {
        m92033M("Session call super.close()");
        super.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public /* synthetic */ void m92031O(DX5 dx5) {
        super.mo15593q(dx5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public /* synthetic */ ListenableFuture m92030P(CameraDevice cameraDevice, C49529tv5 c49529tv5, List list) {
        return super.mo90147l(cameraDevice, c49529tv5, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public /* synthetic */ int m92029Q(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return super.mo92027j(captureRequest, captureCallback);
    }

    /* renamed from: M */
    public void m92033M(String str) {
        C33928Jx2.m99533a("SyncCaptureSessionImpl", "[" + this + "] " + str);
    }

    @Override // p000.JX5, p000.DX5
    public void close() {
        m92033M("Session call close()");
        this.f26745s.m15015f();
        this.f26745s.m15018c().addListener(new Runnable() { // from class: LX5
            @Override // java.lang.Runnable
            public final void run() {
                OX5.this.m92032N();
            }
        }, mo90150a());
    }

    @Override // p000.JX5, p000.DX5
    /* renamed from: h */
    public ListenableFuture<Void> mo92028h() {
        return this.f26745s.m15018c();
    }

    @Override // p000.JX5, p000.DX5
    /* renamed from: j */
    public int mo92027j(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f26745s.m15013h(captureRequest, captureCallback, new C48355rw6.InterfaceC28069c() { // from class: KX5
            @Override // p000.C48355rw6.InterfaceC28069c
            /* renamed from: a */
            public final int mo15010a(CaptureRequest captureRequest2, CameraCaptureSession.CaptureCallback captureCallback2) {
                int m92029Q;
                m92029Q = OX5.this.m92029Q(captureRequest2, captureCallback2);
                return m92029Q;
            }
        });
    }

    @Override // p000.JX5, p000.PX5.InterfaceC6403b
    /* renamed from: k */
    public ListenableFuture<List<Surface>> mo90148k(List<DeferrableSurface> list, long j) {
        ListenableFuture<List<Surface>> mo90148k;
        synchronized (this.f26741o) {
            this.f26742p = list;
            mo90148k = super.mo90148k(list, j);
        }
        return mo90148k;
    }

    @Override // p000.JX5, p000.PX5.InterfaceC6403b
    /* renamed from: l */
    public ListenableFuture<Void> mo90147l(CameraDevice cameraDevice, C49529tv5 c49529tv5, List<DeferrableSurface> list) {
        ListenableFuture<Void> m102834j;
        synchronized (this.f26741o) {
            ListenableFuture<Void> m15014g = this.f26745s.m15014g(cameraDevice, c49529tv5, list, this.f17734b.m8287e(), new C48355rw6.InterfaceC28068b() { // from class: MX5
                @Override // p000.C48355rw6.InterfaceC28068b
                /* renamed from: a */
                public final ListenableFuture mo15011a(CameraDevice cameraDevice2, C49529tv5 c49529tv52, List list2) {
                    ListenableFuture m92030P;
                    m92030P = OX5.this.m92030P(cameraDevice2, c49529tv52, list2);
                    return m92030P;
                }
            });
            this.f26743q = m15014g;
            m102834j = IA1.m102834j(m15014g);
        }
        return m102834j;
    }

    @Override // p000.JX5, p000.DX5.AbstractC1519a
    /* renamed from: o */
    public void mo88420o(DX5 dx5) {
        synchronized (this.f26741o) {
            this.f26744r.m89366a(this.f26742p);
        }
        m92033M("onClosed()");
        super.mo88420o(dx5);
    }

    @Override // p000.JX5, p000.DX5.AbstractC1519a
    /* renamed from: q */
    public void mo15593q(DX5 dx5) {
        m92033M("Session onConfigured()");
        this.f26746t.m91179c(dx5, this.f17734b.m8286f(), this.f17734b.m8288d(), new C35088Ow1.InterfaceC6207a() { // from class: NX5
            @Override // p000.C35088Ow1.InterfaceC6207a
            /* renamed from: a */
            public final void mo91177a(DX5 dx52) {
                OX5.this.m92031O(dx52);
            }
        });
    }

    @Override // p000.JX5, p000.PX5.InterfaceC6403b
    public boolean stop() {
        boolean stop;
        synchronized (this.f26741o) {
            if (m100291B()) {
                this.f26744r.m89366a(this.f26742p);
            } else {
                ListenableFuture<Void> listenableFuture = this.f26743q;
                if (listenableFuture != null) {
                    listenableFuture.cancel(true);
                }
            }
            stop = super.stop();
        }
        return stop;
    }
}
