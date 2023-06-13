package zendesk.support.request;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import zendesk.support.AttachmentFile;
import zendesk.support.IdUtil;
import zendesk.support.SupportBlipsProvider;
import zendesk.support.SupportUiStorage;
import zendesk.support.request.AsyncMiddleware;
import zendesk.support.request.ComponentPersistence;
import zendesk.support.suas.Dispatcher;
import zendesk.support.suas.GetState;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class ActionInstallConfiguration implements AsyncMiddleware.AsyncAction {

    /* renamed from: af */
    private final ActionFactory f121968af;
    private final SupportBlipsProvider blipsProvider;
    private final Executor executor;
    private final Executor mainThreadExecutor;
    private final RequestConfiguration startConfig;
    private final SupportUiStorage supportUiStorage;

    public ActionInstallConfiguration(SupportUiStorage supportUiStorage, RequestConfiguration requestConfiguration, Executor executor, Executor executor2, ActionFactory actionFactory, SupportBlipsProvider supportBlipsProvider) {
        this.supportUiStorage = supportUiStorage;
        this.startConfig = requestConfiguration;
        this.executor = executor;
        this.mainThreadExecutor = executor2;
        this.f121968af = actionFactory;
        this.blipsProvider = supportBlipsProvider;
    }

    @Override // zendesk.support.request.AsyncMiddleware.AsyncAction
    public void actionQueued(Dispatcher dispatcher, GetState getState) {
    }

    @Override // zendesk.support.request.AsyncMiddleware.AsyncAction
    public void execute(final Dispatcher dispatcher, GetState getState, final AsyncMiddleware.Callback callback) {
        this.executor.execute(new Runnable() { // from class: zendesk.support.request.ActionInstallConfiguration.1
            @Override // java.lang.Runnable
            public void run() {
                List<AttachmentFile> arrayList;
                boolean m27273b = C44504lS5.m27273b(ActionInstallConfiguration.this.startConfig.getRequestId());
                boolean m27273b2 = C44504lS5.m27273b(ActionInstallConfiguration.this.startConfig.getLocalRequestId());
                String requestId = ActionInstallConfiguration.this.startConfig.getRequestId();
                String localRequestId = ActionInstallConfiguration.this.startConfig.getLocalRequestId();
                if (!m27273b || !m27273b2) {
                    ComponentPersistence.RequestIdMapper requestIdMapper = (ComponentPersistence.RequestIdMapper) ActionInstallConfiguration.this.supportUiStorage.read(SupportUiStorage.REQUEST_MAPPER, ComponentPersistence.RequestIdMapper.class);
                    if (requestIdMapper != null) {
                        if (m27273b2) {
                            requestId = requestIdMapper.getRemoteId(localRequestId);
                        } else if (m27273b) {
                            localRequestId = requestIdMapper.getLocalId(requestId);
                        }
                    }
                    if (!C44504lS5.m27273b(localRequestId)) {
                        localRequestId = IdUtil.newStringId();
                    }
                }
                String str = requestId;
                String str2 = localRequestId;
                if (C44504lS5.m27273b(str)) {
                    ActionInstallConfiguration.this.blipsProvider.requestViewed(str);
                }
                C33694Ix2.m101457b("RequestActivity", "Request information loaded from disk. Remote id: '%s'. Local id: '%s'", str, str2);
                if (C44504lS5.m27271d(str)) {
                    arrayList = ActionInstallConfiguration.this.startConfig.getFilesAsAttachments();
                } else {
                    arrayList = new ArrayList<>();
                }
                final RequestConfiguration requestConfiguration = new RequestConfiguration(ActionInstallConfiguration.this.startConfig.getRequestSubject(), ActionInstallConfiguration.this.startConfig.getTags(), str, str2, ActionInstallConfiguration.this.startConfig.getRequestStatus(), ActionInstallConfiguration.this.startConfig.getCustomFields(), ActionInstallConfiguration.this.startConfig.getTicketFormId(), arrayList, ActionInstallConfiguration.this.startConfig.hasAgentReplies(), ActionInstallConfiguration.this.startConfig.getConfigurations());
                ActionInstallConfiguration.this.mainThreadExecutor.execute(new Runnable() { // from class: zendesk.support.request.ActionInstallConfiguration.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        RunnableC313621 runnableC313621 = RunnableC313621.this;
                        dispatcher.dispatch(ActionInstallConfiguration.this.f121968af.startConfig(requestConfiguration));
                        callback.done();
                    }
                });
            }
        });
    }
}
