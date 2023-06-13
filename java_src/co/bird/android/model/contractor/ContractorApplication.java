package co.bird.android.model.contractor;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.ContractorLevel;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, m28432d2 = {"Lco/bird/android/model/contractor/ContractorApplication;", "Landroid/os/Parcelable;", "contractorLevel", "Lco/bird/android/model/ContractorLevel;", "banner", "Lco/bird/android/model/contractor/ContractorBanner;", "sideMenuItemText", "", "(Lco/bird/android/model/ContractorLevel;Lco/bird/android/model/contractor/ContractorBanner;Ljava/lang/String;)V", "getBanner", "()Lco/bird/android/model/contractor/ContractorBanner;", "getContractorLevel", "()Lco/bird/android/model/ContractorLevel;", "getSideMenuItemText", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ContractorApplication implements Parcelable {
    public static final Parcelable.Creator<ContractorApplication> CREATOR = new Creator();
    @JsonProperty("banner")
    @InterfaceC41208ft5("banner")
    private final ContractorBanner banner;
    @JsonProperty("contractor_level")
    @InterfaceC41208ft5("contractor_level")
    private final ContractorLevel contractorLevel;
    @JsonProperty("side_menu_item_text")
    @InterfaceC41208ft5("side_menu_item_text")
    private final String sideMenuItemText;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<ContractorApplication> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContractorApplication createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ContractorApplication(ContractorLevel.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : ContractorBanner.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContractorApplication[] newArray(int i) {
            return new ContractorApplication[i];
        }
    }

    public ContractorApplication(ContractorLevel contractorLevel, ContractorBanner contractorBanner, String str) {
        Intrinsics.checkNotNullParameter(contractorLevel, "contractorLevel");
        this.contractorLevel = contractorLevel;
        this.banner = contractorBanner;
        this.sideMenuItemText = str;
    }

    public static /* synthetic */ ContractorApplication copy$default(ContractorApplication contractorApplication, ContractorLevel contractorLevel, ContractorBanner contractorBanner, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            contractorLevel = contractorApplication.contractorLevel;
        }
        if ((i & 2) != 0) {
            contractorBanner = contractorApplication.banner;
        }
        if ((i & 4) != 0) {
            str = contractorApplication.sideMenuItemText;
        }
        return contractorApplication.copy(contractorLevel, contractorBanner, str);
    }

    public final ContractorLevel component1() {
        return this.contractorLevel;
    }

    public final ContractorBanner component2() {
        return this.banner;
    }

    public final String component3() {
        return this.sideMenuItemText;
    }

    public final ContractorApplication copy(ContractorLevel contractorLevel, ContractorBanner contractorBanner, String str) {
        Intrinsics.checkNotNullParameter(contractorLevel, "contractorLevel");
        return new ContractorApplication(contractorLevel, contractorBanner, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContractorApplication) {
            ContractorApplication contractorApplication = (ContractorApplication) obj;
            return this.contractorLevel == contractorApplication.contractorLevel && Intrinsics.areEqual(this.banner, contractorApplication.banner) && Intrinsics.areEqual(this.sideMenuItemText, contractorApplication.sideMenuItemText);
        }
        return false;
    }

    public final ContractorBanner getBanner() {
        return this.banner;
    }

    public final ContractorLevel getContractorLevel() {
        return this.contractorLevel;
    }

    public final String getSideMenuItemText() {
        return this.sideMenuItemText;
    }

    public int hashCode() {
        int hashCode = this.contractorLevel.hashCode() * 31;
        ContractorBanner contractorBanner = this.banner;
        int hashCode2 = (hashCode + (contractorBanner == null ? 0 : contractorBanner.hashCode())) * 31;
        String str = this.sideMenuItemText;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        ContractorLevel contractorLevel = this.contractorLevel;
        ContractorBanner contractorBanner = this.banner;
        String str = this.sideMenuItemText;
        return "ContractorApplication(contractorLevel=" + contractorLevel + ", banner=" + contractorBanner + ", sideMenuItemText=" + str + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.contractorLevel.name());
        ContractorBanner contractorBanner = this.banner;
        if (contractorBanner == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            contractorBanner.writeToParcel(out, i);
        }
        out.writeString(this.sideMenuItemText);
    }

    public /* synthetic */ ContractorApplication(ContractorLevel contractorLevel, ContractorBanner contractorBanner, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(contractorLevel, (i & 2) != 0 ? null : contractorBanner, (i & 4) != 0 ? null : str);
    }
}
