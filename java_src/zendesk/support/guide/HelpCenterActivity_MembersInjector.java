package zendesk.support.guide;

import dagger.MembersInjector;
import zendesk.core.ActionHandlerRegistry;
import zendesk.core.NetworkInfoProvider;
import zendesk.support.HelpCenterProvider;
import zendesk.support.HelpCenterSettingsProvider;
/* loaded from: classes8.dex */
public final class HelpCenterActivity_MembersInjector implements MembersInjector<HelpCenterActivity> {
    private final Y94<ActionHandlerRegistry> actionHandlerRegistryProvider;
    private final Y94<C32054Bx0> configurationHelperProvider;
    private final Y94<HelpCenterProvider> helpCenterProvider;
    private final Y94<NetworkInfoProvider> networkInfoProvider;
    private final Y94<HelpCenterSettingsProvider> settingsProvider;

    public HelpCenterActivity_MembersInjector(Y94<HelpCenterProvider> y94, Y94<HelpCenterSettingsProvider> y942, Y94<NetworkInfoProvider> y943, Y94<ActionHandlerRegistry> y944, Y94<C32054Bx0> y945) {
        this.helpCenterProvider = y94;
        this.settingsProvider = y942;
        this.networkInfoProvider = y943;
        this.actionHandlerRegistryProvider = y944;
        this.configurationHelperProvider = y945;
    }

    public static MembersInjector<HelpCenterActivity> create(Y94<HelpCenterProvider> y94, Y94<HelpCenterSettingsProvider> y942, Y94<NetworkInfoProvider> y943, Y94<ActionHandlerRegistry> y944, Y94<C32054Bx0> y945) {
        return new HelpCenterActivity_MembersInjector(y94, y942, y943, y944, y945);
    }

    public static void injectActionHandlerRegistry(HelpCenterActivity helpCenterActivity, ActionHandlerRegistry actionHandlerRegistry) {
        helpCenterActivity.actionHandlerRegistry = actionHandlerRegistry;
    }

    public static void injectConfigurationHelper(HelpCenterActivity helpCenterActivity, C32054Bx0 c32054Bx0) {
        helpCenterActivity.configurationHelper = c32054Bx0;
    }

    public static void injectHelpCenterProvider(HelpCenterActivity helpCenterActivity, HelpCenterProvider helpCenterProvider) {
        helpCenterActivity.helpCenterProvider = helpCenterProvider;
    }

    public static void injectNetworkInfoProvider(HelpCenterActivity helpCenterActivity, NetworkInfoProvider networkInfoProvider) {
        helpCenterActivity.networkInfoProvider = networkInfoProvider;
    }

    public static void injectSettingsProvider(HelpCenterActivity helpCenterActivity, HelpCenterSettingsProvider helpCenterSettingsProvider) {
        helpCenterActivity.settingsProvider = helpCenterSettingsProvider;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(HelpCenterActivity helpCenterActivity) {
        injectHelpCenterProvider(helpCenterActivity, this.helpCenterProvider.get());
        injectSettingsProvider(helpCenterActivity, this.settingsProvider.get());
        injectNetworkInfoProvider(helpCenterActivity, this.networkInfoProvider.get());
        injectActionHandlerRegistry(helpCenterActivity, this.actionHandlerRegistryProvider.get());
        injectConfigurationHelper(helpCenterActivity, this.configurationHelperProvider.get());
    }
}
