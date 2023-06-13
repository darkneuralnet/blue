package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001c"}, m28432d2 = {"Lco/bird/android/model/CannotAccessOption;", "Landroid/os/Parcelable;", "issue", "Lco/bird/android/model/InaccessibleReason;", "(Lco/bird/android/model/InaccessibleReason;)V", "checked", "", "getChecked", "()Z", "setChecked", "(Z)V", "getIssue", "()Lco/bird/android/model/InaccessibleReason;", "component1", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class CannotAccessOption implements Parcelable {
    public static final Parcelable.Creator<CannotAccessOption> CREATOR = new Creator();
    private boolean checked;
    private final InaccessibleReason issue;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<CannotAccessOption> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CannotAccessOption createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CannotAccessOption(InaccessibleReason.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CannotAccessOption[] newArray(int i) {
            return new CannotAccessOption[i];
        }
    }

    public CannotAccessOption(InaccessibleReason issue) {
        Intrinsics.checkNotNullParameter(issue, "issue");
        this.issue = issue;
    }

    public static /* synthetic */ CannotAccessOption copy$default(CannotAccessOption cannotAccessOption, InaccessibleReason inaccessibleReason, int i, Object obj) {
        if ((i & 1) != 0) {
            inaccessibleReason = cannotAccessOption.issue;
        }
        return cannotAccessOption.copy(inaccessibleReason);
    }

    public final InaccessibleReason component1() {
        return this.issue;
    }

    public final CannotAccessOption copy(InaccessibleReason issue) {
        Intrinsics.checkNotNullParameter(issue, "issue");
        return new CannotAccessOption(issue);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CannotAccessOption) && this.issue == ((CannotAccessOption) obj).issue;
    }

    public final boolean getChecked() {
        return this.checked;
    }

    public final InaccessibleReason getIssue() {
        return this.issue;
    }

    public int hashCode() {
        return this.issue.hashCode();
    }

    public final void setChecked(boolean z) {
        this.checked = z;
    }

    public String toString() {
        InaccessibleReason inaccessibleReason = this.issue;
        return "CannotAccessOption(issue=" + inaccessibleReason + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.issue.name());
    }
}
