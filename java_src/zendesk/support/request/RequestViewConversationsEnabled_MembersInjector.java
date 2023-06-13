package zendesk.support.request;

import dagger.MembersInjector;
import zendesk.support.suas.Store;
/* loaded from: classes8.dex */
public final class RequestViewConversationsEnabled_MembersInjector implements MembersInjector<RequestViewConversationsEnabled> {
    private final Y94<ActionFactory> afProvider;
    private final Y94<CellFactory> cellFactoryProvider;
    private final Y94<C42732iT3> picassoProvider;
    private final Y94<Store> storeProvider;

    public RequestViewConversationsEnabled_MembersInjector(Y94<Store> y94, Y94<ActionFactory> y942, Y94<CellFactory> y943, Y94<C42732iT3> y944) {
        this.storeProvider = y94;
        this.afProvider = y942;
        this.cellFactoryProvider = y943;
        this.picassoProvider = y944;
    }

    public static MembersInjector<RequestViewConversationsEnabled> create(Y94<Store> y94, Y94<ActionFactory> y942, Y94<CellFactory> y943, Y94<C42732iT3> y944) {
        return new RequestViewConversationsEnabled_MembersInjector(y94, y942, y943, y944);
    }

    public static void injectAf(RequestViewConversationsEnabled requestViewConversationsEnabled, Object obj) {
        requestViewConversationsEnabled.f122000af = (ActionFactory) obj;
    }

    public static void injectCellFactory(RequestViewConversationsEnabled requestViewConversationsEnabled, Object obj) {
        requestViewConversationsEnabled.cellFactory = (CellFactory) obj;
    }

    public static void injectPicasso(RequestViewConversationsEnabled requestViewConversationsEnabled, C42732iT3 c42732iT3) {
        requestViewConversationsEnabled.picasso = c42732iT3;
    }

    public static void injectStore(RequestViewConversationsEnabled requestViewConversationsEnabled, Store store) {
        requestViewConversationsEnabled.store = store;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RequestViewConversationsEnabled requestViewConversationsEnabled) {
        injectStore(requestViewConversationsEnabled, this.storeProvider.get());
        injectAf(requestViewConversationsEnabled, this.afProvider.get());
        injectCellFactory(requestViewConversationsEnabled, this.cellFactoryProvider.get());
        injectPicasso(requestViewConversationsEnabled, this.picassoProvider.get());
    }
}
