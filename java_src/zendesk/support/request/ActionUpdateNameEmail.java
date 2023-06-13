package zendesk.support.request;

import zendesk.core.AnonymousIdentity;
import zendesk.core.AuthenticationProvider;
import zendesk.core.Identity;
import zendesk.core.Zendesk;
import zendesk.support.request.AsyncMiddleware;
import zendesk.support.suas.Dispatcher;
import zendesk.support.suas.GetState;
/* loaded from: classes8.dex */
class ActionUpdateNameEmail implements AsyncMiddleware.AsyncAction {
    private final AuthenticationProvider authenticationProvider;
    private final String email;
    private final String name;

    /* renamed from: zendesk  reason: collision with root package name */
    private final Zendesk f122705zendesk;

    public ActionUpdateNameEmail(String str, String str2, AuthenticationProvider authenticationProvider, Zendesk zendesk2) {
        this.name = str;
        this.email = str2;
        this.authenticationProvider = authenticationProvider;
        this.f122705zendesk = zendesk2;
    }

    @Override // zendesk.support.request.AsyncMiddleware.AsyncAction
    public void actionQueued(Dispatcher dispatcher, GetState getState) {
    }

    @Override // zendesk.support.request.AsyncMiddleware.AsyncAction
    public void execute(Dispatcher dispatcher, GetState getState, AsyncMiddleware.Callback callback) {
        Identity identity = this.authenticationProvider.getIdentity();
        if (identity instanceof AnonymousIdentity) {
            AnonymousIdentity anonymousIdentity = (AnonymousIdentity) identity;
            if (C44504lS5.m27273b(this.email) && !this.email.equals(anonymousIdentity.getEmail())) {
                anonymousIdentity = (AnonymousIdentity) new AnonymousIdentity.Builder().withEmailIdentifier(this.email).withNameIdentifier(anonymousIdentity.getName()).build();
            }
            if (C44504lS5.m27273b(this.name) && !this.name.equals(anonymousIdentity.getName())) {
                anonymousIdentity = (AnonymousIdentity) new AnonymousIdentity.Builder().withEmailIdentifier(anonymousIdentity.getEmail()).withNameIdentifier(this.name).build();
            }
            if (anonymousIdentity != identity) {
                this.f122705zendesk.setIdentity(anonymousIdentity);
            }
        }
        callback.done();
    }
}
