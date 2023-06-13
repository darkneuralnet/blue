package p000;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
/* renamed from: hv7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42416hv7 {
    /* renamed from: a */
    public static String m35487a(InterfaceC41230fv7 interfaceC41230fv7, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m35484d(interfaceC41230fv7, sb, 0);
        return sb.toString();
    }

    /* renamed from: b */
    public static final void m35486b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                m35486b(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m35486b(sb, i, str, entry);
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
                sb.append(C37659Zv7.m72296a(AbstractC44175kt7.m28226E((String) obj)));
                sb.append('\"');
            } else if (obj instanceof AbstractC44175kt7) {
                sb.append(": \"");
                sb.append(C37659Zv7.m72296a((AbstractC44175kt7) obj));
                sb.append('\"');
            } else if (obj instanceof AbstractC40627eu7) {
                sb.append(" {");
                m35484d((AbstractC40627eu7) obj, sb, i + 2);
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
                m35486b(sb, i4, "key", entry2.getKey());
                m35486b(sb, i4, "value", entry2.getValue());
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
    public static final String m35485c(String str) {
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
    public static void m35484d(InterfaceC41230fv7 interfaceC41230fv7, StringBuilder sb, int i) {
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
        for (Method method : interfaceC41230fv7.getClass().getDeclaredMethods()) {
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
                    m35486b(sb, i, m35485c(str8), AbstractC40627eu7.m42397u(method2, interfaceC41230fv7, new Object[0]));
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
                    m35486b(sb, i, m35485c(str7), AbstractC40627eu7.m42397u(method3, interfaceC41230fv7, new Object[0]));
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
                    Object m42397u = AbstractC40627eu7.m42397u(method4, interfaceC41230fv7, new Object[0]);
                    if (method5 == null) {
                        if (m42397u instanceof Boolean) {
                            if (((Boolean) m42397u).booleanValue()) {
                                m35486b(sb, i, m35485c(str3), m42397u);
                            }
                        } else if (m42397u instanceof Integer) {
                            if (((Integer) m42397u).intValue() != 0) {
                                m35486b(sb, i, m35485c(str3), m42397u);
                            }
                        } else if (m42397u instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) m42397u).floatValue()) != 0) {
                                m35486b(sb, i, m35485c(str3), m42397u);
                            }
                        } else if (m42397u instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) m42397u).doubleValue()) != 0) {
                                m35486b(sb, i, m35485c(str3), m42397u);
                            }
                        } else {
                            if (m42397u instanceof String) {
                                equals = m42397u.equals("");
                            } else if (m42397u instanceof AbstractC44175kt7) {
                                equals = m42397u.equals(AbstractC44175kt7.f95165c);
                            } else if (m42397u instanceof InterfaceC41230fv7) {
                                if (m42397u != ((InterfaceC41230fv7) m42397u).zzw()) {
                                    m35486b(sb, i, m35485c(str3), m42397u);
                                }
                            } else {
                                if ((m42397u instanceof Enum) && ((Enum) m42397u).ordinal() == 0) {
                                }
                                m35486b(sb, i, m35485c(str3), m42397u);
                            }
                            if (!equals) {
                                m35486b(sb, i, m35485c(str3), m42397u);
                            }
                        }
                    } else if (((Boolean) AbstractC40627eu7.m42397u(method5, interfaceC41230fv7, new Object[0])).booleanValue()) {
                        m35486b(sb, i, m35485c(str3), m42397u);
                    }
                }
            }
        }
        if (interfaceC41230fv7 instanceof AbstractC38831bu7) {
            Iterator m108242h = ((AbstractC38831bu7) interfaceC41230fv7).zzb.m108242h();
            if (m108242h.hasNext()) {
                C39442cu7 c39442cu7 = (C39442cu7) ((Map.Entry) m108242h.next()).getKey();
                throw null;
            }
        }
        C49541tw7 c49541tw7 = ((AbstractC40627eu7) interfaceC41230fv7).zzc;
        if (c49541tw7 != null) {
            c49541tw7.m11180g(sb, i);
        }
    }
}
