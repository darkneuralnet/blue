package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.Headers;
import okhttp3.Response;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0010\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u001a\u001a\u0010\n\u001a\u00020\u0004*\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0000\"\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0018\u0010\u0012\u001a\u00020\u000f*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0018\u0010\u0015\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u001a\u0010\u0018\u001a\u0004\u0018\u00010\b*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\"\u0018\u0010\u001b\u001a\u00020\u0001*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\"\u0018\u0010\u001c\u001a\u00020\u0001*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u001a\"\u0018\u0010\u001e\u001a\u00020\u0001*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001a¨\u0006\u001f"}, m28432d2 = {"Lokhttp3/Response;", "", "f", "LAN5;", "Lokhttp3/Headers;", "headers", "i", "", "", "names", "h", "", C17296a.f69688o, "Ljava/util/List;", "supportedEncodings", "", "c", "(Lokhttp3/Response;)J", "contentLength", "g", "(Lokhttp3/Response;)Z", "isChunked", DateTokenConverter.CONVERTER_KEY, "(Lokhttp3/Response;)Ljava/lang/String;", "contentType", "b", "(Lokhttp3/Headers;)Z", "containsGzip", "containsBrotli", "e", "hasSupportedContentEncoding", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOkHttpUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpUtils.kt\ncom/chuckerteam/chucker/internal/support/OkHttpUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 GzipSource.kt\nokio/-GzipSourceExtensions\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,85:1\n1#2:86\n219#3:87\n1747#4,3:88\n*S KotlinDebug\n*F\n+ 1 OkHttpUtils.kt\ncom/chuckerteam/chucker/internal/support/OkHttpUtilsKt\n*L\n71#1:87\n79#1:88,3\n*E\n"})
/* renamed from: Ne3  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C34694Ne3 {

    /* renamed from: a */
    public static final List<String> f24941a;

    static {
        List<String> listOf;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"identity", "gzip", "br"});
        f24941a = listOf;
    }

    /* renamed from: a */
    public static final boolean m93609a(Headers headers) {
        boolean equals;
        equals = StringsKt__StringsJVMKt.equals(headers.get(com.amazonaws.services.p026s3.Headers.CONTENT_ENCODING), "br", true);
        return equals;
    }

    /* renamed from: b */
    public static final boolean m93608b(Headers headers) {
        boolean equals;
        equals = StringsKt__StringsJVMKt.equals(headers.get(com.amazonaws.services.p026s3.Headers.CONTENT_ENCODING), "gzip", true);
        return equals;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
        r3 = kotlin.text.StringsKt__StringNumberConversionsKt.toLongOrNull(r3);
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long m93607c(Response response) {
        Long longOrNull;
        String header$default = Response.header$default(response, "Content-Length", null, 2, null);
        if (header$default != null && longOrNull != null) {
            return longOrNull.longValue();
        }
        return -1L;
    }

    /* renamed from: d */
    public static final String m93606d(Response response) {
        Intrinsics.checkNotNullParameter(response, "<this>");
        return Response.header$default(response, "Content-Type", null, 2, null);
    }

    /* renamed from: e */
    public static final boolean m93605e(Headers headers) {
        boolean z;
        Intrinsics.checkNotNullParameter(headers, "<this>");
        String str = headers.get(com.amazonaws.services.p026s3.Headers.CONTENT_ENCODING);
        if (str == null) {
            return true;
        }
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            str = null;
        }
        if (str == null) {
            return true;
        }
        List<String> list = f24941a;
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = str.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return list.contains(lowerCase);
    }

    /* renamed from: f */
    public static final boolean m93604f(Response response) {
        Intrinsics.checkNotNullParameter(response, "<this>");
        if (Intrinsics.areEqual(response.request().method(), "HEAD")) {
            return false;
        }
        int code = response.code();
        if ((code < 100 || code >= 200) && code != 204 && code != 304) {
            return true;
        }
        if (m93607c(response) <= 0 && !m93603g(response)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static final boolean m93603g(Response response) {
        boolean equals;
        Intrinsics.checkNotNullParameter(response, "<this>");
        equals = StringsKt__StringsJVMKt.equals(Response.header$default(response, "Transfer-Encoding", null, 2, null), "chunked", true);
        return equals;
    }

    /* renamed from: h */
    public static final Headers m93602h(Headers headers, Iterable<String> names) {
        boolean equals;
        Intrinsics.checkNotNullParameter(headers, "<this>");
        Intrinsics.checkNotNullParameter(names, "names");
        Headers.Builder newBuilder = headers.newBuilder();
        for (String str : headers.names()) {
            boolean z = false;
            if (!(names instanceof Collection) || !((Collection) names).isEmpty()) {
                Iterator<String> it = names.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    equals = StringsKt__StringsJVMKt.equals(it.next(), str, true);
                    if (equals) {
                        z = true;
                        break;
                    }
                }
            }
            if (z) {
                newBuilder.set(str, "**");
            }
        }
        return newBuilder.build();
    }

    /* renamed from: i */
    public static final AN5 m93601i(AN5 an5, Headers headers) {
        Intrinsics.checkNotNullParameter(an5, "<this>");
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (m93608b(headers)) {
            return new C52081yE1(an5);
        }
        if (m93609a(headers)) {
            return C34928Oe3.m91751l(new O20(C34928Oe3.m91759d(an5).mo21930w3()));
        }
        return an5;
    }
}
