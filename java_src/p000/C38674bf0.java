package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import p000.C48129ra0;
/* renamed from: bf0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38674bf0 extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a */
    public final AbstractC46943pa0 f57839a;

    public C38674bf0(AbstractC46943pa0 abstractC46943pa0) {
        if (abstractC46943pa0 != null) {
            this.f57839a = abstractC46943pa0;
            return;
        }
        throw new NullPointerException("cameraCaptureCallback is null");
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        C51672xY5 m5018a;
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        Object tag = captureRequest.getTag();
        if (tag != null) {
            HZ3.m103736b(tag instanceof C51672xY5, "The tagBundle object from the CaptureResult is not a TagBundle object.");
            m5018a = (C51672xY5) tag;
        } else {
            m5018a = C51672xY5.m5018a();
        }
        this.f57839a.mo4448b(new V80(m5018a, totalCaptureResult));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        this.f57839a.mo16366c(new C48129ra0(C48129ra0.EnumC27950a.ERROR));
    }
}
