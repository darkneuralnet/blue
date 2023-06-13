package zendesk.support.request;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import zendesk.support.AttachmentFile;
import zendesk.support.CustomField;
import zendesk.support.DeepLinkingBroadcastReceiver;
import zendesk.support.Request;
import zendesk.support.RequestStatus;
import zendesk.support.requestlist.RequestInfo;
/* loaded from: classes8.dex */
public class RequestConfiguration implements InterfaceC40057dx0 {
    public static final long NO_TICKET_FORM_ID = -1;
    private final List<InterfaceC40057dx0> configurations;
    private final List<CustomField> customFields;
    private final List<AttachmentFile> files;
    private final boolean hasAgentReplies;
    private final String localRequestId;
    private final String requestId;
    private final RequestStatus requestStatus;
    private final String requestSubject;
    private final List<String> tags;
    private final long ticketFormId;

    /* loaded from: classes8.dex */
    public static class Builder {
        private String requestSubject = "";
        private List<String> tags = new ArrayList(0);
        private String requestId = "";
        private String localRequestId = "";
        private RequestStatus requestStatus = null;
        private boolean hasAgentReplies = false;
        private List<CustomField> customFields = new ArrayList(0);
        private long ticketFormId = -1;
        private List<AttachmentFile> files = new ArrayList(0);
        private List<InterfaceC40057dx0> configurations = new ArrayList();

        private void setConfigurations(List<InterfaceC40057dx0> list) {
            this.configurations = list;
            RequestConfiguration requestConfiguration = (RequestConfiguration) C32756Ex0.m108195d(list, RequestConfiguration.class);
            if (requestConfiguration != null) {
                this.requestSubject = requestConfiguration.getRequestSubject();
                this.tags = requestConfiguration.getTags();
                this.ticketFormId = requestConfiguration.ticketFormId;
                this.customFields = requestConfiguration.customFields;
                this.files = requestConfiguration.getFilesAsAttachments();
            }
        }

        public InterfaceC40057dx0 config() {
            return new RequestConfiguration(this.requestSubject, this.tags, this.requestId, this.localRequestId, this.requestStatus, this.customFields, this.ticketFormId, this.files, this.hasAgentReplies, this.configurations);
        }

        public Intent deepLinkIntent(Context context, Intent... intentArr) {
            ArrayList arrayList = new ArrayList(Arrays.asList(intentArr));
            Intent intent = new Intent(context, DeepLinkingBroadcastReceiver.class);
            intent.putExtra(DeepLinkingBroadcastReceiver.EXTRA_REQUEST_INTENT, intent(context, new InterfaceC40057dx0[0]));
            intent.putExtra(DeepLinkingBroadcastReceiver.EXTRA_BACK_STACK_ACTIVITIES, arrayList);
            return intent;
        }

        public Intent intent(Context context, InterfaceC40057dx0... interfaceC40057dx0Arr) {
            return intent(context, Arrays.asList(interfaceC40057dx0Arr));
        }

        public void show(Context context, InterfaceC40057dx0... interfaceC40057dx0Arr) {
            context.startActivity(intent(context, interfaceC40057dx0Arr));
        }

        public Builder withCustomFields(List<CustomField> list) {
            this.customFields = list;
            return this;
        }

        public Builder withFiles(List<File> list) {
            ArrayList arrayList = new ArrayList(list.size());
            for (File file : list) {
                arrayList.add(new AttachmentFile(file.getName(), C45705nU2.m23611b(C50610vl1.m8198a(file.getName())), file));
            }
            this.files = arrayList;
            return this;
        }

        public Builder withRequest(Request request) {
            this.requestId = request.getId();
            this.requestStatus = request.getStatus();
            this.hasAgentReplies = C43505jm0.m29948i(request.getLastCommentingAgents());
            return this;
        }

        public Builder withRequestId(String str) {
            this.requestId = str;
            return this;
        }

