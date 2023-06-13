package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.model.LatLng;
import com.stripe.android.model.PaymentMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m28432d2 = {"LZL;", "", "", C17296a.f69688o, "b", "Lcom/google/android/gms/maps/model/LatLng;", "c", PaymentMethod.BillingDetails.PARAM_ADDRESS, "lastLocated", "latLng", DateTokenConverter.CONVERTER_KEY, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getAddress", "()Ljava/lang/String;", "getLastLocated", "Lcom/google/android/gms/maps/model/LatLng;", "getLatLng", "()Lcom/google/android/gms/maps/model/LatLng;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/maps/model/LatLng;)V", "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ZL */
/* loaded from: classes3.dex */
public final class C10236ZL {

    /* renamed from: a */
    public final String f48336a;

    /* renamed from: b */
    public final String f48337b;

    /* renamed from: c */
    public final LatLng f48338c;

    public C10236ZL(String address, String lastLocated, LatLng latLng) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(lastLocated, "lastLocated");
        Intrinsics.checkNotNullParameter(latLng, "latLng");
        this.f48336a = address;
        this.f48337b = lastLocated;
        this.f48338c = latLng;
    }

    public static /* synthetic */ C10236ZL copy$default(C10236ZL c10236zl, String str, String str2, LatLng latLng, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c10236zl.f48336a;
        }
        if ((i & 2) != 0) {
            str2 = c10236zl.f48337b;
        }
        if ((i & 4) != 0) {
            latLng = c10236zl.f48338c;
        }
        return c10236zl.m73290d(str, str2, latLng);
    }

    /* renamed from: a */
    public final String m73293a() {
        return this.f48336a;
    }

    /* renamed from: b */
    public final String m73292b() {
        return this.f48337b;
    }

    /* renamed from: c */
    public final LatLng m73291c() {
        return this.f48338c;
    }

    /* renamed from: d */
    public final C10236ZL m73290d(String address, String lastLocated, LatLng latLng) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(lastLocated, "lastLocated");
        Intrinsics.checkNotNullParameter(latLng, "latLng");
        return new C10236ZL(address, lastLocated, latLng);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10236ZL) {
            C10236ZL c10236zl = (C10236ZL) obj;
            return Intrinsics.areEqual(this.f48336a, c10236zl.f48336a) && Intrinsics.areEqual(this.f48337b, c10236zl.f48337b) && Intrinsics.areEqual(this.f48338c, c10236zl.f48338c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f48336a.hashCode() * 31) + this.f48337b.hashCode()) * 31) + this.f48338c.hashCode();
    }

    public String toString() {
        String str = this.f48336a;
        String str2 = this.f48337b;
        LatLng latLng = this.f48338c;
        return "BirdLocationViewModel(address=" + str + ", lastLocated=" + str2 + ", latLng=" + latLng + ")";
    }
}
