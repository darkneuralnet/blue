package co.bird.android.model.wire;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001a"}, m28432d2 = {"Lco/bird/android/model/wire/WireDisputeView;", "Landroid/os/Parcelable;", "disputable", "", "statusText", "", "(ZLjava/lang/String;)V", "getDisputable", "()Z", "getStatusText", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireDisputeView implements Parcelable {
    public static final Parcelable.Creator<WireDisputeView> CREATOR = new Creator();
    @JsonProperty("disputable")
    @InterfaceC41208ft5("disputable")
    private final boolean disputable;
    @JsonProperty("status_text")
    @InterfaceC41208ft5("status_text")
    private final String statusText;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WireDisputeView> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireDisputeView createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WireDisputeView(parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireDisputeView[] newArray(int i) {
            return new WireDisputeView[i];
        }
    }

    public WireDisputeView() {
        this(false, null, 3, null);
    }

    public static /* synthetic */ WireDisputeView copy$default(WireDisputeView wireDisputeView, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = wireDisputeView.disputable;
        }
        if ((i & 2) != 0) {
            str = wireDisputeView.statusText;
        }
        return wireDisputeView.copy(z, str);
    }

    public final boolean component1() {
        return this.disputable;
    }

    public final String component2() {
        return this.statusText;
    }

    public final WireDisputeView copy(boolean z, String str) {
        return new WireDisputeView(z, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireDisputeView) {
            WireDisputeView wireDisputeView = (WireDisputeView) obj;
            return this.disputable == wireDisputeView.disputable && Intrinsics.areEqual(this.statusText, wireDisputeView.statusText);
        }
        return false;
    }

    public final boolean getDisputable() {
        return this.disputable;
    }

    public final String getStatusText() {
        return this.statusText;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.disputable;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.statusText;
        return i + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        boolean z = this.disputable;
        String str = this.statusText;
        return "WireDisputeView(disputable=" + z + ", statusText=" + str + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.disputable ? 1 : 0);
        out.writeString(this.statusText);
    }

    public WireDisputeView(boolean z, String str) {
        this.disputable = z;
        this.statusText = str;
    }

    public /* synthetic */ WireDisputeView(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str);
    }
}
