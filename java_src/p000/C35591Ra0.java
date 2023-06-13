package p000;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.List;
import java.util.concurrent.Executor;
/* renamed from: Ra0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C35591Ra0 extends C35825Sa0 {
    public C35591Ra0(CameraCaptureSession cameraCaptureSession) {
        super(cameraCaptureSession, null);
    }

    @Override // p000.C35825Sa0, p000.C31613Aa0.InterfaceC0153a
    /* renamed from: b */
    public int mo85224b(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        int captureBurstRequests;
        captureBurstRequests = this.f33920a.captureBurstRequests(list, executor, captureCallback);
        return captureBurstRequests;
    }

    @Override // p000.C35825Sa0, p000.C31613Aa0.InterfaceC0153a
    /* renamed from: c */
    public int mo85223c(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        int singleRepeatingRequest;
        singleRepeatingRequest = this.f33920a.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
        return singleRepeatingRequest;
    }
}
