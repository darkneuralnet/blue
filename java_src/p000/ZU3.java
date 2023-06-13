package p000;

import com.facebook.share.internal.C17296a;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001a\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010\u000f\u001a\u0004\u0018\u00010\u0006*\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¨\u0006\u0012"}, m28432d2 = {"LZU3;", "LQY;", "Lokhttp3/Request;", "request", "LM70;", "body", "", C17296a.f69688o, "Lokhttp3/Response;", "response", "b", "Lokhttp3/Headers;", "headers", "Lokhttp3/MediaType;", "contentType", "c", "<init>", "()V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ZU3 */
/* loaded from: classes5.dex */
public final class ZU3 implements InterfaceC6796QY {

    /* renamed from: a */
    public static final ZU3 f48682a = new ZU3();

    private ZU3() {
    }

    @Override // p000.InterfaceC6796QY
    /* renamed from: a */
    public String mo73017a(Request request, M70 body) {
        MediaType mediaType;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(body, "body");
        Headers headers = request.headers();
        RequestBody body2 = request.body();
        if (body2 != null) {
            mediaType = body2.contentType();
        } else {
            mediaType = null;
        }
        return m73015c(body, headers, mediaType);
    }

    @Override // p000.InterfaceC6796QY
    /* renamed from: b */
    public String mo73016b(Response response, M70 body) {
        MediaType mediaType;
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(body, "body");
        Headers headers = response.headers();
        ResponseBody body2 = response.body();
        if (body2 != null) {
            mediaType = body2.contentType();
        } else {
            mediaType = null;
        }
        return m73015c(body, headers, mediaType);
    }

    /* renamed from: c */
    public final String m73015c(M70 m70, Headers headers, MediaType mediaType) {
        Charset charset;
        if (!C34694Ne3.m93605e(headers) || !C35162Pe3.m90041c(m70)) {
            return null;
        }
        if (mediaType == null || (charset = MediaType.charset$default(mediaType, null, 1, null)) == null) {
            charset = Charsets.UTF_8;
        }
        return m70.mo43592u(charset);
    }
}
