package io.reactivex.rxkotlin;

import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23485h;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJJ\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u0004\"\b\b\u0000\u0010\u0002*\u00020\u0001\"\b\b\u0001\u0010\u0003*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0007Jh\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000b0\u0004\"\b\b\u0000\u0010\u0002*\u00020\u0001\"\b\b\u0001\u0010\u0003*\u00020\u0001\"\b\b\u0002\u0010\t*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004H\u0007JJ\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u0004\"\b\b\u0000\u0010\u0002*\u00020\u0001\"\b\b\u0001\u0010\u0003*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0007¨\u0006\u0010"}, m28432d2 = {"Lio/reactivex/rxkotlin/e;", "", "T1", "T2", "Lio/reactivex/Observable;", "source1", "source2", "Lkotlin/Pair;", C17296a.f69688o, "T3", "source3", "Lkotlin/Triple;", "b", "c", "<init>", "()V", "rxkotlin"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: io.reactivex.rxkotlin.e */
/* loaded from: classes8.dex */
public final class C24523e {

    /* renamed from: a */
    public static final C24523e f91168a = new C24523e();

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T1", "T2", "t1", "t2", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: io.reactivex.rxkotlin.e$a */
    /* loaded from: classes8.dex */
    public static final class C24524a<T1, T2, R> implements InterfaceC23480c<T1, T2, Pair<? extends T1, ? extends T2>> {

        /* renamed from: a */
        public static final C24524a f91169a = new C24524a();

        @Override // io.reactivex.functions.InterfaceC23480c
        /* renamed from: a */
        public final Pair<T1, T2> apply(T1 t1, T2 t2) {
            return TuplesKt.m28425to(t1, t2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"", "T1", "T2", "T3", "t1", "t2", "t3", "Lkotlin/Triple;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: io.reactivex.rxkotlin.e$b */
    /* loaded from: classes8.dex */
    public static final class C24525b<T1, T2, T3, R> implements InterfaceC23485h<T1, T2, T3, Triple<? extends T1, ? extends T2, ? extends T3>> {

        /* renamed from: a */
        public static final C24525b f91170a = new C24525b();

        @Override // io.reactivex.functions.InterfaceC23485h
        /* renamed from: a */
        public final Triple<T1, T2, T3> apply(T1 t1, T2 t2, T3 t3) {
            return new Triple<>(t1, t2, t3);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T1", "T2", "t1", "t2", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: io.reactivex.rxkotlin.e$c */
    /* loaded from: classes8.dex */
    public static final class C24526c<T1, T2, R> implements InterfaceC23480c<T1, T2, Pair<? extends T1, ? extends T2>> {

        /* renamed from: a */
        public static final C24526c f91171a = new C24526c();

        @Override // io.reactivex.functions.InterfaceC23480c
        /* renamed from: a */
        public final Pair<T1, T2> apply(T1 t1, T2 t2) {
            return TuplesKt.m28425to(t1, t2);
        }
    }

    private C24523e() {
    }

    /* renamed from: a */
    public final <T1, T2> Observable<Pair<T1, T2>> m31956a(Observable<T1> observable, Observable<T2> observable2) {
        Observable<Pair<T1, T2>> combineLatest = Observable.combineLatest(observable, observable2, C24524a.f91169a);
        Intrinsics.checkExpressionValueIsNotNull(combineLatest, "Observable.combineLatest…> { t1, t2 -> t1 to t2 })");
        return combineLatest;
    }

    /* renamed from: b */
    public final <T1, T2, T3> Observable<Triple<T1, T2, T3>> m31955b(Observable<T1> observable, Observable<T2> observable2, Observable<T3> observable3) {
        Observable<Triple<T1, T2, T3>> combineLatest = Observable.combineLatest(observable, observable2, observable3, C24525b.f91170a);
        Intrinsics.checkExpressionValueIsNotNull(combineLatest, "Observable.combineLatest… -> Triple(t1, t2, t3) })");
        return combineLatest;
    }

    /* renamed from: c */
    public final <T1, T2> Observable<Pair<T1, T2>> m31954c(Observable<T1> observable, Observable<T2> observable2) {
        Observable<Pair<T1, T2>> zip = Observable.zip(observable, observable2, C24526c.f91171a);
        Intrinsics.checkExpressionValueIsNotNull(zip, "Observable.zip(source1, …> { t1, t2 -> t1 to t2 })");
        return zip;
    }
}
