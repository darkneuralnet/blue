package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.constant.QCAutoCheckKind;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003JA\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0013\u0010\u001b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001aHÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006%"}, m28432d2 = {"Lco/bird/android/model/QCAutoCheck;", "Landroid/os/Parcelable;", "id", "", "kind", "Lco/bird/android/model/constant/QCAutoCheckKind;", "display", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "passed", "", "(Ljava/lang/String;Lco/bird/android/model/constant/QCAutoCheckKind;Ljava/lang/String;Ljava/lang/String;Z)V", "getDisplay", "()Ljava/lang/String;", "getId", "getKind", "()Lco/bird/android/model/constant/QCAutoCheckKind;", "getPassed", "()Z", "getResult", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class QCAutoCheck implements Parcelable {
    public static final Parcelable.Creator<QCAutoCheck> CREATOR = new Creator();
    @JsonProperty("display")
    @InterfaceC41208ft5("display")
    private final String display;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66614id;
    @JsonProperty("kind")
    @InterfaceC41208ft5("kind")
    private final QCAutoCheckKind kind;
    @JsonProperty("passed")
    @InterfaceC41208ft5("passed")
    private final boolean passed;
    @JsonProperty(FinancialConnectionsSheetNativeActivity.EXTRA_RESULT)
    @InterfaceC41208ft5(FinancialConnectionsSheetNativeActivity.EXTRA_RESULT)
    private final String result;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<QCAutoCheck> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QCAutoCheck createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new QCAutoCheck(parcel.readString(), parcel.readInt() == 0 ? null : QCAutoCheckKind.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QCAutoCheck[] newArray(int i) {
            return new QCAutoCheck[i];
        }
    }

    public QCAutoCheck() {
        this(null, null, null, null, false, 31, null);
    }

    public static /* synthetic */ QCAutoCheck copy$default(QCAutoCheck qCAutoCheck, String str, QCAutoCheckKind qCAutoCheckKind, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qCAutoCheck.f66614id;
        }
        if ((i & 2) != 0) {
            qCAutoCheckKind = qCAutoCheck.kind;
        }
        QCAutoCheckKind qCAutoCheckKind2 = qCAutoCheckKind;
        if ((i & 4) != 0) {
            str2 = qCAutoCheck.display;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            str3 = qCAutoCheck.result;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            z = qCAutoCheck.passed;
        }
        return qCAutoCheck.copy(str, qCAutoCheckKind2, str4, str5, z);
    }

    public final String component1() {
        return this.f66614id;
    }

    public final QCAutoCheckKind component2() {
        return this.kind;
    }

    public final String component3() {
        return this.display;
    }

    public final String component4() {
        return this.result;
    }

    public final boolean component5() {
        return this.passed;
    }

    public final QCAutoCheck copy(String id, QCAutoCheckKind qCAutoCheckKind, String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new QCAutoCheck(id, qCAutoCheckKind, str, str2, z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof QCAutoCheck) {
            QCAutoCheck qCAutoCheck = (QCAutoCheck) obj;
            return Intrinsics.areEqual(this.f66614id, qCAutoCheck.f66614id) && this.kind == qCAutoCheck.kind && Intrinsics.areEqual(this.display, qCAutoCheck.display) && Intrinsics.areEqual(this.result, qCAutoCheck.result) && this.passed == qCAutoCheck.passed;
        }
        return false;
    }

    public final String getDisplay() {
        return this.display;
    }

    public final String getId() {
        return this.f66614id;
    }

    public final QCAutoCheckKind getKind() {
        return this.kind;
    }

    public final boolean getPassed() {
        return this.passed;
    }

    public final String getResult() {
        return this.result;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f66614id.hashCode() * 31;
        QCAutoCheckKind qCAutoCheckKind = this.kind;
        int hashCode2 = (hashCode + (qCAutoCheckKind == null ? 0 : qCAutoCheckKind.hashCode())) * 31;
        String str = this.display;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.result;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.passed;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode4 + i;
    }

    public String toString() {
        String str = this.f66614id;
        QCAutoCheckKind qCAutoCheckKind = this.kind;
        String str2 = this.display;
        String str3 = this.result;
        boolean z = this.passed;
        return "QCAutoCheck(id=" + str + ", kind=" + qCAutoCheckKind + ", display=" + str2 + ", result=" + str3 + ", passed=" + z + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66614id);
        QCAutoCheckKind qCAutoCheckKind = this.kind;
        if (qCAutoCheckKind == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(qCAutoCheckKind.name());
        }
        out.writeString(this.display);
        out.writeString(this.result);
        out.writeInt(this.passed ? 1 : 0);
    }

    public QCAutoCheck(String id, QCAutoCheckKind qCAutoCheckKind, String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.f66614id = id;
        this.kind = qCAutoCheckKind;
        this.display = str;
        this.result = str2;
        this.passed = z;
    }

    public /* synthetic */ QCAutoCheck(String str, QCAutoCheckKind qCAutoCheckKind, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : qCAutoCheckKind, (i & 4) != 0 ? null : str2, (i & 8) == 0 ? str3 : null, (i & 16) != 0 ? false : z);
    }
}
