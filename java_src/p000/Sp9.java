package p000;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
/* renamed from: Sp9 */
/* loaded from: classes6.dex */
public final class Sp9 {
    /* renamed from: a */
    public static String m84803a(Np9 np9, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m84800d(np9, sb, 0);
        return sb.toString();
    }

    /* renamed from: b */
    public static final void m84802b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                m84802b(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m84802b(sb, i, str, entry);
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
                sb.append(Er9.m108319a(AbstractC45836nh9.m23290z((String) obj)));
                sb.append('\"');
            } else if (obj instanceof AbstractC45836nh9) {
                sb.append(": \"");
                sb.append(Er9.m108319a((AbstractC45836nh9) obj));
                sb.append('\"');
            } else if (obj instanceof Em9) {
                sb.append(" {");
                m84800d((Em9) obj, sb, i + 2);
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
                m84802b(sb, i4, "key", entry2.getKey());
                m84802b(sb, i4, "value", entry2.getValue());
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
    public static final String m84801c(String str) {
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
    public static void m84800d(Np9 np9, StringBuilder sb, int i) {
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
        for (Method method : np9.getClass().getDeclaredMethods()) {
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
                    m84802b(sb, i, m84801c(str8), Em9.m108373k(method2, np9, new Object[0]));
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
                    m84802b(sb, i, m84801c(str7), Em9.m108373k(method3, np9, new Object[0]));
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
                    Object m108373k = Em9.m108373k(method4, np9, new Object[0]);
                    if (method5 == null) {
                        if (m108373k instanceof Boolean) {
                            if (((Boolean) m108373k).booleanValue()) {
                                m84802b(sb, i, m84801c(str3), m108373k);
                            }
                        } else if (m108373k instanceof Integer) {
                            if (((Integer) m108373k).intValue() != 0) {
                                m84802b(sb, i, m84801c(str3), m108373k);
                            }
                        } else if (m108373k instanceof Float) {
                            if (((Float) m108373k).floatValue() != 0.0f) {
                                m84802b(sb, i, m84801c(str3), m108373k);
                            }
                        } else if (m108373k instanceof Double) {
                            if (((Double) m108373k).doubleValue() != 0.0d) {
                                m84802b(sb, i, m84801c(str3), m108373k);
                            }
                        } else {
                            if (m108373k instanceof String) {
                                equals = m108373k.equals("");
                            } else if (m108373k instanceof AbstractC45836nh9) {
                                equals = m108373k.equals(AbstractC45836nh9.f100361c);
                            } else if (m108373k instanceof Np9) {
                                if (m108373k != ((Np9) m108373k).mo64027h()) {
                                    m84802b(sb, i, m84801c(str3), m108373k);
                                }
                            } else {
                                if ((m108373k instanceof Enum) && ((Enum) m108373k).ordinal() == 0) {
                                }
                                m84802b(sb, i, m84801c(str3), m108373k);
                            }
                            if (!equals) {
                                m84802b(sb, i, m84801c(str3), m108373k);
                            }
                        }
                    } else if (((Boolean) Em9.m108373k(method5, np9, new Object[0])).booleanValue()) {
                        m84802b(sb, i, m84801c(str3), m108373k);
                    }
                }
            }
        }
        if (!(np9 instanceof AbstractC45886nm9)) {
            Pr9 pr9 = ((Em9) np9).zzc;
            if (pr9 != null) {
                pr9.m89672g(sb, i);
                return;
            }
            return;
        }
        AbstractC45886nm9 abstractC45886nm9 = (AbstractC45886nm9) np9;
        throw null;
    }
}
