package p000;

import android.hardware.camera2.CameraCharacteristics;
/* renamed from: Io */
/* loaded from: classes.dex */
public class C3756Io implements InterfaceC35865Se4 {
    /* renamed from: e */
    public static boolean m101707e(C36761Wa0 c36761Wa0) {
        Integer num = (Integer) c36761Wa0.m78176a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num != null) {
            num.intValue();
            return false;
        }
        return false;
    }

    /* renamed from: d */
    public int m101708d() {
        return 2;
    }
}
