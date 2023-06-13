package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p053io.CloseableKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.Handshake;
import okhttp3.MediaType;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p000.InterfaceC32758Ex2;
import p000.VH4;
@Metadata(m28433d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0002\u0014\u0018BC\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u001e\u0012\u0006\u0010#\u001a\u00020!\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020%0$¢\u0006\u0004\b(\u0010)J\u0016\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\n\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J \u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001fR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010&¨\u0006*"}, m28432d2 = {"LKM4;", "", "Lokhttp3/Response;", "response", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transaction", "f", "", "h", "e", "Ljava/io/File;", "c", "Li30;", "payload", "g", "LM70;", "body", "", DateTokenConverter.CONVERTER_KEY, "Lmj0;", C17296a.f69688o, "Lmj0;", "collector", "Lc80;", "b", "Lc80;", "cacheDirectoryProvider", "", "J", "maxContentLength", "", "Ljava/util/Set;", "headersToRedact", "", "Z", "alwaysReadResponseBody", "", "LQY;", "Ljava/util/List;", "bodyDecoders", "<init>", "(Lmj0;Lc80;JLjava/util/Set;ZLjava/util/List;)V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: KM4 */
/* loaded from: classes5.dex */
public final class KM4 {

    /* renamed from: g */
    public static final C4408a f19483g = new C4408a(null);

    /* renamed from: a */
    public final C45254mj0 f19484a;

    /* renamed from: b */
    public final InterfaceC38963c80 f19485b;

    /* renamed from: c */
    public final long f19486c;

    /* renamed from: d */
    public final Set<String> f19487d;

    /* renamed from: e */
    public final boolean f19488e;

    /* renamed from: f */
    public final List<InterfaceC6796QY> f19489f;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m28432d2 = {"LKM4$a;", "", "", "CONTENT_TYPE_IMAGE", "Ljava/lang/String;", "", "MAX_BLOB_SIZE", "J", "<init>", "()V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: KM4$a */
    /* loaded from: classes5.dex */
    public static final class C4408a {
        public /* synthetic */ C4408a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C4408a() {
        }
    }

    @Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001a\u0010\n\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u000e\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\u0002H\u0002R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"LKM4$b;", "LVH4$a;", "Ljava/io/File;", "file", "", "sourceByteCount", "", C17296a.f69688o, "Ljava/io/IOException;", "exception", "b", "Li30;", "c", "Lokhttp3/Response;", "Lokhttp3/Response;", "response", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transaction", "<init>", "(LKM4;Lokhttp3/Response;Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nResponseProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResponseProcessor.kt\ncom/chuckerteam/chucker/internal/support/ResponseProcessor$ResponseReportingSinkCallback\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,148:1\n1#2:149\n*E\n"})
    /* renamed from: KM4$b */
    /* loaded from: classes5.dex */
    public final class C4409b implements VH4.InterfaceC8595a {

        /* renamed from: a */
        public final Response f19490a;

        /* renamed from: b */
        public final HttpTransaction f19491b;

        /* renamed from: c */
        public final /* synthetic */ KM4 f19492c;

        public C4409b(KM4 km4, Response response, HttpTransaction transaction) {
            Intrinsics.checkNotNullParameter(response, "response");
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            this.f19492c = km4;
            this.f19490a = response;
            this.f19491b = transaction;
        }

        @Override // p000.VH4.InterfaceC8595a
        /* renamed from: a */
        public void mo80019a(File file, long j) {
            C42488i30 m98966c;
            if (file != null && (m98966c = m98966c(file)) != null) {
                this.f19492c.m98968g(this.f19490a, m98966c, this.f19491b);
            }
            this.f19491b.setResponsePayloadSize(Long.valueOf(j));
            this.f19492c.f19484a.m25140e(this.f19491b);
            if (file != null) {
                file.delete();
            }
        }

        @Override // p000.VH4.InterfaceC8595a
        /* renamed from: b */
        public void mo80018b(File file, IOException exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            InterfaceC32758Ex2.f8338a.error("Failed to read response payload", exception);
        }

        /* renamed from: c */
        public final C42488i30 m98966c(File file) {
            try {
                AN5 m93601i = C34694Ne3.m93601i(C34928Oe3.m91752k(file), this.f19490a.headers());
                C42488i30 c42488i30 = new C42488i30();
                c42488i30.mo24532R2(m93601i);
                CloseableKt.closeFinally(m93601i, null);
                return c42488i30;
            } catch (IOException e) {
                InterfaceC32758Ex2.f8338a.error("Response payload couldn't be processed", e);
                return null;
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LQY;", "decoder", "", C17296a.f69688o, "(LQY;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: KM4$c */
    /* loaded from: classes5.dex */
    public static final class C4410c extends Lambda implements Function1<InterfaceC6796QY, String> {

        /* renamed from: g */
        public final /* synthetic */ Response f19493g;

        /* renamed from: h */
        public final /* synthetic */ M70 f19494h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4410c(Response response, M70 m70) {
            super(1);
            this.f19493g = response;
            this.f19494h = m70;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(InterfaceC6796QY decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            try {
                return decoder.mo73016b(this.f19493g, this.f19494h);
            } catch (IOException e) {
                InterfaceC32758Ex2.C2027a c2027a = InterfaceC32758Ex2.f8338a;
                c2027a.mo30036b("Decoder " + decoder + " failed to process response payload", e);
                return null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KM4(C45254mj0 collector, InterfaceC38963c80 cacheDirectoryProvider, long j, Set<String> headersToRedact, boolean z, List<? extends InterfaceC6796QY> bodyDecoders) {
        Intrinsics.checkNotNullParameter(collector, "collector");
        Intrinsics.checkNotNullParameter(cacheDirectoryProvider, "cacheDirectoryProvider");
        Intrinsics.checkNotNullParameter(headersToRedact, "headersToRedact");
        Intrinsics.checkNotNullParameter(bodyDecoders, "bodyDecoders");
        this.f19484a = collector;
        this.f19485b = cacheDirectoryProvider;
        this.f19486c = j;
        this.f19487d = headersToRedact;
        this.f19488e = z;
        this.f19489f = bodyDecoders;
    }

    /* renamed from: c */
    public final File m98972c() {
        File mo18896a = this.f19485b.mo18896a();
        if (mo18896a == null) {
            InterfaceC32758Ex2.C2028b.m108183c(InterfaceC32758Ex2.f8338a, "Failed to obtain a valid cache directory for transaction files", null, 2, null);
            return null;
        }
        return C44682ll1.f96658a.m26882a(mo18896a);
    }

    /* renamed from: d */
    public final String m98971d(Response response, M70 m70) {
        Sequence asSequence;
        Sequence mapNotNull;
        Object firstOrNull;
        asSequence = CollectionsKt___CollectionsKt.asSequence(this.f19489f);
        mapNotNull = SequencesKt___SequencesKt.mapNotNull(asSequence, new C4410c(response, m70));
        firstOrNull = SequencesKt___SequencesKt.firstOrNull(mapNotNull);
        return (String) firstOrNull;
    }

    /* renamed from: e */
    public final Response m98970e(Response response, HttpTransaction httpTransaction) {
        ResponseBody body = response.body();
        if (C34694Ne3.m93604f(response) && body != null) {
            MediaType contentType = body.contentType();
            long contentLength = body.contentLength();
            AN5 c41871h06 = new C41871h06(body.source(), new VH4(m98972c(), new C4409b(this, response, httpTransaction), this.f19486c));
            if (this.f19488e) {
                c41871h06 = new C47203q01(c41871h06);
            }
            return response.newBuilder().body(ResponseBody.Companion.create(C34928Oe3.m91759d(c41871h06), contentType, contentLength)).build();
        }
        this.f19484a.m25140e(httpTransaction);
        return response;
    }

    /* renamed from: f */
    public final Response m98969f(Response response, HttpTransaction transaction) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        m98967h(response, transaction);
        return m98970e(response, transaction);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m98968g(Response response, C42488i30 c42488i30, HttpTransaction httpTransaction) {
        boolean z;
        String mediaType;
        boolean contains;
        ResponseBody body = response.body();
        if (body == null) {
            return;
        }
        MediaType contentType = body.contentType();
        boolean z2 = false;
        if (contentType != null && (mediaType = contentType.toString()) != null) {
            contains = StringsKt__StringsKt.contains((CharSequence) mediaType, (CharSequence) Entry.TYPE_IMAGE, true);
            if (contains) {
                z = true;
                if (!z) {
                    if (c42488i30.size() < 1000000) {
                        httpTransaction.setResponseImageData(c42488i30.mo21946L0());
                        return;
                    }
                    return;
                } else if (c42488i30.size() != 0) {
                    String m98971d = m98971d(response, c42488i30.mo21936h1());
                    httpTransaction.setResponseBody(m98971d);
                    if (m98971d == null) {
                        z2 = true;
                    }
                    httpTransaction.setResponseBodyEncoded(z2);
                    return;
                } else {
                    return;
                }
            }
        }
        z = false;
        if (!z) {
        }
    }

    /* renamed from: h */
    public final void m98967h(Response response, HttpTransaction httpTransaction) {
        httpTransaction.setRequestHeadersSize(Long.valueOf(response.request().headers().byteCount()));
        httpTransaction.setRequestHeaders(C34694Ne3.m93602h(response.request().headers(), this.f19487d));
        httpTransaction.setResponseHeadersSize(Long.valueOf(response.headers().byteCount()));
        httpTransaction.setResponseHeaders(C34694Ne3.m93602h(response.headers(), this.f19487d));
        httpTransaction.setRequestDate(Long.valueOf(response.sentRequestAtMillis()));
        httpTransaction.setResponseDate(Long.valueOf(response.receivedResponseAtMillis()));
        httpTransaction.setProtocol(response.protocol().toString());
        httpTransaction.setResponseCode(Integer.valueOf(response.code()));
        httpTransaction.setResponseMessage(response.message());
        Handshake handshake = response.handshake();
        if (handshake != null) {
            httpTransaction.setResponseTlsVersion(handshake.tlsVersion().javaName());
            httpTransaction.setResponseCipherSuite(handshake.cipherSuite().javaName());
        }
        httpTransaction.setResponseContentType(C34694Ne3.m93606d(response));
        httpTransaction.setTookMs(Long.valueOf(response.receivedResponseAtMillis() - response.sentRequestAtMillis()));
    }
}
