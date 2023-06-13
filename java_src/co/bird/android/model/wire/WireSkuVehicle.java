package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.core.networking.RequestHeadersFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/model/wire/WireSkuVehicle;", "", "id", "", RequestHeadersFactory.MODEL, "modelVersionTitle", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getModel", "getModelVersionTitle", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireSkuVehicle {
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66764id;
    @JsonProperty(RequestHeadersFactory.MODEL)
    @InterfaceC41208ft5(RequestHeadersFactory.MODEL)
    private final String model;
    @JsonProperty("model_version_title")
    @InterfaceC41208ft5("model_version_title")
    private final String modelVersionTitle;

    public WireSkuVehicle() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ WireSkuVehicle copy$default(WireSkuVehicle wireSkuVehicle, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireSkuVehicle.f66764id;
        }
        if ((i & 2) != 0) {
            str2 = wireSkuVehicle.model;
        }
        if ((i & 4) != 0) {
            str3 = wireSkuVehicle.modelVersionTitle;
        }
        return wireSkuVehicle.copy(str, str2, str3);
    }

    public final String component1() {
        return this.f66764id;
    }

    public final String component2() {
        return this.model;
    }

    public final String component3() {
        return this.modelVersionTitle;
    }

    public final WireSkuVehicle copy(String id, String str, String str2) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new WireSkuVehicle(id, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireSkuVehicle) {
            WireSkuVehicle wireSkuVehicle = (WireSkuVehicle) obj;
            return Intrinsics.areEqual(this.f66764id, wireSkuVehicle.f66764id) && Intrinsics.areEqual(this.model, wireSkuVehicle.model) && Intrinsics.areEqual(this.modelVersionTitle, wireSkuVehicle.modelVersionTitle);
        }
        return false;
    }

    public final String getId() {
        return this.f66764id;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getModelVersionTitle() {
        return this.modelVersionTitle;
    }

    public int hashCode() {
        int hashCode = this.f66764id.hashCode() * 31;
        String str = this.model;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.modelVersionTitle;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66764id;
        String str2 = this.model;
        String str3 = this.modelVersionTitle;
        return "WireSkuVehicle(id=" + str + ", model=" + str2 + ", modelVersionTitle=" + str3 + ")";
    }

    public WireSkuVehicle(String id, String str, String str2) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.f66764id = id;
        this.model = str;
        this.modelVersionTitle = str2;
    }

    public /* synthetic */ WireSkuVehicle(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
