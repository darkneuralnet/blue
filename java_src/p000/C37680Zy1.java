package p000;

import co.bird.android.model.BirdFraudReport;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"LZy1;", "Lg70;", "Lco/bird/android/model/BirdFraudReport;", "fraudReport", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Lco/bird/android/model/BirdFraudReport;", "getFraudReport", "()Lco/bird/android/model/BirdFraudReport;", "<init>", "(Lco/bird/android/model/BirdFraudReport;)V", "eventbus_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Zy1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C37680Zy1 extends AbstractC41342g70 {

    /* renamed from: a */
    public final BirdFraudReport f49587a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37680Zy1(BirdFraudReport fraudReport) {
        super(null);
        Intrinsics.checkNotNullParameter(fraudReport, "fraudReport");
        this.f49587a = fraudReport;
    }

    public static /* synthetic */ C37680Zy1 copy$default(C37680Zy1 c37680Zy1, BirdFraudReport birdFraudReport, int i, Object obj) {
        if ((i & 1) != 0) {
            birdFraudReport = c37680Zy1.f49587a;
        }
        return c37680Zy1.m72183a(birdFraudReport);
    }

    /* renamed from: a */
    public final C37680Zy1 m72183a(BirdFraudReport fraudReport) {
        Intrinsics.checkNotNullParameter(fraudReport, "fraudReport");
        return new C37680Zy1(fraudReport);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37680Zy1) && Intrinsics.areEqual(this.f49587a, ((C37680Zy1) obj).f49587a);
    }

    public int hashCode() {
        return this.f49587a.hashCode();
    }

    public String toString() {
        BirdFraudReport birdFraudReport = this.f49587a;
        return "FraudReportedEvent(fraudReport=" + birdFraudReport + ")";
    }
}
