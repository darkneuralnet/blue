package zendesk.support;
/* loaded from: classes8.dex */
interface RequestService {
    @CD3("/api/mobile/requests/{id}.json?include=last_comment")
    InterfaceC51431x80<RequestResponse> addComment(@InterfaceC39678dJ3("id") String str, @InterfaceC6404PY UpdateRequestWrapper updateRequestWrapper);

    @AD3("/api/mobile/requests.json?include=last_comment")
    InterfaceC51431x80<RequestResponse> createRequest(@InterfaceC52701zH1("Mobile-Sdk-Identity") String str, @InterfaceC6404PY CreateRequestWrapper createRequestWrapper);

    @NA1("/api/mobile/requests.json?sort_by=updated_at&sort_order=desc")
    InterfaceC51431x80<RequestsResponse> getAllRequests(@InterfaceC37017Xc4("status") String str, @InterfaceC37017Xc4("include") String str2);

    @NA1("/api/mobile/requests/{id}/comments.json?sort_order=desc")
    InterfaceC51431x80<CommentsResponse> getComments(@InterfaceC39678dJ3("id") String str);

    @NA1("/api/mobile/requests/{id}/comments.json?sort_order=desc")
    InterfaceC51431x80<CommentsResponse> getCommentsSince(@InterfaceC39678dJ3("id") String str, @InterfaceC37017Xc4("since") String str2, @InterfaceC37017Xc4("role") String str3);

    @NA1("/api/mobile/requests/show_many.json?sort_order=desc")
    InterfaceC51431x80<RequestsResponse> getManyRequests(@InterfaceC37017Xc4("tokens") String str, @InterfaceC37017Xc4("status") String str2, @InterfaceC37017Xc4("include") String str3);

    @NA1("/api/mobile/requests/{id}.json")
    InterfaceC51431x80<RequestResponse> getRequest(@InterfaceC39678dJ3("id") String str, @InterfaceC37017Xc4("include") String str2);

    @NA1("/api/v2/ticket_forms/show_many.json?active=true")
    InterfaceC51431x80<RawTicketFormResponse> getTicketFormsById(@InterfaceC37017Xc4("ids") String str, @InterfaceC37017Xc4("include") String str2);
}
