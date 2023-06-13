package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import java.lang.reflect.Field;
import java.util.HashMap;
/* renamed from: A */
/* loaded from: classes6.dex */
public class C0000A {
    /* renamed from: a */
    public static void m116218a(YT2 yt2, C31628Ab6 c31628Ab6) {
        switch (c31628Ab6.m115472l()) {
            case 1:
                yt2.mo73027v(SyslogConstants.LOG_LOCAL7, "java/lang/Boolean", CoreConstants.VALUE_OF, "(Z)Ljava/lang/Boolean;", false);
                return;
            case 2:
                yt2.mo73027v(SyslogConstants.LOG_LOCAL7, "java/lang/Character", CoreConstants.VALUE_OF, "(C)Ljava/lang/Character;", false);
                return;
            case 3:
                yt2.mo73027v(SyslogConstants.LOG_LOCAL7, "java/lang/Byte", CoreConstants.VALUE_OF, "(B)Ljava/lang/Byte;", false);
                return;
            case 4:
                yt2.mo73027v(SyslogConstants.LOG_LOCAL7, "java/lang/Short", CoreConstants.VALUE_OF, "(S)Ljava/lang/Short;", false);
                return;
            case 5:
                yt2.mo73027v(SyslogConstants.LOG_LOCAL7, "java/lang/Integer", CoreConstants.VALUE_OF, "(I)Ljava/lang/Integer;", false);
                return;
            case 6:
                yt2.mo73027v(SyslogConstants.LOG_LOCAL7, "java/lang/Float", CoreConstants.VALUE_OF, "(F)Ljava/lang/Float;", false);
                return;
            case 7:
                yt2.mo73027v(SyslogConstants.LOG_LOCAL7, "java/lang/Long", CoreConstants.VALUE_OF, "(J)Ljava/lang/Long;", false);
                return;
            case 8:
                yt2.mo73027v(SyslogConstants.LOG_LOCAL7, "java/lang/Double", CoreConstants.VALUE_OF, "(D)Ljava/lang/Double;", false);
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    public static C29358v2[] m116217b(Class<?> cls, InterfaceC36150Tk1 interfaceC36150Tk1) {
        Field[] declaredFields;
        HashMap hashMap = new HashMap();
        if (interfaceC36150Tk1 == null) {
            interfaceC36150Tk1 = C4381KE.f19300a;
        }
        while (cls != Object.class) {
            for (Field field : cls.getDeclaredFields()) {
                String name = field.getName();
                if (!hashMap.containsKey(name)) {
                    C29358v2 c29358v2 = new C29358v2(cls, field, interfaceC36150Tk1);
                    if (c29358v2.m9354g()) {
                        hashMap.put(name, c29358v2);
                    }
                }
            }
            cls = cls.getSuperclass();
        }
        return (C29358v2[]) hashMap.values().toArray(new C29358v2[hashMap.size()]);
    }

    /* renamed from: c */
    public static String m116216c(String str) {
        int length = str.length();
        char[] cArr = new char[length + 3];
        cArr[0] = 'g';
        cArr[1] = 'e';
        cArr[2] = 't';
        char charAt = str.charAt(0);
        if (charAt >= 'a' && charAt <= 'z') {
            charAt = (char) (charAt - ' ');
        }
        cArr[3] = charAt;
        for (int i = 1; i < length; i++) {
            cArr[i + 3] = str.charAt(i);
        }
        return new String(cArr);
    }

    /* renamed from: d */
    public static String m116215d(String str) {
        int length = str.length();
        char[] cArr = new char[length + 2];
        cArr[0] = 'i';
        cArr[1] = 's';
        char charAt = str.charAt(0);
        if (charAt >= 'a' && charAt <= 'z') {
            charAt = (char) (charAt - ' ');
        }
        cArr[2] = charAt;
        for (int i = 1; i < length; i++) {
            cArr[i + 2] = str.charAt(i);
        }
        return new String(cArr);
    }

    /* renamed from: e */
    public static String m116214e(String str) {
        int length = str.length();
        char[] cArr = new char[length + 3];
        cArr[0] = 's';
        cArr[1] = 'e';
        cArr[2] = 't';
        char charAt = str.charAt(0);
        if (charAt >= 'a' && charAt <= 'z') {
            charAt = (char) (charAt - ' ');
        }
        cArr[3] = charAt;
        for (int i = 1; i < length; i++) {
            cArr[i + 3] = str.charAt(i);
        }
        return new String(cArr);
    }

    /* renamed from: f */
    public static C36160Tl2[] m116213f(int i) {
        C36160Tl2[] c36160Tl2Arr = new C36160Tl2[i];
        for (int i2 = 0; i2 < i; i2++) {
            c36160Tl2Arr[i2] = new C36160Tl2();
        }
        return c36160Tl2Arr;
    }
}
