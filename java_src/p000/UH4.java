package p000;

import android.os.Build;
import java.util.Arrays;
import java.util.Locale;
/* renamed from: UH4 */
/* loaded from: classes.dex */
public class UH4 implements InterfaceC50063up6 {
    /* renamed from: d */
    public static boolean m81687d() {
        if ("Huawei".equalsIgnoreCase(Build.BRAND) && "HMA-L29".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m81686e() {
        if ("Huawei".equalsIgnoreCase(Build.BRAND) && "LYA-AL00".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m81685f() {
        if ("Huawei".equalsIgnoreCase(Build.MANUFACTURER) && Arrays.asList("JNY-L21A", "JNY-L01A", "JNY-L21B", "JNY-L22A", "JNY-L02A", "JNY-L22B", "JNY-LX1").contains(Build.MODEL.toUpperCase(Locale.US))) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m81684g() {
        if ("Vivo".equalsIgnoreCase(Build.BRAND) && "vivo 1820".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m81683h() {
        return m81687d() || m81686e() || m81684g() || m81685f();
    }

    @Override // p000.InterfaceC50063up6
    /* renamed from: a */
    public boolean mo9692a() {
        return m81687d() || m81686e() || m81685f();
    }

    @Override // p000.InterfaceC50063up6
    /* renamed from: b */
    public boolean mo6489b(InterfaceC33962Kb0 interfaceC33962Kb0, C52885zb4 c52885zb4) {
        if (!m81687d() && !m81686e()) {
            if (m81684g()) {
                if (c52885zb4 == C52885zb4.f121575b || c52885zb4 == C52885zb4.f121576c) {
                    return true;
                }
                return false;
            } else if (!m81685f()) {
                return false;
            } else {
                if (interfaceC33962Kb0.mo100139b() == 0 && (c52885zb4 == C52885zb4.f121576c || c52885zb4 == C52885zb4.f121575b)) {
                    return true;
                }
                return false;
            }
        } else if (c52885zb4 == C52885zb4.f121577d) {
            return true;
        } else {
            return false;
        }
    }
}
