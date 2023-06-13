package co.bird.android.model.wire;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B1\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, m28432d2 = {"Lco/bird/android/model/wire/WireAssetMedia;", "Landroid/os/Parcelable;", "mediaUrl", "", "(Ljava/lang/String;)V", "mediaId", "name", "mediaType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMediaId", "()Ljava/lang/String;", "getMediaType", "getMediaUrl", "getName", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireAssetMedia implements Parcelable {
    public static final Parcelable.Creator<WireAssetMedia> CREATOR = new Creator();
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

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WireAssetMedia> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireAssetMedia createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WireAssetMedia(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireAssetMedia[] newArray(int i) {
            return new WireAssetMedia[i];
        }
    }

    public WireAssetMedia() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ WireAssetMedia copy$default(WireAssetMedia wireAssetMedia, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireAssetMedia.mediaId;
        }
        if ((i & 2) != 0) {
            str2 = wireAssetMedia.name;
        }
        if ((i & 4) != 0) {
            str3 = wireAssetMedia.mediaUrl;
        }
        if ((i & 8) != 0) {
            str4 = wireAssetMedia.mediaType;
        }
        return wireAssetMedia.copy(str, str2, str3, str4);
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

    public final WireAssetMedia copy(String mediaId, String str, String mediaUrl, String str2) {
        Intrinsics.checkNotNullParameter(mediaId, "mediaId");
        Intrinsics.checkNotNullParameter(mediaUrl, "mediaUrl");
        return new WireAssetMedia(mediaId, str, mediaUrl, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireAssetMedia) {
            WireAssetMedia wireAssetMedia = (WireAssetMedia) obj;
            return Intrinsics.areEqual(this.mediaId, wireAssetMedia.mediaId) && Intrinsics.areEqual(this.name, wireAssetMedia.name) && Intrinsics.areEqual(this.mediaUrl, wireAssetMedia.mediaUrl) && Intrinsics.areEqual(this.mediaType, wireAssetMedia.mediaType);
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

    public String toString() {
        String str = this.mediaId;
        String str2 = this.name;
        String str3 = this.mediaUrl;
        String str4 = this.mediaType;
        return "WireAssetMedia(mediaId=" + str + ", name=" + str2 + ", mediaUrl=" + str3 + ", mediaType=" + str4 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.mediaId);
        out.writeString(this.name);
        out.writeString(this.mediaUrl);
        out.writeString(this.mediaType);
    }

    public WireAssetMedia(String mediaId, String str, String mediaUrl, String str2) {
        Intrinsics.checkNotNullParameter(mediaId, "mediaId");
        Intrinsics.checkNotNullParameter(mediaUrl, "mediaUrl");
        this.mediaId = mediaId;
        this.name = str;
        this.mediaUrl = mediaUrl;
        this.mediaType = str2;
    }

    public /* synthetic */ WireAssetMedia(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WireAssetMedia(String mediaUrl) {
        this(mediaUrl, null, mediaUrl, null, 8, null);
        Intrinsics.checkNotNullParameter(mediaUrl, "mediaUrl");
    }
}
