package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import zendesk.core.Constants;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0006\u0010\u0017\u001a\u00020\u0013J\u0006\u0010\u0018\u001a\u00020\u0013J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001a"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/AssetMedia;", "", "mediaId", "", "name", "mediaUrl", "mediaType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMediaId", "()Ljava/lang/String;", "getMediaType", "getMediaUrl", "getName", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "isLottieJson", "isWebP", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nAssetMedia.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetMedia.kt\nco/bird/android/model/persistence/nestedstructures/AssetMedia\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,30:1\n1#2:31\n*E\n"})
/* loaded from: classes4.dex */
public final class AssetMedia {
    @JsonProperty("media_id")
    @InterfaceC41208ft5("media_id")
    private final String mediaId;
    @JsonProperty("media_type")
    @InterfaceC41208ft5("media_type")
    private final String mediaType;
    @JsonProperty("media_url")
    @InterfaceC41208ft5("media_url")
    private final String mediaUrl;
    @JsonProperty("name")
    @InterfaceC41208ft5("name")
    private final String name;

    public AssetMedia() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ AssetMedia copy$default(AssetMedia assetMedia, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = assetMedia.mediaId;
        }
        if ((i & 2) != 0) {
            str2 = assetMedia.name;
        }
        if ((i & 4) != 0) {
            str3 = assetMedia.mediaUrl;
        }
        if ((i & 8) != 0) {
            str4 = assetMedia.mediaType;
        }
        return assetMedia.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.mediaId;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.mediaUrl;
    }

    public final String component4() {
        return this.mediaType;
    }

    public final AssetMedia copy(String mediaId, String str, String mediaUrl, String str2) {
        Intrinsics.checkNotNullParameter(mediaId, "mediaId");
        Intrinsics.checkNotNullParameter(mediaUrl, "mediaUrl");
        return new AssetMedia(mediaId, str, mediaUrl, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AssetMedia) {
            AssetMedia assetMedia = (AssetMedia) obj;
            return Intrinsics.areEqual(this.mediaId, assetMedia.mediaId) && Intrinsics.areEqual(this.name, assetMedia.name) && Intrinsics.areEqual(this.mediaUrl, assetMedia.mediaUrl) && Intrinsics.areEqual(this.mediaType, assetMedia.mediaType);
        }
        return false;
    }

    public final String getMediaId() {
        return this.mediaId;
    }

    public final String getMediaType() {
        return this.mediaType;
    }

    public final String getMediaUrl() {
        return this.mediaUrl;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int hashCode = this.mediaId.hashCode() * 31;
        String str = this.name;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.mediaUrl.hashCode()) * 31;
        String str2 = this.mediaType;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isLottieJson() {
        boolean endsWith;
        String str = this.mediaType;
        if (str != null) {
            return Intrinsics.areEqual(str, Constants.APPLICATION_JSON);
        }
        endsWith = StringsKt__StringsJVMKt.endsWith(this.mediaUrl, ".json", true);
        return endsWith;
    }

    public final boolean isWebP() {
        boolean endsWith;
        String str = this.mediaType;
        if (str != null) {
            return Intrinsics.areEqual(str, "image/webp");
        }
        endsWith = StringsKt__StringsJVMKt.endsWith(this.mediaUrl, ".webp", true);
        return endsWith;
    }

    public String toString() {
        String str = this.mediaId;
        String str2 = this.name;
        String str3 = this.mediaUrl;
        String str4 = this.mediaType;
        return "AssetMedia(mediaId=" + str + ", name=" + str2 + ", mediaUrl=" + str3 + ", mediaType=" + str4 + ")";
    }

    public AssetMedia(String mediaId, String str, String mediaUrl, String str2) {
        Intrinsics.checkNotNullParameter(mediaId, "mediaId");
        Intrinsics.checkNotNullParameter(mediaUrl, "mediaUrl");
        this.mediaId = mediaId;
        this.name = str;
        this.mediaUrl = mediaUrl;
        this.mediaType = str2;
    }

    public /* synthetic */ AssetMedia(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4);
    }
}
