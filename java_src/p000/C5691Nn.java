package p000;

import android.location.Location;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m28432d2 = {"LNn;", "", "Landroid/location/Location;", "location", "", "radius", C17296a.f69688o, "(Landroid/location/Location;Ljava/lang/Double;)LNn;", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Landroid/location/Location;", "b", "()Landroid/location/Location;", "Ljava/lang/Double;", "c", "()Ljava/lang/Double;", "<init>", "(Landroid/location/Location;Ljava/lang/Double;)V", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Nn */
/* loaded from: classes2.dex */
public final class C5691Nn {

    /* renamed from: a */
    public final Location f25162a;

    /* renamed from: b */
    public final Double f25163b;

    public C5691Nn() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ C5691Nn copy$default(C5691Nn c5691Nn, Location location, Double d, int i, Object obj) {
        if ((i & 1) != 0) {
            location = c5691Nn.f25162a;
        }
        if ((i & 2) != 0) {
            d = c5691Nn.f25163b;
        }
        return c5691Nn.m93437a(location, d);
    }

    /* renamed from: a */
    public final C5691Nn m93437a(Location location, Double d) {
        return new C5691Nn(location, d);
    }

    /* renamed from: b */
    public final Location m93436b() {
        return this.f25162a;
    }

    /* renamed from: c */
    public final Double m93435c() {
        return this.f25163b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5691Nn) {
            C5691Nn c5691Nn = (C5691Nn) obj;
            return Intrinsics.areEqual(this.f25162a, c5691Nn.f25162a) && Intrinsics.areEqual((Object) this.f25163b, (Object) c5691Nn.f25163b);
        }
        return false;
    }

    public int hashCode() {
        Location location = this.f25162a;
        int hashCode = (location == null ? 0 : location.hashCode()) * 31;
        Double d = this.f25163b;
        return hashCode + (d != null ? d.hashCode() : 0);
    }

    public String toString() {
        Location location = this.f25162a;
        Double d = this.f25163b;
        return "AreaRefreshRequest(location=" + location + ", radius=" + d + ")";
    }

    public C5691Nn(Location location, Double d) {
        this.f25162a = location;
        this.f25163b = d;
    }

    public /* synthetic */ C5691Nn(Location location, Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : location, (i & 2) != 0 ? null : d);
    }
}
