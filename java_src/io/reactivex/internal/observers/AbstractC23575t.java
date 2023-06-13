package io.reactivex.internal.observers;

import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.fuseable.InterfaceC23554i;
import io.reactivex.internal.util.C24487s;
import io.reactivex.internal.util.InterfaceC24483o;
/* renamed from: io.reactivex.internal.observers.t */
/* loaded from: classes6.dex */
public abstract class AbstractC23575t<T, U, V> extends C23577v implements InterfaceC23436D<T>, InterfaceC24483o<U, V> {

    /* renamed from: c */
    public final InterfaceC23436D<? super V> f88330c;

    /* renamed from: d */
    public final InterfaceC23554i<U> f88331d;

    /* renamed from: e */
    public volatile boolean f88332e;

    /* renamed from: f */
    public volatile boolean f88333f;

    /* renamed from: g */
    public Throwable f88334g;

    public AbstractC23575t(InterfaceC23436D<? super V> interfaceC23436D, InterfaceC23554i<U> interfaceC23554i) {
        this.f88330c = interfaceC23436D;
        this.f88331d = interfaceC23554i;
    }

    /* renamed from: a */
    public final boolean m32905a() {
        return this.f88335b.getAndIncrement() == 0;
    }

    @Override // io.reactivex.internal.util.InterfaceC24483o
    /* renamed from: b */
    public final int mo32234b(int i) {
        return this.f88335b.addAndGet(i);
    }

    @Override // io.reactivex.internal.util.InterfaceC24483o
    /* renamed from: c */
    public final boolean mo32233c() {
        return this.f88332e;
    }

    @Override // io.reactivex.internal.util.InterfaceC24483o
    /* renamed from: d */
    public void mo32232d(InterfaceC23436D<? super V> interfaceC23436D, U u) {
    }

    @Override // io.reactivex.internal.util.InterfaceC24483o
    public final boolean done() {
        return this.f88333f;
    }

    /* renamed from: g */
    public final boolean m32904g() {
        return this.f88335b.get() == 0 && this.f88335b.compareAndSet(0, 1);
    }

    /* renamed from: h */
    public final void m32903h(U u, boolean z, InterfaceC23465c interfaceC23465c) {
        InterfaceC23436D<? super V> interfaceC23436D = this.f88330c;
        InterfaceC23554i<U> interfaceC23554i = this.f88331d;
        if (this.f88335b.get() == 0 && this.f88335b.compareAndSet(0, 1)) {
            mo32232d(interfaceC23436D, u);
            if (mo32234b(-1) == 0) {
                return;
            }
        } else {
            interfaceC23554i.offer(u);
            if (!m32905a()) {
                return;
            }
        }
        C24487s.m32213d(interfaceC23554i, interfaceC23436D, z, interfaceC23465c, this);
    }

    /* renamed from: i */
    public final void m32902i(U u, boolean z, InterfaceC23465c interfaceC23465c) {
        InterfaceC23436D<? super V> interfaceC23436D = this.f88330c;
        InterfaceC23554i<U> interfaceC23554i = this.f88331d;
        if (this.f88335b.get() == 0 && this.f88335b.compareAndSet(0, 1)) {
            if (interfaceC23554i.isEmpty()) {
                mo32232d(interfaceC23436D, u);
                if (mo32234b(-1) == 0) {
                    return;
                }
            } else {
                interfaceC23554i.offer(u);
            }
        } else {
            interfaceC23554i.offer(u);
            if (!m32905a()) {
                return;
            }
        }
        C24487s.m32213d(interfaceC23554i, interfaceC23436D, z, interfaceC23465c, this);
    }

    @Override // io.reactivex.internal.util.InterfaceC24483o
    /* renamed from: j */
    public final Throwable mo32231j() {
        return this.f88334g;
    }
}
