package zendesk.support.request;

import android.annotation.SuppressLint;
import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import zendesk.belvedere.C31096a;
import zendesk.belvedere.MediaResult;
import zendesk.support.Attachment;
import zendesk.support.UploadProvider;
import zendesk.support.UploadResponse;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class AttachmentUploadService {
    private final C31096a belvedere;
    private final List<StateRequestAttachment> errorItems;
    private final List<StateRequestAttachment> itemsForUpload;
    private final List<StateRequestAttachment> processedItems;
    private List<ResolveCallback> resolveCallbacks;
    private AbstractC44415lI6<AttachmentUploadResult> resultListener;
    private final UploadProvider uploadProvider;
    private final Object lock = new Object();
    private String subDirectory = UtilsAttachment.getTemporaryRequestCacheDir();
    private final Map<Long, Long> localToRemoteMap = new HashMap();

    /* loaded from: classes8.dex */
    public static class AttachmentUploadResult {
        private final Map<Long, Long> localToRemoteIdMap;
        private final List<StateRequestAttachment> requestAttachments;

        public AttachmentUploadResult(List<StateRequestAttachment> list, Map<Long, Long> map) {
            this.requestAttachments = list;
            this.localToRemoteIdMap = map;
        }

        public Map<Long, Long> getLocalToRemoteIdMap() {
            return this.localToRemoteIdMap;
        }

        public List<StateRequestAttachment> getRequestAttachments() {
            return this.requestAttachments;
        }
    }

    /* loaded from: classes8.dex */
    public class AttachmentsCallback extends AbstractC44415lI6<UploadResponse> {
        private final StateRequestAttachment requestAttachment;

        public AttachmentsCallback(StateRequestAttachment stateRequestAttachment) {
            this.requestAttachment = stateRequestAttachment;
        }

        @Override // p000.AbstractC44415lI6
        public void onError(InterfaceC48782sg1 interfaceC48782sg1) {
            C33694Ix2.m101447l("RequestActivity", "Error uploading file: %s | Error: %s", this.requestAttachment, interfaceC48782sg1.mo9891c());
            AttachmentUploadService.this.errorUpload(this.requestAttachment);
        }

        @Override // p000.AbstractC44415lI6
        public void onSuccess(UploadResponse uploadResponse) {
            C33694Ix2.m101457b("RequestActivity", "Successfully uploaded file: %s | Result: %s", this.requestAttachment, uploadResponse);
            AttachmentUploadService.this.localToRemoteMap.put(Long.valueOf(this.requestAttachment.getId()), uploadResponse.getAttachment().getId());
            AttachmentUploadService.this.uploadSuccess(this.requestAttachment, uploadResponse);
        }
    }

    /* loaded from: classes8.dex */
    public class ResolveCallback extends G80<List<MediaResult>> {
        private final StateRequestAttachment requestAttachment;

        private ResolveCallback(StateRequestAttachment stateRequestAttachment) {
            this.requestAttachment = stateRequestAttachment;
        }

        @Override // p000.G80
        public void success(List<MediaResult> list) {
            Uri parsedLocalUri = this.requestAttachment.getParsedLocalUri();
            if (list.size() > 0 && !AttachmentUploadService.this.isUploadFinished()) {
                C33694Ix2.m101447l("RequestActivity", "Successfully resolved attachment: %s", parsedLocalUri);
                StateRequestAttachment updateRequestAttachment = AttachmentUploadService.this.updateRequestAttachment(this.requestAttachment, list.get(0));
                AttachmentUploadService.this.uploadProvider.uploadAttachment(updateRequestAttachment.getName(), updateRequestAttachment.getLocalFile(), updateRequestAttachment.getMimeType(), new AttachmentsCallback(updateRequestAttachment));
                return;
            }
            C33694Ix2.m101447l("RequestActivity", "Unable to resolve attachment: %s", parsedLocalUri);
            AttachmentUploadService.this.errorUpload(this.requestAttachment);
        }
    }

    @SuppressLint({"UseSparseArrays"})
    public AttachmentUploadService(UploadProvider uploadProvider, C31096a c31096a, List<StateRequestAttachment> list) {
        this.uploadProvider = uploadProvider;
        this.belvedere = c31096a;
        this.itemsForUpload = list;
        this.resolveCallbacks = new ArrayList(list.size());
        this.processedItems = new ArrayList(list.size());
        this.errorItems = new ArrayList(list.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void errorUpload(StateRequestAttachment stateRequestAttachment) {
        synchronized (this.lock) {
            this.errorItems.add(stateRequestAttachment);
        }
        notifyIfFinished();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isUploadFinished() {
        boolean z;
        boolean z2;
        synchronized (this.lock) {
            boolean m29948i = C43505jm0.m29948i(this.errorItems);
            z = true;
            if (this.processedItems.size() == this.itemsForUpload.size()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!m29948i && !z2) {
                z = false;
            }
        }
        return z;
    }

    private void notifyIfFinished() {
        C33694Ix2.m101457b("RequestActivity", "Notify if finished. Listener: %s, isUploadFinished: %s", this.resultListener, Boolean.valueOf(isUploadFinished()));
        if (isUploadFinished() && this.resultListener != null) {
            if (C43505jm0.m29950g(this.errorItems)) {
                this.resultListener.onSuccess(new AttachmentUploadResult(C43505jm0.m29954c(this.processedItems), this.localToRemoteMap));
            } else {
                this.resultListener.onError(new C49968ug1("Error uploading attachments."));
            }
            this.resultListener = null;
        }
    }

    private MediaResult renameFile(File file, long j) {
        MediaResult m763d = this.belvedere.m763d(UtilsAttachment.getAttachmentSubDir(this.subDirectory, j), file.getName());
        C33694Ix2.m101457b("RequestActivity", "Rename local file: %s -> %s", file.getAbsolutePath(), m763d.m785c().getAbsolutePath());
        if (!file.renameTo(m763d.m785c())) {
            return null;
        }
        return m763d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public StateRequestAttachment updateRequestAttachment(StateRequestAttachment stateRequestAttachment, MediaResult mediaResult) {
        return stateRequestAttachment.newBuilder().setLocalFile(mediaResult.m785c()).setName(mediaResult.m782g()).setMimeType(mediaResult.m783e()).setLocalUri(mediaResult.m779j().toString()).build();
    }

    private void uploadAttachment(StateRequestAttachment stateRequestAttachment) {
        Uri parsedLocalUri = stateRequestAttachment.getParsedLocalUri();
        if (parsedLocalUri != null && !isUploadFinished()) {
            ResolveCallback resolveCallback = new ResolveCallback(stateRequestAttachment);
            this.resolveCallbacks.add(resolveCallback);
            this.belvedere.m759h(Collections.singletonList(parsedLocalUri), this.subDirectory, resolveCallback);
            return;
        }
        C33694Ix2.m101447l("RequestActivity", "Unable to parse uri, skipping. | %s", stateRequestAttachment.getLocalUri());
        errorUpload(stateRequestAttachment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uploadSuccess(StateRequestAttachment stateRequestAttachment, UploadResponse uploadResponse) {
        String localUri;
        File localFile;
        Attachment attachment = uploadResponse.getAttachment();
        MediaResult renameFile = renameFile(stateRequestAttachment.getLocalFile(), attachment.getId().longValue());
        if (renameFile != null) {
            localUri = renameFile.m779j().toString();
            localFile = renameFile.m785c();
        } else {
            localUri = stateRequestAttachment.getLocalUri();
            localFile = stateRequestAttachment.getLocalFile();
        }
        StateRequestAttachment build = stateRequestAttachment.newBuilder().setLocalUri(localUri).setLocalFile(localFile).setToken(uploadResponse.getToken()).setUrl(attachment.getContentUrl()).setMimeType(attachment.getContentType()).setName(attachment.getFileName()).build();
        synchronized (this.lock) {
            this.processedItems.add(build);
        }
        notifyIfFinished();
    }

    public void setResultListener(AbstractC44415lI6<AttachmentUploadResult> abstractC44415lI6) {
        this.resultListener = abstractC44415lI6;
        notifyIfFinished();
    }

    public void start(String str) {
        if (C44504lS5.m27273b(str)) {
            this.subDirectory = UtilsAttachment.getCacheDirForRequestId(str);
        }
        C33694Ix2.m101457b("RequestActivity", "Start uploading attachments", new Object[0]);
        for (StateRequestAttachment stateRequestAttachment : this.itemsForUpload) {
            uploadAttachment(stateRequestAttachment);
        }
    }
}
