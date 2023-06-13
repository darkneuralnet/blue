package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.AbstractC17497c;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
/* renamed from: com.google.android.gms.internal.clearcut.d */
/* loaded from: classes5.dex */
public final class C17503d {
    /* renamed from: a */
    public static String m51538a(H28 h28, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m51536c(h28, sb, 0);
        return sb.toString();
    }

    /* renamed from: b */
    public static final void m51537b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                m51537b(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m51537b(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(C49935uc8.m9946a(TD7.m84180o((String) obj)));
                sb.append('\"');
            } else if (obj instanceof TD7) {
                sb.append(": \"");
                sb.append(C49935uc8.m9946a((TD7) obj));
                sb.append('\"');
            } else if (obj instanceof AbstractC17497c) {
                sb.append(" {");
                m51536c((AbstractC17497c) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (!(obj instanceof Map.Entry)) {
                sb.append(": ");
                sb.append(obj.toString());
            } else {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i4 = i + 2;
                m51537b(sb, i4, "key", entry2.getKey());
                m51537b(sb, i4, "value", entry2.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x01e5, code lost:
        if (((java.lang.Boolean) r11).booleanValue() == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01e7, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01f7, code lost:
        if (((java.lang.Integer) r11).intValue() == 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0208, code lost:
        if (((java.lang.Float) r11).floatValue() == 0.0f) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x021a, code lost:
        if (((java.lang.Double) r11).doubleValue() == 0.0d) goto L79;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m51536c(H28 h28, StringBuilder sb, int i) {
        Method[] declaredMethods;
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : h28.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            Object obj = "";
            String replaceFirst = str.replaceFirst("get", "");
            boolean z = true;
            if (replaceFirst.endsWith("List") && !replaceFirst.endsWith("OrBuilderList") && !replaceFirst.equals("List")) {
                String valueOf = String.valueOf(replaceFirst.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(replaceFirst.substring(1, replaceFirst.length() - 4));
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m51537b(sb, i, m51535d(concat), AbstractC17497c.m51562e(method2, h28, new Object[0]));
                }
            }
            if (replaceFirst.endsWith("Map") && !replaceFirst.equals("Map")) {
                String valueOf3 = String.valueOf(replaceFirst.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(replaceFirst.substring(1, replaceFirst.length() - 3));
                String concat2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m51537b(sb, i, m51535d(concat2), AbstractC17497c.m51562e(method3, h28, new Object[0]));
                }
            }
            if (((Method) hashMap2.get(replaceFirst.length() != 0 ? "set".concat(replaceFirst) : new String("set"))) != null) {
                if (replaceFirst.endsWith("Bytes")) {
                    String valueOf5 = String.valueOf(replaceFirst.substring(0, replaceFirst.length() - 5));
                    if (!hashMap.containsKey(valueOf5.length() != 0 ? "get".concat(valueOf5) : new String("get"))) {
                    }
                }
                String valueOf6 = String.valueOf(replaceFirst.substring(0, 1).toLowerCase());
                String valueOf7 = String.valueOf(replaceFirst.substring(1));
                String concat3 = valueOf7.length() != 0 ? valueOf6.concat(valueOf7) : new String(valueOf6);
                Method method4 = (Method) hashMap.get(replaceFirst.length() != 0 ? "get".concat(replaceFirst) : new String("get"));
                Method method5 = (Method) hashMap.get(replaceFirst.length() != 0 ? "has".concat(replaceFirst) : new String("has"));
                if (method4 != null) {
                    Object m51562e = AbstractC17497c.m51562e(method4, h28, new Object[0]);
                    if (method5 == null) {
                        if (!(m51562e instanceof Boolean)) {
                            if (!(m51562e instanceof Integer)) {
                                if (!(m51562e instanceof Float)) {
                                    if (!(m51562e instanceof Double)) {
                                        if (!(m51562e instanceof String)) {
                                            if (m51562e instanceof TD7) {
                                                obj = TD7.f34940c;
                                            } else {
                                                equals = !(m51562e instanceof H28) ? false : false;
                                            }
                                        }
                                        equals = m51562e.equals(obj);
                                    }
                                }
                            }
                        }
                        if (equals) {
                            z = false;
                        }
                    } else {
                        z = ((Boolean) AbstractC17497c.m51562e(method5, h28, new Object[0])).booleanValue();
                    }
                    if (z) {
                        m51537b(sb, i, m51535d(concat3), m51562e);
                    }
                }
            }
        }
        if (h28 instanceof AbstractC17497c.AbstractC17500c) {
            Iterator<Map.Entry<AbstractC17497c.C17501d, Object>> m83692e = ((AbstractC17497c.AbstractC17500c) h28).zzjv.m83692e();
            while (m83692e.hasNext()) {
                Map.Entry<AbstractC17497c.C17501d, Object> next = m83692e.next();
                int i2 = next.getKey().f70401b;
                StringBuilder sb2 = new StringBuilder(13);
                sb2.append("[");
                sb2.append(i2);
                sb2.append("]");
                m51537b(sb, i, sb2.toString(), next.getValue());
            }
        }
        C35626Rd8 c35626Rd8 = ((AbstractC17497c) h28).zzjp;
        if (c35626Rd8 != null) {
            c35626Rd8.m86528b(sb, i);
        }
    }

    /* renamed from: d */
    public static final String m51535d(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }
}
