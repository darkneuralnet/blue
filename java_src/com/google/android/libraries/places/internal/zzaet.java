package com.google.android.libraries.places.internal;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
/* loaded from: classes6.dex */
final class zzaet {
    public static String zza(zzaer zzaerVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zzd(zzaerVar, sb, 0);
        return sb.toString();
    }

    public static final void zzb(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                zzb(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                zzb(sb, i, str, entry);
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
                sb.append(zzafr.zza(zzacp.zzl((String) obj)));
                sb.append('\"');
            } else if (obj instanceof zzacp) {
                sb.append(": \"");
                sb.append(zzafr.zza((zzacp) obj));
                sb.append('\"');
            } else if (obj instanceof zzadk) {
                sb.append(" {");
                zzd((zzadk) obj, sb, i + 2);
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
                zzb(sb, i4, "key", entry2.getKey());
                zzb(sb, i4, "value", entry2.getValue());
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

    private static final String zzc(String str) {
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

    private static void zzd(zzaer zzaerVar, StringBuilder sb, int i) {
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
        for (Method method : zzaerVar.getClass().getDeclaredMethods()) {
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
                    zzb(sb, i, zzc(str8), zzadk.zzE(method2, zzaerVar, new Object[0]));
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
                    zzb(sb, i, zzc(str7), zzadk.zzE(method3, zzaerVar, new Object[0]));
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
                    Object zzE = zzadk.zzE(method4, zzaerVar, new Object[0]);
                    if (method5 == null) {
                        if (zzE instanceof Boolean) {
                            if (((Boolean) zzE).booleanValue()) {
                                zzb(sb, i, zzc(str3), zzE);
                            }
                        } else if (zzE instanceof Integer) {
                            if (((Integer) zzE).intValue() != 0) {
                                zzb(sb, i, zzc(str3), zzE);
                            }
                        } else if (zzE instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) zzE).floatValue()) != 0) {
                                zzb(sb, i, zzc(str3), zzE);
                            }
                        } else if (zzE instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) zzE).doubleValue()) != 0) {
                                zzb(sb, i, zzc(str3), zzE);
                            }
                        } else {
                            if (zzE instanceof String) {
                                equals = zzE.equals("");
                            } else if (zzE instanceof zzacp) {
                                equals = zzE.equals(zzacp.zzb);
                            } else if (zzE instanceof zzaer) {
                                if (zzE != ((zzaer) zzE).zzw()) {
                                    zzb(sb, i, zzc(str3), zzE);
                                }
                            } else {
                                if ((zzE instanceof Enum) && ((Enum) zzE).ordinal() == 0) {
                                }
                                zzb(sb, i, zzc(str3), zzE);
                            }
                            if (!equals) {
                                zzb(sb, i, zzc(str3), zzE);
                            }
                        }
                    } else if (((Boolean) zzadk.zzE(method5, zzaerVar, new Object[0])).booleanValue()) {
                        zzb(sb, i, zzc(str3), zzE);
                    }
                }
            }
        }
        if (!(zzaerVar instanceof zzadi)) {
            zzafu zzafuVar = ((zzadk) zzaerVar).zzc;
            if (zzafuVar != null) {
                zzafuVar.zze(sb, i);
                return;
            }
            return;
        }
        zzadi zzadiVar = (zzadi) zzaerVar;
        throw null;
    }
}
