package co.bird.android.model.wire;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.AssetKind;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, m28432d2 = {"Lco/bird/android/model/wire/WireLegacyAsset;", "Landroid/os/Parcelable;", "kind", "Lco/bird/android/model/constant/AssetKind;", "assetId", "", "media", "Lco/bird/android/model/wire/WireAssetMedia;", "(Lco/bird/android/model/constant/AssetKind;Ljava/lang/String;Lco/bird/android/model/wire/WireAssetMedia;)V", "getAssetId", "()Ljava/lang/String;", "getKind", "()Lco/bird/android/model/constant/AssetKind;", "getMedia", "()Lco/bird/android/model/wire/WireAssetMedia;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireLegacyAsset implements Parcelable {
    public static final Parcelable.Creator<WireLegacyAsset> CREATOR = new Creator();
    @JsonProperty("asset_id")
    @InterfaceC41208ft5("asset_id")
    private final String assetId;
    @JsonProperty("kind")
    @InterfaceC41208ft5("kind")
    private final AssetKind kind;
    @JsonProperty("media")
    @InterfaceC41208ft5("media")
    private final WireAssetMedia media;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WireLegacyAsset> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireLegacyAsset createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WireLegacyAsset(parcel.readInt() == 0 ? null : AssetKind.valueOf(parcel.readString()), parcel.readString(), WireAssetMedia.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireLegacyAsset[] newArray(int i) {
            return new WireLegacyAsset[i];
        }
    }

    public WireLegacyAsset(AssetKind assetKind, String str, WireAssetMedia media) {
        Intrinsics.checkNotNullParameter(media, "media");
        this.kind = assetKind;
        this.assetId = str;
        this.media = media;
    }

    public static /* synthetic */ WireLegacyAsset copy$default(WireLegacyAsset wireLegacyAsset, AssetKind assetKind, String str, WireAssetMedia wireAssetMedia, int i, Object obj) {
        if ((i & 1) != 0) {
            assetKind = wireLegacyAsset.kind;
        }
        if ((i & 2) != 0) {
            str = wireLegacyAsset.assetId;
        }
        if ((i & 4) != 0) {
            wireAssetMedia = wireLegacyAsset.media;
        }
        return wireLegacyAsset.copy(assetKind, str, wireAssetMedia);
    }

    public final AssetKind component1() {
        return this.kind;
    }

    public final String component2() {
        return this.assetId;
    }

    public final WireAssetMedia component3() {
        return this.media;
    }

    public final WireLegacyAsset copy(AssetKind assetKind, String str, WireAssetMedia media) {
        Intrinsics.checkNotNullParameter(media, "media");
        return new WireLegacyAsset(assetKind, str, media);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireLegacyAsset) {
            WireLegacyAsset wireLegacyAsset = (WireLegacyAsset) obj;
            return this.kind == wireLegacyAsset.kind && Intrinsics.areEqual(this.assetId, wireLegacyAsset.assetId) && Intrinsics.areEqual(this.media, wireLegacyAsset.media);
        }
        return false;
    }

    public final String getAssetId() {
        return this.assetId;
    }

    public final AssetKind getKind() {
        return this.kind;
    }

    public final WireAssetMedia getMedia() {
        return this.media;
    }

    public int hashCode() {
        AssetKind assetKind = this.kind;
        int hashCode = (assetKind == null ? 0 : assetKind.hashCode()) * 31;
        String str = this.assetId;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.media.hashCode();
    }

    public String toString() {
        AssetKind assetKind = this.kind;
        String str = this.assetId;
        WireAssetMedia wireAssetMedia = this.media;
        return "WireLegacyAsset(kind=" + assetKind + ", assetId=" + str + ", media=" + wireAssetMedia + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        AssetKind assetKind = this.kind;
        if (assetKind == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(assetKind.name());
        }
        out.writeString(this.assetId);
        this.media.writeToParcel(out, i);
    }

    public /* synthetic */ WireLegacyAsset(AssetKind assetKind, String str, WireAssetMedia wireAssetMedia, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AssetKind.MEDIA : assetKind, (i & 2) != 0 ? null : str, wireAssetMedia);
    }
}
