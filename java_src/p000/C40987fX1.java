package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
/* renamed from: fX1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C40987fX1 implements InterfaceC35865Se4 {

    /* renamed from: a */
    public static final List<String> f80260a = Arrays.asList("sm-j700f", "sm-j710f");

    /* renamed from: d */
    public static boolean m41255d(C36761Wa0 c36761Wa0) {
        if (f80260a.contains(Build.MODEL.toLowerCase(Locale.US)) && ((Integer) c36761Wa0.m78176a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            return true;
        }
        return false;
    }
}
