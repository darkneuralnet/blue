package p000;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.internal.UndeliveredElementException;
import p000.AbstractC25077k1;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012 \u0010\u001b\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f\u0018\u00010\u0019j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\r\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u000f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u000f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, m28432d2 = {"LTr2;", "E", "Lj0;", "element", "", "w", "(Ljava/lang/Object;)Ljava/lang/Object;", "LK22;", "Lxs5;", "list", "LCl0;", "closed", "", "U", "(Ljava/lang/Object;LCl0;)V", "", "P", "()Z", "isBufferAlwaysEmpty", "Q", "isBufferEmpty", "t", "isBufferAlwaysFull", "u", "isBufferFull", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Tr2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C36214Tr2<E> extends AbstractC24679j0<E> {
    public C36214Tr2(Function1<? super E, Unit> function1) {
        super(function1);
    }

    @Override // p000.AbstractC24679j0
    /* renamed from: P */
    public final boolean mo11167P() {
        return true;
    }

    @Override // p000.AbstractC24679j0
    /* renamed from: Q */
    public final boolean mo11166Q() {
        return true;
    }

    @Override // p000.AbstractC24679j0
    /* renamed from: U */
    public void mo31293U(Object obj, C32180Cl0<?> c32180Cl0) {
        UndeliveredElementException undeliveredElementException = null;
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                AbstractC51870xs5 abstractC51870xs5 = (AbstractC51870xs5) obj;
                if (abstractC51870xs5 instanceof AbstractC25077k1.C25078a) {
                    Function1<E, Unit> function1 = this.f93766b;
                    if (function1 != null) {
                        undeliveredElementException = C47016ph3.m18973c(function1, ((AbstractC25077k1.C25078a) abstractC51870xs5).f93768e, null);
                    }
                } else {
                    abstractC51870xs5.mo196R(c32180Cl0);
                }
            } else {
                ArrayList arrayList = (ArrayList) obj;
                UndeliveredElementException undeliveredElementException2 = null;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    AbstractC51870xs5 abstractC51870xs52 = (AbstractC51870xs5) arrayList.get(size);
                    if (abstractC51870xs52 instanceof AbstractC25077k1.C25078a) {
                        Function1<E, Unit> function12 = this.f93766b;
                        if (function12 != null) {
                            undeliveredElementException2 = C47016ph3.m18973c(function12, ((AbstractC25077k1.C25078a) abstractC51870xs52).f93768e, undeliveredElementException2);
                        } else {
                            undeliveredElementException2 = null;
                        }
                    } else {
                        abstractC51870xs52.mo196R(c32180Cl0);
                    }
                }
                undeliveredElementException = undeliveredElementException2;
            }
        }
        if (undeliveredElementException == null) {
            return;
        }
        throw undeliveredElementException;
    }

    @Override // p000.AbstractC25077k1
    /* renamed from: t */
    public final boolean mo11165t() {
        return false;
    }

    @Override // p000.AbstractC25077k1
    /* renamed from: u */
    public final boolean mo11164u() {
        return false;
    }

    @Override // p000.AbstractC25077k1
    /* renamed from: w */
    public Object mo23127w(E e) {
        InterfaceC44755ls4<?> m29460y;
        do {
            Object mo23127w = super.mo23127w(e);
            C49885uX5 c49885uX5 = C25076k0.f93731b;
            if (mo23127w == c49885uX5) {
                return c49885uX5;
            }
            if (mo23127w == C25076k0.f93732c) {
                m29460y = m29460y(e);
                if (m29460y == null) {
                    return c49885uX5;
                }
            } else if (mo23127w instanceof C32180Cl0) {
                return mo23127w;
            } else {
                throw new IllegalStateException(("Invalid offerInternal result " + mo23127w).toString());
            }
        } while (!(m29460y instanceof C32180Cl0));
        return m29460y;
    }
}
