package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.BirdModel;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.RequestHeadersFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003J/\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m28432d2 = {"LXL2;", "", "Lco/bird/android/model/constant/BirdModel;", C17296a.f69688o, "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "b", "", "c", RequestHeadersFactory.MODEL, "location", "tracks", DateTokenConverter.CONVERTER_KEY, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lco/bird/android/model/constant/BirdModel;", "getModel", "()Lco/bird/android/model/constant/BirdModel;", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "getLocation", "()Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "Ljava/util/List;", "e", "()Ljava/util/List;", "<init>", "(Lco/bird/android/model/constant/BirdModel;Lco/bird/android/model/persistence/nestedstructures/Geolocation;Ljava/util/List;)V", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: XL2 */
/* loaded from: classes3.dex */
public final class XL2 {

    /* renamed from: a */
    public final BirdModel f42992a;

    /* renamed from: b */
    public final Geolocation f42993b;

    /* renamed from: c */
    public final List<Geolocation> f42994c;

    public XL2(BirdModel birdModel, Geolocation location, List<Geolocation> tracks) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(tracks, "tracks");
        this.f42992a = birdModel;
        this.f42993b = location;
        this.f42994c = tracks;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ XL2 copy$default(XL2 xl2, BirdModel birdModel, Geolocation geolocation, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            birdModel = xl2.f42992a;
        }
        if ((i & 2) != 0) {
            geolocation = xl2.f42993b;
        }
        if ((i & 4) != 0) {
            list = xl2.f42994c;
        }
        return xl2.m77102d(birdModel, geolocation, list);
    }

    /* renamed from: a */
    public final BirdModel m77105a() {
        return this.f42992a;
    }

    /* renamed from: b */
    public final Geolocation m77104b() {
        return this.f42993b;
    }

    /* renamed from: c */
    public final List<Geolocation> m77103c() {
        return this.f42994c;
    }

    /* renamed from: d */
    public final XL2 m77102d(BirdModel birdModel, Geolocation location, List<Geolocation> tracks) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(tracks, "tracks");
        return new XL2(birdModel, location, tracks);
    }

    /* renamed from: e */
    public final List<Geolocation> m77101e() {
        return this.f42994c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof XL2) {
            XL2 xl2 = (XL2) obj;
            return this.f42992a == xl2.f42992a && Intrinsics.areEqual(this.f42993b, xl2.f42993b) && Intrinsics.areEqual(this.f42994c, xl2.f42994c);
        }
        return false;
    }

    public int hashCode() {
        BirdModel birdModel = this.f42992a;
        return ((((birdModel == null ? 0 : birdModel.hashCode()) * 31) + this.f42993b.hashCode()) * 31) + this.f42994c.hashCode();
    }

    public String toString() {
        BirdModel birdModel = this.f42992a;
        Geolocation geolocation = this.f42993b;
        List<Geolocation> list = this.f42994c;
        return "MapViewModel(model=" + birdModel + ", location=" + geolocation + ", tracks=" + list + ")";
    }
}
