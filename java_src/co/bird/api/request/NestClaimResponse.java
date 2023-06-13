package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireDrop;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J/\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m28432d2 = {"Lco/bird/api/request/NestClaimResponse;", "", "requestId", "", "claimedDrop", "Lco/bird/android/model/wire/WireDrop;", "additionalDrops", "", "(Ljava/lang/String;Lco/bird/android/model/wire/WireDrop;Ljava/util/List;)V", "getAdditionalDrops", "()Ljava/util/List;", "getClaimedDrop", "()Lco/bird/android/model/wire/WireDrop;", "getRequestId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class NestClaimResponse {
    @JsonProperty("additional_drops")
    @InterfaceC41208ft5("additional_drops")
    private final List<WireDrop> additionalDrops;
    @JsonProperty("claimed_drop")
    @InterfaceC41208ft5("claimed_drop")
    private final WireDrop claimedDrop;
    @JsonProperty("request_id")
    @InterfaceC41208ft5("request_id")
    private final String requestId;

    public NestClaimResponse(String str, WireDrop claimedDrop, List<WireDrop> additionalDrops) {
        Intrinsics.checkNotNullParameter(claimedDrop, "claimedDrop");
        Intrinsics.checkNotNullParameter(additionalDrops, "additionalDrops");
        this.requestId = str;
        this.claimedDrop = claimedDrop;
        this.additionalDrops = additionalDrops;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NestClaimResponse copy$default(NestClaimResponse nestClaimResponse, String str, WireDrop wireDrop, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nestClaimResponse.requestId;
        }
        if ((i & 2) != 0) {
            wireDrop = nestClaimResponse.claimedDrop;
        }
        if ((i & 4) != 0) {
            list = nestClaimResponse.additionalDrops;
        }
        return nestClaimResponse.copy(str, wireDrop, list);
    }

    public final String component1() {
        return this.requestId;
    }

    public final WireDrop component2() {
        return this.claimedDrop;
    }

    public final List<WireDrop> component3() {
        return this.additionalDrops;
    }

    public final NestClaimResponse copy(String str, WireDrop claimedDrop, List<WireDrop> additionalDrops) {
        Intrinsics.checkNotNullParameter(claimedDrop, "claimedDrop");
        Intrinsics.checkNotNullParameter(additionalDrops, "additionalDrops");
        return new NestClaimResponse(str, claimedDrop, additionalDrops);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NestClaimResponse) {
            NestClaimResponse nestClaimResponse = (NestClaimResponse) obj;
            return Intrinsics.areEqual(this.requestId, nestClaimResponse.requestId) && Intrinsics.areEqual(this.claimedDrop, nestClaimResponse.claimedDrop) && Intrinsics.areEqual(this.additionalDrops, nestClaimResponse.additionalDrops);
        }
        return false;
    }

    public final List<WireDrop> getAdditionalDrops() {
        return this.additionalDrops;
    }

    public final WireDrop getClaimedDrop() {
        return this.claimedDrop;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        String str = this.requestId;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.claimedDrop.hashCode()) * 31) + this.additionalDrops.hashCode();
    }

    public String toString() {
        String str = this.requestId;
        WireDrop wireDrop = this.claimedDrop;
        List<WireDrop> list = this.additionalDrops;
        return "NestClaimResponse(requestId=" + str + ", claimedDrop=" + wireDrop + ", additionalDrops=" + list + ")";
    }

    public /* synthetic */ NestClaimResponse(String str, WireDrop wireDrop, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, wireDrop, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
