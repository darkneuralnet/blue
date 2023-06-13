package p000;

import io.reactivex.InterfaceC23435C;
import io.reactivex.Observable;
/* renamed from: de3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C39871de3 {

    /* renamed from: a */
    public static final InterfaceC23435C<?, ?> f76982a = new C19827a();

    /* renamed from: de3$a */
    /* loaded from: classes6.dex */
    public class C19827a implements InterfaceC23435C<Object, Object> {
        @Override // io.reactivex.InterfaceC23435C
        /* renamed from: a */
        public Observable<Object> apply(Observable<Object> observable) {
            return observable;
        }
    }

    private C39871de3() {
    }

    /* renamed from: a */
    public static <T> InterfaceC23435C<T, T> m43957a() {
        return (InterfaceC23435C<T, T>) f76982a;
    }

    /* renamed from: b */
    public static <T> Observable<T> m43956b(T t) {
        return Observable.never().startWith((Observable) t);
    }
}
