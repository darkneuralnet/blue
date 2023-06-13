package co.bird.android.model.identification;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0001\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0010B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005HÖ\u0001J\u0006\u0010\u0006\u001a\u00020\u0005J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005HÖ\u0001j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationGender;", "", "Landroid/os/Parcelable;", "(Ljava/lang/String;I)V", "describeContents", "", "toStringResId", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "MALE", "FEMALE", "OTHER", "UNKNOWN", "Companion", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public enum IdentificationGender implements Parcelable {
    MALE,
    FEMALE,
    OTHER,
    UNKNOWN;
    
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<IdentificationGender> CREATOR = new Parcelable.Creator<IdentificationGender>() { // from class: co.bird.android.model.identification.IdentificationGender.Creator
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IdentificationGender createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return IdentificationGender.valueOf(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IdentificationGender[] newArray(int i) {
            return new IdentificationGender[i];
        }
    };

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationGender$Companion;", "", "()V", "selectableValues", "", "Lco/bird/android/model/identification/IdentificationGender;", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<IdentificationGender> selectableValues() {
            List mutableList;
            List<IdentificationGender> list;
            mutableList = ArraysKt___ArraysKt.toMutableList(IdentificationGender.values());
            mutableList.remove(IdentificationGender.UNKNOWN);
            list = CollectionsKt___CollectionsKt.toList(mutableList);
            return list;
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IdentificationGender.values().length];
            try {
                iArr[IdentificationGender.MALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdentificationGender.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int toStringResId() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i != 1) {
            if (i != 2) {
                return C45871nl4.gender_other;
            }
            return C45871nl4.gender_female;
        }
        return C45871nl4.gender_male;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(name());
    }
}
