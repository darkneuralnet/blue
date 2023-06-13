package p000;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.Executor;
import p000.C31613Aa0;
/* renamed from: Sa0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C35825Sa0 implements C31613Aa0.InterfaceC0153a {

    /* renamed from: a */
    public final CameraCaptureSession f33920a;

    /* renamed from: b */
    public final Object f33921b;

    /* renamed from: Sa0$a */
    /* loaded from: classes.dex */
    public static class C7482a {

        /* renamed from: a */
        public final Handler f33922a;

        public C7482a(Handler handler) {
            this.f33922a = handler;
        }
    }

    public C35825Sa0(CameraCaptureSession cameraCaptureSession, Object obj) {
        this.f33920a = (CameraCaptureSession) HZ3.m103731g(cameraCaptureSession);
        this.f33921b = obj;
    }

    /* renamed from: d */
    public static C31613Aa0.InterfaceC0153a m85222d(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new C35825Sa0(cameraCaptureSession, new C7482a(handler));
    }

    @Override // p000.C31613Aa0.InterfaceC0153a
    /* renamed from: a */
    public CameraCaptureSession mo85225a() {
        return this.f33920a;
    }

    @Override // p000.C31613Aa0.InterfaceC0153a
    /* renamed from: b */
    public int mo85224b(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f33920a.captureBurst(list, new C31613Aa0.C0154b(executor, captureCallback), ((C7482a) this.f33921b).f33922a);
    }

    @Override // p000.C31613Aa0.InterfaceC0153a
    /* renamed from: c */
    public int mo85223c(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f33920a.setRepeatingRequest(captureRequest, new C31613Aa0.C0154b(executor, captureCallback), ((C7482a) this.f33921b).f33922a);
    }
}
