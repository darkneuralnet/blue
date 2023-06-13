package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\u0001\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u001aB\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005HÖ\u0001J\u0006\u0010\u0006\u001a\u00020\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005HÖ\u0001j\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001b"}, m28432d2 = {"Lco/bird/android/model/WorkOrderStatus;", "", "Landroid/os/Parcelable;", "(Ljava/lang/String;I)V", "describeContents", "", "isClosed", "", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "IN_FIELD", "RECOVER", "REPAIR", "QUALITY_CONTROL", "RESOLVED", "ABANDONED", "DISPUTED", "PROGRAMMATIC", "FAILED_QC", "UNKNOWN", "CLOSED", "Companion", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public enum WorkOrderStatus implements Parcelable {
    IN_FIELD,
    RECOVER,
    REPAIR,
    QUALITY_CONTROL,
    RESOLVED,
    ABANDONED,
    DISPUTED,
    PROGRAMMATIC,
    FAILED_QC,
    UNKNOWN,
    CLOSED;
    
    private static final WorkOrderStatus[] CLOSED_STATUSES;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<WorkOrderStatus> CREATOR = new Parcelable.Creator<WorkOrderStatus>() { // from class: co.bird.android.model.WorkOrderStatus.Creator
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WorkOrderStatus createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return WorkOrderStatus.valueOf(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WorkOrderStatus[] newArray(int i) {
            return new WorkOrderStatus[i];
        }
    };

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m28432d2 = {"Lco/bird/android/model/WorkOrderStatus$Companion;", "", "()V", "CLOSED_STATUSES", "", "Lco/bird/android/model/WorkOrderStatus;", "getCLOSED_STATUSES", "()[Lco/bird/android/model/WorkOrderStatus;", "[Lco/bird/android/model/WorkOrderStatus;", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WorkOrderStatus[] getCLOSED_STATUSES() {
            return WorkOrderStatus.CLOSED_STATUSES;
        }

        private Companion() {
        }
    }

    static {
        WorkOrderStatus workOrderStatus;
        WorkOrderStatus workOrderStatus2;
        WorkOrderStatus workOrderStatus3;
        WorkOrderStatus workOrderStatus4;
        CLOSED_STATUSES = new WorkOrderStatus[]{workOrderStatus4, workOrderStatus, workOrderStatus2, workOrderStatus3};
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean isClosed() {
        boolean contains;
        contains = ArraysKt___ArraysKt.contains(CLOSED_STATUSES, this);
        return contains;
    }

    @Override // java.lang.Enum
    public String toString() {
        String lowerCase = name().toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        return lowerCase;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(name());
    }
}
