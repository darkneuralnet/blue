package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\nHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/model/GoIdentificationDeepLinkParams;", "Lco/bird/android/model/ParceableGoDeepLinkParams;", "showIDVFlow", "", "(Z)V", "getShowIDVFlow", "()Z", "component1", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class GoIdentificationDeepLinkParams implements ParceableGoDeepLinkParams {
    public static final Parcelable.Creator<GoIdentificationDeepLinkParams> CREATOR = new Creator();
    private final boolean showIDVFlow;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<GoIdentificationDeepLinkParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoIdentificationDeepLinkParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GoIdentificationDeepLinkParams(parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoIdentificationDeepLinkParams[] newArray(int i) {
            return new GoIdentificationDeepLinkParams[i];
        }
    }

    public GoIdentificationDeepLinkParams() {
        this(false, 1, null);
    }

    public static /* synthetic */ GoIdentificationDeepLinkParams copy$default(GoIdentificationDeepLinkParams goIdentificationDeepLinkParams, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = goIdentificationDeepLinkParams.showIDVFlow;
        }
        return goIdentificationDeepLinkParams.copy(z);
    }

    public final boolean component1() {
        return this.showIDVFlow;
    }

    public final GoIdentificationDeepLinkParams copy(boolean z) {
        return new GoIdentificationDeepLinkParams(z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GoIdentificationDeepLinkParams) && this.showIDVFlow == ((GoIdentificationDeepLinkParams) obj).showIDVFlow;
    }

    public final boolean getShowIDVFlow() {
        return this.showIDVFlow;
    }

    public int hashCode() {
        boolean z = this.showIDVFlow;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        boolean z = this.showIDVFlow;
        return "GoIdentificationDeepLinkParams(showIDVFlow=" + z + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.showIDVFlow ? 1 : 0);
    }

    public GoIdentificationDeepLinkParams(boolean z) {
        this.showIDVFlow = z;
    }

    public /* synthetic */ GoIdentificationDeepLinkParams(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
