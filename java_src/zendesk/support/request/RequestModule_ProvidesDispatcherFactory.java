package zendesk.support.request;

import zendesk.support.suas.Dispatcher;
import zendesk.support.suas.Store;
/* loaded from: classes8.dex */
public final class RequestModule_ProvidesDispatcherFactory implements InterfaceC48812sj1<Dispatcher> {
    private final Y94<Store> storeProvider;

    public RequestModule_ProvidesDispatcherFactory(Y94<Store> y94) {
        this.storeProvider = y94;
    }

    public static RequestModule_ProvidesDispatcherFactory create(Y94<Store> y94) {
        return new RequestModule_ProvidesDispatcherFactory(y94);
    }

    public static Dispatcher providesDispatcher(Store store) {
        return (Dispatcher) C51679xZ3.m5002e(RequestModule.providesDispatcher(store));
    }

    @Override // p000.Y94
    public Dispatcher get() {
        return providesDispatcher(this.storeProvider.get());
    }
}
