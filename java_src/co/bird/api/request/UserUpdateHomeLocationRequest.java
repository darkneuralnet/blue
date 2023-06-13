package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.Stripe3ds2AuthParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m28432d2 = {"Lco/bird/api/request/UserUpdateHomeLocationRequest;", "", Stripe3ds2AuthParams.FIELD_SOURCE, "", "postalCode", "countryCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCountryCode", "()Ljava/lang/String;", "getPostalCode", "getSource", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class UserUpdateHomeLocationRequest {
    @JsonProperty("country_code")
    @InterfaceC41208ft5("country_code")
    private final String countryCode;
    @JsonProperty("postal_code")
    @InterfaceC41208ft5("postal_code")
    private final String postalCode;
    @JsonProperty(Stripe3ds2AuthParams.FIELD_SOURCE)
    @InterfaceC41208ft5(Stripe3ds2AuthParams.FIELD_SOURCE)
    private final String source;

    public UserUpdateHomeLocationRequest(String source, String str, String str2) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
        this.postalCode = str;
        this.countryCode = str2;
    }

    public static /* synthetic */ UserUpdateHomeLocationRequest copy$default(UserUpdateHomeLocationRequest userUpdateHomeLocationRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userUpdateHomeLocationRequest.source;
        }
        if ((i & 2) != 0) {
            str2 = userUpdateHomeLocationRequest.postalCode;
        }
        if ((i & 4) != 0) {
            str3 = userUpdateHomeLocationRequest.countryCode;
        }
        return userUpdateHomeLocationRequest.copy(str, str2, str3);
    }

    public final String component1() {
        return this.source;
    }

    public final String component2() {
        return this.postalCode;
    }

    public final String component3() {
        return this.countryCode;
    }

    public final UserUpdateHomeLocationRequest copy(String source, String str, String str2) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new UserUpdateHomeLocationRequest(source, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserUpdateHomeLocationRequest) {
            UserUpdateHomeLocationRequest userUpdateHomeLocationRequest = (UserUpdateHomeLocationRequest) obj;
            return Intrinsics.areEqual(this.source, userUpdateHomeLocationRequest.source) && Intrinsics.areEqual(this.postalCode, userUpdateHomeLocationRequest.postalCode) && Intrinsics.areEqual(this.countryCode, userUpdateHomeLocationRequest.countryCode);
        }
        return false;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        int hashCode = this.source.hashCode() * 31;
        String str = this.postalCode;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.countryCode;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.source;
        String str2 = this.postalCode;
        String str3 = this.countryCode;
        return "UserUpdateHomeLocationRequest(source=" + str + ", postalCode=" + str2 + ", countryCode=" + str3 + ")";
    }

    public /* synthetic */ UserUpdateHomeLocationRequest(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
