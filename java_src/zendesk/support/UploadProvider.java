package zendesk.support;

import java.io.File;
/* loaded from: classes8.dex */
public interface UploadProvider {
    void deleteAttachment(String str, AbstractC44415lI6<Void> abstractC44415lI6);

    void uploadAttachment(String str, File file, String str2, AbstractC44415lI6<UploadResponse> abstractC44415lI6);
}
