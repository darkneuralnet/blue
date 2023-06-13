package p000;

import android.hardware.camera2.CameraCharacteristics;
/* renamed from: zJ6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52724zJ6 {
    private C52724zJ6() {
    }

    /* renamed from: a */
    public static boolean m1539a(C36761Wa0 c36761Wa0, int i) {
        int[] iArr = (int[]) c36761Wa0.m78176a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
        }
        return false;
    }
}
