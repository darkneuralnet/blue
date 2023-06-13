package co.bird.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireLegacyAsset;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006$"}, m28432d2 = {"Lco/bird/api/response/BeginnerModeRiderMapAction;", "Landroid/os/Parcelable;", "accelerationLevel", "", "mapToggleTitle", "contentTitle", "contentSubtitle", "asset", "Lco/bird/android/model/wire/WireLegacyAsset;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireLegacyAsset;)V", "getAccelerationLevel", "()Ljava/lang/String;", "getAsset", "()Lco/bird/android/model/wire/WireLegacyAsset;", "getContentSubtitle", "getContentTitle", "getMapToggleTitle", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BeginnerModeRiderMapAction implements Parcelable {
    public static final Parcelable.Creator<BeginnerModeRiderMapAction> CREATOR = new Creator();
    @JsonProperty("acceleration_level")
    @InterfaceC41208ft5("acceleration_level")
    private final String accelerationLevel;
    @JsonProperty("asset")
    @InterfaceC41208ft5("asset")
    private final WireLegacyAsset asset;
    @JsonProperty("subtitle")
    @InterfaceC41208ft5("subtitle")
    private final String contentSubtitle;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String contentTitle;
    @JsonProperty("map_toggle_title")
    @InterfaceC41208ft5("map_toggle_title")
    private final String mapToggleTitle;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<BeginnerModeRiderMapAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BeginnerModeRiderMapAction createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BeginnerModeRiderMapAction(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (WireLegacyAsset) parcel.readParcelable(BeginnerModeRiderMapAction.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BeginnerModeRiderMapAction[] newArray(int i) {
            return new BeginnerModeRiderMapAction[i];
        }
    }

    public BeginnerModeRiderMapAction(String accelerationLevel, String mapToggleTitle, String contentTitle, String contentSubtitle, WireLegacyAsset asset) {
        Intrinsics.checkNotNullParameter(accelerationLevel, "accelerationLevel");
        Intrinsics.checkNotNullParameter(mapToggleTitle, "mapToggleTitle");
        Intrinsics.checkNotNullParameter(contentTitle, "contentTitle");
        Intrinsics.checkNotNullParameter(contentSubtitle, "contentSubtitle");
        Intrinsics.checkNotNullParameter(asset, "asset");
        this.accelerationLevel = accelerationLevel;
        this.mapToggleTitle = mapToggleTitle;
        this.contentTitle = contentTitle;
        this.contentSubtitle = contentSubtitle;
        this.asset = asset;
    }

    public static /* synthetic */ BeginnerModeRiderMapAction copy$default(BeginnerModeRiderMapAction beginnerModeRiderMapAction, String str, String str2, String str3, String str4, WireLegacyAsset wireLegacyAsset, int i, Object obj) {
        if ((i & 1) != 0) {
            str = beginnerModeRiderMapAction.accelerationLevel;
        }
        if ((i & 2) != 0) {
            str2 = beginnerModeRiderMapAction.mapToggleTitle;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = beginnerModeRiderMapAction.contentTitle;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = beginnerModeRiderMapAction.contentSubtitle;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            wireLegacyAsset = beginnerModeRiderMapAction.asset;
        }
        return beginnerModeRiderMapAction.copy(str, str5, str6, str7, wireLegacyAsset);
    }

    public final String component1() {
        return this.accelerationLevel;
    }

    public final String component2() {
        return this.mapToggleTitle;
    }

    public final String component3() {
        return this.contentTitle;
    }

    public final String component4() {
        return this.contentSubtitle;
    }

    public final WireLegacyAsset component5() {
        return this.asset;
    }

    public final BeginnerModeRiderMapAction copy(String accelerationLevel, String mapToggleTitle, String contentTitle, String contentSubtitle, WireLegacyAsset asset) {
        Intrinsics.checkNotNullParameter(accelerationLevel, "accelerationLevel");
        Intrinsics.checkNotNullParameter(mapToggleTitle, "mapToggleTitle");
        Intrinsics.checkNotNullParameter(contentTitle, "contentTitle");
        Intrinsics.checkNotNullParameter(contentSubtitle, "contentSubtitle");
        Intrinsics.checkNotNullParameter(asset, "asset");
        return new BeginnerModeRiderMapAction(accelerationLevel, mapToggleTitle, contentTitle, contentSubtitle, asset);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BeginnerModeRiderMapAction) {
            BeginnerModeRiderMapAction beginnerModeRiderMapAction = (BeginnerModeRiderMapAction) obj;
            return Intrinsics.areEqual(this.accelerationLevel, beginnerModeRiderMapAction.accelerationLevel) && Intrinsics.areEqual(this.mapToggleTitle, beginnerModeRiderMapAction.mapToggleTitle) && Intrinsics.areEqual(this.contentTitle, beginnerModeRiderMapAction.contentTitle) && Intrinsics.areEqual(this.contentSubtitle, beginnerModeRiderMapAction.contentSubtitle) && Intrinsics.areEqual(this.asset, beginnerModeRiderMapAction.asset);
        }
        return false;
    }

    public final String getAccelerationLevel() {
        return this.accelerationLevel;
    }

    public final WireLegacyAsset getAsset() {
        return this.asset;
    }

    public final String getContentSubtitle() {
        return this.contentSubtitle;
    }

    public final String getContentTitle() {
        return this.contentTitle;
    }

    public final String getMapToggleTitle() {
        return this.mapToggleTitle;
    }

    public int hashCode() {
        return (((((((this.accelerationLevel.hashCode() * 31) + this.mapToggleTitle.hashCode()) * 31) + this.contentTitle.hashCode()) * 31) + this.contentSubtitle.hashCode()) * 31) + this.asset.hashCode();
    }

    public String toString() {
        String str = this.accelerationLevel;
        String str2 = this.mapToggleTitle;
        String str3 = this.contentTitle;
        String str4 = this.contentSubtitle;
        WireLegacyAsset wireLegacyAsset = this.asset;
        return "BeginnerModeRiderMapAction(accelerationLevel=" + str + ", mapToggleTitle=" + str2 + ", contentTitle=" + str3 + ", contentSubtitle=" + str4 + ", asset=" + wireLegacyAsset + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.accelerationLevel);
        out.writeString(this.mapToggleTitle);
        out.writeString(this.contentTitle);
        out.writeString(this.contentSubtitle);
        out.writeParcelable(this.asset, i);
    }

    public /* synthetic */ BeginnerModeRiderMapAction(String str, String str2, String str3, String str4, WireLegacyAsset wireLegacyAsset, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, wireLegacyAsset);
    }
}
