package co.bird.android.model.persistence.update;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.nestedstructures.BirdLabel;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import com.stripe.android.model.PaymentMethodOptionsParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, m28432d2 = {"Lco/bird/android/model/persistence/update/BirdMapMarkerUpdate;", "", "id", "", "batteryLevel", "", "location", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "label", "Lco/bird/android/model/persistence/nestedstructures/BirdLabel;", "(Ljava/lang/String;ILco/bird/android/model/persistence/nestedstructures/Geolocation;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/BirdLabel;)V", "getBatteryLevel", "()I", "getCode", "()Ljava/lang/String;", "getId", "getLabel", "()Lco/bird/android/model/persistence/nestedstructures/BirdLabel;", "getLocation", "()Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BirdMapMarkerUpdate {
    private final int batteryLevel;
    private final String code;

    /* renamed from: id */
    private final String f66710id;
    private final BirdLabel label;
    private final Geolocation location;

    public BirdMapMarkerUpdate(String id, int i, Geolocation location, String code, BirdLabel label) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f66710id = id;
        this.batteryLevel = i;
        this.location = location;
        this.code = code;
        this.label = label;
    }

    public static /* synthetic */ BirdMapMarkerUpdate copy$default(BirdMapMarkerUpdate birdMapMarkerUpdate, String str, int i, Geolocation geolocation, String str2, BirdLabel birdLabel, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = birdMapMarkerUpdate.f66710id;
        }
        if ((i2 & 2) != 0) {
            i = birdMapMarkerUpdate.batteryLevel;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            geolocation = birdMapMarkerUpdate.location;
        }
        Geolocation geolocation2 = geolocation;
        if ((i2 & 8) != 0) {
            str2 = birdMapMarkerUpdate.code;
        }
        String str3 = str2;
        if ((i2 & 16) != 0) {
            birdLabel = birdMapMarkerUpdate.label;
        }
        return birdMapMarkerUpdate.copy(str, i3, geolocation2, str3, birdLabel);
    }

    public final String component1() {
        return this.f66710id;
    }

    public final int component2() {
        return this.batteryLevel;
    }

    public final Geolocation component3() {
        return this.location;
    }

    public final String component4() {
        return this.code;
    }

    public final BirdLabel component5() {
        return this.label;
    }

    public final BirdMapMarkerUpdate copy(String id, int i, Geolocation location, String code, BirdLabel label) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(label, "label");
        return new BirdMapMarkerUpdate(id, i, location, code, label);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BirdMapMarkerUpdate) {
            BirdMapMarkerUpdate birdMapMarkerUpdate = (BirdMapMarkerUpdate) obj;
            return Intrinsics.areEqual(this.f66710id, birdMapMarkerUpdate.f66710id) && this.batteryLevel == birdMapMarkerUpdate.batteryLevel && Intrinsics.areEqual(this.location, birdMapMarkerUpdate.location) && Intrinsics.areEqual(this.code, birdMapMarkerUpdate.code) && Intrinsics.areEqual(this.label, birdMapMarkerUpdate.label);
        }
        return false;
    }

    public final int getBatteryLevel() {
        return this.batteryLevel;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getId() {
        return this.f66710id;
    }

    public final BirdLabel getLabel() {
        return this.label;
    }

    public final Geolocation getLocation() {
        return this.location;
    }

    public int hashCode() {
        return (((((((this.f66710id.hashCode() * 31) + Integer.hashCode(this.batteryLevel)) * 31) + this.location.hashCode()) * 31) + this.code.hashCode()) * 31) + this.label.hashCode();
    }

    public String toString() {
        String str = this.f66710id;
        int i = this.batteryLevel;
        Geolocation geolocation = this.location;
        String str2 = this.code;
        BirdLabel birdLabel = this.label;
        return "BirdMapMarkerUpdate(id=" + str + ", batteryLevel=" + i + ", location=" + geolocation + ", code=" + str2 + ", label=" + birdLabel + ")";
    }
}
