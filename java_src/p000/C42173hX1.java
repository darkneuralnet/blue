package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
/* renamed from: hX1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C42173hX1 implements InterfaceC38097ag6 {

    /* renamed from: a */
    public static final List<String> f85357a = Arrays.asList("itel w6004");

    /* renamed from: b */
    public static final List<String> f85358b = Arrays.asList("sm-j700f", "sm-j710f");

    /* renamed from: d */
    public static boolean m36228d(C36761Wa0 c36761Wa0) {
        boolean z;
        List<String> list = f85358b;
        String str = Build.MODEL;
        Locale locale = Locale.US;
        if (list.contains(str.toLowerCase(locale)) && ((Integer) c36761Wa0.m78176a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            z = true;
        } else {
            z = false;
        }
        boolean contains = f85357a.contains(str.toLowerCase(locale));
        if (z || contains) {
            return true;
        }
        return false;
    }
}
