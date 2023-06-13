package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
/* renamed from: Ta0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36059Ta0 {

    /* renamed from: Ta0$a */
    /* loaded from: classes.dex */
    public static final class C7882a extends CameraCaptureSession.StateCallback {

        /* renamed from: a */
        public final List<CameraCaptureSession.StateCallback> f35696a = new ArrayList();

        public C7882a(List<CameraCaptureSession.StateCallback> list) {
            for (CameraCaptureSession.StateCallback stateCallback : list) {
                if (!(stateCallback instanceof C7883b)) {
                    this.f35696a.add(stateCallback);
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(CameraCaptureSession cameraCaptureSession) {
            for (CameraCaptureSession.StateCallback stateCallback : this.f35696a) {
                stateCallback.onActive(cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            for (CameraCaptureSession.StateCallback stateCallback : this.f35696a) {
                C29278uh.m9877b(stateCallback, cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            for (CameraCaptureSession.StateCallback stateCallback : this.f35696a) {
                stateCallback.onClosed(cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            for (CameraCaptureSession.StateCallback stateCallback : this.f35696a) {
                stateCallback.onConfigureFailed(cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            for (CameraCaptureSession.StateCallback stateCallback : this.f35696a) {
                stateCallback.onConfigured(cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(CameraCaptureSession cameraCaptureSession) {
            for (CameraCaptureSession.StateCallback stateCallback : this.f35696a) {
                stateCallback.onReady(cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            for (CameraCaptureSession.StateCallback stateCallback : this.f35696a) {
                C27327ph.m18994a(stateCallback, cameraCaptureSession, surface);
            }
        }
    }

    /* renamed from: Ta0$b */
    /* loaded from: classes.dex */
    public static final class C7883b extends CameraCaptureSession.StateCallback {
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        }
    }

    private C36059Ta0() {
    }

    /* renamed from: a */
    public static CameraCaptureSession.StateCallback m83386a(List<CameraCaptureSession.StateCallback> list) {
        if (list.isEmpty()) {
            return m83385b();
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        return new C7882a(list);
    }

    /* renamed from: b */
    public static CameraCaptureSession.StateCallback m83385b() {
        return new C7883b();
    }
}
