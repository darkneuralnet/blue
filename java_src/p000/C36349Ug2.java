package p000;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* renamed from: Ug2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C36349Ug2 {

    /* renamed from: a */
    public static final C8342a f37731a = new C8342a();

    /* renamed from: Ug2$a */
    /* loaded from: classes6.dex */
    public static class C8342a implements InterfaceC36150Tk1 {
        @Override // p000.InterfaceC36150Tk1
        /* renamed from: a */
        public boolean mo81192a(Field field, Method method) {
            InterfaceC33091Gi2 interfaceC33091Gi2 = (InterfaceC33091Gi2) method.getAnnotation(InterfaceC33091Gi2.class);
            if (interfaceC33091Gi2 != null && interfaceC33091Gi2.value()) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public static String m81194a(String str) {
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

    /* renamed from: b */
    public static String m81193b(String str) {
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
}
