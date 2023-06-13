package io.reactivex.rxkotlin;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23485h;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aF\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0007\u001ad\u0010\r\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\f0\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\b*\u00020\u0000\"\b\b\u0002\u0010\t*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004H\u0007¨\u0006\u000e"}, m28432d2 = {"", "T", "U", "Lio/reactivex/Observable;", "Lio/reactivex/B;", LegacyRepairType.OTHER_KEY, "Lkotlin/Pair;", C17296a.f69688o, "T1", "T2", "o1", "o2", "Lkotlin/Triple;", "b", "rxkotlin"}, m28431k = 2, m28430mv = {1, 4, 0})
/* renamed from: io.reactivex.rxkotlin.f */
/* loaded from: classes8.dex */
public final class C24527f {

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T", "U", "t", "u", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: io.reactivex.rxkotlin.f$a */
    /* loaded from: classes8.dex */
    public static final class C24528a<T1, T2, R> implements InterfaceC23480c<T, U, Pair<? extends T, ? extends U>> {

        /* renamed from: a */
        public static final C24528a f91172a = new C24528a();

        @Override // io.reactivex.functions.InterfaceC23480c
        /* renamed from: a */
        public final Pair<T, U> apply(T t, U u) {
            return new Pair<>(t, u);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"", "T", "T1", "T2", "t", "t1", "t2", "Lkotlin/Triple;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: io.reactivex.rxkotlin.f$b */
    /* loaded from: classes8.dex */
    public static final class C24529b<T1, T2, T3, R> implements InterfaceC23485h<T, T1, T2, Triple<? extends T, ? extends T1, ? extends T2>> {

        /* renamed from: a */
        public static final C24529b f91173a = new C24529b();

        @Override // io.reactivex.functions.InterfaceC23485h
        /* renamed from: a */
        public final Triple<T, T1, T2> apply(T t, T1 t1, T2 t2) {
            return new Triple<>(t, t1, t2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final <T, U> Observable<Pair<T, U>> m31950a(Observable<T> observable, InterfaceC23434B<U> interfaceC23434B) {
        Observable<Pair<T, U>> observable2 = (Observable<Pair<T, U>>) observable.withLatestFrom(interfaceC23434B, C24528a.f91172a);
        Intrinsics.checkExpressionValueIsNotNull(observable2, "withLatestFrom(other, Bi…n { t, u -> Pair(t, u) })");
        return observable2;
    }

    /* renamed from: b */
    public static final <T, T1, T2> Observable<Triple<T, T1, T2>> m31949b(Observable<T> observable, InterfaceC23434B<T1> interfaceC23434B, InterfaceC23434B<T2> interfaceC23434B2) {
        Observable<Triple<T, T1, T2>> observable2 = (Observable<Triple<T, T1, T2>>) observable.withLatestFrom(interfaceC23434B, interfaceC23434B2, C24529b.f91173a);
        Intrinsics.checkExpressionValueIsNotNull(observable2, "withLatestFrom(o1, o2, F…2 -> Triple(t, t1, t2) })");
        return observable2;
    }
}
