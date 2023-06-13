package zendesk.support.request;

import dagger.MembersInjector;
import zendesk.support.suas.Store;
/* loaded from: classes8.dex */
public final class RequestViewConversationsDisabled_MembersInjector implements MembersInjector<RequestViewConversationsDisabled> {
    private final Y94<ActionFactory> afProvider;
    private final Y94<C42732iT3> picassoProvider;
    private final Y94<Store> storeProvider;

    public RequestViewConversationsDisabled_MembersInjector(Y94<Store> y94, Y94<ActionFactory> y942, Y94<C42732iT3> y943) {
        this.storeProvider = y94;
        this.afProvider = y942;
        this.picassoProvider = y943;
    }

    public static MembersInjector<RequestViewConversationsDisabled> create(Y94<Store> y94, Y94<ActionFactory> y942, Y94<C42732iT3> y943) {
        return new RequestViewConversationsDisabled_MembersInjector(y94, y942, y943);
    }

    public static void injectAf(RequestViewConversationsDisabled requestViewConversationsDisabled, Object obj) {
        requestViewConversationsDisabled.f121999af = (ActionFactory) obj;
    }

    public static void injectPicasso(RequestViewConversationsDisabled requestViewConversationsDisabled, C42732iT3 c42732iT3) {
        requestViewConversationsDisabled.picasso = c42732iT3;
    }

    public static void injectStore(RequestViewConversationsDisabled requestViewConversationsDisabled, Store store) {
        requestViewConversationsDisabled.store = store;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RequestViewConversationsDisabled requestViewConversationsDisabled) {
        injectStore(requestViewConversationsDisabled, this.storeProvider.get());
        injectAf(requestViewConversationsDisabled, this.afProvider.get());
        injectPicasso(requestViewConversationsDisabled, this.picassoProvider.get());
    }
}
