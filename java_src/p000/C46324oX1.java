package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
/* renamed from: oX1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C46324oX1 implements InterfaceC38097ag6 {

    /* renamed from: a */
    public static final List<String> f102114a = Arrays.asList("sm-a260f", "sm-j530f", "sm-j600g", "sm-j701f", "sm-g610f", "sm-j710mn");

    /* renamed from: d */
    public static boolean m20938d(C36761Wa0 c36761Wa0) {
        if (f102114a.contains(Build.MODEL.toLowerCase(Locale.US)) && ((Integer) c36761Wa0.m78176a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
            return true;
        }
        return false;
    }
}
