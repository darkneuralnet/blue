package p000;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import p000.AbstractC26779o0;
import p000.C47736qu0;
/* renamed from: ou0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46550ou0 {

    /* renamed from: a */
    public final BiPredicate<AbstractC26779o0, AbstractC26779o0> f102741a;

    /* renamed from: b */
    public final BiPredicate<AbstractC26779o0, AbstractC26779o0> f102742b;

    /* renamed from: c */
    public final BiPredicate<AbstractC26779o0, AbstractC26779o0> f102743c;

    /* renamed from: d */
    public final BinaryOperator<AbstractC26779o0> f102744d;

    /* renamed from: e */
    public AbstractC26779o0[] f102745e;

    public C46550ou0(BiPredicate<AbstractC26779o0, AbstractC26779o0> biPredicate, BiPredicate<AbstractC26779o0, AbstractC26779o0> biPredicate2, BiPredicate<AbstractC26779o0, AbstractC26779o0> biPredicate3, BinaryOperator<AbstractC26779o0> binaryOperator) {
        this.f102741a = biPredicate;
        this.f102742b = biPredicate2;
        this.f102743c = biPredicate3;
        this.f102744d = binaryOperator;
    }

    /* renamed from: e */
    public static /* synthetic */ AbstractC26779o0 m20311e(AbstractC26779o0 abstractC26779o0, AbstractC26779o0 abstractC26779o02) {
        return new AbstractC26779o0.C26782c(abstractC26779o0, abstractC26779o02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ int m20310f(AbstractC26779o0 abstractC26779o0, AbstractC26779o0 abstractC26779o02) {
        if (abstractC26779o0.mo18701d()) {
            if (!abstractC26779o02.mo18701d() || this.f102741a.test(abstractC26779o0, abstractC26779o02)) {
                return -1;
            }
            return 1;
        } else if (!abstractC26779o02.mo18701d() && this.f102742b.test(abstractC26779o0, abstractC26779o02)) {
            return -1;
        } else {
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m20309g(AbstractC26779o0[] abstractC26779o0Arr, int i, int i2) {
        Arrays.sort(abstractC26779o0Arr, i, i2, new Comparator() { // from class: nu0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m20310f;
                m20310f = C46550ou0.this.m20310f((AbstractC26779o0) obj, (AbstractC26779o0) obj2);
                return m20310f;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ AbstractC26779o0 m20308h(AbstractC26779o0 abstractC26779o0, AbstractC26779o0 abstractC26779o02) {
        if (abstractC26779o0.mo18701d()) {
            return abstractC26779o02;
        }
        if (abstractC26779o02.mo18701d()) {
            return abstractC26779o0;
        }
        if (this.f102743c.test(abstractC26779o0, abstractC26779o02)) {
            return (AbstractC26779o0) this.f102744d.apply(abstractC26779o0, abstractC26779o02);
        }
        return null;
    }

    /* renamed from: j */
    public static AbstractC26779o0 m20306j(AbstractC26779o0[] abstractC26779o0Arr) {
        if (abstractC26779o0Arr != null && abstractC26779o0Arr.length != 0) {
            if (abstractC26779o0Arr.length == 1) {
                return abstractC26779o0Arr[0];
            }
            return (AbstractC26779o0) Arrays.stream(abstractC26779o0Arr).skip(2L).reduce(new AbstractC26779o0.C26782c(abstractC26779o0Arr[0], abstractC26779o0Arr[1]), new BinaryOperator() { // from class: ju0
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    AbstractC26779o0 m20311e;
                    m20311e = C46550ou0.m20311e((AbstractC26779o0) obj, (AbstractC26779o0) obj2);
                    return m20311e;
                }
            });
        }
        return AbstractC26779o0.f101189c;
    }

    /* renamed from: i */
    public AbstractC26779o0 m20307i(List<? extends InterfaceC38077ae6> list) {
        AbstractC26779o0[] abstractC26779o0Arr = (AbstractC26779o0[]) list.toArray(new AbstractC26779o0[0]);
        this.f102745e = abstractC26779o0Arr;
        m20305k(abstractC26779o0Arr);
        while (m20304l() > 0) {
            m20305k(this.f102745e);
        }
        return m20306j(this.f102745e);
    }

    /* renamed from: k */
    public final void m20305k(final AbstractC26779o0[] abstractC26779o0Arr) {
        C47736qu0.m16797a(abstractC26779o0Arr, new Predicate() { // from class: lu0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((AbstractC26779o0) obj).mo22026D();
            }
        }).m16796b(new C47736qu0.InterfaceC27734a() { // from class: mu0
            @Override // p000.C47736qu0.InterfaceC27734a
            /* renamed from: a */
            public final void mo16795a(int i, int i2) {
                C46550ou0.this.m20309g(abstractC26779o0Arr, i, i2);
            }
        });
    }

    /* renamed from: l */
    public final int m20304l() {
        C47143pu0 m18448a = C47143pu0.m18448a(this.f102745e);
        int m18446c = m18448a.m18446c(new BinaryOperator() { // from class: ku0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                AbstractC26779o0 m20308h;
                m20308h = C46550ou0.this.m20308h((AbstractC26779o0) obj, (AbstractC26779o0) obj2);
                return m20308h;
            }
        });
        if (m18446c > 0) {
            this.f102745e = (AbstractC26779o0[]) m18448a.m18447b(m18446c);
        }
        return m18446c;
    }
}
