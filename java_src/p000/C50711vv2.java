package p000;

import android.os.LocaleList;
import java.util.Locale;
/* renamed from: vv2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50711vv2 {

    /* renamed from: b */
    public static final C50711vv2 f114904b = m7773a(new Locale[0]);

    /* renamed from: a */
    public final InterfaceC51897xv2 f114905a;

    /* renamed from: vv2$a */
    /* loaded from: classes.dex */
    public static class C29700a {

        /* renamed from: a */
        public static final Locale[] f114906a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        private C29700a() {
        }

        /* renamed from: a */
        public static Locale m7763a(String str) {
            return Locale.forLanguageTag(str);
        }

        /* renamed from: b */
        public static boolean m7762b(Locale locale) {
            for (Locale locale2 : f114906a) {
                if (locale2.equals(locale)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: c */
        public static boolean m7761c(Locale locale, Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage()) || m7762b(locale) || m7762b(locale2)) {
                return false;
            }
            String m36473a = C42092hO1.m36473a(locale);
            if (m36473a.isEmpty()) {
                String country = locale.getCountry();
                if (country.isEmpty() || country.equals(locale2.getCountry())) {
                    return true;
                }
                return false;
            }
            return m36473a.equals(C42092hO1.m36473a(locale2));
        }
    }

    /* renamed from: vv2$b */
    /* loaded from: classes.dex */
    public static class C29701b {
        private C29701b() {
        }

        /* renamed from: a */
        public static LocaleList m7760a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        /* renamed from: b */
        public static LocaleList m7759b() {
            return LocaleList.getAdjustedDefault();
        }

        /* renamed from: c */
        public static LocaleList m7758c() {
            return LocaleList.getDefault();
        }
    }

    public C50711vv2(InterfaceC51897xv2 interfaceC51897xv2) {
        this.f114905a = interfaceC51897xv2;
    }

    /* renamed from: a */
    public static C50711vv2 m7773a(Locale... localeArr) {
        return m7764j(C29701b.m7760a(localeArr));
    }

    /* renamed from: b */
    public static C50711vv2 m7772b(String str) {
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(",", -1);
            int length = split.length;
            Locale[] localeArr = new Locale[length];
            for (int i = 0; i < length; i++) {
                localeArr[i] = C29700a.m7763a(split[i]);
            }
            return m7773a(localeArr);
        }
        return m7768f();
    }

    /* renamed from: d */
    public static C50711vv2 m7770d() {
        return m7764j(C29701b.m7759b());
    }

    /* renamed from: e */
    public static C50711vv2 m7769e() {
        return m7764j(C29701b.m7758c());
    }

    /* renamed from: f */
    public static C50711vv2 m7768f() {
        return f114904b;
    }

    /* renamed from: j */
    public static C50711vv2 m7764j(LocaleList localeList) {
        return new C50711vv2(new C52490yv2(localeList));
    }

    /* renamed from: c */
    public Locale m7771c(int i) {
        return this.f114905a.get(i);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C50711vv2) && this.f114905a.equals(((C50711vv2) obj).f114905a);
    }

    /* renamed from: g */
    public boolean m7767g() {
        return this.f114905a.isEmpty();
    }

    /* renamed from: h */
    public int m7766h() {
        return this.f114905a.size();
    }

    public int hashCode() {
        return this.f114905a.hashCode();
    }

    /* renamed from: i */
    public String m7765i() {
        return this.f114905a.mo2261a();
    }

    public String toString() {
        return this.f114905a.toString();
    }
}
