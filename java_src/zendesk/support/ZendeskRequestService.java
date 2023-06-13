package zendesk.support;

import com.amazonaws.util.DateUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import p000.ON4;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class ZendeskRequestService {
    private static final String LOG_TAG = "ZendeskRequestService";
    private static final String ROLE_AGENT = "agent";
    private static final String ROLE_USER = "end_user";
    private static final String TICKET_FIELDS_INCLUDE = "ticket_fields";
    private final DateFormat iso8601;
    private final ON4.InterfaceC5984b<RequestResponse, Request> requestExtractor;
    private final RequestService requestService;
    private final ON4.InterfaceC5984b<RequestsResponse, List<Request>> requestsExtractor;

    public ZendeskRequestService(RequestService requestService) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateUtils.ALTERNATE_ISO8601_DATE_PATTERN, Locale.US);
        this.iso8601 = simpleDateFormat;
        this.requestsExtractor = new ON4.InterfaceC5984b<RequestsResponse, List<Request>>() { // from class: zendesk.support.ZendeskRequestService.3
            @Override // p000.ON4.InterfaceC5984b
            public List<Request> extract(RequestsResponse requestsResponse) {
                Map agentMap = ZendeskRequestService.getAgentMap(requestsResponse.getLastCommentingAgents());
                ArrayList arrayList = new ArrayList();
                for (Request request : requestsResponse.getRequests()) {
                    arrayList.add(ZendeskRequestService.updateLastCommentingAgents(request, agentMap));
                }
                return arrayList;
            }
        };
        this.requestExtractor = new ON4.InterfaceC5984b<RequestResponse, Request>() { // from class: zendesk.support.ZendeskRequestService.4
            @Override // p000.ON4.InterfaceC5984b
            public Request extract(RequestResponse requestResponse) {
                return ZendeskRequestService.updateLastCommentingAgents(requestResponse.getRequest(), ZendeskRequestService.getAgentMap(requestResponse.getLastCommentingAgents()));
            }
        };
        this.requestService = requestService;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<Long, User> getAgentMap(List<User> list) {
        HashMap hashMap = new HashMap(list.size());
        for (User user : list) {
            hashMap.put(user.getId(), new User(user.getId(), user.getName(), user.getPhoto(), true, -1L, null, null));
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Request updateLastCommentingAgents(Request request, Map<Long, User> map) {
        ArrayList arrayList = new ArrayList(request.getLastCommentingAgentsIds().size());
        for (Long l : request.getLastCommentingAgentsIds()) {
            arrayList.add(map.get(l));
        }
        request.setLastCommentingAgents(arrayList);
        return request;
    }

    public void addComment(String str, EndUserComment endUserComment, AbstractC44415lI6<Request> abstractC44415lI6) {
        UpdateRequestWrapper updateRequestWrapper = new UpdateRequestWrapper();
        Request request = new Request();
        request.setComment(endUserComment);
        updateRequestWrapper.setRequest(request);
        this.requestService.addComment(str, updateRequestWrapper).mo1284E0(new ON4(abstractC44415lI6, new ON4.InterfaceC5984b<RequestResponse, Request>() { // from class: zendesk.support.ZendeskRequestService.2
            @Override // p000.ON4.InterfaceC5984b
            public Request extract(RequestResponse requestResponse) {
                return requestResponse.getRequest();
            }
        }));
    }

    public void createRequest(String str, CreateRequest createRequest, AbstractC44415lI6<Request> abstractC44415lI6) {
        this.requestService.createRequest(str, new CreateRequestWrapper(createRequest)).mo1284E0(new ON4(abstractC44415lI6, new ON4.InterfaceC5984b<RequestResponse, Request>() { // from class: zendesk.support.ZendeskRequestService.1
            @Override // p000.ON4.InterfaceC5984b
            public Request extract(RequestResponse requestResponse) {
                return requestResponse.getRequest();
            }
        }));
    }

    public void getAllRequests(String str, String str2, AbstractC44415lI6<List<Request>> abstractC44415lI6) {
        this.requestService.getAllRequests(str, str2).mo1284E0(new ON4(abstractC44415lI6, this.requestsExtractor));
    }

    public void getComments(String str, AbstractC44415lI6<CommentsResponse> abstractC44415lI6) {
        this.requestService.getComments(str).mo1284E0(new ON4(abstractC44415lI6));
    }

    public void getCommentsSince(String str, Date date, boolean z, AbstractC44415lI6<CommentsResponse> abstractC44415lI6) {
        String str2;
        String format = this.iso8601.format(date);
        if (z) {
            str2 = ROLE_AGENT;
        } else {
            str2 = null;
        }
        this.requestService.getCommentsSince(str, format, str2).mo1284E0(new ON4(abstractC44415lI6));
    }

    public void getRequest(String str, String str2, AbstractC44415lI6<Request> abstractC44415lI6) {
        this.requestService.getRequest(str, str2).mo1284E0(new ON4(abstractC44415lI6, this.requestExtractor));
    }

    public void getTicketFormsById(String str, AbstractC44415lI6<RawTicketFormResponse> abstractC44415lI6) {
        this.requestService.getTicketFormsById(str, TICKET_FIELDS_INCLUDE).mo1284E0(new ON4(abstractC44415lI6));
    }

    public void getAllRequests(String str, String str2, String str3, AbstractC44415lI6<List<Request>> abstractC44415lI6) {
        this.requestService.getManyRequests(str, str2, str3).mo1284E0(new ON4(abstractC44415lI6, this.requestsExtractor));
    }
}
