package co.bird.android.model;

import co.bird.android.model.wire.WireBird;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\f\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, m28432d2 = {"Lco/bird/android/model/CommandCenterButton;", "", "()V", "bird", "Lco/bird/android/model/wire/WireBird;", "getBird", "()Lco/bird/android/model/wire/WireBird;", Entry.TYPE_TEXT, "", "getText", "()Ljava/lang/String;", "Lco/bird/android/model/ActiveWorkOrderButton;", "Lco/bird/android/model/EntryRoutingButton;", "Lco/bird/android/model/InspectButton;", "Lco/bird/android/model/MarkDamagedButton;", "Lco/bird/android/model/PastWorkOrderButton;", "Lco/bird/android/model/QualityControlButton;", "Lco/bird/android/model/RepairButton;", "Lco/bird/android/model/ScrapCompletionButton;", "Lco/bird/android/model/ScrapInspectionButton;", "Lco/bird/android/model/UnmarkDamagedButton;", "Lco/bird/android/model/UpdateServiceProgressButton;", "Lco/bird/android/model/UpdateVehicleActionButton;", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public abstract class CommandCenterButton {
    public /* synthetic */ CommandCenterButton(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract WireBird getBird();

    public abstract String getText();

    private CommandCenterButton() {
    }
}
