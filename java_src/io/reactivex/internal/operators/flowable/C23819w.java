package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC24490k;
import io.reactivex.functions.InterfaceC23492o;
/* renamed from: io.reactivex.internal.operators.flowable.w */
/* loaded from: classes6.dex */
public final class C23819w<T, U> extends AbstractC24490k<U> {

    /* renamed from: c */
    public final InterfaceC45761na4<T> f89070c;

    /* renamed from: d */
    public final InterfaceC23492o<? super T, ? extends InterfaceC45761na4<? extends U>> f89071d;

    /* renamed from: e */
    public final boolean f89072e;

    /* renamed from: f */
    public final int f89073f;

    /* renamed from: g */
    public final int f89074g;

    public C23819w(InterfaceC45761na4<T> interfaceC45761na4, InterfaceC23492o<? super T, ? extends InterfaceC45761na4<? extends U>> interfaceC23492o, boolean z, int i, int i2) {
        this.f89070c = interfaceC45761na4;
        this.f89071d = interfaceC23492o;
        this.f89072e = z;
        this.f89073f = i;
        this.f89074g = i2;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super U> interfaceC42141hT5) {
        if (C23746g0.m32799b(this.f89070c, interfaceC42141hT5, this.f89071d)) {
            return;
        }
        this.f89070c.mo23497c(C23797s.m32789x1(interfaceC42141hT5, this.f89071d, this.f89072e, this.f89073f, this.f89074g));
    }
}
