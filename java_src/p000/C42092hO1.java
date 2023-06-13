package p000;

import android.icu.util.ULocale;
import java.util.Locale;
/* renamed from: hO1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42092hO1 {

    /* renamed from: hO1$a */
    /* loaded from: classes.dex */
    public static class C22635a {
        private C22635a() {
        }

        /* renamed from: a */
        public static ULocale m36472a(Object obj) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        /* renamed from: b */
        public static ULocale m36471b(Locale locale) {
            return ULocale.forLocale(locale);
        }

        /* renamed from: c */
        public static String m36470c(Object obj) {
            return ((ULocale) obj).getScript();
        }
    }

    private C42092hO1() {
    }

    /* renamed from: a */
    public static String m36473a(Locale locale) {
        return C22635a.m36470c(C22635a.m36472a(C22635a.m36471b(locale)));
    }
}
