package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m28432d2 = {"Lco/bird/android/model/ScoredDrop;", "Landroid/os/Parcelable;", "drop", "Lco/bird/android/model/ReleasedDrop;", "scoreReports", "", "Lco/bird/android/model/DropScoreReport;", "(Lco/bird/android/model/ReleasedDrop;Ljava/util/List;)V", "getDrop", "()Lco/bird/android/model/ReleasedDrop;", "getScoreReports", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ScoredDrop implements Parcelable {
    public static final Parcelable.Creator<ScoredDrop> CREATOR = new Creator();
    private final ReleasedDrop drop;
    private final List<DropScoreReport> scoreReports;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<ScoredDrop> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ScoredDrop createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ReleasedDrop createFromParcel = ReleasedDrop.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(DropScoreReport.CREATOR.createFromParcel(parcel));
            }
            return new ScoredDrop(createFromParcel, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ScoredDrop[] newArray(int i) {
            return new ScoredDrop[i];
        }
    }

    public ScoredDrop(ReleasedDrop drop, List<DropScoreReport> scoreReports) {
        Intrinsics.checkNotNullParameter(drop, "drop");
        Intrinsics.checkNotNullParameter(scoreReports, "scoreReports");
        this.drop = drop;
        this.scoreReports = scoreReports;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ScoredDrop copy$default(ScoredDrop scoredDrop, ReleasedDrop releasedDrop, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            releasedDrop = scoredDrop.drop;
        }
        if ((i & 2) != 0) {
            list = scoredDrop.scoreReports;
        }
        return scoredDrop.copy(releasedDrop, list);
    }

    public final ReleasedDrop component1() {
        return this.drop;
    }

    public final List<DropScoreReport> component2() {
        return this.scoreReports;
    }

    public final ScoredDrop copy(ReleasedDrop drop, List<DropScoreReport> scoreReports) {
        Intrinsics.checkNotNullParameter(drop, "drop");
        Intrinsics.checkNotNullParameter(scoreReports, "scoreReports");
        return new ScoredDrop(drop, scoreReports);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ScoredDrop) {
            ScoredDrop scoredDrop = (ScoredDrop) obj;
            return Intrinsics.areEqual(this.drop, scoredDrop.drop) && Intrinsics.areEqual(this.scoreReports, scoredDrop.scoreReports);
        }
        return false;
    }

    public final ReleasedDrop getDrop() {
        return this.drop;
    }

    public final List<DropScoreReport> getScoreReports() {
        return this.scoreReports;
    }

    public int hashCode() {
        return (this.drop.hashCode() * 31) + this.scoreReports.hashCode();
    }

    public String toString() {
        ReleasedDrop releasedDrop = this.drop;
        List<DropScoreReport> list = this.scoreReports;
        return "ScoredDrop(drop=" + releasedDrop + ", scoreReports=" + list + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        this.drop.writeToParcel(out, i);
        List<DropScoreReport> list = this.scoreReports;
        out.writeInt(list.size());
        for (DropScoreReport dropScoreReport : list) {
            dropScoreReport.writeToParcel(out, i);
        }
    }

    public /* synthetic */ ScoredDrop(ReleasedDrop releasedDrop, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(releasedDrop, (i & 2) != 0 ? new ArrayList() : list);
    }
}
