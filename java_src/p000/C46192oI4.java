package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0014\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0014\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\"\u0012\u0006\u0010-\u001a\u00020(\u0012\u0006\u00100\u001a\u00020(\u0012\u0006\u00103\u001a\u00020(\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b7\u00108B\u0011\b\u0016\u0012\u0006\u0010:\u001a\u000209¢\u0006\u0004\b7\u0010;J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R \u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0018R\u001c\u0010'\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010-\u001a\u00020(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u00100\u001a\u00020(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u0010,R\u001a\u00103\u001a\u00020(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010*\u001a\u0004\b2\u0010,R\u001c\u00106\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010\n\u001a\u0004\b5\u0010\f¨\u0006<"}, m28432d2 = {"LoI4;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", C17296a.f69688o, "Ljava/lang/String;", "getMethod", "()Ljava/lang/String;", "method", "b", "getUrl", "url", "c", "getHttpVersion", "httpVersion", "", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "getCookies", "()Ljava/util/List;", "cookies", "LxH1;", "e", "getHeaders", "headers", "Lad4;", "f", "getQueryString", "queryString", "LGY3;", "g", "LGY3;", "getPostData", "()LGY3;", "postData", "", "h", "J", "getHeadersSize", "()J", "headersSize", "i", "getBodySize", "bodySize", "j", "getTotalSize", "totalSize", "k", "getComment", "comment", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;LGY3;JJJLjava/lang/String;)V", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transaction", "(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Request.kt\ncom/chuckerteam/chucker/internal/data/har/log/entry/Request\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,36:1\n1549#2:37\n1620#2,3:38\n1#3:41\n*S KotlinDebug\n*F\n+ 1 Request.kt\ncom/chuckerteam/chucker/internal/data/har/log/entry/Request\n*L\n28#1:37\n28#1:38,3\n*E\n"})
/* renamed from: oI4  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C46192oI4 {
    @InterfaceC41208ft5("method")

    /* renamed from: a */
    public final String f101744a;
    @InterfaceC41208ft5("url")

    /* renamed from: b */
    public final String f101745b;
    @InterfaceC41208ft5("httpVersion")

    /* renamed from: c */
    public final String f101746c;
    @InterfaceC41208ft5("cookies")

    /* renamed from: d */
    public final List<Object> f101747d;
    @InterfaceC41208ft5("headers")

    /* renamed from: e */
    public final List<C51515xH1> f101748e;
    @InterfaceC41208ft5("queryString")

    /* renamed from: f */
    public final List<C38065ad4> f101749f;
    @InterfaceC41208ft5("postData")

    /* renamed from: g */
    public final GY3 f101750g;
    @InterfaceC41208ft5("headersSize")

    /* renamed from: h */
    public final long f101751h;
    @InterfaceC41208ft5("bodySize")

    /* renamed from: i */
    public final long f101752i;
    @InterfaceC41208ft5("totalSize")

    /* renamed from: j */
    public final long f101753j;
    @InterfaceC41208ft5("comment")

    /* renamed from: k */
    public final String f101754k;

    public C46192oI4(String method, String url, String httpVersion, List<? extends Object> cookies, List<C51515xH1> headers, List<C38065ad4> queryString, GY3 gy3, long j, long j2, long j3, String str) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(httpVersion, "httpVersion");
        Intrinsics.checkNotNullParameter(cookies, "cookies");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(queryString, "queryString");
        this.f101744a = method;
        this.f101745b = url;
        this.f101746c = httpVersion;
        this.f101747d = cookies;
        this.f101748e = headers;
        this.f101749f = queryString;
        this.f101750g = gy3;
        this.f101751h = j;
        this.f101752i = j2;
        this.f101753j = j3;
        this.f101754k = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C46192oI4) {
            C46192oI4 c46192oI4 = (C46192oI4) obj;
            return Intrinsics.areEqual(this.f101744a, c46192oI4.f101744a) && Intrinsics.areEqual(this.f101745b, c46192oI4.f101745b) && Intrinsics.areEqual(this.f101746c, c46192oI4.f101746c) && Intrinsics.areEqual(this.f101747d, c46192oI4.f101747d) && Intrinsics.areEqual(this.f101748e, c46192oI4.f101748e) && Intrinsics.areEqual(this.f101749f, c46192oI4.f101749f) && Intrinsics.areEqual(this.f101750g, c46192oI4.f101750g) && this.f101751h == c46192oI4.f101751h && this.f101752i == c46192oI4.f101752i && this.f101753j == c46192oI4.f101753j && Intrinsics.areEqual(this.f101754k, c46192oI4.f101754k);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f101744a.hashCode() * 31) + this.f101745b.hashCode()) * 31) + this.f101746c.hashCode()) * 31) + this.f101747d.hashCode()) * 31) + this.f101748e.hashCode()) * 31) + this.f101749f.hashCode()) * 31;
        GY3 gy3 = this.f101750g;
        int hashCode2 = (((((((hashCode + (gy3 == null ? 0 : gy3.hashCode())) * 31) + Long.hashCode(this.f101751h)) * 31) + Long.hashCode(this.f101752i)) * 31) + Long.hashCode(this.f101753j)) * 31;
        String str = this.f101754k;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.f101744a;
        String str2 = this.f101745b;
        String str3 = this.f101746c;
        List<Object> list = this.f101747d;
        List<C51515xH1> list2 = this.f101748e;
        List<C38065ad4> list3 = this.f101749f;
        GY3 gy3 = this.f101750g;
        long j = this.f101751h;
        long j2 = this.f101752i;
        long j3 = this.f101753j;
        String str4 = this.f101754k;
        return "Request(method=" + str + ", url=" + str2 + ", httpVersion=" + str3 + ", cookies=" + list + ", headers=" + list2 + ", queryString=" + list3 + ", postData=" + gy3 + ", headersSize=" + j + ", bodySize=" + j2 + ", totalSize=" + j3 + ", comment=" + str4 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C46192oI4(String str, String str2, String str3, List list, List list2, List list3, GY3 gy3, long j, long j2, long j3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, r6, list2, list3, (i & 64) != 0 ? null : gy3, j, j2, j3, (i & 1024) != 0 ? null : str4);
        List list4;
        List emptyList;
        if ((i & 8) != 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            list4 = emptyList;
        } else {
            list4 = list;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C46192oI4(HttpTransaction transaction) {
        this(r4, r5, r6, null, r8, r9, r10, r11, r1 != null ? r1.longValue() : 0L, transaction.getRequestTotalSize(), null, 1032, null);
        List emptyList;
        ArrayList arrayList;
        List<C38065ad4> emptyList2;
        GY3 gy3;
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        String method = transaction.getMethod();
        String str = method == null ? "" : method;
        String url = transaction.getUrl();
        String str2 = url == null ? "" : url;
        String protocol = transaction.getProtocol();
        String str3 = protocol == null ? "" : protocol;
        List<DN1> parsedRequestHeaders = transaction.getParsedRequestHeaders();
        if (parsedRequestHeaders != null) {
            List<DN1> list = parsedRequestHeaders;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            for (DN1 dn1 : list) {
                arrayList2.add(new C51515xH1(dn1));
            }
            arrayList = arrayList2;
        } else {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            arrayList = emptyList;
        }
        String url2 = transaction.getUrl();
        List<C38065ad4> emptyList3 = (url2 == null || (emptyList2 = C38065ad4.f50831d.m70994a(HttpUrl.Companion.get(url2))) == null) ? CollectionsKt__CollectionsKt.emptyList() : emptyList2;
        Long requestPayloadSize = transaction.getRequestPayloadSize();
        if (requestPayloadSize != null) {
            requestPayloadSize.longValue();
            gy3 = new GY3(transaction);
        } else {
            gy3 = null;
        }
        GY3 gy32 = gy3;
        Long requestHeadersSize = transaction.getRequestHeadersSize();
        long longValue = requestHeadersSize != null ? requestHeadersSize.longValue() : 0L;
        Long requestPayloadSize2 = transaction.getRequestPayloadSize();
    }
}
