package p000;

import android.os.Bundle;
import com.stripe.android.model.Stripe3ds2AuthParams;
/* renamed from: jQ7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C43302jQ7 {

    /* renamed from: a */
    public static final NH8 f92704a = NH8.m94082s("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* renamed from: b */
    public static final CH8 f92705b = CH8.m112387u("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* renamed from: c */
    public static final CH8 f92706c = CH8.m112388s("auto", Stripe3ds2AuthParams.FIELD_APP, "am");

    /* renamed from: d */
    public static final CH8 f92707d = CH8.m112389o("_r", "_dbg");

    /* renamed from: e */
    public static final CH8 f92708e;

    /* renamed from: f */
    public static final CH8 f92709f;

    static {
        C44399lG8 c44399lG8 = new C44399lG8();
        c44399lG8.m27444a(C32971Fu8.f10510a);
        c44399lG8.m27444a(C32971Fu8.f10511b);
        f92708e = c44399lG8.m27443b();
        f92709f = CH8.m112389o("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    /* renamed from: a */
    public static boolean m30638a(String str, String str2, Bundle bundle) {
        char c;
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!m30635d(str) || bundle == null) {
            return false;
        }
        CH8 ch8 = f92707d;
        int size = ch8.size();
        int i = 0;
        while (i < size) {
            boolean containsKey = bundle.containsKey((String) ch8.get(i));
            i++;
            if (containsKey) {
                return false;
            }
        }
        int hashCode = str.hashCode();
        if (hashCode != 101200) {
            if (hashCode != 101230) {
                if (hashCode == 3142703 && str.equals("fiam")) {
                    c = 2;
                }
                c = 65535;
            } else {
                if (str.equals("fdl")) {
                    c = 1;
                }
                c = 65535;
            }
        } else {
            if (str.equals("fcm")) {
                c = 0;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    return false;
                }
                bundle.putString("_cis", "fiam_integration");
                return true;
            }
            bundle.putString("_cis", "fdl_integration");
            return true;
        }
        bundle.putString("_cis", "fcm_integration");
        return true;
    }

    /* renamed from: b */
    public static boolean m30637b(String str, Bundle bundle) {
        if (f92705b.contains(str)) {
            return false;
        }
        if (bundle != null) {
            CH8 ch8 = f92707d;
            int size = ch8.size();
            int i = 0;
            while (i < size) {
                boolean containsKey = bundle.containsKey((String) ch8.get(i));
                i++;
                if (containsKey) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m30636c(String str) {
        return !f92704a.contains(str);
    }

    /* renamed from: d */
    public static boolean m30635d(String str) {
        return !f92706c.contains(str);
    }

    /* renamed from: e */
    public static boolean m30634e(String str, String str2) {
        if (!"_ce1".equals(str2) && !"_ce2".equals(str2)) {
            if ("_ln".equals(str2)) {
                if (str.equals("fcm") || str.equals("fiam")) {
                    return true;
                }
                return false;
            } else if (f92708e.contains(str2)) {
                return false;
            } else {
                CH8 ch8 = f92709f;
                int size = ch8.size();
                int i = 0;
                while (i < size) {
                    boolean matches = str2.matches((String) ch8.get(i));
                    i++;
                    if (matches) {
                        return false;
                    }
                }
                return true;
            }
        } else if (str.equals("fcm") || str.equals("frc")) {
            return true;
        } else {
            return false;
        }
    }
}
