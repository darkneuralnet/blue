package p000;

import com.amazonaws.services.p026s3.Headers;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.TreeSet;
import p000.Y70;
/* renamed from: EN1 */
/* loaded from: classes.dex */
public class EN1 {
    /* renamed from: a */
    public static List<AH1> m109105a(List<AH1> list, Y70.C9639a c9639a) {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            for (AH1 ah1 : list) {
                treeSet.add(ah1.m115938a());
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List<AH1> list2 = c9639a.f44581h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (AH1 ah12 : c9639a.f44581h) {
                    if (!treeSet.contains(ah12.m115938a())) {
                        arrayList.add(ah12);
                    }
                }
            }
        } else if (!c9639a.f44580g.isEmpty()) {
            for (Map.Entry<String, String> entry : c9639a.f44580g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new AH1(entry.getKey(), entry.getValue()));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static String m109104b(long j) {
        return m109102d("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j));
    }

    /* renamed from: c */
    public static Map<String, String> m109103c(Y70.C9639a c9639a) {
        if (c9639a == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        String str = c9639a.f44575b;
        if (str != null) {
            hashMap.put(Headers.GET_OBJECT_IF_NONE_MATCH, str);
        }
        long j = c9639a.f44577d;
        if (j > 0) {
            hashMap.put(Headers.GET_OBJECT_IF_MODIFIED_SINCE, m109104b(j));
        }
        return hashMap;
    }

    /* renamed from: d */
    public static SimpleDateFormat m109102d(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    /* renamed from: e */
    public static Y70.C9639a m109101e(O73 o73) {
        long j;
        boolean z;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = o73.f25920c;
        if (map == null) {
            return null;
        }
        String str = map.get("Date");
        if (str != null) {
            j = m109099g(str);
        } else {
            j = 0;
        }
        String str2 = map.get(Headers.CACHE_CONTROL);
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            z = false;
            j2 = 0;
            j3 = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j2 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j3 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    z = true;
                }
                i++;
            }
            i = 1;
        } else {
            z = false;
            j2 = 0;
            j3 = 0;
        }
        String str3 = map.get(Headers.EXPIRES);
        if (str3 != null) {
            j4 = m109099g(str3);
        } else {
            j4 = 0;
        }
        String str4 = map.get(Headers.LAST_MODIFIED);
        if (str4 != null) {
            j5 = m109099g(str4);
        } else {
            j5 = 0;
        }
        String str5 = map.get(Headers.ETAG);
        if (i != 0) {
            j7 = currentTimeMillis + (j2 * 1000);
            if (z) {
                j8 = j7;
            } else {
                j8 = (j3 * 1000) + j7;
            }
            j6 = j8;
        } else {
            j6 = 0;
            if (j > 0 && j4 >= j) {
                j7 = currentTimeMillis + (j4 - j);
                j6 = j7;
            } else {
                j7 = 0;
            }
        }
        Y70.C9639a c9639a = new Y70.C9639a();
        c9639a.f44574a = o73.f25919b;
        c9639a.f44575b = str5;
        c9639a.f44579f = j7;
        c9639a.f44578e = j6;
        c9639a.f44576c = j;
        c9639a.f44577d = j5;
        c9639a.f44580g = map;
        c9639a.f44581h = o73.f25921d;
        return c9639a;
    }

    /* renamed from: f */
    public static String m109100f(Map<String, String> map, String str) {
        if (map == null) {
            return str;
        }
        String str2 = map.get("Content-Type");
        if (str2 != null) {
            String[] split = str2.split(";", 0);
            for (int i = 1; i < split.length; i++) {
                String[] split2 = split[i].trim().split("=", 0);
                if (split2.length == 2 && split2[0].equals("charset")) {
                    return split2[1];
                }
            }
        }
        return str;
    }

    /* renamed from: g */
    public static long m109099g(String str) {
        try {
            return m109102d("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e) {
            if (!"0".equals(str) && !"-1".equals(str)) {
                C34841Nu6.m93203d(e, "Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            C34841Nu6.m93202e("Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    /* renamed from: h */
    public static List<AH1> m109098h(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new AH1(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    /* renamed from: i */
    public static Map<String, String> m109097i(List<AH1> list) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (AH1 ah1 : list) {
            treeMap.put(ah1.m115938a(), ah1.m115937b());
        }
        return treeMap;
    }
}
