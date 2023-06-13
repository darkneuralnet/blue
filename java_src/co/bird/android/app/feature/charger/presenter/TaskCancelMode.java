package co.bird.android.app.feature.charger.presenter;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003HÖ\u0001j\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/app/feature/charger/presenter/TaskCancelMode;", "", "Landroid/os/Parcelable;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "<init>", "(Ljava/lang/String;I)V", "b", "c", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public enum TaskCancelMode implements Parcelable {
    INDIRECT,
    API;
    
    public static final Parcelable.Creator<TaskCancelMode> CREATOR = new Parcelable.Creator<TaskCancelMode>() { // from class: co.bird.android.app.feature.charger.presenter.TaskCancelMode.a
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final TaskCancelMode createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return TaskCancelMode.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final TaskCancelMode[] newArray(int i) {
            return new TaskCancelMode[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(name());
    }
}
