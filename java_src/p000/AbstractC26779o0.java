package p000;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
/* renamed from: o0 */
/* loaded from: classes8.dex */
public abstract class AbstractC26779o0 implements InterfaceC38077ae6, Serializable, Comparable<InterfaceC38077ae6> {

    /* renamed from: c */
    public static final AbstractC26779o0 f101189c = new C26781b();

    /* renamed from: d */
    public static InterfaceC49089tB0 f101190d = InterfaceC49089tB0.m12921b();
    private static final long serialVersionUID = 5790242858468427131L;

    /* renamed from: b */
    public List<? extends InterfaceC38077ae6> f101191b;

    /* renamed from: o0$b */
    /* loaded from: classes8.dex */
    public static final class C26781b extends AbstractC26779o0 {

        /* renamed from: e */
        public static final Optional<Number> f101192e = Optional.of(1);
        private static final long serialVersionUID = -4460463244427587361L;

        private C26781b() {
        }

        @Override // p000.InterfaceC38077ae6, p000.InterfaceC44546lX2
        /* renamed from: D */
        public boolean mo22026D() {
            return true;
        }

        @Override // p000.AbstractC26779o0, p000.InterfaceC38077ae6
        /* renamed from: b */
        public /* bridge */ /* synthetic */ InterfaceC38077ae6 mo22025b() {
            return super.mo22025b();
        }

        @Override // p000.InterfaceC38077ae6
        /* renamed from: d */
        public boolean mo18701d() {
            return true;
        }

        @Override // p000.AbstractC26779o0
        /* renamed from: e */
        public boolean mo18700e(AbstractC26779o0 abstractC26779o0) {
            throw m22027k();
        }

        public boolean equals(Object obj) {
            return obj instanceof C26781b;
        }

        @Override // p000.AbstractC26779o0
        /* renamed from: g */
        public AbstractC26779o0 mo18699g() {
            throw m22027k();
        }

        @Override // p000.AbstractC26779o0
        /* renamed from: h */
        public AbstractC26779o0 mo18698h(AbstractC26779o0 abstractC26779o0) {
            throw m22027k();
        }

        public int hashCode() {
            return 0;
        }

        @Override // p000.AbstractC26779o0
        /* renamed from: i */
        public String mo18697i() {
            return null;
        }

        @Override // java.lang.Comparable
        /* renamed from: j */
        public int compareTo(InterfaceC38077ae6 interfaceC38077ae6) {
            return interfaceC38077ae6 instanceof C26781b ? 0 : -1;
        }

        /* renamed from: k */
        public final IllegalStateException m22027k() {
            return new IllegalStateException("code was reached, that is expected unreachable");
        }
    }

    /* renamed from: o0$c */
    /* loaded from: classes8.dex */
    public static final class C26782c extends AbstractC26779o0 {

        /* renamed from: g */
        public static final Comparator f101193g = new C36326Ud6();
        private static final long serialVersionUID = -123063827821728331L;

        /* renamed from: e */
        public final InterfaceC38077ae6 f101194e;

        /* renamed from: f */
        public final InterfaceC38077ae6 f101195f;

        public C26782c(InterfaceC38077ae6 interfaceC38077ae6, InterfaceC38077ae6 interfaceC38077ae62) {
            if (interfaceC38077ae6 != null && interfaceC38077ae62 != null) {
                this.f101194e = interfaceC38077ae6;
                this.f101195f = interfaceC38077ae62;
                return;
            }
            throw new IllegalArgumentException("Converters cannot be null");
        }

        @Override // p000.InterfaceC38077ae6, p000.InterfaceC44546lX2
        /* renamed from: D */
        public boolean mo22026D() {
            return this.f101194e.mo22026D() && this.f101195f.mo22026D();
        }

        @Override // p000.AbstractC26779o0, p000.InterfaceC38077ae6
        /* renamed from: b */
        public /* bridge */ /* synthetic */ InterfaceC38077ae6 mo22025b() {
            return super.mo22025b();
        }

        @Override // p000.InterfaceC38077ae6
        /* renamed from: d */
        public boolean mo18701d() {
            return false;
        }

        @Override // p000.AbstractC26779o0
        /* renamed from: e */
        public boolean mo18700e(AbstractC26779o0 abstractC26779o0) {
            return false;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C26782c)) {
                return false;
            }
            C26782c c26782c = (C26782c) obj;
            if (Objects.equals(this.f101194e, c26782c.f101194e) && Objects.equals(this.f101195f, c26782c.f101195f)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(this.f101194e, this.f101195f);
        }

