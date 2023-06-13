package p000;

import android.hardware.camera2.CameraCharacteristics;
/* renamed from: Z14 */
/* loaded from: classes.dex */
public class Z14 implements InterfaceC35865Se4 {
    /* renamed from: d */
    public static boolean m73831d(C36761Wa0 c36761Wa0) {
        Integer num = (Integer) c36761Wa0.m78176a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num != null && num.intValue() == 2) {
            return true;
        }
        return false;
    }
}
