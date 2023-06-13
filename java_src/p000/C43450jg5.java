package p000;

import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23496h;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.io.File;
import java.net.URLConnection;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\"\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"Ljg5;", "Lgg5;", "", "signedS3Url", "Lio/reactivex/F;", "LHM4;", "Lokhttp3/ResponseBody;", C17296a.f69688o, "Ljava/io/File;", "file", "Lokhttp3/MediaType;", "mediaType", "Lio/reactivex/c;", "b", "Lfg5;", "Lfg5;", "s3Client", "<init>", "(Lfg5;)V", "s3_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: jg5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C43450jg5 implements InterfaceC41671gg5 {

    /* renamed from: a */
    public final InterfaceC41078fg5 f93128a;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lokhttp3/RequestBody;", "body", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lokhttp3/RequestBody;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jg5$a */
    /* loaded from: classes4.dex */
    public static final class C24982a extends Lambda implements Function1<RequestBody, InterfaceC23496h> {

        /* renamed from: h */
        public final /* synthetic */ String f93130h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24982a(String str) {
            super(1);
            this.f93130h = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(RequestBody body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return C43450jg5.this.f93128a.m41040b(this.f93130h, body);
        }
    }

    public C43450jg5(InterfaceC41078fg5 s3Client) {
        Intrinsics.checkNotNullParameter(s3Client, "s3Client");
        this.f93128a = s3Client;
    }

    /* renamed from: e */
    public static final RequestBody m30117e(File file, MediaType mediaType) {
        Intrinsics.checkNotNullParameter(file, "$file");
        String mimeType = URLConnection.getFileNameMap().getContentTypeFor(file.getName());
        RequestBody.Companion companion = RequestBody.Companion;
        if (mediaType == null) {
            MediaType.Companion companion2 = MediaType.Companion;
            Intrinsics.checkNotNullExpressionValue(mimeType, "mimeType");
            mediaType = companion2.parse(mimeType);
        }
        return companion.create(mediaType, file);
    }

    /* renamed from: f */
    public static final InterfaceC23496h m30116f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC41671gg5
    /* renamed from: a */
    public AbstractC23442F<HM4<ResponseBody>> mo30121a(String signedS3Url) {
        Intrinsics.checkNotNullParameter(signedS3Url, "signedS3Url");
        return this.f93128a.m41041a(signedS3Url);
    }

    @Override // p000.InterfaceC41671gg5
    /* renamed from: b */
    public AbstractC23461c mo30120b(String signedS3Url, final File file, final MediaType mediaType) {
        Intrinsics.checkNotNullParameter(signedS3Url, "signedS3Url");
        Intrinsics.checkNotNullParameter(file, "file");
        AbstractC23442F m33142Y = AbstractC23442F.m33161E(new Callable() { // from class: hg5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                RequestBody m30117e;
                m30117e = C43450jg5.m30117e(file, mediaType);
                return m30117e;
            }
        }).m33142Y(C24542a.m31932c());
        final C24982a c24982a = new C24982a(signedS3Url);
        AbstractC23461c m33164B = m33142Y.m33164B(new InterfaceC23492o() { // from class: ig5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m30116f;
                m30116f = C43450jg5.m30116f(Function1.this, obj);
                return m30116f;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun upload(sign…(signedS3Url, body) }\n  }");
        return m33164B;
    }
}
