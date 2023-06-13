package io.reactivex.internal.operators.single;

import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23447K;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23502e;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.operators.single.C24350G;
import io.reactivex.internal.operators.single.C24399w;
import java.util.Arrays;
import java.util.NoSuchElementException;
/* renamed from: io.reactivex.internal.operators.single.H */
/* loaded from: classes6.dex */
public final class C24354H<T, R> extends AbstractC23442F<R> {

    /* renamed from: b */
    public final Iterable<? extends InterfaceC23447K<? extends T>> f90787b;

    /* renamed from: c */
    public final InterfaceC23492o<? super Object[], ? extends R> f90788c;

    /* renamed from: io.reactivex.internal.operators.single.H$a */
    /* loaded from: classes6.dex */
    public final class C24355a implements InterfaceC23492o<T, R> {
        public C24355a() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[], java.lang.Object] */
        @Override // io.reactivex.functions.InterfaceC23492o
        public R apply(T t) throws Exception {
            return (R) C23544b.m32923e(C24354H.this.f90788c.apply(new Object[]{t}), "The zipper returned a null value");
        }
    }

    public C24354H(Iterable<? extends InterfaceC23447K<? extends T>> iterable, InterfaceC23492o<? super Object[], ? extends R> interfaceC23492o) {
        this.f90787b = iterable;
        this.f90788c = interfaceC23492o;
    }

    @Override // io.reactivex.AbstractC23442F
    /* renamed from: X */
    public void mo14806X(InterfaceC23445I<? super R> interfaceC23445I) {
        InterfaceC23447K[] interfaceC23447KArr = new InterfaceC23447K[8];
        try {
            int i = 0;
            for (InterfaceC23447K<? extends T> interfaceC23447K : this.f90787b) {
                if (interfaceC23447K == null) {
                    EnumC23502e.m32986j(new NullPointerException("One of the sources is null"), interfaceC23445I);
                    return;
                }
                if (i == interfaceC23447KArr.length) {
                    interfaceC23447KArr = (InterfaceC23447K[]) Arrays.copyOf(interfaceC23447KArr, (i >> 2) + i);
                }
                int i2 = i + 1;
                interfaceC23447KArr[i] = interfaceC23447K;
                i = i2;
            }
            if (i == 0) {
                EnumC23502e.m32986j(new NoSuchElementException(), interfaceC23445I);
            } else if (i == 1) {
                interfaceC23447KArr[0].mo33096a(new C24399w.C24400a(interfaceC23445I, new C24355a()));
            } else {
                C24350G.C24352b c24352b = new C24350G.C24352b(interfaceC23445I, i, this.f90788c);
                interfaceC23445I.onSubscribe(c24352b);
                for (int i3 = 0; i3 < i && !c24352b.mo1769e(); i3++) {
                    interfaceC23447KArr[i3].mo33096a(c24352b.f90783d[i3]);
                }
            }
        } catch (Throwable th) {
            C23475a.m33009b(th);
            EnumC23502e.m32986j(th, interfaceC23445I);
        }
    }
}
