package io.reactivex.rxkotlin;

import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007\u001a*\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00030\u0002H\u0007¨\u0006\u0006"}, m28432d2 = {"", "T", "", "Lio/reactivex/Observable;", "b", C17296a.f69688o, "rxkotlin"}, m28431k = 2, m28430mv = {1, 4, 0})
/* renamed from: io.reactivex.rxkotlin.d */
/* loaded from: classes8.dex */
public final class C24522d {
    /* renamed from: a */
    public static final <T> Observable<T> m31958a(Iterable<? extends Observable<? extends T>> iterable) {
        Observable<T> merge = Observable.merge(m31957b(iterable));
        Intrinsics.checkExpressionValueIsNotNull(merge, "Observable.merge(this.toObservable())");
        return merge;
    }

    /* renamed from: b */
    public static final <T> Observable<T> m31957b(Iterable<? extends T> iterable) {
        Observable<T> fromIterable = Observable.fromIterable(iterable);
        Intrinsics.checkExpressionValueIsNotNull(fromIterable, "Observable.fromIterable(this)");
        return fromIterable;
    }
}
