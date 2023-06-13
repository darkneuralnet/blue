package io.reactivex;

import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.util.EnumC24479n;
/* renamed from: io.reactivex.w */
/* loaded from: classes6.dex */
public final class C24576w<T> {

    /* renamed from: b */
    public static final C24576w<Object> f91286b = new C24576w<>(null);

    /* renamed from: a */
    public final Object f91287a;

    public C24576w(Object obj) {
        this.f91287a = obj;
    }

    /* renamed from: a */
    public static <T> C24576w<T> m31863a() {
        return (C24576w<T>) f91286b;
    }

    /* renamed from: b */
    public static <T> C24576w<T> m31862b(Throwable th) {
        C23544b.m32923e(th, "error is null");
        return new C24576w<>(EnumC24479n.m32241g(th));
    }

    /* renamed from: c */
    public static <T> C24576w<T> m31861c(T t) {
        C23544b.m32923e(t, "value is null");
        return new C24576w<>(t);
    }

    /* renamed from: d */
    public Throwable m31860d() {
        Object obj = this.f91287a;
        if (EnumC24479n.m32237k(obj)) {
            return EnumC24479n.m32240h(obj);
        }
        return null;
    }

    /* renamed from: e */
    public T m31859e() {
        Object obj = this.f91287a;
        if (obj != null && !EnumC24479n.m32237k(obj)) {
            return (T) this.f91287a;
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C24576w) {
            return C23544b.m32925c(this.f91287a, ((C24576w) obj).f91287a);
        }
        return false;
    }

    /* renamed from: f */
    public boolean m31858f() {
        return this.f91287a == null;
    }

    /* renamed from: g */
    public boolean m31857g() {
        return EnumC24479n.m32237k(this.f91287a);
    }

    /* renamed from: h */
    public boolean m31856h() {
        Object obj = this.f91287a;
        if (obj != null && !EnumC24479n.m32237k(obj)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f91287a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public String toString() {
        Object obj = this.f91287a;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (EnumC24479n.m32237k(obj)) {
            return "OnErrorNotification[" + EnumC24479n.m32240h(obj) + "]";
        }
        return "OnNextNotification[" + this.f91287a + "]";
    }
}
