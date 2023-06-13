package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.NokelockResponseType;
import co.bird.android.model.wire.WireNokelockResponseData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m28432d2 = {"Lco/bird/api/response/NokelockResponse;", "", "type", "Lco/bird/android/model/constant/NokelockResponseType;", MessageExtension.FIELD_DATA, "Lco/bird/android/model/wire/WireNokelockResponseData;", "(Lco/bird/android/model/constant/NokelockResponseType;Lco/bird/android/model/wire/WireNokelockResponseData;)V", "getData", "()Lco/bird/android/model/wire/WireNokelockResponseData;", "getType", "()Lco/bird/android/model/constant/NokelockResponseType;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class NokelockResponse {
    @JsonProperty(MessageExtension.FIELD_DATA)
    @InterfaceC41208ft5(MessageExtension.FIELD_DATA)
    private final WireNokelockResponseData data;
    @JsonProperty("type")
    @InterfaceC41208ft5("type")
    private final NokelockResponseType type;

    public NokelockResponse(NokelockResponseType type, WireNokelockResponseData data) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(data, "data");
        this.type = type;
        this.data = data;
    }

    public static /* synthetic */ NokelockResponse copy$default(NokelockResponse nokelockResponse, NokelockResponseType nokelockResponseType, WireNokelockResponseData wireNokelockResponseData, int i, Object obj) {
        if ((i & 1) != 0) {
            nokelockResponseType = nokelockResponse.type;
        }
        if ((i & 2) != 0) {
            wireNokelockResponseData = nokelockResponse.data;
        }
        return nokelockResponse.copy(nokelockResponseType, wireNokelockResponseData);
    }

    public final NokelockResponseType component1() {
        return this.type;
    }

    public final WireNokelockResponseData component2() {
        return this.data;
    }

    public final NokelockResponse copy(NokelockResponseType type, WireNokelockResponseData data) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(data, "data");
        return new NokelockResponse(type, data);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NokelockResponse) {
            NokelockResponse nokelockResponse = (NokelockResponse) obj;
            return this.type == nokelockResponse.type && Intrinsics.areEqual(this.data, nokelockResponse.data);
        }
        return false;
    }

    public final WireNokelockResponseData getData() {
        return this.data;
    }

    public final NokelockResponseType getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + this.data.hashCode();
    }

    public String toString() {
        NokelockResponseType nokelockResponseType = this.type;
        WireNokelockResponseData wireNokelockResponseData = this.data;
        return "NokelockResponse(type=" + nokelockResponseType + ", data=" + wireNokelockResponseData + ")";
    }
}
