package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b%\u0010&JP\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010 \u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\"\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b!\u0010\u001dR\u0011\u0010$\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b#\u0010\u001d¨\u0006'"}, m28432d2 = {"LuL3;", "", "", "transactionId", "", "_debitAmount", "_billedAmount", "_tipAmount", "currency", "Lorg/joda/time/DateTime;", "paymentDate", C17296a.f69688o, "(Ljava/lang/String;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Lorg/joda/time/DateTime;)LuL3;", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "J", "Ljava/lang/Long;", "c", "Lorg/joda/time/DateTime;", DateTokenConverter.CONVERTER_KEY, "()Lorg/joda/time/DateTime;", "b", "()J", "billedAmount", "f", "tipAmount", "e", "preTipAmount", "g", "totalAmount", "<init>", "(Ljava/lang/String;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Lorg/joda/time/DateTime;)V", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: uL3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49775uL3 {
    @JsonProperty("billed_amount")
    @InterfaceC41208ft5("billed_amount")
    private final Long _billedAmount;
    @JsonProperty("debit_amount")
    @InterfaceC41208ft5("debit_amount")
    private final long _debitAmount;
    @JsonProperty("tip_amount")
    @InterfaceC41208ft5("tip_amount")
    private final Long _tipAmount;
    @JsonProperty("currency")
    @InterfaceC41208ft5("currency")
    private final String currency;
    @JsonProperty("payment_date")
    @InterfaceC41208ft5("payment_date")
    private final DateTime paymentDate;
    @JsonProperty("transaction_id")
    @InterfaceC41208ft5("transaction_id")
    private final String transactionId;

    public C49775uL3() {
        this(null, 0L, null, null, null, null, 63, null);
    }

    public static /* synthetic */ C49775uL3 copy$default(C49775uL3 c49775uL3, String str, long j, Long l, Long l2, String str2, DateTime dateTime, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c49775uL3.transactionId;
        }
        if ((i & 2) != 0) {
            j = c49775uL3._debitAmount;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            l = c49775uL3._billedAmount;
        }
        Long l3 = l;
        if ((i & 8) != 0) {
            l2 = c49775uL3._tipAmount;
        }
        Long l4 = l2;
        if ((i & 16) != 0) {
            str2 = c49775uL3.currency;
        }
        String str3 = str2;
        if ((i & 32) != 0) {
            dateTime = c49775uL3.paymentDate;
        }
        return c49775uL3.m10421a(str, j2, l3, l4, str3, dateTime);
    }

    /* renamed from: a */
    public final C49775uL3 m10421a(String transactionId, long j, Long l, Long l2, String currency, DateTime paymentDate) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(paymentDate, "paymentDate");
        return new C49775uL3(transactionId, j, l, l2, currency, paymentDate);
    }

    /* renamed from: b */
    public final long m10420b() {
        Long l = this._billedAmount;
        if (l != null) {
            return Math.abs(l.longValue());
        }
        return 0L;
    }

    /* renamed from: c */
    public final String m10419c() {
        return this.currency;
    }

    /* renamed from: d */
    public final DateTime m10418d() {
        return this.paymentDate;
    }

    /* renamed from: e */
    public final long m10417e() {
        return Math.abs(this._debitAmount) - m10416f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C49775uL3) {
            C49775uL3 c49775uL3 = (C49775uL3) obj;
            return Intrinsics.areEqual(this.transactionId, c49775uL3.transactionId) && this._debitAmount == c49775uL3._debitAmount && Intrinsics.areEqual(this._billedAmount, c49775uL3._billedAmount) && Intrinsics.areEqual(this._tipAmount, c49775uL3._tipAmount) && Intrinsics.areEqual(this.currency, c49775uL3.currency) && Intrinsics.areEqual(this.paymentDate, c49775uL3.paymentDate);
        }
        return false;
    }

    /* renamed from: f */
    public final long m10416f() {
        Long l = this._tipAmount;
        if (l != null) {
            return Math.abs(l.longValue());
        }
        return 0L;
    }

    /* renamed from: g */
    public final long m10415g() {
        return Math.abs(this._debitAmount);
    }

    /* renamed from: h */
    public final String m10414h() {
        return this.transactionId;
    }

    public int hashCode() {
        int hashCode = ((this.transactionId.hashCode() * 31) + Long.hashCode(this._debitAmount)) * 31;
        Long l = this._billedAmount;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this._tipAmount;
        return ((((hashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31) + this.currency.hashCode()) * 31) + this.paymentDate.hashCode();
    }

    public String toString() {
        String str = this.transactionId;
        long j = this._debitAmount;
        Long l = this._billedAmount;
        Long l2 = this._tipAmount;
        String str2 = this.currency;
        DateTime dateTime = this.paymentDate;
        return "PayResponse(transactionId=" + str + ", _debitAmount=" + j + ", _billedAmount=" + l + ", _tipAmount=" + l2 + ", currency=" + str2 + ", paymentDate=" + dateTime + ")";
    }

    public C49775uL3(String transactionId, long j, Long l, Long l2, String currency, DateTime paymentDate) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(paymentDate, "paymentDate");
        this.transactionId = transactionId;
        this._debitAmount = j;
        this._billedAmount = l;
        this._tipAmount = l2;
        this.currency = currency;
        this.paymentDate = paymentDate;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C49775uL3(String str, long j, Long l, Long l2, String str2, DateTime dateTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r14, r1, r3, r4, r0, dateTime);
        String str3 = (i & 1) != 0 ? "" : str;
        long j2 = (i & 2) != 0 ? 0L : j;
        Long l3 = (i & 4) != 0 ? null : l;
        Long l4 = (i & 8) != 0 ? null : l2;
        String str4 = (i & 16) == 0 ? str2 : "";
        if ((i & 32) != 0) {
            dateTime = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime, "now()");
        }
    }
}
