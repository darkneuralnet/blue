package io.reactivex.rxkotlin;

import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23485h;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011JJ\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b0\u0007\"\b\b\u0000\u0010\u0002*\u00020\u0001\"\b\b\u0001\u0010\u0003*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0007Jh\u0010\u000f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000e0\u0007\"\b\b\u0000\u0010\n*\u00020\u0001\"\b\b\u0001\u0010\u000b*\u00020\u0001\"\b\b\u0002\u0010\f*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004H\u0007¨\u0006\u0012"}, m28432d2 = {"Lio/reactivex/rxkotlin/g;", "", "T", "U", "Lio/reactivex/K;", "s1", "s2", "Lio/reactivex/F;", "Lkotlin/Pair;", C17296a.f69688o, "T1", "T2", "T3", "s3", "Lkotlin/Triple;", "b", "<init>", "()V", "rxkotlin"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: io.reactivex.rxkotlin.g */
/* loaded from: classes8.dex */
public final class C24530g {

    /* renamed from: a */
    public static final C24530g f91174a = new C24530g();

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T", "U", "t", "u", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: io.reactivex.rxkotlin.g$a */
    /* loaded from: classes8.dex */
    public static final class C24531a<T1, T2, R> implements InterfaceC23480c<T, U, Pair<? extends T, ? extends U>> {

        /* renamed from: a */
        public static final C24531a f91175a = new C24531a();

        @Override // io.reactivex.functions.InterfaceC23480c
        /* renamed from: a */
        public final Pair<T, U> apply(T t, U u) {
            return new Pair<>(t, u);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"", "T1", "T2", "T3", "t1", "t2", "t3", "Lkotlin/Triple;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: io.reactivex.rxkotlin.g$b */
    /* loaded from: classes8.dex */
    public static final class C24532b<T1, T2, T3, R> implements InterfaceC23485h<T1, T2, T3, Triple<? extends T1, ? extends T2, ? extends T3>> {

        /* renamed from: a */
        public static final C24532b f91176a = new C24532b();

        @Override // io.reactivex.functions.InterfaceC23485h
        /* renamed from: a */
        public final Triple<T1, T2, T3> apply(T1 t1, T2 t2, T3 t3) {
            return new Triple<>(t1, t2, t3);
        }
    }

    private C24530g() {
    }

    /* renamed from: a */
    public final <T, U> AbstractC23442F<Pair<T, U>> m31946a(InterfaceC23447K<T> interfaceC23447K, InterfaceC23447K<U> interfaceC23447K2) {
        AbstractC23442F<Pair<T, U>> m33109r0 = AbstractC23442F.m33109r0(interfaceC23447K, interfaceC23447K2, C24531a.f91175a);
        Intrinsics.checkExpressionValueIsNotNull(m33109r0, "Single.zip(s1, s2, BiFun…n { t, u -> Pair(t, u) })");
        return m33109r0;
    }

    /* renamed from: b */
    public final <T1, T2, T3> AbstractC23442F<Triple<T1, T2, T3>> m31945b(InterfaceC23447K<T1> interfaceC23447K, InterfaceC23447K<T2> interfaceC23447K2, InterfaceC23447K<T3> interfaceC23447K3) {
        AbstractC23442F<Triple<T1, T2, T3>> m33111q0 = AbstractC23442F.m33111q0(interfaceC23447K, interfaceC23447K2, interfaceC23447K3, C24532b.f91176a);
        Intrinsics.checkExpressionValueIsNotNull(m33111q0, "Single.zip(s1, s2, s3, F… -> Triple(t1, t2, t3) })");
        return m33111q0;
    }
}
