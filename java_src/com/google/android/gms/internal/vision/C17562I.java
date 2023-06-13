package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.AbstractC17554G;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
/* renamed from: com.google.android.gms.internal.vision.I */
/* loaded from: classes6.dex */
public final class C17562I {
    /* renamed from: a */
    public static final String m50927a(String str) {
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

    /* renamed from: b */
    public static String m50926b(InterfaceC44489lQ8 interfaceC44489lQ8, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m50924d(interfaceC44489lQ8, sb, 0);
        return sb.toString();
    }

    /* renamed from: c */
    public static final void m50925c(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                m50925c(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m50925c(sb, i, str, entry);
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
                sb.append(C48110rX8.m15805a(AbstractC53119zy8.m39j((String) obj)));
                sb.append('\"');
            } else if (obj instanceof AbstractC53119zy8) {
                sb.append(": \"");
                sb.append(C48110rX8.m15805a((AbstractC53119zy8) obj));
                sb.append('\"');
            } else if (obj instanceof AbstractC17554G) {
                sb.append(" {");
                m50924d((AbstractC17554G) obj, sb, i + 2);
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
                m50925c(sb, i4, "key", entry2.getKey());
                m50925c(sb, i4, "value", entry2.getValue());
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

    /* JADX WARN: Code restructure failed: missing block: B:83:0x01e4, code lost:
        if (((java.lang.Boolean) r6).booleanValue() == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01e6, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01f7, code lost:
        if (((java.lang.Integer) r6).intValue() == 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0208, code lost:
        if (((java.lang.Float) r6).floatValue() == 0.0f) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x021a, code lost:
        if (((java.lang.Double) r6).doubleValue() == 0.0d) goto L82;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m50924d(InterfaceC44489lQ8 interfaceC44489lQ8, StringBuilder sb, int i) {
        Method[] declaredMethods;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean equals;
        String str6;
        String str7;
        String str8;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : interfaceC44489lQ8.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str9 : treeSet) {
            if (str9.startsWith("get")) {
                str = str9.substring(3);
            } else {
                str = str9;
            }
            boolean z = true;
            if (str.endsWith("List") && !str.endsWith("OrBuilderList") && !str.equals("List")) {
                String valueOf = String.valueOf(str.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(str.substring(1, str.length() - 4));
                if (valueOf2.length() != 0) {
                    str8 = valueOf.concat(valueOf2);
                } else {
                    str8 = new String(valueOf);
                }
                Method method2 = (Method) hashMap.get(str9);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m50925c(sb, i, m50927a(str8), AbstractC17554G.m50991m(method2, interfaceC44489lQ8, new Object[0]));
                }
            }
            if (str.endsWith("Map") && !str.equals("Map")) {
                String valueOf3 = String.valueOf(str.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(str.substring(1, str.length() - 3));
                if (valueOf4.length() != 0) {
                    str7 = valueOf3.concat(valueOf4);
                } else {
                    str7 = new String(valueOf3);
                }
                Method method3 = (Method) hashMap.get(str9);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m50925c(sb, i, m50927a(str7), AbstractC17554G.m50991m(method3, interfaceC44489lQ8, new Object[0]));
                }
            }
            if (str.length() != 0) {
                str2 = "set".concat(str);
            } else {
                str2 = new String("set");
            }
            if (((Method) hashMap2.get(str2)) != null) {
                if (str.endsWith("Bytes")) {
                    String valueOf5 = String.valueOf(str.substring(0, str.length() - 5));
                    if (valueOf5.length() != 0) {
                        str6 = "get".concat(valueOf5);
                    } else {
                        str6 = new String("get");
                    }
                    if (!hashMap.containsKey(str6)) {
                    }
                }
                String valueOf6 = String.valueOf(str.substring(0, 1).toLowerCase());
                String valueOf7 = String.valueOf(str.substring(1));
                if (valueOf7.length() != 0) {
                    str3 = valueOf6.concat(valueOf7);
                } else {
                    str3 = new String(valueOf6);
                }
                if (str.length() != 0) {
                    str4 = "get".concat(str);
                } else {
                    str4 = new String("get");
                }
                Method method4 = (Method) hashMap.get(str4);
                if (str.length() != 0) {
                    str5 = "has".concat(str);
                } else {
                    str5 = new String("has");
                }
                Method method5 = (Method) hashMap.get(str5);
                if (method4 != null) {
                    Object m50991m = AbstractC17554G.m50991m(method4, interfaceC44489lQ8, new Object[0]);
                    if (method5 == null) {
                        if (!(m50991m instanceof Boolean)) {
                            if (!(m50991m instanceof Integer)) {
                                if (!(m50991m instanceof Float)) {
                                    if (!(m50991m instanceof Double)) {
                                        if (m50991m instanceof String) {
                                            equals = m50991m.equals("");
                                        } else if (m50991m instanceof AbstractC53119zy8) {
                                            equals = m50991m.equals(AbstractC53119zy8.f122544c);
                                        } else {
                                            equals = !(m50991m instanceof InterfaceC44489lQ8) ? false : false;
                                        }
                                    }
                                }
                            }
                        }
                        if (equals) {
                            z = false;
                        }
                    } else {
                        z = ((Boolean) AbstractC17554G.m50991m(method5, interfaceC44489lQ8, new Object[0])).booleanValue();
                    }
                    if (z) {
                        m50925c(sb, i, m50927a(str3), m50991m);
                    }
                }
            }
        }
        if (interfaceC44489lQ8 instanceof AbstractC17554G.AbstractC17557c) {
            Iterator<Map.Entry<AbstractC17554G.C17559e, Object>> m17717o = ((AbstractC17554G.AbstractC17557c) interfaceC44489lQ8).zzc.m17717o();
            while (m17717o.hasNext()) {
                Map.Entry<AbstractC17554G.C17559e, Object> next = m17717o.next();
                int i2 = next.getKey().f71228b;
                StringBuilder sb2 = new StringBuilder(13);
                sb2.append("[");
                sb2.append(i2);
                sb2.append("]");
                m50925c(sb, i, sb2.toString(), next.getValue());
            }
        }
        HY8 hy8 = ((AbstractC17554G) interfaceC44489lQ8).zzb;
        if (hy8 != null) {
            hy8.m103754e(sb, i);
        }
    }
}
