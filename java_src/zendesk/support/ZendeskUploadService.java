package zendesk.support;

import java.io.File;
import okhttp3.MediaType;
import okhttp3.RequestBody;
/* loaded from: classes8.dex */
class ZendeskUploadService {
    private static final String LOG_TAG = "ZendeskUploadService";
    private final UploadService uploadService;

    public ZendeskUploadService(UploadService uploadService) {
        this.uploadService = uploadService;
    }

    public void deleteAttachment(String str, AbstractC44415lI6<Void> abstractC44415lI6) {
        this.uploadService.deleteAttachment(str).mo1284E0(new ON4(abstractC44415lI6));
    }

    public void uploadAttachment(String str, File file, String str2, AbstractC44415lI6<UploadResponseWrapper> abstractC44415lI6) {
        this.uploadService.uploadAttachment(str, RequestBody.create(MediaType.parse(str2), file)).mo1284E0(new ON4(abstractC44415lI6));
    }
}
