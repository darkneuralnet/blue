package co.bird.android.model;

import co.bird.android.model.wire.WireBird;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m28432d2 = {"Lco/bird/android/model/ScrapInspectionButton;", "Lco/bird/android/model/CommandCenterButton;", Entry.TYPE_TEXT, "", "bird", "Lco/bird/android/model/wire/WireBird;", "scrapRequest", "Lco/bird/android/model/VehicleScrapRequest;", "(Ljava/lang/String;Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/VehicleScrapRequest;)V", "getBird", "()Lco/bird/android/model/wire/WireBird;", "getScrapRequest", "()Lco/bird/android/model/VehicleScrapRequest;", "getText", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ScrapInspectionButton extends CommandCenterButton {
    private final WireBird bird;
    private final VehicleScrapRequest scrapRequest;
    private final String text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrapInspectionButton(String str, WireBird bird, VehicleScrapRequest vehicleScrapRequest) {
        super(null);
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.text = str;
        this.bird = bird;
        this.scrapRequest = vehicleScrapRequest;
    }

    public static /* synthetic */ ScrapInspectionButton copy$default(ScrapInspectionButton scrapInspectionButton, String str, WireBird wireBird, VehicleScrapRequest vehicleScrapRequest, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scrapInspectionButton.text;
        }
        if ((i & 2) != 0) {
            wireBird = scrapInspectionButton.bird;
        }
        if ((i & 4) != 0) {
            vehicleScrapRequest = scrapInspectionButton.scrapRequest;
        }
        return scrapInspectionButton.copy(str, wireBird, vehicleScrapRequest);
    }

    public final String component1() {
        return this.text;
    }

    public final WireBird component2() {
        return this.bird;
    }

    public final VehicleScrapRequest component3() {
        return this.scrapRequest;
    }

    public final ScrapInspectionButton copy(String str, WireBird bird, VehicleScrapRequest vehicleScrapRequest) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        return new ScrapInspectionButton(str, bird, vehicleScrapRequest);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ScrapInspectionButton) {
            ScrapInspectionButton scrapInspectionButton = (ScrapInspectionButton) obj;
            return Intrinsics.areEqual(this.text, scrapInspectionButton.text) && Intrinsics.areEqual(this.bird, scrapInspectionButton.bird) && Intrinsics.areEqual(this.scrapRequest, scrapInspectionButton.scrapRequest);
        }
        return false;
    }

    @Override // co.bird.android.model.CommandCenterButton
    public WireBird getBird() {
        return this.bird;
    }

    public final VehicleScrapRequest getScrapRequest() {
        return this.scrapRequest;
    }

    @Override // co.bird.android.model.CommandCenterButton
    public String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.text;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.bird.hashCode()) * 31;
        VehicleScrapRequest vehicleScrapRequest = this.scrapRequest;
        return hashCode + (vehicleScrapRequest != null ? vehicleScrapRequest.hashCode() : 0);
    }

    public String toString() {
        String str = this.text;
        WireBird wireBird = this.bird;
        VehicleScrapRequest vehicleScrapRequest = this.scrapRequest;
        return "ScrapInspectionButton(text=" + str + ", bird=" + wireBird + ", scrapRequest=" + vehicleScrapRequest + ")";
    }
}
