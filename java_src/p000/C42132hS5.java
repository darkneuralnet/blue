package p000;

import com.adyen.checkout.core.exception.NoConstructorException;
/* renamed from: hS5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42132hS5 {
    private C42132hS5() {
        throw new NoConstructorException();
    }

    /* renamed from: a */
    public static boolean m36366a(String str, char... cArr) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!Character.isDigit(charAt)) {
                return false;
            }
            for (char c : cArr) {
                if (c != charAt) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: b */
    public static String m36365b(String str, char... cArr) {
        return str.replaceAll("[\\s" + new String(cArr) + "]", "");
    }
}
