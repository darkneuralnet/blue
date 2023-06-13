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
/* renamed from: Vb7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36543Vb7 {

    /* renamed from: a */
    public static final char[] f39332a;

    static {
        char[] cArr = new char[80];
        f39332a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* renamed from: a */
    public static String m79682a(InterfaceC36075Tb7 interfaceC36075Tb7, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m79679d(interfaceC36075Tb7, sb, 0);
        return sb.toString();
    }

    /* renamed from: b */
    public static void m79681b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                m79681b(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m79681b(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            m79680c(i, sb);
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
                sb.append(C51712xc7.m4933a(new C52878za7(((String) obj).getBytes(C46960pb7.f103840b))));
                sb.append('\"');
            } else if (obj instanceof AbstractC32088Ca7) {
                sb.append(": \"");
                sb.append(C51712xc7.m4933a((AbstractC32088Ca7) obj));
                sb.append('\"');
            } else if (obj instanceof AbstractC41030fb7) {
                sb.append(" {");
                m79679d((AbstractC41030fb7) obj, sb, i + 2);
                sb.append("\n");
                m79680c(i, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i3 = i + 2;
                m79681b(sb, i3, "key", entry2.getKey());
                m79681b(sb, i3, "value", entry2.getValue());
                sb.append("\n");
                m79680c(i, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    /* renamed from: c */
    public static void m79680c(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f39332a, 0, i2);
            i -= i2;
        }
    }

    /* renamed from: d */
    public static void m79679d(InterfaceC36075Tb7 interfaceC36075Tb7, StringBuilder sb, int i) {
        int i2;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = interfaceC36075Tb7.getClass().getDeclaredMethods();
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
                m79681b(sb, i, substring.substring(0, substring.length() - 4), AbstractC41030fb7.m41146D(method2, interfaceC36075Tb7, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                m79681b(sb, i, substring.substring(0, substring.length() - 3), AbstractC41030fb7.m41146D(method, interfaceC36075Tb7, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object m41146D = AbstractC41030fb7.m41146D(method4, interfaceC36075Tb7, new Object[0]);
                    if (method5 == null) {
                        if (m41146D instanceof Boolean) {
                            if (!((Boolean) m41146D).booleanValue()) {
                            }
                            m79681b(sb, i, substring, m41146D);
                        } else if (m41146D instanceof Integer) {
                            if (((Integer) m41146D).intValue() == 0) {
                            }
                            m79681b(sb, i, substring, m41146D);
                        } else if (m41146D instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) m41146D).floatValue()) == 0) {
                            }
                            m79681b(sb, i, substring, m41146D);
                        } else if (m41146D instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) m41146D).doubleValue()) == 0) {
                            }
                            m79681b(sb, i, substring, m41146D);
                        } else {
                            if (m41146D instanceof String) {
                                equals = m41146D.equals("");
                            } else if (m41146D instanceof AbstractC32088Ca7) {
                                equals = m41146D.equals(AbstractC32088Ca7.f4281c);
                            } else if (m41146D instanceof InterfaceC36075Tb7) {
                                if (m41146D == ((InterfaceC36075Tb7) m41146D).mo41139h()) {
                                }
                                m79681b(sb, i, substring, m41146D);
                            } else {
                                if ((m41146D instanceof Enum) && ((Enum) m41146D).ordinal() == 0) {
                                }
                                m79681b(sb, i, substring, m41146D);
                            }
                            if (equals) {
                            }
                            m79681b(sb, i, substring, m41146D);
                        }
                    } else {
                        if (!((Boolean) AbstractC41030fb7.m41146D(method5, interfaceC36075Tb7, new Object[0])).booleanValue()) {
                        }
                        m79681b(sb, i, substring, m41146D);
                    }
                }
            }
            i2 = 3;
        }
        if (interfaceC36075Tb7 instanceof AbstractC39234cb7) {
            Iterator m83376g = ((AbstractC39234cb7) interfaceC36075Tb7).zbb.m83376g();
            while (m83376g.hasNext()) {
                Map.Entry entry2 = (Map.Entry) m83376g.next();
                C39845db7 c39845db7 = (C39845db7) entry2.getKey();
                m79681b(sb, i, "[32149011]", entry2.getValue());
            }
        }
        C32106Cc7 c32106Cc7 = ((AbstractC41030fb7) interfaceC36075Tb7).zbc;
        if (c32106Cc7 != null) {
            c32106Cc7.m111974i(sb, i);
        }
    }
}
