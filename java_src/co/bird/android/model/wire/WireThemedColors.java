package co.bird.android.model.wire;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/model/wire/WireThemedColors;", "Landroid/os/Parcelable;", "lightMode", "", "darkMode", "(II)V", "getDarkMode", "()I", "getLightMode", "component1", "component2", "copy", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireThemedColors implements Parcelable {
    public static final Parcelable.Creator<WireThemedColors> CREATOR = new Creator();
    @JsonProperty("dark_mode")
    @InterfaceC41208ft5("dark_mode")
    private final int darkMode;
    @JsonProperty("light_mode")
    @InterfaceC41208ft5("light_mode")
    private final int lightMode;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WireThemedColors> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireThemedColors createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WireThemedColors(parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireThemedColors[] newArray(int i) {
            return new WireThemedColors[i];
        }
    }

    public WireThemedColors() {
        this(0, 0, 3, null);
    }

    public static /* synthetic */ WireThemedColors copy$default(WireThemedColors wireThemedColors, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = wireThemedColors.lightMode;
        }
        if ((i3 & 2) != 0) {
            i2 = wireThemedColors.darkMode;
        }
        return wireThemedColors.copy(i, i2);
    }

    public final int component1() {
        return this.lightMode;
    }

    public final int component2() {
        return this.darkMode;
    }

    public final WireThemedColors copy(int i, int i2) {
        return new WireThemedColors(i, i2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireThemedColors) {
            WireThemedColors wireThemedColors = (WireThemedColors) obj;
            return this.lightMode == wireThemedColors.lightMode && this.darkMode == wireThemedColors.darkMode;
        }
        return false;
    }

    public final int getDarkMode() {
        return this.darkMode;
    }

    public final int getLightMode() {
        return this.lightMode;
    }

    public int hashCode() {
        return (Integer.hashCode(this.lightMode) * 31) + Integer.hashCode(this.darkMode);
    }

    public String toString() {
        int i = this.lightMode;
        int i2 = this.darkMode;
        return "WireThemedColors(lightMode=" + i + ", darkMode=" + i2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.lightMode);
        out.writeInt(this.darkMode);
    }

    public WireThemedColors(int i, int i2) {
        this.lightMode = i;
        this.darkMode = i2;
    }

    public /* synthetic */ WireThemedColors(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
