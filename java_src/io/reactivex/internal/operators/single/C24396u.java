package io.reactivex.internal.operators.single;

import io.reactivex.InterfaceC23447K;
import io.reactivex.functions.InterfaceC23492o;
/* renamed from: io.reactivex.internal.operators.single.u */
/* loaded from: classes6.dex */
public final class C24396u {

    /* renamed from: io.reactivex.internal.operators.single.u$a */
    /* loaded from: classes6.dex */
    public enum EnumC24397a implements InterfaceC23492o<InterfaceC23447K, InterfaceC45761na4> {
        INSTANCE;

        @Override // io.reactivex.functions.InterfaceC23492o
        /* renamed from: a */
        public InterfaceC45761na4 apply(InterfaceC23447K interfaceC23447K) {
            return new C24346E(interfaceC23447K);
        }
    }

    private C24396u() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static <T> InterfaceC23492o<InterfaceC23447K<? extends T>, InterfaceC45761na4<? extends T>> m32394a() {
        return EnumC24397a.INSTANCE;
    }
}
