package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J>\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n¨\u0006\u001c"}, m28432d2 = {"Lco/bird/api/response/ReceiptDetailLineItem;", "", "title", "", "valueAmount", "", "valueString", "kind", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "getKind", "()Ljava/lang/String;", "getTitle", "getValueAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getValueString", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lco/bird/api/response/ReceiptDetailLineItem;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ReceiptDetailLineItem {
    @JsonProperty("kind")
    @InterfaceC41208ft5("kind")
    private final String kind;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;
    @JsonProperty("value_amount")
    @InterfaceC41208ft5("value_amount")
    private final Long valueAmount;
    @JsonProperty("value_string")
    @InterfaceC41208ft5("value_string")
    private final String valueString;

    public ReceiptDetailLineItem() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ ReceiptDetailLineItem copy$default(ReceiptDetailLineItem receiptDetailLineItem, String str, Long l, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = receiptDetailLineItem.title;
        }
        if ((i & 2) != 0) {
            l = receiptDetailLineItem.valueAmount;
        }
        if ((i & 4) != 0) {
            str2 = receiptDetailLineItem.valueString;
        }
        if ((i & 8) != 0) {
            str3 = receiptDetailLineItem.kind;
        }
        return receiptDetailLineItem.copy(str, l, str2, str3);
    }

    public final String component1() {
        return this.title;
    }

    public final Long component2() {
        return this.valueAmount;
    }

    public final String component3() {
        return this.valueString;
    }

    public final String component4() {
        return this.kind;
    }

    public final ReceiptDetailLineItem copy(String str, Long l, String str2, String str3) {
        return new ReceiptDetailLineItem(str, l, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ReceiptDetailLineItem) {
            ReceiptDetailLineItem receiptDetailLineItem = (ReceiptDetailLineItem) obj;
            return Intrinsics.areEqual(this.title, receiptDetailLineItem.title) && Intrinsics.areEqual(this.valueAmount, receiptDetailLineItem.valueAmount) && Intrinsics.areEqual(this.valueString, receiptDetailLineItem.valueString) && Intrinsics.areEqual(this.kind, receiptDetailLineItem.kind);
        }
        return false;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Long getValueAmount() {
        return this.valueAmount;
    }

    public final String getValueString() {
        return this.valueString;
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.valueAmount;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.valueString;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.kind;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        Long l = this.valueAmount;
        String str2 = this.valueString;
        String str3 = this.kind;
        return "ReceiptDetailLineItem(title=" + str + ", valueAmount=" + l + ", valueString=" + str2 + ", kind=" + str3 + ")";
    }

    public ReceiptDetailLineItem(String str, Long l, String str2, String str3) {
        this.title = str;
        this.valueAmount = l;
        this.valueString = str2;
        this.kind = str3;
    }

    public /* synthetic */ ReceiptDetailLineItem(String str, Long l, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
