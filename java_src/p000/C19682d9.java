package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
/* renamed from: d9 */
/* loaded from: classes.dex */
public class C19682d9 implements InterfaceC35865Se4 {
    /* renamed from: d */
    public static boolean m44575d(C36761Wa0 c36761Wa0) {
        if (Build.BRAND.equalsIgnoreCase("SAMSUNG") && Build.VERSION.SDK_INT < 33 && ((Integer) c36761Wa0.m78176a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            return true;
        }
        return false;
    }
}
