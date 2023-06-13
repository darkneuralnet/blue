package zendesk.support.guide;

import dagger.MembersInjector;
import zendesk.core.NetworkInfoProvider;
import zendesk.support.HelpCenterProvider;
/* loaded from: classes8.dex */
public final class HelpCenterFragment_MembersInjector implements MembersInjector<HelpCenterFragment> {
    private final Y94<HelpCenterProvider> helpCenterProvider;
    private final Y94<NetworkInfoProvider> networkInfoProvider;

    public HelpCenterFragment_MembersInjector(Y94<HelpCenterProvider> y94, Y94<NetworkInfoProvider> y942) {
        this.helpCenterProvider = y94;
        this.networkInfoProvider = y942;
    }

    public static MembersInjector<HelpCenterFragment> create(Y94<HelpCenterProvider> y94, Y94<NetworkInfoProvider> y942) {
        return new HelpCenterFragment_MembersInjector(y94, y942);
    }

    public static void injectHelpCenterProvider(HelpCenterFragment helpCenterFragment, HelpCenterProvider helpCenterProvider) {
        helpCenterFragment.helpCenterProvider = helpCenterProvider;
    }

    public static void injectNetworkInfoProvider(HelpCenterFragment helpCenterFragment, NetworkInfoProvider networkInfoProvider) {
        helpCenterFragment.networkInfoProvider = networkInfoProvider;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(HelpCenterFragment helpCenterFragment) {
        injectHelpCenterProvider(helpCenterFragment, this.helpCenterProvider.get());
        injectNetworkInfoProvider(helpCenterFragment, this.networkInfoProvider.get());
    }
}
