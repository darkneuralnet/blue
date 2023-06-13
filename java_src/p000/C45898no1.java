package p000;

import android.os.Build;
import android.util.Pair;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
/* renamed from: no1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C45898no1 implements InterfaceC35865Se4 {

    /* renamed from: a */
    public static final Set<Pair<String, String>> f100847a = new HashSet();

    static {
        m22358d("sprd", "lemp");
        m22358d("sprd", "DM20C");
    }

    /* renamed from: d */
    public static void m22358d(String str, String str2) {
        Set<Pair<String, String>> set = f100847a;
        Locale locale = Locale.US;
        set.add(new Pair<>(str.toLowerCase(locale), str2.toLowerCase(locale)));
    }

    /* renamed from: e */
    public static boolean m22357e() {
        Set<Pair<String, String>> set = f100847a;
        String str = Build.MANUFACTURER;
        Locale locale = Locale.US;
        return set.contains(new Pair(str.toLowerCase(locale), Build.MODEL.toLowerCase(locale)));
    }
}
