package p000;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
/* renamed from: Dg9 */
/* loaded from: classes5.dex */
public final class Dg9 {
    /* renamed from: a */
    public static String m110012a(InterfaceC47012pg9 interfaceC47012pg9, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m110009d(interfaceC47012pg9, sb, 0);
        return sb.toString();
    }

    /* renamed from: b */
    public static final void m110011b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                m110011b(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m110011b(sb, i, str, entry);
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
                sb.append(Bk9.m113528a(T69.m84302w((String) obj)));
                sb.append('\"');
            } else if (obj instanceof T69) {
                sb.append(": \"");
                sb.append(Bk9.m113528a((T69) obj));
                sb.append('\"');
            } else if (obj instanceof AbstractC49926ub9) {
                sb.append(" {");
                m110009d((AbstractC49926ub9) obj, sb, i + 2);
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
                m110011b(sb, i4, "key", entry2.getKey());
                m110011b(sb, i4, "value", entry2.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    /* renamed from: c */
    public static final String m110010c(String str) {
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
    public static void m110009d(InterfaceC47012pg9 interfaceC47012pg9, StringBuilder sb, int i) {
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
        for (Method method : interfaceC47012pg9.getClass().getDeclaredMethods()) {
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
                    m110011b(sb, i, m110010c(str8), AbstractC49926ub9.m9990f(method2, interfaceC47012pg9, new Object[0]));
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
                    m110011b(sb, i, m110010c(str7), AbstractC49926ub9.m9990f(method3, interfaceC47012pg9, new Object[0]));
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
                    Object m9990f = AbstractC49926ub9.m9990f(method4, interfaceC47012pg9, new Object[0]);
                    if (method5 == null) {
                        if (m9990f instanceof Boolean) {
                            if (((Boolean) m9990f).booleanValue()) {
                                m110011b(sb, i, m110010c(str3), m9990f);
                            }
                        } else if (m9990f instanceof Integer) {
                            if (((Integer) m9990f).intValue() != 0) {
                                m110011b(sb, i, m110010c(str3), m9990f);
                            }
                        } else if (m9990f instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) m9990f).floatValue()) != 0) {
                                m110011b(sb, i, m110010c(str3), m9990f);
                            }
                        } else if (m9990f instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) m9990f).doubleValue()) != 0) {
                                m110011b(sb, i, m110010c(str3), m9990f);
                            }
                        } else {
                            if (m9990f instanceof String) {
                                equals = m9990f.equals("");
                            } else if (m9990f instanceof T69) {
                                equals = m9990f.equals(T69.f34797c);
                            } else if (m9990f instanceof InterfaceC47012pg9) {
                                if (m9990f != ((InterfaceC47012pg9) m9990f).mo6491g()) {
                                    m110011b(sb, i, m110010c(str3), m9990f);
                                }
                            } else {
                                if ((m9990f instanceof Enum) && ((Enum) m9990f).ordinal() == 0) {
                                }
                                m110011b(sb, i, m110010c(str3), m9990f);
                            }
                            if (!equals) {
                                m110011b(sb, i, m110010c(str3), m9990f);
                            }
                        }
                    } else if (((Boolean) AbstractC49926ub9.m9990f(method5, interfaceC47012pg9, new Object[0])).booleanValue()) {
                        m110011b(sb, i, m110010c(str3), m9990f);
                    }
                }
            }
        }
        if (interfaceC47012pg9 instanceof Ta9) {
            Iterator m44106f = ((Ta9) interfaceC47012pg9).zzb.m44106f();
            while (m44106f.hasNext()) {
                Map.Entry entry = (Map.Entry) m44106f.next();
                C38050ab9 c38050ab9 = (C38050ab9) entry.getKey();
                m110011b(sb, i, "[202056002]", entry.getValue());
            }
        }
        Sk9 sk9 = ((AbstractC49926ub9) interfaceC47012pg9).zzc;
        if (sk9 != null) {
            sk9.m84911g(sb, i);
        }
    }
}
