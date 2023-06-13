package p000;

import ch.qos.logback.core.CoreConstants;
/* renamed from: sW2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C48687sW2 {

    /* renamed from: a */
    public Class<?> f108896a;

    /* renamed from: b */
    public Class<?> f108897b;

    /* renamed from: c */
    public Class<?> f108898c;

    public C48687sW2() {
    }

    /* renamed from: a */
    public void m14120a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f108896a = cls;
        this.f108897b = cls2;
        this.f108898c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C48687sW2 c48687sW2 = (C48687sW2) obj;
        if (this.f108896a.equals(c48687sW2.f108896a) && this.f108897b.equals(c48687sW2.f108897b) && C47029pi6.m18922d(this.f108898c, c48687sW2.f108898c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = ((this.f108896a.hashCode() * 31) + this.f108897b.hashCode()) * 31;
        Class<?> cls = this.f108898c;
        if (cls != null) {
            i = cls.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f108896a + ", second=" + this.f108897b + CoreConstants.CURLY_RIGHT;
    }

    public C48687sW2(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        m14120a(cls, cls2, cls3);
    }
}
