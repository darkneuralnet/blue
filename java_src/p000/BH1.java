package p000;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.RidePassView;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0004\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m28432d2 = {"LBH1;", "", "Lco/bird/android/model/persistence/RidePassView;", "ridePass", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lco/bird/android/model/persistence/RidePassView;", "b", "()Lco/bird/android/model/persistence/RidePassView;", "<init>", "(Lco/bird/android/model/persistence/RidePassView;)V", "purchase-payment_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: BH1 */
/* loaded from: classes3.dex */
public final class BH1 {

    /* renamed from: a */
    public final RidePassView f2170a;

    public BH1(RidePassView ridePassView) {
        this.f2170a = ridePassView;
    }

    public static /* synthetic */ BH1 copy$default(BH1 bh1, RidePassView ridePassView, int i, Object obj) {
        if ((i & 1) != 0) {
            ridePassView = bh1.f2170a;
        }
        return bh1.m114145a(ridePassView);
    }

    /* renamed from: a */
    public final BH1 m114145a(RidePassView ridePassView) {
        return new BH1(ridePassView);
    }

    /* renamed from: b */
    public final RidePassView m114144b() {
        return this.f2170a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BH1) && Intrinsics.areEqual(this.f2170a, ((BH1) obj).f2170a);
    }

    public int hashCode() {
        RidePassView ridePassView = this.f2170a;
        if (ridePassView == null) {
            return 0;
        }
        return ridePassView.hashCode();
    }

    public String toString() {
        RidePassView ridePassView = this.f2170a;
        return "HeaderData(ridePass=" + ridePassView + ")";
    }
}
