package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.AssetKind;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;", "", "kind", "Lco/bird/android/model/constant/AssetKind;", "media", "Lco/bird/android/model/persistence/nestedstructures/AssetMedia;", "(Lco/bird/android/model/constant/AssetKind;Lco/bird/android/model/persistence/nestedstructures/AssetMedia;)V", "getKind", "()Lco/bird/android/model/constant/AssetKind;", "getMedia", "()Lco/bird/android/model/persistence/nestedstructures/AssetMedia;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class LegacyAsset {
    @JsonProperty("kind")
    @InterfaceC41208ft5("kind")
    private final AssetKind kind;
    @JsonProperty("media")
    @InterfaceC41208ft5("media")
    private final AssetMedia media;

    public LegacyAsset(AssetKind assetKind, AssetMedia media) {
        Intrinsics.checkNotNullParameter(media, "media");
        this.kind = assetKind;
        this.media = media;
    }

    public static /* synthetic */ LegacyAsset copy$default(LegacyAsset legacyAsset, AssetKind assetKind, AssetMedia assetMedia, int i, Object obj) {
        if ((i & 1) != 0) {
            assetKind = legacyAsset.kind;
        }
        if ((i & 2) != 0) {
            assetMedia = legacyAsset.media;
        }
        return legacyAsset.copy(assetKind, assetMedia);
    }

    public final AssetKind component1() {
        return this.kind;
    }

    public final AssetMedia component2() {
        return this.media;
    }

    public final LegacyAsset copy(AssetKind assetKind, AssetMedia media) {
        Intrinsics.checkNotNullParameter(media, "media");
        return new LegacyAsset(assetKind, media);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LegacyAsset) {
            LegacyAsset legacyAsset = (LegacyAsset) obj;
            return this.kind == legacyAsset.kind && Intrinsics.areEqual(this.media, legacyAsset.media);
        }
        return false;
    }

    public final AssetKind getKind() {
        return this.kind;
    }

    public final AssetMedia getMedia() {
        return this.media;
    }

    public int hashCode() {
        AssetKind assetKind = this.kind;
        return ((assetKind == null ? 0 : assetKind.hashCode()) * 31) + this.media.hashCode();
    }

    public String toString() {
        AssetKind assetKind = this.kind;
        AssetMedia assetMedia = this.media;
        return "LegacyAsset(kind=" + assetKind + ", media=" + assetMedia + ")";
    }

    public /* synthetic */ LegacyAsset(AssetKind assetKind, AssetMedia assetMedia, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : assetKind, assetMedia);
    }
}
