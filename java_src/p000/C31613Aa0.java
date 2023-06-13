package p000;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;
import p000.C31613Aa0;
/* renamed from: Aa0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31613Aa0 {

    /* renamed from: a */
    public final InterfaceC0153a f810a;

    /* renamed from: Aa0$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0153a {
        /* renamed from: a */
        CameraCaptureSession mo85225a();

        /* renamed from: b */
        int mo85224b(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

        /* renamed from: c */
        int mo85223c(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;
    }

    /* renamed from: Aa0$b */
    /* loaded from: classes.dex */
    public static final class C0154b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a */
        public final CameraCaptureSession.CaptureCallback f811a;

        /* renamed from: b */
        public final Executor f812b;

        public C0154b(Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
            this.f812b = executor;
            this.f811a = captureCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m115529h(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
            C27650qh.m17250a(this.f811a, cameraCaptureSession, captureRequest, surface, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ void m115528i(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.f811a.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public /* synthetic */ void m115527j(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            this.f811a.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public /* synthetic */ void m115526k(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            this.f811a.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public /* synthetic */ void m115525l(CameraCaptureSession cameraCaptureSession, int i) {
            this.f811a.onCaptureSequenceAborted(cameraCaptureSession, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public /* synthetic */ void m115524m(CameraCaptureSession cameraCaptureSession, int i, long j) {
            this.f811a.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public /* synthetic */ void m115523n(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            this.f811a.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final Surface surface, final long j) {
            this.f812b.execute(new Runnable() { // from class: Ca0
                @Override // java.lang.Runnable
                public final void run() {
                    C31613Aa0.C0154b.this.m115529h(cameraCaptureSession, captureRequest, surface, j);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.f812b.execute(new Runnable() { // from class: Fa0
                @Override // java.lang.Runnable
                public final void run() {
                    C31613Aa0.C0154b.this.m115528i(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureFailure captureFailure) {
            this.f812b.execute(new Runnable() { // from class: Ha0
                @Override // java.lang.Runnable
                public final void run() {
                    C31613Aa0.C0154b.this.m115527j(cameraCaptureSession, captureRequest, captureFailure);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureResult captureResult) {
            this.f812b.execute(new Runnable() { // from class: Ea0
                @Override // java.lang.Runnable
                public final void run() {
                    C31613Aa0.C0154b.this.m115526k(cameraCaptureSession, captureRequest, captureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(final CameraCaptureSession cameraCaptureSession, final int i) {
            this.f812b.execute(new Runnable() { // from class: Ba0
                @Override // java.lang.Runnable
                public final void run() {
                    C31613Aa0.C0154b.this.m115525l(cameraCaptureSession, i);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(final CameraCaptureSession cameraCaptureSession, final int i, final long j) {
            this.f812b.execute(new Runnable() { // from class: Da0
                @Override // java.lang.Runnable
                public final void run() {
                    C31613Aa0.C0154b.this.m115524m(cameraCaptureSession, i, j);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final long j, final long j2) {
            this.f812b.execute(new Runnable() { // from class: Ga0
                @Override // java.lang.Runnable
                public final void run() {
                    C31613Aa0.C0154b.this.m115523n(cameraCaptureSession, captureRequest, j, j2);
                }
            });
        }
    }

    /* renamed from: Aa0$c */
    /* loaded from: classes.dex */
    public static final class C0155c extends CameraCaptureSession.StateCallback {

        /* renamed from: a */
        public final CameraCaptureSession.StateCallback f813a;

        /* renamed from: b */
        public final Executor f814b;

        public C0155c(Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f814b = executor;
            this.f813a = stateCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m115515h(CameraCaptureSession cameraCaptureSession) {
            this.f813a.onActive(cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ void m115514i(CameraCaptureSession cameraCaptureSession) {
            C29278uh.m9877b(this.f813a, cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public /* synthetic */ void m115513j(CameraCaptureSession cameraCaptureSession) {
            this.f813a.onClosed(cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public /* synthetic */ void m115512k(CameraCaptureSession cameraCaptureSession) {
            this.f813a.onConfigureFailed(cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public /* synthetic */ void m115511l(CameraCaptureSession cameraCaptureSession) {
            this.f813a.onConfigured(cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public /* synthetic */ void m115510m(CameraCaptureSession cameraCaptureSession) {
            this.f813a.onReady(cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public /* synthetic */ void m115509n(CameraCaptureSession cameraCaptureSession, Surface surface) {
            C27327ph.m18994a(this.f813a, cameraCaptureSession, surface);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(final CameraCaptureSession cameraCaptureSession) {
            this.f814b.execute(new Runnable() { // from class: La0
                @Override // java.lang.Runnable
                public final void run() {
                    C31613Aa0.C0155c.this.m115515h(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(final CameraCaptureSession cameraCaptureSession) {
            this.f814b.execute(new Runnable() { // from class: Ka0
                @Override // java.lang.Runnable
                public final void run() {
                    C31613Aa0.C0155c.this.m115514i(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(final CameraCaptureSession cameraCaptureSession) {
            this.f814b.execute(new Runnable() { // from class: Ja0
                @Override // java.lang.Runnable
                public final void run() {
                    C31613Aa0.C0155c.this.m115513j(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(final CameraCaptureSession cameraCaptureSession) {
            this.f814b.execute(new Runnable() { // from class: Ma0
                @Override // java.lang.Runnable
                public final void run() {
                    C31613Aa0.C0155c.this.m115512k(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(final CameraCaptureSession cameraCaptureSession) {
            this.f814b.execute(new Runnable() { // from class: Ia0
                @Override // java.lang.Runnable
                public final void run() {
                    C31613Aa0.C0155c.this.m115511l(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(final CameraCaptureSession cameraCaptureSession) {
            this.f814b.execute(new Runnable() { // from class: Na0
                @Override // java.lang.Runnable
                public final void run() {
                    C31613Aa0.C0155c.this.m115510m(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(final CameraCaptureSession cameraCaptureSession, final Surface surface) {
            this.f814b.execute(new Runnable() { // from class: Oa0
                @Override // java.lang.Runnable
                public final void run() {
                    C31613Aa0.C0155c.this.m115509n(cameraCaptureSession, surface);
                }
            });
        }
    }

    public C31613Aa0(CameraCaptureSession cameraCaptureSession, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f810a = new C35591Ra0(cameraCaptureSession);
        } else {
            this.f810a = C35825Sa0.m85222d(cameraCaptureSession, handler);
        }
    }

    /* renamed from: d */
    public static C31613Aa0 m115537d(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new C31613Aa0(cameraCaptureSession, handler);
    }

    /* renamed from: a */
    public int m115540a(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f810a.mo85224b(list, executor, captureCallback);
    }

    /* renamed from: b */
    public int m115539b(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f810a.mo85223c(captureRequest, executor, captureCallback);
    }

    /* renamed from: c */
    public CameraCaptureSession m115538c() {
        return this.f810a.mo85225a();
    }
}
