package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.api.Status;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"LWT3;", "LTv2;", "Lcom/google/android/gms/common/api/Status;", "status", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Lcom/google/android/gms/common/api/Status;", "b", "()Lcom/google/android/gms/common/api/Status;", "<init>", "(Lcom/google/android/gms/common/api/Status;)V", "locals-survey_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: WT3 */
/* loaded from: classes3.dex */
public final class WT3 extends AbstractC36250Tv2 {

    /* renamed from: a */
    public final Status f41123a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WT3(Status status) {
        super(null);
        Intrinsics.checkNotNullParameter(status, "status");
        this.f41123a = status;
    }

    public static /* synthetic */ WT3 copy$default(WT3 wt3, Status status, int i, Object obj) {
        if ((i & 1) != 0) {
            status = wt3.f41123a;
        }
        return wt3.m78342a(status);
    }

    /* renamed from: a */
    public final WT3 m78342a(Status status) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new WT3(status);
    }

    /* renamed from: b */
    public final Status m78341b() {
        return this.f41123a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WT3) && Intrinsics.areEqual(this.f41123a, ((WT3) obj).f41123a);
    }

    public int hashCode() {
        return this.f41123a.hashCode();
    }

    public String toString() {
        Status status = this.f41123a;
        return "PlaceError(status=" + status + ")";
    }
}
