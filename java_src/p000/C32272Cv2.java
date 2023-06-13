package p000;

import co.bird.android.model.Detail;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;
/* renamed from: Cv2  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C32272Cv2 {

    /* renamed from: a */
    public static final String f4894a = "Cv2";

    /* renamed from: b */
    public static final List<String> f4895b = Arrays.asList("he", "yi", "id");

    private C32272Cv2() {
    }

    /* renamed from: a */
    public static Locale m111345a(String str, String str2) {
        try {
            Constructor declaredConstructor = Locale.class.getDeclaredConstructor(Boolean.TYPE, String.class, String.class);
            declaredConstructor.setAccessible(true);
            return (Locale) declaredConstructor.newInstance(Boolean.TRUE, str, str2);
        } catch (Exception e) {
            C33694Ix2.m101455d(f4894a, "Unable to create ISO-6390-Alpha3 per reflection", e, new Object[0]);
            return null;
        }
    }

    /* renamed from: b */
    public static Locale m111344b(String str, String str2) {
        try {
            Method declaredMethod = Locale.class.getDeclaredMethod("createConstant", String.class, String.class);
            declaredMethod.setAccessible(true);
            return (Locale) declaredMethod.invoke(null, str, str2);
        } catch (Exception e) {
            C33694Ix2.m101455d(f4894a, "Unable to create ISO-6390-Alpha3 per reflection", e, new Object[0]);
            return null;
        }
    }

    /* renamed from: c */
    public static Locale m111343c(String str) {
        boolean z;
        String str2;
        Locale locale;
        String str3 = f4894a;
        C33694Ix2.m101457b(str3, "Assuming Locale.getDefault()", new Object[0]);
        Locale locale2 = Locale.getDefault();
        if (C44504lS5.m27273b(str)) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, Detail.EMPTY_CHAR);
            int countTokens = stringTokenizer.countTokens();
            int i = 2;
            if (countTokens != 1 && countTokens != 2) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (countTokens != 1) {
                    i = 5;
                }
                if (i != str.length()) {
                    C33694Ix2.m101457b(str3, "number of tokens is correct but the length of the locale string does not match the expected length", new Object[0]);
                    return locale2;
                }
                String nextToken = stringTokenizer.nextToken();
                if (stringTokenizer.hasMoreTokens()) {
                    str2 = stringTokenizer.nextToken();
                } else {
                    str2 = "";
                }
                String upperCase = str2.toUpperCase(Locale.US);
                if (f4895b.contains(nextToken)) {
                    C33694Ix2.m101457b(str3, "New ISO-6390-Alpha3 locale detected trying to create new locale per reflection", new Object[0]);
                    locale = m111344b(nextToken, upperCase);
                    if (locale == null) {
                        locale = m111345a(nextToken, upperCase);
                    }
                    if (locale == null) {
                        locale = new Locale(nextToken, upperCase);
                    }
                } else {
                    locale = new Locale(nextToken, upperCase);
                }
                return locale;
            }
            C33694Ix2.m101447l(str3, "Unexpected number of tokens, must be at least one and at most two", new Object[0]);
            return locale2;
        }
        return locale2;
    }

    /* renamed from: d */
    public static String m111342d(Locale locale) {
        if (locale != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(locale.getLanguage());
            if (C44504lS5.m27273b(locale.getCountry())) {
                sb.append(Detail.EMPTY_CHAR);
                sb.append(locale.getCountry().toLowerCase(Locale.US));
            }
            return sb.toString();
        }
        return null;
    }
}
