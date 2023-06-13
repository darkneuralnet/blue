package zendesk.support;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public interface RequestStorage {
    List<RequestData> getRequestData();

    boolean isRequestDataExpired();

    void markRequestAsRead(String str, int i);

    void markRequestAsUnread(String str);

    void storeRequestData(List<RequestData> list);

    void updateRequestData(List<Request> list);
}
