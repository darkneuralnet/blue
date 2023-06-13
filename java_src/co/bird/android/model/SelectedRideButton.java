package co.bird.android.model;

import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\b\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001c"}, m28432d2 = {"Lco/bird/android/model/SelectedRideButton;", "Lco/bird/android/model/RideStatusBottomSheetButton;", "rideId", "", "userGuestId", Entry.TYPE_TEXT, "inProgress", "", "isEnabled", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getInProgress", "()Z", "getRideId", "()Ljava/lang/String;", "getText", "getUserGuestId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class SelectedRideButton extends RideStatusBottomSheetButton {
    private final boolean inProgress;
    private final boolean isEnabled;
    private final String rideId;
    private final String text;
    private final String userGuestId;

    public /* synthetic */ SelectedRideButton(String str, String str2, String str3, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? true : z2);
    }

    public static /* synthetic */ SelectedRideButton copy$default(SelectedRideButton selectedRideButton, String str, String str2, String str3, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = selectedRideButton.rideId;
        }
        if ((i & 2) != 0) {
            str2 = selectedRideButton.userGuestId;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = selectedRideButton.text;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            z = selectedRideButton.inProgress;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = selectedRideButton.isEnabled;
        }
        return selectedRideButton.copy(str, str4, str5, z3, z2);
    }

    public final String component1() {
        return this.rideId;
    }

    public final String component2() {
        return this.userGuestId;
    }

    public final String component3() {
        return this.text;
    }

    public final boolean component4() {
        return this.inProgress;
    }

    public final boolean component5() {
        return this.isEnabled;
    }

    public final SelectedRideButton copy(String rideId, String str, String text, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        Intrinsics.checkNotNullParameter(text, "text");
        return new SelectedRideButton(rideId, str, text, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SelectedRideButton) {
            SelectedRideButton selectedRideButton = (SelectedRideButton) obj;
            return Intrinsics.areEqual(this.rideId, selectedRideButton.rideId) && Intrinsics.areEqual(this.userGuestId, selectedRideButton.userGuestId) && Intrinsics.areEqual(this.text, selectedRideButton.text) && this.inProgress == selectedRideButton.inProgress && this.isEnabled == selectedRideButton.isEnabled;
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

    public final String getUserGuestId() {
        return this.userGuestId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.rideId.hashCode() * 31;
        String str = this.userGuestId;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.text.hashCode()) * 31;
        boolean z = this.inProgress;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z2 = this.isEnabled;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    @Override // co.bird.android.model.RideStatusBottomSheetButton
    public boolean isEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        String str = this.rideId;
        String str2 = this.userGuestId;
        String str3 = this.text;
        boolean z = this.inProgress;
        boolean z2 = this.isEnabled;
        return "SelectedRideButton(rideId=" + str + ", userGuestId=" + str2 + ", text=" + str3 + ", inProgress=" + z + ", isEnabled=" + z2 + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectedRideButton(String rideId, String str, String text, boolean z, boolean z2) {
        super(null);
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        Intrinsics.checkNotNullParameter(text, "text");
        this.rideId = rideId;
        this.userGuestId = str;
        this.text = text;
        this.inProgress = z;
        this.isEnabled = z2;
    }
}
