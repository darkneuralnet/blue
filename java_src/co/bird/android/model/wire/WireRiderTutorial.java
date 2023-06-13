package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BÅ\u0001\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0011J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003JÉ\u0001\u0010.\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u0006HÖ\u0001R\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010\u0015R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015¨\u00065"}, m28432d2 = {"Lco/bird/android/model/wire/WireRiderTutorial;", "", "steps", "", "Lco/bird/android/model/wire/WireRiderTutorialStep;", "all", "", "contextualM365", "contextualES", "contextualBC", "contextualB2", "contextualB3", "classScooterSteps", "classMopedSteps", "parking", "classScooterParking", "classMopedParking", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getAll$annotations", "()V", "getAll", "()Ljava/util/List;", "getClassMopedParking", "getClassMopedSteps", "getClassScooterParking", "getClassScooterSteps", "getContextualB2", "getContextualB3", "getContextualBC", "getContextualES", "getContextualM365", "getParking$annotations", "getParking", "getSteps", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireRiderTutorial {
    @JsonProperty("all")
    @InterfaceC41208ft5("all")
    private final List<String> all;
    @JsonProperty("class_moped_parking")
    @InterfaceC41208ft5("class_moped_parking")
    private final List<String> classMopedParking;
    @JsonProperty("class_moped")
    @InterfaceC41208ft5("class_moped")
    private final List<String> classMopedSteps;
    @JsonProperty("class_scooter_parking")
    @InterfaceC41208ft5("class_scooter_parking")
    private final List<String> classScooterParking;
    @JsonProperty("class_scooter")
    @InterfaceC41208ft5("class_scooter")
    private final List<String> classScooterSteps;
    @JsonProperty("contextual_b2")
    @InterfaceC41208ft5("contextual_b2")
    private final List<String> contextualB2;
    @JsonProperty("contextual_b3")
    @InterfaceC41208ft5("contextual_b3")
    private final List<String> contextualB3;
    @JsonProperty("contextual_bc")
    @InterfaceC41208ft5("contextual_bc")
    private final List<String> contextualBC;
    @JsonProperty("contextual_es")
    @InterfaceC41208ft5("contextual_es")
    private final List<String> contextualES;
    @JsonProperty("contextual_m365")
    @InterfaceC41208ft5("contextual_m365")
    private final List<String> contextualM365;
    @JsonProperty("parking")
    @InterfaceC41208ft5("parking")
    private final List<String> parking;
    @JsonProperty("steps")
    @InterfaceC41208ft5("steps")
    private final List<WireRiderTutorialStep> steps;

    public WireRiderTutorial() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    @Deprecated(message = "Use the vehicle specific list. This is here for legacy support")
    public static /* synthetic */ void getAll$annotations() {
    }

    @Deprecated(message = "Please use class_kick_scooter parking. We are using this as a fallback until we migrate over.")
    public static /* synthetic */ void getParking$annotations() {
    }

    public final List<WireRiderTutorialStep> component1() {
        return this.steps;
    }

    public final List<String> component10() {
        return this.parking;
    }

    public final List<String> component11() {
        return this.classScooterParking;
    }

    public final List<String> component12() {
        return this.classMopedParking;
    }

    public final List<String> component2() {
        return this.all;
    }

    public final List<String> component3() {
        return this.contextualM365;
    }

    public final List<String> component4() {
        return this.contextualES;
    }

    public final List<String> component5() {
        return this.contextualBC;
    }

    public final List<String> component6() {
        return this.contextualB2;
    }

    public final List<String> component7() {
        return this.contextualB3;
    }

    public final List<String> component8() {
        return this.classScooterSteps;
    }

    public final List<String> component9() {
        return this.classMopedSteps;
    }

    public final WireRiderTutorial copy(List<WireRiderTutorialStep> steps, List<String> all, List<String> contextualM365, List<String> contextualES, List<String> contextualBC, List<String> contextualB2, List<String> contextualB3, List<String> classScooterSteps, List<String> classMopedSteps, List<String> parking, List<String> classScooterParking, List<String> classMopedParking) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        Intrinsics.checkNotNullParameter(all, "all");
        Intrinsics.checkNotNullParameter(contextualM365, "contextualM365");
        Intrinsics.checkNotNullParameter(contextualES, "contextualES");
        Intrinsics.checkNotNullParameter(contextualBC, "contextualBC");
        Intrinsics.checkNotNullParameter(contextualB2, "contextualB2");
        Intrinsics.checkNotNullParameter(contextualB3, "contextualB3");
        Intrinsics.checkNotNullParameter(classScooterSteps, "classScooterSteps");
        Intrinsics.checkNotNullParameter(classMopedSteps, "classMopedSteps");
        Intrinsics.checkNotNullParameter(parking, "parking");
        Intrinsics.checkNotNullParameter(classScooterParking, "classScooterParking");
        Intrinsics.checkNotNullParameter(classMopedParking, "classMopedParking");
        return new WireRiderTutorial(steps, all, contextualM365, contextualES, contextualBC, contextualB2, contextualB3, classScooterSteps, classMopedSteps, parking, classScooterParking, classMopedParking);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireRiderTutorial) {
            WireRiderTutorial wireRiderTutorial = (WireRiderTutorial) obj;
            return Intrinsics.areEqual(this.steps, wireRiderTutorial.steps) && Intrinsics.areEqual(this.all, wireRiderTutorial.all) && Intrinsics.areEqual(this.contextualM365, wireRiderTutorial.contextualM365) && Intrinsics.areEqual(this.contextualES, wireRiderTutorial.contextualES) && Intrinsics.areEqual(this.contextualBC, wireRiderTutorial.contextualBC) && Intrinsics.areEqual(this.contextualB2, wireRiderTutorial.contextualB2) && Intrinsics.areEqual(this.contextualB3, wireRiderTutorial.contextualB3) && Intrinsics.areEqual(this.classScooterSteps, wireRiderTutorial.classScooterSteps) && Intrinsics.areEqual(this.classMopedSteps, wireRiderTutorial.classMopedSteps) && Intrinsics.areEqual(this.parking, wireRiderTutorial.parking) && Intrinsics.areEqual(this.classScooterParking, wireRiderTutorial.classScooterParking) && Intrinsics.areEqual(this.classMopedParking, wireRiderTutorial.classMopedParking);
        }
        return false;
    }

    public final List<String> getAll() {
        return this.all;
    }

    public final List<String> getClassMopedParking() {
        return this.classMopedParking;
    }

    public final List<String> getClassMopedSteps() {
        return this.classMopedSteps;
    }

    public final List<String> getClassScooterParking() {
        return this.classScooterParking;
    }

    public final List<String> getClassScooterSteps() {
        return this.classScooterSteps;
    }

    public final List<String> getContextualB2() {
        return this.contextualB2;
    }

    public final List<String> getContextualB3() {
        return this.contextualB3;
    }

    public final List<String> getContextualBC() {
        return this.contextualBC;
    }

    public final List<String> getContextualES() {
        return this.contextualES;
    }

    public final List<String> getContextualM365() {
        return this.contextualM365;
    }

    public final List<String> getParking() {
        return this.parking;
    }

    public final List<WireRiderTutorialStep> getSteps() {
        return this.steps;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.steps.hashCode() * 31) + this.all.hashCode()) * 31) + this.contextualM365.hashCode()) * 31) + this.contextualES.hashCode()) * 31) + this.contextualBC.hashCode()) * 31) + this.contextualB2.hashCode()) * 31) + this.contextualB3.hashCode()) * 31) + this.classScooterSteps.hashCode()) * 31) + this.classMopedSteps.hashCode()) * 31) + this.parking.hashCode()) * 31) + this.classScooterParking.hashCode()) * 31) + this.classMopedParking.hashCode();
    }

    public String toString() {
        List<WireRiderTutorialStep> list = this.steps;
        List<String> list2 = this.all;
        List<String> list3 = this.contextualM365;
        List<String> list4 = this.contextualES;
        List<String> list5 = this.contextualBC;
        List<String> list6 = this.contextualB2;
        List<String> list7 = this.contextualB3;
        List<String> list8 = this.classScooterSteps;
        List<String> list9 = this.classMopedSteps;
        List<String> list10 = this.parking;
        List<String> list11 = this.classScooterParking;
        List<String> list12 = this.classMopedParking;
        return "WireRiderTutorial(steps=" + list + ", all=" + list2 + ", contextualM365=" + list3 + ", contextualES=" + list4 + ", contextualBC=" + list5 + ", contextualB2=" + list6 + ", contextualB3=" + list7 + ", classScooterSteps=" + list8 + ", classMopedSteps=" + list9 + ", parking=" + list10 + ", classScooterParking=" + list11 + ", classMopedParking=" + list12 + ")";
    }

    public WireRiderTutorial(List<WireRiderTutorialStep> steps, List<String> all, List<String> contextualM365, List<String> contextualES, List<String> contextualBC, List<String> contextualB2, List<String> contextualB3, List<String> classScooterSteps, List<String> classMopedSteps, List<String> parking, List<String> classScooterParking, List<String> classMopedParking) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        Intrinsics.checkNotNullParameter(all, "all");
        Intrinsics.checkNotNullParameter(contextualM365, "contextualM365");
        Intrinsics.checkNotNullParameter(contextualES, "contextualES");
        Intrinsics.checkNotNullParameter(contextualBC, "contextualBC");
        Intrinsics.checkNotNullParameter(contextualB2, "contextualB2");
        Intrinsics.checkNotNullParameter(contextualB3, "contextualB3");
        Intrinsics.checkNotNullParameter(classScooterSteps, "classScooterSteps");
        Intrinsics.checkNotNullParameter(classMopedSteps, "classMopedSteps");
        Intrinsics.checkNotNullParameter(parking, "parking");
        Intrinsics.checkNotNullParameter(classScooterParking, "classScooterParking");
        Intrinsics.checkNotNullParameter(classMopedParking, "classMopedParking");
        this.steps = steps;
        this.all = all;
        this.contextualM365 = contextualM365;
        this.contextualES = contextualES;
        this.contextualBC = contextualBC;
        this.contextualB2 = contextualB2;
        this.contextualB3 = contextualB3;
        this.classScooterSteps = classScooterSteps;
        this.classMopedSteps = classMopedSteps;
        this.parking = parking;
        this.classScooterParking = classScooterParking;
        this.classMopedParking = classMopedParking;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ WireRiderTutorial(List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r2, r3, r4, r5, r6, (i & 64) != 0 ? r6 : list7, (i & 128) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list8, (i & 256) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list9, (i & 512) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list10, (i & 1024) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list11, (i & 2048) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list12);
        List emptyList = (i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list;
        List emptyList2 = (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2;
        List emptyList3 = (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list3;
        List emptyList4 = (i & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list4;
        List emptyList5 = (i & 16) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list5;
        List emptyList6 = (i & 32) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list6;
    }
}
