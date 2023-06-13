package p000;

import android.hardware.camera2.CameraCharacteristics;
/* renamed from: Gx0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C33224Gx0 implements InterfaceC35865Se4 {
    /* renamed from: d */
    public static boolean m104570d(C36761Wa0 c36761Wa0) {
        Integer num = (Integer) c36761Wa0.m78176a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num != null && num.intValue() == 2) {
            return true;
        }
        return false;
    }
}
