package p000;

import java.lang.annotation.Annotation;
/* renamed from: yb4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C52292yb4<T> {

    /* renamed from: a */
    public final Class<? extends Annotation> f119800a;

    /* renamed from: b */
    public final Class<T> f119801b;

    /* renamed from: yb4$a */
    /* loaded from: classes6.dex */
    public @interface InterfaceC30633a {
    }

    public C52292yb4(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f119800a = cls;
        this.f119801b = cls2;
    }

    /* renamed from: a */
    public static <T> C52292yb4<T> m3203a(Class<? extends Annotation> cls, Class<T> cls2) {
        return new C52292yb4<>(cls, cls2);
    }

    /* renamed from: b */
    public static <T> C52292yb4<T> m3202b(Class<T> cls) {
        return new C52292yb4<>(InterfaceC30633a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C52292yb4.class != obj.getClass()) {
            return false;
        }
        C52292yb4 c52292yb4 = (C52292yb4) obj;
        if (!this.f119801b.equals(c52292yb4.f119801b)) {
            return false;
        }
        return this.f119800a.equals(c52292yb4.f119800a);
    }

    public int hashCode() {
        return (this.f119801b.hashCode() * 31) + this.f119800a.hashCode();
    }

    public String toString() {
        if (this.f119800a == InterfaceC30633a.class) {
            return this.f119801b.getName();
        }
        return "@" + this.f119800a.getName() + " " + this.f119801b.getName();
    }
}
