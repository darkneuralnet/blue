package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, m28432d2 = {"Lco/bird/android/model/IssueTypeLock;", "Landroid/os/Parcelable;", "issueType", "Lco/bird/android/model/IssueType;", "locked", "", "status", "Lco/bird/android/model/IssueStatus;", "(Lco/bird/android/model/IssueType;ZLco/bird/android/model/IssueStatus;)V", "getIssueType", "()Lco/bird/android/model/IssueType;", "getLocked", "()Z", "getStatus", "()Lco/bird/android/model/IssueStatus;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class IssueTypeLock implements Parcelable {
    public static final Parcelable.Creator<IssueTypeLock> CREATOR = new Creator();
    private final IssueType issueType;
    private final boolean locked;
    private final IssueStatus status;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<IssueTypeLock> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IssueTypeLock createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IssueTypeLock(IssueType.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, IssueStatus.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IssueTypeLock[] newArray(int i) {
            return new IssueTypeLock[i];
        }
    }

    public IssueTypeLock(IssueType issueType, boolean z, IssueStatus status) {
        Intrinsics.checkNotNullParameter(issueType, "issueType");
        Intrinsics.checkNotNullParameter(status, "status");
        this.issueType = issueType;
        this.locked = z;
        this.status = status;
    }

    public static /* synthetic */ IssueTypeLock copy$default(IssueTypeLock issueTypeLock, IssueType issueType, boolean z, IssueStatus issueStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            issueType = issueTypeLock.issueType;
        }
        if ((i & 2) != 0) {
            z = issueTypeLock.locked;
        }
        if ((i & 4) != 0) {
            issueStatus = issueTypeLock.status;
        }
        return issueTypeLock.copy(issueType, z, issueStatus);
    }

    public final IssueType component1() {
        return this.issueType;
    }

    public final boolean component2() {
        return this.locked;
    }

    public final IssueStatus component3() {
        return this.status;
    }

    public final IssueTypeLock copy(IssueType issueType, boolean z, IssueStatus status) {
        Intrinsics.checkNotNullParameter(issueType, "issueType");
        Intrinsics.checkNotNullParameter(status, "status");
        return new IssueTypeLock(issueType, z, status);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IssueTypeLock) {
            IssueTypeLock issueTypeLock = (IssueTypeLock) obj;
            return Intrinsics.areEqual(this.issueType, issueTypeLock.issueType) && this.locked == issueTypeLock.locked && this.status == issueTypeLock.status;
        }
        return false;
    }

    public final IssueType getIssueType() {
        return this.issueType;
    }

    public final boolean getLocked() {
        return this.locked;
    }

    public final IssueStatus getStatus() {
        return this.status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.issueType.hashCode() * 31;
        boolean z = this.locked;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode + i) * 31) + this.status.hashCode();
    }

    public String toString() {
        IssueType issueType = this.issueType;
        boolean z = this.locked;
        IssueStatus issueStatus = this.status;
        return "IssueTypeLock(issueType=" + issueType + ", locked=" + z + ", status=" + issueStatus + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        this.issueType.writeToParcel(out, i);
        out.writeInt(this.locked ? 1 : 0);
        out.writeString(this.status.name());
    }

    public /* synthetic */ IssueTypeLock(IssueType issueType, boolean z, IssueStatus issueStatus, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(issueType, (i & 2) != 0 ? false : z, issueStatus);
    }
}
