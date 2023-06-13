package zendesk.support;

import java.io.File;
/* loaded from: classes8.dex */
class ZendeskUploadProvider implements UploadProvider {
    private final ZendeskUploadService uploadService;

    public ZendeskUploadProvider(ZendeskUploadService zendeskUploadService) {
        this.uploadService = zendeskUploadService;
    }

    @Override // zendesk.support.UploadProvider
    public void deleteAttachment(String str, AbstractC44415lI6<Void> abstractC44415lI6) {
        this.uploadService.deleteAttachment(str, abstractC44415lI6);
    }

    @Override // zendesk.support.UploadProvider
    public void uploadAttachment(String str, File file, String str2, final AbstractC44415lI6<UploadResponse> abstractC44415lI6) {
        this.uploadService.uploadAttachment(str, file, str2, new ZendeskCallbackSuccess<UploadResponseWrapper>(abstractC44415lI6) { // from class: zendesk.support.ZendeskUploadProvider.1
            @Override // zendesk.support.ZendeskCallbackSuccess, p000.AbstractC44415lI6
            public void onSuccess(UploadResponseWrapper uploadResponseWrapper) {
                AbstractC44415lI6 abstractC44415lI62 = abstractC44415lI6;
                if (abstractC44415lI62 != null) {
                    abstractC44415lI62.onSuccess(uploadResponseWrapper.getUpload());
                }
            }
        });
    }
}
