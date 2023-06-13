package zendesk.support;

import okhttp3.RequestBody;
/* loaded from: classes8.dex */
interface UploadService {
    @KF0("/api/mobile/uploads/{token}.json")
    InterfaceC51431x80<Void> deleteAttachment(@InterfaceC39678dJ3("token") String str);

    @AD3("/api/mobile/uploads.json")
    InterfaceC51431x80<UploadResponseWrapper> uploadAttachment(@InterfaceC37017Xc4("filename") String str, @InterfaceC6404PY RequestBody requestBody);
}
