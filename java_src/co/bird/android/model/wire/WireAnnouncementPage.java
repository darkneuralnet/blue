package co.bird.android.model.wire;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m28432d2 = {"Lco/bird/android/model/wire/WireAnnouncementPage;", "Landroid/os/Parcelable;", "title", "", "message", "titleAsset", "Lco/bird/android/model/wire/WireLegacyAsset;", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireLegacyAsset;)V", "getMessage", "()Ljava/lang/String;", "getTitle", "getTitleAsset", "()Lco/bird/android/model/wire/WireLegacyAsset;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireAnnouncementPage implements Parcelable {
    public static final Parcelable.Creator<WireAnnouncementPage> CREATOR = new Creator();
    @JsonProperty("message")
    @InterfaceC41208ft5("message")
    private final String message;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;
    @JsonProperty("title_asset")
    @InterfaceC41208ft5("title_asset")
    private final WireLegacyAsset titleAsset;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WireAnnouncementPage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireAnnouncementPage createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WireAnnouncementPage(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : WireLegacyAsset.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireAnnouncementPage[] newArray(int i) {
            return new WireAnnouncementPage[i];
        }
    }

    public WireAnnouncementPage() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ WireAnnouncementPage copy$default(WireAnnouncementPage wireAnnouncementPage, String str, String str2, WireLegacyAsset wireLegacyAsset, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireAnnouncementPage.title;
        }
        if ((i & 2) != 0) {
            str2 = wireAnnouncementPage.message;
        }
        if ((i & 4) != 0) {
            wireLegacyAsset = wireAnnouncementPage.titleAsset;
        }
        return wireAnnouncementPage.copy(str, str2, wireLegacyAsset);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.message;
    }

    public final WireLegacyAsset component3() {
        return this.titleAsset;
    }

    public final WireAnnouncementPage copy(String str, String str2, WireLegacyAsset wireLegacyAsset) {
        return new WireAnnouncementPage(str, str2, wireLegacyAsset);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireAnnouncementPage) {
            WireAnnouncementPage wireAnnouncementPage = (WireAnnouncementPage) obj;
            return Intrinsics.areEqual(this.title, wireAnnouncementPage.title) && Intrinsics.areEqual(this.message, wireAnnouncementPage.message) && Intrinsics.areEqual(this.titleAsset, wireAnnouncementPage.titleAsset);
        }
        return false;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getTitle() {
        return this.title;
    }

    public final WireLegacyAsset getTitleAsset() {
        return this.titleAsset;
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        WireLegacyAsset wireLegacyAsset = this.titleAsset;
        return hashCode2 + (wireLegacyAsset != null ? wireLegacyAsset.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.message;
        WireLegacyAsset wireLegacyAsset = this.titleAsset;
        return "WireAnnouncementPage(title=" + str + ", message=" + str2 + ", titleAsset=" + wireLegacyAsset + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.title);
        out.writeString(this.message);
        WireLegacyAsset wireLegacyAsset = this.titleAsset;
        if (wireLegacyAsset == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        wireLegacyAsset.writeToParcel(out, i);
    }

    public WireAnnouncementPage(String str, String str2, WireLegacyAsset wireLegacyAsset) {
        this.title = str;
        this.message = str2;
        this.titleAsset = wireLegacyAsset;
    }

    public /* synthetic */ WireAnnouncementPage(String str, String str2, WireLegacyAsset wireLegacyAsset, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : wireLegacyAsset);
    }
}
