package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import com.fasterxml.jackson.core.JsonPointer;
import java.lang.reflect.Method;
import java.util.HashMap;
/* renamed from: fG */
/* loaded from: classes6.dex */
public class C20342fG {

    /* renamed from: j */
    public static String f79764j = C31628Ab6.m115477g(AbstractC19998eG.class);

    /* renamed from: a */
    public final Class<?> f79765a;

    /* renamed from: b */
    public final C29358v2[] f79766b;

    /* renamed from: c */
    public final C47283q81 f79767c;

    /* renamed from: d */
    public final String f79768d;

    /* renamed from: e */
    public final String f79769e;

    /* renamed from: f */
    public final String f79770f;

    /* renamed from: g */
    public final String f79771g;

    /* renamed from: h */
    public final HashMap<Class<?>, Method> f79772h = new HashMap<>();

    /* renamed from: i */
    public Class<? extends Exception> f79773i = NoSuchFieldException.class;

    public C20342fG(Class<?> cls, C29358v2[] c29358v2Arr, C47283q81 c47283q81) {
        this.f79765a = cls;
        this.f79766b = c29358v2Arr;
        this.f79767c = c47283q81;
        String name = cls.getName();
        this.f79768d = name;
        if (name.startsWith("java.")) {
            this.f79769e = "com.nimbusds.jose.shaded.asm." + name + "AccAccess";
        } else {
            this.f79769e = name.concat("AccAccess");
        }
        this.f79770f = this.f79769e.replace(CoreConstants.DOT, JsonPointer.SEPARATOR);
        this.f79771g = name.replace(CoreConstants.DOT, JsonPointer.SEPARATOR);
    }

