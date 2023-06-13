package p000;

import android.hardware.camera2.CameraCaptureSession;
/* renamed from: cf0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39267cf0 extends AbstractC46943pa0 {

    /* renamed from: a */
    public final CameraCaptureSession.CaptureCallback f61018a;

    public C39267cf0(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback != null) {
            this.f61018a = captureCallback;
            return;
        }
        throw new NullPointerException("captureCallback is null");
    }

    /* renamed from: d */
    public static C39267cf0 m61091d(CameraCaptureSession.CaptureCallback captureCallback) {
        return new C39267cf0(captureCallback);
    }

    /* renamed from: e */
    public CameraCaptureSession.CaptureCallback m61090e() {
        return this.f61018a;
    }
}
