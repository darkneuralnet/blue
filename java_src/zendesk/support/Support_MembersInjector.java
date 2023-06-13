package zendesk.support;

import dagger.MembersInjector;
import zendesk.core.ActionHandlerRegistry;
import zendesk.core.AuthenticationProvider;
/* loaded from: classes8.dex */
public final class Support_MembersInjector implements MembersInjector<Support> {
    private final Y94<ActionHandlerRegistry> actionHandlerRegistryProvider;
    private final Y94<AuthenticationProvider> authenticationProvider;
    private final Y94<SupportBlipsProvider> blipsProvider;
    private final Y94<ProviderStore> providerStoreProvider;
    private final Y94<RequestMigrator> requestMigratorProvider;
    private final Y94<RequestProvider> requestProvider;
    private final Y94<SupportModule> supportModuleProvider;

    public Support_MembersInjector(Y94<ProviderStore> y94, Y94<SupportModule> y942, Y94<RequestMigrator> y943, Y94<SupportBlipsProvider> y944, Y94<ActionHandlerRegistry> y945, Y94<RequestProvider> y946, Y94<AuthenticationProvider> y947) {
        this.providerStoreProvider = y94;
        this.supportModuleProvider = y942;
        this.requestMigratorProvider = y943;
        this.blipsProvider = y944;
        this.actionHandlerRegistryProvider = y945;
        this.requestProvider = y946;
        this.authenticationProvider = y947;
    }

    public static MembersInjector<Support> create(Y94<ProviderStore> y94, Y94<SupportModule> y942, Y94<RequestMigrator> y943, Y94<SupportBlipsProvider> y944, Y94<ActionHandlerRegistry> y945, Y94<RequestProvider> y946, Y94<AuthenticationProvider> y947) {
        return new Support_MembersInjector(y94, y942, y943, y944, y945, y946, y947);
    }

    public static void injectActionHandlerRegistry(Support support, ActionHandlerRegistry actionHandlerRegistry) {
        support.actionHandlerRegistry = actionHandlerRegistry;
    }

    public static void injectAuthenticationProvider(Support support, AuthenticationProvider authenticationProvider) {
        support.authenticationProvider = authenticationProvider;
    }

    public static void injectBlipsProvider(Support support, SupportBlipsProvider supportBlipsProvider) {
        support.blipsProvider = supportBlipsProvider;
    }

    public static void injectProviderStore(Support support, ProviderStore providerStore) {
        support.providerStore = providerStore;
    }

    public static void injectRequestMigrator(Support support, Object obj) {
        support.requestMigrator = (RequestMigrator) obj;
    }

    public static void injectRequestProvider(Support support, RequestProvider requestProvider) {
        support.requestProvider = requestProvider;
    }

    public static void injectSupportModule(Support support, SupportModule supportModule) {
        support.supportModule = supportModule;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(Support support) {
        injectProviderStore(support, this.providerStoreProvider.get());
        injectSupportModule(support, this.supportModuleProvider.get());
        injectRequestMigrator(support, this.requestMigratorProvider.get());
        injectBlipsProvider(support, this.blipsProvider.get());
        injectActionHandlerRegistry(support, this.actionHandlerRegistryProvider.get());
        injectRequestProvider(support, this.requestProvider.get());
        injectAuthenticationProvider(support, this.authenticationProvider.get());
    }
}
