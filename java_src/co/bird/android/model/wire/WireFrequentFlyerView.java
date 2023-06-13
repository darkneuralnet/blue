package co.bird.android.model.wire;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f¢\u0006\u0002\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010(\u001a\u00020\fHÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J}\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\fHÆ\u0001J\t\u0010+\u001a\u00020\fHÖ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020\fHÖ\u0001J\t\u00101\u001a\u00020\u0005HÖ\u0001J\u0019\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\fHÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0016\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00067"}, m28432d2 = {"Lco/bird/android/model/wire/WireFrequentFlyerView;", "Landroid/os/Parcelable;", "progress", "Lco/bird/android/model/wire/WireFrequentFlyerProgress;", "headline", "", "currentLevelStatus", "navigationStatus", "mapStatus", "scannerStatus", "rideEndStatus", "headerLevel", "", "tierViews", "", "Lco/bird/android/model/wire/WireTierView;", "selectedLevelIndex", "(Lco/bird/android/model/wire/WireFrequentFlyerProgress;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;I)V", "getCurrentLevelStatus", "()Ljava/lang/String;", "getHeaderLevel", "()I", "getHeadline", "getMapStatus", "getNavigationStatus", "getProgress", "()Lco/bird/android/model/wire/WireFrequentFlyerProgress;", "getRideEndStatus", "getScannerStatus", "getSelectedLevelIndex", "getTierViews", "()Ljava/util/List;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireFrequentFlyerView implements Parcelable {
    public static final Parcelable.Creator<WireFrequentFlyerView> CREATOR = new Creator();
    @JsonProperty("current_level_status")
    @InterfaceC41208ft5("current_level_status")
    private final String currentLevelStatus;
    @JsonProperty("header_level")
    @InterfaceC41208ft5("header_level")
    private final int headerLevel;
    @JsonProperty("headline")
    @InterfaceC41208ft5("headline")
    private final String headline;
    @JsonProperty("map_status")
    @InterfaceC41208ft5("map_status")
    private final String mapStatus;
    @JsonProperty("navigation_status")
    @InterfaceC41208ft5("navigation_status")
    private final String navigationStatus;
    @JsonProperty("progress")
    @InterfaceC41208ft5("progress")
    private final WireFrequentFlyerProgress progress;
    @JsonProperty("ride_end_status")
    @InterfaceC41208ft5("ride_end_status")
    private final String rideEndStatus;
    @JsonProperty("scanner_status")
    @InterfaceC41208ft5("scanner_status")
    private final String scannerStatus;
    @JsonProperty("selected_level_index")
    @InterfaceC41208ft5("selected_level_index")
    private final int selectedLevelIndex;
    @JsonProperty("tier_views")
    @InterfaceC41208ft5("tier_views")
    private final List<WireTierView> tierViews;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WireFrequentFlyerView> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireFrequentFlyerView createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            WireFrequentFlyerProgress createFromParcel = WireFrequentFlyerProgress.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            for (int i = 0; i != readInt2; i++) {
                arrayList.add(WireTierView.CREATOR.createFromParcel(parcel));
            }
            return new WireFrequentFlyerView(createFromParcel, readString, readString2, readString3, readString4, readString5, readString6, readInt, arrayList, parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireFrequentFlyerView[] newArray(int i) {
            return new WireFrequentFlyerView[i];
        }
    }

    public WireFrequentFlyerView(WireFrequentFlyerProgress progress, String headline, String str, String str2, String str3, String str4, String str5, int i, List<WireTierView> tierViews, int i2) {
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(headline, "headline");
        Intrinsics.checkNotNullParameter(tierViews, "tierViews");
        this.progress = progress;
        this.headline = headline;
        this.currentLevelStatus = str;
        this.navigationStatus = str2;
        this.mapStatus = str3;
        this.scannerStatus = str4;
        this.rideEndStatus = str5;
        this.headerLevel = i;
        this.tierViews = tierViews;
        this.selectedLevelIndex = i2;
    }

    public final WireFrequentFlyerProgress component1() {
        return this.progress;
    }

    public final int component10() {
        return this.selectedLevelIndex;
    }

    public final String component2() {
        return this.headline;
    }

    public final String component3() {
        return this.currentLevelStatus;
    }

    public final String component4() {
        return this.navigationStatus;
    }

    public final String component5() {
        return this.mapStatus;
    }

    public final String component6() {
        return this.scannerStatus;
    }

    public final String component7() {
        return this.rideEndStatus;
    }

    public final int component8() {
        return this.headerLevel;
    }

    public final List<WireTierView> component9() {
        return this.tierViews;
    }

    public final WireFrequentFlyerView copy(WireFrequentFlyerProgress progress, String headline, String str, String str2, String str3, String str4, String str5, int i, List<WireTierView> tierViews, int i2) {
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(headline, "headline");
        Intrinsics.checkNotNullParameter(tierViews, "tierViews");
        return new WireFrequentFlyerView(progress, headline, str, str2, str3, str4, str5, i, tierViews, i2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireFrequentFlyerView) {
            WireFrequentFlyerView wireFrequentFlyerView = (WireFrequentFlyerView) obj;
            return Intrinsics.areEqual(this.progress, wireFrequentFlyerView.progress) && Intrinsics.areEqual(this.headline, wireFrequentFlyerView.headline) && Intrinsics.areEqual(this.currentLevelStatus, wireFrequentFlyerView.currentLevelStatus) && Intrinsics.areEqual(this.navigationStatus, wireFrequentFlyerView.navigationStatus) && Intrinsics.areEqual(this.mapStatus, wireFrequentFlyerView.mapStatus) && Intrinsics.areEqual(this.scannerStatus, wireFrequentFlyerView.scannerStatus) && Intrinsics.areEqual(this.rideEndStatus, wireFrequentFlyerView.rideEndStatus) && this.headerLevel == wireFrequentFlyerView.headerLevel && Intrinsics.areEqual(this.tierViews, wireFrequentFlyerView.tierViews) && this.selectedLevelIndex == wireFrequentFlyerView.selectedLevelIndex;
        }
        return false;
    }

    public final String getCurrentLevelStatus() {
        return this.currentLevelStatus;
    }

    public final int getHeaderLevel() {
        return this.headerLevel;
    }

    public final String getHeadline() {
        return this.headline;
    }

    public final String getMapStatus() {
        return this.mapStatus;
    }

    public final String getNavigationStatus() {
        return this.navigationStatus;
    }

    public final WireFrequentFlyerProgress getProgress() {
        return this.progress;
    }

    public final String getRideEndStatus() {
        return this.rideEndStatus;
    }

    public final String getScannerStatus() {
        return this.scannerStatus;
    }

    public final int getSelectedLevelIndex() {
        return this.selectedLevelIndex;
    }

    public final List<WireTierView> getTierViews() {
        return this.tierViews;
    }

    public int hashCode() {
        int hashCode = ((this.progress.hashCode() * 31) + this.headline.hashCode()) * 31;
        String str = this.currentLevelStatus;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.navigationStatus;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mapStatus;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.scannerStatus;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.rideEndStatus;
        return ((((((hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31) + Integer.hashCode(this.headerLevel)) * 31) + this.tierViews.hashCode()) * 31) + Integer.hashCode(this.selectedLevelIndex);
    }

    public String toString() {
        WireFrequentFlyerProgress wireFrequentFlyerProgress = this.progress;
        String str = this.headline;
        String str2 = this.currentLevelStatus;
        String str3 = this.navigationStatus;
        String str4 = this.mapStatus;
        String str5 = this.scannerStatus;
        String str6 = this.rideEndStatus;
        int i = this.headerLevel;
        List<WireTierView> list = this.tierViews;
        int i2 = this.selectedLevelIndex;
        return "WireFrequentFlyerView(progress=" + wireFrequentFlyerProgress + ", headline=" + str + ", currentLevelStatus=" + str2 + ", navigationStatus=" + str3 + ", mapStatus=" + str4 + ", scannerStatus=" + str5 + ", rideEndStatus=" + str6 + ", headerLevel=" + i + ", tierViews=" + list + ", selectedLevelIndex=" + i2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        this.progress.writeToParcel(out, i);
        out.writeString(this.headline);
        out.writeString(this.currentLevelStatus);
        out.writeString(this.navigationStatus);
        out.writeString(this.mapStatus);
        out.writeString(this.scannerStatus);
        out.writeString(this.rideEndStatus);
        out.writeInt(this.headerLevel);
        List<WireTierView> list = this.tierViews;
        out.writeInt(list.size());
        for (WireTierView wireTierView : list) {
            wireTierView.writeToParcel(out, i);
        }
        out.writeInt(this.selectedLevelIndex);
    }

    public /* synthetic */ WireFrequentFlyerView(WireFrequentFlyerProgress wireFrequentFlyerProgress, String str, String str2, String str3, String str4, String str5, String str6, int i, List list, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(wireFrequentFlyerProgress, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? null : str2, (i3 & 8) != 0 ? null : str3, (i3 & 16) != 0 ? null : str4, (i3 & 32) != 0 ? null : str5, (i3 & 64) == 0 ? str6 : null, (i3 & 128) != 0 ? 0 : i, (i3 & 256) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i3 & 512) == 0 ? i2 : 0);
    }
}
