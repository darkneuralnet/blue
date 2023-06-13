package com.google.protobuf;

import com.google.protobuf.AbstractC18536r;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* renamed from: com.google.protobuf.E */
/* loaded from: classes6.dex */
public final class C18464E {

    /* renamed from: a */
    public static final char[] f74691a;

    static {
        char[] cArr = new char[80];
        f74691a = cArr;
        Arrays.fill(cArr, ' ');
    }

    private C18464E() {
    }

    /* renamed from: a */
    public static void m46627a(int i, StringBuilder sb) {
        int i2;
        while (i > 0) {
            char[] cArr = f74691a;
            if (i > cArr.length) {
                i2 = cArr.length;
            } else {
                i2 = i;
            }
            sb.append(cArr, 0, i2);
            i -= i2;
        }
    }

    /* renamed from: b */
    public static boolean m46626b(Object obj) {
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            if (((Integer) obj).intValue() == 0) {
                return true;
            }
            return false;
        } else if (obj instanceof Float) {
            if (Float.floatToRawIntBits(((Float) obj).floatValue()) == 0) {
                return true;
            }
            return false;
        } else if (obj instanceof Double) {
            if (Double.doubleToRawLongBits(((Double) obj).doubleValue()) == 0) {
                return true;
            }
            return false;
        } else if (obj instanceof String) {
            return obj.equals("");
        } else {
            if (obj instanceof AbstractC18504e) {
                return obj.equals(AbstractC18504e.f74797c);
            }
            if (obj instanceof InterfaceC18462D) {
                if (obj == ((InterfaceC18462D) obj).getDefaultInstanceForType()) {
                    return true;
                }
                return false;
            } else if ((obj instanceof Enum) && ((Enum) obj).ordinal() == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    /* renamed from: c */
    public static String m46625c(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toLowerCase(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    /* renamed from: d */
    public static void m46624d(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                m46624d(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m46624d(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            m46627a(i, sb);
            sb.append(m46625c(str));
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(J16.m101295c((String) obj));
                sb.append('\"');
            } else if (obj instanceof AbstractC18504e) {
                sb.append(": \"");
                sb.append(J16.m101296b((AbstractC18504e) obj));
                sb.append('\"');
            } else if (obj instanceof AbstractC18536r) {
                sb.append(" {");
                m46623e((AbstractC18536r) obj, sb, i + 2);
                sb.append("\n");
                m46627a(i, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i2 = i + 2;
                m46624d(sb, i2, "key", entry2.getKey());
                m46624d(sb, i2, "value", entry2.getValue());
                sb.append("\n");
                m46627a(i, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x016f, code lost:
        if (r5.containsKey("get" + r9.substring(0, r9.length() - 5)) != false) goto L58;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m46623e(InterfaceC18462D interfaceC18462D, StringBuilder sb, int i) {
        int i2;
        Map.Entry<AbstractC18536r.C18540d, Object> next;
        int i3;
        boolean booleanValue;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = interfaceC18462D.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            Method method3 = declaredMethods[i4];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i2);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                m46624d(sb, i, substring.substring(0, substring.length() - 4), AbstractC18536r.m46065F(method2, interfaceC18462D, new Object[0]));
                i2 = 3;
            } else {
                if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                    i3 = 3;
                    m46624d(sb, i, substring.substring(0, substring.length() - 3), AbstractC18536r.m46065F(method, interfaceC18462D, new Object[0]));
                } else {
                    i3 = 3;
                    if (hashSet.contains("set" + substring)) {
                        if (substring.endsWith("Bytes")) {
                        }
                        Method method4 = (Method) entry.getValue();
                        Method method5 = (Method) hashMap.get("has" + substring);
                        if (method4 != null) {
                            Object m46065F = AbstractC18536r.m46065F(method4, interfaceC18462D, new Object[0]);
                            if (method5 == null) {
                                if (!m46626b(m46065F)) {
                                    booleanValue = true;
                                } else {
                                    booleanValue = false;
                                }
                            } else {
                                booleanValue = ((Boolean) AbstractC18536r.m46065F(method5, interfaceC18462D, new Object[0])).booleanValue();
                            }
                            if (booleanValue) {
                                m46624d(sb, i, substring, m46065F);
                            }
                        }
                    }
                }
                i2 = i3;
            }
        }
        if (interfaceC18462D instanceof AbstractC18536r.AbstractC18539c) {
            Iterator<Map.Entry<AbstractC18536r.C18540d, Object>> m46089t = ((AbstractC18536r.AbstractC18539c) interfaceC18462D).extensions.m46089t();
            while (m46089t.hasNext()) {
                m46624d(sb, i, "[" + next.getKey().getNumber() + "]", m46089t.next().getValue());
            }
        }
        C18481M c18481m = ((AbstractC18536r) interfaceC18462D).unknownFields;
        if (c18481m != null) {
            c18481m.m46427m(sb, i);
        }
    }

    /* renamed from: f */
    public static String m46622f(InterfaceC18462D interfaceC18462D, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m46623e(interfaceC18462D, sb, 0);
        return sb.toString();
    }
}
