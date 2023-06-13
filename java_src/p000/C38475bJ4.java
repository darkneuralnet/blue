package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.facebook.share.internal.C17296a;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p053io.CloseableKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import p000.InterfaceC32758Ex2;
@Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u001a\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\u0004\b!\u0010\"J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001a\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001f¨\u0006#"}, m28432d2 = {"LbJ4;", "", "Lokhttp3/Request;", "request", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transaction", "", "c", DateTokenConverter.CONVERTER_KEY, "e", "LM70;", "body", "", C17296a.f69688o, "graphQLOperationName", "", "b", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lmj0;", "Lmj0;", "collector", "", "J", "maxContentLength", "", "Ljava/util/Set;", "headersToRedact", "", "LQY;", "Ljava/util/List;", "bodyDecoders", "<init>", "(Landroid/content/Context;Lmj0;JLjava/util/Set;Ljava/util/List;)V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRequestProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestProcessor.kt\ncom/chuckerteam/chucker/internal/support/RequestProcessor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n1#2:89\n*E\n"})
/* renamed from: bJ4  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38475bJ4 {

    /* renamed from: a */
    public final Context f57270a;

    /* renamed from: b */
    public final C45254mj0 f57271b;

    /* renamed from: c */
    public final long f57272c;

    /* renamed from: d */
    public final Set<String> f57273d;

    /* renamed from: e */
    public final List<InterfaceC6796QY> f57274e;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LQY;", "decoder", "", C17296a.f69688o, "(LQY;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: bJ4$a */
    /* loaded from: classes5.dex */
    public static final class C12356a extends Lambda implements Function1<InterfaceC6796QY, String> {

        /* renamed from: g */
        public final /* synthetic */ Request f57275g;

        /* renamed from: h */
        public final /* synthetic */ M70 f57276h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12356a(Request request, M70 m70) {
            super(1);
            this.f57275g = request;
            this.f57276h = m70;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(InterfaceC6796QY decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            try {
                InterfaceC32758Ex2.C2027a c2027a = InterfaceC32758Ex2.f8338a;
                InterfaceC32758Ex2.C2028b.m108184b(c2027a, "Decoding with: " + decoder, null, 2, null);
                return decoder.mo73017a(this.f57275g, this.f57276h);
            } catch (IOException e) {
                InterfaceC32758Ex2.C2027a c2027a2 = InterfaceC32758Ex2.f8338a;
                c2027a2.mo30036b("Decoder " + decoder + " failed to process request payload", e);
                return null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C38475bJ4(Context context, C45254mj0 collector, long j, Set<String> headersToRedact, List<? extends InterfaceC6796QY> bodyDecoders) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(collector, "collector");
        Intrinsics.checkNotNullParameter(headersToRedact, "headersToRedact");
        Intrinsics.checkNotNullParameter(bodyDecoders, "bodyDecoders");
        this.f57270a = context;
        this.f57271b = collector;
        this.f57272c = j;
        this.f57273d = headersToRedact;
        this.f57274e = bodyDecoders;
    }

    /* renamed from: a */
    public final String m64686a(Request request, M70 m70) {
        Sequence asSequence;
        Sequence mapNotNull;
        Object firstOrNull;
        asSequence = CollectionsKt___CollectionsKt.asSequence(this.f57274e);
        mapNotNull = SequencesKt___SequencesKt.mapNotNull(asSequence, new C12356a(request, m70));
        firstOrNull = SequencesKt___SequencesKt.firstOrNull(mapNotNull);
        return (String) firstOrNull;
    }

    /* renamed from: b */
    public final boolean m64685b(String str, Request request) {
        boolean contains$default;
        if (str == null && !request.url().pathSegments().contains("graphql")) {
            contains$default = StringsKt__StringsKt.contains$default((CharSequence) request.url().host(), (CharSequence) "graphql", false, 2, (Object) null);
            if (!contains$default) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public final void m64684c(Request request, HttpTransaction transaction) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        m64683d(request, transaction);
        m64682e(request, transaction);
        this.f57271b.m25141d(transaction);
    }

    /* renamed from: d */
    public final void m64683d(Request request, HttpTransaction httpTransaction) {
        String str;
        MediaType contentType;
        httpTransaction.setRequestHeadersSize(Long.valueOf(request.headers().byteCount()));
        Headers m93602h = C34694Ne3.m93602h(request.headers(), this.f57273d);
        httpTransaction.setRequestHeaders(m93602h);
        httpTransaction.setGraphQlOperationName(m93602h);
        httpTransaction.populateUrl(request.url());
        httpTransaction.setGraphQlDetected(m64685b(httpTransaction.getGraphQlOperationName(), request));
        httpTransaction.setRequestDate(Long.valueOf(System.currentTimeMillis()));
        httpTransaction.setMethod(request.method());
        RequestBody body = request.body();
        Long l = null;
        if (body != null && (contentType = body.contentType()) != null) {
            str = contentType.toString();
        } else {
            str = null;
        }
        httpTransaction.setRequestContentType(str);
        RequestBody body2 = request.body();
        if (body2 != null) {
            l = Long.valueOf(body2.contentLength());
        }
        httpTransaction.setRequestPayloadSize(l);
    }

    /* renamed from: e */
    public final void m64682e(Request request, HttpTransaction httpTransaction) {
        boolean z;
        RequestBody body = request.body();
        if (body == null) {
            return;
        }
        if (body.isOneShot()) {
            InterfaceC32758Ex2.C2028b.m108184b(InterfaceC32758Ex2.f8338a, "Skipping one shot request body", null, 2, null);
        } else if (body.isDuplex()) {
            InterfaceC32758Ex2.C2028b.m108184b(InterfaceC32758Ex2.f8338a, "Skipping duplex request body", null, 2, null);
        } else {
            try {
                C42488i30 c42488i30 = new C42488i30();
                body.writeTo(c42488i30);
                C40592er2 c40592er2 = new C40592er2(C34694Ne3.m93601i(c42488i30, request.headers()), this.f57272c);
                C42488i30 c42488i302 = new C42488i30();
                try {
                    c42488i302.mo24532R2(c40592er2);
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(c40592er2, null);
                    String m64686a = m64686a(request, c42488i302.mo21936h1());
                    httpTransaction.setRequestBody(m64686a);
                    if (m64686a == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    httpTransaction.setRequestBodyEncoded(z);
                    if (m64686a != null && c40592er2.m42482a()) {
                        String requestBody = httpTransaction.getRequestBody();
                        String string = this.f57270a.getString(C38145al4.chucker_body_content_truncated);
                        httpTransaction.setRequestBody(requestBody + string);
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(c40592er2, th);
                        throw th2;
                    }
                }
            } catch (IOException e) {
                InterfaceC32758Ex2.f8338a.error("Failed to read request payload", e);
            }
        }
    }
}
