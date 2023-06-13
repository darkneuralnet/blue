package p000;

import android.text.TextUtils;
import java.util.Locale;
/* renamed from: P26 */
/* loaded from: classes.dex */
public final class P26 {

    /* renamed from: a */
    public static final Locale f27795a = new Locale("", "");

    /* renamed from: P26$a */
    /* loaded from: classes.dex */
    public static class C6232a {
        private C6232a() {
        }

        /* renamed from: a */
        public static int m91039a(Locale locale) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
    }

    private P26() {
    }

    /* renamed from: a */
    public static int m91040a(Locale locale) {
        return C6232a.m91039a(locale);
    }
}
