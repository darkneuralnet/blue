package co.bird.android.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.PaymentMethodOptionsParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, m28432d2 = {"Lco/bird/android/model/Sticker;", "", "id", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "createdAt", "Lorg/joda/time/DateTime;", "(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;)V", "getCode", "()Ljava/lang/String;", "getCreatedAt", "()Lorg/joda/time/DateTime;", "getId", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class Sticker {
    @JsonProperty(PaymentMethodOptionsParams.Blik.PARAM_CODE)
    @InterfaceC41208ft5(PaymentMethodOptionsParams.Blik.PARAM_CODE)
    private final String code;
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final DateTime createdAt;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66626id;

    public Sticker() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Sticker copy$default(Sticker sticker, String str, String str2, DateTime dateTime, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sticker.f66626id;
        }
        if ((i & 2) != 0) {
            str2 = sticker.code;
        }
        if ((i & 4) != 0) {
            dateTime = sticker.createdAt;
        }
        return sticker.copy(str, str2, dateTime);
    }

    public final String component1() {
        return this.f66626id;
    }

    public final String component2() {
        return this.code;
    }

    public final DateTime component3() {
        return this.createdAt;
    }

    public final Sticker copy(String id, String code, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(code, "code");
        return new Sticker(id, code, dateTime);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Sticker) {
            Sticker sticker = (Sticker) obj;
            return Intrinsics.areEqual(this.f66626id, sticker.f66626id) && Intrinsics.areEqual(this.code, sticker.code) && Intrinsics.areEqual(this.createdAt, sticker.createdAt);
        }
        return false;
    }

    public final String getCode() {
        return this.code;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final String getId() {
        return this.f66626id;
    }

    public int hashCode() {
        int hashCode = ((this.f66626id.hashCode() * 31) + this.code.hashCode()) * 31;
        DateTime dateTime = this.createdAt;
        return hashCode + (dateTime == null ? 0 : dateTime.hashCode());
    }

    public String toString() {
        String str = this.f66626id;
        String str2 = this.code;
        DateTime dateTime = this.createdAt;
        return "Sticker(id=" + str + ", code=" + str2 + ", createdAt=" + dateTime + ")";
    }

    public Sticker(String id, String code, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(code, "code");
        this.f66626id = id;
        this.code = code;
        this.createdAt = dateTime;
    }

    public /* synthetic */ Sticker(String str, String str2, DateTime dateTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : dateTime);
    }
}
