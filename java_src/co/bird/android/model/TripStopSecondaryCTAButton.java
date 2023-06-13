package co.bird.android.model;

import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/model/TripStopSecondaryCTAButton;", "Lco/bird/android/model/TripBottomSheetButton;", "kind", "", Entry.TYPE_TEXT, "stopId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getKind", "()Ljava/lang/String;", "getStopId", "getText", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class TripStopSecondaryCTAButton extends TripBottomSheetButton {
    private final String kind;
    private final String stopId;
    private final String text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripStopSecondaryCTAButton(String kind, String text, String stopId) {
        super(null);
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(stopId, "stopId");
        this.kind = kind;
        this.text = text;
        this.stopId = stopId;
    }

    public static /* synthetic */ TripStopSecondaryCTAButton copy$default(TripStopSecondaryCTAButton tripStopSecondaryCTAButton, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tripStopSecondaryCTAButton.kind;
        }
        if ((i & 2) != 0) {
            str2 = tripStopSecondaryCTAButton.text;
        }
        if ((i & 4) != 0) {
            str3 = tripStopSecondaryCTAButton.stopId;
        }
        return tripStopSecondaryCTAButton.copy(str, str2, str3);
    }

    public final String component1() {
        return this.kind;
    }

    public final String component2() {
        return this.text;
    }

    public final String component3() {
        return this.stopId;
    }

    public final TripStopSecondaryCTAButton copy(String kind, String text, String stopId) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(stopId, "stopId");
        return new TripStopSecondaryCTAButton(kind, text, stopId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TripStopSecondaryCTAButton) {
            TripStopSecondaryCTAButton tripStopSecondaryCTAButton = (TripStopSecondaryCTAButton) obj;
            return Intrinsics.areEqual(this.kind, tripStopSecondaryCTAButton.kind) && Intrinsics.areEqual(this.text, tripStopSecondaryCTAButton.text) && Intrinsics.areEqual(this.stopId, tripStopSecondaryCTAButton.stopId);
        }
        return false;
    }

    public final String getKind() {
        return this.kind;
    }

    @Override // co.bird.android.model.TripBottomSheetButton
    public String getStopId() {
        return this.stopId;
    }

    @Override // co.bird.android.model.TripBottomSheetButton
    public String getText() {
        return this.text;
    }

    public int hashCode() {
        return (((this.kind.hashCode() * 31) + this.text.hashCode()) * 31) + this.stopId.hashCode();
    }

    public String toString() {
        String str = this.kind;
        String str2 = this.text;
        String str3 = this.stopId;
        return "TripStopSecondaryCTAButton(kind=" + str + ", text=" + str2 + ", stopId=" + str3 + ")";
    }
}
