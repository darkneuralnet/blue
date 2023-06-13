package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.PaymentMethod;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003Ji\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013¨\u0006("}, m28432d2 = {"Lco/bird/api/request/UpdateUserBody;", "", "email", "", "name", PaymentMethod.BillingDetails.PARAM_PHONE, "imageUrl", "agreedAt", "Lorg/joda/time/DateTime;", "birthdate", "Lorg/joda/time/LocalDateTime;", "locale", "warehouseId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/LocalDateTime;Ljava/lang/String;Ljava/lang/String;)V", "getAgreedAt", "()Lorg/joda/time/DateTime;", "getBirthdate", "()Lorg/joda/time/LocalDateTime;", "getEmail", "()Ljava/lang/String;", "getImageUrl", "getLocale", "getName", "getPhone", "getWarehouseId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class UpdateUserBody {
    @JsonProperty("agreed_at")
    @InterfaceC41208ft5("agreed_at")
    private final DateTime agreedAt;
    @JsonProperty("birthdate")
    @InterfaceC41208ft5("birthdate")
    private final LocalDateTime birthdate;
    @JsonProperty("email")
    @InterfaceC41208ft5("email")
    private final String email;
    @JsonProperty("image_url")
    @InterfaceC41208ft5("image_url")
    private final String imageUrl;
    @JsonProperty("locale")
    @InterfaceC41208ft5("locale")
    private final String locale;
    @JsonProperty("name")
    @InterfaceC41208ft5("name")
    private final String name;
    @JsonProperty(PaymentMethod.BillingDetails.PARAM_PHONE)
    @InterfaceC41208ft5(PaymentMethod.BillingDetails.PARAM_PHONE)
    private final String phone;
    @JsonProperty("warehouse_id")
    @InterfaceC41208ft5("warehouse_id")
    private final String warehouseId;

    public UpdateUserBody() {
        this(null, null, null, null, null, null, null, null, KotlinVersion.MAX_COMPONENT_VALUE, null);
    }

    public final String component1() {
        return this.email;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.phone;
    }

    public final String component4() {
        return this.imageUrl;
    }

    public final DateTime component5() {
        return this.agreedAt;
    }

    public final LocalDateTime component6() {
        return this.birthdate;
    }

    public final String component7() {
        return this.locale;
    }

    public final String component8() {
        return this.warehouseId;
    }

    public final UpdateUserBody copy(String str, String str2, String str3, String str4, DateTime dateTime, LocalDateTime localDateTime, String str5, String str6) {
        return new UpdateUserBody(str, str2, str3, str4, dateTime, localDateTime, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UpdateUserBody) {
            UpdateUserBody updateUserBody = (UpdateUserBody) obj;
            return Intrinsics.areEqual(this.email, updateUserBody.email) && Intrinsics.areEqual(this.name, updateUserBody.name) && Intrinsics.areEqual(this.phone, updateUserBody.phone) && Intrinsics.areEqual(this.imageUrl, updateUserBody.imageUrl) && Intrinsics.areEqual(this.agreedAt, updateUserBody.agreedAt) && Intrinsics.areEqual(this.birthdate, updateUserBody.birthdate) && Intrinsics.areEqual(this.locale, updateUserBody.locale) && Intrinsics.areEqual(this.warehouseId, updateUserBody.warehouseId);
        }
        return false;
    }

    public final DateTime getAgreedAt() {
        return this.agreedAt;
    }

    public final LocalDateTime getBirthdate() {
        return this.birthdate;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getWarehouseId() {
        return this.warehouseId;
    }

    public int hashCode() {
        String str = this.email;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phone;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.imageUrl;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        DateTime dateTime = this.agreedAt;
        int hashCode5 = (hashCode4 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        LocalDateTime localDateTime = this.birthdate;
        int hashCode6 = (hashCode5 + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31;
        String str5 = this.locale;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.warehouseId;
        return hashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        String str = this.email;
        String str2 = this.name;
        String str3 = this.phone;
        String str4 = this.imageUrl;
        DateTime dateTime = this.agreedAt;
        LocalDateTime localDateTime = this.birthdate;
        String str5 = this.locale;
        String str6 = this.warehouseId;
        return "UpdateUserBody(email=" + str + ", name=" + str2 + ", phone=" + str3 + ", imageUrl=" + str4 + ", agreedAt=" + dateTime + ", birthdate=" + localDateTime + ", locale=" + str5 + ", warehouseId=" + str6 + ")";
    }

    public UpdateUserBody(String str, String str2, String str3, String str4, DateTime dateTime, LocalDateTime localDateTime, String str5, String str6) {
        this.email = str;
        this.name = str2;
        this.phone = str3;
        this.imageUrl = str4;
        this.agreedAt = dateTime;
        this.birthdate = localDateTime;
        this.locale = str5;
        this.warehouseId = str6;
    }

    public /* synthetic */ UpdateUserBody(String str, String str2, String str3, String str4, DateTime dateTime, LocalDateTime localDateTime, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : dateTime, (i & 32) != 0 ? null : localDateTime, (i & 64) != 0 ? null : str5, (i & 128) == 0 ? str6 : null);
    }
}
