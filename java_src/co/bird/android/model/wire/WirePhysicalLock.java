package co.bird.android.model.wire;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ConfigurableTutorialContext;
import co.bird.android.model.constant.PhysicalLockPurpose;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.gms.location.places.Place;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003J\u0011\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003J\u0011\u0010/\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bHÆ\u0003J\u0011\u00100\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0095\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\t\u00103\u001a\u000204HÖ\u0001J\u0013\u00105\u001a\u00020\u00192\b\u00106\u001a\u0004\u0018\u000107HÖ\u0003J\t\u00108\u001a\u000204HÖ\u0001J\u0010\u00109\u001a\u00020\u00192\b\u00106\u001a\u0004\u0018\u00010\u0000J\u0006\u0010:\u001a\u00020\u0019J\b\u0010;\u001a\u00020\u0003H\u0016J\u000e\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u0019J\u0019\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u000204HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\u001e\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\u001f\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001aR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0016R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0016¨\u0006D"}, m28432d2 = {"Lco/bird/android/model/wire/WirePhysicalLock;", "Landroid/os/Parcelable;", "id", "", "birdId", "kind", "combination", "lockInstructions", "", "unlockInstructions", "tutorialSteps", "Lco/bird/android/model/wire/WirePhysicalLockTutorialStep;", "endRideTutorialSteps", "smartlock", "Lco/bird/android/model/wire/WireSmartlock;", "purpose", "Lco/bird/android/model/constant/PhysicalLockPurpose;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/wire/WireSmartlock;Lco/bird/android/model/constant/PhysicalLockPurpose;)V", "getBirdId", "()Ljava/lang/String;", "getCombination", "getEndRideTutorialSteps", "()Ljava/util/List;", "getId", "isBrainBasedBluetooth", "", "()Z", "isBrainLock", "isEB100CableLock", "isOkaiClipLock", "isOptional", "isSolebe", "getKind", "getLockInstructions", "getPurpose", "()Lco/bird/android/model/constant/PhysicalLockPurpose;", "getSmartlock", "()Lco/bird/android/model/wire/WireSmartlock;", "getTutorialSteps", "getUnlockInstructions", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "isSame", "shouldAllowPostRideLocking", "toString", "toTutorialContext", "Lco/bird/android/model/constant/ConfigurableTutorialContext;", "isUnlocking", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WirePhysicalLock implements Parcelable {
    public static final Parcelable.Creator<WirePhysicalLock> CREATOR = new Creator();
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty("combination")
    @InterfaceC41208ft5("combination")
    private final String combination;
    @JsonProperty("end_ride_tutorial_steps")
    @InterfaceC41208ft5("end_ride_tutorial_steps")
    private final List<WirePhysicalLockTutorialStep> endRideTutorialSteps;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66751id;
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
    private final WireSmartlock smartlock;
    @JsonProperty("tutorial_steps")
    @InterfaceC41208ft5("tutorial_steps")
    private final List<WirePhysicalLockTutorialStep> tutorialSteps;
    @JsonProperty("unlock_instructions")
    @InterfaceC41208ft5("unlock_instructions")
    private final List<String> unlockInstructions;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WirePhysicalLock> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WirePhysicalLock createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(WirePhysicalLockTutorialStep.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    arrayList2.add(WirePhysicalLockTutorialStep.CREATOR.createFromParcel(parcel));
                }
            }
            return new WirePhysicalLock(readString, readString2, readString3, readString4, createStringArrayList, createStringArrayList2, arrayList, arrayList2, parcel.readInt() == 0 ? null : WireSmartlock.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PhysicalLockPurpose.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WirePhysicalLock[] newArray(int i) {
            return new WirePhysicalLock[i];
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PhysicalLockPurpose.values().length];
            try {
                iArr[PhysicalLockPurpose.HELMET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PhysicalLockPurpose.LOCK_TO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PhysicalLockPurpose.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public WirePhysicalLock() {
        this(null, null, null, null, null, null, null, null, null, null, Place.TYPE_SUBLOCALITY_LEVEL_1, null);
    }

    public final String component1() {
        return this.f66751id;
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

    public final List<WirePhysicalLockTutorialStep> component7() {
        return this.tutorialSteps;
    }

    public final List<WirePhysicalLockTutorialStep> component8() {
        return this.endRideTutorialSteps;
    }

    public final WireSmartlock component9() {
        return this.smartlock;
    }

    public final WirePhysicalLock copy(String id, String str, String kind, String str2, List<String> list, List<String> list2, List<WirePhysicalLockTutorialStep> list3, List<WirePhysicalLockTutorialStep> list4, WireSmartlock wireSmartlock, PhysicalLockPurpose physicalLockPurpose) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(kind, "kind");
        return new WirePhysicalLock(id, str, kind, str2, list, list2, list3, list4, wireSmartlock, physicalLockPurpose);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WirePhysicalLock) {
            WirePhysicalLock wirePhysicalLock = (WirePhysicalLock) obj;
            return Intrinsics.areEqual(this.f66751id, wirePhysicalLock.f66751id) && Intrinsics.areEqual(this.birdId, wirePhysicalLock.birdId) && Intrinsics.areEqual(this.kind, wirePhysicalLock.kind) && Intrinsics.areEqual(this.combination, wirePhysicalLock.combination) && Intrinsics.areEqual(this.lockInstructions, wirePhysicalLock.lockInstructions) && Intrinsics.areEqual(this.unlockInstructions, wirePhysicalLock.unlockInstructions) && Intrinsics.areEqual(this.tutorialSteps, wirePhysicalLock.tutorialSteps) && Intrinsics.areEqual(this.endRideTutorialSteps, wirePhysicalLock.endRideTutorialSteps) && Intrinsics.areEqual(this.smartlock, wirePhysicalLock.smartlock) && this.purpose == wirePhysicalLock.purpose;
        }
        return false;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final String getCombination() {
        return this.combination;
    }

    public final List<WirePhysicalLockTutorialStep> getEndRideTutorialSteps() {
        return this.endRideTutorialSteps;
    }

    public final String getId() {
        return this.f66751id;
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

    public final WireSmartlock getSmartlock() {
        return this.smartlock;
    }

    public final List<WirePhysicalLockTutorialStep> getTutorialSteps() {
        return this.tutorialSteps;
    }

    public final List<String> getUnlockInstructions() {
        return this.unlockInstructions;
    }

    public int hashCode() {
        int hashCode = this.f66751id.hashCode() * 31;
        String str = this.birdId;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.kind.hashCode()) * 31;
        String str2 = this.combination;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.lockInstructions;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.unlockInstructions;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<WirePhysicalLockTutorialStep> list3 = this.tutorialSteps;
        int hashCode6 = (hashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<WirePhysicalLockTutorialStep> list4 = this.endRideTutorialSteps;
        int hashCode7 = (hashCode6 + (list4 == null ? 0 : list4.hashCode())) * 31;
        WireSmartlock wireSmartlock = this.smartlock;
        int hashCode8 = (hashCode7 + (wireSmartlock == null ? 0 : wireSmartlock.hashCode())) * 31;
        PhysicalLockPurpose physicalLockPurpose = this.purpose;
        return hashCode8 + (physicalLockPurpose != null ? physicalLockPurpose.hashCode() : 0);
    }

    public final boolean isBrainBasedBluetooth() {
        return isEB100CableLock();
    }

    public final boolean isBrainLock() {
        return isOkaiClipLock() || isEB100CableLock();
    }

    public final boolean isEB100CableLock() {
        String lowerCase = this.kind.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return Intrinsics.areEqual(lowerCase, PhysicalLockKind.EB100_CABLE_LOCK.toString());
    }

    public final boolean isOkaiClipLock() {
        String lowerCase = this.kind.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return Intrinsics.areEqual(lowerCase, PhysicalLockKind.SMARTLOCK_OKAI_HELMET_CLIP.toString());
    }

    public final boolean isOptional() {
        return this.purpose == PhysicalLockPurpose.HELMET;
    }

    public final boolean isSame(WirePhysicalLock wirePhysicalLock) {
        return Intrinsics.areEqual(this.f66751id, wirePhysicalLock != null ? wirePhysicalLock.f66751id : null);
    }

    public final boolean isSolebe() {
        String lowerCase = this.kind.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return Intrinsics.areEqual(lowerCase, PhysicalLockKind.SMARTLOCK_SOLEBE_HELMET_CLIP.toString());
    }

    public final boolean shouldAllowPostRideLocking() {
        return this.purpose == PhysicalLockPurpose.HELMET;
    }

    public String toString() {
        String str = this.f66751id;
        String str2 = this.birdId;
        String str3 = this.kind;
        PhysicalLockPurpose physicalLockPurpose = this.purpose;
        WireSmartlock wireSmartlock = this.smartlock;
        return "WirePhysicalLock(id=" + str + ", birdId=" + str2 + ", kind=" + str3 + ", purpose=" + physicalLockPurpose + ", smartlock=" + wireSmartlock + ")";
    }

    public final ConfigurableTutorialContext toTutorialContext(boolean z) {
        int i;
        PhysicalLockPurpose physicalLockPurpose = this.purpose;
        if (physicalLockPurpose == null) {
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$0[physicalLockPurpose.ordinal()];
        }
        if (i != -1) {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (z) {
                return ConfigurableTutorialContext.HELMET_UNLOCK;
            } else {
                return ConfigurableTutorialContext.HELMET_LOCK;
            }
        }
        if (z) {
            return ConfigurableTutorialContext.CABLE_UNLOCK;
        }
        return ConfigurableTutorialContext.CABLE_LOCK;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66751id);
        out.writeString(this.birdId);
        out.writeString(this.kind);
        out.writeString(this.combination);
        out.writeStringList(this.lockInstructions);
        out.writeStringList(this.unlockInstructions);
        List<WirePhysicalLockTutorialStep> list = this.tutorialSteps;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            for (WirePhysicalLockTutorialStep wirePhysicalLockTutorialStep : list) {
                wirePhysicalLockTutorialStep.writeToParcel(out, i);
            }
        }
        List<WirePhysicalLockTutorialStep> list2 = this.endRideTutorialSteps;
        if (list2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list2.size());
            for (WirePhysicalLockTutorialStep wirePhysicalLockTutorialStep2 : list2) {
                wirePhysicalLockTutorialStep2.writeToParcel(out, i);
            }
        }
        WireSmartlock wireSmartlock = this.smartlock;
        if (wireSmartlock == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            wireSmartlock.writeToParcel(out, i);
        }
        PhysicalLockPurpose physicalLockPurpose = this.purpose;
        if (physicalLockPurpose == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeString(physicalLockPurpose.name());
    }

    public WirePhysicalLock(String id, String str, String kind, String str2, List<String> list, List<String> list2, List<WirePhysicalLockTutorialStep> list3, List<WirePhysicalLockTutorialStep> list4, WireSmartlock wireSmartlock, PhysicalLockPurpose physicalLockPurpose) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.f66751id = id;
        this.birdId = str;
        this.kind = kind;
        this.combination = str2;
        this.lockInstructions = list;
        this.unlockInstructions = list2;
        this.tutorialSteps = list3;
        this.endRideTutorialSteps = list4;
        this.smartlock = wireSmartlock;
        this.purpose = physicalLockPurpose;
    }

    public /* synthetic */ WirePhysicalLock(String str, String str2, String str3, String str4, List list, List list2, List list3, List list4, WireSmartlock wireSmartlock, PhysicalLockPurpose physicalLockPurpose, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 32) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i & 64) != 0 ? null : list3, (i & 128) != 0 ? null : list4, (i & 256) == 0 ? wireSmartlock : null, (i & 512) != 0 ? PhysicalLockPurpose.UNKNOWN : physicalLockPurpose);
    }
}
