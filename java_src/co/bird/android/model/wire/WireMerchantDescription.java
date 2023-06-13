package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003JY\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, m28432d2 = {"Lco/bird/android/model/wire/WireMerchantDescription;", "", "id", "", "userId", "name", "logo", "Lco/bird/android/model/wire/WireLegacyAsset;", "photo", "verifiedAt", "Lorg/joda/time/DateTime;", "description", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireLegacyAsset;Lco/bird/android/model/wire/WireLegacyAsset;Lorg/joda/time/DateTime;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getId", "getLogo", "()Lco/bird/android/model/wire/WireLegacyAsset;", "getName", "getPhoto", "getUserId", "getVerifiedAt", "()Lorg/joda/time/DateTime;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireMerchantDescription {
    @JsonProperty("description")
    @InterfaceC41208ft5("description")
    private final String description;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66736id;
    @JsonProperty("logo_asset")
    @InterfaceC41208ft5("logo_asset")
    private final WireLegacyAsset logo;
    @JsonProperty("name")
    @InterfaceC41208ft5("name")
    private final String name;
    @JsonProperty("photo_asset")
    @InterfaceC41208ft5("photo_asset")
    private final WireLegacyAsset photo;
    @JsonProperty("user_id")
    @InterfaceC41208ft5("user_id")
    private final String userId;
    @JsonProperty("verified_at")
    @InterfaceC41208ft5("verified_at")
    private final DateTime verifiedAt;

    public WireMerchantDescription() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ WireMerchantDescription copy$default(WireMerchantDescription wireMerchantDescription, String str, String str2, String str3, WireLegacyAsset wireLegacyAsset, WireLegacyAsset wireLegacyAsset2, DateTime dateTime, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireMerchantDescription.f66736id;
        }
        if ((i & 2) != 0) {
            str2 = wireMerchantDescription.userId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = wireMerchantDescription.name;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            wireLegacyAsset = wireMerchantDescription.logo;
        }
        WireLegacyAsset wireLegacyAsset3 = wireLegacyAsset;
        if ((i & 16) != 0) {
            wireLegacyAsset2 = wireMerchantDescription.photo;
        }
        WireLegacyAsset wireLegacyAsset4 = wireLegacyAsset2;
        if ((i & 32) != 0) {
            dateTime = wireMerchantDescription.verifiedAt;
        }
        DateTime dateTime2 = dateTime;
        if ((i & 64) != 0) {
            str4 = wireMerchantDescription.description;
        }
        return wireMerchantDescription.copy(str, str5, str6, wireLegacyAsset3, wireLegacyAsset4, dateTime2, str4);
    }

    public final String component1() {
        return this.f66736id;
    }

    public final String component2() {
        return this.userId;
    }

    public final String component3() {
        return this.name;
    }

    public final WireLegacyAsset component4() {
        return this.logo;
    }

    public final WireLegacyAsset component5() {
        return this.photo;
    }

    public final DateTime component6() {
        return this.verifiedAt;
    }

    public final String component7() {
        return this.description;
    }

    public final WireMerchantDescription copy(String id, String str, String name, WireLegacyAsset wireLegacyAsset, WireLegacyAsset wireLegacyAsset2, DateTime dateTime, String str2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        return new WireMerchantDescription(id, str, name, wireLegacyAsset, wireLegacyAsset2, dateTime, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireMerchantDescription) {
            WireMerchantDescription wireMerchantDescription = (WireMerchantDescription) obj;
            return Intrinsics.areEqual(this.f66736id, wireMerchantDescription.f66736id) && Intrinsics.areEqual(this.userId, wireMerchantDescription.userId) && Intrinsics.areEqual(this.name, wireMerchantDescription.name) && Intrinsics.areEqual(this.logo, wireMerchantDescription.logo) && Intrinsics.areEqual(this.photo, wireMerchantDescription.photo) && Intrinsics.areEqual(this.verifiedAt, wireMerchantDescription.verifiedAt) && Intrinsics.areEqual(this.description, wireMerchantDescription.description);
        }
        return false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.f66736id;
    }

    public final WireLegacyAsset getLogo() {
        return this.logo;
    }

    public final String getName() {
        return this.name;
    }

    public final WireLegacyAsset getPhoto() {
        return this.photo;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final DateTime getVerifiedAt() {
        return this.verifiedAt;
    }

    public int hashCode() {
        int hashCode = this.f66736id.hashCode() * 31;
        String str = this.userId;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.name.hashCode()) * 31;
        WireLegacyAsset wireLegacyAsset = this.logo;
        int hashCode3 = (hashCode2 + (wireLegacyAsset == null ? 0 : wireLegacyAsset.hashCode())) * 31;
        WireLegacyAsset wireLegacyAsset2 = this.photo;
        int hashCode4 = (hashCode3 + (wireLegacyAsset2 == null ? 0 : wireLegacyAsset2.hashCode())) * 31;
        DateTime dateTime = this.verifiedAt;
        int hashCode5 = (hashCode4 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        String str2 = this.description;
        return hashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66736id;
        String str2 = this.userId;
        String str3 = this.name;
        WireLegacyAsset wireLegacyAsset = this.logo;
        WireLegacyAsset wireLegacyAsset2 = this.photo;
        DateTime dateTime = this.verifiedAt;
        String str4 = this.description;
        return "WireMerchantDescription(id=" + str + ", userId=" + str2 + ", name=" + str3 + ", logo=" + wireLegacyAsset + ", photo=" + wireLegacyAsset2 + ", verifiedAt=" + dateTime + ", description=" + str4 + ")";
    }

    public WireMerchantDescription(String id, String str, String name, WireLegacyAsset wireLegacyAsset, WireLegacyAsset wireLegacyAsset2, DateTime dateTime, String str2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f66736id = id;
        this.userId = str;
        this.name = name;
        this.logo = wireLegacyAsset;
        this.photo = wireLegacyAsset2;
        this.verifiedAt = dateTime;
        this.description = str2;
    }

    public /* synthetic */ WireMerchantDescription(String str, String str2, String str3, WireLegacyAsset wireLegacyAsset, WireLegacyAsset wireLegacyAsset2, DateTime dateTime, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) == 0 ? str3 : "", (i & 8) != 0 ? null : wireLegacyAsset, (i & 16) != 0 ? null : wireLegacyAsset2, (i & 32) != 0 ? null : dateTime, (i & 64) != 0 ? null : str4);
    }
}
