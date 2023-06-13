package com.chuckerteam.chucker.internal.data.entity;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.adyen.checkout.components.model.payments.request.CardPaymentMethod;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.HttpUrl;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\bB\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0004\u0012\b\u00101\u001a\u0004\u0018\u00010\u0004\u0012\b\u00107\u001a\u0004\u0018\u00010\n\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010>\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010B\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010H\u001a\u00020\u0006\u0012\b\u0010K\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bR\u0010SJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R$\u0010$\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010(\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R$\u0010+\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001f\u001a\u0004\b)\u0010!\"\u0004\b*\u0010#R$\u0010.\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b,\u0010!\"\u0004\b-\u0010#R$\u00101\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001f\u001a\u0004\b/\u0010!\"\u0004\b0\u0010#R$\u00107\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u0010:\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u0010\u0015\u001a\u0004\b8\u0010\u0017\"\u0004\b9\u0010\u0019R$\u0010>\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b;\u0010\u0015\u001a\u0004\b<\u0010\u0017\"\u0004\b=\u0010\u0019R$\u0010B\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b?\u0010\u001f\u001a\u0004\b@\u0010!\"\u0004\bA\u0010#R\"\u0010H\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\b\u001e\u0010E\"\u0004\bF\u0010GR$\u0010K\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bI\u0010\u001f\u001a\u0004\b%\u0010!\"\u0004\bJ\u0010#R\u0011\u0010L\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bC\u0010ER\u0011\u0010O\u001a\u00020M8F¢\u0006\u0006\u001a\u0004\b;\u0010NR\u0013\u0010P\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0014\u0010!R\u0011\u0010Q\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b?\u0010!¨\u0006T"}, m28432d2 = {"Lcom/chuckerteam/chucker/internal/data/entity/a;", "", "", "bytes", "", C17296a.f69688o, "", "encode", "c", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "J", "g", "()J", "setId", "(J)V", "id", "b", "Ljava/lang/Long;", "i", "()Ljava/lang/Long;", "setRequestDate", "(Ljava/lang/Long;)V", "requestDate", "getTookMs", "setTookMs", "tookMs", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "getProtocol", "()Ljava/lang/String;", "setProtocol", "(Ljava/lang/String;)V", "protocol", "e", "h", "setMethod", "method", "f", "setHost", "host", "getPath", "setPath", "path", "getScheme", "setScheme", CardPaymentMethod.PAYMENT_METHOD_TYPE, "Ljava/lang/Integer;", "j", "()Ljava/lang/Integer;", "setResponseCode", "(Ljava/lang/Integer;)V", "responseCode", "getRequestPayloadSize", "setRequestPayloadSize", "requestPayloadSize", "k", "getResponsePayloadSize", "setResponsePayloadSize", "responsePayloadSize", "l", "getError", "setError", "error", "m", "Z", "()Z", "setGraphQlDetected", "(Z)V", "graphQlDetected", "n", "setGraphQlOperationName", "graphQlOperationName", "isSsl", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$a;", "()Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$a;", "status", "durationString", "totalSizeString", "<init>", "(JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;ZLjava/lang/String;)V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHttpTransactionTuple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpTransactionTuple.kt\ncom/chuckerteam/chucker/internal/data/entity/HttpTransactionTuple\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
/* renamed from: com.chuckerteam.chucker.internal.data.entity.a */
/* loaded from: classes5.dex */
public final class C17147a {

    /* renamed from: a */
    public long f69207a;

    /* renamed from: b */
    public Long f69208b;

    /* renamed from: c */
    public Long f69209c;

    /* renamed from: d */
    public String f69210d;

    /* renamed from: e */
    public String f69211e;

    /* renamed from: f */
    public String f69212f;

    /* renamed from: g */
    public String f69213g;

    /* renamed from: h */
    public String f69214h;

    /* renamed from: i */
    public Integer f69215i;

    /* renamed from: j */
    public Long f69216j;

    /* renamed from: k */
    public Long f69217k;

    /* renamed from: l */
    public String f69218l;

    /* renamed from: m */
    public boolean f69219m;

    /* renamed from: n */
    public String f69220n;

    public C17147a(long j, Long l, Long l2, String str, String str2, String str3, String str4, String str5, Integer num, Long l3, Long l4, String str6, boolean z, String str7) {
        this.f69207a = j;
        this.f69208b = l;
        this.f69209c = l2;
        this.f69210d = str;
        this.f69211e = str2;
        this.f69212f = str3;
        this.f69213g = str4;
        this.f69214h = str5;
        this.f69215i = num;
        this.f69216j = l3;
        this.f69217k = l4;
        this.f69218l = str6;
        this.f69219m = z;
        this.f69220n = str7;
    }

    /* renamed from: a */
    public final String m53023a(long j) {
        return C50730vx1.f114933a.m7722a(j, true);
    }

    /* renamed from: b */
    public final String m53022b() {
        Long l = this.f69209c;
        if (l != null) {
            long longValue = l.longValue();
            return longValue + " ms";
        }
        return null;
    }

    /* renamed from: c */
    public final String m53021c(boolean z) {
        String str = this.f69213g;
        if (str == null) {
            return "";
        }
        HttpUrl parse = HttpUrl.Companion.parse("https://www.example.com" + str);
        if (parse == null) {
            return "";
        }
        return C51323wx1.f116882f.m6063c(parse, z).m6069b();
    }

    /* renamed from: d */
    public final boolean m53020d() {
        return this.f69219m;
    }

    /* renamed from: e */
    public final String m53019e() {
        return this.f69220n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C17147a) {
            C17147a c17147a = (C17147a) obj;
            return this.f69207a == c17147a.f69207a && Intrinsics.areEqual(this.f69208b, c17147a.f69208b) && Intrinsics.areEqual(this.f69209c, c17147a.f69209c) && Intrinsics.areEqual(this.f69210d, c17147a.f69210d) && Intrinsics.areEqual(this.f69211e, c17147a.f69211e) && Intrinsics.areEqual(this.f69212f, c17147a.f69212f) && Intrinsics.areEqual(this.f69213g, c17147a.f69213g) && Intrinsics.areEqual(this.f69214h, c17147a.f69214h) && Intrinsics.areEqual(this.f69215i, c17147a.f69215i) && Intrinsics.areEqual(this.f69216j, c17147a.f69216j) && Intrinsics.areEqual(this.f69217k, c17147a.f69217k) && Intrinsics.areEqual(this.f69218l, c17147a.f69218l) && this.f69219m == c17147a.f69219m && Intrinsics.areEqual(this.f69220n, c17147a.f69220n);
        }
        return false;
    }

    /* renamed from: f */
    public final String m53018f() {
        return this.f69212f;
    }

    /* renamed from: g */
    public final long m53017g() {
        return this.f69207a;
    }

    /* renamed from: h */
    public final String m53016h() {
        return this.f69211e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Long.hashCode(this.f69207a) * 31;
        Long l = this.f69208b;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f69209c;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.f69210d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f69211e;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f69212f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f69213g;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f69214h;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f69215i;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Long l3 = this.f69216j;
        int hashCode10 = (hashCode9 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f69217k;
        int hashCode11 = (hashCode10 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str6 = this.f69218l;
        int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        boolean z = this.f69219m;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode12 + i) * 31;
        String str7 = this.f69220n;
        return i2 + (str7 != null ? str7.hashCode() : 0);
    }

    /* renamed from: i */
    public final Long m53015i() {
        return this.f69208b;
    }

    /* renamed from: j */
    public final Integer m53014j() {
        return this.f69215i;
    }

    /* renamed from: k */
    public final HttpTransaction.EnumC17143a m53013k() {
        if (this.f69218l != null) {
            return HttpTransaction.EnumC17143a.Failed;
        }
        if (this.f69215i == null) {
            return HttpTransaction.EnumC17143a.Requested;
        }
        return HttpTransaction.EnumC17143a.Complete;
    }

    /* renamed from: l */
    public final String m53012l() {
        long j;
        Long l = this.f69216j;
        long j2 = 0;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        Long l2 = this.f69217k;
        if (l2 != null) {
            j2 = l2.longValue();
        }
        return m53023a(j + j2);
    }

    /* renamed from: m */
    public final boolean m53011m() {
        boolean equals;
        equals = StringsKt__StringsJVMKt.equals(this.f69214h, "https", true);
        return equals;
    }

    public String toString() {
        long j = this.f69207a;
        Long l = this.f69208b;
        Long l2 = this.f69209c;
        String str = this.f69210d;
        String str2 = this.f69211e;
        String str3 = this.f69212f;
        String str4 = this.f69213g;
        String str5 = this.f69214h;
        Integer num = this.f69215i;
        Long l3 = this.f69216j;
        Long l4 = this.f69217k;
        String str6 = this.f69218l;
        boolean z = this.f69219m;
        String str7 = this.f69220n;
        return "HttpTransactionTuple(id=" + j + ", requestDate=" + l + ", tookMs=" + l2 + ", protocol=" + str + ", method=" + str2 + ", host=" + str3 + ", path=" + str4 + ", scheme=" + str5 + ", responseCode=" + num + ", requestPayloadSize=" + l3 + ", responsePayloadSize=" + l4 + ", error=" + str6 + ", graphQlDetected=" + z + ", graphQlOperationName=" + str7 + ")";
    }
}
