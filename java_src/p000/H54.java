package p000;

import android.annotation.SuppressLint;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\u0005\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0004\u001a\u00028\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"T", "Lio/reactivex/functions/g;", "E", "Lio/reactivex/Observable;", "observer", C17296a.f69688o, "(Lio/reactivex/Observable;Lio/reactivex/functions/g;)Lio/reactivex/functions/g;", "ride_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: H54 */
/* loaded from: classes4.dex */
public final class H54 {
    @SuppressLint({"CheckResult"})
    /* renamed from: a */
    public static final <T, E extends InterfaceC23484g<? super T>> E m104424a(Observable<T> observable, E observer) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(observer, "observer");
        observable.subscribe(observer);
        return observer;
    }
}
