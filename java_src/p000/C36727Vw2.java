package p000;

import android.location.Location;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, m28432d2 = {"LVw2;", "", "Landroid/location/Location;", "location", "LUw2;", "locationSource", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Landroid/location/Location;", "b", "()Landroid/location/Location;", "LUw2;", "c", "()LUw2;", "<init>", "(Landroid/location/Location;LUw2;)V", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Vw2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C36727Vw2 {

    /* renamed from: a */
    public final Location f40004a;

    /* renamed from: b */
    public final EnumC36493Uw2 f40005b;

    public C36727Vw2(Location location, EnumC36493Uw2 locationSource) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(locationSource, "locationSource");
        this.f40004a = location;
        this.f40005b = locationSource;
    }

    public static /* synthetic */ C36727Vw2 copy$default(C36727Vw2 c36727Vw2, Location location, EnumC36493Uw2 enumC36493Uw2, int i, Object obj) {
        if ((i & 1) != 0) {
            location = c36727Vw2.f40004a;
        }
        if ((i & 2) != 0) {
            enumC36493Uw2 = c36727Vw2.f40005b;
        }
        return c36727Vw2.m79222a(location, enumC36493Uw2);
    }

    /* renamed from: a */
    public final C36727Vw2 m79222a(Location location, EnumC36493Uw2 locationSource) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(locationSource, "locationSource");
        return new C36727Vw2(location, locationSource);
    }

    /* renamed from: b */
    public final Location m79221b() {
        return this.f40004a;
    }

    /* renamed from: c */
    public final EnumC36493Uw2 m79220c() {
        return this.f40005b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C36727Vw2) {
            C36727Vw2 c36727Vw2 = (C36727Vw2) obj;
            return Intrinsics.areEqual(this.f40004a, c36727Vw2.f40004a) && this.f40005b == c36727Vw2.f40005b;
        }
        return false;
    }

    public int hashCode() {
        return (this.f40004a.hashCode() * 31) + this.f40005b.hashCode();
    }

    public String toString() {
        Location location = this.f40004a;
        EnumC36493Uw2 enumC36493Uw2 = this.f40005b;
        return "LocationWithSource(location=" + location + ", locationSource=" + enumC36493Uw2 + ")";
    }
}
