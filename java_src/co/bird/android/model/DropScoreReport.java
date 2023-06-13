package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m28432d2 = {"Lco/bird/android/model/DropScoreReport;", "Landroid/os/Parcelable;", "dropId", "", "score", "", "evaluations", "", "Lco/bird/android/model/DropEvaluation;", "(Ljava/lang/String;DLjava/util/List;)V", "getDropId", "()Ljava/lang/String;", "getEvaluations", "()Ljava/util/List;", "getScore", "()D", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class DropScoreReport implements Parcelable {
    public static final Parcelable.Creator<DropScoreReport> CREATOR = new Creator();
    @JsonProperty("drop_id")
    @InterfaceC41208ft5("drop_id")
    private final String dropId;
    @JsonProperty("evaluations")
    @InterfaceC41208ft5("evaluations")
    private final List<DropEvaluation> evaluations;
    @JsonProperty("score")
    @InterfaceC41208ft5("score")
    private final double score;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<DropScoreReport> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DropScoreReport createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            double readDouble = parcel.readDouble();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(DropEvaluation.CREATOR.createFromParcel(parcel));
            }
            return new DropScoreReport(readString, readDouble, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DropScoreReport[] newArray(int i) {
            return new DropScoreReport[i];
        }
    }

    public DropScoreReport() {
        this(null, 0.0d, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DropScoreReport copy$default(DropScoreReport dropScoreReport, String str, double d, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dropScoreReport.dropId;
        }
        if ((i & 2) != 0) {
            d = dropScoreReport.score;
        }
        if ((i & 4) != 0) {
            list = dropScoreReport.evaluations;
        }
        return dropScoreReport.copy(str, d, list);
    }

    public final String component1() {
        return this.dropId;
    }

    public final double component2() {
        return this.score;
    }

    public final List<DropEvaluation> component3() {
        return this.evaluations;
    }

    public final DropScoreReport copy(String dropId, double d, List<DropEvaluation> evaluations) {
        Intrinsics.checkNotNullParameter(dropId, "dropId");
        Intrinsics.checkNotNullParameter(evaluations, "evaluations");
        return new DropScoreReport(dropId, d, evaluations);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DropScoreReport) {
            DropScoreReport dropScoreReport = (DropScoreReport) obj;
            return Intrinsics.areEqual(this.dropId, dropScoreReport.dropId) && Double.compare(this.score, dropScoreReport.score) == 0 && Intrinsics.areEqual(this.evaluations, dropScoreReport.evaluations);
        }
        return false;
    }

    public final String getDropId() {
        return this.dropId;
    }

    public final List<DropEvaluation> getEvaluations() {
        return this.evaluations;
    }

    public final double getScore() {
        return this.score;
    }

    public int hashCode() {
        return (((this.dropId.hashCode() * 31) + Double.hashCode(this.score)) * 31) + this.evaluations.hashCode();
    }

    public String toString() {
        String str = this.dropId;
        double d = this.score;
        List<DropEvaluation> list = this.evaluations;
        return "DropScoreReport(dropId=" + str + ", score=" + d + ", evaluations=" + list + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.dropId);
        out.writeDouble(this.score);
        List<DropEvaluation> list = this.evaluations;
        out.writeInt(list.size());
        for (DropEvaluation dropEvaluation : list) {
            dropEvaluation.writeToParcel(out, i);
        }
    }

    public DropScoreReport(String dropId, double d, List<DropEvaluation> evaluations) {
        Intrinsics.checkNotNullParameter(dropId, "dropId");
        Intrinsics.checkNotNullParameter(evaluations, "evaluations");
        this.dropId = dropId;
        this.score = d;
        this.evaluations = evaluations;
    }

    public /* synthetic */ DropScoreReport(String str, double d, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.0d : d, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
