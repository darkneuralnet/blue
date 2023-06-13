package p000;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.List;
import p000.C31613Aa0;
import p000.C50509vb0;
/* renamed from: rb0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C48139rb0 extends C47546qb0 {
    public C48139rb0(CameraDevice cameraDevice, Object obj) {
        super(cameraDevice, obj);
    }

    /* renamed from: e */
    public static C48139rb0 m15726e(CameraDevice cameraDevice, Handler handler) {
        return new C48139rb0(cameraDevice, new C50509vb0.C29595a(handler));
    }

    @Override // p000.C44581lb0.InterfaceC25731a
    /* renamed from: a */
    public void mo10004a(C49529tv5 c49529tv5) throws CameraAccessExceptionCompat {
        C50509vb0.m8420c(this.f114353a, c49529tv5);
        C31613Aa0.C0155c c0155c = new C31613Aa0.C0155c(c49529tv5.m11219a(), c49529tv5.m11215e());
        List<C36053Sz3> m11217c = c49529tv5.m11217c();
        Handler handler = ((C50509vb0.C29595a) HZ3.m103731g((C50509vb0.C29595a) this.f114354b)).f114355a;
        R22 m11218b = c49529tv5.m11218b();
        try {
            if (m11218b != null) {
                InputConfiguration inputConfiguration = (InputConfiguration) m11218b.m87401a();
                HZ3.m103731g(inputConfiguration);
                this.f114353a.createReprocessableCaptureSessionByConfigurations(inputConfiguration, C49529tv5.m11212h(m11217c), c0155c, handler);
            } else if (c49529tv5.m11216d() == 1) {
                this.f114353a.createConstrainedHighSpeedCaptureSession(C50509vb0.m8419d(m11217c), c0155c, handler);
            } else {
                this.f114353a.createCaptureSessionByOutputConfigurations(C49529tv5.m11212h(m11217c), c0155c, handler);
            }
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.m69657e(e);
        }
    }
}
