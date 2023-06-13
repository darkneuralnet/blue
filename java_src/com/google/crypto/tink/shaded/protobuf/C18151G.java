package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC18230t;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
/* renamed from: com.google.crypto.tink.shaded.protobuf.G */
/* loaded from: classes6.dex */
public final class C18151G {
    /* renamed from: a */
    public static final String m48087a(String str) {
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
    public static boolean m48086b(Object obj) {
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
            if (obj instanceof AbstractC18199g) {
                return obj.equals(AbstractC18199g.f74142c);
            }
            if (obj instanceof InterfaceC18149F) {
                if (obj == ((InterfaceC18149F) obj).getDefaultInstanceForType()) {
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
    public static final void m48085c(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                m48085c(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m48085c(sb, i, str, entry);
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
                sb.append(K16.m99332c((String) obj));
                sb.append('\"');
            } else if (obj instanceof AbstractC18199g) {
                sb.append(": \"");
                sb.append(K16.m99333b((AbstractC18199g) obj));
                sb.append('\"');
            } else if (obj instanceof AbstractC18230t) {
                sb.append(" {");
                m48084d((AbstractC18230t) obj, sb, i + 2);
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
                m48085c(sb, i4, "key", entry2.getKey());
                m48085c(sb, i4, "value", entry2.getValue());
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

    /* renamed from: d */
    public static void m48084d(InterfaceC18149F interfaceC18149F, StringBuilder sb, int i) {
        Method[] declaredMethods;
        Map.Entry<AbstractC18230t.C18234d, Object> next;
        String str;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : interfaceC18149F.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str2 : treeSet) {
            if (str2.startsWith("get")) {
                str = str2.substring(3);
            } else {
                str = str2;
            }
            boolean z = true;
            if (str.endsWith("List") && !str.endsWith("OrBuilderList") && !str.equals("List")) {
                String str3 = str.substring(0, 1).toLowerCase() + str.substring(1, str.length() - 4);
                Method method2 = (Method) hashMap.get(str2);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m48085c(sb, i, m48087a(str3), AbstractC18230t.m47465r(method2, interfaceC18149F, new Object[0]));
                }
            }
            if (str.endsWith("Map") && !str.equals("Map")) {
                String str4 = str.substring(0, 1).toLowerCase() + str.substring(1, str.length() - 3);
                Method method3 = (Method) hashMap.get(str2);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m48085c(sb, i, m48087a(str4), AbstractC18230t.m47465r(method3, interfaceC18149F, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set" + str)) != null) {
                if (str.endsWith("Bytes")) {
                    if (hashMap.containsKey("get" + str.substring(0, str.length() - 5))) {
                    }
                }
                String str5 = str.substring(0, 1).toLowerCase() + str.substring(1);
                Method method4 = (Method) hashMap.get("get" + str);
                Method method5 = (Method) hashMap.get("has" + str);
                if (method4 != null) {
                    Object m47465r = AbstractC18230t.m47465r(method4, interfaceC18149F, new Object[0]);
                    if (method5 == null) {
                        if (m48086b(m47465r)) {
                            z = false;
                        }
                    } else {
                        z = ((Boolean) AbstractC18230t.m47465r(method5, interfaceC18149F, new Object[0])).booleanValue();
                    }
                    if (z) {
                        m48085c(sb, i, m48087a(str5), m47465r);
                    }
                }
            }
        }
        if (interfaceC18149F instanceof AbstractC18230t.AbstractC18233c) {
            Iterator<Map.Entry<AbstractC18230t.C18234d, Object>> m47500r = ((AbstractC18230t.AbstractC18233c) interfaceC18149F).extensions.m47500r();
            while (m47500r.hasNext()) {
                m48085c(sb, i, "[" + next.getKey().getNumber() + "]", m47500r.next().getValue());
            }
        }
        C18170Q c18170q = ((AbstractC18230t) interfaceC18149F).unknownFields;
        if (c18170q != null) {
            c18170q.m47885l(sb, i);
        }
    }

    /* renamed from: e */
    public static String m48083e(InterfaceC18149F interfaceC18149F, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m48084d(interfaceC18149F, sb, 0);
        return sb.toString();
    }
}