        @Override // p000.AbstractC26779o0
        /* renamed from: i */
        public String mo18697i() {
            return String.format("%s", mo22031a().stream().map(new Function() { // from class: p0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    String obj2;
                    obj2 = ((InterfaceC38077ae6) obj).toString();
                    return obj2;
                }
            }).collect(Collectors.joining(" ○ ")));
        }

        @Override // java.lang.Comparable
        /* renamed from: k */
        public int compareTo(InterfaceC38077ae6 interfaceC38077ae6) {
            if (this == interfaceC38077ae6) {
                return 0;
            }
            if (interfaceC38077ae6 instanceof C26782c) {
                C26782c c26782c = (C26782c) interfaceC38077ae6;
                InterfaceC38077ae6 interfaceC38077ae62 = this.f101194e;
                InterfaceC38077ae6 interfaceC38077ae63 = c26782c.f101194e;
                Comparator comparator = f101193g;
                return Objects.compare(interfaceC38077ae62, interfaceC38077ae63, comparator) + Objects.compare(this.f101195f, c26782c.f101195f, comparator);
            }
            return -1;
        }

        /* renamed from: l */
        public List<? extends InterfaceC38077ae6> m22022l() {
            List<? extends InterfaceC38077ae6> mo22031a = this.f101194e.mo22031a();
            List<? extends InterfaceC38077ae6> mo22031a2 = this.f101195f.mo22031a();
            ArrayList arrayList = new ArrayList(mo22031a.size() + mo22031a2.size());
            arrayList.addAll(mo22031a);
            arrayList.addAll(mo22031a2);
            return arrayList;
        }

        /* renamed from: m */
        public InterfaceC38077ae6 m22021m() {
            return this.f101194e;
        }

        /* renamed from: n */
        public InterfaceC38077ae6 m22020n() {
            return this.f101195f;
        }

        @Override // p000.AbstractC26779o0
        /* renamed from: o */
        public C26782c mo18699g() {
            return new C26782c(this.f101195f.mo22025b(), this.f101194e.mo22025b());
        }
    }

    @Override // p000.InterfaceC38077ae6
    /* renamed from: a */
    public final List<? extends InterfaceC38077ae6> mo22031a() {
        List<? extends InterfaceC38077ae6> list = this.f101191b;
        if (list != null) {
            return list;
        }
        if (this instanceof C26782c) {
            List<? extends InterfaceC38077ae6> m22022l = ((C26782c) this).m22022l();
            this.f101191b = m22022l;
            return m22022l;
        }
        List<? extends InterfaceC38077ae6> singletonList = Collections.singletonList(this);
        this.f101191b = singletonList;
        return singletonList;
    }

    @Override // p000.InterfaceC38077ae6
    /* renamed from: c */
    public final InterfaceC38077ae6 mo22030c(InterfaceC38077ae6 interfaceC38077ae6) {
        Objects.requireNonNull(interfaceC38077ae6, "Cannot compose with converter that is null.");
        if (interfaceC38077ae6 instanceof AbstractC26779o0) {
            return f101190d.mo12922a(this, (AbstractC26779o0) interfaceC38077ae6, new BiPredicate() { // from class: m0
                @Override // java.util.function.BiPredicate
                public final boolean test(Object obj, Object obj2) {
                    return ((AbstractC26779o0) obj).mo18700e((AbstractC26779o0) obj2);
                }
            }, new BinaryOperator() { // from class: n0
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return ((AbstractC26779o0) obj).mo18698h((AbstractC26779o0) obj2);
                }
            });
        } else if (interfaceC38077ae6.mo18701d()) {
            return this;
        } else {
            if (mo18701d()) {
                return interfaceC38077ae6;
            }
            return new C26782c(this, interfaceC38077ae6);
        }
    }

    /* renamed from: e */
    public abstract boolean mo18700e(AbstractC26779o0 abstractC26779o0);

    @Override // p000.InterfaceC38077ae6
    /* renamed from: f */
    public final AbstractC26779o0 mo22025b() {
        if (mo18701d()) {
            return this;
        }
        return mo18699g();
    }

    /* renamed from: g */
    public abstract AbstractC26779o0 mo18699g();

    /* renamed from: h */
    public AbstractC26779o0 mo18698h(AbstractC26779o0 abstractC26779o0) {
        throw new IllegalStateException(String.format("Concrete UnitConverter '%s' does not implement reduce(...).", this));
    }

    /* renamed from: i */
    public abstract String mo18697i();

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        if (simpleName.endsWith("Converter")) {
            simpleName = simpleName.substring(0, simpleName.length() - 9);
        }
        if (mo18701d()) {
            return String.format("%s(IDENTITY)", simpleName);
        }
        String mo18697i = mo18697i();
        if (mo18697i != null && mo18697i.length() != 0) {
            return String.format("%s(%s)", simpleName, mo18697i);
        }
        return String.format("%s", simpleName);
    }
}
