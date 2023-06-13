package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
/* renamed from: Zb0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C37472Zb0 implements InterfaceC38097ag6 {

    /* renamed from: a */
    public static final List<String> f48796a = Arrays.asList("SM-N9200", "SM-N9208", "SAMSUNG-SM-N920A", "SM-N920C", "SM-N920F", "SM-N920G", "SM-N920I", "SM-N920K", "SM-N920L", "SM-N920P", "SM-N920R4", "SM-N920R6", "SM-N920R7", "SM-N920S", "SM-N920T", "SM-N920V", "SM-N920W8", "SM-N920X", "SM-J510FN");

    /* renamed from: d */
    public static boolean m72907d(C36761Wa0 c36761Wa0) {
        if (f48796a.contains(Build.MODEL.toUpperCase(Locale.US)) && ((Integer) c36761Wa0.m78176a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
            return true;
        }
        return false;
    }
}
