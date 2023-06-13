package p000;

import java.util.Map;
import java.util.Objects;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import p000.AbstractC26779o0;
/* renamed from: Zd6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C37496Zd6 implements InterfaceC49089tB0 {

    /* renamed from: a */
    public final Map<Class<? extends AbstractC26779o0>, Integer> f48858a = C49060t80.m13023d();

    /* renamed from: i */
    public static /* synthetic */ String m72835i(AbstractC26779o0 abstractC26779o0) {
        return String.format("no normal-form order defined for class '%s'", abstractC26779o0.getClass().getName());
    }

    /* renamed from: j */
    public static /* synthetic */ String m72834j(AbstractC26779o0 abstractC26779o0) {
        return String.format("no normal-form order defined for class '%s'", abstractC26779o0.getClass().getName());
    }

    @Override // p000.InterfaceC49089tB0
    /* renamed from: a */
    public AbstractC26779o0 mo12922a(AbstractC26779o0 abstractC26779o0, AbstractC26779o0 abstractC26779o02, BiPredicate<AbstractC26779o0, AbstractC26779o0> biPredicate, BinaryOperator<AbstractC26779o0> binaryOperator) {
        boolean z;
        AbstractC26779o0.C26782c c26782c;
        if (abstractC26779o0.mo18701d()) {
            if (abstractC26779o02.mo18701d()) {
                if (!m72836h(abstractC26779o0, abstractC26779o02)) {
                    return abstractC26779o02;
                }
                return abstractC26779o0;
            }
            return abstractC26779o02;
        } else if (abstractC26779o02.mo18701d()) {
            return abstractC26779o0;
        } else {
            if (biPredicate.test(abstractC26779o0, abstractC26779o02)) {
                return (AbstractC26779o0) binaryOperator.apply(abstractC26779o0, abstractC26779o02);
            }
            boolean z2 = true;
            if (abstractC26779o0.mo22026D() && abstractC26779o02.mo22026D()) {
                z = true;
            } else {
                z = false;
            }
            if (!z || m72837g(abstractC26779o0, abstractC26779o02)) {
                z2 = false;
            }
            if (z2) {
                c26782c = new AbstractC26779o0.C26782c(abstractC26779o02, abstractC26779o0);
            } else {
                c26782c = new AbstractC26779o0.C26782c(abstractC26779o0, abstractC26779o02);
            }
            return new C46550ou0(new BiPredicate() { // from class: Vd6
                @Override // java.util.function.BiPredicate
                public final boolean test(Object obj, Object obj2) {
                    boolean m72836h;
                    m72836h = C37496Zd6.this.m72836h((AbstractC26779o0) obj, (AbstractC26779o0) obj2);
                    return m72836h;
                }
            }, new BiPredicate() { // from class: Wd6
                @Override // java.util.function.BiPredicate
                public final boolean test(Object obj, Object obj2) {
                    boolean m72837g;
                    m72837g = C37496Zd6.this.m72837g((AbstractC26779o0) obj, (AbstractC26779o0) obj2);
                    return m72837g;
                }
            }, biPredicate, binaryOperator).m20307i(c26782c.mo22031a());
        }
    }

    /* renamed from: g */
    public final boolean m72837g(final AbstractC26779o0 abstractC26779o0, final AbstractC26779o0 abstractC26779o02) {
        if (abstractC26779o0.getClass().equals(abstractC26779o02.getClass())) {
            if ((abstractC26779o0 instanceof UY3) && ((UY3) abstractC26779o0).m81354m() > ((UY3) abstractC26779o02).m81354m()) {
                return false;
            }
            return true;
        }
        Integer num = this.f48858a.get(abstractC26779o0.getClass());
        Objects.requireNonNull(num, new Supplier() { // from class: Xd6
            @Override // java.util.function.Supplier
            public final Object get() {
                String m72835i;
                m72835i = C37496Zd6.m72835i(AbstractC26779o0.this);
                return m72835i;
            }
        });
        Integer num2 = this.f48858a.get(abstractC26779o02.getClass());
        Objects.requireNonNull(num2, new Supplier() { // from class: Yd6
            @Override // java.util.function.Supplier
            public final Object get() {
                String m72834j;
                m72834j = C37496Zd6.m72834j(AbstractC26779o0.this);
                return m72834j;
            }
        });
        if (num.intValue() > num2.intValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final boolean m72836h(AbstractC26779o0 abstractC26779o0, AbstractC26779o0 abstractC26779o02) {
        if (abstractC26779o0.getClass().equals(abstractC26779o02.getClass()) || this.f48858a.get(abstractC26779o0.getClass()).intValue() <= this.f48858a.get(abstractC26779o02.getClass()).intValue()) {
            return true;
        }
        return false;
    }
}
