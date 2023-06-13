package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireLegacyAsset;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, m28432d2 = {"Lco/bird/api/response/WireBirdPlusPerk;", "", "icon", "Lco/bird/android/model/wire/WireLegacyAsset;", "title", "", "description", "(Lco/bird/android/model/wire/WireLegacyAsset;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getIcon", "()Lco/bird/android/model/wire/WireLegacyAsset;", "getTitle", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireBirdPlusPerk {
    @JsonProperty("description")
    @InterfaceC41208ft5("description")
    private final String description;
    @JsonProperty("icon")
    @InterfaceC41208ft5("icon")
    private final WireLegacyAsset icon;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public WireBirdPlusPerk() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ WireBirdPlusPerk copy$default(WireBirdPlusPerk wireBirdPlusPerk, WireLegacyAsset wireLegacyAsset, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            wireLegacyAsset = wireBirdPlusPerk.icon;
        }
        if ((i & 2) != 0) {
            str = wireBirdPlusPerk.title;
        }
        if ((i & 4) != 0) {
            str2 = wireBirdPlusPerk.description;
        }
        return wireBirdPlusPerk.copy(wireLegacyAsset, str, str2);
    }

    public final WireLegacyAsset component1() {
        return this.icon;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.description;
    }

    public final WireBirdPlusPerk copy(WireLegacyAsset wireLegacyAsset, String str, String str2) {
        return new WireBirdPlusPerk(wireLegacyAsset, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireBirdPlusPerk) {
            WireBirdPlusPerk wireBirdPlusPerk = (WireBirdPlusPerk) obj;
            return Intrinsics.areEqual(this.icon, wireBirdPlusPerk.icon) && Intrinsics.areEqual(this.title, wireBirdPlusPerk.title) && Intrinsics.areEqual(this.description, wireBirdPlusPerk.description);
        }
        return false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final WireLegacyAsset getIcon() {
        return this.icon;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        WireLegacyAsset wireLegacyAsset = this.icon;
        int hashCode = (wireLegacyAsset == null ? 0 : wireLegacyAsset.hashCode()) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        WireLegacyAsset wireLegacyAsset = this.icon;
        String str = this.title;
        String str2 = this.description;
        return "WireBirdPlusPerk(icon=" + wireLegacyAsset + ", title=" + str + ", description=" + str2 + ")";
    }

    public WireBirdPlusPerk(WireLegacyAsset wireLegacyAsset, String str, String str2) {
        this.icon = wireLegacyAsset;
        this.title = str;
        this.description = str2;
    }

    public /* synthetic */ WireBirdPlusPerk(WireLegacyAsset wireLegacyAsset, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : wireLegacyAsset, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
