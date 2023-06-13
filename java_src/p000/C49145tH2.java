package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.RideState;
import co.bird.android.model.wire.WireUserGuest;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u001fJ\u0006\u0010\u0003\u001a\u00020\u0002J3\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006 "}, m28432d2 = {"LtH2;", "", "", "e", "Lco/bird/android/model/RideState;", "rideState", "LFH3;", "parkingStatus", "Lco/bird/android/model/wire/WireUserGuest;", "userGuest", "", "isSelected", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Lco/bird/android/model/RideState;", "b", "()Lco/bird/android/model/RideState;", "LFH3;", "getParkingStatus", "()LFH3;", "c", "Lco/bird/android/model/wire/WireUserGuest;", "()Lco/bird/android/model/wire/WireUserGuest;", DateTokenConverter.CONVERTER_KEY, "Z", "()Z", "<init>", "(Lco/bird/android/model/RideState;LFH3;Lco/bird/android/model/wire/WireUserGuest;Z)V", "co.bird.android.feature.rider.bottomsheets"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: tH2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49145tH2 {

    /* renamed from: a */
    public final RideState f110243a;

    /* renamed from: b */
    public final FH3 f110244b;

    /* renamed from: c */
    public final WireUserGuest f110245c;

    /* renamed from: d */
    public final boolean f110246d;

    public C49145tH2(RideState rideState, FH3 parkingStatus, WireUserGuest wireUserGuest, boolean z) {
        Intrinsics.checkNotNullParameter(rideState, "rideState");
        Intrinsics.checkNotNullParameter(parkingStatus, "parkingStatus");
        this.f110243a = rideState;
        this.f110244b = parkingStatus;
        this.f110245c = wireUserGuest;
        this.f110246d = z;
    }

    public static /* synthetic */ C49145tH2 copy$default(C49145tH2 c49145tH2, RideState rideState, FH3 fh3, WireUserGuest wireUserGuest, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            rideState = c49145tH2.f110243a;
        }
        if ((i & 2) != 0) {
            fh3 = c49145tH2.f110244b;
        }
        if ((i & 4) != 0) {
            wireUserGuest = c49145tH2.f110245c;
        }
        if ((i & 8) != 0) {
            z = c49145tH2.f110246d;
        }
        return c49145tH2.m12537a(rideState, fh3, wireUserGuest, z);
    }

    /* renamed from: a */
    public final C49145tH2 m12537a(RideState rideState, FH3 parkingStatus, WireUserGuest wireUserGuest, boolean z) {
        Intrinsics.checkNotNullParameter(rideState, "rideState");
        Intrinsics.checkNotNullParameter(parkingStatus, "parkingStatus");
        return new C49145tH2(rideState, parkingStatus, wireUserGuest, z);
    }

    /* renamed from: b */
    public final RideState m12536b() {
        return this.f110243a;
    }

    /* renamed from: c */
    public final WireUserGuest m12535c() {
        return this.f110245c;
    }

    /* renamed from: d */
    public final boolean m12534d() {
        return this.f110246d;
    }

    /* renamed from: e */
    public final String m12533e() {
        String loggableString = this.f110243a.toLoggableString();
        FH3 fh3 = this.f110244b;
        WireUserGuest wireUserGuest = this.f110245c;
        String str = (wireUserGuest == null || (str = wireUserGuest.getId()) == null) ? "" : "";
        boolean z = this.f110246d;
        return "[rideState: " + loggableString + "\n\tparkingStatus: " + fh3 + "\n\tuserGuest: " + str + "\nt\tselected:" + z + "]";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C49145tH2) {
            C49145tH2 c49145tH2 = (C49145tH2) obj;
            return Intrinsics.areEqual(this.f110243a, c49145tH2.f110243a) && Intrinsics.areEqual(this.f110244b, c49145tH2.f110244b) && Intrinsics.areEqual(this.f110245c, c49145tH2.f110245c) && this.f110246d == c49145tH2.f110246d;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f110243a.hashCode() * 31) + this.f110244b.hashCode()) * 31;
        WireUserGuest wireUserGuest = this.f110245c;
        int hashCode2 = (hashCode + (wireUserGuest == null ? 0 : wireUserGuest.hashCode())) * 31;
        boolean z = this.f110246d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public String toString() {
        RideState rideState = this.f110243a;
        FH3 fh3 = this.f110244b;
        WireUserGuest wireUserGuest = this.f110245c;
        boolean z = this.f110246d;
        return "ManageGroupRidesEntry(rideState=" + rideState + ", parkingStatus=" + fh3 + ", userGuest=" + wireUserGuest + ", isSelected=" + z + ")";
    }

    public /* synthetic */ C49145tH2(RideState rideState, FH3 fh3, WireUserGuest wireUserGuest, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(rideState, fh3, (i & 4) != 0 ? null : wireUserGuest, (i & 8) != 0 ? false : z);
    }
}
