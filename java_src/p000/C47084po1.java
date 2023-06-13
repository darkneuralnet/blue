package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
/* renamed from: po1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C47084po1 implements InterfaceC38097ag6 {

    /* renamed from: a */
    public static final List<String> f104113a = Arrays.asList("PIXEL 3A", "PIXEL 3A XL");

    /* renamed from: d */
    public static boolean m18684d(C36761Wa0 c36761Wa0) {
        if (f104113a.contains(Build.MODEL.toUpperCase(Locale.US)) && ((Integer) c36761Wa0.m78176a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
            return true;
        }
        return false;
    }
}
