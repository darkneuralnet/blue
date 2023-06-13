package p000;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
/* renamed from: JZ3 */
/* loaded from: classes6.dex */
public final class JZ3 {

    /* renamed from: JZ3$b */
    /* loaded from: classes6.dex */
    public static class C4151b<T> implements IZ3<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b */
        public final List<? extends IZ3<? super T>> f17828b;

        @Override // p000.IZ3
        public boolean apply(T t) {
            for (int i = 0; i < this.f17828b.size(); i++) {
                if (!this.f17828b.get(i).apply(t)) {
                    return false;
                }
            }
            return true;
        }

        @Override // p000.IZ3
        public boolean equals(Object obj) {
            if (obj instanceof C4151b) {
                return this.f17828b.equals(((C4151b) obj).f17828b);
            }
            return false;
        }

        public int hashCode() {
            return this.f17828b.hashCode() + 306654252;
        }

        public String toString() {
            return JZ3.m100193j("and", this.f17828b);
        }

        public C4151b(List<? extends IZ3<? super T>> list) {
            this.f17828b = list;
        }
    }

    /* renamed from: JZ3$c */
    /* loaded from: classes6.dex */
    public static class C4152c<A, B> implements IZ3<A>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b */
        public final IZ3<B> f17829b;

        /* renamed from: c */
        public final InterfaceC50859wA1<A, ? extends B> f17830c;

        @Override // p000.IZ3
        public boolean apply(A a) {
            return this.f17829b.apply(this.f17830c.apply(a));
        }

        @Override // p000.IZ3
        public boolean equals(Object obj) {
            if (!(obj instanceof C4152c)) {
                return false;
            }
            C4152c c4152c = (C4152c) obj;
            if (!this.f17830c.equals(c4152c.f17830c) || !this.f17829b.equals(c4152c.f17829b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f17830c.hashCode() ^ this.f17829b.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f17829b);
            String valueOf2 = String.valueOf(this.f17830c);
            StringBuilder sb = new StringBuilder(valueOf.length() + 2 + valueOf2.length());
            sb.append(valueOf);
            sb.append("(");
            sb.append(valueOf2);
            sb.append(")");
            return sb.toString();
        }

        public C4152c(IZ3<B> iz3, InterfaceC50859wA1<A, ? extends B> interfaceC50859wA1) {
            this.f17829b = (IZ3) EZ3.m108801n(iz3);
            this.f17830c = (InterfaceC50859wA1) EZ3.m108801n(interfaceC50859wA1);
        }
    }

    /* renamed from: JZ3$d */
    /* loaded from: classes6.dex */
    public static class C4153d<T> implements IZ3<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b */
        public final Collection<?> f17831b;

        @Override // p000.IZ3
        public boolean apply(T t) {
            try {
                return this.f17831b.contains(t);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // p000.IZ3
        public boolean equals(Object obj) {
            if (obj instanceof C4153d) {
                return this.f17831b.equals(((C4153d) obj).f17831b);
            }
            return false;
        }

        public int hashCode() {
            return this.f17831b.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f17831b);
            StringBuilder sb = new StringBuilder(valueOf.length() + 15);
            sb.append("Predicates.in(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }

        public C4153d(Collection<?> collection) {
            this.f17831b = (Collection) EZ3.m108801n(collection);
        }
    }

    /* renamed from: JZ3$e */
    /* loaded from: classes6.dex */
    public static class C4154e<T> implements IZ3<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b */
        public final Class<?> f17832b;

        @Override // p000.IZ3
        public boolean apply(T t) {
            return this.f17832b.isInstance(t);
        }

        @Override // p000.IZ3
        public boolean equals(Object obj) {
            if (!(obj instanceof C4154e) || this.f17832b != ((C4154e) obj).f17832b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f17832b.hashCode();
        }

        public String toString() {
            String name = this.f17832b.getName();
            StringBuilder sb = new StringBuilder(name.length() + 23);
            sb.append("Predicates.instanceOf(");
            sb.append(name);
            sb.append(")");
            return sb.toString();
        }

        public C4154e(Class<?> cls) {
            this.f17832b = (Class) EZ3.m108801n(cls);
        }
    }

    /* renamed from: JZ3$f */
    /* loaded from: classes6.dex */
    public static class C4155f implements IZ3<Object>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b */
        public final Object f17833b;

        /* renamed from: a */
        public <T> IZ3<T> m100192a() {
            return this;
        }

        @Override // p000.IZ3
        public boolean apply(Object obj) {
            return this.f17833b.equals(obj);
        }

        @Override // p000.IZ3
        public boolean equals(Object obj) {
            if (obj instanceof C4155f) {
                return this.f17833b.equals(((C4155f) obj).f17833b);
            }
            return false;
        }

        public int hashCode() {
            return this.f17833b.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f17833b);
            StringBuilder sb = new StringBuilder(valueOf.length() + 20);
            sb.append("Predicates.equalTo(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }

        public C4155f(Object obj) {
            this.f17833b = obj;
        }
    }

    /* renamed from: JZ3$g */
    /* loaded from: classes6.dex */
    public static class C4156g<T> implements IZ3<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b */
        public final IZ3<T> f17834b;

        public C4156g(IZ3<T> iz3) {
            this.f17834b = (IZ3) EZ3.m108801n(iz3);
        }

        @Override // p000.IZ3
        public boolean apply(T t) {
            return !this.f17834b.apply(t);
        }

        @Override // p000.IZ3
        public boolean equals(Object obj) {
            if (obj instanceof C4156g) {
                return this.f17834b.equals(((C4156g) obj).f17834b);
            }
            return false;
        }

        public int hashCode() {
            return ~this.f17834b.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f17834b);
            StringBuilder sb = new StringBuilder(valueOf.length() + 16);
            sb.append("Predicates.not(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: JZ3$h */
    /* loaded from: classes6.dex */
    public static abstract class EnumC4157h implements IZ3<Object> {

        /* renamed from: b */
        public static final EnumC4157h f17835b = new C4158a("ALWAYS_TRUE", 0);

        /* renamed from: c */
        public static final EnumC4157h f17836c = new C4159b("ALWAYS_FALSE", 1);

        /* renamed from: d */
        public static final EnumC4157h f17837d = new C4160c("IS_NULL", 2);

        /* renamed from: e */
        public static final EnumC4157h f17838e = new C4161d("NOT_NULL", 3);

        /* renamed from: f */
        public static final /* synthetic */ EnumC4157h[] f17839f = m100191a();

        /* renamed from: JZ3$h$a */
        /* loaded from: classes6.dex */
        public enum C4158a extends EnumC4157h {
            public C4158a(String str, int i) {
                super(str, i);
            }

            @Override // p000.IZ3
            public boolean apply(Object obj) {
                return true;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysTrue()";
            }
        }

        /* renamed from: JZ3$h$b */
        /* loaded from: classes6.dex */
        public enum C4159b extends EnumC4157h {
            public C4159b(String str, int i) {
                super(str, i);
            }

            @Override // p000.IZ3
            public boolean apply(Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysFalse()";
            }
        }

        /* renamed from: JZ3$h$c */
        /* loaded from: classes6.dex */
        public enum C4160c extends EnumC4157h {
            public C4160c(String str, int i) {
                super(str, i);
            }

            @Override // p000.IZ3
            public boolean apply(Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.isNull()";
            }
        }

        /* renamed from: JZ3$h$d */
        /* loaded from: classes6.dex */
        public enum C4161d extends EnumC4157h {
            public C4161d(String str, int i) {
                super(str, i);
            }

            @Override // p000.IZ3
            public boolean apply(Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.notNull()";
            }
        }

        public EnumC4157h(String str, int i) {
        }

        /* renamed from: a */
        public static /* synthetic */ EnumC4157h[] m100191a() {
            return new EnumC4157h[]{f17835b, f17836c, f17837d, f17838e};
        }

        public static EnumC4157h valueOf(String str) {
            return (EnumC4157h) Enum.valueOf(EnumC4157h.class, str);
        }

        public static EnumC4157h[] values() {
            return (EnumC4157h[]) f17839f.clone();
        }

        /* renamed from: b */
        public <T> IZ3<T> m100190b() {
            return this;
        }
    }

    private JZ3() {
    }

    /* renamed from: b */
    public static <T> IZ3<T> m100201b(IZ3<? super T> iz3, IZ3<? super T> iz32) {
        return new C4151b(m100200c((IZ3) EZ3.m108801n(iz3), (IZ3) EZ3.m108801n(iz32)));
    }

    /* renamed from: c */
    public static <T> List<IZ3<? super T>> m100200c(IZ3<? super T> iz3, IZ3<? super T> iz32) {
        return Arrays.asList(iz3, iz32);
    }

    /* renamed from: d */
    public static <A, B> IZ3<A> m100199d(IZ3<B> iz3, InterfaceC50859wA1<A, ? extends B> interfaceC50859wA1) {
        return new C4152c(iz3, interfaceC50859wA1);
    }

    /* renamed from: e */
    public static <T> IZ3<T> m100198e(T t) {
        if (t == null) {
            return m100195h();
        }
        return new C4155f(t).m100192a();
    }

    /* renamed from: f */
    public static <T> IZ3<T> m100197f(Collection<? extends T> collection) {
        return new C4153d(collection);
    }

    /* renamed from: g */
    public static <T> IZ3<T> m100196g(Class<?> cls) {
        return new C4154e(cls);
    }

    /* renamed from: h */
    public static <T> IZ3<T> m100195h() {
        return EnumC4157h.f17837d.m100190b();
    }

    /* renamed from: i */
    public static <T> IZ3<T> m100194i(IZ3<T> iz3) {
        return new C4156g(iz3);
    }

    /* renamed from: j */
    public static String m100193j(String str, Iterable<?> iterable) {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append(str);
        sb.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
        boolean z = true;
        for (Object obj : iterable) {
            if (!z) {
                sb.append(CoreConstants.COMMA_CHAR);
            }
            sb.append(obj);
            z = false;
        }
        sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb.toString();
    }
}
