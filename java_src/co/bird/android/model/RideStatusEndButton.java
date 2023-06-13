package co.bird.android.model;

import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/model/RideStatusEndButton;", "Lco/bird/android/model/RideStatusBottomSheetButton;", Entry.TYPE_TEXT, "", "inProgress", "", "isEnabled", "(Ljava/lang/String;ZZ)V", "getInProgress", "()Z", "getText", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RideStatusEndButton extends RideStatusBottomSheetButton {
    private final boolean inProgress;
    private final boolean isEnabled;
    private final String text;

    public /* synthetic */ RideStatusEndButton(String str, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? true : z2);
    }

    public static /* synthetic */ RideStatusEndButton copy$default(RideStatusEndButton rideStatusEndButton, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rideStatusEndButton.text;
        }
        if ((i & 2) != 0) {
            z = rideStatusEndButton.inProgress;
        }
        if ((i & 4) != 0) {
            z2 = rideStatusEndButton.isEnabled;
        }
        return rideStatusEndButton.copy(str, z, z2);
    }

    public final String component1() {
        return this.text;
    }

    public final boolean component2() {
        return this.inProgress;
    }

    public final boolean component3() {
        return this.isEnabled;
    }

    public final RideStatusEndButton copy(String text, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new RideStatusEndButton(text, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RideStatusEndButton) {
            RideStatusEndButton rideStatusEndButton = (RideStatusEndButton) obj;
            return Intrinsics.areEqual(this.text, rideStatusEndButton.text) && this.inProgress == rideStatusEndButton.inProgress && this.isEnabled == rideStatusEndButton.isEnabled;
        }
        return false;
    }

    @Override // co.bird.android.model.RideStatusBottomSheetButton
    public boolean getInProgress() {
        return this.inProgress;
    }

    @Override // co.bird.android.model.RideStatusBottomSheetButton
    public String getText() {
        return this.text;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
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
        String str = this.text;
        boolean z = this.inProgress;
        boolean z2 = this.isEnabled;
        return "RideStatusEndButton(text=" + str + ", inProgress=" + z + ", isEnabled=" + z2 + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideStatusEndButton(String text, boolean z, boolean z2) {
        super(null);
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.inProgress = z;
        this.isEnabled = z2;
    }
}
