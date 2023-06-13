package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.RiderAreaState;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b2\u00103J\b\u0010\u0003\u001a\u00020\u0002H\u0016Jz\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\u001d\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010#\u001a\u0004\b&\u0010%R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010%R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b+\u0010%R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b(\u0010,\u001a\u0004\b)\u0010-R\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b'\u0010%R\u001a\u0010.\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b\u0019\u0010%R\u001a\u00101\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010#\u001a\u0004\b0\u0010%¨\u00064"}, m28432d2 = {"LCd1;", "LFH3;", "", "toString", "rideId", "Lco/bird/android/model/RiderAreaState;", "riderAreaState", "LbF0;", "currentParkingNest", "", "overridable", "overridableInNonNestMarket", "mustParkInNest", "nearParkingNest", "inNestWithNoCapacity", "", "distanceFromNest", "allowLock", "f", "(Ljava/lang/String;Lco/bird/android/model/RiderAreaState;LbF0;ZZZZZLjava/lang/Float;Z)LCd1;", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "b", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "c", "Lco/bird/android/model/RiderAreaState;", "e", "()Lco/bird/android/model/RiderAreaState;", "LbF0;", "()LbF0;", "Z", "l", "()Z", "getOverridableInNonNestMarket", "g", "j", "h", "k", "i", "Ljava/lang/Float;", "()Ljava/lang/Float;", "canPark", "m", C17296a.f69688o, "canLock", "<init>", "(Ljava/lang/String;Lco/bird/android/model/RiderAreaState;LbF0;ZZZZZLjava/lang/Float;Z)V", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Cd1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C32109Cd1 extends FH3 {

    /* renamed from: b */
    public final String f4395b;

    /* renamed from: c */
    public final RiderAreaState f4396c;

    /* renamed from: d */
    public final C38435bF0 f4397d;

    /* renamed from: e */
    public final boolean f4398e;

    /* renamed from: f */
    public final boolean f4399f;

    /* renamed from: g */
    public final boolean f4400g;

    /* renamed from: h */
    public final boolean f4401h;

    /* renamed from: i */
    public final boolean f4402i;

    /* renamed from: j */
    public final Float f4403j;

    /* renamed from: k */
    public final boolean f4404k;

    /* renamed from: l */
    public final boolean f4405l;

    /* renamed from: m */
    public final boolean f4406m;

    public /* synthetic */ C32109Cd1(String str, RiderAreaState riderAreaState, C38435bF0 c38435bF0, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Float f, boolean z6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, riderAreaState, c38435bF0, z, (i & 16) != 0 ? false : z2, z3, z4, z5, (i & 256) != 0 ? null : f, (i & 512) != 0 ? false : z6);
    }

    @Override // p000.FH3
    /* renamed from: a */
    public boolean mo107359a() {
        return this.f4406m;
    }

    @Override // p000.FH3
    /* renamed from: b */
    public boolean mo11125b() {
        return this.f4405l;
    }

    @Override // p000.FH3
    /* renamed from: c */
    public C38435bF0 mo11124c() {
        return this.f4397d;
    }

    @Override // p000.FH3
    /* renamed from: d */
    public String mo11123d() {
        return this.f4395b;
    }

    @Override // p000.FH3
    /* renamed from: e */
    public RiderAreaState mo11122e() {
        return this.f4396c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C32109Cd1) {
            C32109Cd1 c32109Cd1 = (C32109Cd1) obj;
            return Intrinsics.areEqual(this.f4395b, c32109Cd1.f4395b) && Intrinsics.areEqual(this.f4396c, c32109Cd1.f4396c) && Intrinsics.areEqual(this.f4397d, c32109Cd1.f4397d) && this.f4398e == c32109Cd1.f4398e && this.f4399f == c32109Cd1.f4399f && this.f4400g == c32109Cd1.f4400g && this.f4401h == c32109Cd1.f4401h && this.f4402i == c32109Cd1.f4402i && Intrinsics.areEqual((Object) this.f4403j, (Object) c32109Cd1.f4403j) && this.f4404k == c32109Cd1.f4404k;
        }
        return false;
    }

    /* renamed from: f */
    public final C32109Cd1 m111969f(String str, RiderAreaState riderAreaState, C38435bF0 c38435bF0, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Float f, boolean z6) {
        Intrinsics.checkNotNullParameter(riderAreaState, "riderAreaState");
        return new C32109Cd1(str, riderAreaState, c38435bF0, z, z2, z3, z4, z5, f, z6);
    }

    /* renamed from: g */
    public final boolean m111968g() {
        return this.f4404k;
    }

    /* renamed from: h */
    public final Float m111967h() {
        return this.f4403j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.f4395b;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f4396c.hashCode()) * 31;
        C38435bF0 c38435bF0 = this.f4397d;
        int hashCode2 = (hashCode + (c38435bF0 == null ? 0 : c38435bF0.hashCode())) * 31;
        boolean z = this.f4398e;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z2 = this.f4399f;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.f4400g;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z4 = this.f4401h;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        boolean z5 = this.f4402i;
        int i9 = z5;
        if (z5 != 0) {
            i9 = 1;
        }
        int i10 = (i8 + i9) * 31;
        Float f = this.f4403j;
        int hashCode3 = (i10 + (f != null ? f.hashCode() : 0)) * 31;
        boolean z6 = this.f4404k;
        return hashCode3 + (z6 ? 1 : z6 ? 1 : 0);
    }

    /* renamed from: i */
    public final boolean m111966i() {
        return this.f4402i;
    }

    /* renamed from: j */
    public final boolean m111965j() {
        return this.f4400g;
    }

    /* renamed from: k */
    public final boolean m111964k() {
        return this.f4401h;
    }

    /* renamed from: l */
    public final boolean m111963l() {
        return this.f4398e;
    }

    public String toString() {
        String mo11123d = mo11123d();
        RiderAreaState mo11122e = mo11122e();
        C38435bF0 mo11124c = mo11124c();
        boolean z = this.f4398e;
        boolean z2 = this.f4399f;
        boolean z3 = this.f4400g;
        boolean z4 = this.f4401h;
        Float f = this.f4403j;
        boolean z5 = this.f4404k;
        boolean z6 = this.f4402i;
        return "EnforceCannotPark(rideId=" + mo11123d + ", riderAreaState=" + mo11122e + ", currentParkingNest=" + mo11124c + ", overridable=" + z + ", overridableInNonNestMarket=" + z2 + ", mustParkInNest=" + z3 + ", nearParkingNest=" + z4 + ", distanceFromNest=" + f + ", allowLock=" + z5 + ", inNestWithNoCapacity = " + z6 + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32109Cd1(String str, RiderAreaState riderAreaState, C38435bF0 c38435bF0, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Float f, boolean z6) {
        super(null);
        Intrinsics.checkNotNullParameter(riderAreaState, "riderAreaState");
        this.f4395b = str;
        this.f4396c = riderAreaState;
        this.f4397d = c38435bF0;
        this.f4398e = z;
        this.f4399f = z2;
        this.f4400g = z3;
        this.f4401h = z4;
        this.f4402i = z5;
        this.f4403j = f;
        this.f4404k = z6;
        this.f4405l = z || (z2 && !z3);
        this.f4406m = z6;
    }
}