        public Builder withRequestInfo(RequestInfo requestInfo) {
            String localId = requestInfo.getLocalId();
            if (C44504lS5.m27273b(localId)) {
                this.localRequestId = localId;
            }
            String remoteId = requestInfo.getRemoteId();
            if (C44504lS5.m27273b(remoteId)) {
                this.requestId = remoteId;
            }
            this.requestStatus = requestInfo.getRequestStatus();
            this.hasAgentReplies = C43505jm0.m29948i(requestInfo.getAgentInfos());
            return this;
        }

        public Builder withRequestSubject(String str) {
            this.requestSubject = str;
            return this;
        }

        public Builder withTags(String... strArr) {
            this.tags = C43505jm0.m29954c(Arrays.asList(strArr));
            return this;
        }

        public Builder withTicketForm(long j, List<CustomField> list) {
            this.ticketFormId = j;
            this.customFields = list;
            return this;
        }

        @SuppressLint({"RestrictedApi"})
        public Intent intent(Context context, List<InterfaceC40057dx0> list) {
            setConfigurations(list);
            InterfaceC40057dx0 config = config();
            Intent intent = new Intent(context, RequestActivity.class);
            C32756Ex0.m108196c(intent, config);
            return intent;
        }

        public void show(Context context, List<InterfaceC40057dx0> list) {
            context.startActivity(intent(context, list));
        }

        public Builder withTags(List<String> list) {
            this.tags = C43505jm0.m29954c(list);
            return this;
        }

        public Intent deepLinkIntent(Context context, List<InterfaceC40057dx0> list, Intent... intentArr) {
            ArrayList arrayList = new ArrayList(Arrays.asList(intentArr));
            Intent intent = new Intent(context, DeepLinkingBroadcastReceiver.class);
            intent.putExtra(DeepLinkingBroadcastReceiver.EXTRA_REQUEST_INTENT, intent(context, list));
            intent.putExtra(DeepLinkingBroadcastReceiver.EXTRA_BACK_STACK_ACTIVITIES, arrayList);
            return intent;
        }

        public Builder withFiles(File... fileArr) {
            return withFiles(Arrays.asList(fileArr));
        }
    }

    public RequestConfiguration(String str, List<String> list, String str2, String str3, RequestStatus requestStatus, List<CustomField> list2, long j, List<AttachmentFile> list3, boolean z, List<InterfaceC40057dx0> list4) {
        this.requestSubject = str;
        this.tags = C43505jm0.m29952e(list);
        this.requestId = str2;
        this.localRequestId = str3;
        this.requestStatus = requestStatus;
        this.hasAgentReplies = z;
        this.customFields = list2;
        this.ticketFormId = j;
        this.files = list3;
        this.configurations = list4;
    }

    @Override // p000.InterfaceC40057dx0
    @SuppressLint({"RestrictedApi"})
    public List<InterfaceC40057dx0> getConfigurations() {
        return C32756Ex0.m108198a(this.configurations, this);
    }

    public List<CustomField> getCustomFields() {
        return this.customFields;
    }

    public List<StateRequestAttachment> getFiles() {
        ArrayList arrayList = new ArrayList(this.files.size());
        for (AttachmentFile attachmentFile : this.files) {
            arrayList.add(StateRequestAttachment.convert(attachmentFile));
        }
        return arrayList;
    }

    public List<AttachmentFile> getFilesAsAttachments() {
        return this.files;
    }

    public String getLocalRequestId() {
        return this.localRequestId;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public RequestStatus getRequestStatus() {
        return this.requestStatus;
    }

    public String getRequestSubject() {
        return this.requestSubject;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public StateRequestTicketForm getTicketForm() {
        return new StateRequestTicketForm(this.ticketFormId, this.customFields);
    }

    public long getTicketFormId() {
        return this.ticketFormId;
    }

    public boolean hasAgentReplies() {
        return this.hasAgentReplies;
    }
}
