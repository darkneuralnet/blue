package co.bird.android.model.constant;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, m28432d2 = {"Lco/bird/android/model/constant/TaskPriority;", "", "Landroid/os/Parcelable;", "level", "", "(Ljava/lang/String;II)V", "getLevel", "()I", "describeContents", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "IMMEDIATE", "URGENT", "STANDARD", "BACKGROUND", "NON_VITAL", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public enum TaskPriority implements Parcelable {
    IMMEDIATE(0),
    URGENT(1),
    STANDARD(2),
    BACKGROUND(3),
    NON_VITAL(4);
    
    public static final Parcelable.Creator<TaskPriority> CREATOR = new Parcelable.Creator<TaskPriority>() { // from class: co.bird.android.model.constant.TaskPriority.Creator
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TaskPriority createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return TaskPriority.valueOf(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TaskPriority[] newArray(int i) {
            return new TaskPriority[i];
        }
    };
    private final int level;

    TaskPriority(int i) {
        this.level = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getLevel() {
        return this.level;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(name());
    }
}
