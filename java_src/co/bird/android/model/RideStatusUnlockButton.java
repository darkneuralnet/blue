package co.bird.android.model;

import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/model/RideStatusUnlockButton;", "Lco/bird/android/model/RideStatusBottomSheetButton;", "rideId", "", Entry.TYPE_TEXT, "inProgress", "", "isEnabled", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "getInProgress", "()Z", "getRideId", "()Ljava/lang/String;", "getText", "component1", "component2", "component3", "component4", "copy", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RideStatusUnlockButton extends RideStatusBottomSheetButton {
    private final boolean inProgress;
    private final boolean isEnabled;
    private final String rideId;
    private final String text;

    public /* synthetic */ RideStatusUnlockButton(String str, String str2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? true : z2);
    }

    public static /* synthetic */ RideStatusUnlockButton copy$default(RideStatusUnlockButton rideStatusUnlockButton, String str, String str2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rideStatusUnlockButton.rideId;
        }
        if ((i & 2) != 0) {
            str2 = rideStatusUnlockButton.text;
        }
        if ((i & 4) != 0) {
            z = rideStatusUnlockButton.inProgress;
        }
        if ((i & 8) != 0) {
            z2 = rideStatusUnlockButton.isEnabled;
        }
        return rideStatusUnlockButton.copy(str, str2, z, z2);
    }

    public final String component1() {
        return this.rideId;
    }

    public final String component2() {
        return this.text;
    }

    public final boolean component3() {
        return this.inProgress;
    }

    public final boolean component4() {
        return this.isEnabled;
    }

    public final RideStatusUnlockButton copy(String str, String text, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new RideStatusUnlockButton(str, text, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RideStatusUnlockButton) {
            RideStatusUnlockButton rideStatusUnlockButton = (RideStatusUnlockButton) obj;
            return Intrinsics.areEqual(this.rideId, rideStatusUnlockButton.rideId) && Intrinsics.areEqual(this.text, rideStatusUnlockButton.text) && this.inProgress == rideStatusUnlockButton.inProgress && this.isEnabled == rideStatusUnlockButton.isEnabled;
        }
        return false;
    }

    @Override // co.bird.android.model.RideStatusBottomSheetButton
    public boolean getInProgress() {
        return this.inProgress;
    }

    public final String getRideId() {
        return this.rideId;
    }

    @Override // co.bird.android.model.RideStatusBottomSheetButton
    public String getText() {
        return this.text;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.rideId;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.text.hashCode()) * 31;
        boolean z = this.inProgress;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.isEnabled;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    @Override // co.bird.android.model.RideStatusBottomSheetButton
    public boolean isEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        String str = this.rideId;
        String str2 = this.text;
        boolean z = this.inProgress;
        boolean z2 = this.isEnabled;
        return "RideStatusUnlockButton(rideId=" + str + ", text=" + str2 + ", inProgress=" + z + ", isEnabled=" + z2 + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideStatusUnlockButton(String str, String text, boolean z, boolean z2) {
        super(null);
        Intrinsics.checkNotNullParameter(text, "text");
        this.rideId = str;
        this.text = text;
        this.inProgress = z;
        this.isEnabled = z2;
    }
}
