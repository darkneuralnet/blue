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
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0016\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010 \u0012\b\b\u0002\u0010(\u001a\u00020\u0002\u0012\u0006\u0010.\u001a\u00020)\u0012\u0006\u00101\u001a\u00020)\u0012\u0006\u00104\u001a\u00020)\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b8\u00109B\u0011\b\u0016\u0012\u0006\u0010;\u001a\u00020:¢\u0006\u0004\b8\u0010<J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u001c\u0010%\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010(\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u000f\u001a\u0004\b'\u0010\u0011R\u001a\u0010.\u001a\u00020)8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u00101\u001a\u00020)8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010-R\u001a\u00104\u001a\u00020)8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010+\u001a\u0004\b3\u0010-R\u001c\u00107\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010\u000f\u001a\u0004\b6\u0010\u0011¨\u0006="}, m28432d2 = {"LGM4;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", C17296a.f69688o, "I", "getStatus", "()I", "status", "b", "Ljava/lang/String;", "getStatusText", "()Ljava/lang/String;", "statusText", "c", "getHttpVersion", "httpVersion", "", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "getCookies", "()Ljava/util/List;", "cookies", "LxH1;", "e", "getHeaders", "headers", "LUz0;", "f", "LUz0;", "getContent", "()LUz0;", "content", "g", "getRedirectUrl", "redirectUrl", "", "h", "J", "getHeadersSize", "()J", "headersSize", "i", "getBodySize", "bodySize", "j", "getTotalSize", "totalSize", "k", "getComment", "comment", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;LUz0;Ljava/lang/String;JJJLjava/lang/String;)V", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transaction", "(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Response.kt\ncom/chuckerteam/chucker/internal/data/har/log/entry/Response\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,34:1\n1549#2:35\n1620#2,3:36\n1#3:39\n*S KotlinDebug\n*F\n+ 1 Response.kt\ncom/chuckerteam/chucker/internal/data/har/log/entry/Response\n*L\n27#1:35\n27#1:36,3\n*E\n"})
/* renamed from: GM4 */
/* loaded from: classes5.dex */
public final class GM4 {
    @InterfaceC41208ft5("status")

    /* renamed from: a */
    public final int f11791a;
    @InterfaceC41208ft5("statusText")

    /* renamed from: b */
    public final String f11792b;
    @InterfaceC41208ft5("httpVersion")

    /* renamed from: c */
    public final String f11793c;
    @InterfaceC41208ft5("cookies")

    /* renamed from: d */
    public final List<Object> f11794d;
    @InterfaceC41208ft5("headers")

    /* renamed from: e */
    public final List<C51515xH1> f11795e;
    @InterfaceC41208ft5("content")

    /* renamed from: f */
    public final C36518Uz0 f11796f;
    @InterfaceC41208ft5("redirectURL")

    /* renamed from: g */
    public final String f11797g;
    @InterfaceC41208ft5("headersSize")

    /* renamed from: h */
    public final long f11798h;
    @InterfaceC41208ft5("bodySize")

    /* renamed from: i */
    public final long f11799i;
    @InterfaceC41208ft5("totalSize")

    /* renamed from: j */
    public final long f11800j;
    @InterfaceC41208ft5("comment")

    /* renamed from: k */
    public final String f11801k;

    public GM4(int i, String statusText, String httpVersion, List<? extends Object> cookies, List<C51515xH1> headers, C36518Uz0 c36518Uz0, String redirectUrl, long j, long j2, long j3, String str) {
        Intrinsics.checkNotNullParameter(statusText, "statusText");
        Intrinsics.checkNotNullParameter(httpVersion, "httpVersion");
        Intrinsics.checkNotNullParameter(cookies, "cookies");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
        this.f11791a = i;
        this.f11792b = statusText;
        this.f11793c = httpVersion;
        this.f11794d = cookies;
        this.f11795e = headers;
        this.f11796f = c36518Uz0;
        this.f11797g = redirectUrl;
        this.f11798h = j;
        this.f11799i = j2;
        this.f11800j = j3;
        this.f11801k = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GM4) {
            GM4 gm4 = (GM4) obj;
            return this.f11791a == gm4.f11791a && Intrinsics.areEqual(this.f11792b, gm4.f11792b) && Intrinsics.areEqual(this.f11793c, gm4.f11793c) && Intrinsics.areEqual(this.f11794d, gm4.f11794d) && Intrinsics.areEqual(this.f11795e, gm4.f11795e) && Intrinsics.areEqual(this.f11796f, gm4.f11796f) && Intrinsics.areEqual(this.f11797g, gm4.f11797g) && this.f11798h == gm4.f11798h && this.f11799i == gm4.f11799i && this.f11800j == gm4.f11800j && Intrinsics.areEqual(this.f11801k, gm4.f11801k);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((((((Integer.hashCode(this.f11791a) * 31) + this.f11792b.hashCode()) * 31) + this.f11793c.hashCode()) * 31) + this.f11794d.hashCode()) * 31) + this.f11795e.hashCode()) * 31;
        C36518Uz0 c36518Uz0 = this.f11796f;
        int hashCode2 = (((((((((hashCode + (c36518Uz0 == null ? 0 : c36518Uz0.hashCode())) * 31) + this.f11797g.hashCode()) * 31) + Long.hashCode(this.f11798h)) * 31) + Long.hashCode(this.f11799i)) * 31) + Long.hashCode(this.f11800j)) * 31;
        String str = this.f11801k;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        int i = this.f11791a;
        String str = this.f11792b;
        String str2 = this.f11793c;
        List<Object> list = this.f11794d;
        List<C51515xH1> list2 = this.f11795e;
        C36518Uz0 c36518Uz0 = this.f11796f;
        String str3 = this.f11797g;
        long j = this.f11798h;
        long j2 = this.f11799i;
        long j3 = this.f11800j;
        String str4 = this.f11801k;
        return "Response(status=" + i + ", statusText=" + str + ", httpVersion=" + str2 + ", cookies=" + list + ", headers=" + list2 + ", content=" + c36518Uz0 + ", redirectUrl=" + str3 + ", headersSize=" + j + ", bodySize=" + j2 + ", totalSize=" + j3 + ", comment=" + str4 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ GM4(int i, String str, String str2, List list, List list2, C36518Uz0 c36518Uz0, String str3, long j, long j2, long j3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, r6, list2, (i2 & 32) != 0 ? null : c36518Uz0, (i2 & 64) != 0 ? "" : str3, j, j2, j3, (i2 & 1024) != 0 ? null : str4);
        List list3;
        List emptyList;
        if ((i2 & 8) != 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            list3 = emptyList;
        } else {
            list3 = list;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GM4(HttpTransaction transaction) {
        this(r3, r4, r5, null, r7, r8, null, r1 != null ? r1.longValue() : 0L, transaction.getHarResponseBodySize(), transaction.getResponseTotalSize(), null, 1096, null);
        List emptyList;
        ArrayList arrayList;
        C36518Uz0 m80520a;
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Integer responseCode = transaction.getResponseCode();
        int intValue = responseCode != null ? responseCode.intValue() : 0;
        String responseMessage = transaction.getResponseMessage();
        String str = responseMessage == null ? "" : responseMessage;
        String protocol = transaction.getProtocol();
        String str2 = protocol == null ? "" : protocol;
        List<DN1> parsedResponseHeaders = transaction.getParsedResponseHeaders();
        if (parsedResponseHeaders != null) {
            List<DN1> list = parsedResponseHeaders;
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
        Long responsePayloadSize = transaction.getResponsePayloadSize();
        if (responsePayloadSize != null) {
            responsePayloadSize.longValue();
            m80520a = new C36518Uz0(transaction);
        } else {
            m80520a = C36518Uz0.f38387g.m80520a();
        }
        C36518Uz0 c36518Uz0 = m80520a;
        Long responseHeadersSize = transaction.getResponseHeadersSize();
    }
}
