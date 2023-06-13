package zendesk.support.request;

import dagger.MembersInjector;
import zendesk.core.ActionHandlerRegistry;
import zendesk.support.suas.Store;
/* loaded from: classes8.dex */
public final class RequestActivity_MembersInjector implements MembersInjector<RequestActivity> {
    private final Y94<ActionHandlerRegistry> actionHandlerRegistryProvider;
    private final Y94<ActionFactory> afProvider;
    private final Y94<HeadlessComponentListener> headlessComponentListenerProvider;
    private final Y94<C42732iT3> picassoProvider;
    private final Y94<Store> storeProvider;

    public RequestActivity_MembersInjector(Y94<Store> y94, Y94<ActionFactory> y942, Y94<HeadlessComponentListener> y943, Y94<C42732iT3> y944, Y94<ActionHandlerRegistry> y945) {
        this.storeProvider = y94;
        this.afProvider = y942;
        this.headlessComponentListenerProvider = y943;
        this.picassoProvider = y944;
        this.actionHandlerRegistryProvider = y945;
    }

    public static MembersInjector<RequestActivity> create(Y94<Store> y94, Y94<ActionFactory> y942, Y94<HeadlessComponentListener> y943, Y94<C42732iT3> y944, Y94<ActionHandlerRegistry> y945) {
        return new RequestActivity_MembersInjector(y94, y942, y943, y944, y945);
    }

    public static void injectActionHandlerRegistry(RequestActivity requestActivity, ActionHandlerRegistry actionHandlerRegistry) {
        requestActivity.actionHandlerRegistry = actionHandlerRegistry;
    }

    public static void injectAf(RequestActivity requestActivity, Object obj) {
        requestActivity.f121998af = (ActionFactory) obj;
    }

    public static void injectHeadlessComponentListener(RequestActivity requestActivity, Object obj) {
        requestActivity.headlessComponentListener = (HeadlessComponentListener) obj;
    }

    public static void injectPicasso(RequestActivity requestActivity, C42732iT3 c42732iT3) {
        requestActivity.picasso = c42732iT3;
    }

    public static void injectStore(RequestActivity requestActivity, Store store) {
        requestActivity.store = store;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RequestActivity requestActivity) {
        injectStore(requestActivity, this.storeProvider.get());
        injectAf(requestActivity, this.afProvider.get());
        injectHeadlessComponentListener(requestActivity, this.headlessComponentListenerProvider.get());
        injectPicasso(requestActivity, this.picassoProvider.get());
        injectActionHandlerRegistry(requestActivity, this.actionHandlerRegistryProvider.get());
    }
}
