package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.constant.PartKind;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rHÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bj\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006!"}, m28432d2 = {"Lco/bird/android/model/IdToolOption;", "", "Landroid/os/Parcelable;", "(Ljava/lang/String;I)V", "correspondingPartKinds", "", "Lco/bird/android/model/constant/PartKind;", "getCorrespondingPartKinds", "()[Lco/bird/android/model/constant/PartKind;", "sourceKind", "getSourceKind", "()Lco/bird/android/model/constant/PartKind;", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "BATTERY_SERIAL", "BEACON", "BRAIN", "GERMAN_LICENSE_PLATE", "HANDLEBAR", "IL_LICENSE_PLATE", "LICENSE_PLATE", "MOTOR", "ONE_CODE", "PCM", "US_CA_PLATE", "HELMET", "PHYSICAL_LOCK_STICKER", "QR_CODE", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public enum IdToolOption implements Parcelable {
    BATTERY_SERIAL,
    BEACON,
    BRAIN,
    GERMAN_LICENSE_PLATE,
    HANDLEBAR,
    IL_LICENSE_PLATE,
    LICENSE_PLATE,
    MOTOR,
    ONE_CODE,
    PCM,
    US_CA_PLATE,
    HELMET,
    PHYSICAL_LOCK_STICKER,
    QR_CODE;
    
    public static final Parcelable.Creator<IdToolOption> CREATOR = new Parcelable.Creator<IdToolOption>() { // from class: co.bird.android.model.IdToolOption.Creator
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IdToolOption createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return IdToolOption.valueOf(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IdToolOption[] newArray(int i) {
            return new IdToolOption[i];
        }
    };

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IdToolOption.values().length];
            try {
                iArr[IdToolOption.QR_CODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdToolOption.LICENSE_PLATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IdToolOption.BRAIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IdToolOption.HANDLEBAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IdToolOption.GERMAN_LICENSE_PLATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[IdToolOption.ONE_CODE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[IdToolOption.BATTERY_SERIAL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[IdToolOption.US_CA_PLATE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[IdToolOption.MOTOR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[IdToolOption.PCM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[IdToolOption.BEACON.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[IdToolOption.IL_LICENSE_PLATE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[IdToolOption.HELMET.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[IdToolOption.PHYSICAL_LOCK_STICKER.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final PartKind[] getCorrespondingPartKinds() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return new PartKind[]{PartKind.STICKER};
            case 2:
                return new PartKind[]{PartKind.PLATE};
            case 3:
                return new PartKind[]{PartKind.BRAIN};
            case 4:
                return new PartKind[]{PartKind.BRAIN, PartKind.STICKER};
            case 5:
                return new PartKind[]{PartKind.GERMAN_PLATE};
            case 6:
                return new PartKind[]{PartKind.STICKER, PartKind.PLATE};
            case 7:
                return new PartKind[]{PartKind.BATTERY_SERIAL};
            case 8:
                return new PartKind[]{PartKind.US_CA_PLATE};
            case 9:
                return new PartKind[]{PartKind.MOTOR};
            case 10:
                return new PartKind[]{PartKind.PCM};
            case 11:
                return new PartKind[]{PartKind.BEACON};
            case 12:
                return new PartKind[]{PartKind.IL_PLATE};
            case 13:
                return new PartKind[]{PartKind.HELMET};
            case 14:
                return new PartKind[]{PartKind.PHYSICAL_LOCK_STICKER};
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final PartKind getSourceKind() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 4:
            case 6:
                return PartKind.STICKER;
            case 2:
                return PartKind.PLATE;
            case 3:
                return PartKind.BRAIN;
            case 5:
                return PartKind.GERMAN_PLATE;
            case 7:
                return PartKind.BATTERY_SERIAL;
            case 8:
                return PartKind.US_CA_PLATE;
            case 9:
                return PartKind.MOTOR;
            case 10:
                return PartKind.PCM;
            case 11:
                return PartKind.BEACON;
            case 12:
                return PartKind.IL_PLATE;
            case 13:
                return PartKind.HELMET;
            case 14:
                return PartKind.PHYSICAL_LOCK_STICKER;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(name());
    }
}
