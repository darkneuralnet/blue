package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
/* renamed from: ph */
/* loaded from: classes.dex */
public class C27327ph {
    private C27327ph() {
    }

    /* renamed from: a */
    public static void m18994a(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession, Surface surface) {
        stateCallback.onSurfacePrepared(cameraCaptureSession, surface);
    }
}
