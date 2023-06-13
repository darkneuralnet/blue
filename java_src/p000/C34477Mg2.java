package p000;

import java.net.URI;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: Mg2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C34477Mg2 {
    private C34477Mg2() {
    }

    /* renamed from: a */
    public static C3824Iy m95067a(Map<String, Object> map, String str) throws ParseException {
        String m95060h = m95060h(map, str);
        if (m95060h == null) {
            return null;
        }
        return new C3824Iy(m95060h);
    }

    /* renamed from: b */
    public static boolean m95066b(Map<String, Object> map, String str) throws ParseException {
        Boolean bool = (Boolean) m95065c(map, str, Boolean.class);
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new ParseException("JSON object member with key " + str + " is missing or null", 0);
    }

    /* renamed from: c */
    public static <T> T m95065c(Map<String, Object> map, String str, Class<T> cls) throws ParseException {
        if (map.get(str) == null) {
            return null;
        }
        T t = (T) map.get(str);
        if (cls.isAssignableFrom(t.getClass())) {
            return t;
        }
        throw new ParseException("Unexpected type of JSON object member with key " + str + "", 0);
    }

    /* renamed from: d */
    public static int m95064d(Map<String, Object> map, String str) throws ParseException {
        Number number = (Number) m95065c(map, str, Number.class);
        if (number != null) {
            return number.intValue();
        }
        throw new ParseException("JSON object member with key " + str + " is missing or null", 0);
    }

    /* renamed from: e */
    public static List<Object> m95063e(Map<String, Object> map, String str) throws ParseException {
        return (List) m95065c(map, str, List.class);
    }

    /* renamed from: f */
    public static Map<String, Object> m95062f(Map<String, Object> map, String str) throws ParseException {
        Map<String, Object> map2 = (Map) m95065c(map, str, Map.class);
        if (map2 == null) {
            return null;
        }
        for (String str2 : map2.keySet()) {
            if (!(str2 instanceof String)) {
                throw new ParseException("JSON object member with key " + str + " not a JSON object", 0);
            }
        }
        return map2;
    }

    /* renamed from: g */
    public static long m95061g(Map<String, Object> map, String str) throws ParseException {
        Number number = (Number) m95065c(map, str, Number.class);
        if (number != null) {
            return number.longValue();
        }
        throw new ParseException("JSON object member with key " + str + " is missing or null", 0);
    }

    /* renamed from: h */
    public static String m95060h(Map<String, Object> map, String str) throws ParseException {
        return (String) m95065c(map, str, String.class);
    }

    /* renamed from: i */
    public static String[] m95059i(Map<String, Object> map, String str) throws ParseException {
        List<Object> m95063e = m95063e(map, str);
        if (m95063e == null) {
            return null;
        }
        try {
            return (String[]) m95063e.toArray(new String[0]);
        } catch (ArrayStoreException unused) {
            throw new ParseException("JSON object member with key \"" + str + "\" is not an array of strings", 0);
        }
    }

    /* renamed from: j */
    public static List<String> m95058j(Map<String, Object> map, String str) throws ParseException {
        String[] m95059i = m95059i(map, str);
        if (m95059i == null) {
            return null;
        }
        return Arrays.asList(m95059i);
    }

    /* renamed from: k */
    public static URI m95057k(Map<String, Object> map, String str) throws ParseException {
        String m95060h = m95060h(map, str);
        if (m95060h == null) {
            return null;
        }
        try {
            return new URI(m95060h);
        } catch (URISyntaxException e) {
            throw new ParseException(e.getMessage(), 0);
        }
    }

    /* renamed from: l */
    public static Map<String, Object> m95056l() {
        return new HashMap();
    }

    /* renamed from: m */
    public static Map<String, Object> m95055m(String str) throws ParseException {
        return m95054n(str, -1);
    }

    /* renamed from: n */
    public static Map<String, Object> m95054n(String str, int i) throws ParseException {
        if (i >= 0 && str.length() > i) {
            throw new ParseException("The parsed string is longer than the max accepted size of " + i + " characters", 0);
        }
        try {
            Object m93584b = new C34711Ng2(640).m93584b(str);
            if (m93584b instanceof C34243Lg2) {
                return (C34243Lg2) m93584b;
            }
            throw new ParseException("JSON entity is not an object", 0);
        } catch (com.nimbusds.jose.shaded.json.parser.ParseException e) {
            throw new ParseException("Invalid JSON: " + e.getMessage(), 0);
        } catch (Exception e2) {
            throw new ParseException("Unexpected exception: " + e2.getMessage(), 0);
        } catch (StackOverflowError unused) {
            throw new ParseException("Excessive JSON object and / or array nesting", 0);
        }
    }

    /* renamed from: o */
    public static String m95053o(Map<String, ?> map) {
        return C34243Lg2.m96488d(map);
    }
}
