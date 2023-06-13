package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m28432d2 = {"Lco/bird/api/response/SmartlockUnlockPayload;", "", MessageExtension.FIELD_DATA, "", "(Ljava/lang/String;)V", "getData", "()Ljava/lang/String;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class SmartlockUnlockPayload {
    @JsonProperty(MessageExtension.FIELD_DATA)
    @InterfaceC41208ft5(MessageExtension.FIELD_DATA)
    private final String data;

    public SmartlockUnlockPayload() {
        this(null, 1, null);
    }

    public static /* synthetic */ SmartlockUnlockPayload copy$default(SmartlockUnlockPayload smartlockUnlockPayload, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = smartlockUnlockPayload.data;
        }
        return smartlockUnlockPayload.copy(str);
    }

    public final String component1() {
        return this.data;
    }

    public final SmartlockUnlockPayload copy(String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new SmartlockUnlockPayload(data);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SmartlockUnlockPayload) && Intrinsics.areEqual(this.data, ((SmartlockUnlockPayload) obj).data);
    }

    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public String toString() {
        String str = this.data;
        return "SmartlockUnlockPayload(data=" + str + ")";
    }

    public SmartlockUnlockPayload(String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    public /* synthetic */ SmartlockUnlockPayload(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