    /* renamed from: a */
    public void m41643a(Class<?> cls) {
        Method[] methods;
        if (cls == null) {
            return;
        }
        for (Method method : cls.getMethods()) {
            if ((method.getModifiers() & 8) != 0) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0].equals(Object.class)) {
                    Class<?> returnType = method.getReturnType();
                    if (!returnType.equals(Void.TYPE)) {
                        this.f79772h.put(returnType, method);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public void m41642b(Iterable<Class<?>> iterable) {
        if (iterable == null) {
            return;
        }
        for (Class<?> cls : iterable) {
            m41643a(cls);
        }
    }

    /* renamed from: c */
    public Class<?> m41641c() {
        boolean z;
        C29358v2[] c29358v2Arr;
        Method method;
        Method method2;
        int i;
        Method method3;
        C29358v2[] c29358v2Arr2;
        C29358v2[] c29358v2Arr3;
        C34970Oj0 c34970Oj0 = new C34970Oj0(1);
        if (this.f79766b.length > 10) {
            z = true;
        } else {
            z = false;
        }
        c34970Oj0.mo91630a(50, 33, this.f79770f, "Lnet/minidev/asm/BeansAccess<L" + this.f79771g + ";>;", f79764j, null);
        YT2 mo91624g = c34970Oj0.mo91624g(1, "<init>", "()V", null, null);
        mo91624g.mo73044e();
        int i2 = 25;
        mo91624g.mo73067E(25, 0);
        mo91624g.mo73027v(183, f79764j, "<init>", "()V", false);
        mo91624g.mo73039j(177);
        mo91624g.mo73028u(1, 1);
        mo91624g.mo73043f();
        YT2 mo91624g2 = c34970Oj0.mo91624g(1, "set", "(Ljava/lang/Object;ILjava/lang/Object;)V", null, null);
        mo91624g2.mo73044e();
        C29358v2[] c29358v2Arr4 = this.f79766b;
        if (c29358v2Arr4.length != 0) {
            if (c29358v2Arr4.length > 14) {
                mo91624g2.mo73067E(21, 2);
                C36160Tl2[] m116213f = C0000A.m116213f(this.f79766b.length);
                C36160Tl2 c36160Tl2 = new C36160Tl2();
                mo91624g2.mo73023z(0, m116213f.length - 1, c36160Tl2, m116213f);
                C29358v2[] c29358v2Arr5 = this.f79766b;
                int length = c29358v2Arr5.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    C29358v2 c29358v2 = c29358v2Arr5[i3];
                    int i5 = i4 + 1;
                    mo91624g2.mo73034o(m116213f[i4]);
                    if (!c29358v2.m9353h()) {
                        mo91624g2.mo73039j(177);
                    } else {
                        m41639e(mo91624g2, c29358v2);
                    }
                    i3++;
                    i4 = i5;
                }
                mo91624g2.mo73034o(c36160Tl2);
            } else {
                C36160Tl2[] m116213f2 = C0000A.m116213f(c29358v2Arr4.length);
                int i6 = 0;
                for (C29358v2 c29358v22 : this.f79766b) {
                    m41640d(mo91624g2, 2, i6, m116213f2[i6]);
                    m41639e(mo91624g2, c29358v22);
                    mo91624g2.mo73034o(m116213f2[i6]);
                    mo91624g2.mo73041h(3, 0, null, 0, null);
                    i6++;
                }
            }
        }
        Class<? extends Exception> cls = this.f79773i;
        if (cls != null) {
            m41638f(mo91624g2, cls);
        } else {
            mo91624g2.mo73039j(177);
        }
        mo91624g2.mo73028u(0, 0);
        mo91624g2.mo73043f();
        YT2 mo91624g3 = c34970Oj0.mo91624g(1, "get", "(Ljava/lang/Object;I)Ljava/lang/Object;", null, null);
        mo91624g3.mo73044e();
        C29358v2[] c29358v2Arr6 = this.f79766b;
        int i7 = 192;
        if (c29358v2Arr6.length == 0) {
            mo91624g3.mo73041h(3, 0, null, 0, null);
        } else if (c29358v2Arr6.length > 14) {
            mo91624g3.mo73067E(21, 2);
            C36160Tl2[] m116213f3 = C0000A.m116213f(this.f79766b.length);
            C36160Tl2 c36160Tl22 = new C36160Tl2();
            mo91624g3.mo73023z(0, m116213f3.length - 1, c36160Tl22, m116213f3);
            C29358v2[] c29358v2Arr7 = this.f79766b;
            int length2 = c29358v2Arr7.length;
            int i8 = 0;
            int i9 = 0;
            while (i8 < length2) {
                C29358v2 c29358v23 = c29358v2Arr7[i8];
                int i10 = i9 + 1;
                mo91624g3.mo73034o(m116213f3[i9]);
                mo91624g3.mo73041h(3, 0, null, 0, null);
                if (!c29358v23.m9355f()) {
                    mo91624g3.mo73039j(1);
                    mo91624g3.mo73039j(SyslogConstants.LOG_LOCAL6);
                } else {
                    mo91624g3.mo73067E(i2, 1);
                    mo91624g3.mo73068D(i7, this.f79771g);
                    C31628Ab6 m115471m = C31628Ab6.m115471m(c29358v23.m9358c());
                    if (!c29358v23.m9356e() && (method2 = c29358v23.f113360c) != null) {
                        mo91624g3.mo73027v(182, this.f79771g, c29358v23.f113360c.getName(), C31628Ab6.m115476h(method2), false);
                    } else {
                        mo91624g3.mo73042g(180, this.f79771g, c29358v23.m9359b(), m115471m.m115480d());
                    }
                    C0000A.m116218a(mo91624g3, m115471m);
                    mo91624g3.mo73039j(SyslogConstants.LOG_LOCAL6);
                }
                i8++;
                i9 = i10;
                i7 = 192;
                i2 = 25;
            }
            mo91624g3.mo73034o(c36160Tl22);
            mo91624g3.mo73041h(3, 0, null, 0, null);
        } else {
            C36160Tl2[] m116213f4 = C0000A.m116213f(c29358v2Arr6.length);
            int i11 = 0;
            for (C29358v2 c29358v24 : this.f79766b) {
                m41640d(mo91624g3, 2, i11, m116213f4[i11]);
                mo91624g3.mo73067E(25, 1);
                mo91624g3.mo73068D(192, this.f79771g);
                C31628Ab6 m115471m2 = C31628Ab6.m115471m(c29358v24.m9358c());
                if (!c29358v24.m9356e() && (method = c29358v24.f113360c) != null) {
                    if (method != null) {
                        mo91624g3.mo73027v(182, this.f79771g, c29358v24.f113360c.getName(), C31628Ab6.m115476h(method), false);
                    } else {
                        throw new RuntimeException("no Getter for field " + c29358v24.m9359b() + " in class " + this.f79768d);
                    }
                } else {
                    mo91624g3.mo73042g(180, this.f79771g, c29358v24.m9359b(), m115471m2.m115480d());
                }
                C0000A.m116218a(mo91624g3, m115471m2);
                mo91624g3.mo73039j(SyslogConstants.LOG_LOCAL6);
                mo91624g3.mo73034o(m116213f4[i11]);
                mo91624g3.mo73041h(3, 0, null, 0, null);
                i11++;
            }
        }
        Class<? extends Exception> cls2 = this.f79773i;
        if (cls2 != null) {
            m41638f(mo91624g3, cls2);
        } else {
            mo91624g3.mo73039j(1);
            mo91624g3.mo73039j(SyslogConstants.LOG_LOCAL6);
        }
        mo91624g3.mo73028u(0, 0);
        mo91624g3.mo73043f();
        int i12 = 153;
        if (!z) {
            i = 192;
            YT2 mo91624g4 = c34970Oj0.mo91624g(1, "set", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V", null, null);
            mo91624g4.mo73044e();
            C36160Tl2[] m116213f5 = C0000A.m116213f(this.f79766b.length);
            int i13 = 0;
            for (C29358v2 c29358v25 : this.f79766b) {
                mo91624g4.mo73067E(25, 2);
                mo91624g4.mo73033p(c29358v25.f113364g);
                mo91624g4.mo73027v(182, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
                mo91624g4.mo73035n(153, m116213f5[i13]);
                m41639e(mo91624g4, c29358v25);
                mo91624g4.mo73034o(m116213f5[i13]);
                mo91624g4.mo73041h(3, 0, null, 0, null);
                i13++;
            }
            Class<? extends Exception> cls3 = this.f79773i;
            if (cls3 != null) {
                m41637g(mo91624g4, cls3);
            } else {
                mo91624g4.mo73039j(177);
            }
            mo91624g4.mo73028u(0, 0);
            mo91624g4.mo73043f();
        } else {
            i = 192;
        }
        if (!z) {
            YT2 mo91624g5 = c34970Oj0.mo91624g(1, "get", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", null, null);
            mo91624g5.mo73044e();
            C36160Tl2[] m116213f6 = C0000A.m116213f(this.f79766b.length);
            C29358v2[] c29358v2Arr8 = this.f79766b;
            int length3 = c29358v2Arr8.length;
            int i14 = 0;
            int i15 = 0;
            while (i14 < length3) {
                C29358v2 c29358v26 = c29358v2Arr8[i14];
                mo91624g5.mo73067E(25, 2);
                mo91624g5.mo73033p(c29358v26.f113364g);
                mo91624g5.mo73027v(182, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
                mo91624g5.mo73035n(i12, m116213f6[i15]);
                mo91624g5.mo73067E(25, 1);
                mo91624g5.mo73068D(i, this.f79771g);
                C31628Ab6 m115471m3 = C31628Ab6.m115471m(c29358v26.m9358c());
                if (!c29358v26.m9356e() && (method3 = c29358v26.f113360c) != null) {
                    mo91624g5.mo73027v(182, this.f79771g, c29358v26.f113360c.getName(), C31628Ab6.m115476h(method3), false);
                } else {
                    mo91624g5.mo73042g(180, this.f79771g, c29358v26.m9359b(), m115471m3.m115480d());
                }
                C0000A.m116218a(mo91624g5, m115471m3);
                mo91624g5.mo73039j(SyslogConstants.LOG_LOCAL6);
                mo91624g5.mo73034o(m116213f6[i15]);
                mo91624g5.mo73041h(3, 0, null, 0, null);
                i15++;
                i14++;
                i12 = 153;
            }
            Class<? extends Exception> cls4 = this.f79773i;
            if (cls4 != null) {
                m41637g(mo91624g5, cls4);
            } else {
                mo91624g5.mo73039j(1);
                mo91624g5.mo73039j(SyslogConstants.LOG_LOCAL6);
            }
            mo91624g5.mo73028u(0, 0);
            mo91624g5.mo73043f();
        }
        YT2 mo91624g6 = c34970Oj0.mo91624g(1, "newInstance", "()Ljava/lang/Object;", null, null);
        mo91624g6.mo73044e();
        mo91624g6.mo73068D(187, this.f79771g);
        mo91624g6.mo73039j(89);
        mo91624g6.mo73027v(183, this.f79771g, "<init>", "()V", false);
        mo91624g6.mo73039j(SyslogConstants.LOG_LOCAL6);
        mo91624g6.mo73028u(2, 1);
        mo91624g6.mo73043f();
        c34970Oj0.mo91627d();
        return this.f79767c.m18077a(this.f79769e, c34970Oj0.m91611t());
    }

    /* renamed from: d */
    public final void m41640d(YT2 yt2, int i, int i2, C36160Tl2 c36160Tl2) {
        yt2.mo73067E(21, i);
        if (i2 == 0) {
            yt2.mo73035n(154, c36160Tl2);
        } else if (i2 == 1) {
            yt2.mo73039j(4);
            yt2.mo73035n(SyslogConstants.LOG_LOCAL4, c36160Tl2);
        } else if (i2 == 2) {
            yt2.mo73039j(5);
            yt2.mo73035n(SyslogConstants.LOG_LOCAL4, c36160Tl2);
        } else if (i2 == 3) {
            yt2.mo73039j(6);
            yt2.mo73035n(SyslogConstants.LOG_LOCAL4, c36160Tl2);
        } else if (i2 == 4) {
            yt2.mo73039j(7);
            yt2.mo73035n(SyslogConstants.LOG_LOCAL4, c36160Tl2);
        } else if (i2 == 5) {
            yt2.mo73039j(8);
            yt2.mo73035n(SyslogConstants.LOG_LOCAL4, c36160Tl2);
        } else if (i2 >= 6) {
            yt2.mo73037l(16, i2);
            yt2.mo73035n(SyslogConstants.LOG_LOCAL4, c36160Tl2);
        } else {
            throw new RuntimeException("non supported negative values");
        }
    }

    /* renamed from: e */
    public final void m41639e(YT2 yt2, C29358v2 c29358v2) {
        Method method;
        yt2.mo73067E(25, 1);
        yt2.mo73068D(192, this.f79771g);
        yt2.mo73067E(25, 3);
        C31628Ab6 m115471m = C31628Ab6.m115471m(c29358v2.m9358c());
        Class<?> m9358c = c29358v2.m9358c();
        String m115477g = C31628Ab6.m115477g(m9358c);
        Method method2 = this.f79772h.get(m9358c);
        if (method2 != null) {
            yt2.mo73027v(SyslogConstants.LOG_LOCAL7, C31628Ab6.m115477g(method2.getDeclaringClass()), method2.getName(), C31628Ab6.m115476h(method2), false);
        } else if (c29358v2.m9357d()) {
            C36160Tl2 c36160Tl2 = new C36160Tl2();
            yt2.mo73035n(198, c36160Tl2);
            yt2.mo73067E(25, 3);
            yt2.mo73027v(182, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
            yt2.mo73027v(SyslogConstants.LOG_LOCAL7, m115477g, CoreConstants.VALUE_OF, "(Ljava/lang/String;)L" + m115477g + ";", false);
            yt2.mo73067E(58, 3);
            yt2.mo73034o(c36160Tl2);
            yt2.mo73041h(3, 0, null, 0, null);
            yt2.mo73067E(25, 1);
            yt2.mo73068D(192, this.f79771g);
            yt2.mo73067E(25, 3);
            yt2.mo73068D(192, m115477g);
        } else if (m9358c.equals(String.class)) {
            C36160Tl2 c36160Tl22 = new C36160Tl2();
            yt2.mo73035n(198, c36160Tl22);
            yt2.mo73067E(25, 3);
            yt2.mo73027v(182, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
            yt2.mo73067E(58, 3);
            yt2.mo73034o(c36160Tl22);
            yt2.mo73041h(3, 0, null, 0, null);
            yt2.mo73067E(25, 1);
            yt2.mo73068D(192, this.f79771g);
            yt2.mo73067E(25, 3);
            yt2.mo73068D(192, m115477g);
        } else {
            yt2.mo73068D(192, m115477g);
        }
        if (!c29358v2.m9356e() && (method = c29358v2.f113359b) != null) {
            yt2.mo73027v(182, this.f79771g, c29358v2.f113359b.getName(), C31628Ab6.m115476h(method), false);
        } else {
            yt2.mo73042g(181, this.f79771g, c29358v2.m9359b(), m115471m.m115480d());
        }
        yt2.mo73039j(177);
    }

    /* renamed from: f */
    public final void m41638f(YT2 yt2, Class<?> cls) {
        String m115477g = C31628Ab6.m115477g(cls);
        yt2.mo73068D(187, m115477g);
        yt2.mo73039j(89);
        yt2.mo73033p("mapping " + this.f79768d + " failed to map field:");
        yt2.mo73067E(21, 2);
        yt2.mo73027v(SyslogConstants.LOG_LOCAL7, "java/lang/Integer", "toString", "(I)Ljava/lang/String;", false);
        yt2.mo73027v(182, "java/lang/String", "concat", "(Ljava/lang/String;)Ljava/lang/String;", false);
        yt2.mo73027v(183, m115477g, "<init>", "(Ljava/lang/String;)V", false);
        yt2.mo73039j(191);
    }

    /* renamed from: g */
    public final void m41637g(YT2 yt2, Class<?> cls) {
        String m115477g = C31628Ab6.m115477g(cls);
        yt2.mo73068D(187, m115477g);
        yt2.mo73039j(89);
        yt2.mo73033p("mapping " + this.f79768d + " failed to map field:");
        yt2.mo73067E(25, 2);
        yt2.mo73027v(182, "java/lang/String", "concat", "(Ljava/lang/String;)Ljava/lang/String;", false);
        yt2.mo73027v(183, m115477g, "<init>", "(Ljava/lang/String;)V", false);
        yt2.mo73039j(191);
    }
}
