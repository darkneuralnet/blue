package com.uber.autodispose.lifecycle;

import com.uber.autodispose.AutoDisposePlugins;
import com.uber.autodispose.OutsideScopeException;
import com.uber.autodispose.lifecycle.LifecycleScopes;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23494q;
import java.util.Comparator;
/* loaded from: classes7.dex */
public final class LifecycleScopes {

    /* renamed from: a */
    public static final Comparator<Comparable<Object>> f75577a = new Comparator() { // from class: Iq2
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    };

    private LifecycleScopes() {
        throw new InstantiationError();
    }

    /* renamed from: c */
    public static /* synthetic */ boolean m45182c(Comparator comparator, Object obj, Object obj2) throws Exception {
        return comparator.compare(obj2, obj) >= 0;
    }

    /* renamed from: e */
    public static <E> InterfaceC23496h m45180e(LifecycleScopeProvider<E> lifecycleScopeProvider) throws OutsideScopeException {
        return m45179f(lifecycleScopeProvider, true);
    }

    /* renamed from: f */
    public static <E> InterfaceC23496h m45179f(LifecycleScopeProvider<E> lifecycleScopeProvider, boolean z) throws OutsideScopeException {
        E peekLifecycle = lifecycleScopeProvider.peekLifecycle();
        CorrespondingEventsFunction<E> mo37326O8 = lifecycleScopeProvider.mo37326O8();
        if (peekLifecycle != null) {
            try {
                return m45178g(lifecycleScopeProvider.mo37323c2(), mo37326O8.apply(peekLifecycle));
            } catch (Exception e) {
                if (z && (e instanceof LifecycleEndedException)) {
                    InterfaceC23484g<? super OutsideScopeException> m45226a = AutoDisposePlugins.m45226a();
                    if (m45226a != null) {
                        try {
                            m45226a.accept((LifecycleEndedException) e);
                            return AbstractC23461c.m33039p();
                        } catch (Exception e2) {
                            return AbstractC23461c.m33080F(e2);
                        }
                    }
                    throw e;
                }
                return AbstractC23461c.m33080F(e);
            }
        }
        throw new LifecycleNotStartedException();
    }

    /* renamed from: g */
    public static <E> InterfaceC23496h m45178g(Observable<E> observable, E e) {
        Comparator<Comparable<Object>> comparator;
        if (e instanceof Comparable) {
            comparator = f75577a;
        } else {
            comparator = null;
        }
        return m45177h(observable, e, comparator);
    }

    /* renamed from: h */
    public static <E> InterfaceC23496h m45177h(Observable<E> observable, final E e, final Comparator<E> comparator) {
        InterfaceC23494q<? super E> interfaceC23494q;
        if (comparator != null) {
            interfaceC23494q = new InterfaceC23494q() { // from class: Jq2
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean m45182c;
                    m45182c = LifecycleScopes.m45182c(comparator, e, obj);
                    return m45182c;
                }
            };
        } else {
            interfaceC23494q = new InterfaceC23494q() { // from class: Kq2
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean equals;
                    equals = obj.equals(e);
                    return equals;
                }
            };
        }
        return observable.skip(1L).takeUntil(interfaceC23494q).ignoreElements();
    }
}
