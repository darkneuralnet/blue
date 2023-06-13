package co.bird.android.model;

import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0006R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0007\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, m28432d2 = {"Lco/bird/android/model/RideStatusBottomSheetButton;", "Lco/bird/android/model/BottomSheetButton;", "()V", "inProgress", "", "getInProgress", "()Z", "isEnabled", Entry.TYPE_TEXT, "", "getText", "()Ljava/lang/String;", "Lco/bird/android/model/EndSelectedRideButton;", "Lco/bird/android/model/RideStatusEndButton;", "Lco/bird/android/model/RideStatusLockButton;", "Lco/bird/android/model/RideStatusManageRidesButton;", "Lco/bird/android/model/RideStatusScanAfterReserveButton;", "Lco/bird/android/model/RideStatusUnlockButton;", "Lco/bird/android/model/SelectedRideButton;", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public abstract class RideStatusBottomSheetButton implements BottomSheetButton {
    public /* synthetic */ RideStatusBottomSheetButton(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract boolean getInProgress();

    public abstract String getText();

    public abstract boolean isEnabled();

    private RideStatusBottomSheetButton() {
    }
}
