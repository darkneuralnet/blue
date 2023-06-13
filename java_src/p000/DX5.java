package p000;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
/* renamed from: DX5 */
/* loaded from: classes.dex */
public interface DX5 {

    /* renamed from: DX5$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1519a {
        /* renamed from: m */
        public void mo88422m(DX5 dx5) {
        }

        /* renamed from: n */
        public void mo88421n(DX5 dx5) {
        }

        /* renamed from: o */
        public void mo88420o(DX5 dx5) {
        }

        /* renamed from: p */
        public void mo15594p(DX5 dx5) {
        }

        /* renamed from: q */
        public void mo15593q(DX5 dx5) {
        }

        /* renamed from: r */
        public void mo15592r(DX5 dx5) {
        }

        /* renamed from: s */
        public void mo15591s(DX5 dx5) {
        }

        /* renamed from: t */
        public void mo88419t(DX5 dx5, Surface surface) {
        }
    }

    /* renamed from: c */
    AbstractC1519a mo100284c();

    void close();

    /* renamed from: d */
    void mo100283d() throws CameraAccessException;

    /* renamed from: e */
    int mo100282e(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    /* renamed from: f */
    C31613Aa0 mo100281f();

    /* renamed from: g */
    void mo100280g() throws CameraAccessException;

    CameraDevice getDevice();

    /* renamed from: h */
    ListenableFuture<Void> mo92028h();

    /* renamed from: i */
    void mo100279i();

    /* renamed from: j */
    int mo92027j(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;
}
