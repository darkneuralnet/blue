package io.reactivex.rxkotlin;

import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC24574u;
import io.reactivex.functions.InterfaceC23480c;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJJ\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b0\u0007\"\b\b\u0000\u0010\u0002*\u00020\u0001\"\b\b\u0001\u0010\u0003*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0007¨\u0006\f"}, m28432d2 = {"Lio/reactivex/rxkotlin/c;", "", "T", "U", "Lio/reactivex/u;", "s1", "s2", "Lio/reactivex/p;", "Lkotlin/Pair;", C17296a.f69688o, "<init>", "()V", "rxkotlin"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: io.reactivex.rxkotlin.c */
/* loaded from: classes8.dex */
public final class C24520c {

    /* renamed from: a */
    public static final C24520c f91166a = new C24520c();

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T", "U", "t", "u", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: io.reactivex.rxkotlin.c$a */
    /* loaded from: classes8.dex */
    public static final class C24521a<T1, T2, R> implements InterfaceC23480c<T, U, Pair<? extends T, ? extends U>> {

        /* renamed from: a */
        public static final C24521a f91167a = new C24521a();

        @Override // io.reactivex.functions.InterfaceC23480c
        /* renamed from: a */
        public final Pair<T, U> apply(T t, U u) {
            return new Pair<>(t, u);
        }
    }

    private C24520c() {
    }

    /* renamed from: a */
    public final <T, U> AbstractC24507p<Pair<T, U>> m31960a(InterfaceC24574u<T> interfaceC24574u, InterfaceC24574u<U> interfaceC24574u2) {
        AbstractC24507p<Pair<T, U>> m32038h0 = AbstractC24507p.m32038h0(interfaceC24574u, interfaceC24574u2, C24521a.f91167a);
        Intrinsics.checkExpressionValueIsNotNull(m32038h0, "Maybe.zip(s1, s2,\n      …n { t, u -> Pair(t, u) })");
        return m32038h0;
    }
}
