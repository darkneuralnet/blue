package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m28432d2 = {"Lco/bird/android/model/wire/WireCommunicationOptIn;", "", "communicationOptIn", "", "localizedCommunicationOptInString", "", "(ZLjava/lang/String;)V", "getCommunicationOptIn", "()Z", "getLocalizedCommunicationOptInString", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireCommunicationOptIn {
    @JsonProperty("communication_opt_in")
    @InterfaceC41208ft5("communication_opt_in")
    private final boolean communicationOptIn;
    @JsonProperty("localized_communication_opt_in_string")
    @InterfaceC41208ft5("localized_communication_opt_in_string")
    private final String localizedCommunicationOptInString;

    public WireCommunicationOptIn() {
        this(false, null, 3, null);
    }

    public static /* synthetic */ WireCommunicationOptIn copy$default(WireCommunicationOptIn wireCommunicationOptIn, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = wireCommunicationOptIn.communicationOptIn;
        }
        if ((i & 2) != 0) {
            str = wireCommunicationOptIn.localizedCommunicationOptInString;
        }
        return wireCommunicationOptIn.copy(z, str);
    }

    public final boolean component1() {
        return this.communicationOptIn;
    }

    public final String component2() {
        return this.localizedCommunicationOptInString;
    }

    public final WireCommunicationOptIn copy(boolean z, String localizedCommunicationOptInString) {
        Intrinsics.checkNotNullParameter(localizedCommunicationOptInString, "localizedCommunicationOptInString");
        return new WireCommunicationOptIn(z, localizedCommunicationOptInString);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireCommunicationOptIn) {
            WireCommunicationOptIn wireCommunicationOptIn = (WireCommunicationOptIn) obj;
            return this.communicationOptIn == wireCommunicationOptIn.communicationOptIn && Intrinsics.areEqual(this.localizedCommunicationOptInString, wireCommunicationOptIn.localizedCommunicationOptInString);
        }
        return false;
    }

    public final boolean getCommunicationOptIn() {
        return this.communicationOptIn;
    }

    public final String getLocalizedCommunicationOptInString() {
        return this.localizedCommunicationOptInString;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.communicationOptIn;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + this.localizedCommunicationOptInString.hashCode();
    }

    public String toString() {
        boolean z = this.communicationOptIn;
        String str = this.localizedCommunicationOptInString;
        return "WireCommunicationOptIn(communicationOptIn=" + z + ", localizedCommunicationOptInString=" + str + ")";
    }

    public WireCommunicationOptIn(boolean z, String localizedCommunicationOptInString) {
        Intrinsics.checkNotNullParameter(localizedCommunicationOptInString, "localizedCommunicationOptInString");
        this.communicationOptIn = z;
        this.localizedCommunicationOptInString = localizedCommunicationOptInString;
    }

    public /* synthetic */ WireCommunicationOptIn(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str);
    }
}
