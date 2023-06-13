package zendesk.support.requestlist;

import java.util.Date;
import java.util.List;
import zendesk.support.request.RequestConfiguration;
import zendesk.support.requestlist.RequestInfo;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class RequestListItem {
    private final RequestInfo requestInfo;

    public RequestListItem(RequestInfo requestInfo) {
        this.requestInfo = requestInfo;
    }

    public RequestConfiguration.Builder configure(RequestConfiguration.Builder builder) {
        return builder.withRequestInfo(this.requestInfo);
    }

    public String getAvatar() {
        if (hasAgentReplied()) {
            return this.requestInfo.getAgentInfos().get(0).getAvatar();
        }
        return "";
    }

    public String getFirstMessage() {
        return this.requestInfo.getFirstMessageInfo().getBody();
    }

    public long getItemId() {
        int hashCode;
        String localId = this.requestInfo.getLocalId();
        String remoteId = this.requestInfo.getRemoteId();
        if (C44504lS5.m27273b(localId)) {
            hashCode = localId.hashCode();
        } else {
            hashCode = remoteId.hashCode();
        }
        return hashCode;
    }

    public List<String> getLastCommentingAgentNames() {
        return C43505jm0.m29946k(this.requestInfo.getAgentInfos(), new InterfaceC42043hI6<RequestInfo.AgentInfo, String>() { // from class: zendesk.support.requestlist.RequestListItem.1
            @Override // p000.InterfaceC42043hI6
            public String apply(RequestInfo.AgentInfo agentInfo) {
                return agentInfo.getName();
            }
        });
    }

    public String getLastMessage() {
        return this.requestInfo.getLastMessageInfo().getBody();
    }

    public Date getLastUpdated() {
        return this.requestInfo.getLastUpdated();
    }

    public boolean hasAgentReplied() {
        return C43505jm0.m29948i(this.requestInfo.getAgentInfos());
    }

    public boolean isClosed() {
        return this.requestInfo.isClosed();
    }

    public boolean isFailed() {
        return C43505jm0.m29948i(this.requestInfo.getFailedMessageIds());
    }

    public boolean isUnread() {
        return this.requestInfo.isUnread();
    }
}
