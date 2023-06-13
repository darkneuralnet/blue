package p000;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.RidePassView;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"LcA5;", "LyW4;", "Lco/bird/android/model/persistence/RidePassView;", "pass", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Lco/bird/android/model/persistence/RidePassView;", "b", "()Lco/bird/android/model/persistence/RidePassView;", "<init>", "(Lco/bird/android/model/persistence/RidePassView;)V", "ride-pass_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: cA5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38988cA5 extends AbstractC52246yW4 {

    /* renamed from: a */
    public final RidePassView f60237a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38988cA5(RidePassView pass) {
        super(null);
        Intrinsics.checkNotNullParameter(pass, "pass");
        this.f60237a = pass;
    }

    public static /* synthetic */ C38988cA5 copy$default(C38988cA5 c38988cA5, RidePassView ridePassView, int i, Object obj) {
        if ((i & 1) != 0) {
            ridePassView = c38988cA5.f60237a;
        }
        return c38988cA5.m61807a(ridePassView);
    }

    /* renamed from: a */
    public final C38988cA5 m61807a(RidePassView pass) {
        Intrinsics.checkNotNullParameter(pass, "pass");
        return new C38988cA5(pass);
    }

    /* renamed from: b */
    public final RidePassView m61806b() {
        return this.f60237a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38988cA5) && Intrinsics.areEqual(this.f60237a, ((C38988cA5) obj).f60237a);
    }

    public int hashCode() {
        return this.f60237a.hashCode();
    }

    public String toString() {
        RidePassView ridePassView = this.f60237a;
        return "ShowConfirmTransferDialog(pass=" + ridePassView + ")";
    }
}
