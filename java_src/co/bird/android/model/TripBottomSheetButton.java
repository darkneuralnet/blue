package co.bird.android.model;

import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, m28432d2 = {"Lco/bird/android/model/TripBottomSheetButton;", "Lco/bird/android/model/BottomSheetButton;", "()V", "stopId", "", "getStopId", "()Ljava/lang/String;", Entry.TYPE_TEXT, "getText", "Lco/bird/android/model/TripDirectionsButton;", "Lco/bird/android/model/TripStopBirdButton;", "Lco/bird/android/model/TripStopPrimaryCTAButton;", "Lco/bird/android/model/TripStopSecondaryCTAButton;", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public abstract class TripBottomSheetButton implements BottomSheetButton {
    public /* synthetic */ TripBottomSheetButton(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getStopId();

    public abstract String getText();

    private TripBottomSheetButton() {
    }
}
