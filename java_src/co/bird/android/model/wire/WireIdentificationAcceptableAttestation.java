package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJD\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000bR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m28432d2 = {"Lco/bird/android/model/wire/WireIdentificationAcceptableAttestation;", "", "numberRemaining", "", "validReasons", "", "", "durationSeconds", "minAge", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getDurationSeconds", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMinAge", "getNumberRemaining", "getValidReasons", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)Lco/bird/android/model/wire/WireIdentificationAcceptableAttestation;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireIdentificationAcceptableAttestation {
    @JsonProperty("duration_seconds")
    @InterfaceC41208ft5("duration_seconds")
    private final Integer durationSeconds;
    @JsonProperty("min_age")
    @InterfaceC41208ft5("min_age")
    private final Integer minAge;
    @JsonProperty("number_remaining")
    @InterfaceC41208ft5("number_remaining")
    private final Integer numberRemaining;
    @JsonProperty("valid_reasons")
    @InterfaceC41208ft5("valid_reasons")
    private final List<String> validReasons;

    public WireIdentificationAcceptableAttestation() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WireIdentificationAcceptableAttestation copy$default(WireIdentificationAcceptableAttestation wireIdentificationAcceptableAttestation, Integer num, List list, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = wireIdentificationAcceptableAttestation.numberRemaining;
        }
        if ((i & 2) != 0) {
            list = wireIdentificationAcceptableAttestation.validReasons;
        }
        if ((i & 4) != 0) {
            num2 = wireIdentificationAcceptableAttestation.durationSeconds;
        }
        if ((i & 8) != 0) {
            num3 = wireIdentificationAcceptableAttestation.minAge;
        }
        return wireIdentificationAcceptableAttestation.copy(num, list, num2, num3);
    }

    public final Integer component1() {
        return this.numberRemaining;
    }

    public final List<String> component2() {
        return this.validReasons;
    }

    public final Integer component3() {
        return this.durationSeconds;
    }

    public final Integer component4() {
        return this.minAge;
    }

    public final WireIdentificationAcceptableAttestation copy(Integer num, List<String> list, Integer num2, Integer num3) {
        return new WireIdentificationAcceptableAttestation(num, list, num2, num3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireIdentificationAcceptableAttestation) {
            WireIdentificationAcceptableAttestation wireIdentificationAcceptableAttestation = (WireIdentificationAcceptableAttestation) obj;
            return Intrinsics.areEqual(this.numberRemaining, wireIdentificationAcceptableAttestation.numberRemaining) && Intrinsics.areEqual(this.validReasons, wireIdentificationAcceptableAttestation.validReasons) && Intrinsics.areEqual(this.durationSeconds, wireIdentificationAcceptableAttestation.durationSeconds) && Intrinsics.areEqual(this.minAge, wireIdentificationAcceptableAttestation.minAge);
        }
        return false;
    }

    public final Integer getDurationSeconds() {
        return this.durationSeconds;
    }

    public final Integer getMinAge() {
        return this.minAge;
    }

    public final Integer getNumberRemaining() {
        return this.numberRemaining;
    }

    public final List<String> getValidReasons() {
        return this.validReasons;
    }

    public int hashCode() {
        Integer num = this.numberRemaining;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<String> list = this.validReasons;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.durationSeconds;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.minAge;
        return hashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.numberRemaining;
        List<String> list = this.validReasons;
        Integer num2 = this.durationSeconds;
        Integer num3 = this.minAge;
        return "WireIdentificationAcceptableAttestation(numberRemaining=" + num + ", validReasons=" + list + ", durationSeconds=" + num2 + ", minAge=" + num3 + ")";
    }

    public WireIdentificationAcceptableAttestation(Integer num, List<String> list, Integer num2, Integer num3) {
        this.numberRemaining = num;
        this.validReasons = list;
        this.durationSeconds = num2;
        this.minAge = num3;
    }

    public /* synthetic */ WireIdentificationAcceptableAttestation(Integer num, List list, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3);
    }
}
