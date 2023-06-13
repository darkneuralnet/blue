package co.bird.android.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.PaymentMethodOptionsParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003JD\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, m28432d2 = {"Lco/bird/android/model/DamageTrack;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "codeHeader", "", "codeDetails", "textColor", "createdAtTime", "Lorg/joda/time/DateTime;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lorg/joda/time/DateTime;)V", "getCode", "()I", "getCodeDetails", "()Ljava/lang/String;", "getCodeHeader", "getCreatedAtTime", "()Lorg/joda/time/DateTime;", "getTextColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lorg/joda/time/DateTime;)Lco/bird/android/model/DamageTrack;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class DamageTrack {
    @JsonProperty(PaymentMethodOptionsParams.Blik.PARAM_CODE)
    @InterfaceC41208ft5(PaymentMethodOptionsParams.Blik.PARAM_CODE)
    private final int code;
    @JsonProperty("code_details")
    @InterfaceC41208ft5("code_details")
    private final String codeDetails;
    @JsonProperty("code_header")
    @InterfaceC41208ft5("code_header")
    private final String codeHeader;
    @JsonProperty("created_at_time")
    @InterfaceC41208ft5("created_at_time")
    private final DateTime createdAtTime;
    @JsonProperty("text_color")
    @InterfaceC41208ft5("text_color")
    private final Integer textColor;

    public DamageTrack() {
        this(0, null, null, null, null, 31, null);
    }

    public static /* synthetic */ DamageTrack copy$default(DamageTrack damageTrack, int i, String str, String str2, Integer num, DateTime dateTime, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = damageTrack.code;
        }
        if ((i2 & 2) != 0) {
            str = damageTrack.codeHeader;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            str2 = damageTrack.codeDetails;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            num = damageTrack.textColor;
        }
        Integer num2 = num;
        if ((i2 & 16) != 0) {
            dateTime = damageTrack.createdAtTime;
        }
        return damageTrack.copy(i, str3, str4, num2, dateTime);
    }

    public final int component1() {
        return this.code;
    }

    public final String component2() {
        return this.codeHeader;
    }

    public final String component3() {
        return this.codeDetails;
    }

    public final Integer component4() {
        return this.textColor;
    }

    public final DateTime component5() {
        return this.createdAtTime;
    }

    public final DamageTrack copy(int i, String codeHeader, String codeDetails, Integer num, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(codeHeader, "codeHeader");
        Intrinsics.checkNotNullParameter(codeDetails, "codeDetails");
        return new DamageTrack(i, codeHeader, codeDetails, num, dateTime);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DamageTrack) {
            DamageTrack damageTrack = (DamageTrack) obj;
            return this.code == damageTrack.code && Intrinsics.areEqual(this.codeHeader, damageTrack.codeHeader) && Intrinsics.areEqual(this.codeDetails, damageTrack.codeDetails) && Intrinsics.areEqual(this.textColor, damageTrack.textColor) && Intrinsics.areEqual(this.createdAtTime, damageTrack.createdAtTime);
        }
        return false;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getCodeDetails() {
        return this.codeDetails;
    }

    public final String getCodeHeader() {
        return this.codeHeader;
    }

    public final DateTime getCreatedAtTime() {
        return this.createdAtTime;
    }

    public final Integer getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.code) * 31) + this.codeHeader.hashCode()) * 31) + this.codeDetails.hashCode()) * 31;
        Integer num = this.textColor;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        DateTime dateTime = this.createdAtTime;
        return hashCode2 + (dateTime != null ? dateTime.hashCode() : 0);
    }

    public String toString() {
        int i = this.code;
        String str = this.codeHeader;
        String str2 = this.codeDetails;
        Integer num = this.textColor;
        DateTime dateTime = this.createdAtTime;
        return "DamageTrack(code=" + i + ", codeHeader=" + str + ", codeDetails=" + str2 + ", textColor=" + num + ", createdAtTime=" + dateTime + ")";
    }

    public DamageTrack(int i, String codeHeader, String codeDetails, Integer num, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(codeHeader, "codeHeader");
        Intrinsics.checkNotNullParameter(codeDetails, "codeDetails");
        this.code = i;
        this.codeHeader = codeHeader;
        this.codeDetails = codeDetails;
        this.textColor = num;
        this.createdAtTime = dateTime;
    }

    public /* synthetic */ DamageTrack(int i, String str, String str2, Integer num, DateTime dateTime, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) == 0 ? str2 : "", (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? null : dateTime);
    }
}
