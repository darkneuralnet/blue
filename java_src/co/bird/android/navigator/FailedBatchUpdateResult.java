package co.bird.android.navigator;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0005\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0003HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\r\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0007HÖ\u0001R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0018"}, m28432d2 = {"Lco/bird/android/navigator/FailedBatchUpdateResult;", "Lco/bird/android/navigator/ActivityResult;", "", "", "birdCodes", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "b", "Ljava/util/List;", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "navigator_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class FailedBatchUpdateResult extends ActivityResult {
    public static final Parcelable.Creator<FailedBatchUpdateResult> CREATOR = new C16262a();

    /* renamed from: b */
    public final List<String> f66785b;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.navigator.FailedBatchUpdateResult$a */
    /* loaded from: classes4.dex */
    public static final class C16262a implements Parcelable.Creator<FailedBatchUpdateResult> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final FailedBatchUpdateResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FailedBatchUpdateResult(parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final FailedBatchUpdateResult[] newArray(int i) {
            return new FailedBatchUpdateResult[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FailedBatchUpdateResult(List<String> birdCodes) {
        super(null);
        Intrinsics.checkNotNullParameter(birdCodes, "birdCodes");
        this.f66785b = birdCodes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FailedBatchUpdateResult copy$default(FailedBatchUpdateResult failedBatchUpdateResult, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = failedBatchUpdateResult.f66785b;
        }
        return failedBatchUpdateResult.m55400a(list);
    }

    /* renamed from: a */
    public final FailedBatchUpdateResult m55400a(List<String> birdCodes) {
        Intrinsics.checkNotNullParameter(birdCodes, "birdCodes");
        return new FailedBatchUpdateResult(birdCodes);
    }

    /* renamed from: b */
    public final List<String> m55399b() {
        return this.f66785b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FailedBatchUpdateResult) && Intrinsics.areEqual(this.f66785b, ((FailedBatchUpdateResult) obj).f66785b);
    }

    public int hashCode() {
        return this.f66785b.hashCode();
    }

    public String toString() {
        List<String> list = this.f66785b;
        return "FailedBatchUpdateResult(birdCodes=" + list + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeStringList(this.f66785b);
    }
}
