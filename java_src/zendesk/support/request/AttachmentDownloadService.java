package zendesk.support.request;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.concurrent.Executor;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import zendesk.belvedere.MediaResult;
import zendesk.support.Streams;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class AttachmentDownloadService {
    private final Executor executor;
    private final OkHttpClient okHttpClient;

    /* loaded from: classes8.dex */
    public static class SaveToFileTask implements Runnable {
        private final AbstractC44415lI6<MediaResult> callback;
        private final MediaResult destFile;
        private final ResponseBody responseBody;

        /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            InterfaceC45453n30 interfaceC45453n30;
            Throwable th;
            IOException e;
            AbstractC44415lI6<MediaResult> abstractC44415lI6;
            C49968ug1 c49968ug1 = null;
            try {
                interfaceC45453n30 = C34928Oe3.m91760c(C34928Oe3.m91757f(this.destFile.m785c()));
                try {
                    try {
                        interfaceC45453n30.mo24532R2(this.responseBody.source());
                        Streams.closeQuietly(interfaceC45453n30);
                        Streams.closeQuietly(this.responseBody);
                    } catch (IOException e2) {
                        e = e2;
                        C33694Ix2.m101454e("RequestActivity", "Unable to save attachment to disk. Error: '%s'", e.getMessage());
                        C49968ug1 c49968ug12 = new C49968ug1(e.getMessage());
                        Streams.closeQuietly(interfaceC45453n30);
                        Streams.closeQuietly(this.responseBody);
                        c49968ug1 = c49968ug12;
                        abstractC44415lI6 = this.callback;
                        if (abstractC44415lI6 == null) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    Streams.closeQuietly(interfaceC45453n30);
                    Streams.closeQuietly(this.responseBody);
                    throw th;
                }
            } catch (IOException e3) {
                interfaceC45453n30 = null;
                e = e3;
            } catch (Throwable th3) {
                interfaceC45453n30 = null;
                th = th3;
                Streams.closeQuietly(interfaceC45453n30);
                Streams.closeQuietly(this.responseBody);
                throw th;
            }
            abstractC44415lI6 = this.callback;
            if (abstractC44415lI6 == null) {
                if (c49968ug1 == null) {
                    abstractC44415lI6.onSuccess(this.destFile);
                } else {
                    abstractC44415lI6.onError(c49968ug1);
                }
            }
        }

        private SaveToFileTask(ResponseBody responseBody, MediaResult mediaResult, AbstractC44415lI6<MediaResult> abstractC44415lI6) {
            this.responseBody = responseBody;
            this.destFile = mediaResult;
            this.callback = abstractC44415lI6;
        }
    }

    public AttachmentDownloadService(OkHttpClient okHttpClient, Executor executor) {
        this.okHttpClient = okHttpClient;
        this.executor = executor;
    }

    public void downloadAttachment(String str, final AbstractC44415lI6<ResponseBody> abstractC44415lI6) {
        FirebasePerfOkHttpClient.enqueue(this.okHttpClient.newCall(new Request.Builder().get().url(str).build()), new Callback() { // from class: zendesk.support.request.AttachmentDownloadService.1
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                abstractC44415lI6.onError(new C49968ug1(iOException.getMessage()));
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) throws IOException {
                if (response.isSuccessful()) {
                    abstractC44415lI6.onSuccess(response.body());
                } else {
                    abstractC44415lI6.onError(new C49968ug1(response.message()));
                }
            }
        });
    }

    public void storeAttachment(ResponseBody responseBody, MediaResult mediaResult, AbstractC44415lI6<MediaResult> abstractC44415lI6) {
        this.executor.execute(new SaveToFileTask(responseBody, mediaResult, abstractC44415lI6));
    }
}
