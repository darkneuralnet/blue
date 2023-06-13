package com.google.android.gms.internal.places;

import com.google.android.gms.internal.places.AbstractC17530c;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
/* renamed from: com.google.android.gms.internal.places.d */
/* loaded from: classes5.dex */
public final class C17536d {
    /* renamed from: a */
    public static String m51212a(InterfaceC52815zT7 interfaceC52815zT7, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m51210c(interfaceC52815zT7, sb, 0);
        return sb.toString();
    }

    /* renamed from: b */
    public static final void m51211b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                m51211b(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m51211b(sb, i, str, entry);
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
                sb.append(D28.m111016a(AbstractC43604jv9.m29742z((String) obj)));
                sb.append('\"');
            } else if (obj instanceof AbstractC43604jv9) {
                sb.append(": \"");
                sb.append(D28.m111016a((AbstractC43604jv9) obj));
                sb.append('\"');
            } else if (obj instanceof AbstractC17530c) {
                sb.append(" {");
                m51210c((AbstractC17530c) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i4 = i + 2;
                m51211b(sb, i4, "key", entry2.getKey());
                m51211b(sb, i4, "value", entry2.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
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
    public static void m51210c(InterfaceC52815zT7 interfaceC52815zT7, StringBuilder sb, int i) {
        Method[] declaredMethods;
        String str;
        String str2;
        String str3;
        String str4;
        boolean equals;
        String str5;
        String str6;
        String str7;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : interfaceC52815zT7.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str8 : treeSet) {
            String replaceFirst = str8.replaceFirst("get", "");
            boolean z = true;
            if (replaceFirst.endsWith("List") && !replaceFirst.endsWith("OrBuilderList") && !replaceFirst.equals("List")) {
                String valueOf = String.valueOf(replaceFirst.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(replaceFirst.substring(1, replaceFirst.length() - 4));
                if (valueOf2.length() != 0) {
                    str7 = valueOf.concat(valueOf2);
                } else {
                    str7 = new String(valueOf);
                }
                Method method2 = (Method) hashMap.get(str8);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m51211b(sb, i, m51209d(str7), AbstractC17530c.m51226l(method2, interfaceC52815zT7, new Object[0]));
                }
            }
            if (replaceFirst.endsWith("Map") && !replaceFirst.equals("Map")) {
                String valueOf3 = String.valueOf(replaceFirst.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(replaceFirst.substring(1, replaceFirst.length() - 3));
                if (valueOf4.length() != 0) {
                    str6 = valueOf3.concat(valueOf4);
                } else {
                    str6 = new String(valueOf3);
                }
                Method method3 = (Method) hashMap.get(str8);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m51211b(sb, i, m51209d(str6), AbstractC17530c.m51226l(method3, interfaceC52815zT7, new Object[0]));
                }
            }
            if (replaceFirst.length() != 0) {
                str = "set".concat(replaceFirst);
            } else {
                str = new String("set");
            }
            if (((Method) hashMap2.get(str)) != null) {
                if (replaceFirst.endsWith("Bytes")) {
                    String valueOf5 = String.valueOf(replaceFirst.substring(0, replaceFirst.length() - 5));
                    if (valueOf5.length() != 0) {
                        str5 = "get".concat(valueOf5);
                    } else {
                        str5 = new String("get");
                    }
                    if (!hashMap.containsKey(str5)) {
                    }
                }
                String valueOf6 = String.valueOf(replaceFirst.substring(0, 1).toLowerCase());
                String valueOf7 = String.valueOf(replaceFirst.substring(1));
                if (valueOf7.length() != 0) {
                    str2 = valueOf6.concat(valueOf7);
                } else {
                    str2 = new String(valueOf6);
                }
                if (replaceFirst.length() != 0) {
                    str3 = "get".concat(replaceFirst);
                } else {
                    str3 = new String("get");
                }
                Method method4 = (Method) hashMap.get(str3);
                if (replaceFirst.length() != 0) {
                    str4 = "has".concat(replaceFirst);
                } else {
                    str4 = new String("has");
                }
                Method method5 = (Method) hashMap.get(str4);
                if (method4 != null) {
                    Object m51226l = AbstractC17530c.m51226l(method4, interfaceC52815zT7, new Object[0]);
                    if (method5 == null) {
                        if (!(m51226l instanceof Boolean)) {
                            if (!(m51226l instanceof Integer)) {
                                if (!(m51226l instanceof Float)) {
                                    if (!(m51226l instanceof Double)) {
                                        if (m51226l instanceof String) {
                                            equals = m51226l.equals("");
                                        } else if (m51226l instanceof AbstractC43604jv9) {
                                            equals = m51226l.equals(AbstractC43604jv9.f93538c);
                                        } else {
                                            equals = !(m51226l instanceof InterfaceC52815zT7) ? false : false;
                                        }
                                    }
                                }
                            }
                        }
                        if (equals) {
                            z = false;
                        }
                    } else {
                        z = ((Boolean) AbstractC17530c.m51226l(method5, interfaceC52815zT7, new Object[0])).booleanValue();
                    }
                    if (z) {
                        m51211b(sb, i, m51209d(str2), m51226l);
                    }
                }
            }
        }
        if (interfaceC52815zT7 instanceof AbstractC17530c.AbstractC17532b) {
            Iterator<Map.Entry<Object, Object>> m104565d = ((AbstractC17530c.AbstractC17532b) interfaceC52815zT7).zzik.m104565d();
            if (m104565d.hasNext()) {
                m104565d.next().getKey();
                throw new NoSuchMethodError();
            }
        }
        C49611u38 c49611u38 = ((AbstractC17530c) interfaceC52815zT7).zzih;
        if (c49611u38 != null) {
            c49611u38.m10929c(sb, i);
        }
    }

    /* renamed from: d */
    public static final String m51209d(String str) {
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
