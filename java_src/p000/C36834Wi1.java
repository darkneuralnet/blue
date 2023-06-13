package p000;

import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import p000.DV5;
/* renamed from: Wi1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C36834Wi1 implements InterfaceC35865Se4 {

    /* renamed from: a */
    public static final CV5 f41548a = m77970d();

    /* renamed from: b */
    public static final CV5 f41549b = m77969e();

    /* renamed from: c */
    public static final CV5 f41550c = m77968f();

    /* renamed from: d */
    public static final Set<String> f41551d = new HashSet(Arrays.asList("SM-A515F", "SM-A515U", "SM-A515U1", "SM-A515W", "SM-S515DL", "SC-54A", "SCG07", "SM-A5160", "SM-A516B", "SM-A516N", "SM-A516U", "SM-A516U1", "SM-A516V", "SM-A715F", "SM-A715W", "SM-A7160", "SM-A716B", "SM-A716U", "SM-A716U1", "SM-A716V", "SM-A8050", "SM-A805F", "SM-A805N", "SCV44", "SM-F9000", "SM-F900F", "SM-F900U", "SM-F900U1", "SM-F900W", "SM-F907B", "SM-F907N", "SM-N970F", "SM-N9700", "SM-N970U", "SM-N970U1", "SM-N970W", "SM-N971N", "SM-N770F", "SC-01M", "SCV45", "SM-N9750", "SM-N975C", "SM-N975U", "SM-N975U1", "SM-N975W", "SM-N975F", "SM-N976B", "SM-N976N", "SM-N9760", "SM-N976Q", "SM-N976V", "SM-N976U", "SM-N9810", "SM-N981N", "SM-N981U", "SM-N981U1", "SM-N981W", "SM-N981B", "SC-53A", "SCG06", "SM-N9860", "SM-N986N", "SM-N986U", "SM-N986U1", "SM-N986W", "SM-N986B", "SC-03L", "SCV41", "SM-G973F", "SM-G973N", "SM-G9730", "SM-G9738", "SM-G973C", "SM-G973U", "SM-G973U1", "SM-G973W", "SM-G977B", "SM-G977N", "SM-G977P", "SM-G977T", "SM-G977U", "SM-G770F", "SM-G770U1", "SC-04L", "SCV42", "SM-G975F", "SM-G975N", "SM-G9750", "SM-G9758", "SM-G975U", "SM-G975U1", "SM-G975W", "SC-05L", "SM-G970F", "SM-G970N", "SM-G9700", "SM-G9708", "SM-G970U", "SM-G970U1", "SM-G970W", "SC-51A", "SC51Aa", "SCG01", "SM-G9810", "SM-G981N", "SM-G981U", "SM-G981U1", "SM-G981V", "SM-G981W", "SM-G981B", "SCG03", "SM-G9880", "SM-G988N", "SM-G988Q", "SM-G988U", "SM-G988U1", "SM-G988W", "SM-G988B", "SC-52A", "SCG02", "SM-G9860", "SM-G986N", "SM-G986U", "SM-G986U1", "SM-G986W", "SM-G986B", "SCV47", "SM-F7000", "SM-F700F", "SM-F700N", "SM-F700U", "SM-F700U1", "SM-F700W", "SCG04", "SM-F7070", "SM-F707B", "SM-F707N", "SM-F707U", "SM-F707U1", "SM-F707W", "SM-F9160", "SM-F916B", "SM-F916N", "SM-F916Q", "SM-F916U", "SM-F916U1", "SM-F916W"));

    /* renamed from: e */
    public static final Set<String> f41552e = new HashSet(Arrays.asList("PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO"));

    /* renamed from: d */
    public static CV5 m77970d() {
        CV5 cv5 = new CV5();
        DV5.EnumC1500b enumC1500b = DV5.EnumC1500b.YUV;
        cv5.m112186a(DV5.m110349a(enumC1500b, DV5.EnumC1499a.VGA));
        cv5.m112186a(DV5.m110349a(DV5.EnumC1500b.PRIV, DV5.EnumC1499a.PREVIEW));
        cv5.m112186a(DV5.m110349a(enumC1500b, DV5.EnumC1499a.MAXIMUM));
        return cv5;
    }

    /* renamed from: e */
    public static CV5 m77969e() {
        CV5 cv5 = new CV5();
        DV5.EnumC1500b enumC1500b = DV5.EnumC1500b.YUV;
        cv5.m112186a(DV5.m110349a(enumC1500b, DV5.EnumC1499a.VGA));
        cv5.m112186a(DV5.m110349a(enumC1500b, DV5.EnumC1499a.PREVIEW));
        cv5.m112186a(DV5.m110349a(enumC1500b, DV5.EnumC1499a.MAXIMUM));
        return cv5;
    }

    /* renamed from: f */
    public static CV5 m77968f() {
        CV5 cv5 = new CV5();
        DV5.EnumC1500b enumC1500b = DV5.EnumC1500b.PRIV;
        cv5.m112186a(DV5.m110349a(enumC1500b, DV5.EnumC1499a.PREVIEW));
        cv5.m112186a(DV5.m110349a(enumC1500b, DV5.EnumC1499a.VGA));
        DV5.EnumC1500b enumC1500b2 = DV5.EnumC1500b.YUV;
        DV5.EnumC1499a enumC1499a = DV5.EnumC1499a.MAXIMUM;
        cv5.m112186a(DV5.m110349a(enumC1500b2, enumC1499a));
        cv5.m112186a(DV5.m110349a(DV5.EnumC1500b.RAW, enumC1499a));
        return cv5;
    }

    /* renamed from: j */
    public static boolean m77964j() {
        String str = Build.DEVICE;
        return "heroqltevzw".equalsIgnoreCase(str) || "heroqltetmo".equalsIgnoreCase(str);
    }

    /* renamed from: k */
    public static boolean m77963k() {
        if (!m77964j() && !m77962l() && !m77961m()) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public static boolean m77962l() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        return f41551d.contains(Build.MODEL.toUpperCase(Locale.US));
    }

    /* renamed from: m */
    public static boolean m77961m() {
        if (!"google".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        return f41552e.contains(Build.MODEL.toUpperCase(Locale.US));
    }

    /* renamed from: g */
    public List<CV5> m77967g(String str, int i) {
        if (m77964j()) {
            return m77965i(str);
        }
        if (m77962l()) {
            return m77966h(i);
        }
        if (m77961m()) {
            return Collections.singletonList(f41550c);
        }
        return Collections.emptyList();
    }

    /* renamed from: h */
    public final List<CV5> m77966h(int i) {
        ArrayList arrayList = new ArrayList();
        if (i == 0) {
            arrayList.add(f41548a);
            arrayList.add(f41549b);
        }
        return arrayList;
    }

    /* renamed from: i */
    public final List<CV5> m77965i(String str) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("1")) {
            arrayList.add(f41548a);
        }
        return arrayList;
    }
}
