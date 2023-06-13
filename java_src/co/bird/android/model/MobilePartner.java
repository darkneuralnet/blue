package co.bird.android.model;

import co.bird.android.model.constant.AssetUsage;
import co.bird.android.model.wire.WireAssetMedia;
import co.bird.android.model.wire.WireLegacyAsset;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0019\u0010\"\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0003Ju\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R&\u0010\n\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012¨\u0006*"}, m28432d2 = {"Lco/bird/android/model/MobilePartner;", "", "partnerId", "", "habitatId", "name", "description", "displayName", "email", "url", AssetTaskKt.ASSET_PATH, "", "Lco/bird/android/model/constant/AssetUsage;", "Lco/bird/android/model/wire/WireLegacyAsset;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getAssets", "()Ljava/util/Map;", "getDescription", "()Ljava/lang/String;", "getDisplayName", "getEmail", "getHabitatId", "iconUrl", "getIconUrl", "getName", "getPartnerId", "getUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class MobilePartner {
    @JsonProperty(AssetTaskKt.ASSET_PATH)
    @InterfaceC41208ft5(AssetTaskKt.ASSET_PATH)
    private final Map<AssetUsage, WireLegacyAsset> assets;
    @JsonProperty("description")
    @InterfaceC41208ft5("description")
    private final String description;
    @JsonProperty("display_name")
    @InterfaceC41208ft5("display_name")
    private final String displayName;
    @JsonProperty("email")
    @InterfaceC41208ft5("email")
    private final String email;
    @JsonProperty("habitat_id")
    @InterfaceC41208ft5("habitat_id")
    private final String habitatId;
    @JsonProperty("name")
    @InterfaceC41208ft5("name")
    private final String name;
    @JsonProperty("partner_id")
    @InterfaceC41208ft5("partner_id")
    private final String partnerId;
    @JsonProperty("url")
    @InterfaceC41208ft5("url")
    private final String url;

    public MobilePartner() {
        this(null, null, null, null, null, null, null, null, KotlinVersion.MAX_COMPONENT_VALUE, null);
    }

    public final String component1() {
        return this.partnerId;
    }

    public final String component2() {
        return this.habitatId;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.description;
    }

    public final String component5() {
        return this.displayName;
    }

    public final String component6() {
        return this.email;
    }

    public final String component7() {
        return this.url;
    }

    public final Map<AssetUsage, WireLegacyAsset> component8() {
        return this.assets;
    }

    public final MobilePartner copy(String partnerId, String str, String str2, String str3, String str4, String str5, String str6, Map<AssetUsage, WireLegacyAsset> map) {
        Intrinsics.checkNotNullParameter(partnerId, "partnerId");
        return new MobilePartner(partnerId, str, str2, str3, str4, str5, str6, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MobilePartner) {
            MobilePartner mobilePartner = (MobilePartner) obj;
            return Intrinsics.areEqual(this.partnerId, mobilePartner.partnerId) && Intrinsics.areEqual(this.habitatId, mobilePartner.habitatId) && Intrinsics.areEqual(this.name, mobilePartner.name) && Intrinsics.areEqual(this.description, mobilePartner.description) && Intrinsics.areEqual(this.displayName, mobilePartner.displayName) && Intrinsics.areEqual(this.email, mobilePartner.email) && Intrinsics.areEqual(this.url, mobilePartner.url) && Intrinsics.areEqual(this.assets, mobilePartner.assets);
        }
        return false;
    }

    public final Map<AssetUsage, WireLegacyAsset> getAssets() {
        return this.assets;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getHabitatId() {
        return this.habitatId;
    }

    public final String getIconUrl() {
        WireLegacyAsset wireLegacyAsset;
        WireAssetMedia media;
        Map<AssetUsage, WireLegacyAsset> map = this.assets;
        if (map == null || (wireLegacyAsset = map.get(AssetUsage.RIDER_MAP_ANNOTATION_LOGO_OVERRIDE)) == null || (media = wireLegacyAsset.getMedia()) == null) {
            return null;
        }
        return media.getMediaUrl();
    }

    public final String getName() {
        return this.name;
    }

    public final String getPartnerId() {
        return this.partnerId;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = this.partnerId.hashCode() * 31;
        String str = this.habitatId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.displayName;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.email;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.url;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Map<AssetUsage, WireLegacyAsset> map = this.assets;
        return hashCode7 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        String str = this.partnerId;
        String str2 = this.habitatId;
        String str3 = this.name;
        String str4 = this.description;
        String str5 = this.displayName;
        String str6 = this.email;
        String str7 = this.url;
        Map<AssetUsage, WireLegacyAsset> map = this.assets;
        return "MobilePartner(partnerId=" + str + ", habitatId=" + str2 + ", name=" + str3 + ", description=" + str4 + ", displayName=" + str5 + ", email=" + str6 + ", url=" + str7 + ", assets=" + map + ")";
    }

    public MobilePartner(String partnerId, String str, String str2, String str3, String str4, String str5, String str6, Map<AssetUsage, WireLegacyAsset> map) {
        Intrinsics.checkNotNullParameter(partnerId, "partnerId");
        this.partnerId = partnerId;
        this.habitatId = str;
        this.name = str2;
        this.description = str3;
        this.displayName = str4;
        this.email = str5;
        this.url = str6;
        this.assets = map;
    }

    public /* synthetic */ MobilePartner(String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) == 0 ? map : null);
    }
}
