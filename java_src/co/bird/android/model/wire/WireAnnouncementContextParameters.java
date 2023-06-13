package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003JV\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0006HÖ\u0001J\t\u0010#\u001a\u00020\tHÖ\u0001R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0012\u0010\rR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0013\u0010\u0010R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015¨\u0006$"}, m28432d2 = {"Lco/bird/android/model/wire/WireAnnouncementContextParameters;", "", "minThreshold", "", "maxThreshold", "minDuration", "", "maxDuration", "role", "", "operatorRole", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getMaxDuration", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMaxThreshold", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getMinDuration", "getMinThreshold", "getOperatorRole", "()Ljava/lang/String;", "getRole", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lco/bird/android/model/wire/WireAnnouncementContextParameters;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireAnnouncementContextParameters {
    @JsonProperty("max_duration")
    @InterfaceC41208ft5("max_duration")
    private final Integer maxDuration;
    @JsonProperty("max_threshold")
    @InterfaceC41208ft5("max_threshold")
    private final Float maxThreshold;
    @JsonProperty("min_duration")
    @InterfaceC41208ft5("min_duration")
    private final Integer minDuration;
    @JsonProperty("min_threshold")
    @InterfaceC41208ft5("min_threshold")
    private final Float minThreshold;
    @JsonProperty("operator_role")
    @InterfaceC41208ft5("operator_role")
    private final String operatorRole;
    @JsonProperty("role")
    @InterfaceC41208ft5("role")
    private final String role;

    public WireAnnouncementContextParameters() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ WireAnnouncementContextParameters copy$default(WireAnnouncementContextParameters wireAnnouncementContextParameters, Float f, Float f2, Integer num, Integer num2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = wireAnnouncementContextParameters.minThreshold;
        }
        if ((i & 2) != 0) {
            f2 = wireAnnouncementContextParameters.maxThreshold;
        }
        Float f3 = f2;
        if ((i & 4) != 0) {
            num = wireAnnouncementContextParameters.minDuration;
        }
        Integer num3 = num;
        if ((i & 8) != 0) {
            num2 = wireAnnouncementContextParameters.maxDuration;
        }
        Integer num4 = num2;
        if ((i & 16) != 0) {
            str = wireAnnouncementContextParameters.role;
        }
        String str3 = str;
        if ((i & 32) != 0) {
            str2 = wireAnnouncementContextParameters.operatorRole;
        }
        return wireAnnouncementContextParameters.copy(f, f3, num3, num4, str3, str2);
    }

    public final Float component1() {
        return this.minThreshold;
    }

    public final Float component2() {
        return this.maxThreshold;
    }

    public final Integer component3() {
        return this.minDuration;
    }

    public final Integer component4() {
        return this.maxDuration;
    }

    public final String component5() {
        return this.role;
    }

    public final String component6() {
        return this.operatorRole;
    }

    public final WireAnnouncementContextParameters copy(Float f, Float f2, Integer num, Integer num2, String str, String str2) {
        return new WireAnnouncementContextParameters(f, f2, num, num2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireAnnouncementContextParameters) {
            WireAnnouncementContextParameters wireAnnouncementContextParameters = (WireAnnouncementContextParameters) obj;
            return Intrinsics.areEqual((Object) this.minThreshold, (Object) wireAnnouncementContextParameters.minThreshold) && Intrinsics.areEqual((Object) this.maxThreshold, (Object) wireAnnouncementContextParameters.maxThreshold) && Intrinsics.areEqual(this.minDuration, wireAnnouncementContextParameters.minDuration) && Intrinsics.areEqual(this.maxDuration, wireAnnouncementContextParameters.maxDuration) && Intrinsics.areEqual(this.role, wireAnnouncementContextParameters.role) && Intrinsics.areEqual(this.operatorRole, wireAnnouncementContextParameters.operatorRole);
        }
        return false;
    }

    public final Integer getMaxDuration() {
        return this.maxDuration;
    }

    public final Float getMaxThreshold() {
        return this.maxThreshold;
    }

    public final Integer getMinDuration() {
        return this.minDuration;
    }

    public final Float getMinThreshold() {
        return this.minThreshold;
    }

    public final String getOperatorRole() {
        return this.operatorRole;
    }

    public final String getRole() {
        return this.role;
    }

    public int hashCode() {
        Float f = this.minThreshold;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.maxThreshold;
        int hashCode2 = (hashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        Integer num = this.minDuration;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxDuration;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.role;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.operatorRole;
        return hashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        Float f = this.minThreshold;
        Float f2 = this.maxThreshold;
        Integer num = this.minDuration;
        Integer num2 = this.maxDuration;
        String str = this.role;
        String str2 = this.operatorRole;
        return "WireAnnouncementContextParameters(minThreshold=" + f + ", maxThreshold=" + f2 + ", minDuration=" + num + ", maxDuration=" + num2 + ", role=" + str + ", operatorRole=" + str2 + ")";
    }

    public WireAnnouncementContextParameters(Float f, Float f2, Integer num, Integer num2, String str, String str2) {
        this.minThreshold = f;
        this.maxThreshold = f2;
        this.minDuration = num;
        this.maxDuration = num2;
        this.role = str;
        this.operatorRole = str2;
    }

    public /* synthetic */ WireAnnouncementContextParameters(Float f, Float f2, Integer num, Integer num2, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : f2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : str2);
    }
}
