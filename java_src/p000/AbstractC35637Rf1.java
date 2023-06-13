package p000;

import java.io.Serializable;
/* renamed from: Rf1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35637Rf1<T> {

    /* renamed from: Rf1$a */
    /* loaded from: classes6.dex */
    public static final class C7236a extends AbstractC35637Rf1<Object> implements Serializable {

        /* renamed from: b */
        public static final C7236a f32427b = new C7236a();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return f32427b;
        }

        @Override // p000.AbstractC35637Rf1
        /* renamed from: a */
        public boolean mo86468a(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // p000.AbstractC35637Rf1
        /* renamed from: b */
        public int mo86467b(Object obj) {
            return obj.hashCode();
        }
    }

    /* renamed from: Rf1$b */
    /* loaded from: classes6.dex */
    public static final class C7237b extends AbstractC35637Rf1<Object> implements Serializable {

        /* renamed from: b */
        public static final C7237b f32428b = new C7237b();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return f32428b;
        }

        @Override // p000.AbstractC35637Rf1
        /* renamed from: a */
        public boolean mo86468a(Object obj, Object obj2) {
            return false;
        }

        @Override // p000.AbstractC35637Rf1
        /* renamed from: b */
        public int mo86467b(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    /* renamed from: c */
    public static AbstractC35637Rf1<Object> m86472c() {
        return C7236a.f32427b;
    }

    /* renamed from: f */
    public static AbstractC35637Rf1<Object> m86469f() {
        return C7237b.f32428b;
    }

    /* renamed from: a */
    public abstract boolean mo86468a(T t, T t2);

    /* renamed from: b */
    public abstract int mo86467b(T t);

    /* renamed from: d */
    public final boolean m86471d(T t, T t2) {
        if (t == t2) {
            return true;
        }
        if (t == null || t2 == null) {
            return false;
        }
        return mo86468a(t, t2);
    }

    /* renamed from: e */
    public final int m86470e(T t) {
        if (t == null) {
            return 0;
        }
        return mo86467b(t);
    }
}
