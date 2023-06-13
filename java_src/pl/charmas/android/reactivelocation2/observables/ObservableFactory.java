package pl.charmas.android.reactivelocation2.observables;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23435C;
import io.reactivex.InterfaceC24579z;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23481d;
/* loaded from: classes8.dex */
public class ObservableFactory {
    private final ObservableContext context;

    /* loaded from: classes8.dex */
    public static class RetryOnConnectionSuspension<T> implements InterfaceC23435C<T, T> {
        private final boolean shouldRetry;

        /* loaded from: classes8.dex */
        public static class IsConnectionSuspendedException implements InterfaceC23481d<Integer, Throwable> {
            private IsConnectionSuspendedException() {
            }

            @Override // io.reactivex.functions.InterfaceC23481d
            public boolean test(Integer num, Throwable th) throws Exception {
                return th instanceof GoogleAPIConnectionSuspendedException;
            }
        }

        public RetryOnConnectionSuspension(boolean z) {
            this.shouldRetry = z;
        }

        @Override // io.reactivex.InterfaceC23435C
        public InterfaceC23434B<T> apply(Observable<T> observable) {
            if (this.shouldRetry) {
                return observable.retry(new IsConnectionSuspendedException());
            }
            return observable;
        }
    }

    public ObservableFactory(ObservableContext observableContext) {
        this.context = observableContext;
    }

    public <T> Observable<T> createObservable(InterfaceC24579z<T> interfaceC24579z) {
        return Observable.create(interfaceC24579z).compose(new RetryOnConnectionSuspension(this.context.isRetryOnConnectionSuspended()));
    }
}
