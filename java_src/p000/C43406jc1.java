package p000;

import android.os.Build;
import java.util.Arrays;
import java.util.List;
/* renamed from: jc1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C43406jc1 implements InterfaceC35865Se4 {

    /* renamed from: a */
    public static final List<String> f93016a = Arrays.asList("SM-N9208", "SM-G920V");

    /* renamed from: d */
    public static boolean m30205d() {
        if (f93016a.contains(Build.MODEL.toUpperCase())) {
            return true;
        }
        return false;
    }
}
