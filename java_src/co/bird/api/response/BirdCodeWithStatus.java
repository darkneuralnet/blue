package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireServiceCenterStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.model.PaymentMethodOptionsParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003JA\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, m28432d2 = {"Lco/bird/api/response/BirdCodeWithStatus;", "", "id", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "serialNumber", "status", "Lco/bird/android/model/wire/WireServiceCenterStatus;", RequestHeadersFactory.MODEL, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireServiceCenterStatus;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getId", "getModel", "getSerialNumber", "getStatus", "()Lco/bird/android/model/wire/WireServiceCenterStatus;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BirdCodeWithStatus {
    @JsonProperty(PaymentMethodOptionsParams.Blik.PARAM_CODE)
    @InterfaceC41208ft5(PaymentMethodOptionsParams.Blik.PARAM_CODE)
    private final String code;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f68209id;
    @JsonProperty(RequestHeadersFactory.MODEL)
    @InterfaceC41208ft5(RequestHeadersFactory.MODEL)
    private final String model;
    @JsonProperty("serial_number")
    @InterfaceC41208ft5("serial_number")
    private final String serialNumber;
    @JsonProperty("status")
    @InterfaceC41208ft5("status")
    private final WireServiceCenterStatus status;

    public BirdCodeWithStatus() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ BirdCodeWithStatus copy$default(BirdCodeWithStatus birdCodeWithStatus, String str, String str2, String str3, WireServiceCenterStatus wireServiceCenterStatus, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = birdCodeWithStatus.f68209id;
        }
        if ((i & 2) != 0) {
            str2 = birdCodeWithStatus.code;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = birdCodeWithStatus.serialNumber;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            wireServiceCenterStatus = birdCodeWithStatus.status;
        }
        WireServiceCenterStatus wireServiceCenterStatus2 = wireServiceCenterStatus;
        if ((i & 16) != 0) {
            str4 = birdCodeWithStatus.model;
        }
        return birdCodeWithStatus.copy(str, str5, str6, wireServiceCenterStatus2, str4);
    }

    public final String component1() {
        return this.f68209id;
    }

    public final String component2() {
        return this.code;
    }

    public final String component3() {
        return this.serialNumber;
    }

    public final WireServiceCenterStatus component4() {
        return this.status;
    }

    public final String component5() {
        return this.model;
    }

    public final BirdCodeWithStatus copy(String id, String code, String str, WireServiceCenterStatus wireServiceCenterStatus, String str2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(code, "code");
        return new BirdCodeWithStatus(id, code, str, wireServiceCenterStatus, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BirdCodeWithStatus) {
            BirdCodeWithStatus birdCodeWithStatus = (BirdCodeWithStatus) obj;
            return Intrinsics.areEqual(this.f68209id, birdCodeWithStatus.f68209id) && Intrinsics.areEqual(this.code, birdCodeWithStatus.code) && Intrinsics.areEqual(this.serialNumber, birdCodeWithStatus.serialNumber) && Intrinsics.areEqual(this.status, birdCodeWithStatus.status) && Intrinsics.areEqual(this.model, birdCodeWithStatus.model);
        }
        return false;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getId() {
        return this.f68209id;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getSerialNumber() {
        return this.serialNumber;
    }

    public final WireServiceCenterStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = ((this.f68209id.hashCode() * 31) + this.code.hashCode()) * 31;
        String str = this.serialNumber;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        WireServiceCenterStatus wireServiceCenterStatus = this.status;
        int hashCode3 = (hashCode2 + (wireServiceCenterStatus == null ? 0 : wireServiceCenterStatus.hashCode())) * 31;
        String str2 = this.model;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.f68209id;
        String str2 = this.code;
        String str3 = this.serialNumber;
        WireServiceCenterStatus wireServiceCenterStatus = this.status;
        String str4 = this.model;
        return "BirdCodeWithStatus(id=" + str + ", code=" + str2 + ", serialNumber=" + str3 + ", status=" + wireServiceCenterStatus + ", model=" + str4 + ")";
    }

    public BirdCodeWithStatus(String id, String code, String str, WireServiceCenterStatus wireServiceCenterStatus, String str2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(code, "code");
        this.f68209id = id;
        this.code = code;
        this.serialNumber = str;
        this.status = wireServiceCenterStatus;
        this.model = str2;
    }

    public /* synthetic */ BirdCodeWithStatus(String str, String str2, String str3, WireServiceCenterStatus wireServiceCenterStatus, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : wireServiceCenterStatus, (i & 16) != 0 ? null : str4);
    }
}
