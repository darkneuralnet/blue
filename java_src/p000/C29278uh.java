package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.params.OutputConfiguration;
import android.util.Size;
/* renamed from: uh */
/* loaded from: classes.dex */
public class C29278uh {
    private C29278uh() {
    }

    /* renamed from: a */
    public static <T> OutputConfiguration m9878a(Size size, Class<T> cls) {
        C28368sh.m13824a();
        return C27976rh.m15575a(size, cls);
    }

    /* renamed from: b */
    public static void m9877b(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession) {
        stateCallback.onCaptureQueueEmpty(cameraCaptureSession);
    }
}
