package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.RideState;
import co.bird.android.model.wire.WirePhysicalLock;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m28432d2 = {"LXl5;", "", "Lco/bird/android/model/wire/WirePhysicalLock;", "lock", "LUR4;", "onScanAction", "Lco/bird/android/model/RideState;", "rideState", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lco/bird/android/model/wire/WirePhysicalLock;", "b", "()Lco/bird/android/model/wire/WirePhysicalLock;", "LUR4;", "c", "()LUR4;", "Lco/bird/android/model/RideState;", DateTokenConverter.CONVERTER_KEY, "()Lco/bird/android/model/RideState;", "<init>", "(Lco/bird/android/model/wire/WirePhysicalLock;LUR4;Lco/bird/android/model/RideState;)V", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Xl5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C37099Xl5 {

    /* renamed from: a */
    public final WirePhysicalLock f43887a;

    /* renamed from: b */
    public final UR4 f43888b;

    /* renamed from: c */
    public final RideState f43889c;

    public C37099Xl5(WirePhysicalLock lock, UR4 onScanAction, RideState rideState) {
        Intrinsics.checkNotNullParameter(lock, "lock");
        Intrinsics.checkNotNullParameter(onScanAction, "onScanAction");
        this.f43887a = lock;
        this.f43888b = onScanAction;
        this.f43889c = rideState;
    }

    public static /* synthetic */ C37099Xl5 copy$default(C37099Xl5 c37099Xl5, WirePhysicalLock wirePhysicalLock, UR4 ur4, RideState rideState, int i, Object obj) {
        if ((i & 1) != 0) {
            wirePhysicalLock = c37099Xl5.f43887a;
        }
        if ((i & 2) != 0) {
            ur4 = c37099Xl5.f43888b;
        }
        if ((i & 4) != 0) {
            rideState = c37099Xl5.f43889c;
        }
        return c37099Xl5.m76372a(wirePhysicalLock, ur4, rideState);
    }

    /* renamed from: a */
    public final C37099Xl5 m76372a(WirePhysicalLock lock, UR4 onScanAction, RideState rideState) {
        Intrinsics.checkNotNullParameter(lock, "lock");
        Intrinsics.checkNotNullParameter(onScanAction, "onScanAction");
        return new C37099Xl5(lock, onScanAction, rideState);
    }

    /* renamed from: b */
    public final WirePhysicalLock m76371b() {
        return this.f43887a;
    }

    /* renamed from: c */
    public final UR4 m76370c() {
        return this.f43888b;
    }

    /* renamed from: d */
    public final RideState m76369d() {
        return this.f43889c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C37099Xl5) {
            C37099Xl5 c37099Xl5 = (C37099Xl5) obj;
            return Intrinsics.areEqual(this.f43887a, c37099Xl5.f43887a) && this.f43888b == c37099Xl5.f43888b && Intrinsics.areEqual(this.f43889c, c37099Xl5.f43889c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((this.f43887a.hashCode() * 31) + this.f43888b.hashCode()) * 31;
        RideState rideState = this.f43889c;
        return hashCode + (rideState == null ? 0 : rideState.hashCode());
    }

    public String toString() {
        WirePhysicalLock wirePhysicalLock = this.f43887a;
        UR4 ur4 = this.f43888b;
        RideState rideState = this.f43889c;
        return "ScannableRideLock(lock=" + wirePhysicalLock + ", onScanAction=" + ur4 + ", rideState=" + rideState + ")";
    }

    public /* synthetic */ C37099Xl5(WirePhysicalLock wirePhysicalLock, UR4 ur4, RideState rideState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wirePhysicalLock, (i & 2) != 0 ? UR4.UNLOCK : ur4, (i & 4) != 0 ? null : rideState);
    }
}
