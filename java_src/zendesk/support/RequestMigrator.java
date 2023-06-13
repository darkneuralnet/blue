package zendesk.support;

import java.util.List;
/* loaded from: classes8.dex */
interface RequestMigrator {
    void clearLegacyRequestStorage();

    List<RequestData> getLegacyRequests();
}
