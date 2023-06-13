package p000;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
/* renamed from: ub0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C49917ub0 extends C48139rb0 {
    public C49917ub0(CameraDevice cameraDevice) {
        super((CameraDevice) HZ3.m103731g(cameraDevice), null);
    }

    @Override // p000.C48139rb0, p000.C44581lb0.InterfaceC25731a
    /* renamed from: a */
    public void mo10004a(C49529tv5 c49529tv5) throws CameraAccessExceptionCompat {
        SessionConfiguration m13971a = C48731sb0.m13971a(c49529tv5.m11210j());
        HZ3.m103731g(m13971a);
        try {
            this.f114353a.createCaptureSession(m13971a);
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.m69657e(e);
        }
    }
}
