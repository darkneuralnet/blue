package co.bird.android.model;

import co.bird.android.model.wire.WireDrop;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0007\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001b"}, m28432d2 = {"Lco/bird/android/model/TripStopPrimaryCTAButton;", "Lco/bird/android/model/TripBottomSheetButton;", "kind", "", "drop", "Lco/bird/android/model/wire/WireDrop;", Entry.TYPE_TEXT, "stopId", "(Ljava/lang/String;Lco/bird/android/model/wire/WireDrop;Ljava/lang/String;Ljava/lang/String;)V", "getDrop", "()Lco/bird/android/model/wire/WireDrop;", "getKind", "()Ljava/lang/String;", "getStopId", "getText", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class TripStopPrimaryCTAButton extends TripBottomSheetButton {
    private final WireDrop drop;
    private final String kind;
    private final String stopId;
    private final String text;

    public /* synthetic */ TripStopPrimaryCTAButton(String str, WireDrop wireDrop, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : wireDrop, str2, str3);
    }

    public static /* synthetic */ TripStopPrimaryCTAButton copy$default(TripStopPrimaryCTAButton tripStopPrimaryCTAButton, String str, WireDrop wireDrop, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tripStopPrimaryCTAButton.kind;
        }
        if ((i & 2) != 0) {
            wireDrop = tripStopPrimaryCTAButton.drop;
        }
        if ((i & 4) != 0) {
            str2 = tripStopPrimaryCTAButton.text;
        }
        if ((i & 8) != 0) {
            str3 = tripStopPrimaryCTAButton.stopId;
        }
        return tripStopPrimaryCTAButton.copy(str, wireDrop, str2, str3);
    }

    public final String component1() {
        return this.kind;
    }

    public final WireDrop component2() {
        return this.drop;
    }

    public final String component3() {
        return this.text;
    }

    public final String component4() {
        return this.stopId;
    }

    public final TripStopPrimaryCTAButton copy(String kind, WireDrop wireDrop, String text, String stopId) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(stopId, "stopId");
        return new TripStopPrimaryCTAButton(kind, wireDrop, text, stopId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TripStopPrimaryCTAButton) {
            TripStopPrimaryCTAButton tripStopPrimaryCTAButton = (TripStopPrimaryCTAButton) obj;
            return Intrinsics.areEqual(this.kind, tripStopPrimaryCTAButton.kind) && Intrinsics.areEqual(this.drop, tripStopPrimaryCTAButton.drop) && Intrinsics.areEqual(this.text, tripStopPrimaryCTAButton.text) && Intrinsics.areEqual(this.stopId, tripStopPrimaryCTAButton.stopId);
        }
        return false;
    }

    public final WireDrop getDrop() {
        return this.drop;
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
        int hashCode = this.kind.hashCode() * 31;
        WireDrop wireDrop = this.drop;
        return ((((hashCode + (wireDrop == null ? 0 : wireDrop.hashCode())) * 31) + this.text.hashCode()) * 31) + this.stopId.hashCode();
    }

    public String toString() {
        String str = this.kind;
        WireDrop wireDrop = this.drop;
        String str2 = this.text;
        String str3 = this.stopId;
        return "TripStopPrimaryCTAButton(kind=" + str + ", drop=" + wireDrop + ", text=" + str2 + ", stopId=" + str3 + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripStopPrimaryCTAButton(String kind, WireDrop wireDrop, String text, String stopId) {
        super(null);
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(stopId, "stopId");
        this.kind = kind;
        this.drop = wireDrop;
        this.text = text;
        this.stopId = stopId;
    }
}
