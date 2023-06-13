package p000;

import java.util.NoSuchElementException;
/* renamed from: jy3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C43628jy3<T> {

    /* renamed from: a */
    public final T f93629a;

    private C43628jy3() {
        this.f93629a = null;
    }

    /* renamed from: a */
    public static <T> C43628jy3<T> m29585a() {
        return new C43628jy3<>();
    }

    /* renamed from: b */
    public static <T> C43628jy3<T> m29584b(T t) {
        return t == null ? m29585a() : m29581e(t);
    }

    /* renamed from: e */
    public static <T> C43628jy3<T> m29581e(T t) {
        return new C43628jy3<>(t);
    }

    /* renamed from: c */
    public T m29583c() {
        T t = this.f93629a;
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException("No value present");
    }

    /* renamed from: d */
    public boolean m29582d() {
        return this.f93629a != null;
    }

    public C43628jy3(T t) {
        if (t != null) {
            this.f93629a = t;
            return;
        }
        throw new NullPointerException("value for optional is empty.");
    }
}
