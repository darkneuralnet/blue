package zendesk.support.request;

import java.util.List;
import zendesk.support.suas.Reducer;
import zendesk.support.suas.Store;
/* loaded from: classes8.dex */
public final class RequestModule_ProvidesStoreFactory implements InterfaceC48812sj1<Store> {
    private final Y94<AsyncMiddleware> asyncMiddlewareProvider;
    private final Y94<List<Reducer>> reducersProvider;

    public RequestModule_ProvidesStoreFactory(Y94<List<Reducer>> y94, Y94<AsyncMiddleware> y942) {
        this.reducersProvider = y94;
        this.asyncMiddlewareProvider = y942;
    }

    public static RequestModule_ProvidesStoreFactory create(Y94<List<Reducer>> y94, Y94<AsyncMiddleware> y942) {
        return new RequestModule_ProvidesStoreFactory(y94, y942);
    }

    public static Store providesStore(List<Reducer> list, Object obj) {
        return (Store) C51679xZ3.m5002e(RequestModule.providesStore(list, (AsyncMiddleware) obj));
    }

    @Override // p000.Y94
    public Store get() {
        return providesStore(this.reducersProvider.get(), this.asyncMiddlewareProvider.get());
    }
}
