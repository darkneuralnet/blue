package zendesk.support.request;

import zendesk.core.AnonymousIdentity;
import zendesk.core.AuthenticationProvider;
import zendesk.core.Identity;
import zendesk.support.SupportSdkSettings;
import zendesk.support.SupportSettingsProvider;
import zendesk.support.request.AsyncMiddleware;
import zendesk.support.suas.Dispatcher;
import zendesk.support.suas.GetState;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class ActionLoadSettings implements AsyncMiddleware.AsyncAction {
    private final ActionFactory actionFactory;
    private final AuthenticationProvider authProvider;
    private final SupportSettingsProvider settingsProvider;

    public ActionLoadSettings(ActionFactory actionFactory, SupportSettingsProvider supportSettingsProvider, AuthenticationProvider authenticationProvider) {
        this.actionFactory = actionFactory;
        this.settingsProvider = supportSettingsProvider;
        this.authProvider = authenticationProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public StateSettings constructSettings(SupportSdkSettings supportSdkSettings) {
        Identity identity = this.authProvider.getIdentity();
        if (identity instanceof AnonymousIdentity) {
            AnonymousIdentity anonymousIdentity = (AnonymousIdentity) identity;
            return StateSettings.fromSupportSettings(supportSdkSettings, C44504lS5.m27273b(anonymousIdentity.getEmail()), C44504lS5.m27273b(anonymousIdentity.getName()));
        }
        return StateSettings.fromSupportSettings(supportSdkSettings, true, true);
    }

    @Override // zendesk.support.request.AsyncMiddleware.AsyncAction
    public void actionQueued(Dispatcher dispatcher, GetState getState) {
        dispatcher.dispatch(this.actionFactory.loadSettings());
    }

    @Override // zendesk.support.request.AsyncMiddleware.AsyncAction
    public void execute(final Dispatcher dispatcher, GetState getState, final AsyncMiddleware.Callback callback) {
        this.settingsProvider.getSettings(new AbstractC44415lI6<SupportSdkSettings>() { // from class: zendesk.support.request.ActionLoadSettings.1
            @Override // p000.AbstractC44415lI6
            public void onError(InterfaceC48782sg1 interfaceC48782sg1) {
                C33694Ix2.m101447l("RequestActivity", "Error loading settings. Error: '%s'", interfaceC48782sg1.mo9891c());
                dispatcher.dispatch(ActionLoadSettings.this.actionFactory.loadSettingsError(interfaceC48782sg1));
                callback.done();
            }

            @Override // p000.AbstractC44415lI6
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                dispatcher.dispatch(ActionLoadSettings.this.actionFactory.loadSettingsSuccess(ActionLoadSettings.this.constructSettings(supportSdkSettings)));
                callback.done();
            }
        });
    }
}
