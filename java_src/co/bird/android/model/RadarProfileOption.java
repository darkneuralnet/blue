package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.gms.common.Scopes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/model/RadarProfileOption;", "Landroid/os/Parcelable;", Scopes.PROFILE, "", "name", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getProfile", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RadarProfileOption implements Parcelable {
    public static final Parcelable.Creator<RadarProfileOption> CREATOR = new Creator();
    @JsonProperty("name")
    @InterfaceC41208ft5("name")
    private final String name;
    @JsonProperty(Scopes.PROFILE)
    @InterfaceC41208ft5(Scopes.PROFILE)
    private final String profile;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<RadarProfileOption> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RadarProfileOption createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RadarProfileOption(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RadarProfileOption[] newArray(int i) {
            return new RadarProfileOption[i];
        }
    }

    public RadarProfileOption() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ RadarProfileOption copy$default(RadarProfileOption radarProfileOption, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = radarProfileOption.profile;
        }
        if ((i & 2) != 0) {
            str2 = radarProfileOption.name;
        }
        return radarProfileOption.copy(str, str2);
    }

    public final String component1() {
        return this.profile;
    }

    public final String component2() {
        return this.name;
    }

    public final RadarProfileOption copy(String profile, String name) {
        Intrinsics.checkNotNullParameter(profile, "profile");
        Intrinsics.checkNotNullParameter(name, "name");
        return new RadarProfileOption(profile, name);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RadarProfileOption) {
            RadarProfileOption radarProfileOption = (RadarProfileOption) obj;
            return Intrinsics.areEqual(this.profile, radarProfileOption.profile) && Intrinsics.areEqual(this.name, radarProfileOption.name);
        }
        return false;
    }

    public final String getName() {
        return this.name;
    }

    public final String getProfile() {
        return this.profile;
    }

    public int hashCode() {
        return (this.profile.hashCode() * 31) + this.name.hashCode();
    }

    public String toString() {
        String str = this.profile;
        String str2 = this.name;
        return "RadarProfileOption(profile=" + str + ", name=" + str2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.profile);
        out.writeString(this.name);
    }

    public RadarProfileOption(String profile, String name) {
        Intrinsics.checkNotNullParameter(profile, "profile");
        Intrinsics.checkNotNullParameter(name, "name");
        this.profile = profile;
        this.name = name;
    }

    public /* synthetic */ RadarProfileOption(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
