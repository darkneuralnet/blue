package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
/* renamed from: nX1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C45731nX1 implements InterfaceC38097ag6 {

    /* renamed from: a */
    public static final List<String> f100095a = Arrays.asList("SM-G9300", "SM-G930R", "SM-G930A", "SM-G930V", "SM-G930T", "SM-G930U", "SM-G930P", "SM-SC02H", "SM-SCV33", "SM-G9350", "SM-G935R", "SM-G935A", "SM-G935V", "SM-G935T", "SM-G935U", "SM-G935P");

    /* renamed from: d */
    public static boolean m23560d(C36761Wa0 c36761Wa0) {
        if (f100095a.contains(Build.MODEL.toUpperCase(Locale.US)) && ((Integer) c36761Wa0.m78176a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
            return true;
        }
        return false;
    }
}
