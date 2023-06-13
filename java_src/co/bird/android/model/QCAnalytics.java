package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.constant.QualityControlFlow;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006%"}, m28432d2 = {"Lco/bird/android/model/QCAnalytics;", "Landroid/os/Parcelable;", "sessionId", "", "numProgrammaticChecks", "", "numProgrammaticChecksFailed", "numProgrammaticChecksPassed", "flow", "Lco/bird/android/model/constant/QualityControlFlow;", "(Ljava/lang/String;IIILco/bird/android/model/constant/QualityControlFlow;)V", "getFlow", "()Lco/bird/android/model/constant/QualityControlFlow;", "getNumProgrammaticChecks", "()I", "getNumProgrammaticChecksFailed", "getNumProgrammaticChecksPassed", "getSessionId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class QCAnalytics implements Parcelable {
    public static final Parcelable.Creator<QCAnalytics> CREATOR = new Creator();
    private final QualityControlFlow flow;
    private final int numProgrammaticChecks;
    private final int numProgrammaticChecksFailed;
    private final int numProgrammaticChecksPassed;
    private final String sessionId;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<QCAnalytics> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QCAnalytics createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new QCAnalytics(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : QualityControlFlow.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QCAnalytics[] newArray(int i) {
            return new QCAnalytics[i];
        }
    }

    public QCAnalytics(String sessionId, int i, int i2, int i3, QualityControlFlow qualityControlFlow) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.sessionId = sessionId;
        this.numProgrammaticChecks = i;
        this.numProgrammaticChecksFailed = i2;
        this.numProgrammaticChecksPassed = i3;
        this.flow = qualityControlFlow;
    }

    public static /* synthetic */ QCAnalytics copy$default(QCAnalytics qCAnalytics, String str, int i, int i2, int i3, QualityControlFlow qualityControlFlow, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = qCAnalytics.sessionId;
        }
        if ((i4 & 2) != 0) {
            i = qCAnalytics.numProgrammaticChecks;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            i2 = qCAnalytics.numProgrammaticChecksFailed;
        }
        int i6 = i2;
        if ((i4 & 8) != 0) {
            i3 = qCAnalytics.numProgrammaticChecksPassed;
        }
        int i7 = i3;
        if ((i4 & 16) != 0) {
            qualityControlFlow = qCAnalytics.flow;
        }
        return qCAnalytics.copy(str, i5, i6, i7, qualityControlFlow);
    }

    public final String component1() {
        return this.sessionId;
    }

    public final int component2() {
        return this.numProgrammaticChecks;
    }

    public final int component3() {
        return this.numProgrammaticChecksFailed;
    }

    public final int component4() {
        return this.numProgrammaticChecksPassed;
    }

    public final QualityControlFlow component5() {
        return this.flow;
    }

    public final QCAnalytics copy(String sessionId, int i, int i2, int i3, QualityControlFlow qualityControlFlow) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        return new QCAnalytics(sessionId, i, i2, i3, qualityControlFlow);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof QCAnalytics) {
            QCAnalytics qCAnalytics = (QCAnalytics) obj;
            return Intrinsics.areEqual(this.sessionId, qCAnalytics.sessionId) && this.numProgrammaticChecks == qCAnalytics.numProgrammaticChecks && this.numProgrammaticChecksFailed == qCAnalytics.numProgrammaticChecksFailed && this.numProgrammaticChecksPassed == qCAnalytics.numProgrammaticChecksPassed && this.flow == qCAnalytics.flow;
        }
        return false;
    }

    public final QualityControlFlow getFlow() {
        return this.flow;
    }

    public final int getNumProgrammaticChecks() {
        return this.numProgrammaticChecks;
    }

    public final int getNumProgrammaticChecksFailed() {
        return this.numProgrammaticChecksFailed;
    }

    public final int getNumProgrammaticChecksPassed() {
        return this.numProgrammaticChecksPassed;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        int hashCode = ((((((this.sessionId.hashCode() * 31) + Integer.hashCode(this.numProgrammaticChecks)) * 31) + Integer.hashCode(this.numProgrammaticChecksFailed)) * 31) + Integer.hashCode(this.numProgrammaticChecksPassed)) * 31;
        QualityControlFlow qualityControlFlow = this.flow;
        return hashCode + (qualityControlFlow == null ? 0 : qualityControlFlow.hashCode());
    }

    public String toString() {
        String str = this.sessionId;
        int i = this.numProgrammaticChecks;
        int i2 = this.numProgrammaticChecksFailed;
        int i3 = this.numProgrammaticChecksPassed;
        QualityControlFlow qualityControlFlow = this.flow;
        return "QCAnalytics(sessionId=" + str + ", numProgrammaticChecks=" + i + ", numProgrammaticChecksFailed=" + i2 + ", numProgrammaticChecksPassed=" + i3 + ", flow=" + qualityControlFlow + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.sessionId);
        out.writeInt(this.numProgrammaticChecks);
        out.writeInt(this.numProgrammaticChecksFailed);
        out.writeInt(this.numProgrammaticChecksPassed);
        QualityControlFlow qualityControlFlow = this.flow;
        if (qualityControlFlow == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeString(qualityControlFlow.name());
    }

    public /* synthetic */ QCAnalytics(String str, int i, int i2, int i3, QualityControlFlow qualityControlFlow, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? 0 : i3, (i4 & 16) != 0 ? null : qualityControlFlow);
    }
}
