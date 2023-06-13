package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\"\u001a\u00020\u0002\u0012\b\b\u0002\u0010'\u001a\u00020\u0004¢\u0006\u0004\b(\u0010)B\u0011\b\u0016\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b(\u0010,J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\u001a\u0010\"\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\u0018R\u001a\u0010'\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006-"}, m28432d2 = {"LS46;", "", "", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/Long;", "getBlocked", "()Ljava/lang/Long;", "blocked", "b", "getDns", "dns", "c", "getSsl", "ssl", DateTokenConverter.CONVERTER_KEY, "J", "getConnect", "()J", "connect", "e", "getSend", "send", "f", "getWait", "wait", "g", "getReceive", "receive", "h", "Ljava/lang/String;", "getComment", "()Ljava/lang/String;", "comment", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;JJJJLjava/lang/String;)V", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transaction", "(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: S46 */
/* loaded from: classes5.dex */
public final class S46 {
    @InterfaceC41208ft5("blocked")

    /* renamed from: a */
    public final Long f33131a;
    @InterfaceC41208ft5("dns")

    /* renamed from: b */
    public final Long f33132b;
    @InterfaceC41208ft5("ssl")

    /* renamed from: c */
    public final Long f33133c;
    @InterfaceC41208ft5("connect")

    /* renamed from: d */
    public final long f33134d;
    @InterfaceC41208ft5("send")

    /* renamed from: e */
    public final long f33135e;
    @InterfaceC41208ft5("wait")

    /* renamed from: f */
    public final long f33136f;
    @InterfaceC41208ft5("receive")

    /* renamed from: g */
    public final long f33137g;
    @InterfaceC41208ft5("comment")

    /* renamed from: h */
    public final String f33138h;

    public S46(Long l, Long l2, Long l3, long j, long j2, long j3, long j4, String comment) {
        Intrinsics.checkNotNullParameter(comment, "comment");
        this.f33131a = l;
        this.f33132b = l2;
        this.f33133c = l3;
        this.f33134d = j;
        this.f33135e = j2;
        this.f33136f = j3;
        this.f33137g = j4;
        this.f33138h = comment;
    }

    /* renamed from: a */
    public final long m86032a() {
        Long l = this.f33131a;
        long longValue = l != null ? l.longValue() : 0L;
        Long l2 = this.f33132b;
        long longValue2 = longValue + (l2 != null ? l2.longValue() : 0L);
        Long l3 = this.f33133c;
        return longValue2 + (l3 != null ? l3.longValue() : 0L) + this.f33134d + this.f33135e + this.f33136f + this.f33137g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof S46) {
            S46 s46 = (S46) obj;
            return Intrinsics.areEqual(this.f33131a, s46.f33131a) && Intrinsics.areEqual(this.f33132b, s46.f33132b) && Intrinsics.areEqual(this.f33133c, s46.f33133c) && this.f33134d == s46.f33134d && this.f33135e == s46.f33135e && this.f33136f == s46.f33136f && this.f33137g == s46.f33137g && Intrinsics.areEqual(this.f33138h, s46.f33138h);
        }
        return false;
    }

    public int hashCode() {
        Long l = this.f33131a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.f33132b;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f33133c;
        return ((((((((((hashCode2 + (l3 != null ? l3.hashCode() : 0)) * 31) + Long.hashCode(this.f33134d)) * 31) + Long.hashCode(this.f33135e)) * 31) + Long.hashCode(this.f33136f)) * 31) + Long.hashCode(this.f33137g)) * 31) + this.f33138h.hashCode();
    }

    public String toString() {
        Long l = this.f33131a;
        Long l2 = this.f33132b;
        Long l3 = this.f33133c;
        long j = this.f33134d;
        long j2 = this.f33135e;
        long j3 = this.f33136f;
        long j4 = this.f33137g;
        String str = this.f33138h;
        return "Timings(blocked=" + l + ", dns=" + l2 + ", ssl=" + l3 + ", connect=" + j + ", send=" + j2 + ", wait=" + j3 + ", receive=" + j4 + ", comment=" + str + ")";
    }

    public /* synthetic */ S46(Long l, Long l2, Long l3, long j, long j2, long j3, long j4, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : l3, (i & 8) != 0 ? 0L : j, (i & 16) != 0 ? 0L : j2, j3, (i & 64) != 0 ? 0L : j4, (i & 128) != 0 ? "The information described by this object is incomplete." : str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public S46(HttpTransaction transaction) {
        this(null, null, null, 0L, 0L, r0 != null ? r0.longValue() : 0L, 0L, null, 223, null);
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Long tookMs = transaction.getTookMs();
    }
}
