package p000;

import android.location.Location;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.google.p034ar.core.Earth;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u001b"}, m28432d2 = {"LEU0;", "LZv6;", "", "info", "Lcom/google/ar/core/Earth;", "earth", "Landroid/location/Location;", "deviceLocation", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "b", "Lcom/google/ar/core/Earth;", "c", "()Lcom/google/ar/core/Earth;", "Landroid/location/Location;", "()Landroid/location/Location;", "<init>", "(Ljava/lang/String;Lcom/google/ar/core/Earth;Landroid/location/Location;)V", "co.bird.android.feature.ar-parking"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: EU0 */
/* loaded from: classes3.dex */
public final class EU0 implements InterfaceC37658Zv6 {

    /* renamed from: a */
    public final String f7531a;

    /* renamed from: b */
    public final Earth f7532b;

    /* renamed from: c */
    public final Location f7533c;

    public EU0(String info, Earth earth, Location location) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.f7531a = info;
        this.f7532b = earth;
        this.f7533c = location;
    }

    public static /* synthetic */ EU0 copy$default(EU0 eu0, String str, Earth earth, Location location, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eu0.f7531a;
        }
        if ((i & 2) != 0) {
            earth = eu0.f7532b;
        }
        if ((i & 4) != 0) {
            location = eu0.f7533c;
        }
        return eu0.m108933a(str, earth, location);
    }

    /* renamed from: a */
    public final EU0 m108933a(String info, Earth earth, Location location) {
        Intrinsics.checkNotNullParameter(info, "info");
        return new EU0(info, earth, location);
    }

    /* renamed from: b */
    public final Location m108932b() {
        return this.f7533c;
    }

    /* renamed from: c */
    public final Earth m108931c() {
        return this.f7532b;
    }

    /* renamed from: d */
    public final String m108930d() {
        return this.f7531a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EU0) {
            EU0 eu0 = (EU0) obj;
            return Intrinsics.areEqual(this.f7531a, eu0.f7531a) && Intrinsics.areEqual(this.f7532b, eu0.f7532b) && Intrinsics.areEqual(this.f7533c, eu0.f7533c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f7531a.hashCode() * 31;
        Earth earth = this.f7532b;
        int hashCode2 = (hashCode + (earth == null ? 0 : earth.hashCode())) * 31;
        Location location = this.f7533c;
        return hashCode2 + (location != null ? location.hashCode() : 0);
    }

    public String toString() {
        String str = this.f7531a;
        Earth earth = this.f7532b;
        Location location = this.f7533c;
        return "Debug(info=" + str + ", earth=" + earth + ", deviceLocation=" + location + ")";
    }

    public /* synthetic */ EU0(String str, Earth earth, Location location, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : earth, (i & 4) != 0 ? null : location);
    }
}
