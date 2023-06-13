package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.RiderAreaState;
import co.bird.android.model.UNKNOWN_AREA;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0016J5\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u0011\u0010\u001d¨\u0006!"}, m28432d2 = {"Lle6;", "LFH3;", "", "toString", "rideId", "Lco/bird/android/model/RiderAreaState;", "riderAreaState", "LbF0;", "currentParkingNest", "", "initialStartupState", "f", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "b", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "c", "Lco/bird/android/model/RiderAreaState;", "e", "()Lco/bird/android/model/RiderAreaState;", "LbF0;", "()LbF0;", "Z", "g", "()Z", "canPark", "<init>", "(Ljava/lang/String;Lco/bird/android/model/RiderAreaState;LbF0;Z)V", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: le6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C44617le6 extends FH3 {

    /* renamed from: b */
    public final String f96501b;

    /* renamed from: c */
    public final RiderAreaState f96502c;

    /* renamed from: d */
    public final C38435bF0 f96503d;

    /* renamed from: e */
    public final boolean f96504e;

    /* renamed from: f */
    public final boolean f96505f;

    public C44617le6() {
        this(null, null, null, false, 15, null);
    }

    public static /* synthetic */ C44617le6 copy$default(C44617le6 c44617le6, String str, RiderAreaState riderAreaState, C38435bF0 c38435bF0, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c44617le6.f96501b;
        }
        if ((i & 2) != 0) {
            riderAreaState = c44617le6.f96502c;
        }
        if ((i & 4) != 0) {
            c38435bF0 = c44617le6.f96503d;
        }
        if ((i & 8) != 0) {
            z = c44617le6.f96504e;
        }
        return c44617le6.m27048f(str, riderAreaState, c38435bF0, z);
    }

    @Override // p000.FH3
    /* renamed from: b */
    public boolean mo11125b() {
        return this.f96505f;
    }

    @Override // p000.FH3
    /* renamed from: c */
    public C38435bF0 mo11124c() {
        return this.f96503d;
    }

    @Override // p000.FH3
    /* renamed from: d */
    public String mo11123d() {
        return this.f96501b;
    }

    @Override // p000.FH3
    /* renamed from: e */
    public RiderAreaState mo11122e() {
        return this.f96502c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C44617le6) {
            C44617le6 c44617le6 = (C44617le6) obj;
            return Intrinsics.areEqual(this.f96501b, c44617le6.f96501b) && Intrinsics.areEqual(this.f96502c, c44617le6.f96502c) && Intrinsics.areEqual(this.f96503d, c44617le6.f96503d) && this.f96504e == c44617le6.f96504e;
        }
        return false;
    }

    /* renamed from: f */
    public final C44617le6 m27048f(String str, RiderAreaState riderAreaState, C38435bF0 c38435bF0, boolean z) {
        Intrinsics.checkNotNullParameter(riderAreaState, "riderAreaState");
        return new C44617le6(str, riderAreaState, c38435bF0, z);
    }

    /* renamed from: g */
    public final boolean m27047g() {
        return this.f96504e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.f96501b;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f96502c.hashCode()) * 31;
        C38435bF0 c38435bF0 = this.f96503d;
        int hashCode2 = (hashCode + (c38435bF0 != null ? c38435bF0.hashCode() : 0)) * 31;
        boolean z = this.f96504e;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public String toString() {
        String mo11123d = mo11123d();
        RiderAreaState mo11122e = mo11122e();
        C38435bF0 mo11124c = mo11124c();
        boolean z = this.f96504e;
        return "UnknownParkingState(rideId=" + mo11123d + ", riderAreaState=" + mo11122e + ", currentParkingNest=" + mo11124c + ", initialStartupState=" + z + ")";
    }

    public /* synthetic */ C44617le6(String str, RiderAreaState riderAreaState, C38435bF0 c38435bF0, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? UNKNOWN_AREA.INSTANCE : riderAreaState, (i & 4) != 0 ? null : c38435bF0, (i & 8) != 0 ? true : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44617le6(String str, RiderAreaState riderAreaState, C38435bF0 c38435bF0, boolean z) {
        super(null);
        Intrinsics.checkNotNullParameter(riderAreaState, "riderAreaState");
        this.f96501b = str;
        this.f96502c = riderAreaState;
        this.f96503d = c38435bF0;
        this.f96504e = z;
        this.f96505f = true;
    }
}
