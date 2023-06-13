package p000;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
/* renamed from: lk8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44679lk8 {
    /* renamed from: a */
    public static String m26886a(InterfaceC34042Kj8 interfaceC34042Kj8, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m26883d(interfaceC34042Kj8, sb, 0);
        return sb.toString();
    }

    /* renamed from: b */
    public static final void m26885b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                m26885b(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m26885b(sb, i, str, entry);
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
                sb.append(C41774gq8.m37421a(AbstractC50836w78.m7376v((String) obj)));
                sb.append('\"');
            } else if (obj instanceof AbstractC50836w78) {
                sb.append(": \"");
                sb.append(C41774gq8.m37421a((AbstractC50836w78) obj));
                sb.append('\"');
            } else if (obj instanceof AbstractC35140Pb8) {
                sb.append(" {");
                m26883d((AbstractC35140Pb8) obj, sb, i + 2);
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
                m26885b(sb, i4, "key", entry2.getKey());
                m26885b(sb, i4, "value", entry2.getValue());
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

    /* renamed from: c */
    public static final String m26884c(String str) {
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

    /* renamed from: d */
    public static void m26883d(InterfaceC34042Kj8 interfaceC34042Kj8, StringBuilder sb, int i) {
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
        for (Method method : interfaceC34042Kj8.getClass().getDeclaredMethods()) {
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
                    m26885b(sb, i, m26884c(str8), AbstractC35140Pb8.m90065e(method2, interfaceC34042Kj8, new Object[0]));
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
                    m26885b(sb, i, m26884c(str7), AbstractC35140Pb8.m90065e(method3, interfaceC34042Kj8, new Object[0]));
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
                    Object m90065e = AbstractC35140Pb8.m90065e(method4, interfaceC34042Kj8, new Object[0]);
                    if (method5 == null) {
                        if (m90065e instanceof Boolean) {
                            if (((Boolean) m90065e).booleanValue()) {
                                m26885b(sb, i, m26884c(str3), m90065e);
                            }
                        } else if (m90065e instanceof Integer) {
                            if (((Integer) m90065e).intValue() != 0) {
                                m26885b(sb, i, m26884c(str3), m90065e);
                            }
                        } else if (m90065e instanceof Float) {
                            if (((Float) m90065e).floatValue() != 0.0f) {
                                m26885b(sb, i, m26884c(str3), m90065e);
                            }
                        } else if (m90065e instanceof Double) {
                            if (((Double) m90065e).doubleValue() != 0.0d) {
                                m26885b(sb, i, m26884c(str3), m90065e);
                            }
                        } else {
                            if (m90065e instanceof String) {
                                equals = m90065e.equals("");
                            } else if (m90065e instanceof AbstractC50836w78) {
                                equals = m90065e.equals(AbstractC50836w78.f115390c);
                            } else if (m90065e instanceof InterfaceC34042Kj8) {
                                if (m90065e != ((InterfaceC34042Kj8) m90065e).zzh()) {
                                    m26885b(sb, i, m26884c(str3), m90065e);
                                }
                            } else {
                                if ((m90065e instanceof Enum) && ((Enum) m90065e).ordinal() == 0) {
                                }
                                m26885b(sb, i, m26884c(str3), m90065e);
                            }
                            if (!equals) {
                                m26885b(sb, i, m26884c(str3), m90065e);
                            }
                        }
                    } else if (((Boolean) AbstractC35140Pb8.m90065e(method5, interfaceC34042Kj8, new Object[0])).booleanValue()) {
                        m26885b(sb, i, m26884c(str3), m90065e);
                    }
                }
            }
        }
        if (!(interfaceC34042Kj8 instanceof AbstractC31864Bb8)) {
            C35275Pq8 c35275Pq8 = ((AbstractC35140Pb8) interfaceC34042Kj8).zzc;
            if (c35275Pq8 != null) {
                c35275Pq8.m89697e(sb, i);
                return;
            }
            return;
        }
        AbstractC31864Bb8 abstractC31864Bb8 = (AbstractC31864Bb8) interfaceC34042Kj8;
        throw null;
    }
}
