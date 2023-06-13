package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC24490k;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.subscriptions.C24461e;
import io.reactivex.internal.subscriptions.EnumC24460d;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.Callable;
/* renamed from: io.reactivex.internal.operators.flowable.g0 */
/* loaded from: classes6.dex */
public final class C23746g0 {

    /* renamed from: io.reactivex.internal.operators.flowable.g0$a */
    /* loaded from: classes6.dex */
    public static final class C23747a<T, R> extends AbstractC24490k<R> {

        /* renamed from: c */
        public final T f88803c;

        /* renamed from: d */
        public final InterfaceC23492o<? super T, ? extends InterfaceC45761na4<? extends R>> f88804d;

        public C23747a(T t, InterfaceC23492o<? super T, ? extends InterfaceC45761na4<? extends R>> interfaceC23492o) {
            this.f88803c = t;
            this.f88804d = interfaceC23492o;
        }

        @Override // io.reactivex.AbstractC24490k
        /* renamed from: X0 */
        public void mo31967X0(InterfaceC42141hT5<? super R> interfaceC42141hT5) {
            try {
                InterfaceC45761na4 interfaceC45761na4 = (InterfaceC45761na4) C23544b.m32923e(this.f88804d.apply((T) this.f88803c), "The mapper returned a null Publisher");
                if (interfaceC45761na4 instanceof Callable) {
                    try {
                        Object call = ((Callable) interfaceC45761na4).call();
                        if (call == null) {
                            EnumC24460d.m32301a(interfaceC42141hT5);
                            return;
                        } else {
                            interfaceC42141hT5.mo31867a(new C24461e(interfaceC42141hT5, call));
                            return;
                        }
                    } catch (Throwable th) {
                        C23475a.m33009b(th);
                        EnumC24460d.m32300c(th, interfaceC42141hT5);
                        return;
                    }
                }
                interfaceC45761na4.mo23497c(interfaceC42141hT5);
            } catch (Throwable th2) {
                EnumC24460d.m32300c(th2, interfaceC42141hT5);
            }
        }
    }

    private C23746g0() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static <T, U> AbstractC24490k<U> m32800a(T t, InterfaceC23492o<? super T, ? extends InterfaceC45761na4<? extends U>> interfaceC23492o) {
        return C24508a.m31996m(new C23747a(t, interfaceC23492o));
    }

    /* renamed from: b */
    public static <T, R> boolean m32799b(InterfaceC45761na4<T> interfaceC45761na4, InterfaceC42141hT5<? super R> interfaceC42141hT5, InterfaceC23492o<? super T, ? extends InterfaceC45761na4<? extends R>> interfaceC23492o) {
        if (interfaceC45761na4 instanceof Callable) {
            try {
                Object obj = (Object) ((Callable) interfaceC45761na4).call();
                if (obj == 0) {
                    EnumC24460d.m32301a(interfaceC42141hT5);
                    return true;
                }
                try {
                    InterfaceC45761na4 interfaceC45761na42 = (InterfaceC45761na4) C23544b.m32923e(interfaceC23492o.apply(obj), "The mapper returned a null Publisher");
                    if (interfaceC45761na42 instanceof Callable) {
                        try {
                            Object call = ((Callable) interfaceC45761na42).call();
                            if (call == null) {
                                EnumC24460d.m32301a(interfaceC42141hT5);
                                return true;
                            }
                            interfaceC42141hT5.mo31867a(new C24461e(interfaceC42141hT5, call));
                        } catch (Throwable th) {
                            C23475a.m33009b(th);
                            EnumC24460d.m32300c(th, interfaceC42141hT5);
                            return true;
                        }
                    } else {
                        interfaceC45761na42.mo23497c(interfaceC42141hT5);
                    }
                    return true;
                } catch (Throwable th2) {
                    C23475a.m33009b(th2);
                    EnumC24460d.m32300c(th2, interfaceC42141hT5);
                    return true;
                }
            } catch (Throwable th3) {
                C23475a.m33009b(th3);
                EnumC24460d.m32300c(th3, interfaceC42141hT5);
                return true;
            }
        }
        return false;
    }
}
