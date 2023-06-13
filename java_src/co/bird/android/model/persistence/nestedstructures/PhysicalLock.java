package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.PhysicalLockPurpose;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.gms.location.places.Place;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bHÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0095\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016¨\u00061"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;", "", "id", "", "birdId", "kind", "combination", "lockInstructions", "", "unlockInstructions", "tutorialSteps", "Lco/bird/android/model/persistence/nestedstructures/PhysicalLockTutorialStep;", "endRideTutorialSteps", "smartlock", "Lco/bird/android/model/persistence/nestedstructures/Smartlock;", "purpose", "Lco/bird/android/model/constant/PhysicalLockPurpose;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/persistence/nestedstructures/Smartlock;Lco/bird/android/model/constant/PhysicalLockPurpose;)V", "getBirdId", "()Ljava/lang/String;", "getCombination", "getEndRideTutorialSteps", "()Ljava/util/List;", "getId", "getKind", "getLockInstructions", "getPurpose", "()Lco/bird/android/model/constant/PhysicalLockPurpose;", "getSmartlock", "()Lco/bird/android/model/persistence/nestedstructures/Smartlock;", "getTutorialSteps", "getUnlockInstructions", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class PhysicalLock {
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty("combination")
    @InterfaceC41208ft5("combination")
    private final String combination;
    @JsonProperty("end_ride_tutorial_steps")
    @InterfaceC41208ft5("end_ride_tutorial_steps")
    private final List<PhysicalLockTutorialStep> endRideTutorialSteps;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66699id;
    @JsonProperty("kind")
    @InterfaceC41208ft5("kind")
    private final String kind;
    @JsonProperty("lock_instructions")
    @InterfaceC41208ft5("lock_instructions")
    private final List<String> lockInstructions;
    @JsonProperty("purpose")
    @InterfaceC41208ft5("purpose")
    private final PhysicalLockPurpose purpose;
    @JsonProperty("smartlock")
    @InterfaceC41208ft5("smartlock")
    private final Smartlock smartlock;
    @JsonProperty("tutorial_steps")
    @InterfaceC41208ft5("tutorial_steps")
    private final List<PhysicalLockTutorialStep> tutorialSteps;
    @JsonProperty("unlock_instructions")
    @InterfaceC41208ft5("unlock_instructions")
    private final List<String> unlockInstructions;

    public PhysicalLock() {
        this(null, null, null, null, null, null, null, null, null, null, Place.TYPE_SUBLOCALITY_LEVEL_1, null);
    }

    public final String component1() {
        return this.f66699id;
    }

    public final PhysicalLockPurpose component10() {
        return this.purpose;
    }

    public final String component2() {
        return this.birdId;
    }

    public final String component3() {
        return this.kind;
    }

    public final String component4() {
        return this.combination;
    }

    public final List<String> component5() {
        return this.lockInstructions;
    }

    public final List<String> component6() {
        return this.unlockInstructions;
    }

    public final List<PhysicalLockTutorialStep> component7() {
        return this.tutorialSteps;
    }

    public final List<PhysicalLockTutorialStep> component8() {
        return this.endRideTutorialSteps;
    }

    public final Smartlock component9() {
        return this.smartlock;
    }

    public final PhysicalLock copy(String id, String str, String kind, String str2, List<String> list, List<String> list2, List<PhysicalLockTutorialStep> list3, List<PhysicalLockTutorialStep> list4, Smartlock smartlock, PhysicalLockPurpose physicalLockPurpose) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(kind, "kind");
        return new PhysicalLock(id, str, kind, str2, list, list2, list3, list4, smartlock, physicalLockPurpose);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PhysicalLock) {
            PhysicalLock physicalLock = (PhysicalLock) obj;
            return Intrinsics.areEqual(this.f66699id, physicalLock.f66699id) && Intrinsics.areEqual(this.birdId, physicalLock.birdId) && Intrinsics.areEqual(this.kind, physicalLock.kind) && Intrinsics.areEqual(this.combination, physicalLock.combination) && Intrinsics.areEqual(this.lockInstructions, physicalLock.lockInstructions) && Intrinsics.areEqual(this.unlockInstructions, physicalLock.unlockInstructions) && Intrinsics.areEqual(this.tutorialSteps, physicalLock.tutorialSteps) && Intrinsics.areEqual(this.endRideTutorialSteps, physicalLock.endRideTutorialSteps) && Intrinsics.areEqual(this.smartlock, physicalLock.smartlock) && this.purpose == physicalLock.purpose;
        }
        return false;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final String getCombination() {
        return this.combination;
    }

    public final List<PhysicalLockTutorialStep> getEndRideTutorialSteps() {
        return this.endRideTutorialSteps;
    }

    public final String getId() {
        return this.f66699id;
    }

    public final String getKind() {
        return this.kind;
    }

    public final List<String> getLockInstructions() {
        return this.lockInstructions;
    }

    public final PhysicalLockPurpose getPurpose() {
        return this.purpose;
    }

    public final Smartlock getSmartlock() {
        return this.smartlock;
    }

    public final List<PhysicalLockTutorialStep> getTutorialSteps() {
        return this.tutorialSteps;
    }

    public final List<String> getUnlockInstructions() {
        return this.unlockInstructions;
    }

    public int hashCode() {
        int hashCode = this.f66699id.hashCode() * 31;
        String str = this.birdId;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.kind.hashCode()) * 31;
        String str2 = this.combination;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.lockInstructions;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.unlockInstructions;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<PhysicalLockTutorialStep> list3 = this.tutorialSteps;
        int hashCode6 = (hashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<PhysicalLockTutorialStep> list4 = this.endRideTutorialSteps;
        int hashCode7 = (hashCode6 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Smartlock smartlock = this.smartlock;
        int hashCode8 = (hashCode7 + (smartlock == null ? 0 : smartlock.hashCode())) * 31;
        PhysicalLockPurpose physicalLockPurpose = this.purpose;
        return hashCode8 + (physicalLockPurpose != null ? physicalLockPurpose.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66699id;
        String str2 = this.birdId;
        String str3 = this.kind;
        String str4 = this.combination;
        List<String> list = this.lockInstructions;
        List<String> list2 = this.unlockInstructions;
        List<PhysicalLockTutorialStep> list3 = this.tutorialSteps;
        List<PhysicalLockTutorialStep> list4 = this.endRideTutorialSteps;
        Smartlock smartlock = this.smartlock;
        PhysicalLockPurpose physicalLockPurpose = this.purpose;
        return "PhysicalLock(id=" + str + ", birdId=" + str2 + ", kind=" + str3 + ", combination=" + str4 + ", lockInstructions=" + list + ", unlockInstructions=" + list2 + ", tutorialSteps=" + list3 + ", endRideTutorialSteps=" + list4 + ", smartlock=" + smartlock + ", purpose=" + physicalLockPurpose + ")";
    }

    public PhysicalLock(String id, String str, String kind, String str2, List<String> list, List<String> list2, List<PhysicalLockTutorialStep> list3, List<PhysicalLockTutorialStep> list4, Smartlock smartlock, PhysicalLockPurpose physicalLockPurpose) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.f66699id = id;
        this.birdId = str;
        this.kind = kind;
        this.combination = str2;
        this.lockInstructions = list;
        this.unlockInstructions = list2;
        this.tutorialSteps = list3;
        this.endRideTutorialSteps = list4;
        this.smartlock = smartlock;
        this.purpose = physicalLockPurpose;
    }

    public /* synthetic */ PhysicalLock(String str, String str2, String str3, String str4, List list, List list2, List list3, List list4, Smartlock smartlock, PhysicalLockPurpose physicalLockPurpose, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) == 0 ? str3 : "", (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : list2, (i & 64) != 0 ? null : list3, (i & 128) != 0 ? null : list4, (i & 256) != 0 ? null : smartlock, (i & 512) == 0 ? physicalLockPurpose : null);
    }
}
