package p000;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* renamed from: K19 */
/* loaded from: classes5.dex */
public final class K19 {

    /* renamed from: a */
    public static final char[] f18944a;

    static {
        char[] cArr = new char[80];
        f18944a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* renamed from: a */
    public static String m99329a(InterfaceC47814r19 interfaceC47814r19, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m99326d(interfaceC47814r19, sb, 0);
        return sb.toString();
    }

    /* renamed from: b */
    public static void m99328b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                m99328b(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m99328b(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            m99327c(i, sb);
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
                sb.append(B69.m114354a(new OM8(((String) obj).getBytes(XV8.f43342b))));
                sb.append('\"');
            } else if (obj instanceof AbstractC40913fO8) {
                sb.append(": \"");
                sb.append(B69.m114354a((AbstractC40913fO8) obj));
                sb.append('\"');
            } else if (obj instanceof AbstractC46897pU8) {
                sb.append(" {");
                m99326d((AbstractC46897pU8) obj, sb, i + 2);
                sb.append("\n");
                m99327c(i, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i3 = i + 2;
                m99328b(sb, i3, "key", entry2.getKey());
                m99328b(sb, i3, "value", entry2.getValue());
                sb.append("\n");
                m99327c(i, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    /* renamed from: c */
    public static void m99327c(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f18944a, 0, i2);
            i -= i2;
        }
    }

    /* renamed from: d */
    public static void m99326d(InterfaceC47814r19 interfaceC47814r19, StringBuilder sb, int i) {
        int i2;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = interfaceC47814r19.getClass().getDeclaredMethods();
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
                m99328b(sb, i, substring.substring(0, substring.length() - 4), AbstractC46897pU8.m19200s(method2, interfaceC47814r19, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                m99328b(sb, i, substring.substring(0, substring.length() - 3), AbstractC46897pU8.m19200s(method, interfaceC47814r19, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object m19200s = AbstractC46897pU8.m19200s(method4, interfaceC47814r19, new Object[0]);
                    if (method5 == null) {
                        if (m19200s instanceof Boolean) {
                            if (!((Boolean) m19200s).booleanValue()) {
                            }
                            m99328b(sb, i, substring, m19200s);
                        } else if (m19200s instanceof Integer) {
                            if (((Integer) m19200s).intValue() == 0) {
                            }
                            m99328b(sb, i, substring, m19200s);
                        } else if (m19200s instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) m19200s).floatValue()) == 0) {
                            }
                            m99328b(sb, i, substring, m19200s);
                        } else if (m19200s instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) m19200s).doubleValue()) == 0) {
                            }
                            m99328b(sb, i, substring, m19200s);
                        } else {
                            if (m19200s instanceof String) {
                                equals = m19200s.equals("");
                            } else if (m19200s instanceof AbstractC40913fO8) {
                                equals = m19200s.equals(AbstractC40913fO8.f80055c);
                            } else if (m19200s instanceof InterfaceC47814r19) {
                                if (m19200s == ((InterfaceC47814r19) m19200s).mo19211f()) {
                                }
                                m99328b(sb, i, substring, m19200s);
                            } else {
                                if ((m19200s instanceof Enum) && ((Enum) m19200s).ordinal() == 0) {
                                }
                                m99328b(sb, i, substring, m19200s);
                            }
                            if (equals) {
                            }
                            m99328b(sb, i, substring, m19200s);
                        }
                    } else {
                        if (!((Boolean) AbstractC46897pU8.m19200s(method5, interfaceC47814r19, new Object[0])).booleanValue()) {
                        }
                        m99328b(sb, i, substring, m19200s);
                    }
                }
            }
            i2 = 3;
        }
        if (!(interfaceC47814r19 instanceof AbstractC40958fT8)) {
            Y69 y69 = ((AbstractC46897pU8) interfaceC47814r19).zzc;
            if (y69 != null) {
                y69.m75681i(sb, i);
                return;
            }
            return;
        }
        AbstractC40958fT8 abstractC40958fT8 = (AbstractC40958fT8) interfaceC47814r19;
        throw null;
    }
}
