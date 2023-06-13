package p000;

import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;
/* renamed from: pc0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46963pc0 {
    private C46963pc0() {
    }

    /* renamed from: a */
    public static CameraUnavailableException m19068a(CameraAccessExceptionCompat cameraAccessExceptionCompat) {
        int m69658d = cameraAccessExceptionCompat.m69658d();
        int i = 1;
        if (m69658d != 1) {
            i = 2;
            if (m69658d != 2) {
                i = 3;
                if (m69658d != 3) {
                    i = 4;
                    if (m69658d != 4) {
                        i = 5;
                        if (m69658d != 5) {
                            if (m69658d != 10001) {
                                i = 0;
                            } else {
                                i = 6;
                            }
                        }
                    }
                }
            }
        }
        return new CameraUnavailableException(i, cameraAccessExceptionCompat);
    }
}
