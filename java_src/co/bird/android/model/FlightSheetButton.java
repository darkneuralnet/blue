package co.bird.android.model;

import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0004¢\u0006\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0013\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, m28432d2 = {"Lco/bird/android/model/FlightSheetButton;", "Lco/bird/android/model/BottomSheetButton;", "Lco/bird/android/model/OperatorBottomSheetButton;", "()V", Entry.TYPE_TEXT, "", "getText", "()Ljava/lang/String;", "Lco/bird/android/model/AllReviewsButton;", "Lco/bird/android/model/BatterySwapButton;", "Lco/bird/android/model/CampaignButton;", "Lco/bird/android/model/CannotAccessButton;", "Lco/bird/android/model/CannotCaptureReports;", "Lco/bird/android/model/DiagnosticsButton;", "Lco/bird/android/model/DrawableFlightSheetButton;", "Lco/bird/android/model/InspectionButton;", "Lco/bird/android/model/LastRideInfoButton;", "Lco/bird/android/model/LocateBirdButton;", "Lco/bird/android/model/MarkDamaged;", "Lco/bird/android/model/MarkForInspectionButton;", "Lco/bird/android/model/MarkMissingButton;", "Lco/bird/android/model/OtherPossibleLocationsButton;", "Lco/bird/android/model/PastRepairsButton;", "Lco/bird/android/model/PrivatePropertyButton;", "Lco/bird/android/model/QuickCaptureButton;", "Lco/bird/android/model/SearchNearbyButton;", "Lco/bird/android/model/UnmarkDamaged;", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public abstract class FlightSheetButton implements BottomSheetButton, OperatorBottomSheetButton {
    public /* synthetic */ FlightSheetButton(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getText();

    private FlightSheetButton() {
    }
}
