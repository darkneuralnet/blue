package p000;

import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.core.JsonPointer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: lS5  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C44504lS5 {

    /* renamed from: a */
    public static Map<Character, String> f96219a;

    /* renamed from: b */
    public static final String f96220b;

    static {
        HashMap hashMap = new HashMap();
        f96219a = hashMap;
        hashMap.put(Character.valueOf(CoreConstants.SINGLE_QUOTE_CHAR), "\\'");
        f96219a.put('\"', "\\\"");
        f96219a.put(Character.valueOf(CoreConstants.ESCAPE_CHAR), "\\\\");
        f96219a.put(Character.valueOf(JsonPointer.SEPARATOR), "\\/");
        f96219a.put('\b', "\\b");
        f96219a.put('\n', "\\n");
        f96219a.put('\t', "\\t");
        f96219a.put('\f', "\\f");
        f96219a.put('\r', "\\r");
        f96220b = System.getProperty("line.separator");
    }

    private C44504lS5() {
    }

    /* renamed from: a */
    public static List<String> m27274a(String str) {
        if (m27273b(str)) {
            String[] split = str.split(",");
            ArrayList arrayList = new ArrayList();
            for (String str2 : split) {
                if (m27273b(str2)) {
                    arrayList.add(str2);
                }
            }
            return C43505jm0.m29945l(arrayList);
        }
        return C43505jm0.m29945l(new ArrayList(0));
    }

    /* renamed from: b */
    public static boolean m27273b(String str) {
        return str != null && str.trim().length() > 0;
    }

    /* renamed from: c */
    public static boolean m27272c(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return false;
        }
        for (String str : strArr) {
            if (m27271d(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m27271d(String str) {
        return !m27273b(str);
    }

    /* renamed from: e */
    public static boolean m27270e(String str) {
        if (m27271d(str)) {
            return false;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public static String m27269f(List<String> list) {
        if (list != null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                if (m27273b(list.get(i))) {
                    sb.append(list.get(i));
                    if (i < list.size() - 1) {
                        sb.append(",");
                    }
                }
            }
            return sb.toString();
        }
        return null;
    }

    /* renamed from: g */
    public static String m27268g(String... strArr) {
        List asList;
        if (strArr == null) {
            asList = null;
        } else {
            asList = Arrays.asList(strArr);
        }
        return m27269f(asList);
    }

    /* renamed from: h */
    public static String m27267h(List<? extends Number> list) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList();
            for (Number number : list) {
                if (number != null) {
                    arrayList.add(number.toString());
                }
            }
        } else {
            arrayList = null;
        }
        return m27269f(arrayList);
    }
}
