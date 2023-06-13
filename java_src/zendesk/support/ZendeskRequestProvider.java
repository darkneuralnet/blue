package zendesk.support;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import zendesk.core.AnonymousIdentity;
import zendesk.core.AuthenticationProvider;
import zendesk.core.AuthenticationType;
import zendesk.core.Identity;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public final class ZendeskRequestProvider implements RequestProvider {
    private static final String ALL_REQUEST_STATUSES = "new,open,pending,hold,solved,closed";
    private static final String GET_REQUESTS_SIDE_LOAD = "public_updated_at,last_commenting_agents,last_comment,first_comment";
    private static final String LOG_TAG = "ZendeskRequestProvider";
    private static final int MAX_TICKET_FIELDS = 5;
    private final AuthenticationProvider authenticationProvider;
    private final SupportBlipsProvider blipsProvider;
    private final SupportSdkMetadata metadata;
    private final ZendeskRequestService requestService;
    private final RequestSessionCache requestSessionCache;
    private final RequestStorage requestStorage;
    private final SupportSettingsProvider settingsProvider;
    private final ZendeskTracker zendeskTracker;

    public ZendeskRequestProvider(SupportSettingsProvider supportSettingsProvider, ZendeskRequestService zendeskRequestService, AuthenticationProvider authenticationProvider, RequestStorage requestStorage, RequestSessionCache requestSessionCache, ZendeskTracker zendeskTracker, SupportSdkMetadata supportSdkMetadata, SupportBlipsProvider supportBlipsProvider) {
        this.settingsProvider = supportSettingsProvider;
        this.requestService = zendeskRequestService;
        this.authenticationProvider = authenticationProvider;
        this.requestStorage = requestStorage;
        this.requestSessionCache = requestSessionCache;
        this.zendeskTracker = zendeskTracker;
        this.metadata = supportSdkMetadata;
        this.blipsProvider = supportBlipsProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCommentInternal(final String str, EndUserComment endUserComment, final AbstractC44415lI6<Comment> abstractC44415lI6) {
        this.requestService.addComment(str, endUserComment, new ZendeskCallbackSuccess<Request>(abstractC44415lI6) { // from class: zendesk.support.ZendeskRequestProvider.7
            @Override // zendesk.support.ZendeskCallbackSuccess, p000.AbstractC44415lI6
            public void onSuccess(Request request) {
                ZendeskRequestProvider.this.zendeskTracker.requestUpdated();
                ZendeskRequestProvider.this.blipsProvider.requestUpdated(str);
                if (request.getId() != null && request.getCommentCount() != null) {
                    ZendeskRequestProvider.this.requestStorage.updateRequestData(Collections.singletonList(request));
                } else {
                    C33694Ix2.m101447l(ZendeskRequestProvider.LOG_TAG, "The ID and / or comment count was missing. Cannot store comment totalUpdates.", new Object[0]);
                }
                AbstractC44415lI6 abstractC44415lI62 = abstractC44415lI6;
                if (abstractC44415lI62 != null) {
                    abstractC44415lI62.onSuccess(request.getLastComment());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addServerTags(CreateRequest createRequest, SupportSdkSettings supportSdkSettings) {
        List<String> m29955b = C43505jm0.m29955b(createRequest.getTags(), supportSdkSettings.getContactZendeskTags());
        if (C43505jm0.m29948i(m29955b)) {
            C33694Ix2.m101457b(LOG_TAG, "Adding tags to feedback...", new Object[0]);
            createRequest.setTags(m29955b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void answerCallbackOnConversationsDisabled(AbstractC44415lI6 abstractC44415lI6) {
        C33694Ix2.m101457b(LOG_TAG, "Conversations disabled, this feature is not available on your plan or was disabled.", new Object[0]);
        if (abstractC44415lI6 != null) {
            abstractC44415lI6.onError(new C49968ug1("Access Denied"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean areConversationsEnabled(SupportSdkSettings supportSdkSettings) {
        if (supportSdkSettings == null) {
            return false;
        }
        return supportSdkSettings.isConversationsEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static RequestUpdates calcRequestUpdates(List<RequestData> list) {
        HashMap hashMap = new HashMap(list.size());
        for (RequestData requestData : list) {
            int unreadComments = requestData.unreadComments();
            if (unreadComments != 0) {
                hashMap.put(requestData.getId(), Integer.valueOf(unreadComments));
            }
        }
        return new RequestUpdates(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<TicketForm> convertTicketFormResponse(List<RawTicketForm> list, List<RawTicketField> list2) {
        ArrayList arrayList = new ArrayList();
        Map<Long, TicketField> createTicketFieldMap = createTicketFieldMap(list2);
        for (RawTicketForm rawTicketForm : list) {
            arrayList.add(createTicketFormFromResponse(rawTicketForm, createTicketFieldMap));
        }
        return arrayList;
    }

    private static Map<Long, TicketField> createTicketFieldMap(List<RawTicketField> list) {
        HashMap hashMap = new HashMap(list.size());
        for (RawTicketField rawTicketField : list) {
            hashMap.put(Long.valueOf(rawTicketField.getId()), TicketField.create(rawTicketField));
        }
        return hashMap;
    }

    private static TicketForm createTicketFormFromResponse(RawTicketForm rawTicketForm, Map<Long, TicketField> map) {
        ArrayList arrayList = new ArrayList();
        for (Long l : rawTicketForm.getTicketFieldIds()) {
            if (l != null && map.get(l) != null) {
                arrayList.add(map.get(l));
            }
        }
        return RawTicketForm.create(rawTicketForm, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getAllRequestsInternal(String str, AuthenticationType authenticationType, final AbstractC44415lI6<List<Request>> abstractC44415lI6) {
        if (C44504lS5.m27271d(str)) {
            str = ALL_REQUEST_STATUSES;
        }
        ZendeskCallbackSuccess<List<Request>> zendeskCallbackSuccess = new ZendeskCallbackSuccess<List<Request>>(abstractC44415lI6) { // from class: zendesk.support.ZendeskRequestProvider.3
            @Override // zendesk.support.ZendeskCallbackSuccess, p000.AbstractC44415lI6
            public void onSuccess(List<Request> list) {
                ZendeskRequestProvider.this.requestStorage.updateRequestData(list);
                AbstractC44415lI6 abstractC44415lI62 = abstractC44415lI6;
                if (abstractC44415lI62 != null) {
                    abstractC44415lI62.onSuccess(list);
                }
            }
        };
        if (authenticationType == AuthenticationType.ANONYMOUS) {
            List<RequestData> requestData = this.requestStorage.getRequestData();
            ArrayList arrayList = new ArrayList(requestData.size());
            for (RequestData requestData2 : requestData) {
                arrayList.add(requestData2.getId());
            }
            if (C43505jm0.m29950g(arrayList)) {
                C33694Ix2.m101447l(LOG_TAG, "getAllRequestsInternal: There are no requests to fetch", new Object[0]);
                if (abstractC44415lI6 != null) {
                    abstractC44415lI6.onSuccess(new ArrayList());
                    return;
                }
                return;
            }
            this.requestService.getAllRequests(C44504lS5.m27269f(arrayList), str, GET_REQUESTS_SIDE_LOAD, zendeskCallbackSuccess);
            return;
        }
        this.requestService.getAllRequests(str, GET_REQUESTS_SIDE_LOAD, zendeskCallbackSuccess);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void internalCreateRequest(CreateRequest createRequest, AuthenticationType authenticationType, Identity identity, final AbstractC44415lI6<Request> abstractC44415lI6) {
        ZendeskCallbackSuccess<Request> zendeskCallbackSuccess = new ZendeskCallbackSuccess<Request>(abstractC44415lI6) { // from class: zendesk.support.ZendeskRequestProvider.2
            @Override // zendesk.support.ZendeskCallbackSuccess, p000.AbstractC44415lI6
            public void onSuccess(Request request) {
                if (request != null && request.getId() != null) {
                    ZendeskRequestProvider.this.zendeskTracker.requestCreated();
                    ZendeskRequestProvider.this.blipsProvider.requestCreated(request.getId());
                    ZendeskRequestProvider.this.requestStorage.updateRequestData(Collections.singletonList(request));
                    AbstractC44415lI6 abstractC44415lI62 = abstractC44415lI6;
                    if (abstractC44415lI62 != null) {
                        abstractC44415lI62.onSuccess(request);
                        return;
                    }
                    return;
                }
                onError(new C49968ug1("The request was created, but the ID is unknown."));
            }
        };
        if (authenticationType == AuthenticationType.ANONYMOUS && identity != null && (identity instanceof AnonymousIdentity)) {
            this.requestService.createRequest(((AnonymousIdentity) identity).getSdkGuid(), createRequest, zendeskCallbackSuccess);
            return;
        }
        this.requestService.createRequest(null, createRequest, zendeskCallbackSuccess);
    }

    @Override // zendesk.support.RequestProvider
    public void addComment(final String str, final EndUserComment endUserComment, final AbstractC44415lI6<Comment> abstractC44415lI6) {
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(abstractC44415lI6) { // from class: zendesk.support.ZendeskRequestProvider.8
            @Override // zendesk.support.ZendeskCallbackSuccess, p000.AbstractC44415lI6
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                if (ZendeskRequestProvider.areConversationsEnabled(supportSdkSettings)) {
                    ZendeskRequestProvider.this.addCommentInternal(str, endUserComment, abstractC44415lI6);
                } else {
                    ZendeskRequestProvider.answerCallbackOnConversationsDisabled(abstractC44415lI6);
                }
            }
        });
    }

    @Override // zendesk.support.RequestProvider
    public void createRequest(final CreateRequest createRequest, final AbstractC44415lI6<Request> abstractC44415lI6) {
        boolean z;
        if (createRequest == null) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            C33694Ix2.m101454e(LOG_TAG, "configuration is invalid: request null", new Object[0]);
            if (abstractC44415lI6 != null) {
                abstractC44415lI6.onError(new C49968ug1("configuration is invalid: request null"));
                return;
            }
            return;
        }
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(abstractC44415lI6) { // from class: zendesk.support.ZendeskRequestProvider.1
            @Override // zendesk.support.ZendeskCallbackSuccess, p000.AbstractC44415lI6
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                createRequest.setMetadata(ZendeskRequestProvider.this.metadata.getDeviceInfoAsMapForMetaData());
                ZendeskRequestProvider.this.addServerTags(createRequest, supportSdkSettings);
                ZendeskRequestProvider.this.internalCreateRequest(createRequest, supportSdkSettings.getAuthenticationType(), ZendeskRequestProvider.this.authenticationProvider.getIdentity(), abstractC44415lI6);
            }
        });
    }

    @Override // zendesk.support.RequestProvider
    public void getAllRequests(AbstractC44415lI6<List<Request>> abstractC44415lI6) {
        getRequests(null, abstractC44415lI6);
    }

    @Override // zendesk.support.RequestProvider
    public void getComments(final String str, final AbstractC44415lI6<CommentsResponse> abstractC44415lI6) {
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(abstractC44415lI6) { // from class: zendesk.support.ZendeskRequestProvider.5
            @Override // zendesk.support.ZendeskCallbackSuccess, p000.AbstractC44415lI6
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                if (ZendeskRequestProvider.areConversationsEnabled(supportSdkSettings)) {
                    ZendeskRequestProvider.this.requestService.getComments(str, abstractC44415lI6);
                } else {
                    ZendeskRequestProvider.answerCallbackOnConversationsDisabled(abstractC44415lI6);
                }
            }
        });
    }

    @Override // zendesk.support.RequestProvider
    public void getCommentsSince(final String str, final Date date, final boolean z, final AbstractC44415lI6<CommentsResponse> abstractC44415lI6) {
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(abstractC44415lI6) { // from class: zendesk.support.ZendeskRequestProvider.6
            @Override // zendesk.support.ZendeskCallbackSuccess, p000.AbstractC44415lI6
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                if (ZendeskRequestProvider.areConversationsEnabled(supportSdkSettings)) {
                    ZendeskRequestProvider.this.requestService.getCommentsSince(str, date, z, abstractC44415lI6);
                } else {
                    ZendeskRequestProvider.answerCallbackOnConversationsDisabled(abstractC44415lI6);
                }
            }
        });
    }

    @Override // zendesk.support.RequestProvider
    public void getRequest(final String str, final AbstractC44415lI6<Request> abstractC44415lI6) {
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(abstractC44415lI6) { // from class: zendesk.support.ZendeskRequestProvider.9
            @Override // zendesk.support.ZendeskCallbackSuccess, p000.AbstractC44415lI6
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                if (ZendeskRequestProvider.areConversationsEnabled(supportSdkSettings)) {
                    ZendeskRequestProvider.this.requestService.getRequest(str, ZendeskRequestProvider.GET_REQUESTS_SIDE_LOAD, abstractC44415lI6);
                } else {
                    ZendeskRequestProvider.answerCallbackOnConversationsDisabled(abstractC44415lI6);
                }
            }
        });
    }

    @Override // zendesk.support.RequestProvider
    public void getRequests(final String str, final AbstractC44415lI6<List<Request>> abstractC44415lI6) {
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(abstractC44415lI6) { // from class: zendesk.support.ZendeskRequestProvider.4
            @Override // zendesk.support.ZendeskCallbackSuccess, p000.AbstractC44415lI6
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                if (ZendeskRequestProvider.areConversationsEnabled(supportSdkSettings)) {
                    ZendeskRequestProvider.this.getAllRequestsInternal(str, supportSdkSettings.getAuthenticationType(), abstractC44415lI6);
                } else {
                    ZendeskRequestProvider.answerCallbackOnConversationsDisabled(abstractC44415lI6);
                }
            }
        });
    }

    @Override // zendesk.support.RequestProvider
    public void getTicketFormsById(List<Long> list, final AbstractC44415lI6<List<TicketForm>> abstractC44415lI6) {
        if (C43505jm0.m29950g(list)) {
            if (abstractC44415lI6 != null) {
                abstractC44415lI6.onError(new C49968ug1("Ticket forms must at least contain 1 Id"));
                return;
            }
            return;
        }
        final ArrayList arrayList = new ArrayList();
        if (list.size() > 5) {
            arrayList.addAll(list.subList(0, 5));
            C33694Ix2.m101457b(LOG_TAG, "Maximum number of allowed ticket fields: %d.", 5);
        } else {
            arrayList.addAll(list);
        }
        if (this.requestSessionCache.containsAllTicketForms(arrayList)) {
            if (abstractC44415lI6 != null) {
                abstractC44415lI6.onSuccess(this.requestSessionCache.getTicketFormsById(arrayList));
                return;
            }
            return;
        }
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(abstractC44415lI6) { // from class: zendesk.support.ZendeskRequestProvider.10
            @Override // zendesk.support.ZendeskCallbackSuccess, p000.AbstractC44415lI6
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                if (supportSdkSettings.isTicketFormSupportAvailable()) {
                    ZendeskRequestProvider.this.requestService.getTicketFormsById(C44504lS5.m27267h(arrayList), new ZendeskCallbackSuccess<RawTicketFormResponse>(abstractC44415lI6) { // from class: zendesk.support.ZendeskRequestProvider.10.1
                        @Override // zendesk.support.ZendeskCallbackSuccess, p000.AbstractC44415lI6
                        public void onSuccess(RawTicketFormResponse rawTicketFormResponse) {
                            List<TicketForm> convertTicketFormResponse = ZendeskRequestProvider.convertTicketFormResponse(rawTicketFormResponse.getTicketForms(), rawTicketFormResponse.getTicketFields());
                            ZendeskRequestProvider.this.requestSessionCache.updateTicketFormCache(convertTicketFormResponse);
                            AbstractC44415lI6 abstractC44415lI62 = abstractC44415lI6;
                            if (abstractC44415lI62 != null) {
                                abstractC44415lI62.onSuccess(convertTicketFormResponse);
                            }
                        }
                    });
                    return;
                }
                AbstractC44415lI6 abstractC44415lI62 = abstractC44415lI6;
                if (abstractC44415lI62 != null) {
                    abstractC44415lI62.onError(new C49968ug1("Ticket form support disabled."));
                }
            }
        });
    }

    @Override // zendesk.support.RequestProvider
    public void getUpdatesForDevice(final AbstractC44415lI6<RequestUpdates> abstractC44415lI6) {
        if (!this.requestStorage.isRequestDataExpired()) {
            abstractC44415lI6.onSuccess(calcRequestUpdates(this.requestStorage.getRequestData()));
        } else {
            this.settingsProvider.getSettings(new AbstractC44415lI6<SupportSdkSettings>() { // from class: zendesk.support.ZendeskRequestProvider.11
                @Override // p000.AbstractC44415lI6
                public void onError(InterfaceC48782sg1 interfaceC48782sg1) {
                    abstractC44415lI6.onError(interfaceC48782sg1);
                }

                @Override // p000.AbstractC44415lI6
                public void onSuccess(SupportSdkSettings supportSdkSettings) {
                    if (!supportSdkSettings.isConversationsEnabled()) {
                        ZendeskRequestProvider.answerCallbackOnConversationsDisabled(abstractC44415lI6);
                    } else {
                        ZendeskRequestProvider.this.getAllRequestsInternal(null, supportSdkSettings.getAuthenticationType(), new ZendeskCallbackSuccess<List<Request>>(abstractC44415lI6) { // from class: zendesk.support.ZendeskRequestProvider.11.1
                            @Override // zendesk.support.ZendeskCallbackSuccess, p000.AbstractC44415lI6
                            public void onSuccess(List<Request> list) {
                                abstractC44415lI6.onSuccess(ZendeskRequestProvider.calcRequestUpdates(ZendeskRequestProvider.this.requestStorage.getRequestData()));
                            }
                        });
                    }
                }
            });
        }
    }

    @Override // zendesk.support.RequestProvider
    public void markRequestAsRead(String str, int i) {
        this.requestStorage.markRequestAsRead(str, i);
    }

    @Override // zendesk.support.RequestProvider
    public void markRequestAsUnread(String str) {
        this.requestStorage.markRequestAsUnread(str);
    }
}
