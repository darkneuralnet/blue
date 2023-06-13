package io.reactivex.flowables;

import io.reactivex.AbstractC24490k;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.internal.operators.flowable.C23681U;
import io.reactivex.internal.operators.flowable.C23689X;
import io.reactivex.internal.operators.flowable.InterfaceC23684V;
import io.reactivex.internal.util.C24471g;
import io.reactivex.plugins.C24508a;
/* renamed from: io.reactivex.flowables.a */
/* loaded from: classes6.dex */
public abstract class AbstractC23477a<T> extends AbstractC24490k<T> {
    /* renamed from: A1 */
    public AbstractC24490k<T> m33008A1() {
        return C24508a.m31996m(new C23689X(m33006z1()));
    }

    /* renamed from: x1 */
    public final InterfaceC23465c m33007x1() {
        C24471g c24471g = new C24471g();
        mo32844y1(c24471g);
        return c24471g.f91070b;
    }

    /* renamed from: y1 */
    public abstract void mo32844y1(InterfaceC23484g<? super InterfaceC23465c> interfaceC23484g);

    /* renamed from: z1 */
    public final AbstractC23477a<T> m33006z1() {
        if (this instanceof InterfaceC23684V) {
            InterfaceC23684V interfaceC23684V = (InterfaceC23684V) this;
            return C24508a.m31992q(new C23681U(interfaceC23684V.mo32865b(), interfaceC23684V.mo32864e()));
        }
        return this;
    }
}
