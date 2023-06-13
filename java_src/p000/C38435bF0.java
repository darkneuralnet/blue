package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.ParkingLocationSource;
import co.bird.android.model.ParkingNest;
import co.bird.android.model.wire.WireLocation;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b$\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0016JF\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001c\u0010!R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\"\u001a\u0004\b\u001f\u0010#¨\u0006&"}, m28432d2 = {"LbF0;", "", "", "toString", "LmG3;", "parkingNestState", "Lco/bird/android/model/ParkingNest;", "parkingNest", "", "distanceFromNest", "Lco/bird/android/model/wire/WireLocation;", "parkingLocation", "Lco/bird/android/model/ParkingLocationSource;", "parkingLocationSource", C17296a.f69688o, "(LmG3;Lco/bird/android/model/ParkingNest;Ljava/lang/Float;Lco/bird/android/model/wire/WireLocation;Lco/bird/android/model/ParkingLocationSource;)LbF0;", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "LmG3;", "f", "()LmG3;", "b", "Lco/bird/android/model/ParkingNest;", "e", "()Lco/bird/android/model/ParkingNest;", "c", "Ljava/lang/Float;", "()Ljava/lang/Float;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/wire/WireLocation;", "()Lco/bird/android/model/wire/WireLocation;", "Lco/bird/android/model/ParkingLocationSource;", "()Lco/bird/android/model/ParkingLocationSource;", "<init>", "(LmG3;Lco/bird/android/model/ParkingNest;Ljava/lang/Float;Lco/bird/android/model/wire/WireLocation;Lco/bird/android/model/ParkingLocationSource;)V", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: bF0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C38435bF0 {

    /* renamed from: a */
    public final EnumC44987mG3 f57145a;

    /* renamed from: b */
    public final ParkingNest f57146b;

    /* renamed from: c */
    public final Float f57147c;

    /* renamed from: d */
    public final WireLocation f57148d;

    /* renamed from: e */
    public final ParkingLocationSource f57149e;

    public C38435bF0(EnumC44987mG3 parkingNestState, ParkingNest parkingNest, Float f, WireLocation parkingLocation, ParkingLocationSource parkingLocationSource) {
        Intrinsics.checkNotNullParameter(parkingNestState, "parkingNestState");
        Intrinsics.checkNotNullParameter(parkingLocation, "parkingLocation");
        Intrinsics.checkNotNullParameter(parkingLocationSource, "parkingLocationSource");
        this.f57145a = parkingNestState;
        this.f57146b = parkingNest;
        this.f57147c = f;
        this.f57148d = parkingLocation;
        this.f57149e = parkingLocationSource;
    }

    public static /* synthetic */ C38435bF0 copy$default(C38435bF0 c38435bF0, EnumC44987mG3 enumC44987mG3, ParkingNest parkingNest, Float f, WireLocation wireLocation, ParkingLocationSource parkingLocationSource, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC44987mG3 = c38435bF0.f57145a;
        }
        if ((i & 2) != 0) {
            parkingNest = c38435bF0.f57146b;
        }
        ParkingNest parkingNest2 = parkingNest;
        if ((i & 4) != 0) {
            f = c38435bF0.f57147c;
        }
        Float f2 = f;
        if ((i & 8) != 0) {
            wireLocation = c38435bF0.f57148d;
        }
        WireLocation wireLocation2 = wireLocation;
        if ((i & 16) != 0) {
            parkingLocationSource = c38435bF0.f57149e;
        }
        return c38435bF0.m64766a(enumC44987mG3, parkingNest2, f2, wireLocation2, parkingLocationSource);
    }

    /* renamed from: a */
    public final C38435bF0 m64766a(EnumC44987mG3 parkingNestState, ParkingNest parkingNest, Float f, WireLocation parkingLocation, ParkingLocationSource parkingLocationSource) {
        Intrinsics.checkNotNullParameter(parkingNestState, "parkingNestState");
        Intrinsics.checkNotNullParameter(parkingLocation, "parkingLocation");
        Intrinsics.checkNotNullParameter(parkingLocationSource, "parkingLocationSource");
        return new C38435bF0(parkingNestState, parkingNest, f, parkingLocation, parkingLocationSource);
    }

    /* renamed from: b */
    public final Float m64765b() {
        return this.f57147c;
    }

    /* renamed from: c */
    public final WireLocation m64764c() {
        return this.f57148d;
    }

    /* renamed from: d */
    public final ParkingLocationSource m64763d() {
        return this.f57149e;
    }

    /* renamed from: e */
    public final ParkingNest m64762e() {
        return this.f57146b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C38435bF0) {
            C38435bF0 c38435bF0 = (C38435bF0) obj;
            return this.f57145a == c38435bF0.f57145a && Intrinsics.areEqual(this.f57146b, c38435bF0.f57146b) && Intrinsics.areEqual((Object) this.f57147c, (Object) c38435bF0.f57147c) && Intrinsics.areEqual(this.f57148d, c38435bF0.f57148d) && this.f57149e == c38435bF0.f57149e;
        }
        return false;
    }

    /* renamed from: f */
    public final EnumC44987mG3 m64761f() {
        return this.f57145a;
    }

    public int hashCode() {
        int hashCode = this.f57145a.hashCode() * 31;
        ParkingNest parkingNest = this.f57146b;
        int hashCode2 = (hashCode + (parkingNest == null ? 0 : parkingNest.hashCode())) * 31;
        Float f = this.f57147c;
        return ((((hashCode2 + (f != null ? f.hashCode() : 0)) * 31) + this.f57148d.hashCode()) * 31) + this.f57149e.hashCode();
    }

    public String toString() {
        EnumC44987mG3 enumC44987mG3 = this.f57145a;
        ParkingNest parkingNest = this.f57146b;
        Float f = this.f57147c;
        WireLocation wireLocation = this.f57148d;
        ParkingLocationSource parkingLocationSource = this.f57149e;
        return "CurrentParkingNest(parkingNestState=" + enumC44987mG3 + ", parkingNest=" + parkingNest + ", distanceFromNest=" + f + ", locationUsedToCompute=" + wireLocation + ", parkingLocationSource=" + parkingLocationSource + ")";
    }
}
