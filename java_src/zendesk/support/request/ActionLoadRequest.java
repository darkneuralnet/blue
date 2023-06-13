package zendesk.support.request;

import zendesk.support.Request;
import zendesk.support.RequestProvider;
import zendesk.support.request.AsyncMiddleware;
import zendesk.support.suas.Dispatcher;
import zendesk.support.suas.GetState;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class ActionLoadRequest implements AsyncMiddleware.AsyncAction {

    /* renamed from: af */
    private final ActionFactory f121972af;
    private final RequestProvider requestProvider;

    public ActionLoadRequest(ActionFactory actionFactory, RequestProvider requestProvider) {
        this.f121972af = actionFactory;
        this.requestProvider = requestProvider;
    }

    @Override // zendesk.support.request.AsyncMiddleware.AsyncAction
    public void actionQueued(Dispatcher dispatcher, GetState getState) {
        dispatcher.dispatch(this.f121972af.loadRequest());
    }

    @Override // zendesk.support.request.AsyncMiddleware.AsyncAction
    public void execute(final Dispatcher dispatcher, GetState getState, final AsyncMiddleware.Callback callback) {
        StateConversation fromState = StateConversation.fromState(getState.getState());
        String remoteId = fromState.getRemoteId();
        if (!C44504lS5.m27273b(remoteId)) {
            C33694Ix2.m101457b("RequestActivity", "Skip loading request. No remote id found.", new Object[0]);
            dispatcher.dispatch(this.f121972af.skipAction());
            callback.done();
        } else if (fromState.getStatus() != null) {
            C33694Ix2.m101457b("RequestActivity", "Skip loading request. Request status already available.", new Object[0]);
            dispatcher.dispatch(this.f121972af.skipAction());
            callback.done();
        } else {
            this.requestProvider.getRequest(remoteId, new AbstractC44415lI6<Request>() { // from class: zendesk.support.request.ActionLoadRequest.1
                @Override // p000.AbstractC44415lI6
                public void onError(InterfaceC48782sg1 interfaceC48782sg1) {
                    C33694Ix2.m101447l("RequestActivity", "Error loading request. Error: '%s'", interfaceC48782sg1.mo9891c());
                    dispatcher.dispatch(ActionLoadRequest.this.f121972af.loadRequestError(interfaceC48782sg1));
                    callback.done();
                }

                @Override // p000.AbstractC44415lI6
                public void onSuccess(Request request) {
                    dispatcher.dispatch(ActionLoadRequest.this.f121972af.loadRequestSuccess(request));
                    callback.done();
                }
            });
        }
    }
}
