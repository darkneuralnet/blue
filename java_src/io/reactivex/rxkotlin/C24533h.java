package io.reactivex.rxkotlin;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.functions.InterfaceC23480c;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aF\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0007¨\u0006\b"}, m28432d2 = {"", "T", "U", "Lio/reactivex/F;", "Lio/reactivex/K;", LegacyRepairType.OTHER_KEY, "Lkotlin/Pair;", C17296a.f69688o, "rxkotlin"}, m28431k = 2, m28430mv = {1, 4, 0})
/* renamed from: io.reactivex.rxkotlin.h */
/* loaded from: classes8.dex */
public final class C24533h {

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T", "U", "t", "u", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: io.reactivex.rxkotlin.h$a */
    /* loaded from: classes8.dex */
    public static final class C24534a<T1, T2, R> implements InterfaceC23480c<T, U, Pair<? extends T, ? extends U>> {

        /* renamed from: a */
        public static final C24534a f91177a = new C24534a();

        @Override // io.reactivex.functions.InterfaceC23480c
        /* renamed from: a */
        public final Pair<T, U> apply(T t, U u) {
            return new Pair<>(t, u);
        }
    }

    /* renamed from: a */
    public static final <T, U> AbstractC23442F<Pair<T, U>> m31942a(AbstractC23442F<T> abstractC23442F, InterfaceC23447K<U> interfaceC23447K) {
        AbstractC23442F<Pair<T, U>> abstractC23442F2 = (AbstractC23442F<Pair<T, U>>) abstractC23442F.m33103u0(interfaceC23447K, C24534a.f91177a);
        Intrinsics.checkExpressionValueIsNotNull(abstractC23442F2, "zipWith(other, BiFunction { t, u -> Pair(t, u) })");
        return abstractC23442F2;
    }
}
