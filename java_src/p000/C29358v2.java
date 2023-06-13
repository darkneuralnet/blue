package p000;

import ch.qos.logback.core.net.SyslogConstants;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
/* renamed from: v2 */
/* loaded from: classes6.dex */
public class C29358v2 {

    /* renamed from: a */
    public Field f113358a;

    /* renamed from: b */
    public Method f113359b;

    /* renamed from: c */
    public Method f113360c;

    /* renamed from: d */
    public int f113361d;

    /* renamed from: e */
    public Class<?> f113362e;

    /* renamed from: f */
    public Type f113363f;

    /* renamed from: g */
    public String f113364g;

    public C29358v2(Class<?> cls, Field field, InterfaceC36150Tk1 interfaceC36150Tk1) {
        String m116216c;
        this.f113364g = field.getName();
        int modifiers = field.getModifiers();
        if ((modifiers & SyslogConstants.LOG_LOCAL1) > 0) {
            return;
        }
        if ((modifiers & 1) > 0) {
            this.f113358a = field;
        }
        try {
            this.f113359b = cls.getDeclaredMethod(C0000A.m116214e(field.getName()), field.getType());
        } catch (Exception unused) {
        }
        boolean equals = field.getType().equals(Boolean.TYPE);
        if (equals) {
            m116216c = C0000A.m116215d(field.getName());
        } else {
            m116216c = C0000A.m116216c(field.getName());
        }
        try {
            this.f113360c = cls.getDeclaredMethod(m116216c, new Class[0]);
        } catch (Exception unused2) {
        }
        if (this.f113360c == null && equals) {
            try {
                this.f113360c = cls.getDeclaredMethod(C0000A.m116216c(field.getName()), new Class[0]);
            } catch (Exception unused3) {
            }
        }
        if (this.f113358a == null && this.f113360c == null && this.f113359b == null) {
            return;
        }
        Method method = this.f113360c;
        if (method != null && !interfaceC36150Tk1.mo81192a(field, method)) {
            this.f113360c = null;
        }
        Method method2 = this.f113359b;
        if (method2 != null && !interfaceC36150Tk1.mo81192a(field, method2)) {
            this.f113359b = null;
        }
        if (this.f113360c == null && this.f113359b == null && this.f113358a == null) {
            return;
        }
        this.f113362e = field.getType();
        this.f113363f = field.getGenericType();
    }

    /* renamed from: a */
    public int m9360a() {
        return this.f113361d;
    }

    /* renamed from: b */
    public String m9359b() {
        return this.f113364g;
    }

    /* renamed from: c */
    public Class<?> m9358c() {
        return this.f113362e;
    }

    /* renamed from: d */
    public boolean m9357d() {
        return this.f113362e.isEnum();
    }

    /* renamed from: e */
    public boolean m9356e() {
        return this.f113359b == null && this.f113360c == null;
    }

    /* renamed from: f */
    public boolean m9355f() {
        return (this.f113358a == null && this.f113360c == null) ? false : true;
    }

    /* renamed from: g */
    public boolean m9354g() {
        return (this.f113358a == null && this.f113360c == null && this.f113359b == null) ? false : true;
    }

    /* renamed from: h */
    public boolean m9353h() {
        return (this.f113358a == null && this.f113360c == null) ? false : true;
    }
}
