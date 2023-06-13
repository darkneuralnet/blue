package p000;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* renamed from: Ej8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C32638Ej8 {

    /* renamed from: a */
    public static final char[] f7994a;

    static {
        char[] cArr = new char[80];
        f7994a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* renamed from: a */
    public static String m108550a(InterfaceC39926dj8 interfaceC39926dj8, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m108547d(interfaceC39926dj8, sb, 0);
        return sb.toString();
    }

    /* renamed from: b */
    public static void m108549b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                m108549b(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m108549b(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            m108548c(i, sb);
            if (!str.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Character.toLowerCase(str.charAt(0)));
                for (int i2 = 1; i2 < str.length(); i2++) {
                    char charAt = str.charAt(i2);
                    if (Character.isUpperCase(charAt)) {
                        sb2.append("_");
                    }
                    sb2.append(Character.toLowerCase(charAt));
                }
                str = sb2.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(C41201fs8.m40603a(new C46330oX7(((String) obj).getBytes(C32791Fa8.f9737b))));
                sb.append('\"');
            } else if (obj instanceof AbstractC41604gZ7) {
                sb.append(": \"");
                sb.append(C41201fs8.m40603a((AbstractC41604gZ7) obj));
                sb.append('\"');
            } else if (obj instanceof V78) {
                sb.append(" {");
                m108547d((V78) obj, sb, i + 2);
                sb.append("\n");
                m108548c(i, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i3 = i + 2;
                m108549b(sb, i3, "key", entry2.getKey());
                m108549b(sb, i3, "value", entry2.getValue());
                sb.append("\n");
                m108548c(i, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    /* renamed from: c */
    public static void m108548c(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f7994a, 0, i2);
            i -= i2;
        }
    }

    /* renamed from: d */
    public static void m108547d(InterfaceC39926dj8 interfaceC39926dj8, StringBuilder sb, int i) {
        int i2;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = interfaceC39926dj8.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i3 = 0;
        while (true) {
            i2 = 3;
            if (i3 >= length) {
                break;
            }
            Method method3 = declaredMethods[i3];
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
            i3++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i2);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                m108549b(sb, i, substring.substring(0, substring.length() - 4), V78.m80340s(method2, interfaceC39926dj8, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                m108549b(sb, i, substring.substring(0, substring.length() - 3), V78.m80340s(method, interfaceC39926dj8, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object m80340s = V78.m80340s(method4, interfaceC39926dj8, new Object[0]);
                    if (method5 == null) {
                        if (m80340s instanceof Boolean) {
                            if (!((Boolean) m80340s).booleanValue()) {
                            }
                            m108549b(sb, i, substring, m80340s);
                        } else if (m80340s instanceof Integer) {
                            if (((Integer) m80340s).intValue() == 0) {
                            }
                            m108549b(sb, i, substring, m80340s);
                        } else if (m80340s instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) m80340s).floatValue()) == 0) {
                            }
                            m108549b(sb, i, substring, m80340s);
                        } else if (m80340s instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) m80340s).doubleValue()) == 0) {
                            }
                            m108549b(sb, i, substring, m80340s);
                        } else {
                            if (m80340s instanceof String) {
                                equals = m80340s.equals("");
                            } else if (m80340s instanceof AbstractC41604gZ7) {
                                equals = m80340s.equals(AbstractC41604gZ7.f82424c);
                            } else if (m80340s instanceof InterfaceC39926dj8) {
                                if (m80340s == ((InterfaceC39926dj8) m80340s).mo15533q()) {
                                }
                                m108549b(sb, i, substring, m80340s);
                            } else {
                                if ((m80340s instanceof Enum) && ((Enum) m80340s).ordinal() == 0) {
                                }
                                m108549b(sb, i, substring, m80340s);
                            }
                            if (equals) {
                            }
                            m108549b(sb, i, substring, m80340s);
                        }
                    } else {
                        if (!((Boolean) V78.m80340s(method5, interfaceC39926dj8, new Object[0])).booleanValue()) {
                        }
                        m108549b(sb, i, substring, m80340s);
                    }
                }
            }
            i2 = 3;
        }
        if (interfaceC39926dj8 instanceof Q58) {
            Iterator m44636f = ((Q58) interfaceC39926dj8).zza.m44636f();
            while (m44636f.hasNext()) {
                Map.Entry entry2 = (Map.Entry) m44636f.next();
                m108549b(sb, i, "[" + ((C38368b78) entry2.getKey()).f56956b + "]", entry2.getValue());
            }
        }
        C36463Us8 c36463Us8 = ((V78) interfaceC39926dj8).zzc;
        if (c36463Us8 != null) {
            c36463Us8.m80674i(sb, i);
        }
    }
}
